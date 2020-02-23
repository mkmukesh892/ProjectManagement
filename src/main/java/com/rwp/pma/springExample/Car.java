package com.rwp.pma.springExample;

public class Car {
    Engine engine;
    Door door;
    Tyre tyre;
    public Car(){

    }
    public Car(Engine engine, Door door, Tyre tyre) {
        this.engine = engine;
        this.door = door;
        this.tyre = tyre;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", door=" + door +
                ", tyre=" + tyre +
                '}';
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }
}
