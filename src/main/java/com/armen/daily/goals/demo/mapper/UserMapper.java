package com.armen.daily.goals.demo.mapper;

import com.armen.daily.goals.demo.dto.UserCreationRequestDto;
import com.armen.daily.goals.demo.model.User;
import com.armen.daily.goals.demo.model.UserInfoDto;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;
import org.springframework.stereotype.Component;

@Component
public class UserMapper extends ConfigurableMapper {

    protected void configure(MapperFactory mapperFactory) {
        mapperFactory.classMap(User.class, UserCreationRequestDto.class).byDefault().field("address", "addressCreationRequestDto").register();
        mapperFactory.classMap(UserCreationRequestDto.class, User.class).byDefault().field("addressCreationRequestDto", "address").register();
        mapperFactory.classMap(User.class, UserInfoDto.class).byDefault().field("address.street", "street").register();
    }
}
