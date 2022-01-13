package _06_treeSet;

// Comparable - when we store objects of our own class then we have to implement comparable interface.
// So we can compare two objects of our own class.
import java.util.TreeSet;

class Point implements Comparable{
    int x;
    int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int compareTo(Object o){
        Point p = (Point)o;
        if(this.x<p.x)
            return -1;
        else if(this.x > p.x)
            return 1;
        else{
            if(this.y < p.y)
                return -1;
            else if(this.y > p.y)
                return 1;
            else
                return 0;
        }
    }

    @Override
    public String toString(){
        return "x="+x+" y="+y;
    }
}

public class ComparableInterfaceDemo {
    public static void main(String[] args) {
        TreeSet<Point> tsp = new TreeSet<>();
        tsp.add(new Point(1, 1));
        tsp.add(new Point(5, 5));
        tsp.add(new Point(5, 2));

        System.out.println(tsp);
    }
}
