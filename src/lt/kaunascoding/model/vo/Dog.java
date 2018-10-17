package lt.kaunascoding.model.vo;

import lt.kaunascoding.model.strategies.IActionStrategy;

public class Dog extends Animal implements IAnimal {
    public Dog(IActionStrategy parStrategy) {

        setStrategy(parStrategy);
    }

    @Override
    public String toString() {
        doAction();
        return "Im a dog: " + super.toString();
    }
}
