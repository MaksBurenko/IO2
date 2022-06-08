package IO2;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        int bytes;
        int temp;

        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader reader = new BufferedReader(isr);

        OutputStream os = System.out;
        OutputStreamWriter osw = new OutputStreamWriter(os);

        while ((bytes = reader.read()) > -1){
            if (bytes == 13) {
                if ((temp = reader.read()) == 10 ) {
                    bytes = temp;
                }
            }
            osw.write(bytes);
        }
        reader.close();
        osw.flush();
        osw.close();
    }
}
