package br.com.tailwind.thrust.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "inventories")
public class Inventory extends BaseEntity {
    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "inventory")
    private Set<Item> items = new HashSet<>();

    public Inventory() {
    }

    public Inventory(String name, Set<Item> items) {
        this.name = name;
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }
}
