/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicacalificada01;
import java.util.Scanner;
/**
 *
 * @author Ander Castillo
 */
public class Pregunta01 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(), m = sc.nextInt(), s = sc.nextInt();
        
        if(h >=0 && h <=23 && m>=0 && m<=59 && s >=0 && s<=59){
            
         s++;
        
        if(s >=59){s=0; m++;}
        if(m >=59){m=0; h++;}
        if(h >23){h=0;}
        
        System.out.printf("%02d:%02d:%02d\n", h, m, s);
        
       } else {
            System.out.println("Datos invalidos");
        }
    }        
}

       
 

 