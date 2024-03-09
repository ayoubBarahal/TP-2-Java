package td2;

class Point {
    private double x,y;
    private String string;
    public Point(double x,double y,String string){
        this.x=x;
        this.y=y;
        this.string=string;

    }
    public String toString(){
        return "Point nommé "+string+" et de coordonnnées "+x+"  "+y ;
    }
    /*public void affiche(){
        System.out.print("Point nommé "+string+" et de coordonnnées "+x+"  "+y);
    }*/
}

public class exercice06 {

    public static void main(String[] args) {

        Point A= new Point(2.0,5.0,"origine");
        //System.out.print("A = ");
        //A.affiche();
        System.out.println("A ="+A);







    }
}
