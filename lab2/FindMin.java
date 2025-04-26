public class FindMin {
    public static void main(String[] args) {
        if (args.length > 0) {

            int a = Integer.parseInt((args[0]));
            int b = Integer.parseInt((args[1]));
            int c = Integer.parseInt((args[2]));
            int result;

            result = ((a < b) ? ((a < c) ? a : c) : (b < c) ? b : c);

            System.out.println("Min: " + result);



        }

    }
}
