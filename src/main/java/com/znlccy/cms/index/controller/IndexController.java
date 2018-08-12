package com.znlccy.cms.index.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Adminstrator
 * @date: 2018/8/12 17:17
 * @version: v.1.0.0
 * @introduce: 首页控制器
 */
@RestController
@RequestMapping(value = "/index")
@Api("CMS首页相关API")
public class IndexController {

    /**
     * Log日志
     */
    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @ApiOperation(value = "根据ID查询学生信息", notes = "查询数据库中某个学生信息")
    @ApiImplicitParam(name = "id", value = "学生ID", paramType = "path", required = true, dataType = "Integer")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public void index(@PathVariable int id) {
        logger.info("开始查询某个学生信息");
    }

}
