public class Main {
    public static void main(String[] args) {
        // här inne i main ska vi kalla på vår metod som kommer att köras när programmet startar

        calcTotal(3,5 );
        calcTotal(10, 30);
        calcTotal(2, 10);

        methodName();

    }

    // här ska vi skapa vår metod
    public static void calcTotal(int a, int b) {
        int result = a + b;
        System.out.println("Total sum is: " + result);
    }

   /* public static void calcTotal() {
        int a = 3;
        int b = 5;

        int result = a + b;

        System.out.println("Total sum is: " + result);
    }*/

    public static void methodName() {
        // skriv metoden här....
    }
}