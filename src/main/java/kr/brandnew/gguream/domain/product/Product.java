package kr.brandnew.gguream.domain.product;

import kr.brandnew.gguream.domain.common.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Product extends BaseTimeEntity {

    @Id
    @Column(name = "product_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String code;
    private Integer releasePrice;

    @ElementCollection
    @CollectionTable(name = "product_category", joinColumns = @JoinColumn(name = "product_id"))
    private List<Long> categoryIds = new ArrayList<>();

    @ElementCollection
    @CollectionTable(name = "product_image", joinColumns = @JoinColumn(name = "product_id"))
    private List<String> urls = new ArrayList<>();


}
