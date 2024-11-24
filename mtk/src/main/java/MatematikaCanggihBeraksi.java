/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class MatematikaCanggihBeraksi {
    
    public static void main(String[] args){
        MatematikaCanggih call = new MatematikaCanggih();
        call.pertambahan(20, 20);
        System.out.println("pertambahan 20 + 20 =" + call.operasi);
        call.perkalian(10, 20);
        System.out.println("perkalian 10 * 20 =" + call.operasi);
        call.modulus(7, 3);
        System.out.println("modulus 7 % 3 =" + call.operasi);
    }
}