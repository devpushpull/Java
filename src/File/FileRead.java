package File;

import java.io.*;

public class FileRead {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("Myfile.log"));
            String str;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
            System.out.println(str);
        }catch(IOException e){

        }
    }
}
