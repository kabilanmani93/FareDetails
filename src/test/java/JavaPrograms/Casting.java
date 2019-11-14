package JavaPrograms;


public class Casting {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.callme();


        Animal c = new Animal();
        c.callme();
        ((Dog) c).callme2();

        Animal a = (Animal) d;    // up-casting
        a.callme();
        a.callme3();
        ((Dog) a).callme2();  // downcasting
    }
	    
	    
	    /*
	     Dog d = new Dog();
Animal a = (Animal) d; //Explicitly you have done upcasting. Actually no need, we can directly type cast like Animal a = d; compiler now treat Dog as Animal but still it is Dog even after upcasting
d.callme();
a.callme(); // It calls Dog's method even though we use Animal reference.
((Dog) a).callme2(); // Downcasting: Compiler does know Animal it is, In order to use Dog methods, we have to do typecast explicitly.
// Internally if it is not a Dog object it throws ClassCastException
	     */
}

class Animal {
    public void callme() {
        System.out.println("In callme of Animal");
    }

    public void callme3() {
        System.out.println("In callme of Animal 233333");
    }
}


class Dog extends Animal {
    public void callme() {
        System.out.println("In callme of Dog");
    }

    public void callme2() {
        System.out.println("In callme2 of Dog");
    }
}

