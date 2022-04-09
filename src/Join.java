import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Join {

    public static void dojoin() {

        ArrayList<Book> booklist=HelpTools.bookread();
        ArrayList<Member> memberlist=HelpTools.joinread();
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 입력해주세요");
        String name = sc.nextLine();
        System.out.println("주민번호를 입력해주세요");
        String identity = sc.nextLine();
        System.out.println("휴대폰번호를 -없이 입력해주세요");
        String phonenumber = sc.nextLine();
        System.out.println("아이디를 입력해주세요");
        String id = sc.nextLine();
        System.out.println("비밀번호를 입력해주세요");
        String password = sc.nextLine();
        String bookhistory = "대여 이력 없음";
        String bookname = "없음";
        String date = "없음";
        System.out.println(memberlist.get(0).getId().equals(id));
            for(int i=0;i<memberlist.size();i++){
                if((memberlist.get(i).getId()).equals(id)&&(memberlist.get(i).getPassword().equals(password))){
                    sum++;
                }
            }
            if(sum==0){
                memberlist.add(new Member(name,identity,id,password,phonenumber));
                booklist.add(new Book(id,password,"없음","없음","없음","없음","대여 이력 없음"));
                HelpTools.joinwrite(memberlist);
                HelpTools.bookwrite(booklist);
                System.out.println("회원가입이 완료되었습니다");;
            }else{
                System.out.println("이미 회원입니다");
            }

        }

    }

















