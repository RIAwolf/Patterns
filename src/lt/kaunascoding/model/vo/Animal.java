package lt.kaunascoding.model.vo;

import lt.kaunascoding.model.strategies.IActionStrategy;

public class Animal implements IAnimal {
    private String name;
    private String type;
    private float weight;
    private float height;
    private IActionStrategy strategy;


    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String parType) {
        type = parType;

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String parName) {
        name = parName;

    }

    @Override
    public float getWeight() {
        return weight;
    }

    @Override
    public void setWeight(float parWeight) {
        weight = parWeight;
    }

    @Override
    public float getHeight() {
        return height;
    }

    @Override
    public void setHeight(float parHeight) {
        height = parHeight;
    }

    @Override
    public void doAction() {
        strategy.doAction();
    }

    @Override
    public String toString() {
        return name+ " " + type +" "+ weight+ " "+ height;
    }

    public void setStrategy(IActionStrategy strategy) {
        this.strategy = strategy;
    }

}
