import java.util.Scanner;
public class HareAndTortoise {
	public static void main(String[] args) {
		final int LENGTH = 50; 
		Scanner Input = new Scanner(System.in);
		
		//Program loop
		boolean runProgram = true;
		while (runProgram) {	
			//Create objects
			Hare hare = new Hare(1);
			Tortoise tortoise = new Tortoise(1);
			
			//Starting message
			System.out.println("AND THEY’RE OFF!!");
			
			//Simulation loop
			boolean runSimulation = true;
			while(runSimulation) {
				//Update hare
				hare.move();
				
				//Update tortoise
				tortoise.move();
				
				//Print
				printTrack(LENGTH, hare, tortoise);
				System.out.println();
				
				//Check for victory
				if (tortoise.getPosition() >= LENGTH && hare.getPosition() >= LENGTH) { //Tie
					System.out.println("IT’S A TIE!!");
					runSimulation = false;
				}
				else if (tortoise.getPosition() >= LENGTH) { //Tortoise wins
					System.out.println("TORTOISE WINS!!");
					runSimulation = false;
				}
				else if (hare.getPosition() >= LENGTH) { //Hare wins
					System.out.println("HARE WINS!!");
					runSimulation = false;
				}
			}
			
			//Run simulation again ?
			System.out.println("\n\nEnter X to end or any other key to run the simulation again: ");
			String temp = Input.nextLine();
			if (temp.charAt(0) == 'X' || temp.charAt(0) == 'x')
				runProgram = false;
		}
	}
	
	public static void printTrack(int LENGTH, Hare hare, Tortoise tortoise) {
		for (int positionPointingTo = 1; positionPointingTo <= LENGTH + 12; positionPointingTo++) { //LENGTH +12 is there so, when an object passes finish line. The object will still be printed
			if (positionPointingTo == hare.getPosition() && positionPointingTo == tortoise.getPosition()) //If they land on same square
				System.out.print("OUCH!!");
			else if (positionPointingTo == hare.getPosition())
				System.out.print("H");
			else if (positionPointingTo == tortoise.getPosition())
				System.out.print("T");
			/*else if (positionPointingTo == LENGTH)
				System.out.print("F");*/ //Great for readability but not allowed by the rules
			else 
				System.out.print(" ");
		}
	}
}
