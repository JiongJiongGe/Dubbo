package com.api.service;

import com.api.domain.UserDto;
import com.api.response.RpcResult;

import java.util.List;

/**
 * Created by yunkai on 2018/2/1.
 */
public interface APIUserService {

    /**
     * 获取用户列表
     *
     * @return
     */
    public RpcResult<List<UserDto>> findList();
}
