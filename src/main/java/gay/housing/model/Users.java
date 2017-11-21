package gay.housing.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private Integer user_id;

    @Column(name = "display_name",unique = true)
    @Size(max = 200, min = 3)
    private String display_name;

    @Column(name = "first_name")
    @Size(max = 200, min = 3)
    private String first_name;

    @Column(name = "last_name")
    @Size(max = 200, min = 3)
    private String last_name;

    @Column(name = "password")
    @Size(max = 100, min = 8)
    private String password;

    public Users () {}

    public Users(Integer user_id, String display_name, String first_name, String last_name, String password) {
        this.user_id = user_id;
        this.display_name = display_name;
        this.first_name = first_name;
        this.last_name = last_name;
        this.password = password;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Users)) return false;

        Users users = (Users) o;

        if (user_id != users.user_id) return false;
        if (!display_name.equals(users.display_name)) return false;
        if (!first_name.equals(users.first_name)) return false;
        if (!last_name.equals(users.last_name)) return false;
        return password.equals(users.password);
    }

    @Override
    public int hashCode() {
        Integer result = user_id;
        result = 31 * result + display_name.hashCode();
        result = 31 * result + first_name.hashCode();
        result = 31 * result + last_name.hashCode();
        result = 31 * result + password.hashCode();
        return result;
    }
}