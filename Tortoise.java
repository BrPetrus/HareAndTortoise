
public class Tortoise {
	private int position;
	
	private final int DEFAULT_POSITION = 1;
	
	public Tortoise(int defaultPosition) {	
		if (defaultPosition < DEFAULT_POSITION) {
			System.out.println("ERROR: Position have to be a positive number! Setting to default value: " + DEFAULT_POSITION);
			position = defaultPosition;
		}
		else
			position = defaultPosition;
	}
	
	//--------------------------------
	//	Getters
	//--------------------------------
	public int getPosition() {
		return position;
	}
		
	//--------------------------------
	//	Setters
	//--------------------------------
	public void setPosition(int newPosition) {
		if (newPosition < DEFAULT_POSITION) {
			System.out.println("ERROR: Position have to be positive! Setting to default value: " + DEFAULT_POSITION);
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
