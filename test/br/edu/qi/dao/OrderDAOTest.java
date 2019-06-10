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
import br.edu.qi.services.ClientServices;
import br.edu.qi.services.ServicesFactory;
import br.edu.qi.util.Utilities;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Brian & Willian
 */
public class OrderDAOTest {
    
    private static final OrderDAO ORDER_DAO = new OrderDAO();
    
    public OrderDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of insertOrder method, of class OrderDAO.
     */
    @Test
    public void testInsertOrder() throws Exception {
        ClientVO clientVO = ServicesFactory.getCLIENT_SERVICES().selectClients("1", ClientServices.ID_CLIENT).get(0);
        OrderVO orderVO = new OrderVO(clientVO, Utilities.getDate().toString(), "No lemons.");
        long id = DAOFactory.getOrderDAO().insertOrder(orderVO);
        System.out.print(id);
    }

    /**
     * Test of selectOrders method, of class OrderDAO.
     */
    @Test
    public void testSelectOrders_0args() throws Exception {
    }

    /**
     * Test of selectOrders method, of class OrderDAO.
     */
    @Test
    public void testSelectOrders_String_int() throws Exception {
    }

    /**
     * Test of updateOrder method, of class OrderDAO.
     */
    @Test
    public void testUpdateOrder() throws Exception {
    }

    /**
     * Test of deleteOrder method, of class OrderDAO.
     */
    @Test
    public void testDeleteOrder() throws Exception {
    }
    
}
