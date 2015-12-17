
public class HareAndTortoise {
	public static void main(String[] args) {
		final int MAX = 10;
		final int MIN = 1;
		
		/*for (int x = 0; x < 100; x++) {
			if (x % 10 == 0)
				System.out.println();
			System.out.print((MIN + (int)(Math.random() * ((MAX - MIN) + 1))) + " ");
		}*/
		
		//TODO Everything should be nested in a loop. So user can change the length of race.
		
		//Game loop
		Hare hare = new Hare(0, 10);
		int x = 0;
		while(hare.getPosition() <= 50) {
			//Update hare
			hare.move();
			
			//Update tortoise
			
			//Print result
			System.out.println(hare.getPosition());
			x++;
		}
		
		System.out.println("Iterations: " + x);
	}
	
	/*public static boolean victory() {
		if (position >= lengthOfRace) {
			return true;
		}
		return false;
	}*/
}
