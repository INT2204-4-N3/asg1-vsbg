package dictionary;

import java.util.Scanner;

public class DictionaryManagement {
    Dictionary list = new Dictionary();
    int sl;
    public void insertFromCommandline(){
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so tu: ");
        sl=input.nextInt();
        input.nextLine();
        for(int i=0;i<sl;i++){
            Word a = new Word();
            System.out.println("English: "+i);
            a.word_target=input.nextLine();
            System.out.println("Vietnamese: "+i);
            a.word_explain=input.nextLine();
            list.word.add(a);
        }
//        for(int i=0;i<sl;i++){
//            System.out.println(i+"\t\t|"+list.word.get(i).word_target+"\t\t|"+list.word.get(i).word_explain);
//        }
    }
}
