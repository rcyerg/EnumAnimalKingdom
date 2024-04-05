package animalkingdom;

public class Main {
    public static void main(String[] args) {

        Animal cat = new Cat("Cat Food", Size.AVERAGESIZE);
        Animal dog = new Dog("DOg Food", Size.BELOWAVERAGE);

        Animal.printAnimalSize(cat);

        Animal.printAnimalSize(dog);

    }
}
