package kr.brandnew.gguream.domain.member;

import javax.persistence.Embedded;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nickname;

    private String address;

    private String phoneNumber;

    @Embedded
    private Favorites favorites = new Favorites();

    @Embedded
    private Wallet wallet;

    public static Member of(String nickname, String address, String phoneNumber) {
        return new Member(null, nickname, address, phoneNumber, new Favorites(), new Wallet());
    }

}
