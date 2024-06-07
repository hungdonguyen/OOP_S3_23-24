/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Lab8_Q2_ObserverPattern;

/**
 *
 * @author Maytinh
 */
public class ObserverPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Stock appleStock = new ConcreteStock("APP", 100);
        Stock dellStock = new ConcreteStock("DELL",100);
        
        Investor tomInvestor = new SimpleInvestor("Tom");
        Investor bobInvestor = new SimpleInvestor("Bob");
        appleStock.addObserver(tomInvestor);
        appleStock.addObserver(bobInvestor);
        dellStock.addObserver(tomInvestor);
        
        
        appleStock.notifyInvestors(100);
        appleStock.notifyInvestors(40.0);
        appleStock.notifyInvestors(10);
        appleStock.notifyInvestors(300);
    }
}
