package org.launchcode.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by estel on 7/20/2017.
 */
@Entity
public class Menu {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min = 3, max = 15, message = "Name must be between 3 and 15 characters.")
    private String name;

    @ManyToMany
    @JoinColumn(name = "menu_id")
    private List<Cheese> cheeses = new ArrayList<>();

    public void addItem(Cheese item){
        cheeses.add(item);
    }

    public Menu() {}

    public Menu(String name){
        this.name = name;
    }



    //getters and setters
    public List<Cheese> getCheeses() {
        return cheeses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
}

