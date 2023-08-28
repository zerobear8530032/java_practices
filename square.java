package shapes;
public class square extends shape{
 public square (float s){
super(s,-1);
}
float area(){
return (dim1*dim1);
} 
float perimeter (){
return (4*dim1);
}
public static void main(String args[]){

}
}