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
import br.edu.qi.persistency.DatabaseConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Brian & Willian
 * @since 07/06/2019 - 22:30:06
 * @version 1.0
 */
public class ClientDAO {
    
    private static final int ID_CLIENT = 0;
    private static final int NAME = 1;
    private static final int PHONE_NUMBER = 2;
    
    public long insertClient(ClientVO clientVO) throws SQLException {
        Connection connection = DatabaseConnection.getConnection();
        Statement statement = connection.createStatement();
        long id = -1;
        try {
            String sql = "insert into client(idclient, name, phoneNumber)"
                    + "values(null, '" + clientVO.getName() + "', '" + clientVO.getPhoneNumber() + "');";
            
            statement.execute(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet resultSet = statement.getGeneratedKeys();
            if (resultSet.next()) {
                id = resultSet.getLong(1);
            }
        } catch (SQLException e) {
            throw new SQLException("Error at inserting client.");
        } finally {
            statement.close();
            connection.close();
        }
        return id;
    }
    
    public ArrayList<ClientVO> selectClients() throws SQLException {
        Connection connection = DatabaseConnection.getConnection();
        Statement statement = connection.createStatement();
        ArrayList<ClientVO> clients = new ArrayList<>();
        try {
            String sql = "select * from client;";
            ResultSet resultSet = statement.executeQuery(sql);
            
            while (resultSet.next()) {                
                ClientVO clientVO = new ClientVO(
                        resultSet.getLong("idclient"),
                        resultSet.getString("name"),
                        resultSet.getString("phonenumber"));
                clients.add(clientVO);
            }
        } catch (SQLException e) {
            throw new SQLException("Error at selecting clients.");
        } finally {
            statement.close();
            connection.close();
        }
        return clients;
    }
    
        public ArrayList<ClientVO> selectClients(String query, int filter) throws SQLException {
        Connection connection = DatabaseConnection.getConnection();
        Statement statement = connection.createStatement();
        ArrayList<ClientVO> clients = new ArrayList<>();
        try {
            String sql = "select * from client ";
            switch (filter) {
                case ID_CLIENT:
                    sql += "where idclient = " + query + ";";
                    break;
                case NAME:
                    sql += "where name like '%" + query + "%';";
                    break;
                case PHONE_NUMBER:
                    sql += "where phonenumber like '%" + query + "%';";
                    break;
                default:
                    throw new AssertionError();
            }
            
            ResultSet resultSet = statement.executeQuery(sql);
            
            while (resultSet.next()) {                
                ClientVO clientVO = new ClientVO(
                        resultSet.getLong("idclient"),
                        resultSet.getString("name"),
                        resultSet.getString("phonenumber"));
                clients.add(clientVO);
            }
        } catch (SQLException e) {
            throw new SQLException("Error at selecting clients.");
        } finally {
            statement.close();
            connection.close();
        }
        return clients;
    }
    
    public void updateClient(ClientVO clientVO) throws SQLException {
        Connection connection = DatabaseConnection.getConnection();
        Statement statement = connection.createStatement();
        try {
            String sql = "update client set "
                    + "name = '"+ clientVO.getName() +"', "
                    + "phonenumber = '"+ clientVO.getPhoneNumber() +"' "
                    + "where idclient = " + clientVO.getIDClient() + ";";
            
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            throw new SQLException("Error at updating client.");
        } finally {
            statement.close();
            connection.close();
        }
    }
    
    public void deleteClient(long idClient) throws SQLException {
        Connection connection = DatabaseConnection.getConnection();
        Statement statement = connection.createStatement();
        try {
            String sql = "delete from client where idclient = " + idClient + ";";
            statement.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Error at deleting client.");
        } finally {
            statement.close();
            connection.close();
        }
    }
    
}
