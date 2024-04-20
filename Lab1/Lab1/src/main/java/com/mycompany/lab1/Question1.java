
package com.mycompany.lab1;


public class Question1 {
    private int number;
    
    public Question1(int number) {
        this.number = number;
    }

    public Question1() {
    }
    
    public int SumFirstLastDigit() {
        int lastDigit = number%10;
        int firstDigit = number;
        while (firstDigit >=10) {
            firstDigit/=10;
        }
        return lastDigit + firstDigit;
    }
}
