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

/**
 *
 * @author Brian & Willian
 * @since 07/06/2019 - 18:22:15
 * @version 1.0
 */
public class ServicesFactory {
    
    private static final ClientServices CLIENT_SERVICES = new ClientServices();
    private static final BurgerServices BURGER_SERVICES = new BurgerServices();
    private static final OrderServices ORDER_SERVICES = new OrderServices();

    public static ClientServices getCLIENT_SERVICES() {
        return CLIENT_SERVICES;
    }

    public static BurgerServices getBURGER_SERVICES() {
        return BURGER_SERVICES;
    }

    public static OrderServices getORDER_SERVICES() {
        return ORDER_SERVICES;
    }
    
}
