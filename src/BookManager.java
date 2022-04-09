import java.io.*;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class BookManager implements Serializable {
    private String bookname;
    private String uniqueNumber;
    private String writer;


    BookManager(String bookname, String uniqueNumber, String writer) {
        this.bookname = bookname;
        this.uniqueNumber = uniqueNumber;
        this.writer = writer;
    }
//-----------------------------------------------------------

    public static void bookadd () {

        try {
            String fileName = "list/bookmanager.txt";

            FileOutputStream fos = new FileOutputStream(fileName, false);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            ObjectOutputStream out = new ObjectOutputStream(bos);

            ArrayList<BookManager> list = new ArrayList<>();

            BookManager b1 = new BookManager("동백꽃", "00001", "김유정");
            BookManager b2 = new BookManager("동백꽃", "00002", "김유정");
            BookManager b3 = new BookManager("동백꽃", "00003", "김유정");
            BookManager b4 = new BookManager("죄와벌", "00004", "도스토예프스키");
            BookManager b5 = new BookManager("죄와벌", "00005", "도스토예프스키");
            BookManager b6 = new BookManager("오발탄", "00006", "이범선");
            BookManager b7 = new BookManager("오발탄", "00007", "이범선");


            list.add(b1);
            list.add(b2);
            list.add(b3);
            list.add(b4);
            list.add(b5);
            list.add(b6);
            list.add(b7);


            out.writeObject(list);


            System.out.println("bookmanager.txt 저장완료...");
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
//-----------------------------------------------------------

    public static void bookadd(ArrayList<BookManager> list) {


        try {
            String fileName = "list/bookmanager.txt";

            FileOutputStream fos = new FileOutputStream(fileName, false);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            ObjectOutputStream out = new ObjectOutputStream(fos);


            out.writeObject(list);


            System.out.println("bookmanager.txt 저장완료...");
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
//-----------------------------------------------------------------------------------------------------------


    public static void bookadd(BookManager bookmanager) {


        try {
            String fileName = "list/bookmanager.txt";
            FileOutputStream fos = new FileOutputStream(fileName,false);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            ObjectOutputStream out = new ObjectOutputStream(fos);

            ArrayList<BookManager> list = bookinfo();

            list.add(bookmanager);

            out.writeObject(list);

            System.out.println("bookmanager.txt 저장완료...");
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void bookremove(ArrayList<BookManager> list) {

        try {




            String fileName = "list/bookmanager.txt";

            FileOutputStream fos = new FileOutputStream(fileName, false);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            ObjectOutputStream out = new ObjectOutputStream(fos);
            out.writeObject(list);
            System.out.println("bookmanager.txt 저장완료...");
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


//-----------------------------------------------------------------------------------------------------------------

/*
        public static void bookremove(ArrayList<BookManager> list) {

            try {

                Scanner sc = new Scanner(System.in);
                System.out.println("제거시킬 책 이름을 입력하세요");
                String bookname = sc.nextLine();
                System.out.println("제거시킬 책의 고유번호를 입력하세요");
                String specialCode = sc.nextLine();
                System.out.println("제거시킬 책의 작가를 입력하세요");
                String writer = sc.nextLine();


                String fileName = "list/bookmanager.txt";

                FileOutputStream fos = new FileOutputStream(fileName, false);
                BufferedOutputStream bos = new BufferedOutputStream(fos);
                ObjectOutputStream out = new ObjectOutputStream(fos);
                ArrayList<BookManager> list = bookinfo();
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getBookname().equals(bookname) && list.get(i).getWriter().equals(writer)) {
                        list.remove(i);
                        System.out.println("도서 목록이 제거되었습니다");
                    }
                }
                    out.writeObject(list);
                    System.out.println("bookmanager.txt 저장완료...");
                    out.close();
                } catch(Exception e){
                    e.printStackTrace();
                }



        }


 */
//---------------------------------
    public static ArrayList<BookManager> bookinfo () {
        ArrayList list = null;
        try {
            String fileName ="list/bookmanager.txt";
            FileInputStream fis = new FileInputStream(fileName);
            BufferedInputStream bis = new BufferedInputStream(fis);
            ObjectInputStream in = new ObjectInputStream(fis);

            list = (ArrayList)in.readObject();


            System.out.println(list);

            in.close();


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        return list;
        }

    }



//----------------------------------------------------------------------------------------------------------------------
    public String getUniqueNumber () {
                return uniqueNumber;
            }

            public void setUniqueNumber (String uniqueNumber){
                this.uniqueNumber = uniqueNumber;
            }

            public String getWriter () {
                return writer;
            }

            public void setWriter (String writer){
                this.writer = writer;
            }

            @Override
            public String toString () {
                return "BookManager{" +
                        "bookname='" + bookname + '\'' +
                        ", uniqueNumber='" + uniqueNumber + '\'' +
                        ", writer='" + writer + '\'' +
                        '}';
            }

            @Override
            public boolean equals (Object o){
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                BookManager that = (BookManager) o;
                return Objects.equals(bookname, that.bookname) && Objects.equals(uniqueNumber, that.uniqueNumber) && Objects.equals(writer, that.writer);
            }

            @Override
            public int hashCode () {
                return Objects.hash(bookname, uniqueNumber, writer);
            }

            public String getBookname () {
                return bookname;
            }

            public void setBookname (String bookname){
                this.bookname = bookname;
            }




//-------------------------------------------------------------------------------------------


}









