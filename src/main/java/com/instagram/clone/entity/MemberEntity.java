package com.instagram.clone.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
<<<<<<< HEAD
@Getter
@NoArgsConstructor
=======
@Builder
@Getter@NoArgsConstructor
>>>>>>> 62511d7e2a9964d822f215870fc45692db6768a1
@AllArgsConstructor
public class MemberEntity extends BaseTimeEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long id;

    @Column(nullable = false)
    private String nickname;

    @Column(nullable = false,unique = true)
    private String email;

    @Column(nullable = false)
    private String password;
}