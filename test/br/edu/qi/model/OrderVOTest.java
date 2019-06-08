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
package br.edu.qi.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Brian & Willian
 * @since 08/06/19 - 15:48
 * @version 1.0
 */
public class OrderVOTest {
    private static final OrderVO ORDER_VO = new OrderVO();
    
    public OrderVOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        ORDER_VO.setIDOrder(1);
        ORDER_VO.setClientVO(null);
        ORDER_VO.setDate("21-02-1998");
        ORDER_VO.setObservation("Teste");
        ORDER_VO.setTotalcost(125.99);
    }
    
    @AfterClass
    public static void tearDownClass() {
        ORDER_VO.toString();
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getIDOrder method, of class OrderVO.
     */
    @Test
    public void testGetIDOrder() {
    }

    /**
     * Test of setIDOrder method, of class OrderVO.
     */
    @Test
    public void testSetIDOrder() {
    }

    /**
     * Test of getClientVO method, of class OrderVO.
     */
    @Test
    public void testGetClientVO() {
    }

    /**
     * Test of setClientVO method, of class OrderVO.
     */
    @Test
    public void testSetClientVO() {
    }

    /**
     * Test of getDate method, of class OrderVO.
     */
    @Test
    public void testGetDate() {
    }

    /**
     * Test of setDate method, of class OrderVO.
     */
    @Test
    public void testSetDate() {
    }

    /**
     * Test of getObservation method, of class OrderVO.
     */
    @Test
    public void testGetObservation() {
    }

    /**
     * Test of setObservation method, of class OrderVO.
     */
    @Test
    public void testSetObservation() {
    }

    /**
     * Test of getTotalcost method, of class OrderVO.
     */
    @Test
    public void testGetTotalcost() {
    }

    /**
     * Test of setTotalcost method, of class OrderVO.
     */
    @Test
    public void testSetTotalcost() {
    }

    /**
     * Test of toString method, of class OrderVO.
     */
    @Test
    public void testToString() {
    }
    
}
