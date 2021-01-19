package br.com.tailwind.thrust.controllers;

import br.com.tailwind.thrust.services.InventoryService;
import br.com.tailwind.thrust.services.ItemService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InventoryController {

    private final InventoryService inventoryService;
    private final ItemService itemService;

    public InventoryController(InventoryService inventoryService, ItemService itemService) {
        this.inventoryService = inventoryService;
        this.itemService = itemService;
    }

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields("id");
    }

    @RequestMapping({"/inventory", "inventory", "inventory.html"})
    public String listInventory(Model model) {
        model.addAttribute("inventory", inventoryService.findById(1L));
        return "inventory";
    }

    @GetMapping("/item/{itemId}")
    public ModelAndView showItem(@PathVariable("itemId") Long itemId) {
        ModelAndView mav = new ModelAndView("itemDetails");
        mav.addObject(itemService.findById(itemId));
        return mav;
    }


}
