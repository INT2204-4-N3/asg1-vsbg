package dictionary;


public class Main{
    public static void main (String[] args){
        DictionaryCommandline a = new DictionaryCommandline();
        a.dictionaryBasic();
        DictionaryManagement b = new DictionaryManagement();
        b.insertFromFile();
    }
}