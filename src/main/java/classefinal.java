import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class classefinal {

    private static Scanner scanner;

    public static void main(String[] args) {
        tarea();
    }

    private static void tarea() {

        scanner = new Scanner(System.in);
        boolean salir = false;
        int ejercicio;

        while (!salir) {
            System.out.println("Lenguaje II Semestre : ");
            System.out.println("1. Ejercicio  ");
            System.out.println("4. Salir");

            try {

                System.out.println("Escribe una de las opciones: ");

                ejercicio = scanner.nextInt();

                switch (ejercicio) {
                    case 1:
                        ejercicio1();

                        break;
                    case 2:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 2");

                }
            } catch (InputMismatchException | IOException e) {
                System.out.println("Debes insertar un número");
                scanner.next();
            }
        }

    }



    public static int mdc(int a, int b){
        while(b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }


    public static int mmcLista(int[] numberList){
        if(numberList.length < 2){
            throw new IllegalArgumentException("A lista deve conter pelo menos dois números");
        }
        int mmcResultado = numberList[0];
        for(int i = 1; i < numberList.length; i++){
            mmcResultado = mmcResultado * (numberList[i] / mdc(mmcResultado, numberList[i]));
        }
        return mmcResultado;
    }


    public static void ejercicio1() throws IOException {

        int[] vector = new int[5];
        ArrayList multimploDeCinco = new ArrayList<Integer>();

        System.out.println("----------------------------------------------------------------------");

        System.out.println(" Por favor complete os valores de 5 numeros para el vector!");

        int sumaPares = 0;
        int mayor = 0;
        int menor = 0;
        int producto = 0;
        double medio = 0.0;

        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));

        //Adicionando valores
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce valor para la posicion "  + i );
            String valor = in.readLine().trim();
//            System.out.println("Valor escolhido = " + valor  );
            vector[i] = new Integer(valor);
        }

        for (int j = 0; j < vector.length  ; j++) {
//            System.out.println(" Valor posicion " + j + " valor = " + vector[j] );

            //Verificando cules son pares
            if (vector[j] % 2 == 0) {
                sumaPares += vector[j];
            }

            //Verificando cuales son multiplos de 5
            if(vector[j] % 5 == 0){
                multimploDeCinco.add(vector[j]);
            }

        }

        //El vector para sacar el producto no puede ser menor que 2, entonces se le agrega 1 solo para no dar erro
        int tamanhoVectoMultipoCinco = multimploDeCinco.size();

        if(tamanhoVectoMultipoCinco < 2){
            tamanhoVectoMultipoCinco = 2;
        }

        int[] vectoMultiploCinto = new int[tamanhoVectoMultipoCinco];
        for (int k = 0; k < multimploDeCinco.size() ; k++) {
            vectoMultiploCinto[k] = (int) multimploDeCinco.get(k);
        }

        if(multimploDeCinco.size() < 2 ){
            vectoMultiploCinto[1] = 1;
        }

        //Sacando el producto
        producto = mmcLista(vectoMultiploCinto);

        //Buscando el mayor valor
        mayor = vector[0];
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > mayor){
                mayor = vector[i];
            }
        }

        //Buscando el menor valor
        menor = vector[0];
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] < menor){
                menor = vector[i];
            }
        }

        //Sacando el medio, double por que los valores puden ser quebrados
        double sumaMedio = 0.0;
        for (int i = 0; i < vector.length; i++) {
            sumaMedio += vector[i];
        }

        medio = sumaMedio / 5;

        //Ordenando el vector
        Arrays.sort(vector);

        String vectorOrdenado = " ";
        for (int i = 0; i < vector.length; i++) {
            if(i == 0){
                vectorOrdenado += vector[i];
            }else {
                vectorOrdenado += "," + vector[i];
            }

        }

        System.out.println("soma de los pares = " + sumaPares );
        System.out.println("producto (mmc) de multiplo de 5 es = " + producto );
        System.out.println("mayor n'umero del vector = " + mayor  );
        System.out.println("menor n'umero del vector = " + menor  );
        System.out.println("medio del vector = " + medio  );
        System.out.println("vector ordenado  = " + vectorOrdenado );

        System.out.println("------ todo mundo feliz! ------- \n");

        System.out.println("Lo hacemos otra vez?");

    }

}
