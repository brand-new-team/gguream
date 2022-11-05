package kr.brandnew.gguream.service;

import kr.brandnew.gguream.service.dto.ProductDetailDto;

public interface ProductService {

    ProductDetailDto findById(Long id);
}
