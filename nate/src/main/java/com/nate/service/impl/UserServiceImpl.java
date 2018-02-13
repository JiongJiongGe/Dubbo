package com.nate.service.impl;

import com.api.domain.UserDto;
import com.api.response.RpcResult;
import com.nate.domian.UserModel;
import com.nate.mapper.UserMapper;
import com.nate.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yunkai on 2018/2/1.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 获取用户列表
     *
     * @return
     */
    @Override
    public RpcResult<List<UserDto>> findList(){
        List<UserDto> userDtos = new ArrayList<UserDto>();
        List<UserModel> users = userMapper.queryList();
        if(users != null && users.size() > 0){
            for(UserModel user : users){
                UserDto dto = new UserDto();
                BeanUtils.copyProperties(user, dto);
                userDtos.add(dto);
            }
        }
        return RpcResult.ofSuccess(userDtos);
    }
}
