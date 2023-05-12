package com.amrit.dbtest.controller;

import com.amrit.dbtest.dto.request.AddressRequestDto;
import com.amrit.dbtest.dto.response.AddressResponseDto;
import com.amrit.dbtest.service.AddressService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Api/v1/address")
public class AddressController {
    public final AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @PostMapping("/save")
    @Operation(summary = "Save Address")
    public ResponseEntity<AddressResponseDto> saveStudent(@RequestBody AddressRequestDto addr){
        return new ResponseEntity<>(addressService.saveAddress(addr), HttpStatus.ACCEPTED);
    }

    @GetMapping("/find-all")
    @Operation(summary ="Get Address" )
    public ResponseEntity<?> getAllAddress(){
        return new ResponseEntity<>(addressService.getAllAddress(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get Address By Id")
    public ResponseEntity<?> getAddressById(@PathVariable Integer id){
        return new ResponseEntity<>(addressService.getAddressById(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    @Operation(summary ="Delete Address" )
    public ResponseEntity<?> deleteAddressById(@PathVariable Integer id){
        return new ResponseEntity<>(addressService.deleteAddressById(id), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update Address")
    public ResponseEntity<?> updateAddress(@PathVariable Integer id, @RequestBody AddressRequestDto addressRequestDto){
        return new ResponseEntity<>(addressService.updateAddress(id,addressRequestDto), HttpStatus.OK);
    }
}
