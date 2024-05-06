package com.satpalshetkar.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ListingResponseDto {
    private Long id;
    private String address;
    private Double price;
    private String description;
    private Integer area;
    private Integer bedrooms;
    private Integer bathrooms;
}
