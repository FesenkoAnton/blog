package softuniBlog.entity;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by antfesenko on 23.03.2017.
 */
@Entity
@Table(name="users")
public class User {
    private Integer id;
    private String email;
    private String fullName;
    private String password;

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    private Set<Role> roles;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    @Column(name="email", unique = true, nullable = false)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Column(name="fullName", nullable = false)
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    @Column(name="fullName",nullable = false)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String email, String fullName, String password){
    this.email=email;
    this.password=password;
    this.fullName=fullName;
    }
    public User(){}

}
