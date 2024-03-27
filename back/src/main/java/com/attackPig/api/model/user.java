package com.attackPig.api.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString(exclude = {"id"})
@Getter
@Setter
@Entity(name="users")
public class User {
    @Id
    @Column(name="id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username; //login id
    private String job; 
    private String lv;
    private String ap; //attack
    private String hp;
    private String luck; //random up

    @OneToMany(mappedBy = "user")
    private List<Skil> skil;   


    @Builder(builderClassName = "builder")
    public User(Long id, String username, String job, String lv, String ap, String hp,
                  String luck){
        this.id = id;
        this.username = username;
        this.job = job;
        this.lv = lv;
        this.ap = ap;
        this.hp = hp;
        this.luck = luck;
        }
}
