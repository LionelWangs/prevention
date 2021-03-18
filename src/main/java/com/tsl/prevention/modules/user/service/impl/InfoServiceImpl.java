package com.tsl.prevention.modules.user.service.impl;

import com.tsl.prevention.modules.user.entity.Info;
import com.tsl.prevention.modules.user.dao.InfoMapper;
import com.tsl.prevention.modules.user.service.IInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author Lionel
 * @since 2021-03-17
 */
@Service
public class InfoServiceImpl extends ServiceImpl<InfoMapper, Info> implements IInfoService {

}
