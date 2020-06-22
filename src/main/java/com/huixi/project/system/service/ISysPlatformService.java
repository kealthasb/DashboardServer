package com.huixi.project.system.service;

import com.huixi.project.system.domain.SysGame;
import com.huixi.project.system.domain.SysPlatform;

import java.util.List;

public interface ISysPlatformService {
    /**
     * 根据条件分页查询平台列表
     *
     * @return 平台信息集合信息
     */
    public List<SysPlatform> selectPlatformList();

    /**
     * 通过id查询平台
     *
     * @param id 平台id
     * @return 平台对象信息
     */
    public SysPlatform selectPlatformById(Long id);

    /**
     * 新增平台信息
     *
     * @param platform 平台信息
     * @return 结果
     */
    public int insertPlatform(SysPlatform platform);

    /**
     * 修改平台信息
     *
     * @param platform 平台信息
     * @return 结果
     */
    public int updatePlatform(SysPlatform platform);

    /**
     * 通过ID删除平台
     *
     * @param id 平台ID
     * @return 结果
     */
    public int deletePlatformById(Long id);

    /**
     * 批量删除平台信息
     *
     * @param ids 需要删除的平台ID
     * @return 结果
     */
    public int deletePlatformByIds(Long[] ids);
}
