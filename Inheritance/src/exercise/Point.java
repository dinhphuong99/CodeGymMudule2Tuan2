package exercise;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float[] getXY(){
        float []x = {this.x, this.y};
        return x;
    }

    public String toString(){
        float[]x = this.getXY();
        return "Point: "
                + "(" + x[0] + " , "
                + x[1] + ")";
    }
}
