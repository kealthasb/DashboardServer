package com.huixi.project.system.service.impl;

import com.huixi.project.system.domain.SysPlatform;
import com.huixi.project.system.mapper.SysPlatformMapper;
import com.huixi.project.system.service.ISysPlatformService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysPlatformServiceImpl implements ISysPlatformService {
    private static final Logger log = LoggerFactory.getLogger(SysPlatformServiceImpl.class);

    @Autowired
    private SysPlatformMapper platformMapper;

    @Override
    public List<SysPlatform> selectPlatformList() {
        return platformMapper.selectPlatformList();
    }

    @Override
    public SysPlatform selectPlatformById(Long id) {
        return platformMapper.selectPlatformById(id);
    }

    @Override
    public int insertPlatform(SysPlatform platform) {
        return platformMapper.insertPlatform(platform);
    }

    @Override
    public int updatePlatform(SysPlatform platform) {
        return platformMapper.updatePlatform(platform);
    }

    @Override
    public int deletePlatformById(Long id) {
        return platformMapper.deletePlatformById(id);
    }

    @Override
    public int deletePlatformByIds(Long[] ids) {
        return platformMapper.deletePlatformByIds(ids);
    }
}
