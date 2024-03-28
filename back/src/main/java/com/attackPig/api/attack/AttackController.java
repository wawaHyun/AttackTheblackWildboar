package com.attackPig.api.attack;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3000")
public class AttackController {

    public String AttackPig() {
        return null;
    }

    public String dropItem() {
        return null;
    }

}
