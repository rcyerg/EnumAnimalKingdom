package animalkingdom;

public class Cat extends Feline implements Pet{
    public Cat(String food, Size size) {
        super(food, size);
    }


    public void makeSound(){
        System.out.println("meow meow");
    }
    @Override
    public void printAnimalFood() {
        System.out.println(this.food);
    }

    @Override
    public void greetOwner() {
        System.out.println("lick face");
    }

    @Override
    public void printPetClassName(Pet pet) {
        Pet.super.printPetClassName(pet);
    }
}
