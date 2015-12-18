
public class Tortoise {
	private int position;
	private int lengthOfRace;
	
	private final int DEFAULT_POSITION = 1;
	//private final int DEFAULT_LENGTH = 50;
	
	public Tortoise(int defaultPosition) {	
		if (defaultPosition < DEFAULT_POSITION) {
			System.out.println("ERROR: Position have to be a positive number! Setting to default value: " + DEFAULT_POSITION);
			position = defaultPosition;
		}
		else
			position = defaultPosition;
		
		/*if (Maximum < defaultPosition) {
			System.out.println("ERROR: The lenght of the race have to be bigger than object's current position! Setting to default value: " + DEFAULT_LENGTH);
			lengthOfRace = DEFAULT_LENGTH;
		}
		else
			lengthOfRace = Maximum;*/
	}
	
	//--------------------------------
	//	Getters
	//--------------------------------
	public int getPosition() {
		return position;
	}
	public int getLengthOfRace() {
		return lengthOfRace;
	}
		
	//--------------------------------
	//	Setters
	//--------------------------------
	public void setPosition(int newPosition) {
		if (newPosition < 0) {
			System.out.println("You tried to assign negative value as a position!");
		}
		else {
			position = newPosition;
		}
	}
	
	//--------------------------------
	//	Update functions
	//--------------------------------
	public void move() {
		//Generate random number
		int rNumber = generateNumber(1, 10);
			
		//Move
		//1 2 3 4 5 -> Fast plod, move 3 squares to right
		if (rNumber >= 1 && rNumber <= 5) {
			position += 3;
		}
		//6 7 8 -> Slow plod, move 1 square to right
		if (rNumber >= 6 && rNumber <= 8) {
			position += 1;
		}
		//9 10 -> Slip, move 6 squares to left
		if (rNumber == 9 || rNumber == 10) {
			position -= 6;
			if (position < DEFAULT_POSITION)
				position = DEFAULT_POSITION;
		}
	}
	
	//--------------------------------
	//	Logic functions
	//--------------------------------
	private int generateNumber(int MIN, int MAX) {
		return MIN + (int)(Math.random() * ((MAX - MIN) + 1));
	}
}
