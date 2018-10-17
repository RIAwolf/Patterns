package lt.kaunascoding.model.vo;

import lt.kaunascoding.model.strategies.IActionStrategy;

public class Bird extends Animal implements IAnimal {
    public Bird(IActionStrategy parStrategy) {

        setStrategy(parStrategy);
    }

    @Override
    public String toString() {
        doAction();
        return "Im a bird: " + super.toString();
    }
}
