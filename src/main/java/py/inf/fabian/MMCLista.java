package py.inf.fabian;


public class MMCLista {
    //Algoritmo de Euclides iterativo para calcular MDC
    public static int mdc(int a, int b){
        while(b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    //Calcula o MMC de uma lista de números
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

    //código de testes
    public static void main(String[] args) {
        System.out.println("MMC(2,3,4,5) = " + mmcLista(new int[]{2,3,4,5}));
    }
}