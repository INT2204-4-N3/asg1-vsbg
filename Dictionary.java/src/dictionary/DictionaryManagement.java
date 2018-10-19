package dictionary;
import java.util.Scanner;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;


public class DictionaryManagement {
    Dictionary list = new Dictionary();
    int sl;

    public void insertFromCommandline() {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so tu: ");
        sl = input.nextInt();
        input.nextLine();
        for (int i = 0; i < sl; i++) {
            Word a = new Word();
            System.out.println("English: " + i);
            a.word_target = input.nextLine();
            System.out.println("Vietnamese: " + i);
            a.word_explain = input.nextLine();
            list.word.add(a);
        }
    }
//        for(int i=0;i<sl;i++){
//            System.out.println(i+"\t\t|"+list.word.get(i).word_target+"\t\t|"+list.word.get(i).word_explain);
//        }}

    public void insertFromFile() {
        try {
            File file = new File("dictionaries.txt");
            FileReader filereader = new FileReader(file);
            BufferedReader br = new BufferedReader(filereader);
            String line;
            String[] part;

            while ((line = br.readLine()) != null) {
                Word a = new Word();
                part = line.split("\t");
                a.word_target = part[0];
                a.word_explain = part[1];
                list.word.add(a);
            }
            filereader.close();
            br.close();
        } catch (Exception e) {
        }
    }

    public void editfromfile() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập từ cần sửa");
        String edit = sc.nextLine();
        boolean x = false;
        for (int i = 0; i < list.word.size(); i++) {
            if (edit.equals(list.word.get(i).word_target)) {
                System.out.println("Tìm thấy từ cần sửa\nNhập từ thay thế ");
                String rep = sc.nextLine();
                list.word.get(i).word_target = rep;
                System.out.println("Thay thế từ thành công" + rep);
                x=true;
            }
            if (edit.equals(list.word.get(i).word_explain)) {
                System.out.println("Tìm thấy từ cần sửa\nNhập từ thay thế ");
                String rep = sc.nextLine();
                list.word.get(i).word_explain = rep;
                System.out.println("Thay the e thanh cong" + rep);
                x=true;
            }
        }
        if(x=false){
            System.out.println("Không tìm thấy từ cần tra ");
        }
    }
    public void deleteformfile(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap tu can xoa: ");
            String del = sc.nextLine();
            for (int i = 0; i< list.word.size(); i++)
                if (del.equals(list.word.get(i).word_target)) {
                    list.word.remove(i);
                    System.out.println("xoa thanh cong "+ del);
                    break;
                }
    }}





