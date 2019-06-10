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

import br.edu.qi.util.Utilities;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 *
 * @author Brian & Willian
 * @since 09/06/2019 - 17:43:42
 * @version 1.0
 */
public class OrderListVO {

    private OrderVO orderVO;
    private BurgerVO burgerVO;
    private int quantity;
    private String observation;

    public OrderListVO() {
    }

    public OrderListVO(OrderVO orderVO, BurgerVO burgerVO, int quantity, String observation) {
        this.orderVO = orderVO;
        this.burgerVO = burgerVO;
        this.quantity = quantity;
        this.observation = observation;
    }

    public OrderVO getOrderVO() {
        return orderVO;
    }

    public void setOrderVO(OrderVO orderVO) {
        this.orderVO = orderVO;
    }

    public BurgerVO getBurgerVO() {
        return burgerVO;
    }

    public void setBurgerVO(BurgerVO burgerVO) {
        this.burgerVO = burgerVO;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    /**
     * Return the subtotal of the order
     * @return Quantity times the price of the burger.
     */
    public double getSubtotal() {
        double subtotal = this.quantity * this.burgerVO.getPrice();
        return Utilities.round(subtotal, 2);
    }

    @Override
    public String toString() {
        return "\n"
                + "OrderID: " + orderVO.getIDOrder() + "\n"
                + "Burger: " + burgerVO.getName() + "\n"
                + "Quantity: " + quantity + "\n"
                + "Observation: " + observation + "\n"
                + "Subtotal: " + Utilities.formatToBRL(getSubtotal()) + "\n";
    }

}
