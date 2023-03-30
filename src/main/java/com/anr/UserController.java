package com.anr;

import com.anr.cache.UserCache;
import com.anr.cache.UserCacheRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/user-cache")
@AllArgsConstructor
public class UserController {

    private UserCacheRepository userCacheRepository;

    @PostMapping
    public UserCache saveUser(@RequestBody UserCache user){
        return userCacheRepository.save(user);
    }

    @PutMapping
    public UserCache updateUserCache(@RequestBody UserCache user){
        return userCacheRepository.save(user);
    }

    @GetMapping("/{id}")
    public Optional<UserCache> findByUserId(@PathVariable Integer id){
        return userCacheRepository.findById(id);
    }

    @GetMapping
    public Iterable<UserCache> getAllUserCache(){
        return userCacheRepository.findAll();
    }
}
