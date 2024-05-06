package com.satpalshetkar.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "listing")
public class Listing {
    @Id
    @SequenceGenerator(
            name = "listing_id_sequence",
            sequenceName = "listing_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "listing_id_sequence"
    )
    private Long id;
    private String address;
    private Double price;
    private String description;
    private Integer area;
    private Integer bedrooms;
    private Integer bathrooms;
}
