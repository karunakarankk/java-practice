package Day4;

public class LoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// while loop
		int running = 1;
		while (running < 5) {
			System.out.println("I am daily running " +running);
			running++;
		}

		// do while loop
		int hello = 0;
		do {
			System.out.println("Hai friends" +hello);
			hello++;
		} while (hello < 3);
		int day = 5;
		for (int i = day; i <= 5; i++) {
			System.out.println("The  counting end day" + i);
		}
	}

}
