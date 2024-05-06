package com.satpalshetkar.controller;

import com.satpalshetkar.dto.ListingRequestDto;
import com.satpalshetkar.dto.ListingResponseDto;
import com.satpalshetkar.service.ListingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/listing")
@CrossOrigin(origins = "*")
public record ListingController(ListingService listingService) {

    @PostMapping
    public @ResponseBody ListingResponseDto createListing(@RequestBody ListingRequestDto listingRequestDto) {
        return listingService.save(listingRequestDto);
    }

    @GetMapping
    public @ResponseBody List<ListingResponseDto> getAllListings() {
        return listingService.getAllListings();
    }
}
