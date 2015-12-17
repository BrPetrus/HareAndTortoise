
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
		
	}
	
	public boolean victory() {
		if ()
	}
	
	//--------------------------------
	//	Logic functions
	//--------------------------------
	
}
