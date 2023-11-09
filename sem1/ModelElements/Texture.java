package org.sem1.ModelElements;

public class Texture {

    // region Constructors

    public Texture(int id, String name) {
        this.id = id;
        this.name = name;
    }


    //endregion

    // region Private Fields

    private int id;
    private String name;

    // endregion

    // region Public Properties

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    // endregion

}
