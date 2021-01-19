package br.com.tailwind.thrust.models;

import br.com.tailwind.thrust.models.enums.PartCondition;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "items")
public class Item extends BaseEntity {
    private String partNumber;
    private String description;

    @Enumerated(value = EnumType.STRING)
    private PartCondition partCondition;

    private int quantity;
    private BigDecimal referencePrice;
    private String location;

    @ManyToOne
    private Inventory inventory;

    public Item() {
    }

    public Item(String partNumber, String description, PartCondition partCondition, int quantity, BigDecimal referencePrice, String location, Inventory inventory) {
        this.partNumber = partNumber;
        this.description = description;
        this.partCondition = partCondition;
        this.quantity = quantity;
        this.referencePrice = referencePrice;
        this.location = location;

        this.inventory = inventory;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PartCondition getPartCondition() {
        return partCondition;
    }

    public void setPartCondition(PartCondition partCondition) {
        this.partCondition = partCondition;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getReferencePrice() {
        return referencePrice;
    }

    public void setReferencePrice(BigDecimal referencePrice) {
        this.referencePrice = referencePrice;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
