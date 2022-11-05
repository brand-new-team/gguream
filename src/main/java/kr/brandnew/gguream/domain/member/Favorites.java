package kr.brandnew.gguream.domain.member;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import lombok.Getter;

@Getter
@Embeddable
public class Favorites {

	@ElementCollection
	@CollectionTable(name = "favorite", joinColumns = @JoinColumn(name = "product_id"))
	private List<Long> favorites = new ArrayList<>();
}
