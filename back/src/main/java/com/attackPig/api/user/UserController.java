package com.attackPig.api.user;

import java.lang.reflect.Member;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.attackPig.api.Enum.Messenger;
import com.attackPig.api.model.User;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserRepository repo;
   
    @PostMapping(path = "/api/join")
    public Map<String,?> join(@RequestBody Map<String,?>reqmap){
        repo.save(User.builder()
        .username((String) reqmap.get("username"))
        .job((String)reqmap.get("job"))
        .lv((String)reqmap.get("lv"))
        .ap((String)reqmap.get("ap"))
        .hp((String)reqmap.get("hp"))
        .luck((String)reqmap.get("luck"))
        .build());

        Map<String,Messenger> resMap = new HashMap<>();
        resMap.put("message", Messenger.JOINS);

        return resMap;
   }

   public Map<String,?> login (@RequestBody Map<?,?> reqMap){
    Map<String,Messenger> resMap = new HashMap<>();

    String username = (String)reqMap.get("username");
    
    User user = repo.findByUsername("username").orElse(null);

    if(user.equals(null)){resMap.put("message", Messenger.NOTFOUNDID); return resMap;}

    resMap.put("message",
    (username.equals(user.getUsername())) ? Messenger.WELCOME : Messenger.NOTFOUNDID) ;
    return resMap;
   }
}
