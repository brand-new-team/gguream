package kr.brandnew.gguream.service.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Getter
@RequiredArgsConstructor
public class TradeDto {

    private final String size;
    private final Integer price;
    private final LocalDateTime tradeDate;
}
