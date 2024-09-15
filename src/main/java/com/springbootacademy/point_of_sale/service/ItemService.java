package com.springbootacademy.point_of_sale.service;

import com.springbootacademy.point_of_sale.dto.responce.ItemGetResponceDTO;
import com.springbootacademy.point_of_sale.dto.updatedto.ItemSaveRequestDTO;

import java.util.List;

public interface ItemService {

    public String saveItem(ItemSaveRequestDTO itemSaveRequestDTO);


    List<ItemGetResponceDTO> getItem(String itemName);
}

