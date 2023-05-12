package com.amrit.dbtest.service;

import com.amrit.dbtest.dto.request.AddressRequestDto;
import com.amrit.dbtest.dto.request.StudentRequestDto;
import com.amrit.dbtest.dto.response.AddressResponseDto;
import com.amrit.dbtest.dto.response.StudentResponseDto;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public interface AddressService {
    AddressResponseDto saveAddress(AddressRequestDto add);
    List<AddressResponseDto> getAllAddress();

    AddressResponseDto getAddressById(Integer id);

    Integer deleteAddressById(Integer id);

    AddressResponseDto updateAddress(Integer id, AddressRequestDto addressRequestDto);
}
