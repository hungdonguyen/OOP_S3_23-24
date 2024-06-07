/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8_Q2_ObserverPattern;

/**
 *
 * @author Maytinh
 */
interface Stock {
    public void addObserver(Investor investor);
    public void removeObserver(Investor investor);
    public void notifyInvestors(double priceChange);
}
