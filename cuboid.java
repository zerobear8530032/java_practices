package shapes;
public class cuboid extends shape{

public cuboid(float l,float b,float h){
super(l,b,h);
}

float volume(){
return (dim1*dim2*dim3);
}


float surfacearea(){
return 2*((dim1*dim2)+(dim1*dim3)+(dim3*dim2));
}


public static void main(String args[]){

cuboid c= new cuboid(3.F,4.F,2.F);
System.out.println(c.volume());
System.out.println(c.surfacearea());



}
}