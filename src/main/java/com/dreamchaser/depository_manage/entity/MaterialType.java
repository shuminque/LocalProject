package com.dreamchaser.depository_manage.entity;

import lombok.Data;

/**
 * material_type
 * 
 * @author bianj
 * @version 1.0.0 2021-05-20
 */
@Data
public class MaterialType {
    /** 版本号 */
    private static final long serialVersionUID = 5895240732960572981L;

    /* This code was generated by TableGo tools, mark 1 begin. */

    /** 类型id */
    private Integer id;

    /** 类型名称 */
    private String tname;

    /** 类型介绍 */
    private String introduce;

    /* This code was generated by TableGo tools, mark 1 end. */

    /* This code was generated by TableGo tools, mark 2 begin. */

    /**
     * 获取类型id
     * 
     * @return 类型id
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * 设置类型id
     * 
     * @param id
     *          类型id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取类型名称
     * 
     * @return 类型名称
     */
    public String getTname() {
        return this.tname;
    }

    /**
     * 设置类型名称
     * 
     * @param tname
     *          类型名称
     */
    public void setTname(String tname) {
        this.tname = tname;
    }

    /**
     * 获取类型介绍
     * 
     * @return 类型介绍
     */
    public String getIntroduce() {
        return this.introduce;
    }

    /**
     * 设置类型介绍
     * 
     * @param introduce
     *          类型介绍
     */
    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    /* This code was generated by TableGo tools, mark 2 end. */
}