package com.mooc.house.biz.mapper;

import java.util.List;

import javax.jws.soap.SOAPBinding.Use;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.mooc.house.common.model.Agency;
import com.mooc.house.common.model.User;
//import com.mooc.house.common.page.PageParams;

@Mapper
public interface AgencyMapper {
  
    List<AgencyMapper> select(Agency agency);

    int insert(AgencyMapper agency);

//    List<Use>	selectAgent(@Param("user") User user,@Param("pageParams") PageParams pageParams);

	Long selectAgentCount(@Param("user")User user);

}
