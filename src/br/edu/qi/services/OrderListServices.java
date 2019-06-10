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

package br.edu.qi.services;

import br.edu.qi.dao.DAOFactory;
import br.edu.qi.dao.OrderListDAO;
import br.edu.qi.model.OrderListVO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Brian & Willian
 * @since 09/06/2019 - 19:12:34
 * @version 1.0
 */
public class OrderListServices {
    
    private static final OrderListDAO ORDER_LIST_DAO = DAOFactory.getOrderListDAO();
    
    public void insertOrderList(OrderListVO orderListVO) throws SQLException {
        ORDER_LIST_DAO.insertOrderList(orderListVO);
    }
    
    public ArrayList<OrderListVO> selectOrderLists() throws SQLException {
        return ORDER_LIST_DAO.selectOrderLists();
    }
    
    public ArrayList<OrderListVO> selectOrderLists(String query, int filter) throws SQLException {
        return ORDER_LIST_DAO.selectOrderLists(query, filter);
    }
    
    public void updateOrderList(OrderListVO orderListVO) throws SQLException {
        ORDER_LIST_DAO.updateOrderList(orderListVO);
    }
    
    public void deleteOrderList(long idOrder, long idBurger) throws SQLException {
        ORDER_LIST_DAO.deleteOrderList(idOrder, idBurger);
    }
    
}
