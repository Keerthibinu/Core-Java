import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileNew {
    public static void main(String[] args) throws IOException {
        File f = new File("sampledirectory","samplefile.txt");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        int count = 0;
        while(line!=null){
            String[] words = line.split(" ");
            line = br.readLine();
            count += words.length;
        }
        System.out.println(count);

    }
}
