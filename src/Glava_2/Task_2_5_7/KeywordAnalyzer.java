package Glava_2.Task_2_5_7;

 public abstract class KeywordAnalyzer implements TextAnalyzer {
     protected abstract Label getLabel();

     protected abstract String[] getKeywords();

     public Label processText(String text) {
         TextAnalyzer[] textAnalyzers;
         textAnalyzers = new TextAnalyzer[]{new NegativeTextAnalyzer(), new SpamAnalyzer(getKeywords())};
         for (int i = 0; i < textAnalyzers.length; i++) {
             for (String spam : getKeywords()) {
                 if (text.contains(spam)) {
                     return getLabel();
                 }
             }

         }
         return Label.OK;
     }
 }
