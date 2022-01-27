package com.example.shop.dto;

import com.example.shop.entity.ItemImg;
import lombok.Data;
import org.modelmapper.ModelMapper;

import java.io.Serializable;

@Data
public class ItemImgDto implements Serializable {
    private final Long id;
    private final String imgName;
    private final String oriImgName;
    private final String imgUrl;
    private final String repimgYn;

    private static ModelMapper modelMapper = new ModelMapper();

    public static ItemImgDto of(ItemImg itemImg){
        return modelMapper.map(itemImg, ItemImgDto.class);
    }
}
