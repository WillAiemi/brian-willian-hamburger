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

import br.edu.qi.model.BurguerVO;
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
public class BurguerDAO {
    private static final int ID_BURGUER = 0;
    private static final int NAME = 1;
    private static final int DESCRIPTION = 2;
    private static final int PRICE = 3;
    
    public void insertBurguer(BurguerVO burguerVO) throws SQLException {
        Connection connection = DatabaseConnection.getConnection();
        Statement statement = connection.createStatement();
        try {
            String sql = "insert into burguer(idburguer, name, description, price)"
                    + "values(null, '"+ burguerVO.getName() +"', '"+ burguerVO.getDescription() +"', "+burguerVO.getPrice()+")";
            statement.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Error when inserting burguer to the database.");
        }
    }
    
    public ArrayList<BurguerVO> selectsBurguers() throws SQLException{
        Connection connection = DatabaseConnection.getConnection();
        Statement statement = connection.createStatement();
        ArrayList<BurguerVO> burguers = new ArrayList<>();
        
        try {
            String sql = "select * from burguer";
            ResultSet resultSet = statement.executeQuery(sql);
            
            while (resultSet.next()) {                
                BurguerVO burguerVO = new BurguerVO(
                        resultSet.getLong("idburguer"),
                        resultSet.getString("name"),
                        resultSet.getString("description"),
                        resultSet.getDouble("price"));                    
                burguers.add(burguerVO);
            }
        } catch (SQLException e) {
             throw new SQLException("Error at selecting Burguers." + e.getMessage());                
         } finally{
            statement.close();
            connection.close();
       }
        return burguers;
    }
    
        public ArrayList<BurguerVO> selectBurguers(String query, int filter) throws SQLException{
            Connection connection = DatabaseConnection.getConnection();
            Statement statement = connection.createStatement();
            ArrayList<BurguerVO> burguers = new ArrayList<>();
            
            try {
                String sql = "select * from burguer ";
                switch(filter){
                    case ID_BURGUER:
                        sql += "where idburguer = "+ query + ";";
                        break;
                    case NAME:
                        sql += "where name like '%"+ query +"%';";
                        break;
                    case DESCRIPTION:
                        sql += "where description like '%"+query+"%';";
                        break;
                    case PRICE:
                        sql += "where price like '%"+query+"%';";
                        break;
                    default:
                        throw new AssertionError();
                }
                ResultSet resultSet = statement.executeQuery(sql);
                while (resultSet.next()) {                    
                    BurguerVO burguerVO = new BurguerVO(
                            resultSet.getLong("idburguer"),
                            resultSet.getString("name"),
                            resultSet.getString("description"),
                            resultSet.getDouble("price"));
                    burguers.add(burguerVO);                            
                }
            } catch (SQLException e) {
                throw  new SQLException("EError at selecting burguers.");                
            } finally{
                connection.close();
                statement.close();
            }            
                return burguers;
        }
    
}

