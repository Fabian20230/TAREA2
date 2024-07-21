package umg.principaltio.PKGrupo1;

import java.util.Scanner;

public class G1 {
    public void Acirculo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESE EL DIAMETRO DE UN CIRCULO");
        int a = sc.nextInt();
        int b= a/2;
        double d=2 * 3.1416 * (b);
        double c = 3.1416 * (b*b);
        System.out.println("El area del circulo es: "+c);
        System.out.println("La circunferencia del circulo es: "+d);
        System.out.println(" ");

    }
    public void cubo (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la longitud de un lado del cubo");
        int s = sc.nextInt();
        double v = Math.pow(s, 3);
        System.out.println("El volumen de un cubo es:"+ v);



    }
}

