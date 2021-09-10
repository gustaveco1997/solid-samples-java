package srp.exemplo2;

public class TextPrinter {
    private final TextManipulatorInterface manipulator;

    public TextPrinter(TextManipulatorInterface manipulator) {
        this.manipulator = manipulator;
    }

    public void showInfo() {
        StringBuilder builder = new StringBuilder();
        builder.append("Words: ").append(manipulator.countWords()).append("\n");
        builder.append("Characters: ").append(manipulator.countCharacters()).append("\n");
        System.out.println(builder);
    }

    public void showText() {
        System.out.println(manipulator.getText());
    }

    public void saveOutputFile(String path) {
        FileTxtWrite fileWriter = new FileTxtWrite();
        fileWriter.save(path, manipulator);
    }
}
