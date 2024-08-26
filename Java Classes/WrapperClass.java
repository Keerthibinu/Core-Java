public class WrapperClass {
    public static void main(String[] args){
        //CONSTRUCTOR CREATING WRAPPING CLASSES
        Integer i = new Integer("10");
        System.out.println(i);//10
        Float f= new Float("10.5");
        System.out.println(f);//10.5
        Boolean b= new Boolean("10.5");
        System.out.println(b);//false
        Boolean bb= new Boolean("TRUE");
        System.out.println(bb);//true
        Boolean bbb = new Boolean("true");
        System.out.println(bbb);//true
        Boolean bbbb= new Boolean("tRue");
        System.out.println(bbbb);//true

        //UTILITY METHODS
        //String/Primitives to Wrapper
        Integer i1 = Integer.valueOf("10");
        System.out.println(i1);//10
        Integer i2 = Integer.valueOf(10);
        System.out.println(i2);//10

        Float f1 = Float.valueOf("10.5");
        System.out.println(f1);//10.5
        Double f2 = Double.valueOf(10.5);
        System.out.println(f2);//10.5

        Boolean b1 = Boolean.valueOf("TRUE");
        System.out.println(b1);//true
        Boolean b2 = Boolean.valueOf(true);
        System.out.println(b2);//true


        //String/Wrapper to Primitive
        int i3=Integer.parseInt("10");
        System.out.println(i3);
        long i4= i1.longValue();
        System.out.println(i4);//10

        float f3=Float.parseFloat("10.5");
        System.out.println(f3);//10.5
        double f4=f1.doubleValue();
        System.out.println(f4);//10.5

        boolean b3= Boolean.parseBoolean("Keerthi");
        System.out.println(b3);//false
        boolean b4=b1.booleanValue();
        System.out.println(b4);//true


        //Wrapper/Primitive to String
        String s1=Integer.toString(50);
        System.out.println(s1);//50
        String s2=Integer.toString(i1);
        System.out.println(s2);//10

        String s3=Float.toString(50.5f);
        System.out.println(s3);//50.5
        String s4=Float.toString(f1);
        System.out.println(s4);//10.5

        String s5=Boolean.toString(true);
        System.out.println(s5);//true
        String s6=Boolean.toString(b1);
        System.out.println(s6);//true


        //AUTO BOXING
        Integer ii=10;
        System.out.println(ii);//10
        Character cc='a';
        System.out.println(cc);//a
        Boolean o=true;
        System.out.println(o);//true

        //AUTO UNBOXING
        int iii=ii;
        System.out.println(iii);//10
        char ccc=cc;
        System.out.println(ccc);//a
        boolean oo=o;
        System.out.println(oo);//true
    }
}