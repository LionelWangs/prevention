package com.tsl.prevention.modules.user.dao;

import com.tsl.prevention.modules.user.entity.Info;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户信息表 Mapper 接口
 * </p>
 *
 * @author Lionel
 * @since 2021-03-17
 */
@Mapper
public interface InfoMapper extends BaseMapper<Info> {

}
