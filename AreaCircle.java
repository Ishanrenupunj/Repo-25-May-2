public class AreaCircle {
    public double radius;
    public double Area(){
        return Math.PI*radius*radius;
    }
    public static void main(String[] args){
        radius=5;
        Area();

    }

}
