package com.atguigu.gulimail.member.dao;

import com.atguigu.gulimail.member.entity.UmsMemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author yanxw
 * @email yanxw@gmail.com
 * @date 2024-02-10 22:49:14
 */
@Mapper
public interface UmsMemberLoginLogDao extends BaseMapper<UmsMemberLoginLogEntity> {
	
}
