
import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> translations;

    public DictionaryOfManyTranslations() {
        this.translations = new HashMap<>();
    }

    //method that adds new word and a translation for it
    public void add(String word, String translation) {
        //if word is new, it adds it to the translations
        this.translations.putIfAbsent(word, new ArrayList<>());
        //adds translation for the given word
        this.translations.get(word).add(translation);
    }

    //method that returns all the translations for the given word
    public ArrayList<String> translate(String word) {
        //checks if the translations contains the word that has to be translated
        //if word is not in the list, returns an empty list
        if (!this.translations.containsKey(word)) {
            return new ArrayList<>();
        }
        //returns all the translations for the given word
        return this.translations.get(word);
    }

//method that removes the translation for the given word
    public void remove(String word) {
        this.translations.remove(word);
    }
}
