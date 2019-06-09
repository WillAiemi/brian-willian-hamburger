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
 * @since 07/06/2019 - 21:55
 * @version 1.0
 */
public class ClientVO {
    private long IDClient;
    private String name;
    private String phoneNumber;

    public ClientVO() {
    }

    /**
     * Class constructor
     * @param IDClient Get the Client ID
     * @param name Get the Client name
     * @param phoneNumber Get the Client phone number
     */
    public ClientVO(long IDClient, String name, String phoneNumber) {
        this.IDClient = IDClient;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    /**
     * Constructor without ID
     * @param name Get the Client name
     * @param phoneNumber Get the Client phone number
     */
    public ClientVO(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public long getIDClient() {
        return IDClient;
    }

    public void setIDClient(long IDClient) {
        this.IDClient = IDClient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return name + " - "+ phoneNumber;
    }
    
    

}
