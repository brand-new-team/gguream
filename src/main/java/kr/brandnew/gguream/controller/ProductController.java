package kr.brandnew.gguream.controller;

import kr.brandnew.gguream.common.BaseResponse;
import kr.brandnew.gguream.service.ProductService;
import kr.brandnew.gguream.service.TradingService;
import kr.brandnew.gguream.service.dto.ProductDetailDto;
import kr.brandnew.gguream.service.dto.TradingSimpleDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;
    private final TradingService tradingService;

    @GetMapping("/api/product/{id}")
    public BaseResponse<ProductDetailDto> findById(@PathVariable Long id) {
        ProductDetailDto productDetailDto = productService.findById(id);
        TradingSimpleDto tradingSimpleDto = tradingService.findById(id);
        ProductViewDto productViewDto = new ProductViewDto(productDetailDto, tradingSimpleDto);
        return new BaseResponse("code", "message", productViewDto);
    }
}
