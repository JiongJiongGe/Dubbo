package com.nate.mapper;

import com.nate.domian.UserModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by yunkai on 2018/2/1.
 */
@Mapper
@Component
public interface UserMapper {

    List<UserModel> queryList();
}
