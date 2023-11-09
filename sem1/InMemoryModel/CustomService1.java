package org.sem1.InMemoryModel;

public class CustomService1 implements ModelChangedObserver{

    @Override
    public void applyUpdateModel() {
        System.out.println("Внесено изменение");
    }
}
