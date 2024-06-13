package com.ekene.travel_buddy_backend.dao.dto;

import com.ekene.travel_buddy_backend.dao.Guide;
import com.ekene.travel_buddy_backend.dao.Lodges;
import com.ekene.travel_buddy_backend.dao.Review;
import com.ekene.travel_buddy_backend.dao.Trans;
import com.ekene.travel_buddy_backend.dao.filesDto.ImageDto;
import com.ekene.travel_buddy_backend.dao.filesDto.VideoDto;
import com.ekene.travel_buddy_backend.dao.myenum.DestType;
import lombok.Data;


import java.util.List;

@Data
public class DestinationDto {
    private String name;
    private String state;
    private DestType destType;
    private String description;
    private String localLang;
    private List<ImageDto> images;
    private List<VideoDto> videos;
    private List<Lodges> availableLodges;
    private List<Guide> availableTourGuide;
    private List<Trans> trans_available;
    private List<Review> review;
}
