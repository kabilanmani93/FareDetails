package JavaPrograms;


public class Casting {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.callme();


        Animal c = new Animal();
        c.callme();

        //upcasting (can access parent variables and overriden methods)
        Animal u = new Dog();
        u.Animalname= "New Animal Dog via upcasting";
        System.out.println(u.Animalname);
        u.callme(); //will call child methodi.e overriden
        u.AnimalMethod();

        //Downcasting should be explicitly not implicitly like child c = new parent();
        Dog down = (Dog)u;
        down.callme();//child method
        down.DogId=5;
        System.out.println(down.DogId);



        Animal a = (Animal) d;    // up-casting
        a.callme();
        ((Dog) a).AnimalMethod();  // downcasting

    }
	    
	    
	    /*
Dog d = new Dog();
Animal a = (Animal) d; //Explicitly you have done upcasting. Actually no need,
 we can directly type cast like Animal a = d; compiler now treat Dog as Animal but still it is Dog even after upcasting
d.callme();
a.callme(); // It calls Dog's method even though we use Animal reference.
((Dog) a).callme2(); // Downcasting: Compiler does know Animal it is,
In order to use Dog methods, we have to do typecast explicitly.
// Internally if it is not a Dog object it throws ClassCastException
	     */
}

class Animal {

    String Animalname;
    public void callme() {
        System.out.println("In callme of Animal");
    }

    public void AnimalMethod() {
        System.out.println("In callme of Animal 233333");
    }
}


class Dog extends Animal {
    int DogId;
    public void callme() {
        System.out.println("In callme of Dog");
    }

    public void DogMethod() {
        System.out.println("In callme2 of Dog");
    }
}

