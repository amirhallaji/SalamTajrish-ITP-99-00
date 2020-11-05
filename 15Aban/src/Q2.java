import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, h, r;
        a = scan.nextDouble();
        h = scan.nextDouble();
        r = scan.nextDouble();
        if(h <= a && a >= 2 * r){
            System.out.printf("%.2f", Math.PI * r * r * h);
        }
        else if (h >= a && a <= 2 * r){
            System.out.printf("%.2f", a * a * a);
        }
        else if(h >= a && a >= 2 * r){
            System.out.printf("%.2f", a * r * r * Math.PI);
        }
        else{
            System.out.printf("%.2f", a * a * h);
        }
    }
}



/*

#include <iostream>
#include <iomanip>
#include <cmath>

using namespace std ;
int main ()
{
    double a , h  , r ;
    cin>>a>>h>>r ;
    if (h<=a && a>=2*r)
    cout<<fixed<<setprecision(2)<<M_PI *r*r*h ;
    else if(h>=a && a<=2*r)
    cout<<fixed<<setprecision(2)<<a*a*a ;
    else if(h>=a && a>=2*r)
    cout<<fixed<<setprecision(2)<<a*r*r*M_PI ;
    else
    cout<<fixed<<setprecision(2)<< a*a*h;

    return 0;
}

 */
