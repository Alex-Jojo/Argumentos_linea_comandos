import java.util.Arrays;

public class SumaPrefija {
    public static void main(String[] args) {
        int[] numeros = new int[args.length];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(args[i]);
        }
        int[] indice = sumar(numeros);
        /*for (int i = 0; i < numeros.length; i++) {
            indice[i] = sumar(numeros);
        }*/
        System.out.println("Lista de números introducidos: " + Arrays.toString(numeros));
        System.out.println("Suma prefija correspondiente: " + Arrays.toString(indice));
    }
    private static int[] sumar(int num[]){
        //int indice=0;
        int[] indice = new int[num.length];
        indice[0] = num[0];

        for (int i = 1; i < num.length; i++) {
            indice[i] = indice[i - 1] + num[i];
        }

        return indice;
    }
}
