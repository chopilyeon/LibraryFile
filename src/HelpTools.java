import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class HelpTools {

    public static void joinwrite(ArrayList<Member> member) {



        try {
            String fileName= "list/joinlist.txt";

            FileOutputStream fos = new FileOutputStream(fileName,false);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            ObjectOutputStream out = new ObjectOutputStream(fos);
            ArrayList<Member> list = new ArrayList<>();


            out.writeObject(member);



            System.out.println("joinlist.txt 저장완료...");
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        }
    public static void joinwrite() {



        try {
            String fileName= "list/joinlist.txt";

            FileOutputStream fos = new FileOutputStream(fileName,false);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            ObjectOutputStream out = new ObjectOutputStream(fos);
            ArrayList<Member> list = new ArrayList<>();

            Member m1 = new Member("조재희","9503051411711","jaehee3679","4a5s6d1f2g","01029523679");
            Member m2 = new Member("조필연","6605151471611","mupo58","4a5s6d1f2g","01030703679");
            list.add(m1);
            list.add(m2);

            out.writeObject(list);



            System.out.println("joinlist.txt 저장완료...");
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }






    public static ArrayList<Member> joinread() {
        ArrayList list = null;
        try {
            String fileName = "list/joinlist.txt";
            FileInputStream fis = new FileInputStream(fileName);
            BufferedInputStream bis = new BufferedInputStream(fis);
            ObjectInputStream in = new ObjectInputStream(bis);

            list = (ArrayList)in.readObject();



            in.close();


        }catch(Exception e){
            e.printStackTrace();
        } finally {
            return list;
        }

    }


    public static void bookwrite(ArrayList<Book> book) {



        try {
            String fileName= "list/booklist.txt";

            FileOutputStream fos = new FileOutputStream(fileName,false);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            ObjectOutputStream out = new ObjectOutputStream(fos);



            out.writeObject(book);



            System.out.println("booklist.txt 저장완료...");
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static void bookwrite() {



        try {
            String fileName= "list/booklist.txt";

            FileOutputStream fos = new FileOutputStream(fileName,false);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            ObjectOutputStream out = new ObjectOutputStream(fos);
            ArrayList<Book> list = new ArrayList<>();

            Book b1 = new Book("jaehee3679","4a5s6d1f2g","없음","없음","없음","없음","대여 이력 없음");
            Book b2 = new Book("mupo58","4a5s6d1f2g","없음","없음","없음","없음","대여 이력 없음");
            list.add(b1);
            list.add(b2);

            out.writeObject(list);
            System.out.println("booklist.txt 저장완료...");

            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public static ArrayList<Book> bookread() {
        ArrayList<Book> list = null;
        try {
            String fileName = "list/booklist.txt";
            FileInputStream fis = new FileInputStream(fileName);
            BufferedInputStream bis = new BufferedInputStream(fis);
            ObjectInputStream in = new ObjectInputStream(bis);

            list = (ArrayList)in.readObject();


           // System.out.println(list);

            in.close();


        }catch(Exception e){
            e.printStackTrace();
        }finally{
            return list;
        }

    }



}
