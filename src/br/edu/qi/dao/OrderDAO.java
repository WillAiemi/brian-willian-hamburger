/*
 * The MIT License
 *
 * Copyright 2019 Brian & Willian.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package br.edu.qi.dao;

import br.edu.qi.model.ClientVO;
import br.edu.qi.model.OrderVO;
import br.edu.qi.persistency.DatabaseConnection;
import br.edu.qi.services.ClientServices;
import br.edu.qi.services.ServicesFactory;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Brian & Willian
 * @since 08/06/2019 - 16:05
 * @version 1.0
 */
public class OrderDAO {

    public static final int ID_ORDER = 0;
    public static final int ID_CLIENT = 1;
    public static final int DATE = 2;
    public static final int OBSERVATION = 3;

    public long insertOrder(OrderVO order) throws SQLException {
        Connection connection = DatabaseConnection.getConnection();
        Statement statement = connection.createStatement();
        long id = -1;
        try {

            String sql = "insert into `order`(idorder, idclient, date, observation)"
                    + "values(null, '" + order.getClientVO().getIDClient() + "', '" + order.getDate() + "', '" + order.getObservation() + "');";

            statement.execute(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet resultSet = statement.getGeneratedKeys();
            if (resultSet.next()) {
                id = resultSet.getLong(1);
            }
            
        } catch (SQLException e) {
            throw new SQLException("Error at inserting order." + e.getMessage());

        } finally {
            statement.close();
            connection.close();
        }
        return id;
    }

    public ArrayList<OrderVO> selectOrders() throws SQLException {
        Connection connection = DatabaseConnection.getConnection();
        Statement statement = connection.createStatement();
        ArrayList<OrderVO> orders = new ArrayList<>();
        try {
            String sql = "select * from `order`;";
            ResultSet resultSet = statement.executeQuery(sql);
            ClientServices clientServices = ServicesFactory.getCLIENT_SERVICES();

            while (resultSet.next()) {
                ClientVO clientVO = clientServices.selectClients(
                        String.valueOf(resultSet.getLong("idclient")),
                        ClientServices.ID_CLIENT
                ).get(0);

                OrderVO orderVO = new OrderVO(
                        resultSet.getLong("idorder"),
                        clientVO,
                        resultSet.getString("date"),
                        resultSet.getString("observation")
                );
                orders.add(orderVO);
            }
        } catch (SQLException e) {
            throw new SQLException("Error at selecting orders.");
        } finally {
            statement.close();
            connection.close();
        }
        return orders;
    }

    public ArrayList<OrderVO> selectOrders(String query, int filter) throws SQLException {
        Connection connection = DatabaseConnection.getConnection();
        Statement statement = connection.createStatement();
        ArrayList<OrderVO> orders = new ArrayList<>();
        try {
            String sql = "select * from `order` ";
            switch (filter) {
                case ID_ORDER:
                    sql += "where idorder = " + query + ";";
                    break;
                case ID_CLIENT:
                    sql += "where idclient = " + query + ";";
                    break;
                case DATE:
                    sql += "where date like '%" + query + "%';";
                    break;
                case OBSERVATION:
                    sql += "where observation like '%" + query + "%';";
                    break;
                default:
                    throw new AssertionError();
            }
            ResultSet resultSet = statement.executeQuery(sql);
            ClientServices clientServices = ServicesFactory.getCLIENT_SERVICES();

            while (resultSet.next()) {
                ClientVO clientVO = clientServices.selectClients(
                        String.valueOf(resultSet.getLong("idclient")),
                        ClientServices.ID_CLIENT
                ).get(0);

                OrderVO orderVO = new OrderVO(
                        resultSet.getLong("idorder"),
                        clientVO,
                        resultSet.getString("date"),
                        resultSet.getString("observation")
                );
                orders.add(orderVO);
            }
        } catch (SQLException e) {
            throw new SQLException("Error at selecting orders.");
        } finally {
            statement.close();
            connection.close();
        }
        return orders;
    }

    public void updateOrder(OrderVO order) throws SQLException {
        Connection connection = DatabaseConnection.getConnection();
        Statement statement = connection.createStatement();

        try {
            String sql = "update `order` set "
                    + "idclient = " + order.getClientVO().getIDClient() + ","
                    + "date = '" + order.getDate() + "',"
                    + "observation = '" + order.getObservation() + "' "
                    + "where idorder = " + order.getIDOrder() + ";";

            statement.executeUpdate(sql);
        } catch (SQLException e) {
            throw new SQLException("Error at updating order." + e.getMessage());
        } finally {
            statement.close();
            connection.close();
        }
    }

    public void deleteOrder(long idOrder) throws SQLException {
        Connection connection = DatabaseConnection.getConnection();
        Statement statement = connection.createStatement();
        try {
            String sql = "delete from `order` where idorder = " + idOrder + ";";
            statement.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Error at deleting order.");
        } finally {
            statement.close();
            connection.close();
        }
    }

}
