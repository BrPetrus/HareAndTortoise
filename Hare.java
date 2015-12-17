
public class Hare {
	private int position;
	private int lengthOfRace;	//User should not be able to manipulate this number, so he doesn't break the object's logic
	
	private final int DEFAULT_POSITION = 0;
	private final int DEFAULT_LENGTH = 50;
	
	public Hare(int defaultPosition, int Maximum) {	
		if (defaultPosition < 0) {
			System.out.println("ERROR: You tried to assign negative value as a position! Setting to default value: " + DEFAULT_POSITION);
			position = defaultPosition;
		}
		else
			position = defaultPosition;
		
		if (Maximum < defaultPosition) {
			System.out.println("ERROR: The lenght of the race have to be bigger than object's current position! Setting to default value: " + DEFAULT_LENGTH);
			lengthOfRace = DEFAULT_LENGTH;
		}
		else
			lengthOfRace = Maximum;
	};
	
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
		//1 or 2 -> Big hop, move 9 squares to right
		if (rNumber == 1 || rNumber == 2) {
			position += 6;
		}
		//3 4 5 -> Small hop, move 1 square to right
		else if (rNumber >= 3 && rNumber <= 5) {
			position += 1;
		}
		//6 -> Big slip, move 12 squares to left
		else if(rNumber == 6) {
			position -= 12;
			if (position < 0)
				position = 0;
		}
		//7 8 -> Small slip, move 2 squares to left
		else if(rNumber == 7 || rNumber == 8) {
			position -= 2;
			if (position < 0)
				position = 0;
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
