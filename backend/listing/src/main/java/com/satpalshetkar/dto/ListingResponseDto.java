package com.satpalshetkar.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.Year;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ListingResponseDto {
    private Long id;
    private String title;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String description;
    private Double price;
    private Integer area;
    private Integer bedrooms;
    private Integer bathrooms;
    private Year firstBuilt;
    private String status;
    private LocalDateTime createdOn;
    private Long createdBy;
    private LocalDateTime updatedOn;
    private Long updatedBy;
}
