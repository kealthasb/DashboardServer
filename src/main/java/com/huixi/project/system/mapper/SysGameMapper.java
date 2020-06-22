package com.huixi.project.system.mapper;

import com.huixi.project.system.domain.SysGame;

import java.util.List;

public interface SysGameMapper
{
    /**
     * 根据条件分页查询游戏列表
     *
     * @return 游戏信息集合信息
     */
    public List<SysGame> selectGameList(SysGame game);

    /**
     * 通过游戏id查询游戏
     *
     * @param id 游戏id
     * @return 游戏对象信息
     */
    public SysGame selectGameById(Long id);

    /**
     * 根据平台ID查询平台所有游戏
     *
     * @param platform 平台id
     * @return 结果
     */
    public List<SysGame> selectGameByPlatform(Long platform);

    /**
     * 新增游戏信息
     *
     * @param game 游戏信息
     * @return 结果
     */
    public int insertGame(SysGame game);

    /**
     * 修改游戏信息
     *
     * @param game 游戏信息
     * @return 结果
     */
    public int updateGame(SysGame game);

    /**
     * 通过ID删除游戏
     *
     * @param id 游戏ID
     * @return 结果
     */
    public int deleteGameById(Long id);

    /**
     * 批量删除游戏信息
     *
     * @param ids 需要删除的游戏ID
     * @return 结果
     */
    public int deleteGameByIds(Long[] ids);
}
