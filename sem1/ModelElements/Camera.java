package org.sem1.ModelElements;

public class Camera {

    // region Constructors

    public Camera(Point3D location, Angle3D angle) {
        this.location = location;
        this.angle = angle;
    }


    //endregion

    // region Private Fields

    private Point3D location;
    private Angle3D angle;



    // endregion

    //region Public Properties

    public Point3D getLocation() {
        return location;
    }

    public Angle3D getAngle() {
        return angle;
    }

    //endregion

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




    // endregion
}
