public class FindPrimes {
    public static void main(String[] args) {

        if (args.length > 0) {
            int number = Integer.parseInt(args[0]);
            for (int i = 2; i <= number; i++) {

                int divisor = 2;
                int cnt = 0;

                while (divisor < i) {
                    if (i % divisor == 0) {
                        cnt++;
                        break;
                    }
                    divisor++;
                }
                if (cnt == 0) {
                    System.out.print(i + ",");
                }
            }
        }
    }
}