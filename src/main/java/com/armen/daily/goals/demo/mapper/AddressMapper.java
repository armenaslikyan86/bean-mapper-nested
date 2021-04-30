package com.armen.daily.goals.demo.mapper;

import com.armen.daily.goals.demo.dto.AddressCreationRequestDto;
import com.armen.daily.goals.demo.model.Address;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;
import org.springframework.stereotype.Component;

@Component
public class AddressMapper extends ConfigurableMapper {

    protected void configure(MapperFactory mapperFactory) {
        mapperFactory.classMap(Address.class, AddressCreationRequestDto.class);
        mapperFactory.classMap(AddressCreationRequestDto.class, Address.class);
    }
}
