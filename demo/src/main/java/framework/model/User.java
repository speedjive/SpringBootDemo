package framework.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by speedjive at 11:00 on 2018/7/5
 */
@Entity
public class User {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String name;

    public User(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
