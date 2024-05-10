package com.satpalshetkar.service;

import com.satpalshetkar.dto.ListingRequestDto;
import com.satpalshetkar.dto.ListingResponseDto;
import com.satpalshetkar.mapper.ListingMapper;
import com.satpalshetkar.model.Listing;
import com.satpalshetkar.repository.ListingRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
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

    public ListingResponseDto update(Long listingId, ListingRequestDto listingRequestDto) {
        Listing temp = listingMapper.dtoToListing(listingRequestDto);
        temp.setId(listingId);
        Listing response = listingRepository.save(temp);

        return listingMapper.listingToDto(response);
    }

    public void delete(Long listingId) {
        listingRepository.deleteById(listingId);
    }

    public ListingResponseDto getListingById(Long listingId) {
        Optional<Listing> listing = listingRepository.findById(listingId);
        ListingResponseDto response = listingMapper.listingToDto(listing.get());

        return response;
    }
}
