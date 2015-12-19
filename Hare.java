
public class Hare {
	private int position;
	
	private final int DEFAULT_POSITION = 1;
	
	public Hare(int defaultPosition) {	
		if (defaultPosition < DEFAULT_POSITION) {
			System.out.println("ERROR: Position have to be positive! Setting to default value: " + DEFAULT_POSITION);
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
		//1 2 -> Big hop, move 9 squares to right
		if (rNumber == 1 || rNumber == 2) {
			position += 9;
		}
		//3 4 5 -> Small hop, move 1 square to right
		else if (rNumber >= 3 && rNumber <= 5) {
			position += 1;
		}
		//6 -> Big slip, move 12 squares to left
		else if(rNumber == 6) {
			position -= 12;
			if (position < DEFAULT_POSITION)
				position = DEFAULT_POSITION;
		}
		//7 8 -> Small slip, move 2 squares to left
		else if(rNumber == 7 || rNumber == 8) {
			position -= 2;
			if (position < DEFAULT_POSITION)
				position = DEFAULT_POSITION;
		}
		//9 10 -> fall asleep, don't move
		else {}
	}
	
	//--------------------------------
	//	Logic functions
	//--------------------------------
	private int generateNumber(int MIN, int MAX) {
		return MIN + (int)(Math.random() * ((MAX - MIN) + 1));
	}
}
