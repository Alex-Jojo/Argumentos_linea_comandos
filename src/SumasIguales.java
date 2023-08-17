import java.util.HashSet;
import java.util.Set;

public class SumasIguales {
    public static void main(String[] args) {
        if (args.length>2) {
            System.out.println("Ingresa mas de dos elementos");
            return;
        }
        int numSuma = Integer.parseInt(args[0]);

        int[] rango = new int[args.length-1];
        for (int i = 1; i < args.length; i++) {
            rango[i-1] = Integer.parseInt(args[i]);
        }

        if (paresNumeros(rango,numSuma)){
            System.out.println("si hay dos elementos en el arreglo cuya suma es: "+numSuma);
        }
        else {
            System.out.println("No hay.");
        }
    }
    public static boolean paresNumeros(int[] arreglo, int numSuma){
        Set<Integer> numeros = new HashSet<>();
        for (int num: arreglo){
            int num2 = numSuma - num;
            if (numeros.contains(num2)) return true;
            numeros.add(num);
        }
        return false;
    }
}
