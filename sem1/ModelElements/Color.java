package org.sem1.ModelElements;

public class Color {
    // region Constructors

    public Color(int id, String name) {
        this.id = id;
        this.name = name;
    }


    //endregion

    // region Private Fields

    private int id;
    public String name;

    // endregion

    // region Public Properties

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }


    // endregion
}
