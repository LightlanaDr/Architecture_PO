package org.sem1.ModelElements;

public class Flash {
    // region Constructors

    public Flash(Point3D location, Color color, float power, Angle3D angle3D) {
        this.location = location;
        this.color = color;
        this.power = power;
        this.angle3D = angle3D;
    }


    //endregion

    // region Private Fields

    private Point3D location;
    private Color color;
    private float power;

    private Angle3D angle3D;



    // endregion

    // region methods
    /*
    поворот источников света на угол
    @param angleAction
    */
    public void Rotate(Angle3D angleAction) {

    }
    /*
    перемещение к точке
     @param pointAction
     */
    public void Move(Point3D pointAction){

    }

    public Point3D getLocation() {
        return location;
    }

    public void setLocation(Point3D location) {
        this.location = location;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public float getPower() {
        return power;
    }

    public void setPower(float power) {
        this.power = power;
    }

    public Angle3D getAngle3D() {
        return angle3D;
    }

    public void setAngle3D(Angle3D angle3D) {
        this.angle3D = angle3D;
    }

    // endregion

}
