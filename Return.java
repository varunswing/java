class Return{
    public static void main(String []args){
        boolean t = true;
        System.out.println("Before the return.");
        if(t) return;
        System.out.println("This won't execute.");
    }
}

/*  Break, continue and return are control statement.
    Break statement breaks the innermost loop.
    Continue statement breaks the if statement.
    Return statement returns the control to the caller.
*/