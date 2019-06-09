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

/**
 *
 * @author Brian & Willian
 * @since 08/06/2019 - 15:27
 * @version 1.0
 */
public class OrderVO {
    private long IDOrder;    
    private ClientVO clientVO;
    private String date;
    private String observation;

    public OrderVO() {
    }
    /**
     * 
     * @param IDOrder Get the Order id
     * @param clientVO Get the Client that made the order
     * @param date Get the date
     * @param observation Get the Observation
     */
    public OrderVO(long IDOrder, ClientVO clientVO, String date, String observation) {
        this.IDOrder = IDOrder;
        this.clientVO = clientVO;
        this.date = date;
        this.observation = observation;
    }

    public long getIDOrder() {
        return IDOrder;
    }

    public void setIDOrder(long IDOrder) {
        this.IDOrder = IDOrder;
    }

    public ClientVO getClientVO() {
        return clientVO;
    }

    public void setClientVO(ClientVO clientVO) {
        this.clientVO = clientVO;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public double getTotalCost() {
        return 0;
        // TO DO THIS METHOD
    }

    @Override
    public String toString() {
        return "\n"
                + "ID Order: " + IDOrder + "\n"
                + "Client: " + clientVO + "\n"
                + "Date: " + date + "\n"
                + "Observation: " + observation + "\n"
                + "Totalcost: " + getTotalCost() ;
    }
    
    
    
}
