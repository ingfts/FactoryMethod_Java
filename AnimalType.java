public class AnimalType {
    public static Animal setAnimal(String animalType) {
        if ("DOG".equalsIgnoreCase(animalType)) {
            return new Dog();
        }
        else if ("CAT".equalsIgnoreCase(animalType)){
            return new Cat();
        }
        else if ("HORSE".equalsIgnoreCase(animalType)){
            return new Horse();
        }
        throw new IllegalArgumentException("Unsupported animal type" + animalType);
    }

}
