public class reto4 {
    public static void main(String[] args) {
        /**
         * main
         */
    }

    public void almacenarHashMap(String metal, integer valor) {
        HashMap<String, Integer> metales = new HashMap<String, Integer>();

        metales.putIfAbsent("oro", 4);
        metales.putIfAbsent("plata", 3);
        metales.putIfAbsent("oro", 7);
        metales.putIfAbsent("diamante", 10);

        System.out.println(metales);
    }
}