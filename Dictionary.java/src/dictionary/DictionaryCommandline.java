package dictionary;


import java.util.Scanner;

public class DictionaryCommandline {
    DictionaryManagement doanxem = new DictionaryManagement();


    public void  showAllWords(){

        System.out.println("No\t|"+"EngLish\t|"+"Vietnamese\t|");
        for(int i = 0; i< doanxem.list.word.size(); i++){
            System.out.println(i+"\t|"+ doanxem.list.word.get(i).word_target+"\t|"+ doanxem.list.word.get(i).word_explain);
        }

    }
    public void dictionaryBasic() {
        //doanxem.insertFromCommandline();
//        doanxem.insertFromFile();
//        showAllWords();
//        doanxem.editformfile();
//        showAllWords();
        //dictionaryLookup();
    }
    public void dictionaryLookup() {
        System.out.println("Nhập từ cần tìm: ");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        boolean x=false;
        for(int i = 0; i< doanxem.list.word.size(); i++){
            if(word.equals(doanxem.list.word.get(i).word_target)){
                System.out.println("Tìm thấy từ: ");
                System.out.println(doanxem.list.word.get(i).word_target+"\t"+ doanxem.list.word.get(i).word_explain);
                x=true;
            }
            if(word.equals(doanxem.list.word.get(i).word_explain)){
                System.out.println("Tìm thấy từ: ");
                System.out.println(doanxem.list.word.get(i).word_target+"\t"+ doanxem.list.word.get(i).word_explain);
                x=true;
            }
        }
        if(x==false){
            System.out.println("Không thấy từ cần tìm ");
    }}
    public void  dictionarySearcher() {
        System.out.println("nhap tu can tra phien ban 2: ");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        for (int i = 0; i < doanxem.sl; i++) {
            if (doanxem.list.word.get(i).word_target.startsWith(word)) {
                System.out.println(doanxem.list.word.get(i).word_target);
            }
        }
    }
    public void dictionaryAdvanced(){
        int n,m;
        doanxem.insertFromFile();
        do {
            System.out.println("1:Thêm từ\n2:sửa từ\n3:xóa từ\n4:hiển thị từ\n5:tìm kiếm từ\n6:Thoát\nNhập lựa chọn: ");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            switch (n) {
                case 1:
                    doanxem.insertFromCommandline();
                    break;
                case 2:
                    doanxem.editfromfile();
                    break;
                case 3:
                    doanxem.deleteformfile();
                    break;
                case 4:
                    showAllWords();
                    break;
                case 5:
                    dictionaryLookup();
                    break;
                case 6:
                    break;
            }
        }while (n!=6);
}}
