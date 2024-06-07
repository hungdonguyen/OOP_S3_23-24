/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Lab8_Q1_SingletonPattern;

/**
 *
 * @author Maytinh
 */
public class SingletonPattern {

    public static void main(String[] args) {
        CompanyInfo companyInfo = CompanyInfo.getInstance();
        
        companyInfo.displayInfo();
        
        companyInfo.setCompanyName("Cong ty HungChika");
        companyInfo.setAddress("Binh Duong Convince");
        companyInfo.setEmail("donguyenquanghung182@gmail.com");
        
        companyInfo.displayInfo();
        
    }
}
