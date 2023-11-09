package org.sem1.InMemoryModel;
import org.sem1.ModelElements.Camera;
import org.sem1.ModelElements.Flash;
import org.sem1.ModelElements.PoligonalModel;
import org.sem1.ModelElements.Scene;
import java.util.ArrayList;
import java.util.Collection;

public class ModelStore implements IModelChanger{
    //region Private Fields
    private Collection<PoligonalModel> polygonalModels = new ArrayList<>();
    private Collection<Flash> flashes = new ArrayList<>();
    private Collection<Camera> cameras = new ArrayList<>();
    private Collection<Scene> scenes = new ArrayList<>();
    private Collection<ModelChangedObserver> changedObservers = new ArrayList<>();
    //endregion


    //region Public Methods

    /* Нотифицирует о событие */
    @Override
    public void notifyChange() {
        for(ModelChangedObserver observer : changedObservers){
            observer.applyUpdateModel();
        }
    }

    @Override
    public void registerModelChanger(ModelChangedObserver o) {
        changedObservers.add(o);
    }

    @Override
    public void removeModelChanger(ModelChangedObserver o) {
        changedObservers.remove(o);
    }

    public void addPolyModel(PoligonalModel model) {
        polygonalModels.add(model);
        this.notifyChange();
    }

    public void removePolyModel(PoligonalModel model) {
        polygonalModels.remove(model);
        this.notifyChange();
    }

    public void addScene(Scene scene) {
        scenes.add(scene);
        this.notifyChange();
    }

    public void removeScene(Scene scene) {
        scenes.remove(scene);
        this.notifyChange();
    }

    public void addFlash(Flash flash) {
        flashes.add(flash);
        this.notifyChange();
    }

    public void removeFlash(Flash flash) {
        flashes.remove(flash);
        this.notifyChange();
    }

    public Scene getScene(int sceneId) {
        for (Scene scene : scenes) {
            if (scene.getId() == sceneId) {
                return scene;
            }
        }
        return null;
    }

    public void addCamera(Camera camera) {
        cameras.add(camera);
        this.notifyChange();
    }

    public void removeCamera(Camera camera) {
        cameras.remove(camera);
        this.notifyChange();
    }
    //endregion

    //region Public Properties

    public Collection<PoligonalModel> getPolygonalModels() {
        return polygonalModels;
    }

    public Collection<Scene> getScenes() {
        return scenes;
    }

    public Collection<Flash> getFlashes() {
        return flashes;
    }

    public Collection<Camera> getCameras() {
        return cameras;
    }

    //endregion



}
