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
 */
public class BurguerVOTest {
    public static BurguerVO burguerVO= new BurguerVO();            
    
    public BurguerVOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        burguerVO.setIDBurguer("1");
        burguerVO.setName("Tradicional");
        burguerVO.setPrice(20.5);
        burguerVO.setDescription("Melhor da região");
    }
    
    @AfterClass
    public static void tearDownClass() {
        burguerVO.toString();
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getIDBurguer method, of class BurguerVO.
     */
    @Test
    public void testGetIDBurguer() {
    }

    /**
     * Test of setIDBurguer method, of class BurguerVO.
     */
    @Test
    public void testSetIDBurguer() {
    }

    /**
     * Test of getName method, of class BurguerVO.
     */
    @Test
    public void testGetName() {
    }

    /**
     * Test of setName method, of class BurguerVO.
     */
    @Test
    public void testSetName() {
    }

    /**
     * Test of getDescription method, of class BurguerVO.
     */
    @Test
    public void testGetDescription() {
    }

    /**
     * Test of setDescription method, of class BurguerVO.
     */
    @Test
    public void testSetDescription() {
    }

    /**
     * Test of getPrice method, of class BurguerVO.
     */
    @Test
    public void testGetPrice() {
    }

    /**
     * Test of setPrice method, of class BurguerVO.
     */
    @Test
    public void testSetPrice() {
    }

    /**
     * Test of toString method, of class BurguerVO.
     */
    @Test
    public void testToString() {
    }
    
}
