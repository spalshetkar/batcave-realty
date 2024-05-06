package com.satpalshetkar.mapper;

import com.satpalshetkar.dto.ListingRequestDto;
import com.satpalshetkar.dto.ListingResponseDto;
import com.satpalshetkar.model.Listing;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public abstract class ListingMapper {
    @Mapping(source = "id", target = "id")
    @Mapping(source = "address", target = "address")
    @Mapping(source = "price", target = "price")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "area", target = "area")
    @Mapping(source = "bedrooms", target = "bedrooms")
    @Mapping(source = "bathrooms", target = "bathrooms")
    public abstract ListingResponseDto listingToDto(Listing listing);

    @Mapping(source = "address", target = "address")
    @Mapping(source = "price", target = "price")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "area", target = "area")
    @Mapping(source = "bedrooms", target = "bedrooms")
    @Mapping(source = "bathrooms", target = "bathrooms")
    public abstract Listing dtoToListing(ListingRequestDto dto);
}
