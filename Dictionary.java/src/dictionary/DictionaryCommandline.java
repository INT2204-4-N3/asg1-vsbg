package dictionary;




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
    }
}
