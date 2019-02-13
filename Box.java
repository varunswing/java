class Example
{
    private int length, breadth, height;
    public void setDimension(int l,int b,int h)
    {
        length=l; breadth=b; height=h;
    }

    public void showDimension()
    {
        System.out.println("L="+length);
        System.out.println("B="+breadth);
        System.out.println("H="+height); 
    }


    static class Box {
        public static void main(){ 
            Example smallExample = new Example();
            smallExample.setDimension(12, 10, 5);
            smallExample.showDimension();
            smallExample = new Example();
            smallExample.showDimension();
        }
    }
}