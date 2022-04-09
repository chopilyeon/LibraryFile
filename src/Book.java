import java.io.Serializable;
import java.util.Objects;

public class Book implements Serializable {
    private String id;
    private String password;
    private String bookname;
    private String writer;
    private String uniqueCode;
    private String date;
    private String bookhistory;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return id.equals(book.id) && password.equals(book.password) && bookname.equals(book.bookname) && writer.equals(book.writer) && uniqueCode.equals(book.uniqueCode) && date.equals(book.date) && bookhistory.equals(book.bookhistory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, password, bookname, writer, uniqueCode, date, bookhistory);
    }

    public Book(String id, String password, String bookname, String writer, String uniqueCode, String date, String bookhistory) {
        this.id = id;
        this.password = password;
        this.bookname = bookname;
        this.writer = writer;
        this.uniqueCode=uniqueCode;
        this.date = date;
        this.bookhistory = bookhistory;

    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", bookname='" + bookname + '\'' +
                ", writer='" + writer + '\'' +
                ", uniqueCode='" + uniqueCode + '\'' +
                ", date='" + date + '\'' +
                ", bookhistory='" + bookhistory + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getUniqueCode() {
        return uniqueCode;
    }

    public void setUniqueCode(String uniqueCode) {
        this.uniqueCode = uniqueCode;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getBookhistory() {
        return bookhistory;
    }

    public void setBookhistory(String bookhistory) {
        this.bookhistory = bookhistory;
    }

    public Book(String id, String password, String bookhistory) {
        this(id, password, "없음", "없음","없음","없음", "대여 이력 없음");
    }
}
