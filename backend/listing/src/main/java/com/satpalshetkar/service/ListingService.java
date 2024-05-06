package com.satpalshetkar.service;

import com.satpalshetkar.dto.ListingRequestDto;
import com.satpalshetkar.dto.ListingResponseDto;
import com.satpalshetkar.mapper.ListingMapper;
import com.satpalshetkar.model.Listing;
import com.satpalshetkar.repository.ListingRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public record ListingService(ListingRepository listingRepository, ListingMapper listingMapper) {

    public ListingResponseDto save(ListingRequestDto listingRequestDto) {
        Listing listing = listingMapper.dtoToListing(listingRequestDto);
        Listing response = listingRepository.save(listing);

        return listingMapper.listingToDto(response);
    }

    public List<ListingResponseDto> getAllListings() {
        List<Listing> listings = listingRepository.findAll();
        return listings.stream()
                .map(listingMapper::listingToDto)
                .collect(Collectors.toList());
    }
}
