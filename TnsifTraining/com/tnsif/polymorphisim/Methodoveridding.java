package polymorphisim;

class AnimalClass{
	void sound() {
	System.out.println("Animals can make sound");
	}
}
//implicit (dont need @override keyword
class Lion extends AnimalClass{
	void sound() {
	System.out.print("Lion Roars");
	}
}

public class Methodoveridding {
	public static void main (String[] args) {
		Lion li = new Lion();
		li.sound();
		
	}

}
