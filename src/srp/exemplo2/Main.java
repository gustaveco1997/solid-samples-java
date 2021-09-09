package srp.exemplo2;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        String projectDir = System.getProperty("user.dir");
        File file = new File(projectDir.concat("/src/srp/exemplo2/SampleFileText.txt"));
        TextManipulatorInterface txtManipulator = new TextManipulator(file);
        txtManipulator.replaceWord("Lorem", "vvv");
//        txtManipulator.replaceWord("vvv", "Lorem");

        new TextPrinter(txtManipulator).showInfo();
        new TextPrinter(txtManipulator).showText();
        new TextPrinter(txtManipulator).saveOutputFile(file.getPath());
    }
}
