package com.dclmsback.sys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 公司表
 * </p>
 *
 * @author bail
 * @since 2023-04-14
 */
@TableName("sys_company")
public class Company implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 公司ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 公司名称
     */
    private String companyName;

    /**
     * 联系人姓名
     */
    private String contactsName;

    /**
     * 联系人电话
     */
    private Long contactsPhone;

    /**
     * 是否删除
     */
    private Integer isDeteled;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public String getContactsName() {
        return contactsName;
    }

    public void setContactsName(String contactsName) {
        this.contactsName = contactsName;
    }
    public Long getContactsPhone() {
        return contactsPhone;
    }

    public void setContactsPhone(Long contactsPhone) {
        this.contactsPhone = contactsPhone;
    }
    public Integer getIsDeteled() {
        return isDeteled;
    }

    public void setIsDeteled(Integer isDeteled) {
        this.isDeteled = isDeteled;
    }

    @Override
    public String toString() {
        return "Company{" +
            "id=" + id +
            ", companyName=" + companyName +
            ", contactsName=" + contactsName +
            ", contactsPhone=" + contactsPhone +
            ", isDeteled=" + isDeteled +
        "}";
    }
}
