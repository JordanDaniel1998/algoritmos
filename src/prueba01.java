import java.util.Arrays;

public class prueba01 {

    public static void main(String[] args) {

        System.out.println(validarSubSecuencia());


    }

    private static boolean validarSubSecuencia() {
        int[] numbers = {5, 1, 22, 25, 6, -1, 8, 10};
        int[] subsecuencia = {10, -1, 6, 1};

        int j = 0; 

        // Iterar a través del arreglo principal
        for (int i = 0; i < numbers.length; i++) {
            if (j < subsecuencia.length && numbers[i] == subsecuencia[j]) {
                j++; // Mover al siguiente elemento de la subsecuencia
            }
            if (j == subsecuencia.length) {
                return true; // Se encontró la subsecuencia
            }
        }

        return false; // No se encontró la subsecuencia
    }

}
