package kr.brandnew.gguream.service.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@RequiredArgsConstructor
public class TradingSimpleDto {

    private final List<TradeDto> tradeDtos;
    private final List<SellDto> sellDtos;
    private final List<BuyDto> buyDtos;
}
