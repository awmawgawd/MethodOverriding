
public class MethodOverriding {

	public static void main(String[] args) {
		
		Animal a = new Animal(); // Animal reference, Animal object.
		Animal b = new Wolf();	// Animal reference, Wolf object. Wolf object is a type of Animal.
		//Wolf v = new Animal() is incorrect. Does not work. Animal object is not a type of Wolf.
		Wolf w = new Wolf();	// Wolf reference, Wolf object.
		
		a.bark(); // Bark bark bark -> Animal reference, Animal object. Animal reference has bark() method. Uses Animal's bark() method.
		b.bark(); // Woof woof woof -> Animal reference, Wolf object. Animal reference has bark() method, BUT uses Wolf object's bark method().
		w.bark(); // Woof woof woof -> Wolf reference, Wolf object. Wolf reference has bark() method. Uses Wolf' bark() method.
						// Does not use the inherited Animal's bark() method.
						// Method overriding.
		
		
		// Only Animal has name() method.
		a.name(); // Sam -> Animal reference, Animal object. Animal reference has name() method. Uses Animal's name() method.
		b.name(); // Sam -> Animal reference, Wolf object. Animal reference has name() method. Uses Animal's name() method.
		w.name(); // Sam -> Wolf reference, Wolf object. Wolf reference does not have name() method, but inherits from Animal superclass.
					// Uses Animal's name() method.
		
		
		// Only Wolf has age() method.
		// a.age() is incorrect. Animal reference, Animal object. Animal reference has no age() method.
		// b.age() is also incorrect. Animal reference, Wolf object. Animal reference has no age() method, but Wolf class does. 
			// Since it refers to Animal class, but there is age() method, so Wolf class cannot override Animal's non-existent age() method.
			// Animal b = new Wolf; -> This prevents accessing Wolf's methods if it isn't also in Animal.
		w.age(); // 2 -> Wolf reference, Wolf object. Uses Wolf's age() method.
		
		
		// Only Wolf has color() method
		//a.color; -> Error.
		//b.color; -> Error.
		w.color(); // Green
		
		
		//Only Wolf has food variable
		// System.out.println(a.food); -> Error.
		//System.out.println(b.food); -> Error.
		System.out.println(w.food); // Wolf food
	}
	

}
