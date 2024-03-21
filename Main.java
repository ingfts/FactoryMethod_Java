public class Main {
    public static void main(String[] args) {
        Animal puppy = AnimalType.setAnimal("dog");
        Animal littleCat = AnimalType.setAnimal("CAT");
        Animal ponie = AnimalType.setAnimal("HORSe");

        //puppy.action();
        //littleCat.action();
        ponie.action();
    }
}
