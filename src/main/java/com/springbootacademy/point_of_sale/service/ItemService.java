package com.springbootacademy.point_of_sale.service;

import com.springbootacademy.point_of_sale.dto.updatedto.ItemSaveRequestDTO;

public interface ItemService {

    public String saveItem(ItemSaveRequestDTO itemSaveRequestDTO);

}
