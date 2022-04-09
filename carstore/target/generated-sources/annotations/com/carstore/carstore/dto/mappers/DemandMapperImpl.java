package com.carstore.carstore.dto.mappers;

import com.carstore.carstore.dto.DemandAdminDto;
import com.carstore.carstore.dto.DemandDto;
import com.carstore.carstore.dto.DemandDto.DemandDtoBuilder;
import com.carstore.carstore.model.Demand;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-08-23T23:59:10+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.12 (Eclipse Foundation)"
)
@Component
public class DemandMapperImpl implements DemandMapper {

    @Override
    public Demand demandDtoToDemand(DemandDto demandDto) {
        if ( demandDto == null ) {
            return null;
        }

        Demand demand = new Demand();

        demand.setId( demandDto.getId() );
        demand.setCar_id( demandDto.getCar_id() );
        demand.setName( demandDto.getName() );
        demand.setEmail( demandDto.getEmail() );
        demand.setPhone_number( demandDto.getPhone_number() );
        demand.setMessage( demandDto.getMessage() );

        return demand;
    }

    @Override
    public DemandDto demandToDemandDto(Demand demand) {
        if ( demand == null ) {
            return null;
        }

        DemandDtoBuilder demandDto = DemandDto.builder();

        demandDto.id( demand.getId() );
        demandDto.car_id( demand.getCar_id() );
        demandDto.name( demand.getName() );
        demandDto.email( demand.getEmail() );
        demandDto.phone_number( demand.getPhone_number() );
        demandDto.message( demand.getMessage() );

        return demandDto.build();
    }

    @Override
    public List<DemandDto> demandToDemandDto(List<Demand> demands) {
        if ( demands == null ) {
            return null;
        }

        List<DemandDto> list = new ArrayList<DemandDto>( demands.size() );
        for ( Demand demand : demands ) {
            list.add( demandToDemandDto( demand ) );
        }

        return list;
    }

    @Override
    public Demand demandAdminDtoToDemand(DemandAdminDto demandAdminDto) {
        if ( demandAdminDto == null ) {
            return null;
        }

        Demand demand = new Demand();

        demand.setCar_id( demandAdminDto.getCar_id() );
        demand.setName( demandAdminDto.getName() );
        demand.setEmail( demandAdminDto.getEmail() );
        demand.setPhone_number( demandAdminDto.getPhone_number() );
        demand.setMessage( demandAdminDto.getMessage() );

        return demand;
    }

    @Override
    public DemandAdminDto demandToDemandAdminDto(Demand demand) {
        if ( demand == null ) {
            return null;
        }

        DemandAdminDto demandAdminDto = new DemandAdminDto();

        demandAdminDto.setCar_id( demand.getCar_id() );
        demandAdminDto.setName( demand.getName() );
        demandAdminDto.setEmail( demand.getEmail() );
        demandAdminDto.setPhone_number( demand.getPhone_number() );
        demandAdminDto.setMessage( demand.getMessage() );

        return demandAdminDto;
    }
}
