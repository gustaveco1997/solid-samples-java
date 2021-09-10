package srp.exemplo2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileTxtWrite {

    public void save(String path, TextManipulatorInterface manipulator) {
        save(path, manipulator.getText());
    }

    private void save(String path, String body) {
        try {
            BufferedWriter bWriter = new BufferedWriter(new FileWriter(path));
            bWriter.write(body);
            bWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
