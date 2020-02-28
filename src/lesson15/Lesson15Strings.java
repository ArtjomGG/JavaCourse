package lesson15;

import java.util.Arrays;
import java.util.List;

public class Lesson15Strings {

    public static void main(String[] args) {
        String string1 = new String("str");
        String string2 = new String("str");
        System.out.println(string1 == string2); // sravnivaet ss6lki na object6 i napechatet FALSE
        System.out.println(string1.compareTo(string2)); // sravnivaet i kakaja iz nih bolshe. Sopostavit po simvolam i dline i v6vedt chisli -, 0 ili +
        System.out.println(string1.equals(string2)); // sravnevaet sodershimoe
// Comment from Remote
        System.out.println("*****************************************************");

        String string11 = new String("AAAb");
        String string12 = new String("AAAB");
        System.out.println(string11 == string12); // sravnivaet ss6lki na object6 i napechatet FALSE
        System.out.println(string11.compareTo(string12)); // sravnivaet i kakaja iz nih bolshe. Sopostavit po simvolam i dline i v6vedt -, 0 ili +
        System.out.println(string11.equals(string12)); // sravnevaet sodershimoe
        System.out.println("Ignore case: " + string11.equalsIgnoreCase(string12)); // ignoriruet "CASE" - Bolshie ili malen'kie bukv6 (
        System.out.println("*****************************************************");

        String string21 = "AAA"; // object inicilisiruetsja v "String Pool" ( kak CASHE), dlja b6strogo dostupa i oba ukaz6vaju na odin objekt
        String string22 = "AAA";
        System.out.println(string21 == string22);

        System.out.println("******************** Immutability ********************");

        String string13 = "str"; // object inicilisiruetsja v "String Pool" ( kak CASHE), dlja b6strogo dostupa i oba ukaz6vaju na odin objekt
        string13 = string13 + "^" + "New Stroke " + string21; // String pomenjat' nelsja - nelsja konketenirovat'
        System.out.println("After concentration" + string13);

        System.out.println("StringBuilder *****************************************************");
        StringBuilder strBuildr = new StringBuilder(string13);
        for (int i = 0; i < 30; i++) {
            strBuildr.append("WTFCK " + i);
        }
        System.out.println(strBuildr.toString());

        // Trim
        System.out.println(" Trim *****************************************************");
        String strToTrim = "            Artjom Guguljan Java Course            ";
        System.out.println("\"" + strToTrim + "\""); // "\"" ekriniruet, chtob6 v6vesti "" v pechat'
        System.out.println("\"" + strToTrim.trim() + "\""); // obrezaet nachalo i konec String-a
        System.out.print("New line symbol: \n");
        System.out.print("New line symbol: \n");

        // Char at, index of
        System.out.println("Char at, index of *****************************************************");
        String forCharAt = "ABCDEFG";
        System.out.println("3 char at in " + forCharAt + " : " + forCharAt.charAt(3));
        System.out.println("CD Index of in " + forCharAt + " : " + forCharAt.indexOf("CD"));
        System.out.println("CD Index of in " + forCharAt + " : " + forCharAt.indexOf("Z"));

        // SubString
        System.out.println("SubString *****************************************************");
        String subString = "Hello Nikole!";
        System.out.println("Person name " + subString.substring(6, 9));
        System.out.println("Person name " + subString.substring(6));

        //Replace
        System.out.println("Replace *****************************************************");
        String forReplace = "AAABBBCCC";
        System.out.println("Before replace: " + forReplace);
        System.out.println("After replace: " + forReplace.replace('B', '0'));

        //Contains
        System.out.println("Contains *****************************************************");
        String forContains = "ABCDE";
        System.out.println(forContains + "contains A: " + forContains.contains("A"));
        System.out.println(forContains + "contains CD: " + forContains.contains("CD"));
        System.out.println(forContains + "contains CX: " + forContains.contains("CX"));
        System.out.println(forContains + "contains CE: " + forContains.contains("CE"));

        //Start with
        System.out.println("Start with *****************************************************");
        String forStartsWith = "ABCDEFG";
        System.out.println(forStartsWith + "strat with A: " + forStartsWith.startsWith("A"));
        System.out.println(forStartsWith + "strat with B: " + forStartsWith.startsWith("B"));

        //Split
        System.out.println("Split *****************************************************");
        String forSplit = "Hello-my-friend!";
        String[] split = forSplit.split("-"); // ubiraet "-" i vozvrashet list
        List<String> listStr = Arrays.asList(split);

        listStr.forEach(w -> System.out.println(w));
        System.out.println("/////");
        listStr.forEach(System.out::println);
        System.out.println("/////");

        listStr.stream().map(w -> w.length()).forEach(System.out::println);
        listStr.stream().map(String::length).forEach(System.out::println);


        System.out.println("TASK *******************************************");

        /*1. Assume we have a method processString(String sentence) {...},
        you need to implement logic for:

        - Print out words which start from "a"
                - Print out words which end from "j"
                - Convert all words that start from "L" to upper case and
        to lower case that contains "T"
        2. Replace in the String all ":" by ";".
                Calculate a quantity of such replacements.
        3. Assume that we have sentence, which contains "(" and ")".
                Print out content that enclosed in brackets.
        4. Assume that we have sentence, print out words that start and end
        from the same letter.

        1. Assume that we have sentence, find and print the longest and shortest words.
        2. Assume we have a sentence, calculate the number of some symbol that comes from method parameter in the last word.

        */


        String sentence = "Artjom Gardej Anton Matvej Andrei Timofej";
        String[] splitSentence = sentence.split(" ");
        List<String> listSentence = Arrays.asList(splitSentence);
        listSentence.forEach(System.out::println);

        System.out.println("Starts with A **************************");

        listSentence.stream().filter(w -> w.startsWith("A") || w.startsWith("a"))
                .forEach((System.out::println));

        System.out.println("Ends with j **************************");

        listSentence.stream().filter(w -> w.endsWith("J") || w.endsWith("j"))
                .forEach((System.out::println));

        System.out.println("Starts with A to Lower**************************");

        listSentence.stream().filter(w -> w.startsWith("A"))
                .map(String::toLowerCase)
                .forEach(System.out::println);

        System.out.println("contains T to UPPER **************************");

        listSentence.stream().filter(w -> w.contains("t"))
                .map(String::toUpperCase)
                .forEach(System.out::println);

        System.out.println(changerForSentence("Hello : Who are you : .... ::: "));
        System.out.println(replacer("Hello : Who are you : .... ::: "));
        findSMTH("Me and You", "and");
        findWordsStarEndsSameChar("Abba, mamma, amma", "a");

        System.out.println("Git Try*****************************************************");


    }

    public static String changerForSentence(String stringForChange) {
        String chengeInSntence = stringForChange.replace(':', ';');
        return chengeInSntence;
    }

    public static String replacer(String stringForChange) {
        System.out.println(spliterator(stringForChange, "").stream().filter(s -> s.equals(":")).count());
        return stringForChange.replace(':', ';');
    }

    public static List<String> spliterator(String string, String regexp) {
        String[] split = string.split(regexp);
        return Arrays.asList(split);
    }

    public static void findSMTH(String stringForFind, String needTofind) {
        boolean findInSentence = stringForFind.contains(needTofind);
        System.out.println(findInSentence);
    }

    public static void findWordsStarEndsSameChar (String stringForFind, String lookUp) {
        String setanceTowords = stringForFind;
        boolean findSameStartEnd = stringForFind.startsWith(lookUp)&stringForFind.endsWith(lookUp);
        System.out.println(findSameStartEnd);
    }


    //git config --global user.email "artjom.gg@gmail.com"
    //git config --global user.name "ArtjomGG"

}

