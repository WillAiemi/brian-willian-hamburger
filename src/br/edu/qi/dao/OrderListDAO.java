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

import br.edu.qi.model.BurgerVO;
import br.edu.qi.model.OrderListVO;
import br.edu.qi.model.OrderVO;
import br.edu.qi.persistency.DatabaseConnection;
import br.edu.qi.services.BurgerServices;
import br.edu.qi.services.OrderServices;
import br.edu.qi.services.ServicesFactory;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Brian & Willian
 * @since 09/06/2019 - 18:03:53
 * @version 1.0
 */
public class OrderListDAO {

    private static final int ID_ORDER = 0;
    private static final int ID_BURGER = 1;
    private static final int QUANTITY = 2;
    private static final int OBSERVATION = 3;

    public void insertOrderList(OrderListVO orderListVO) throws SQLException {
        Connection connection = DatabaseConnection.getConnection();
        Statement statement = connection.createStatement();
        try {
            String sql = "insert into orderlist(idorder, idburger, quantity, observation)"
                    + "values("
                    + orderListVO.getOrderVO().getIDOrder() + ","
                    + orderListVO.getBurgerVO().getIDBurger() + ","
                    + orderListVO.getQuantity() + ","
                    + "'" + orderListVO.getObservation() + "');";

            statement.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Error at inserting orderlist.");
        } finally {
            statement.close();
            connection.close();
        }
    }

    public ArrayList<OrderListVO> selectOrderLists() throws SQLException {
        Connection connection = DatabaseConnection.getConnection();
        Statement statement = connection.createStatement();
        ArrayList<OrderListVO> orderListVOs = new ArrayList<>();
        try {
            String sql = "select * from orderlist;";
            ResultSet resultSet = statement.executeQuery(sql);
            OrderServices orderServices = ServicesFactory.getORDER_SERVICES();
            BurgerServices burgerServices = ServicesFactory.getBURGER_SERVICES();

            while (resultSet.next()) {
                OrderVO order = orderServices.selectOrders(
                        String.valueOf(resultSet.getLong("idorder")),
                        OrderServices.ID_ORDER
                ).get(0);

                BurgerVO burger = burgerServices.selectBurgers(
                        String.valueOf(resultSet.getLong("idburger")),
                        BurgerServices.ID_BURGER
                ).get(0);

                OrderListVO orderListVO = new OrderListVO(
                        order,
                        burger,
                        resultSet.getInt("quantity"),
                        resultSet.getString("observation")
                );

                orderListVOs.add(orderListVO);
            }
        } catch (SQLException e) {
            throw new SQLException("Error at selecting orderlists.");
        } finally {
            statement.close();
            connection.close();
        }
        return orderListVOs;
    }

    public ArrayList<OrderListVO> selectOrderLists(String query, int filter) throws SQLException {
        Connection connection = DatabaseConnection.getConnection();
        Statement statement = connection.createStatement();
        ArrayList<OrderListVO> orderListVOs = new ArrayList<>();
        try {
            String sql = "select * from orderlist ";
            switch (filter) {
                case ID_ORDER:
                    sql += "where idorder = " + query + ";";
                    break;
                case ID_BURGER:
                    sql += "where idburger = " + query + ";";
                    break;
                case QUANTITY:
                    sql += "where quantity like '%" + query + "%';";
                    break;
                case OBSERVATION:
                    sql += "where observation like '%" + query + "%';";
                    break;
                default:
                    throw new AssertionError();
            }

            ResultSet resultSet = statement.executeQuery(sql);
            OrderServices orderServices = ServicesFactory.getORDER_SERVICES();
            BurgerServices burgerServices = ServicesFactory.getBURGER_SERVICES();

            while (resultSet.next()) {
                OrderVO order = orderServices.selectOrders(
                        String.valueOf(resultSet.getLong("idorder")),
                        OrderServices.ID_ORDER
                ).get(0);

                BurgerVO burger = burgerServices.selectBurgers(
                        String.valueOf(resultSet.getLong("idburger")),
                        BurgerServices.ID_BURGER
                ).get(0);

                OrderListVO orderListVO = new OrderListVO(
                        order,
                        burger,
                        resultSet.getInt("quantity"),
                        resultSet.getString("observation")
                );

                orderListVOs.add(orderListVO);
            }
        } catch (SQLException e) {
            throw new SQLException("Error at selecting orderlists.");
        } finally {
            statement.close();
            connection.close();
        }
        return orderListVOs;
    }
    
    public void updateOrderList(OrderListVO orderListVO) throws SQLException {
        Connection connection = DatabaseConnection.getConnection();
        Statement statement = connection.createStatement();
        try {
            String sql = "update orderlistVO set "
                    + "idorder = " + orderListVO.getOrderVO().getIDOrder() + ","
                    + "idburger = " + orderListVO.getBurgerVO().getIDBurger() + ","
                    + "quantity = " + orderListVO.getQuantity() + ","
                    + "observation = '" + orderListVO.getObservation() + "' "
                    + "where idorder = " + orderListVO.getOrderVO().getIDOrder() + " "
                    + "and idburger = " + orderListVO.getBurgerVO().getIDBurger() + ";";
            
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            throw new SQLException("Error at updating orderlist.");
        } finally {
            statement.close();
            connection.close();
        }
    }
    
    public void deleteOrderList(long idOrder, long idBurger) throws SQLException {
        Connection connection = DatabaseConnection.getConnection();
        Statement statement = connection.createStatement();
        try {
            String sql = "delete from orderlist "
                    + "where idorder = " + idOrder + " "
                    + "and idburger = " + idBurger + ";";
            statement.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Error at deleting orderlist.");
        } finally {
            statement.close();
            connection.close();
        }
    }

}
