package org.sem1.InMemoryModel;

public interface IModelChanger {
    void notifyChange();

    void registerModelChanger(ModelChangedObserver o);
    void removeModelChanger(ModelChangedObserver o);

}
