package core.recursividad;

public class Recusividad {

    public static void contar(int n) {
        if (n == 0) {
            return;
        } else {
            System.out.println(n);
            contar(n - 1);
        }
    }

    public static long factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }

}
