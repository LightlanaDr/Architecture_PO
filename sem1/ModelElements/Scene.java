package org.sem1.ModelElements;

import java.util.Collection;

public class Scene {
    // region Constructors

    public Scene(int id, Collection<PoligonalModel> models, Collection<Flash> flashes,
                 Collection<Camera> cameras) throws Exception {
        this.id = id;
        this.flashes = flashes;

        if (models.size() > 0) {
            this.models = models;
        } else {
            throw new Exception("Должна быть одна модель");
        }

        if (cameras.size() > 0) {
            this.cameras = cameras;
        } else {
            throw new Exception("Должна быть одна модель");
        }

    }


    //endregion

    // region Private Fields
    private int id;
    private Collection<PoligonalModel> models;
    private Collection<Flash> flashes;
    private Collection<Camera> cameras;


    // endregion

    // region methods

    public int getId() {
        return id;
    }

    public Collection<PoligonalModel> getModels() {
        return models;
    }

    public void setModels(Collection<PoligonalModel> models) {
        this.models = models;
    }

    public Collection<Flash> getFlashes() {
        return flashes;
    }

    public void setFlashes(Collection<Flash> flashes) {
        this.flashes = flashes;
    }

    public Collection<Camera> getCameras() {
        return cameras;
    }

    public void setCameras(Collection<Camera> cameras) {
        this.cameras = cameras;
    }

    public <T> T method1(T flash) {
        return flash;
    }

    public <T, E> T method2(T Model, E Flash) {
        return Model;
    }

    // endregion
}
