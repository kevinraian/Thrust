package br.com.tailwind.thrust.models.entities;

import br.com.tailwind.thrust.models.enums.ItemCodeType;
import br.com.tailwind.thrust.models.enums.ItemCondition;
import br.com.tailwind.thrust.models.enums.ItemQuantityUnit;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String code;

    @Enumerated(EnumType.STRING)
    @Column(name = "code_type")
    private ItemCodeType codeType;

    private String description;

    private Integer quantity;

    @Enumerated(EnumType.STRING)
    @Column(name = "quantity_unit")
    private ItemQuantityUnit quantityUnit;

    private String sn;

    @Enumerated(EnumType.STRING)
    @Column(name = "item_condition")
    private ItemCondition itemCondition;

    private BigDecimal price;

    @CreationTimestamp
    @Column(name = "created_at", columnDefinition = "TIMESTAMP")
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at", columnDefinition = "TIMESTAMP")
    private LocalDateTime updatedAt;

    @ManyToOne
    @JoinColumn(name = "inventory_id")
    private Inventory inventory;

}
