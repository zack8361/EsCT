package leeseungMinEX;


class Cir{
    int radius;
    int x;
    int y;

    public Cir(){

    }
    public Cir(int radius){
        this.radius = radius;
    }

    public double getArea(){

        return radius * radius * 3.14;
    }

}

public class Main {
    public static void main(String[] args) {
        Cir a = new Cir();
        a.radius = 10;
        double area = a.getArea();
        System.out.println("area = " + area);


        Cir b = new Cir(20);
        double area2 = b.getArea();

        System.out.println("area2 = " + area2);
    }
}
