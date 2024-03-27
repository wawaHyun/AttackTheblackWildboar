package com.attackPig.api.ready;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequiredArgsConstructor
public class ReadyController {

    public String jobSelect(int playerNum) {
        return null;
    }
    
    public String showState() {
        return null;
    }
    
    
}
