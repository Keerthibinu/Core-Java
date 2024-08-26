import java.io.*;

public class FileMerge {
    public static void main(String[] args) throws IOException{
        merge();
        linebyline();
    }

    private static void merge() throws IOException{
        File f = new File("sampledirectory","samplefile.txt");
        PrintWriter pw = new PrintWriter(f);
        pw.println("aaa");
        pw.println("bbb");
        pw.println("ccc");
        pw.close();

        File f1 = new File("sampledirectory","test.java");
        PrintWriter pw1 = new PrintWriter(f1);
        pw1.println("111");
        pw1.println("222");
        pw1.println("333");
        pw1.close();

        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        FileReader fr1 = new FileReader(f1);
        BufferedReader br1 = new BufferedReader(fr1);

        File f2 = new File("sampledirectory","output.txt");
        PrintWriter pw2 = new PrintWriter(f2);
        String line = null;
        while((line = br.readLine()) != null){
            pw2.println(line);
        }
        while((line = br1.readLine()) != null){
            pw2.println(line);
        }
        br1.close();
        br.close();
        pw2.close();
    }
    private static void linebyline() throws IOException{
        File f = new File("sampledirectory", "samplefile.txt");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);

        File f1 = new File("sampledirectory", "test.java");
        FileReader fr1 = new FileReader(f1);
        BufferedReader br1 = new BufferedReader(fr1);

        File f3 = new File("sampledirectory", "lineByline.txt");
        PrintWriter pw2 = new PrintWriter(f3);
        String line = br.readLine();
        while (line!=null){
            line=br.readLine();
            pw2.println(line);
            line= br1.readLine();
            pw2.println(line);
        }
        br1.close();
        br.close();
        pw2.close();
    }
}
