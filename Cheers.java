public class Cheers {
        public static void main(String[] args) {
	    String cheerword = args[0].toUpperCase();
            int counting = Integer.parseInt(args[1]);
            String letters = "AEFHILMNORSX";

            for (int i = 0; i < cheerword.length(); i++) {
                System.out.print("Give me a");
                if (letters.indexOf(cheerword.charAt(i)) == -1){
                        System.out.print("  ");
                }
                else {
                        System.out.print("n ");
                } 
                System.out.print(cheerword.charAt(i) + ": ");
                System.out.println(cheerword.charAt(i) + "!");
            }

            System.out.println("What does that spell?");

            for (int i = 0; i < counting; i++) {
                System.out.println(cheerword + "!!!");
            }
        }
}