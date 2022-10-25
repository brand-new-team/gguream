package kr.brandnew.gguream.domain.product;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ShoesSize {

    S_220(220), S_225(225), S_230(230), S_235(235),
    S_240(240), S_245(245), S_250(250), S_255(255),
    S_260(260), S_265(265), S_270(270), S_275(275),
    S_280(280), S_285(285), S_290(290);

    private final int size;

    void minusStock(int size) {

    }
}
