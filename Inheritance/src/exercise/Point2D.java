package exercise;

public class Point2D {
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

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float[] getXY(){
        float [] td = {this.x, this.y};
        return td;
    }

    @Override
    public String toString(){
        float[] x = this.getXY();
        return "Location (x,y): "
                + x[0] + "," + x[1];
    }
}
