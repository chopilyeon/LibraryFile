import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Librarymain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("======================================================================================================================================================================================================");
        System.out.println("===================================================================== 재희네도서관 ======================================================================================================================");
        System.out.println("1.회원가입");
        System.out.println("2.책 빌리기");
        System.out.println("3.책 반납");
        System.out.println("4.대출 가능한 책 목록 확인");
        System.out.println("5.비밀번호 찾기");
        System.out.println("6.(매니저만)책 입고");
        System.out.println("7.(매니저만)책 제거");
        System.out.println("8.자기 정보 보기");
        System.out.println("9.회원탈퇴");
        System.out.println("10.프로그램 종료");
        System.out.println("11.(절대 누르지 마시오.)모든 정보 초기화");
        System.out.println("12.프로그램 종료");
        System.out.println("======================================================================================================================================================================================================");
        System.out.println("======================================================================================================================================================================================================");

        ArrayList<BookManager> list=BookManager.bookinfo();
        start:
        while (true) {
            System.out.println("원하시는 항목을 클릭해주세요.");
            switch (sc.nextInt()) {
                case 1:
                    System.out.println("===================================회원 가입===================================");
                    Join.dojoin();

                    System.out.println("계속 하고 진행하고 싶으면 Y를 그만 끝내려면 N을 누르십시오.");
                    sc.nextLine();

                    if (sc.nextLine().equalsIgnoreCase("Y")) {
                        continue;
                    } else if (!sc.nextLine().equalsIgnoreCase("Y")) {
                        break start;
                    }

                case 2:
                    System.out.println("===================================책 대출===================================");
                    BookSystem.borrow();
                    System.out.println("계속 하고 진행하고 싶으면 Y를 그만 끝내려면 N을 누르십시오.");
                    sc.nextLine();
                    if (sc.nextLine().equalsIgnoreCase("Y")) {
                        continue;
                    } else if (sc.nextLine().equalsIgnoreCase("Y")) {
                        break start;
                    }


               case 3:
                   System.out.println("===================================책 반납===================================");
                    BookSystem.turnin();
                    System.out.println("계속 하고 진행하고 싶으면 Y를 그만 끝내려면 N을 누르십시오.");
                    sc.nextLine();
                    if(sc.nextLine().equalsIgnoreCase("Y")) {
                        continue;
                    }else if(!sc.nextLine().equalsIgnoreCase("Y")) {
                        break start;
                    }
                case 4:
                    System.out.println("===================================대출 가능한 책 확인===================================");
                    sc.nextLine();
                    Showinfo.showBook();
                    System.out.println("계속 하고 진행하고 싶으면 Y를 그만 끝내려면 N을 누르십시오.");
                    if(sc.nextLine().equalsIgnoreCase("Y")) {
                        continue;
                    }else if(!sc.nextLine().equalsIgnoreCase("Y")) {
                        break start;
                    }



                case 5:
                    System.out.println("===================================비밀번호 찾기===================================");
                    sc.nextLine();
                    ShowPassword.showPassword();
                    System.out.println("계속 하고 진행하고 싶으면 Y를 그만 끝내려면 N을 누르십시오.");
                    if (sc.nextLine().equalsIgnoreCase("Y")) {
                        continue;
                    } else if (!sc.nextLine().equalsIgnoreCase("Y")) {
                        break start;
                    }
                case 6:
                    System.out.println("===================================(매니저 로그인) 책 입고===================================");
                    sc.nextLine();
                    System.out.println("매니저 아이디를 입력하세요");
                    String id =sc.nextLine();
                    System.out.println("매니저 비밀번호를 입력하세요");
                    String password=sc.nextLine();
                    if(id.equals("jjhn")&&password.equals("1234")){
                        System.out.println("입고시킬 책 이름을 입력하세요");
                        String bookname = sc.nextLine();
                        System.out.println("입고시킬 책의 고유번호를 입력하세요");
                        String uniqueNumber = sc.nextLine();
                        System.out.println("입고시킬 책의 작가를 입력하세요");
                        String writer = sc.nextLine();
                        list.add(new BookManager(bookname,uniqueNumber,writer));
                        BookManager.bookadd(list);
                    }else{
                        System.out.println("틀렸습니다. 관리자가 아닙니다");
                    }
                    System.out.println("계속 하고 진행하고 싶으면 Y를 그만 끝내려면 N을 누르십시오.");
                    if (sc.nextLine().equalsIgnoreCase("Y")) {
                        continue;
                    } else if (!sc.nextLine().equalsIgnoreCase("Y")) {
                        break start;
                    }
                case 7:
                    System.out.println("===================================(매니저 로그인) 책 제거===================================");
                    sc.nextLine();
                    System.out.println("매니저 아이디를 입력하세요");
                    String id1 =sc.nextLine();
                    System.out.println("매니저 비밀번호를 입력하세요");
                    String password1=sc.nextLine();
                    if(id1.equals("jjhn")&&password1.equals("1234")){
                        System.out.println("제거시킬 책 이름을 입력하세요");
                        String bookname1 = sc.nextLine();
                        System.out.println("제거시킬 책의 고유번호를 입력하세요");
                        String uniqueNumber1= sc.nextLine();
                        System.out.println("제거시킬 책의 작가를 입력하세요");
                        String writer1 = sc.nextLine();
                        list.remove(new BookManager(bookname1,uniqueNumber1,writer1));
                        BookManager.bookremove(list);
                    }else{
                        System.out.println("틀렸습니다. 관리자가 아닙니다");
                    }

                    System.out.println("계속 하고 진행하고 싶으면 Y를 그만 끝내려면 N을 누르십시오.");
                    sc.nextLine();
                    if (sc.nextLine().equalsIgnoreCase("Y")) {
                        continue;
                    } else if (!sc.nextLine().equalsIgnoreCase("Y")) {
                        break start;
                    }


                case 8:
                    System.out.println("===================================자기 정보 보기===================================");
                    sc.nextLine();
                    Showinfo.showinformation();
                    System.out.println("계속 하고 진행하고 싶으면 Y를 그만 끝내려면 N을 누르십시오.");
                    if (sc.nextLine().equalsIgnoreCase("Y")) {
                        continue;
                    } else if (!sc.nextLine().equalsIgnoreCase("Y")) {
                        break start;
                    }



                case 9:
                    System.out.println("===================================회원 탈퇴===================================");
                    sc.nextLine();
                    Withdrawal.withdraw();
                    System.out.println("계속 하고 진행하고 싶으면 Y를 그만 끝내려면 N을 누르십시오.");
                    if (sc.nextLine().equalsIgnoreCase("Y")) {
                        continue;
                    } else if (!sc.nextLine().equalsIgnoreCase("Y")) {
                        break start;
                    }

                case 10:
                    System.out.println("===================================시스템 종료===================================");
                    System.out.println("시스템을 종료합니다");
                    break start;

                case 11:
                    System.out.println("===================================절대 주의===================================");
                    System.out.println("===================================정보 초기화 창===================================");
                    HelpTools.bookwrite();
                    HelpTools.joinwrite();
                    BookManager.bookadd();

                    System.out.println("계속 하고 진행하고 싶으면 Y를 그만 끝내려면 N을 누르십시오.");
                    sc.nextLine();
                    if (sc.nextLine().equalsIgnoreCase("Y")) {
                        continue;
                    } else if (!sc.nextLine().equalsIgnoreCase("Y")) {
                        break start;
                    }

                case 12:
                    System.out.println("===================================시스템 종료===================================");
                    break start;




                default:
                    System.out.println("잘못눌렀습니다");
                    System.out.println("계속 하고 진행하고 싶으면 Y를 그만 끝내려면 N을 누르십시오.");
                    sc.nextLine();
                    if (sc.nextLine().equalsIgnoreCase("Y")) {
                        continue start;
                    } else if (!sc.nextLine().equalsIgnoreCase("Y")) {
                        break start;
                    }

            }
            System.out.println("도서시스템을 종료합니다");

        }
    }
}