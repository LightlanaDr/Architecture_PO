package org.sem1;

import org.sem1.InMemoryModel.CustomService1;
import org.sem1.InMemoryModel.CustomService2;
import org.sem1.InMemoryModel.CustomService3;
import org.sem1.InMemoryModel.ModelStore;
import org.sem1.ModelElements.Angle3D;
import org.sem1.ModelElements.Camera;
import org.sem1.ModelElements.Point3D;

public class Program {
    public static void main(String[] args) {

        ModelStore modelStore = new ModelStore();

        CustomService1 observer1 = new CustomService1();
        CustomService2 observer2 = new CustomService2();
        CustomService3 observer3 = new CustomService3();

        modelStore.registerModelChanger(observer1);
        modelStore.registerModelChanger(observer2);
        modelStore.registerModelChanger(observer3);

        modelStore.addCamera(new Camera(new Point3D(2, -5, 10), new Angle3D(45,45,45)));
    }
}