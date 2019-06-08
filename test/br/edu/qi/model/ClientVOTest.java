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
 * @since 07/06/19 - 22:24
 * @version 1.0
 */
public class ClientVOTest {
    private static final ClientVO CLIENT_VO = new ClientVO();

    public ClientVOTest() {
        CLIENT_VO.setIDClient(1);
        CLIENT_VO.setName("Brian");
        CLIENT_VO.setPhoneNumber("995942250");
    }

    @BeforeClass
    public static void setUpClass() {
        CLIENT_VO.setIDClient(1);
        CLIENT_VO.setName("Brian");
        CLIENT_VO.setPhoneNumber("995942250");        
    }

    @AfterClass
    public static void tearDownClass() {
        CLIENT_VO.toString();
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getIDClient method, of class ClientVO.
     */
    @Test
    public void testGetIDClient() {
    }

    /**
     * Test of setIDClient method, of class ClientVO.
     */
    @Test
    public void testSetIDClient() {
    }

    /**
     * Test of getName method, of class ClientVO.
     */
    @Test
    public void testGetName() {
    }

    /**
     * Test of setName method, of class ClientVO.
     */
    @Test
    public void testSetName() {
    }

    /**
     * Test of getPhoneNumber method, of class ClientVO.
     */
    @Test
    public void testGetPhoneNumber() {
    }

    /**
     * Test of setPhoneNumber method, of class ClientVO.
     */
    @Test
    public void testSetPhoneNumber() {
    }

    /**
     * Test of toString method, of class ClientVO.
     */
    @Test
    public void testToString() {
    }

}
