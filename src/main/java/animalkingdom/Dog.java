package animalkingdom;

public class Dog extends Canine implements Pet{
    public Dog(String food, Size size) {
        super(food, size);
    }

    @Override
    public void printAnimalFood() {
        System.out.println(this.food);
    }

    public void fetch(){
        System.out.println("I can fetch cos i am a dog");
    }


    @Override
    public void greetOwner() {
        System.out.println("lick feet");
    }

    @Override
    public void printPetClassName(Pet pet) {
        Pet.super.printPetClassName(pet);
    }

    @Override
    public void makeSound(){
        System.out.println("woof woof");
    }

}
