package mathDemo;

public class MathDemoHomework9 {

    public static void main(String[] args) {
       // Random random = new Random();
       // System.out.println(random.nextInt(0,100));

        //int a = 10;
        //int b = 15;
        //double angle = 45;
        findTriangleAreaByTwoSidesAndAngle(10, 15, 45);



    }
    public static int findTriangleAreaByTwoSidesAndAngle(int a, int b, double angle){
        return (int) (0.5 * a * b * Math.sin(Math.toRadians(angle)));
    }
}
