public class Collatz {
	public static void main(String args[]) {
		int number = Integer.parseInt(args[0]);
		char modeoperation = args[1].charAt(0);
		int term;
		int count;

		if (modeoperation == 'v'){
			System.out.println("1 4 2 1 (4)");
		}
		for (int i = 2; i <= number; i++){	
			term = i;
			count = 1;
			while(term != 1){
				if (modeoperation == 'v'){
					System.out.print(term + " ");
				}
				if (term % 2 == 0){
					term /= 2;
				}
				else {
					term = (3 * term) + 1;
				}
				count ++;
			}
			if (modeoperation == 'v'){
				System.out.println("1 (" + count + ")");
			}
		}
		System.out.println("Every one of the first " + number + " hailstone sequences reached 1.");

	}
}