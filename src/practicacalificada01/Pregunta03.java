/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicacalificada01;
import java.util.Scanner;
/**
 *
 * @author kepb
 */
public class Pregunta03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        double tarifa, sueldoNormal, sueldoExtra, total, bono;
        int horas;
        
        //entrada
        System.out.print("ingrese la tarifa por hora");
        tarifa = sc.nextDouble();
        
        System.out.print("ingrese las horas trabajadas");
        horas = sc.nextInt();
        
        //calculo
        if(horas<=40){
            sueldoNormal = horas * tarifa;
            sueldoExtra = 0;
        } else {
            sueldoNormal = 40 * tarifa;
            sueldoExtra = (horas - 40) * tarifa * 1.5;
        }
        
        total = sueldoNormal + sueldoExtra;
        
        //Operador ternario
        bono = (total > 1500)? 100:0;
        
        total +=bono;
        
        //Salida
        System.out.println("\n-- BOLETA DE PAGO --");
        System.out.printf("sueldo por horas normales: $ %.2f\n", sueldoNormal);
        System.out.printf("Sueldo por horas extras: $ %.2f\n", sueldoExtra);
        System.out.printf("Bono de movilidad aplicado: $ %.2f\n", bono);
        System.out.printf("Total neto a pagar: $ %.2f\n", total);
        
        sc.close();
        
    }        
}       
  