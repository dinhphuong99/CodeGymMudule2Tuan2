package exercise;

public class Point3D extends Point2D{
    private float z = 0.0f;

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public Point3D(){
    }

    public void setXYZ (float x, float y, float z){
        super.setXY(x,y);
        this.z = z;
    }

    public float[] getXYZ(){
        float[] x = {super.getX(), super.getY(), this.getZ()};
        return x;
    }

    @Override
    public String toString(){
        float[]x = this.getXYZ();
        return "Location: "
                + "(" + x[0] + "," + x[1] + "," +x[2] + ")"
                + "which is a subclass of "
                + super.toString();
    }

    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        point3D.setXYZ(1.5f, 3, 3.5f);
        System.out.println(point3D);
    }
}
