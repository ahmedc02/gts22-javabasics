public class ArithmetischeOperationen {
    public static void main(String[] args) {

        // erzeugt mit /** ...*/
        /**
         * Ausführung aller arithmetischer Operationen und Ausgabe
         *
         */

        int a,b;

        a = 3;
        b = 2;

        System.out.println("a + b: " + (a+b));
        System.out.println("a - b: " + (a-b));
        System.out.println("a * b: " + (a*b));
        double div = (double) a / (double) b;
        System.out.println("a / b: " + div);
        System.out.println("a % b: " + (a%b));


        System.out.println("a++: " + (a++));    // Post-Inkrement
        System.out.println("a++: " + a);

        System.out.println("++b: " + (++b));    // Pre-Inkrement
        System.out.println("b: " + b);

        // Commit Panel: ctrl + k

    }
}
