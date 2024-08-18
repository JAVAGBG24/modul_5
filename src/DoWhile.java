public class DoWhile {
    public static void main(String[] args) {


        // while loop
      /*  while (j <= 5) {
      // fungerar ej, j måste initieras med ett värde innan vi kan använda det som ett villkor
        }*/

        int a = 1;

        while (a <= 5) {
            System.out.println("While loop: " + a);
            a++;
        }

        // while med break
        int b = 1;

        while (true) {
            if (b > 5) {
                break;
            }
            System.out.println("While loop with break: " + b);
            b++;
        }

        // do while loop

        boolean isReady = false;
        int c = 1;

        do {
            if (c > 5) {
                break;
            }
            System.out.println("Do while loop: " + c);
            c++;
            isReady = (c > 0);
        } while (isReady);

        // while med continue
        int d = 0;
        while (d < 30) {
            d += 5;

            if (d % 15 == 0) {
                continue;
            }

            System.out.println(d + "_");
        }
    }
}
