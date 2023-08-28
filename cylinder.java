package shapes;
public class cylinder extends shape{
double pie = Math.PI;
public cylinder(float rad,float height){
super(rad,height);
}
public double volume (){
return pie*(dim1*dim1)*dim2;
}



public double totalsurfacearea (){
return (2*pie*(dim1*dim1))+(2*(pie*dim1*dim2));
}


public static void main(String args[]){

}
}