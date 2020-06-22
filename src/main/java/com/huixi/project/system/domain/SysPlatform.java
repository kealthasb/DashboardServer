package com.huixi.project.system.domain;

import com.huixi.framework.aspectj.lang.annotation.Excel;
import com.huixi.framework.web.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class SysPlatform extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /** 平台ID */
    @Excel(name = "平台ID", cellType = Excel.ColumnType.NUMERIC, prompt = "平台ID")
    private Long id;

    /** 平台名称 */
    @Excel(name = "平台名称")
    private String name;

    public SysPlatform()
    {

    }

    public SysPlatform(Long id)
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

    @Size(min = 0, max = 30, message = "平台名称长度不能超过30个字符")
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("name", getName())
                .toString();
    }
}
