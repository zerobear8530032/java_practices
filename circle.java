package shapes;
public class circle extends shape{
double pie=Math.PI;

public circle(float rad){
super(rad,-1);

}

double area(){
return pie*dim1*dim1;
}

double circumference(){
return 2*pie*dim1;
}

float diameter (){
return dim1/2;
}
public static void main(String args[]){



}

}