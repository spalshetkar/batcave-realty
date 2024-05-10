package com.satpalshetkar.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.assertj.core.api.AbstractOffsetDateTimeAssert;

import java.time.LocalDateTime;
import java.time.Year;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "listing")
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
