public  class  TestRandom {
	public static void main(String[]  args) {
	    
		int num = Integer.parseInt(args[0]);
		int less = 0;
		int greater = 0;
		
		for (int i = 0; i < num; i++) {
			double random = Math.random();
			if (random <= 0.5) {
				less ++;
			}
			else {
				greater ++;
			}
		}

		System.out.println("> 0.5: " + greater + " times");
		System.out.println("<= 0.5: " + less + " times");

		if (less != 0){
			double ratio = (double) greater/ (double) less;
			System.out.println("Ratio: " + ratio);
		}
	}
}