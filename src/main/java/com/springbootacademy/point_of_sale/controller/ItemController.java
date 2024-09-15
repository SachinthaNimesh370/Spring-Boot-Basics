package com.springbootacademy.point_of_sale.controller;

import com.springbootacademy.point_of_sale.dto.updatedto.ItemSaveRequestDTO;
import com.springbootacademy.point_of_sale.entity.Item;
import com.springbootacademy.point_of_sale.repo.ItemRepo;
import com.springbootacademy.point_of_sale.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/item")
@CrossOrigin
public class ItemController {
    @Autowired
    ItemService itemService;

    @PostMapping(path="/save")
    public String saveItem(@RequestBody ItemSaveRequestDTO itemSaveRequestDTO){
       String massage= itemService.saveItem(itemSaveRequestDTO);

        return massage;
    }

}
