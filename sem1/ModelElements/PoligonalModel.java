package org.sem1.ModelElements;

import java.util.Collection;

public class PoligonalModel {

    // region Constructors

    public PoligonalModel(Collection<Poligon> poligons, Collection<Texture> textures) {
        this.poligons = poligons;
        this.textures = textures;
    }


    //endregion

    // region Private Fields

    private Collection<Poligon> poligons;
    private Collection<Texture> textures;

    // endregion

    // region Public Properties

    public Collection<Poligon> getPoligons() {
        return poligons;
    }

    public void setPoligons(Collection<Poligon> poligons) {
        this.poligons = poligons;
    }

    public Collection<Texture> getTextures() {
        return textures;
    }

    public void setTextures(Collection<Texture> textures) {
        this.textures = textures;
    }


    // endregion
}
