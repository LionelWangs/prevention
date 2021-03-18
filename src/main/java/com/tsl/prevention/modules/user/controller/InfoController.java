package com.tsl.prevention.modules.user.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tsl.prevention.modules.user.entity.Info;
import com.tsl.prevention.modules.user.service.IInfoService;
import com.tsl.prevention.util.PageFilter;
import com.tsl.prevention.util.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 用户信息表 前端控制器
 * </p>
 *
 * @author Lionel
 * @since 2021-03-17
 */
@RestController
@RequestMapping("/user/info")
@Api("社区业主管理")
public class InfoController {
    @Autowired
    private IInfoService infoService;

    @ApiOperation("新增业主")
    @PostMapping("/insertUser")
    public Result insertUser(@RequestBody Info info) {
        boolean save = infoService.save(info);
        return Result.create(200, "创建成功");
    }

    @GetMapping("/selectUser")
    @ApiOperation("根据id查询用户")
    public Result selectUser(String id) {
        Info info = infoService.getById(id);
        if (info != null) {
            return Result.create(info);
        } else {
            return Result.create(500, "用户不存在");
        }
    }

    @GetMapping("/getList")
    @ApiOperation("获取指定用户列表")
    public Result getList(Page page,String type) {
        //查询是否是所有人口
        QueryWrapper<Info> queryWrapper = new QueryWrapper<>();
        if (type != null) {
            queryWrapper.eq("type",type);
        }
        IPage<Info> list = infoService.page(page, queryWrapper);
        return Result.create(list);
    }

    @PutMapping("/updateUser")
    @ApiOperation("跟新用户")
    public Result updateUser(@RequestBody Info info) {
        boolean b = infoService.updateById(info);
        return Result.create();
    }

}

