package br.com.tailwind.thrust.api.controllers;

import br.com.tailwind.thrust.models.entities.Item;
import br.com.tailwind.thrust.services.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/items")
@RequiredArgsConstructor
public class ItemApiController {

    private final ItemService service;

    @GetMapping
    public ResponseEntity retrieve() {
        System.out.println("Obtendo itens...");
        List<Item> items = service.retrieve();
        return ResponseEntity.ok(items);
    }

}
