package com.springbootacademy.point_of_sale.service.impl;

import com.springbootacademy.point_of_sale.dto.updatedto.ItemSaveRequestDTO;
import com.springbootacademy.point_of_sale.entity.Item;
import com.springbootacademy.point_of_sale.repo.ItemRepo;
import com.springbootacademy.point_of_sale.service.ItemService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;



@Service
public class ItemServiceIMPL implements ItemService {

    @Autowired
    public ItemRepo itemRepo;

    @Autowired
    public ModelMapper modelMapper;
    @Override
     public String saveItem(ItemSaveRequestDTO itemSaveRequestDTO) {
        Item item= modelMapper.map(itemSaveRequestDTO,Item.class);
        if(!itemRepo.existsById(item.getItemId())){
            itemRepo.save(item);
            return "Saved Item"+item.getItemName();
        }else {
             throw new DuplicateKeyException("Alredy Aded");
        }


    }
}
