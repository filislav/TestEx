/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.soniir.TestEx;

/**
 *
 * @author slava
 */
public class StockServiceImpl implements StockService{

    @Override
    public double getPrice(Stock stock) {
       return stock.getQuantity()/10;
    }
    
}
