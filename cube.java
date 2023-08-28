package shapes;
public class cube extends shape{

public cube(float side ){
super(side,-1);
}

float volume(){
return dim1*dim1*dim1;
}


float surfacearea(){
return 6*(dim1*dim1);
}


public static void main(String args[]){




}
}