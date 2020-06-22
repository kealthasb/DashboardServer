package com.huixi.project.system.domain;

import com.huixi.framework.aspectj.lang.annotation.Excel;
import com.huixi.framework.web.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * 游戏对象 t_game
 *
 * @author ruoyi
 */
public class SysGame extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 游戏ID */
    @Excel(name = "游戏id", cellType = Excel.ColumnType.NUMERIC, prompt = "游戏id")
    private Long id;

    /** 平台ID */
    @Excel(name = "平台编号", type = Excel.Type.IMPORT)
    private Long platform;

    /** 平台名称 */
    @Excel(name = "平台名称", type = Excel.Type.IMPORT)
    private String platformName;

    /** 游戏名称 */
    @Excel(name = "游戏名称")
    private String name;

    /** 应用id */
    @Excel(name = "应用id")
    private String appId;

    /** 应用密钥 */
    @Excel(name = "应用密钥")
    private String appSecret;

    /** 应用key */
    @Excel(name = "应用key")
    private String appKey;

    /** 应用包名 */
    @Excel(name = "应用包名")
    private String packageName;

    public SysGame()
    {

    }

    public SysGame(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getPlatform()
    {
        return platform;
    }

    public void setPlatform(Long platform)
    {
        this.platform = platform;
    }

    public String getPlatformName()
    {
        return platformName;
    }

    public void setPlatformName(String platformName)
    {
        this.platformName = platformName;
    }

    @Size(min = 0, max = 30, message = "用户昵称长度不能超过30个字符")
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @NotBlank(message = "AppId不能为空")
    public String getAppId()
    {
        return appId;
    }

    public void setAppId(String appId)
    {
        this.appId = appId;
    }

    @NotBlank(message = "AppSecret不能为空")
    public String getAppSecret()
    {
        return appSecret;
    }

    public void setAppSecret(String appSecret)
    {
        this.appSecret = appSecret;
    }

    @NotBlank(message = "AppKey不能为空")
    public String getAppKey()
    {
        return appKey;
    }

    public void setAppKey(String appKey)
    {
        this.appKey = appKey;
    }

    @NotBlank(message = "PackageName不能为空")
    public String getPackageName()
    {
        return packageName;
    }

    public void setPackageName(String packageName)
    {
        this.packageName = packageName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("platform", getPlatform())
                .append("platformName", getPlatformName())
                .append("name", getName())
                .append("appSecret", getAppSecret())
                .append("appKey", getAppKey())
                .append("packageName", getPackageName())
                .append("appId", getAppId())
                .toString();
    }
}
