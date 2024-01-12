import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class SortWordsTreeSet {

    public static String[] getStringArray(String text){

        return text.toLowerCase().split("\\s");

    }

    public static Set<String> getTreeSet(String text){

        String[] words = getStringArray(text);

        Set<String> setList = new TreeSet<>(Arrays.asList(words));

        return setList;
    }

}
