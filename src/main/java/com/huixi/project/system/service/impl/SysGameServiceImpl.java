package com.huixi.project.system.service.impl;

import com.huixi.project.system.domain.SysGame;
import com.huixi.project.system.mapper.SysGameMapper;
import com.huixi.project.system.mapper.SysUserMapper;
import com.huixi.project.system.service.ISysGameService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysGameServiceImpl implements ISysGameService {
    private static final Logger log = LoggerFactory.getLogger(SysGameServiceImpl.class);

    @Autowired
    private SysGameMapper gameMapper;
    @Override
    public List<SysGame> selectGameList(SysGame game) {
        return gameMapper.selectGameList(game);
    }

    @Override
    public SysGame selectGameById(Long id) {
        return gameMapper.selectGameById(id);
    }

    @Override
    public List<SysGame> selectGameByPlatform(Long platform) {
        return gameMapper.selectGameByPlatform(platform);
    }

    @Override
    public int insertGame(SysGame game) {
        return gameMapper.insertGame(game);
    }

    @Override
    public int updateGame(SysGame game) {
        return gameMapper.updateGame(game);
    }

    @Override
    public int deleteGameById(Long id) {
        return gameMapper.deleteGameById(id);
    }

    @Override
    public int deleteGameByIds(Long[] ids) {
        return gameMapper.deleteGameByIds(ids);
    }
}
