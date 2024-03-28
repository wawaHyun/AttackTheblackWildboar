package com.attackPig.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity(name="items")
public class Item {
    @Id
    @Column(name="tem_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String temNeme;
    private String temScp;
    private String tem; //ak+10
    private String temLuk; //발동확률

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private User user;

    public Item(Long id, String temNeme, String temScp, String tem, String temLuk){
        this.id = id;
        this.temNeme = temNeme;
        this.temScp = temScp;
        this.tem = tem;
        this.temLuk = temLuk;
    }
}
