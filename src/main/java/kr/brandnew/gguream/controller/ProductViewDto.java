package kr.brandnew.gguream.controller;

import kr.brandnew.gguream.service.dto.ProductDetailDto;
import kr.brandnew.gguream.service.dto.TradingSimpleDto;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class ProductViewDto {

    private final ProductDetailDto productDetail;
    private final TradingSimpleDto tradingSimpleInfo;
}
