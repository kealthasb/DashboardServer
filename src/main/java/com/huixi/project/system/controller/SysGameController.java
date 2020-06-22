package com.huixi.project.system.controller;

import com.huixi.common.utils.StringUtils;
import com.huixi.framework.aspectj.lang.annotation.Log;
import com.huixi.framework.aspectj.lang.enums.BusinessType;
import com.huixi.framework.web.controller.BaseController;
import com.huixi.framework.web.domain.AjaxResult;
import com.huixi.framework.web.page.TableDataInfo;
import com.huixi.project.system.domain.SysGame;
import com.huixi.project.system.service.ISysGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 游戏管理
 *
 * @author ruoyi
 */
@RestController
@RequestMapping("/dashboard/games")
public class SysGameController extends BaseController {
    @Autowired
    private ISysGameService gameService;

    /**
     * 获取游戏列表
     * @return
     */
    @GetMapping("/list")
    public TableDataInfo list(SysGame game)
    {
        startPage();
        List<SysGame> list = gameService.selectGameList(game);
        return getDataTable(list);
    }

    /**
     * 根据游戏id获取详细信息
     */
    @GetMapping(value = { "/", "/{gameId}" })
    public AjaxResult getGameInfo(@PathVariable(value = "gameId", required = true) Long gameId)
    {
        AjaxResult ajax = AjaxResult.success();
        if (StringUtils.isNotNull(gameId))
        {
            ajax.put(AjaxResult.DATA_TAG, gameService.selectGameById(gameId));
        }
        return ajax;
    }

    /**
     * 新增游戏
     */
    @Log(title = "游戏管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    public AjaxResult add(@Validated @RequestBody SysGame game)
    {
        return toAjax(gameService.insertGame(game));
    }

    /**
     * 修改游戏
     */
    @Log(title = "游戏管理", businessType = BusinessType.UPDATE)
    @PostMapping("/update")
    public AjaxResult edit(@Validated @RequestBody SysGame game)
    {
        return toAjax(gameService.updateGame(game));
    }

    /**
     * 删除游戏
     */
    @Log(title = "用户管理", businessType = BusinessType.DELETE)
    @PostMapping("/delete")
    public AjaxResult remove(@RequestBody Long[] ids)
    {
        return toAjax(gameService.deleteGameByIds(ids));
    }
}
