package Java;
import java.util.Scanner;

public class Aritmetica{
    public static void main(String[] args){
        System.out.println("Aritmetica");
        //declaracion de objetos y variables
        Scanner input = new Scanner(System.in);
        int n1, n2, suma, mult, div, resta, modulo = 0;
        //solicitud y lectura de datos por teclado
        System.out.println("Ingresa dos numeros distintos: ");
        n1 = input.nextInt();
        n2 = input.nextInt();
        //modulo de operaiones
        suma = n1 + n2;
        mult = n1 * n2;
        div = n1 / n2;
        resta = n1 - n2;
        modulo = n1 % n2;
        //resultados de operaciones
        System.out.println("La suma es: "+suma);
        System.out.println("La multiplicacion es: "+mult);
        System.out.println("La division es: "+div);
        System.out.println("La resta es: "+resta);
        System.out.println("El modulo es: "+modulo);
        //cierre de lectura de datos para evitar ingresar datos erroneos
        input.close();
    }
}