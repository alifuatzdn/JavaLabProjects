public class FindMaximum {

	public static void main(String[] args){
        if (args.length > 0) {
            int value1 = Integer.parseInt((args[0]));
            int value2 = Integer.parseInt((args[1]));
            //int value1 = 6;
            //int value2 = 9;
            int result;

            boolean someCondition = value1 > value2;

            result = someCondition ? value1 : value2;

            System.out.println(result);

        }

	}
}