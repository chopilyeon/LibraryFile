import java.io.Serializable;
import java.util.Objects;

public class Member implements Serializable {
    private String name;
    private String identity;
    private String id;
    private String password;
    private String phonenumber;

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", identity='" + identity + '\'' +
                ", id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(name, member.name) && Objects.equals(identity, member.identity) && Objects.equals(id, member.id) && Objects.equals(password, member.password) && Objects.equals(phonenumber, member.phonenumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, identity, id, password, phonenumber);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
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

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public Member(String name, String identity, String id, String password, String phonenumber) {
        this.name = name;
        this.identity = identity;
        this.id = id;
        this.password = password;
        this.phonenumber = phonenumber;

    }


}
