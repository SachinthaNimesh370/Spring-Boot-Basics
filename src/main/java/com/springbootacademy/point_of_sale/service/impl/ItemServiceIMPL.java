package com.springbootacademy.point_of_sale.service.impl;

import com.springbootacademy.point_of_sale.dto.responce.ItemGetResponceDTO;
import com.springbootacademy.point_of_sale.dto.updatedto.ItemSaveRequestDTO;
import com.springbootacademy.point_of_sale.entity.Item;
import com.springbootacademy.point_of_sale.repo.ItemRepo;
import com.springbootacademy.point_of_sale.service.ItemService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import java.util.List;


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

    @Override
    public List<ItemGetResponceDTO> getItem(String itemName) {

        List<Item> items = itemRepo.findAllByItemNameEqualsAndActiveStateEquals(itemName,false);
        if(!items.isEmpty()){
            List<ItemGetResponceDTO> itemGetResponceDTO = modelMapper.map(items,new TypeToken<List<ItemGetResponceDTO>>(){}.getType());

            return itemGetResponceDTO;
        }else {
            throw new RuntimeException("Error");
        }


    }
}
