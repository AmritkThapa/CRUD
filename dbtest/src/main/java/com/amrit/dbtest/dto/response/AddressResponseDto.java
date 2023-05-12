package com.amrit.dbtest.dto.response;

import com.amrit.dbtest.entity.Address;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddressResponseDto {

    private Integer id;
    private String State;
    private String district;

    public AddressResponseDto(Address addr){
        this.id=addr.getId();
        this.State= addr.getState();
        this.district= addr.getDistrict();
    }
}
