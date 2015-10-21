package com.vynipox.glm;

        import java.io.BufferedReader;
        import java.io.FileNotFoundException;
        import java.io.FileReader;
        import java.io.IOException;

/**
 * Created by USER on 22.10.2015.
 */
public class FileReaderClass {

    public String fileReaderMeth() {
        String sc = null;
        try  {
            BufferedReader br = new BufferedReader(new FileReader("Test.txt"));

            while ((sc = br.readLine()) != null) {
                System.out.println(sc);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sc;
    }
}
