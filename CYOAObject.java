
public class CYOAObject {
	private String name;
	
	public CYOAObject(String n) {
		this.name = n;
	}
	
	public String beginning(){
		return "Good evening " + name + ". You have woken up in the forest and bla bla bleep bloop"
				+ "bladee bla if I keep going with the story I would klasfjkladf "
				+ ";kljasdf;lkasjk;fasd;ljkfkajsdfk;asd;lfasd;lkfkl;asdf;las;jf aj;klsf";
	}
	
	public String scenario1() {
		return "You come to a clearing and you can go North, South, East, or West. What direction do "
				+ "you choose?";
	}
	
	public String north() {
		return "A snake bites you and you die";
	}
	
	public String south() {
		return "You fall into a pit and die";
	}
	
	public String east() {
		return "You happen upon a wizard and he offers you 4 potions, red, orange, yellow, and green. "
				+ "What potion do you choose?";
	}

	public String west() {
		// TODO Auto-generated method stub
		return "You drown";
	}

	public String red() {
		// TODO Auto-generated method stub
		return "Your head swells and explodes. You die.";
	}
}
