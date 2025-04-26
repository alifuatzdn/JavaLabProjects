public class FindGrade {
    public static void main(String[] args) {
        if (args.length > 0) {

            int grade = Integer.parseInt((args[0]));

            if (grade <= 100 && grade >= 0) {
                if (grade >= 90) {
                    System.out.println("Your grade is A");
                }else if (grade >= 80) {
                    System.out.println("Your grade is B");
                }else if (grade >= 70) {
                    System.out.println("Your grade is C");
                }else if (grade >= 60) {
                    System.out.println("Your grade is D");
                }else {
                    System.out.println("Your grade is F");
                }
            }else {
                System.out.println("It is not a valid score!");
            }


        }
    }

}