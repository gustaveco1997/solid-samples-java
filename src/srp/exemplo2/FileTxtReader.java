package srp.exemplo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.util.Scanner;

public class FileTxtReader {
    private final File file;

    public FileTxtReader(File file) {
        this.file = file;
    }

    public String getStringText() {
        return convertSimple();
    }

    private String convertSimple() {
        String dados = "";
        try {
            dados = new String(Files.readAllBytes(file.toPath()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return dados;
    }

    private String convertWithScanner() {
        StringBuilder text = new StringBuilder();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine())
                text.append(scanner.nextLine());
            scanner.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return text.toString();
    }
}
