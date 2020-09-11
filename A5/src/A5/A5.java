package A5;

import java.util.*;
public class A5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Valor de X: ");
        int x= sc.nextInt();
        System.out.print("Valor de Y: ");
        int y= sc.nextInt();

        int suma = x + y;
        int resta = x - y;
        int mult = x * y;
        int div = x / y;
        int modulo = x % y;

        System.out.println("Suma = " +suma);
        System.out.println("Resta = " +resta);
        System.out.println("Multiplicación = " +mult);
        System.out.println("División = " +div);
        System.out.println("Residuo/Módulo = " +modulo);
    }
}
