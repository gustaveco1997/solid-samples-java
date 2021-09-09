package srp.exemplo2;

import java.io.File;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class TextManipulator implements TextManipulatorInterface {

    private String text;

    public TextManipulator(final File file) {
        this.text = new FileTxtReader(file).getStringText();
    }

    public TextManipulator(final String text) {
        this.text = text;
    }

    @Override
    public void replaceWord(String word, String to) {
        this.text = text.replace(word, to);
    }

    @Override
    public int countWords() {
        return this.text.split(" ").length;
    }

    @Override
    public int countCharacters() {
        return text.replace(" ", "")
                .replace("\n", " ")
                .length();
    }

    @Override
    public String getText() {
        return this.text;
    }
}
