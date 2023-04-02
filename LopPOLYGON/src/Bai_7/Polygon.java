package Bai_7;

/**
 *
 * @author ADMIN
 */
public class Polygon {
    private Point[] p;

    public Polygon(Point[] p) {
        this.p = p;
    }
    public double areaTrigle(Point a,Point b, Point c){
        return (0.5 * Math.abs((a.getX() - c.getX()) * (a.getY() - b.getY()) - (a.getX() - b.getX()) * (a.getY() - c.getY())));
    }
    public String getArea(){
        double Area = 0;
        for(int i = 1;i < p.length - 1;i++){
            Area += areaTrigle(p[0],p[i],p[i+1]);
        }
        return String.format("%.3f", Area);
    }
}
