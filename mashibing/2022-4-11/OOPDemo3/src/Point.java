public class Point {

    int x;
    int y;

    public Point(int _x,int _y){
        x = _x;
        y = _y;
    }

    public double distance(Point p){
        return Math.sqrt((p.x - x) * (p.x - x) + (p.y - y) * (p.y - y));
    }

    public void switchPoint(Point p){
        int a = p.x;
        int b = p.y;
        p.x = x;
        x = a;
        p.y = y;
        y = b;

    }

    public void showInfo(){
        System.out.println("X坐标为: " + x + " Y坐标为: " + y);
    }

    public static void main(String[] args) {
        Point p1 = new Point(3,5);
        Point p2 = new Point(2,4);

        System.out.println(p1.distance(p2));

        Point p3 = new Point(5,5);
        Point p4 = new Point(10,10);
        System.out.println("p3");
        p3.showInfo();
        System.out.println("p4");
        p4.showInfo();

        p3.switchPoint(p4);

        System.out.println("p3");
        p3.showInfo();
        System.out.println("p4");
        p4.showInfo();

    }

}
