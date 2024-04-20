
package com.mycompany.lab1;

import java.util.Scanner;


public class Question4 {
    private int[] arraynumber;
    public Question4(int[] arraynumber) {
        this.arraynumber = arraynumber;
    }
   
    public Question4() {
    }
    
    public void Input() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arraynumber = new int[n];
        for (int i=0; i<arraynumber.length; i++) {
          arraynumber[i]=sc.nextInt();
        }
    }
    public int SumEvenNumber() {
        int sum=0;
        for (int i=0; i<arraynumber.length; i++) {
            if (arraynumber[i]%2==0) {
                sum+=arraynumber[i];
            }
        }
        return sum;
 }
}

