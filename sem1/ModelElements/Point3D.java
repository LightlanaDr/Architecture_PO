package org.sem1.ModelElements;

public class Point3D {

    // region Constructors
    public Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //endregion

    // region Private Fields

    private double x, y, z;

    // endregion

    // region Public Properties

     public double getX() {
       return x;
     }

     public void setX(float x) {
       this.x = x;
     }

     public double getY() {
       return y;
     }

     public void setY(float y) {
       this.y = y;
     }

     public double getZ() {
       return z;
     }

     public void setZ(float z) {
       this.z = z;
     }

    // endregion

}
