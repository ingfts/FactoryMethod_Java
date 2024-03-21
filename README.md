## Animal Factory Implementation🏭
[![](https://skills.thijs.gg/icons?i=java)](https://skills.thijs.gg)


### Purpose📌:
The code implements an animal factory design pattern to create and manage different types of animals. It utilizes a factory class (`AnimalType`) to create instances of specific animal types based on input.

### Components🧪:
1. **Interface:**
   - `Animal`: Defines a common interface for all animals, with a method `action()` to perform specific actions.

2. **Factory Class:**
   - `AnimalType`: Provides a static method `setAnimal()` to create instances of specific animal types based on input strings. It returns instances of `Dog`, `Cat`, or `Horse` based on the provided animal type.

3. **Animal Classes:**
   - `Dog`, `Cat`, `Horse`: Implement the `Animal` interface and represent specific types of animals. Each class overrides the `action()` method to define the unique action performed by that animal.

4. **Main Class:**
   - `Main`: Contains the main method where animal creation processes are demonstrated. It uses the `AnimalType` factory class to create instances of different animal types and invokes their `action()` methods.

### Processes⚙️:
1. Creation of Factory Class:
   - The `AnimalType` class provides a method to create instances of specific animal types based on input strings.

2. Implementation of Animal Classes:
   - `Dog`, `Cat`, and `Horse` classes implement the `Animal` interface and define unique actions performed by each animal.

3. Main Method Demonstration:
   - In the `Main` class, instances of different animal types are created using the `AnimalType` factory class. The `action()` method of each animal is then invoked to demonstrate their specific actions.

### Conclusion🏆:
The implemented animal factory design pattern allows for dynamic creation of different types of animals based on input strings, providing flexibility and extensibility in managing animal instances.
