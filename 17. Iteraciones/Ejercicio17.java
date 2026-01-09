

public class Ejercicio17 {
    public static void main(String[] args) {
        
        //Iteracion con For sencillo
        for(int i = 1; i <= 10; i++) {
            System.out.println("Iteracion numero: " + i);
        }

        //Iteracion con While
        int j = 1;
        while(j <= 10) {
            System.out.println("Iteracion numero: " + j);
            j++;
        }
        
        //Iteracion con Do-While
        int k = 1;
        do {
            System.out.println("Iteracion numero: " + k);
            k++;
        } while(k <= 10);

        //Iteracion con For avanzado (foreach)
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        for(int numero : numeros) {
            System.out.println("Iteracion numero: " + numero);
        }

        //Iteracion con For con decremento
        for(int l = 10; l >= 1; l--) {
            System.out.println("Iteracion numero: " + l);
        }
        
    }
}
