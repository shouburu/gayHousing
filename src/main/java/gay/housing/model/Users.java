package gay.housing.model;

import javax.persistence.*;
import java.util.Date;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private Integer user_id;

    @Column(name = "display_name")
    private String display_name;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "password")
    private String password;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at")
    private Date created_at;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "last_login")
    private Date last_login;

    public Users() {}

    public Users(Integer user_id, String display_name, String first_name, String last_name, String password, Date created_at, Date last_login){
        this.user_id = user_id;
        this.display_name = display_name;
        this.first_name = first_name;
        this.last_name = last_name;
        this.password = password;
        this.created_at = created_at;
        this.last_login = last_login;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getLast_login() {
        return last_login;
    }

    public void setLast_login(Date last_login) {
        this.last_login = last_login;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Users)) return false;

        Users users = (Users) o;

        if (!user_id.equals(users.user_id)) return false;
        if (!display_name.equals(users.display_name)) return false;
        if (first_name != null ? !first_name.equals(users.first_name) : users.first_name != null) return false;
        if (last_name != null ? !last_name.equals(users.last_name) : users.last_name != null) return false;
        if (!password.equals(users.password)) return false;
        if (created_at != null ? !created_at.equals(users.created_at) : users.created_at != null) return false;
        return last_login != null ? last_login.equals(users.last_login) : users.last_login == null;
    }

    @Override
    public int hashCode() {
        int result = user_id.hashCode();
        result = 31 * result + display_name.hashCode();
        result = 31 * result + (first_name != null ? first_name.hashCode() : 0);
        result = 31 * result + (last_name != null ? last_name.hashCode() : 0);
        result = 31 * result + password.hashCode();
        result = 31 * result + (created_at != null ? created_at.hashCode() : 0);
        result = 31 * result + (last_login != null ? last_login.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Users{" +
                "user_id=" + user_id +
                ", display_name='" + display_name + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", password='" + password + '\'' +
                ", created_at=" + created_at +
                ", last_login=" + last_login +
                '}';
    }

}