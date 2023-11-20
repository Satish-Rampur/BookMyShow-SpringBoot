package com.example.BookMyShow.RequestDtos;

import com.example.BookMyShow.Enums.City;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddTheaterRequest {

    private String name;

    private String address;

    private City city;

    private Integer noOfClassicSeats;

    private Integer noOfPremiumSeats;

    private Integer noOfSeatsPerRow;

}
