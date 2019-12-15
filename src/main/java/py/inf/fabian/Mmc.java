package py.inf.fabian;

public class Mmc {

    //Algoritmo de Euclides iterativo
    private static int mdc(int a, int b){
        while(b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    //Algoritmo do MMC
    private static int mmc(int a, int b){
        return a * (b / mdc(a, b));
    }

    //Testes
    public static void main(String[] args) {
        System.out.println("MMC");
        System.out.printf("mmc(5, 15) = %d\n", mmc(5, 15));
        System.out.printf("mmc(60, 100) = %d\n", mmc(15, 25));
        System.out.printf("mmc(36, 14) = %d\n", mmc(36, 14));
    }

}
