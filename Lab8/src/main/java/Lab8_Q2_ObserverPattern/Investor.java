/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8_Q2_ObserverPattern;

/**
 *
 * @author Maytinh
 */
interface Investor {
    String getName();
    Strategy addaptStrategy();
    void update(String stockSymbol, double priceChange);
}
