//STRING CLASS

class StringClass {
    public static void main(String[] args) {
        String s1="Keerthi Binu";
        String s2=new String("  Kiran Binu  ");
        System.out.println(s1);
        System.out.println(s2);

        byte[] b={65,66,67,68};
        String s3=new String(b);
        System.out.println(s3);

        char[] c={65,66,67,68};
        String s4=new String(c);
        System.out.println(s4);

        System.out.println(s1.charAt(3));//r
        System.out.println(s1.concat(s2));//Keerthi Binu  Kiran Binu
        System.out.println(s1.equals(s2));//False
        System.out.println(s1.equalsIgnoreCase(s1));//True
        System.out.println(s1.substring(3));//rthi Binu
        System.out.println(s1.substring(3,7));//rth
        System.out.println(s1.length());//12
        System.out.println(s1.replace('e','a'));//Kaarthi Binu
        System.out.println(s1.toLowerCase());//keerthi binu 
        System.out.println(s1.toUpperCase());//KAARTHI BINU
        System.out.println(s2.trim());//Kiran Binu
        System.out.println(s1.indexOf('e'));//1
        System.out.println(s1.lastIndexOf('e'));//2

    }
}
