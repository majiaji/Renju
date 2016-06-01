package com.toys.renju.service;


import com.toys.renju.service.domain.UserDO;
import org.springframework.web.socket.WebSocketSession;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by lingyao on 16/5/16.
 */
public interface IUserSessionCenter {
    public void onLine(WebSocketSession session, String userName);

    public void offLine(WebSocketSession session);

    public ConcurrentHashMap<String, UserDO> getUserMap();

    public Integer getUserCout();
}
