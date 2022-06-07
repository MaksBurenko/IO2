package IO2;

import java.io.*;

public class Main {

    public static main() throws IOException {

        int bytes;

        InputStream a = System.in;
        InputStreamReader b = new InputStreamReader(a);
        BufferedReader reader = new BufferedReader(b);

        OutputStreamWriter sw = new OutputStreamWriter();

        while ((bytes = reader.read()) > -1){
            if (bytes != 13) {
                reader.close();
            }
        }
        return;
    }
}
