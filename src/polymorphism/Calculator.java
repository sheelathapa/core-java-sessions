package polymorphism;

public class Calculator {
    public static void main(String[] args) {
        int a,b;
        float c,d;
        double e,f;

        a=10;b=15;
        Multiply(a,b);

        c=2.4f;
        d=6.4f;
        Multiply(c,d);

        e=4.8;
        f=8.7;
        Multiply(e, f);

    }
    public static void Multiply(int a,int b){
        int sum=a * b;
        System.out.println("Multiply of "+a +"and  "+b +" : "+ sum);
    }
    public static void Multiply(float a ,int b){
        float sum=a * b;
        System.out.println("Multiply of "+a +"and  "+b +" : "+ sum);
    }
    public static void Multiply(double a,double f){
        double sum = a  *  f ;
        System.out.println("Multiply of "+a  +" and "+ f + ": "+ sum);

    }
    public static void Multiply(int a, double b,float c){
        double sum = a * b * c;
        System.out.println("Multiply of "+a +"b  "+b + " and "+ c + ": "  + sum);
    }

}
