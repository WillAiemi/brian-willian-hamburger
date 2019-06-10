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


/**
 *
 * @author Brian & Willian
 */
public class BurgerVOTest {
    public static BurgerVO burgerVO= new BurgerVO();            
    
    public BurgerVOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        burgerVO.setIDBurger(1);
        burgerVO.setName("Tradicional");
        burgerVO.setPrice(20.5);
        burgerVO.setDescription("Melhor da região");
    }
    
    @AfterClass
    public static void tearDownClass() {
        burgerVO.toString();
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getIDBurger method, of class BurgerVO.
     */
    @Test
    public void testGetIDBurger() {
    }

    /**
     * Test of setIDBurger method, of class BurgerVO.
     */
    @Test
    public void testSetIDBurger() {
    }

    /**
     * Test of getName method, of class BurgerVO.
     */
    @Test
    public void testGetName() {
    }

    /**
     * Test of setName method, of class BurgerVO.
     */
    @Test
    public void testSetName() {
    }

    /**
     * Test of getDescription method, of class BurgerVO.
     */
    @Test
    public void testGetDescription() {
    }

    /**
     * Test of setDescription method, of class BurgerVO.
     */
    @Test
    public void testSetDescription() {
    }

    /**
     * Test of getPrice method, of class BurgerVO.
     */
    @Test
    public void testGetPrice() {
    }

    /**
     * Test of setPrice method, of class BurgerVO.
     */
    @Test
    public void testSetPrice() {
    }

    /**
     * Test of toString method, of class BurgerVO.
     */
    @Test
    public void testToString() {
    }
    
}
