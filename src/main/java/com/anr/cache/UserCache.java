package com.anr.cache;

import org.springframework.data.redis.core.RedisHash;

@RedisHash(value = "userCache", timeToLive =  10L)
public record UserCache(Integer id, String name, String mobileNo, Boolean isLoggedIn) {
}
