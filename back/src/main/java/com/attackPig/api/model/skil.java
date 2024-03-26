package com.attackPig.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Setter;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name="skils")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
public class skil {
    @Id
    @Column(name="sp_id", nullable = false)
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long id;
    private String spName; //이름 강한 공격 
    private String spCate; //분류 user/mob 
    private String spScp; //설명 강하게 공격한다
    private String sp;  //skil ap+20
    private String spLuk; //발동확률 (0~)10 

    @Builder(buildMethodName = "builder")
    public skil(Long id, String spName,String spScp,String sp,String spLuk){
        this.id = id;
        this.spName = spName;
        this.spScp = spScp;
        this.sp = sp;
        this.spLuk = spLuk;
    }
}
