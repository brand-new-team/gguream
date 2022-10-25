package kr.brandnew.gguream.domain.member;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nickname;

    @Embedded
    private Address address;

    private String phoneNumber;

    public static Member of(String nickname, Address address, String phoneNumber) {
        return new Member(null, nickname, address, phoneNumber);
    }

}
