//import static java.lang.Math.*;

public class MathDemo{
    public static void main(String[] args){
        
        //absolute value
        double x = 17.2;
        double y = -8.5;
        double x2 = 5.6;
        double y1 = -2.0;
        int z = 7;
        System.out.println(Math.abs(y));
        
        //square root something
        System.out.println(Math.sqrt(z));
        
        //use exponents
        double powerEx = Math.pow(7,5);
        System.out.println("7 to the 5th power is "+(int) powerEx);
        
        //find the sin, cos, and tan of an angle
        double raida = Math.toRadians(60);
        System.out.println("The sine of 60 raidans "+ Math.sin(raida));
        System.out.println("The cos of 60 raidians in degrees is "+Math.cos(raida));
        System.out.println("The tan of 60 raidians in degrees is "+Math.tan(raida));
           
        //area of a circle
    
        double area = (Math.PI) * x2 *x2;
        System.out.println("The area of a circle with a radius of 5.6 is "+area);
        
        
        double firstRand = Math.random();
        double secondRand = (int)(firstRand*(7+1));
        //template for getting a random number from 0 to n
        //int randInt = (int)(Math.random()*(n+1));
        
        //get a random number between 1 and 6
        int randDie = (int)(Math.random()*6+1);
        
        //templete for getting a random number from m to n;
        //Int randInt = (int)(Math.random()*(n-m+1)+m);
        //int randInt = (int)(Math.random()*(range+1)+start);
        System.out.println("A random number "+firstRand);
        
    }
}