/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.soniir.TestEx;

import java.util.List;

/**
 *
 * @author slava
 */
public class Portfolio {
    private StockService stockService;
    private List<Stock> stocks;
    
    public StockService getStockService(){
        return stockService;
    }
    public void setStockService(StockService stockService){
        this.stockService = stockService;
    }
    public List<Stock> getStocks(){
        return stocks;
    } 
    public void setStocks(List<Stock> slist){
        stocks = slist;
    }
    public double getMarketValue(){
        double marketValue = 0.0;
        for(Stock stock:stocks){
            marketValue+=(stockService.getPrice(stock)*stock.getQuantity());
        }
        return marketValue;
    }
}
