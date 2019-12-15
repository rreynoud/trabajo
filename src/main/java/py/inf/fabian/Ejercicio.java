package py.inf.fabian;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio {

    private static Scanner scanner;

    public static void main(String[] args) {



        try{
            tarea();
        }catch (Exception e)
        {
            e.printStackTrace();
        }




    }

    private static void tarea() {

        scanner = new Scanner(System.in);
        boolean salir = false;
        int ejercicio;

        while (!salir) {
            System.out.println("Lenguaje II Semestre : ");
            System.out.println("1. Ejercicio 1 ");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Salir");

            try {

                System.out.println("Escribe una de las opciones: ");

                ejercicio = scanner.nextInt();

                switch (ejercicio) {
                    case 1:
                        ejercicio1();

                        break;
                    case 2:
                        ejercicio2();
                        break;
                    case 3:
                        ejercicio3();
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");

                }
            } catch (InputMismatchException | IOException e) {
                System.out.println("Debes insertar un número");
                scanner.next();
            }
        }

    }


    public static void ejercicio1() throws IOException {

        int[] vector = new int[5];

        System.out.println("----------------------------------------------------------------------");

        System.out.println(" 1)-Dado un vector de 5 enteros actualizar cada posicion de dicho vector con un numero leido, precione enter");

        int sumaPares = 0;

        int indice=0;
        int suma;
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));

        String cadena=in.readLine().trim();

        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce valor para la posicion "  + i );
            String valor = in.readLine().trim();
            System.out.println("Valor escolhido = " + valor  );
            vector[i] = new Integer(valor);
        }

        System.out.println("Valores escolhidos tamanho vetor "  + vector.length );

        for (int j = 0; j < vector.length  ; j++) {
            System.out.println(" Valor posicao " + j + " valor = " + vector[j] );


            if (vector[j] % 2 == 0) {
                sumaPares += vector[j];
            }

            if(vector[j] % 5 == 0){
                System.out.println(vector[j] + " Es multiplo de 5 ");
            }


        }

        System.out.println("soma de los pares = " + sumaPares );
        System.out.println("------ todo mundo feliz! ------- ");


        for(suma=0; indice<cadena.length();indice++)
            suma+=(int)cadena.charAt(indice);

        System.out.print(suma);
        System.in.read();

        System.out.println("----------------------------------------------------------------------");
    }
    public static void ejercicio2() throws IOException {
        System.out.println("----------------------------------------------------------------------");


        System.out.println("2)- Hacer un algoritmo en java que imprima y cuente los multiplos de 3 que hay del 1 al 100");
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Introduce un numero:");
        int n = Integer.valueOf(in.readLine().trim()).intValue();

        System.out.println("Introduce un numero:");
        int i = Integer.valueOf(in.readLine().trim()).intValue();

//        Matematica m = new Matematica();
//        System.out.println("Resultado "+n+" sobre "+i+" ="+m.Calcula_Factorial(n)/m.Calcula_Factorial(i)*m.Calcula_Factorial(n-i));

        System.out.println("----------------------------------------------------------------------");
    }
    public static void ejercicio3(){

        System.out.println("----------------------------------------------------------------------");

        System.out.println("3)- Introducir tantos numeros que hay entre el 1 y el 100,excepto los multiplos de 2");

        for (int i = 1; i <= 100; i++) {

            if(i % 2 != 0){
                System.out.println("Los números exceptos de múltiplos de dos son: "+i);
            }
        }

        System.out.println("----------------------------------------------------------------------");
    }

}
