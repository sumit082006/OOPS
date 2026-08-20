package #Enter the name of Package#;

	class Animal {
	    String name = "ANSH";
          int age =19;
          String breed= "Indian";
	    void eat() {
	        System.out.println(name + " is eating this food.");
	    }
	}

	
	class Dog extends Animal {
	    void bark() {
	      
	        System.out.println(name + " is barking.");
	    }
	    void display() {
	    	System.out.println("Name of the dog is :" + name);
	    	System.out.println("Age of the "+name+" is :" + age);
	    	System.out.println("Breed of the "+name+" is :" + breed);
	    }
	}
	class Cat extends Animal {
	    void meow() {
	       
	        System.out.println(name + " is meowing.");
	    }

	        void display() {
	        	System.out.println("Name of the cat is :" + name);
		    	System.out.println("Age of "+name+" the cat is :" + age);
		    	System.out.println("Breed "+name+" of the cat is :" + breed);
	        }
	    }
	public class practice {
	    public static void main(String[] args) {

	        Dog d = new Dog();
	        d.eat();
	        d.bark();
	        d.display();

	        System.out.println();

	        Cat c = new Cat();
	        c.eat();
	        c.meow();
	        c.display();
	}

}


     
	   
