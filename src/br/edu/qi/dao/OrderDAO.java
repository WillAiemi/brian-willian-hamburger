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

import br.edu.qi.model.OrderVO;
import br.edu.qi.persistency.DatabaseConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Brian & Willian
 * @since 08/06/2019 - 16:05
 * @version 1.0
 */
public class OrderDAO {
    public void insertOrder(OrderVO order) throws SQLException{
        Connection connection = DatabaseConnection.getConnection();
        Statement statement = connection.createStatement();
        try {
            String sql="insert into order(idorder, idclient, date, observation, totalcost)"
                    + "values(null, '"+order.getClientVO().getIDClient()+"', '"+order.getDate()+"', '"+order.getObservation()+"', '"+order.getTotalcost()+"')";
            
            statement.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Error at inserting Order."+ e.getMessage());
            
        }
    }

}
