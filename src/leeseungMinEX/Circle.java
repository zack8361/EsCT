package leeseungMinEX;

public class Circle {

    int x;
    int y;

    public Circle(){

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setX(2);

        System.out.println(circle.getX());
    }
}
