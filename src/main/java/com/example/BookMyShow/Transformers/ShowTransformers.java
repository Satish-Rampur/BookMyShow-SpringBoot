package com.example.BookMyShow.Transformers;

import com.example.BookMyShow.Models.Show;
import com.example.BookMyShow.RequestDtos.AddShowRequest;

public class ShowTransformers {

    public static Show convertAddRequestToEntity(AddShowRequest addShowRequest){

        Show showObj = Show.builder().showDate(addShowRequest.getShowDate())
                .showTime(addShowRequest.getShowTime())
                .build();

        return showObj;
    }
}
