import java.util.ArrayList;
import java.util.Scanner;

public class ShowPassword{


    public static void showPassword() {

        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 입력해주세요");
        String name = sc.nextLine();
        System.out.println("주민번호를 입력해주세요");
        String identity = sc.nextLine();
        ArrayList<Member> list=HelpTools.joinread();
        for(int i=0;i<list.size();i++){
            if((list.get(i).getName().equals(name))&&list.get(i).getIdentity().equals(identity)){
                System.out.println("비밀번호는 "+ list.get(i).getPassword()+"입니다");
                break;
            }
        }




    }

}









