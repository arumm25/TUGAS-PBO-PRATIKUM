public class Latihan1 {
    public static void main(String[] args) {
        int n = 5; // Input bilangan
        int faktorial = 1;

        System.out.println("Bilangan : " + n);

        for (int i = 1; i <= n; i++) {
            faktorial *= i;
            
            if (i == 1) {
                System.out.println(i + " x " + (i + 1) + " = " + (i * (i + 1)));
            } else if (i < n) {
                System.out.println(faktorial / i + " x " + (i + 1) + " = " + faktorial);
            } else {
                System.out.println(faktorial / i + " x " + i + " = " + faktorial);
            }
        }

        System.out.println("\nBUILD SUCCESSFUL");
    }
}
