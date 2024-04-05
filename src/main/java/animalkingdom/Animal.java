package animalkingdom;

public abstract class Animal {

    protected String food;

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


    public static void printUniqueAnimalMethod(Animal animal){
        if(animal instanceof Dog){
            ((Dog) animal).fetch();
        }

        if(animal instanceof Cat){
            ((Cat) animal).scratch();
        }

    }



    public void makeSound(){
        System.out.println("unknown animal sound");
    }

    public abstract void printAnimalFood(); // signature


}
