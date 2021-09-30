/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.soniir.TestEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.Test;
import org.mockito.Mock;
import static org.junit.Assert.*;
import org.junit.Ignore;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;

/**
 *
 * @author slava
 */
public class PortfolioTest {
    Portfolio portfolio;
    StockService stockService;
    
    public PortfolioTest() {
        setUp();
    }
    
    Comparator<Stock> stockComp = Comparator.comparing(Stock::getStockId);
    
    public void setUp(){
        portfolio = new Portfolio();
        stockService = Mockito.mock(StockService.class);
        portfolio.setStockService(stockService);
    }
    @Test
    @Ignore
    public void testGetStockService() {
    }

    @Test
    public void testGetStocks(){
        List<Stock> stocks = new ArrayList<Stock>();
        Stock googleStock = new Stock("1","Google",10);
        Stock microStock = new Stock("2","Microsoft",100);
        stocks.add(microStock);
        stocks.add(googleStock);
        portfolio.setStocks(stocks);
        assertEquals(2, portfolio.getStocks().size());
    }

    @Test
    public void testSetStocks() {
        List<Stock> stocks = new ArrayList<Stock>();
        Stock googleStock = new Stock("1","Google",10);
        Stock microStock = new Stock("2","Microsoft",100);
        stocks.add(microStock);
        stocks.add(googleStock);
        portfolio.setStocks(stocks);
        Collections.sort(stocks, stockComp);
        List<Stock> resList = portfolio.getStocks();
        Collections.sort(resList,stockComp);
        assertEquals(resList, stocks);
    }

    @Test
    public void testGetMarketValue() {
        List<Stock> stocks = new ArrayList<Stock>();
        Stock googleStock = new Stock("1","Google",10);
        Stock microStock = new Stock("2","Microsoft",100);
        stocks.add(microStock);
        stocks.add(googleStock);
        stocks.forEach(e->{
            System.out.println(e.getTicker());
        });
        portfolio.setStocks(stocks);
        when(stockService.getPrice(googleStock)).thenReturn(50.00);//когда вызывается метод getPrice(googleStock) - возвращается 50.00
        when(stockService.getPrice(microStock)).thenReturn(1000.00);       
        double marketValue = portfolio.getMarketValue();
        assertEquals(100500.0,marketValue,0.01);
    }
}
