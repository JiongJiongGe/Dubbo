package com.nate.api;

import com.api.domain.UserDto;
import com.api.response.RpcResult;
import com.api.service.APIUserService;
import com.nate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yunkai on 2018/2/5.
 */
@Service("aPIUserService")
public class APIUserServiceImpl implements APIUserService {

    @Autowired
    private UserService userService;

    /**
     * 获取用户列表
     *
     * @return
     */
    public RpcResult<List<UserDto>> findList() {
        return userService.findList();
    }
}
