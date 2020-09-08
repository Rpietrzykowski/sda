package sda.obj;

public class MythicalAnimal {

    public void hello() {
        System.out.println("Hello, I'm an unknown animal");
    }
}

class Chimera extends MythicalAnimal {

    public void hello() {
        System.out.println("Hello! Hello!");
    }
}

class Dragon extends MythicalAnimal {

    public void hello() {
        System.out.println("Rrrr...");
    }
}

class MythicalAnimalDemo {
    public static void main(String[] args) {

        MythicalAnimal chimera = new Chimera();
        MythicalAnimal dragon = new Dragon();
        MythicalAnimal animal = new MythicalAnimal();

        chimera.hello(); // Hello! Hello!
        dragon.hello(); // Rrrr...
        animal.hello(); // Hello, i'm an unknown animal
    }
}
