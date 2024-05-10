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
@Entity
@Table(name = "listing-images")
public class ListingImages {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "listing_images_id_generator"
    )
    @SequenceGenerator(
            name = "listing_images_id_generator",
            sequenceName = "listing_images_id_generator"
    )
    private Long id;
    @ManyToOne
    @JoinColumn(name = "listing_id")
    private Listing listing;
    private String imageUrl;
}
