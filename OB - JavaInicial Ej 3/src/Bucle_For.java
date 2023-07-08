public class Bucle_For {
    public static void main(String[] args) {

        String nombres[] = {"Juan", "Pedro", "Ana", "Valeria", "Cristian", "Martin"};
        System.out.println("Los nombres son los siguientes: ");

        for (int i = 0; i < nombres.length; i++) {
            System.out.print(nombres[i]);
            if (i < (nombres.length - 1)){
                System.out.print("," + " ");
            }
        }
    }
}
