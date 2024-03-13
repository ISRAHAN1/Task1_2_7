package Glava_2.Task_2_5_7;

public class TooLongTextAnalyzer implements TextAnalyzer {
    private final int maxLength;

    public TooLongTextAnalyzer(int maxLength) {
        this.maxLength = maxLength;
    }

    public Label processText(String text) {
        StringBuilder stringBuilder = new StringBuilder(text);
        for (int i = 0; i < text.length(); i++) {
            if (stringBuilder.substring(i).equals(" ")) {
                stringBuilder.deleteCharAt(i);
            }
        }
        if (stringBuilder.length() > maxLength) {
            return Label.TOO_LONG;
        }
        return Label.OK;

    }

    public static Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (TextAnalyzer analyzer : analyzers) {
            if (analyzer.processText(text) != Label.OK) {
                return analyzer.processText(text);
            }
        }
        return Label.OK;
    }
}
