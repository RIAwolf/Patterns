package lt.kaunascoding.model.vo;

import lt.kaunascoding.model.strategies.IActionStrategy;

public class Cat extends Animal implements IAnimal {

    public Cat(IActionStrategy parStrategy) {

        setStrategy(parStrategy);
    }

    @Override
    public String toString() {
        doAction();
        return "Im a cat: " + super.toString();
    }
}
