package kr.brandnew.gguream.domain.member;

import javax.persistence.Embeddable;
import lombok.Getter;

@Getter
@Embeddable
public class Wallet {

	private Integer point = 0;
}
