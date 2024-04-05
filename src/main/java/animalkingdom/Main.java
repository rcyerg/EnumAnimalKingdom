package animalkingdom;

public class Main {
    public static void main(String[] args) {

        Animal cat = new Cat("Cat Food", Size.AVERAGESIZE);
        Animal dog = new Dog("Dog Food", Size.BELOWAVERAGE);

        Animal.printAnimalSize(cat);

        Animal.printAnimalSize(dog);

    }
}
