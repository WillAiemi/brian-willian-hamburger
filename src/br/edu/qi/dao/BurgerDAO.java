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
import br.edu.qi.persistency.DatabaseConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Brian & Willian
 * @since 08/06/2019 - 23:42:38
 * @version 1.0
 */
public class BurgerDAO {

    private static final int ID_BURGER = 0;
    private static final int NAME = 1;
    private static final int DESCRIPTION = 2;
    private static final int PRICE = 3;

    public void insertBurger(BurgerVO burgerVO) throws SQLException {
        Connection connection = DatabaseConnection.getConnection();
        Statement statement = connection.createStatement();
        try {
            String sql = "insert into burger(idburger, name, description, price)"
                    + "values(null, '" + burgerVO.getName() + "', '" + burgerVO.getDescription() + "', " + burgerVO.getPrice() + ")";
            statement.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Error when inserting burger to the database.");
        } finally {
            statement.close();
            connection.close();
        }
    }

    public ArrayList<BurgerVO> selectsBurgers() throws SQLException {
        Connection connection = DatabaseConnection.getConnection();
        Statement statement = connection.createStatement();
        ArrayList<BurgerVO> burgers = new ArrayList<>();

        try {
            String sql = "select * from burger";
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                BurgerVO burgerVO = new BurgerVO(
                        resultSet.getLong("idburger"),
                        resultSet.getString("name"),
                        resultSet.getString("description"),
                        resultSet.getDouble("price"));
                burgers.add(burgerVO);
            }
        } catch (SQLException e) {
            throw new SQLException("Error at selecting Burgers." + e.getMessage());
        } finally {
            statement.close();
            connection.close();
        }
        return burgers;
    }

    public ArrayList<BurgerVO> selectBurgers(String query, int filter) throws SQLException {
        Connection connection = DatabaseConnection.getConnection();
        Statement statement = connection.createStatement();
        ArrayList<BurgerVO> burgers = new ArrayList<>();

        try {
            String sql = "select * from burger ";
            switch (filter) {
                case ID_BURGER:
                    sql += "where idburger = " + query + ";";
                    break;
                case NAME:
                    sql += "where name like '%" + query + "%';";
                    break;
                case DESCRIPTION:
                    sql += "where description like '%" + query + "%';";
                    break;
                case PRICE:
                    sql += "where price like '%" + query + "%';";
                    break;
                default:
                    throw new AssertionError();
            }
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                BurgerVO burgerVO = new BurgerVO(
                        resultSet.getLong("idburger"),
                        resultSet.getString("name"),
                        resultSet.getString("description"),
                        resultSet.getDouble("price"));
                burgers.add(burgerVO);
            }
        } catch (SQLException e) {
            throw new SQLException("EError at selecting burgers.");
        } finally {
            connection.close();
            statement.close();
        }
        return burgers;
    }

    public void updateBurger(BurgerVO burgerVO) throws SQLException {
        Connection connection = DatabaseConnection.getConnection();
        Statement statement = connection.createStatement();
        try {
            String sql = "update burger set "
                    + "name = '" + burgerVO.getName() + "', "
                    + "description = '" + burgerVO.getDescription() + "',"
                    + "price = " + burgerVO.getPrice() + " "
                    + "where idburger = " + burgerVO.getIDBurger() + ";";

            statement.executeUpdate(sql);

        } catch (SQLException e) {
            throw new SQLException("Error at updating client.");
        } finally {
            statement.close();
            connection.close();
        }  
    }
    
    public void deleteBurger(long idBurger) throws SQLException {
        Connection connection = DatabaseConnection.getConnection();
        Statement statement = connection.createStatement();
        try {
            String sql = "delete from burger where idburger = " + idBurger + ";";
            statement.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Error at deleting burger.");
        } finally {
            statement.close();
            connection.close();
        }
    }

}
