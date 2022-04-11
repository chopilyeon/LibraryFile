import java.util.ArrayList;
import java.util.Scanner;

public class Withdrawal {

    public static void withdraw(){
        Scanner sc =new Scanner(System.in);
        System.out.println("아이디를 입력하세요");
        String id=sc.nextLine();
        System.out.println("비밀번호를 입력하세요");
        String password=sc.nextLine();
        System.out.println("휴대폰번호를 입력하세요");
        String phonenumber=sc.nextLine();
        ArrayList<Book> list1=HelpTools.bookread();
        ArrayList<Member> list2=HelpTools.joinread();
        for(int i=0;i<list2.size();i++){
            if((list2.get(i).getId().equals(id))&&(list2.get(i).getPassword().equals(password))&&list2.get(i).getPhonenumber().equals(phonenumber)){
                System.out.println("안전하게 탈퇴처리 되었습니다.");
                list2.remove(i);
                HelpTools.joinwrite(list2);

            }
        }
        for(int i=0;i<list1.size();i++){
            if(list1.get(i).getId().equals(id)&&list1.get(i).getPassword().equals(password)){
                list1.remove(i);
                HelpTools.bookwrite(list1);
            }
        }




    }

}
