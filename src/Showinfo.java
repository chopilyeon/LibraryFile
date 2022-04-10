import java.util.ArrayList;
import java.util.Scanner;

public class Showinfo{


    public static void showinformation() {

        Scanner sc = new Scanner(System.in);
        System.out.println("아이디를 입력해주세요");
        String name = sc.nextLine();
        System.out.println("비밀번호를 입력해주세요");
        String password = sc.nextLine();
        ArrayList<Book> list=HelpTools.bookread();
        for(int i=0;i<list.size();i++){
            if((list.get(i).getId().equals(name))&&list.get(i).getPassword().equals(password)){
                System.out.println(list.get(i).getBookname()+list.get(i).getBookhistory()+list.get(i).getUniqueCode()+list.get(i).getDate()+list.get(i).getWriter());
            }
        }

    }

    public static void showBook() {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("아이디를 입력해주세요");
        String id = sc.nextLine();
        System.out.println("비밀번호를 입력해주세요");
        String password = sc.nextLine();
        ArrayList<Member> list1 = HelpTools.joinread();
        ArrayList<BookManager> list2 = BookManager.bookinfo();
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i).getId().equals(id) && list1.get(i).getPassword().equals(password)) {
                sum++;
            }
        }
        if (sum == 1) {
            for (int i = 0; i < list2.size(); i++) {
                System.out.println("=========================대출가능한 책목록===============================");
                System.out.println(list2.get(i).getBookname() + list2.get(i).getUniqueNumber() + list2.get(i).getWriter());
                System.out.println("=====================================================================");
            }
        } else {
            System.out.println("회원 정보가 일치하지 않습니다. 다시 확인해주세요.");
        }


    }




    }








