package org.sem1.ModelElements;

import java.util.Collection;

public class Poligon {

    // region Constructors
    public Collection<Point3D> getPoints() { return points; }

    //endregion

    // region Private Fields

    private Collection<Point3D> points;



    // endregion

    // region Public Properties


    public Poligon(Collection<Point3D> points) { this.points = points; }
    public Poligon(){}

    // endregion

}
