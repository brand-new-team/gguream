package kr.brandnew.gguream.domain.product;

import kr.brandnew.gguream.domain.common.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Buy extends BaseTimeEntity {

    @Id
    @Column(name = "buy_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long productId;

    private ProductSize productSize;

    private Long memberId;

    private Integer price;

    private Status status;

}
