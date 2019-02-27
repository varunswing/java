class Break{
    public static void main(String []args){
        for(int i=0; i<3; i++){
            for(int j=3; j>=0; j--){
                if(i==j)break; //Break statement breaks the innermost loop.
                System.out.println(i + " " + j);
            }
        }
    }
}