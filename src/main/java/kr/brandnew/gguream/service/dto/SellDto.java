package kr.brandnew.gguream.service.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class SellDto {

    private final String size;
    private final Integer price;
    private final Integer count;
}
