package dictionary;


import java.util.Scanner;

public class DictionaryCommandline {
    DictionaryManagement doanxem = new DictionaryManagement();

    public void  showAllWords(){
        System.out.println("No\t|"+"EngLish\t|"+"Vietnamese\t|");
        for(int i=0;i<doanxem.sl;i++){
            System.out.println(i+"\t|"+doanxem.list.word.get(i).word_target+"\t|"+doanxem.list.word.get(i).word_explain);
        }
    }
    public void dictionaryBasic() {
        doanxem.insertFromCommandline();
        showAllWords();
        dictionaryLookup();
    }
    public void dictionaryLookup() {
        System.out.println("nhap tu can tra: ");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        for(int i=0;i<doanxem.sl;i++){
            if(word.equals(doanxem.list.word.get(i).word_target)){
                System.out.println(doanxem.list.word.get(i).word_target+"\t"+doanxem.list.word.get(i).word_explain);
            }
            if(word.equals(doanxem.list.word.get(i).word_explain)){
                System.out.println(doanxem.list.word.get(i).word_target+"\t"+doanxem.list.word.get(i).word_explain);
            }
        }
    }
}
