class Box
{
    private int length, breadth, height;
    public void setDimension(int l,int b,int h)
    {
        length=l; breadth=b; height=h;
    }
        public void showDimension()
        {
            System.out.println("L="+length);
            System.out.println("b="+breadth);
            System.out.println("h="+height); 
        }
  
    }
class Example
{
    public static void main(String[] args)
    {
        Box smallBox = new Box();
        smallBox.setDimension(12, 10, 5);
        smallBox.showDimension();
        smallBox = new Box();
        smallBox.showDimension();
    }
}

