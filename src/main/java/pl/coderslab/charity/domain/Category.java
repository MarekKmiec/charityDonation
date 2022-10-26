package pl.coderslab.charity.domain;

import javax.persistence.*;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Category(){
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                '}';
    }
}
