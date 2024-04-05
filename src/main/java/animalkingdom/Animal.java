package animalkingdom;

public abstract class Animal {

    private String food;

    private int id;

    private int uniqueID;

    private Size size;

    public Animal(String food, Size size){
        this.food = food;
        this.size = size;
    }

    public static void printAnimalSize(Animal animal) {
        System.out.println("This animal's size is " + animal.size.getSize() + ".");
    }
}
