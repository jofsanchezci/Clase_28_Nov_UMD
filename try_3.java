class try_3 {
    public static void main(String[] args)
    {
        double a = 6;
        double b = 4;
        try{
            System.out.println(a/b);
        }catch(ArithmeticException e){
            System.out.println(
                "División por cero no es posible");
        }

    }
}