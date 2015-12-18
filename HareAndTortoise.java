import java.util.Scanner;
public class HareAndTortoise {
	public static void main(String[] args) {
		final int LENGTH = 30; //TODO let user choose the size
		Scanner Input = new Scanner(System.in);
		
		boolean runProgram = true;
		while (runProgram) {
			//Game loop
			//int[] race = new int[LENGTH];
			Hare hare = new Hare(1);
			Tortoise tortoise = new Tortoise(1);
			int iteration = 0;
			boolean runSimulation = true;
			while(runSimulation) {
				//Update hare
				hare.move();
				
				//Update tortoise
				tortoise.move();
				
				//Check for victory
				if (tortoise.getPosition() >= LENGTH && hare.getPosition() >= LENGTH) {
					System.out.println("IT’S A TIE!!");
					runSimulation = false;
					continue;
				}
				else if (tortoise.getPosition() >= LENGTH) {
					System.out.println("TORTOISE WINS!!");
					runSimulation = false;
					continue;
				}
				else if (hare.getPosition() >= LENGTH) {
					System.out.println("HARE WINS!!");
					runSimulation = false;
					continue;
				}
				
				//Print result
				for (int positionPointingTo = 1; positionPointingTo <= LENGTH; positionPointingTo++) {
					if (positionPointingTo == hare.getPosition() && positionPointingTo == tortoise.getPosition())
						System.out.print("OUCH!!");
					else if (positionPointingTo == hare.getPosition())
						System.out.print("H");
					else if (positionPointingTo == tortoise.getPosition())
						System.out.print("T");
					else 
						System.out.print(" ");
				}
				System.out.println("\t\tIteration: " + iteration);
				
				iteration++;
			}
			
			System.out.println("Iterations: " + iteration);
			
			System.out.println("\n\nEnter X to end or any other key to run the simulation again: ");
			String temp = Input.nextLine();
			if (temp.charAt(0) == 'X' || temp.charAt(0) == 'x')
				runProgram = false;
		}
	}
	
	/*public static void resetArray(int[] array) {
		for(int x = 0; x < array.length; x++) {
			array[x] = 0;
		}
	}
	
	public static void printArray(int[] array) {
		for(int x = 0; x < array.length; x++) {
			switch(array[x]) {
			case 0:
				System.out.print(" ");
				break;
			case 1:
				System.out.print("H");
				break;
			case 2:
				System.out.print("T");
				break;
			case 3:
				System.out.print("");
			}
		} 
	}*/
}
