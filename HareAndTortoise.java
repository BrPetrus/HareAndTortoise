
public class HareAndTortoise {
	public static void main(String[] args) {
		final int MAX = 10;
		final int MIN = 1;
		
		for (int x = 0; x < 100; x++) {
			if (x % 10 == 0)
				System.out.println();
			System.out.print((MIN + (int)(Math.random() * ((MAX - MIN) + 1))) + " ");
		}
		
		//TODO Everything should be nested in a loop. So user can change the length of race.
		
		//Game loop
		while(true) {
			//Update hare
			
			//Update tortoise
			
			//Print result
			
		}
	}
}
