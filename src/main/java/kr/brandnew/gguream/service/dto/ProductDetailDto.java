package kr.brandnew.gguream.service.dto;

import kr.brandnew.gguream.domain.category.Category;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class ProductDetailDto {

    private String name;
    private String code;
    private List<String> images;
    private List<Category> categories;
    private Integer recentPrice;
    private Integer releasePrice;
    private Boolean marked;
}
