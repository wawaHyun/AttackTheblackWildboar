package com.attackPig.api.ready;

import org.springframework.data.jpa.repository.JpaRepository;

import com.attackPig.api.model.User;

public interface ReadyRepository extends JpaRepository<User,Long>{
    
}
