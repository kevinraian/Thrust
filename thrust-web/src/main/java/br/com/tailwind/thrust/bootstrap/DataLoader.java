package br.com.tailwind.thrust.bootstrap;

import br.com.tailwind.thrust.models.Inventory;
import br.com.tailwind.thrust.models.Item;
import br.com.tailwind.thrust.models.User;
import br.com.tailwind.thrust.models.enums.PartCondition;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import br.com.tailwind.thrust.services.InventoryService;
import br.com.tailwind.thrust.services.ItemService;
import br.com.tailwind.thrust.services.UserService;


import java.math.BigDecimal;

@Component
public class DataLoader implements CommandLineRunner {

    private final InventoryService inventoryService;
    private final ItemService itemService;
    private final UserService userService;

    public DataLoader(InventoryService inventoryService, ItemService itemService, UserService userService) {
        this.inventoryService = inventoryService;
        this.itemService = itemService;
        this.userService = userService;
    }

    @Override
    public void run(String... args) throws Exception {
        loadData();
    }

    private void loadData() {
        System.out.println("Inicializando dados de teste...");

        System.out.println("Criando usuário padrão...");
        User user1 = new User();
        user1.setUsername("kevinraian");
        user1.setPassword("t478403");
        userService.save(user1);
        System.out.println("Usuário criado.");

        System.out.println("Criando inventário padrão...");
        Inventory inventory1 = new Inventory();
        inventory1.setName("Tailwind");
        System.out.println("Inventário criado.");

        System.out.println("Criando itens padrões...");
        Item item1 = new Item();
        item1.setPartNumber("3011210");
        item1.setDescription("PACKING");
        item1.setPartCondition(PartCondition.NE);
        item1.setLocation("PRAT.T2-A");
        item1.setQuantity(31);
        item1.setReferencePrice(BigDecimal.valueOf(3.40));
        item1.setInventory(inventory1);
        inventory1.getItems().add(item1);

        Item item2 = new Item();
        item2.setPartNumber("AS3209-331");
        item2.setDescription("SWIVEL");
        item2.setPartCondition(PartCondition.OH);
        item2.setLocation("PRAT.T3-B");
        item2.setQuantity(7);
        item2.setReferencePrice(BigDecimal.valueOf(15.54));
        item2.setInventory(inventory1);
        inventory1.getItems().add(item2);

        Item item3 = new Item();
        item3.setPartNumber("MK4433-4433");
        item3.setDescription("INSULATION");
        item3.setPartCondition(PartCondition.SV);
        item3.setLocation("PRAT.A4-B");
        item3.setQuantity(10);
        item3.setReferencePrice(BigDecimal.valueOf(220.10));
        item3.setInventory(inventory1);
        inventory1.getItems().add(item3);

        Item item4 = new Item();
        item4.setPartNumber("722187");
        item4.setDescription("PUSCH ROD GUIDE");
        item4.setPartCondition(PartCondition.NE);
        item4.setLocation("PRAT.T3-F1");
        item4.setQuantity(1);
        item4.setReferencePrice(BigDecimal.valueOf(115));
        item4.setInventory(inventory1);
        inventory1.getItems().add(item4);

        Item item5 = new Item();
        item5.setPartNumber("951396");
        item5.setDescription("PACKING");
        item5.setPartCondition(PartCondition.NE);
        item5.setLocation("PRAT.T3-F1");
        item5.setQuantity(10);
        item5.setReferencePrice(BigDecimal.valueOf(23.6));
        item5.setInventory(inventory1);
        inventory1.getItems().add(item5);

        Item item6 = new Item();
        item6.setPartNumber("02-15777-01");
        item6.setDescription("BEARING");
        item6.setPartCondition(PartCondition.PMA);
        item6.setLocation("PRAT.T3-D3");
        item6.setQuantity(0);
        item6.setReferencePrice(BigDecimal.valueOf(300));
        item6.setInventory(inventory1);
        inventory1.getItems().add(item6);

        Item item7 = new Item();
        item7.setPartNumber("102-1541");
        item7.setDescription("FILTER INLET");
        item7.setPartCondition(PartCondition.NS);
        item7.setLocation("PRAT.A-A");
        item7.setQuantity(4);
        item7.setReferencePrice(BigDecimal.valueOf(400));
        item7.setInventory(inventory1);
        inventory1.getItems().add(item7);

        Item item8 = new Item();
        item8.setPartNumber("1310-511");
        item8.setDescription("VALVE");
        item8.setPartCondition(PartCondition.NE);
        item8.setLocation("PRAT.T3-D2");
        item8.setQuantity(1);
        item8.setReferencePrice(BigDecimal.valueOf(1560));
        item8.setInventory(inventory1);
        inventory1.getItems().add(item8);

        inventoryService.save(inventory1);
        System.out.println("Itens criados.");
        System.out.println("Os dados de testes foram inicializados com sucesso!");
    }


}
