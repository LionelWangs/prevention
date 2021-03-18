package com.tsl.prevention.modules.user.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 用户信息表
 * </p>
 *
 * @author Lionel
 * @since 2021-03-17
 */
@TableName("user_info")
public class Info implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 住户id
     */
    private String id;

    /**
     * 住户姓名
     */
    private String userName;

    /**
     * 用户头像
     */
    private String imgUrl;

    /**
     * 住户状态1.正常2.隔离中
     */
    private Integer state;

    /**
     * 住户详细地址
     */
    private String adress;

    /**
     * 是否接种疫苗1：已接种 2：未接种 3：已预约 
     */
    @TableField("vaccineState")
    private Integer vaccinestate;

    /**
     * 住户是否是外来1.是 2.不是
     */
    private Integer type;

    private LocalDateTime createtime;

    private LocalDateTime updatetime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Integer getVaccinestate() {
        return vaccinestate;
    }

    public void setVaccinestate(Integer vaccinestate) {
        this.vaccinestate = vaccinestate;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public LocalDateTime getCreatetime() {
        return createtime;
    }

    public void setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
    }

    public LocalDateTime getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(LocalDateTime updatetime) {
        this.updatetime = updatetime;
    }

    @Override
    public String toString() {
        return "Info{" +
        "id=" + id +
        ", userName=" + userName +
        ", imgUrl=" + imgUrl +
        ", state=" + state +
        ", adress=" + adress +
        ", vaccinestate=" + vaccinestate +
        ", type=" + type +
        ", createtime=" + createtime +
        ", updatetime=" + updatetime +
        "}";
    }
}
