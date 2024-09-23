import java.time.LocalDate;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {

        Main app = new Main();
        //app.invertString("Mitocode"); // Invertir una cadena
        //app.isCapicua(5115); // Determinar si es capicua
        //app.cantidadPorLetra("coodeoe"); // cantidad de caracteres por letras
        //app.nroRepitodsCracteres("coodeoe"); // Indicar que caracteres son repetidos y cuantas veces
        //app.isMultiplode2(157); // Indicar si es multiplo
        //app.BisiestoYear(2021); // Determinar si es bisiesto
        //app.desordenarRandom("Holatrert"); // De
        //app.getNotDuplicatesList(Arrays.asList(1, 2, 2, 3)); No duplicados
        //app.checkIfVowelIsPresent("hol");
        //System.out.println(app.palindrome("Oro"));

        // ----------------------------------------------

//        int[] numbers = new int[7];
//        numbers[0] = 1; // Llenar manualmente el array
//        int[] numbers_1 = {1, 2, 3, 4}; // Inicializarun array con enteros
//        String[] nombres = {"Jordan", "Luisa"}; // Inicializar un array string
//        for (int i = 0; i < nombres.length; i++){
//            System.out.println(nombres[i]);
//        }
//        for (String name: nombres){
//            System.out.println(name);
//        }

        // Ingresar 5 numero e agregarlos al arreglo
//        float[] numeros = new float[5];
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Guardando los datos ne el arreglo:");
//        for (int i = 0; i < 5; i++){
//            System.out.print("[ " + (i + 1) + " ] : " );
//            numeros[i] = sc.nextFloat();
//        }
//
//        float sumaPositive = 0.0f,sumaNegative = 0.0f;
//        float promedioPositive = 0.0f, promedioNegative = 0.0f;
//        int countPositive = 0, countNegative = 0, countZeros = 0;
//        for (int i = 0; i < numeros.length; i++){
//            if(numeros[i] == 0){
//                countZeros++;
//            }else if(numeros[i] > 0) {
//                countPositive++;
//                sumaPositive = sumaPositive + numeros[i];
//                promedioPositive = sumaPositive / countPositive;
//            }else{
//                countNegative++;
//                sumaNegative = sumaNegative + numeros[i];
//                promedioNegative = sumaNegative / countNegative;
//            }
//        }
//        System.out.println("El promedio de los numeros positivos es: " + promedioPositive);
//        System.out.println("El promedio de los numeros negativos es: " + promedioNegative);
//        System.out.println("El cantidad de ceros: " + countZeros);


        // --- Intercambiar numeros
//        int[] a = {1, 3, 5, 7};
//        int[] b = {2, 4, 6, 8};
//        int[] array = new int[8];
//
//        int lengthTotal = a.length + b.length;
//        int count = 0;
//        int countb = 0;
//
//        int j = 0;
//        for (int i = 0; i < a.length; i++){
//            array[j] = a[i];
//            j++;
//            array[j+1] = b[i];
//            j++;
//        }


        // Menor de menor a mayor
        Scanner sc = new Scanner(System.in);
        int[] a = {1, 20, 9, 8, 10};

        for (int i = 0; i < a.length; i++){
            System.out.print(" [ " + a[i] + " ] ");
        }

//        for(int i = 0; i < a.length; i++){
//            // asc
//            for (int j = 0; j < a.length - 1; j++){
//                if(a[j] > a[j+1]){
//                   int aux;
//                   aux = a[j];
//                   a[j] = a[j+1];
//                   a[j+1] = aux;
//                }
//            }
//        }

//        for(int i = 0; i < a.length; i++){
//            // desc
//            for (int j = 0; j < a.length - 1; j++){
//                if(a[j] < a[j+1]){
//                   int aux;
//                   aux = a[j];
//                   a[j] = a[j+1];
//                   a[j+1] = aux;
//                }
//            }
//        }

//        System.out.println("\n");
//        for (int i = 0; i < a.length; i++){
//            System.out.print(" [ " + a[i] + " ] ");
//        }


        int max = a[0];

        for (int i = 0; i < a.length; i++){
            if(a[i] > max){
                max = a[i];
            }
        }

        System.out.println(max);


    }



    public boolean palindrome(String cadena){
        boolean result = true;
        int length = cadena.length();
        for (int i = 0; i < cadena.length() / 2; i ++){
            if(cadena.charAt(i) != cadena.charAt(cadena.length() - i - 1)){
                result = false;
                break;
            }
        }
        return result;
    }

    public void checkIfVowelIsPresent(String cadena){
//        String[] array = cadena.split("");
//        boolean isPresent = false;
//
//        for (String s : array){
//            if(s.equals("a") || s.equals("b") || s.equals("c") || s.equals("d") || s.equals("e")) {
//                isPresent = true;
//                System.out.println("si hay vocal");
//                break;
//            }
//        }
//        System.out.println(isPresent);

        boolean isVowel = cadena.matches(".*[aeiou].*");
        if(isVowel) {
            System.out.println("Si existe vocal");
        }else{
            System.out.println("No existe vocal");
        }

    }

    public void getNotDuplicatesList(List<Integer> list){
        List<Integer> lista = List.of(5, 8, 8 , 9);

        Set<Integer> set = new HashSet<>(lista);
        set.forEach(item -> System.out.println(item));

    }

    public void desordenarRandom(String cadena){
        String[] array = cadena.split("");

        ArrayList<String> join = new ArrayList<>();

        for(int i = 0; i < cadena.length(); i++){
            //int aleatorio = (int)(Math.random() * 5) + 1; // 1 a 5
            int aleatorio = (int)(Math.random() * cadena.length()); // 0 a
            join.add(array[aleatorio]);
        }

        String join_1 = String.join("", join);
        System.out.println("EASTA ES LA CADENa alateoria : " + join_1);

        for (int i = 0; i < join.size(); i++){
            System.out.print(join.get(i));
        }

    }


    public void BisiestoYear(int year){
        boolean isLeapp = LocalDate.of(year, 1, 1).isLeapYear();
        if(isLeapp){
            System.out.println("Si");
        }else{
            System.out.println("No");
        }
    }


    private void isMultiplode2(int number){
        if(number % 2 == 0){
            System.out.println("el número : " + number + " si es multiplo de 2");
        }else{
            System.out.println("el numero no e smultpilo de 2");
        }
    }

    private void nroRepitodsCracteres(String cadena){
        int counter[] = new int[256];

        for (int i = 0; i < cadena.length(); i++){
            counter[cadena.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++){
            if(counter[i] > 1){
                System.out.println((char) i + " : " + counter[i]);
            }
        }
    }



    // Mitocode -> m = 1, i =1, o = 2, ..
    private void cantidadPorLetra(String cadena){

       int length = cadena.length();
       int counter[] = new int[256];

       for (int i = 0; i < length; i++){
           counter[cadena.charAt(i)]++;
       }

       for (int i = 0; i < 256; i++){
           if(counter[i] != 0){
               System.out.println((char) i + " : " + counter[i]);
           }
       }
    }

    private void isCapicua(int number){
        String numberText = String.valueOf(number);
        String reverse = new StringBuilder(numberText).reverse().toString();
        if(numberText.equals(reverse)){
            System.out.println("Si es capicua");
        }else{
            System.out.println("No es capicua");
        }
    }

    private void invertString(String text){
        String[] array = text.split("");
        StringBuilder builder = new StringBuilder();

        for(int i = array.length - 1 ; i >= 0; i--){
            builder.append(array[i]);
        }

        System.out.println(builder);
    }
}