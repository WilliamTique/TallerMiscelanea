package co.edu.sena.soy;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        double numero1 = 0;
        double numero2 = 0;
        double numero3 = 0;
        Scanner sc = new Scanner(System.in);
        double opcion = 0;

        System.out.println("Elija una opción: ");
        System.out.println("1. Calcular el área de un tríangulo. ");
        System.out.println("2. Ingresar dos números y sumarlos. ");
        System.out.println("3. Ingresar un número y visualizar el número elevado al cuadrado.");
        System.out.println("4. Convertir de euros a dólares. ");
        System.out.println("5. Calcular área y perímetro de un cuadrado");
        System.out.println("6. Determinar el área y el volúmen de un cilindro ");
        System.out.println("7. Calcular longitud y área de una circunferencia. ");
        System.out.println("8. Calcular el promedio de tres (3) números ingresados por teclado. ");
        opcion = sc.nextDouble();

        Data data1 = new Data();

        if (opcion == 1)
        {
            System.out.println("Usted ha elegido calcular el área de un tríangulo.");
            System.out.println("Ingrese ancho del triangulo");
            numero1 = sc.nextDouble();
            System.out.println("Ingrese altura del triangulo");
            numero2 = sc.nextDouble();

            System.out.println("El area del triangulo es " + data1.Calcularareatriangulo(numero1, numero2));
        }

        if (opcion == 2)
        {
            System.out.println("Usted ha elegido ingresar dos números por teclado y sumarlos.");
            System.out.println("Ingrese el primer numero");
            numero1 = sc.nextDouble();
            System.out.println("Ingrese el segundo numero");
            numero2 = sc.nextDouble();

            System.out.println("El total de la suma es " + data1.sumanumeros(numero1, numero2));
        }

        if (opcion == 3)
        {
            System.out.println("Usted ha elegido ingresar un número y visualizar el número elevado al cuadrado.");
            System.out.println("Ingrese el numero");
            numero1 = sc.nextDouble();

            System.out.println("El numero elevado al cuadrado es " + data1.Elevarnumero(numero1));
        }

        if (opcion == 4)
        {
            System.out.println("Usted ha elegido conviertir euros a dólares.");
            System.out.println("Ingrese la cantidad de Euros");
            numero1 = sc.nextDouble();

            System.out.println("Total " + data1.Eurosdolares(numero1) + " dolares");
        }

        if (opcion == 5)
        {
            System.out.println("Usted ha elegido Calcular área y perímetro de un cuadrado.");
            System.out.println("Ingrese la altura o ancho de un lado del cuadrado en cm.");
            numero1 = sc.nextDouble();

            System.out.println("El area del cuadrado es de = " + data1.Areacuadrado(numero1) + " cm²");
            System.out.println("El perimetro del cuadrado es de = " + data1.Perimetrocuadrado(numero1)+ " cm");
        }

        if (opcion == 6)
        {
            System.out.println("Usted ha elegido determinar el área y el volúmen de un cilindro.");
            System.out.println("Ingrese la altura del cilindro en cm");
            numero1 = sc.nextDouble();
            System.out.println("Ingrese el radio del cilindro en cm");
            numero2 = sc.nextDouble();

            System.out.println("El area del cilindro es de = " + data1.Areacilindro(numero1, numero2) + " cm²");
            System.out.println("El volumen del cilindro es de = " + data1.Volumencilindro(numero1, numero2) + " cm³");
        }

        if (opcion == 7)
        {
            System.out.println("Calcular longitud y área de un circulo.");
            System.out.println("Ingrese el radio del circulo en cm");
            numero1 = sc.nextDouble();

            System.out.println("La longitud del circulo es de = " + data1.Longitudcircunferencia(numero1) + " cm");
            System.out.println("El area del circulo es de = " + data1.Areacirculo(numero1) + " cm²");
        }

        if (opcion == 8)
        {
            System.out.println("Calcular el promedio de tres (3) números ingresados por teclado.");
            System.out.println("Ingrese el primer numero");
            numero1 = sc.nextDouble();
            System.out.println("Ingrese el segundo numero");
            numero2 = sc.nextDouble();
            System.out.println("Ingrese el tercer numero");
            numero3 = sc.nextDouble();

            System.out.println("El promedio de los tres numeros es = " + data1.Promedionumeros(numero1,numero2,numero3));
        }
    }


}