package shapes;
public class shape{
float dim1;
float dim2;
float dim3;
public shape(float d1,float d2){
this.dim1=d1;
this.dim2=d2;

}
shape(float d1,float d2,float d3){
this.dim1=d1;
this.dim2=d2;
this.dim3=d3;

}
float getdim1(){
return dim1;
}
float getdim2(){
return dim2;
}
float getdim3(){
return dim3;
}
void setdim1(float d1){
dim1=d1;
}
void setdim2(float d2){
dim2=d2;
}
void setdim3(float d3){
dim3=d3;
}
public static void main(String args[]){



}
}