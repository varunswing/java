class Shape{

        int length, breadth, height;
        Shape(int l,int b,int h){    //Parametrized constructer.
            length=l;
            breadth=b;
            height=h;
            System.out.println("Volume of cuboid is:"+(length*breadth*height));
        }    

        Shape(int a){  
            length=a;            
            System.out.println("Area of square is:"+(length*length));    
        }

        Shape(int l,int b){    
            length=l;
            breadth=b;
            System.out.println("Area of rectangle is:"+(length*breadth));    
        }
        public static void main(String[] args){
             Shape S1=new Shape(10, 10, 10);
             Shape S2=new Shape(10); 
             Shape S3=new Shape(10, 10);        
        }
}