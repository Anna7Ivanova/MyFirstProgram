package exceptions;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReader {
    public static void readFile(String filename) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(filename);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
        String tmp = null;
        while ((tmp = bufferedReader.readLine()) != null) {
            System.out.println(tmp);
        }
        bufferedReader.close();
        fileInputStream.close();

    }
    //example of catching and throwing new different exceptions
        public static int divide2Numbers(int a, int b) throws CustomException{
        try{
            return a/b;
        }catch (ArithmeticException e){
            //throwing new custom exception
            throw new CustomException(e.getMessage() + " is not possible in this universe!");
        }

        }
}
