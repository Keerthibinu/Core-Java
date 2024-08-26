import java.io.*;
import java.util.Arrays;

class FileDemo
{
    public static void main(String[] args)throws IOException
    {
        File f=new File("samplefile.txt");
        System.out.println(f.exists());//false
        f.createNewFile();
        System.out.println(f.exists());//true

        File d=new File("sampledirectory");
        System.out.println(d.exists());//false
        d.mkdir();
        System.out.println(d.exists());//true

        File fd=new File("sampledirectory","test.java");
        fd.createNewFile();

        File d1=new File("C:/Users/Keerthi/IdeaProjects/saasvaap");
        String[] list1=d1.list();
        if(list1!=null) {
            String[] list2 = new String[list1.length];
            String[] list3 = new String[list1.length];
            int i = 0, j = 0;
            int countFile = 0;
            int countDir = 0;
            for (String s : list1) {
                File f1 = new File(d1, s);
                if (f1.isFile()) {
                    countFile += 1;
                    list2[i++] = s;
                } else if (f1.isDirectory()) {
                    countDir += 1;
                    list3[j++] = s;
                }
            }
            System.out.println(countFile + " " + Arrays.toString(list2));
            System.out.println(countDir + " " + Arrays.toString(list3));
            System.out.println(countFile + countDir);
        }
    }
}
