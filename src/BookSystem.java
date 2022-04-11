import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.text.SimpleDateFormat;
import java.util.*;

public class BookSystem {
    public static void borrow() {

        int login1 = 0;
        int bookborrow = 0;
        ArrayList<BookManager> managerlist = BookManager.bookinfo();
        ArrayList<Book> booklist = HelpTools.bookread();
        Scanner sc = new Scanner(System.in);
        System.out.println("아이디를 입력해주세요");
        String id = sc.nextLine();
        System.out.println("비밀번호를 입력해주세요");
        String password = sc.nextLine();
        Date today = new Date();
        String pattern = "yyyy-MM-dd hh:mm:ss(E)";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        String date = sdf.format(today);
        System.out.println(booklist.size());
        System.out.println(booklist.get(0).getId().equals(id));
        for (int i = 0; i < booklist.size(); i++) {
            System.out.println("for문 작동중");
            if (booklist.get(i).getId().equals(id) && booklist.get(i).getPassword().equals(password)) {
                login1++;
                bookborrow = i;
            }
        }
        System.out.println(login1);
        if (login1 == 0) {
            System.out.println("회원 정보가 일치하지 않습니다.");
        } else {
            System.out.println("회원입니다.");
            if (login1 != 0 && booklist.get(bookborrow).getBookhistory().equals("대여 이력 없음")) {
                System.out.println("빌리고 싶은 책을 입력하세요.");
                String bookname = sc.nextLine();
                System.out.println("빌리고 싶은 책의 작가를 입력하세요.");
                String bookwriter=sc.nextLine();
                for (int j = 0; j < managerlist.size(); j++) {
                    if (managerlist.get(j).getBookname().equals(bookname)&&managerlist.get(j).getWriter().equals(bookwriter)) {
                        booklist.add(new Book(booklist.get(bookborrow).getId(), booklist.get(bookborrow).getPassword(), bookname, managerlist.get(j).getWriter(), managerlist.get(j).getUniqueNumber(), date, "대여"));
                        booklist.remove(bookborrow);
                        managerlist.remove(j); // 리스트는 동일한 책이 있어도 맨 앞줄부터 하나씩 제거되는 걸 이용함.
                        System.out.println(bookwriter+" 작가의 "+bookname + "을 " + date + "에 대여처리하였습니다");
                        HelpTools.bookwrite(booklist);
                        BookManager.bookadd(managerlist);
                        break;
                    }
                }
            } else if (login1 != 0 && booklist.get(bookborrow).getBookhistory().equals("대여")) {
                System.out.println("이미 대여한 이력이 있습니다.");
            }
        }
    }


    public static void turnin() {

        int login1 = 0;
        int turnin = 0;
        Scanner sc = new Scanner(System.in);
        ArrayList<BookManager> managerlist = BookManager.bookinfo();
        ArrayList<Book> booklist = HelpTools.bookread();
        System.out.println("아이디를 입력해주세요");
        String id = sc.nextLine();
        System.out.println("비밀번호를 입력해주세요");
        String password = sc.nextLine();
        Date today = new Date();
        String pattern = "yyyy-MM-dd hh:mm:ss(E)";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        String date = sdf.format(today);
        System.out.println(booklist.size());
        System.out.println(booklist.get(0).getId().equals(id));
        for (int i = 0; i < booklist.size(); i++) {
            System.out.println("for문 작동중");
            if (booklist.get(i).getId().equals(id) && booklist.get(i).getPassword().equals(password)) {
                login1++;
                turnin = i;
            }
        }
        System.out.println(login1);
        if (login1 == 0) {
            System.out.println("회원 정보가 일치하지 않습니다.");
        } else {
            System.out.println("회원입니다.");
            if (login1 != 0 && booklist.get(turnin).getBookhistory().equals("대여")) {
                booklist.add(new Book(booklist.get(turnin).getId(), booklist.get(turnin).getPassword(), "없음", "없음", "없음", "없음", "대여 이력 없음"));
                managerlist.add(new BookManager(booklist.get(turnin).getBookname(), booklist.get(turnin).getUniqueCode(), booklist.get(turnin).getWriter())); // 리스트는 동일한 책이 있어도 맨 앞줄부터 하나씩 제거되는 걸 이용함.
                System.out.println(booklist.get(turnin).getWriter()+" 작가의 "+booklist.get(turnin).getBookname() + "을 " + date + "에 반납처리하였습니다");
                booklist.remove(turnin);
                HelpTools.bookwrite(booklist);
                BookManager.bookadd(managerlist);
            } else if (login1 != 0 && booklist.get(turnin).getBookhistory().equals("대여")) {
                System.out.println("이미 대여한 이력이 있습니다.");
            }
        }


    }
}







