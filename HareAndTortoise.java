
public class HareAndTortoise {
	public static void main(String[] args) {
		//final int MAX = 10;
		//final int MIN = 1;
		
		
		
		//TODO Everything should be nested in a loop. So user can change the length of race.
		
		//Game loop
		Hare hare = new Hare(1);
		Tortoise tortoise = new Tortoise(1);
		int x = 0;
		boolean runSimulation = true;
		while(runSimulation) {
			//Update hare
			hare.move();
			
			//Update tortoise
			tortoise.move();
			
			//Print result
			System.out.println("Hare: " + hare.getPosition() + "\tTortoise: " + tortoise.getPosition());
			x++;
			
			if (tortoise.getPosition() >= 50 && hare.getPosition() >= 50) {
				System.out.println("IT’S A TIE!!");
				runSimulation = false;
			}
			else if (tortoise.getPosition() >= 50) {
				System.out.println("TORTOISE WINS!!");
				runSimulation = false;
			}
			else if (hare.getPosition() >= 50) {
				System.out.println("HARE WINS!!");
				runSimulation = false;
			}
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
