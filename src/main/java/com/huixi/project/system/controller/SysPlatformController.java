package com.huixi.project.system.controller;

import com.huixi.common.utils.StringUtils;
import com.huixi.framework.aspectj.lang.annotation.Log;
import com.huixi.framework.aspectj.lang.enums.BusinessType;
import com.huixi.framework.web.controller.BaseController;
import com.huixi.framework.web.domain.AjaxResult;
import com.huixi.framework.web.page.TableDataInfo;
import com.huixi.project.system.domain.SysGame;
import com.huixi.project.system.domain.SysPlatform;
import com.huixi.project.system.service.ISysPlatformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 平台管理
 *
 * @author ruoyi
 */
@RestController
@RequestMapping("/dashboard/platforms")
public class SysPlatformController extends BaseController {
    @Autowired
    private ISysPlatformService platformService;

    /**
     * 获取平台列表
     * @return
     */
    @GetMapping("/list")
    public TableDataInfo list()
    {
        startPage();
        List<SysPlatform> list = platformService.selectPlatformList();
        return getDataTable(list);
    }

    /**
     * 根据平台id获取详细信息
     */
    @GetMapping(value = { "/", "/{platformId}" })
    public AjaxResult getGameInfo(@PathVariable(value = "platformId", required = true) Long platformId)
    {
        AjaxResult ajax = AjaxResult.success();
        if (StringUtils.isNotNull(platformId))
        {
            ajax.put(AjaxResult.DATA_TAG, platformService.selectPlatformById(platformId));
        }
        return ajax;
    }

    /**
     * 新增平台
     */
    @Log(title = "平台管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    public AjaxResult add(@Validated @RequestBody SysPlatform platform)
    {
        return toAjax(platformService.insertPlatform(platform));
    }

    /**
     * 修改平台
     */
    @Log(title = "平台管理", businessType = BusinessType.UPDATE)
    @PostMapping("/update")
    public AjaxResult edit(@Validated @RequestBody SysPlatform platform)
    {
        return toAjax(platformService.updatePlatform(platform));
    }

    /**
     * 删除平台
     */
    @Log(title = "平台管理", businessType = BusinessType.DELETE)
    @PostMapping("/delete")
    public AjaxResult remove(@RequestBody Long[] ids)
    {
        return toAjax(platformService.deletePlatformByIds(ids));
    }
}
