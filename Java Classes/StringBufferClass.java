public class StringBufferClass {
    public static void main(String[] args){
        StringBuffer a=new StringBuffer();
        System.out.println(a.capacity());//16
        StringBuffer b=new StringBuffer("Keerthi");
        System.out.println(b.capacity());//23
        StringBuffer c=new StringBuffer(10);
        System.out.println(c.capacity());//10
        System.out.println(b.length());//7
        System.out.println(b.charAt(2));//e
        b.setCharAt(2,'a');
        System.out.println(b);//Kearthi
        System.out.println(b.append(5));//Kearthi5
        System.out.println(b.insert(3,55));//Kea55rthi5
        System.out.println(b.delete(3,5));//Kearthi5
        System.out.println(b.deleteCharAt(3));//Keathi5
        System.out.println(b.reverse());//5ihtaeK
        b.setLength(5);
        System.out.println(b);//5ihta
        b.trimToSize();
        System.out.println(b);//5ihta
        b.ensureCapacity(100);
        System.out.println(b.capacity());//100
    }
}
