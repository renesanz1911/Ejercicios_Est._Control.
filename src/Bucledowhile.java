public class Bucledowhile {
    public static void main(String[] args) {
        int numeroWhile = 3;
        int a = numeroWhile - 1;  // me aseguro de que solo se ejecute una vez.
        do {
            numeroWhile++;
            System.out.println(numeroWhile);
        }
        while (numeroWhile < a);
    }
}