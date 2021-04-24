package wsibd_m7_nila;

/**
 *
 * @author Nila Amalia
 */
public class animal {
public void makeNoise() {
        System.out.println("voice");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        animal animal = new animal();
        animal.makeNoise();
        Dog dog = new Dog();
        dog.makeNoise();
        
        Dog animalDog = new Dog();
        animalDog.makeNoise();
        
        if(animal instanceof animal) {
            System.out.println("animal is Animal");
        }
        
        if (dog instanceof animal) {
            System.out.println("dog is Animal");
        }
        
        if (animalDog instanceof animal) {
            System.out.println("animal Dog is Animal");
        }
        
        if (animal instanceof Dog) {
            System.out.println("animal is Dog");
        }
    }
    
    
}

class Dog extends animal {
    @Override
    public void makeNoise(){
        System.out.println("Bark");
    }
    
}
