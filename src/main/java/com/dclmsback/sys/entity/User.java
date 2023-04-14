package com.dclmsback.sys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 系统用户表
 * </p>
 *
 * @author bail
 * @since 2023-04-14
 */
@TableName("sys_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户ID
     */
    private String accountNumber;

    /**
     * 密码
     */
    private String password;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 联系电话
     */
    private Long phone;

    /**
     * 状态： 0失效 1有效
     */
    private Integer status;

    /**
     * 逻辑删除：0未删除 1删除
     */
    private Integer isDeleted;

    /**
     * 创建时间
     */
    private LocalDateTime createDate;

    /**
     * 创建人ID
     */
    private Integer createUserId;

    /**
     * 更新时间
     */
    private LocalDateTime updateDate;

    /**
     * 更新人
     */
    private Integer updateUserId;

    /**
     * 删除时间
     */
    private LocalDateTime deleteDate;

    /**
     * 删除人
     */
    private Integer deleteUserId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }
    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }
    public Integer getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }
    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }
    public Integer getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(Integer updateUserId) {
        this.updateUserId = updateUserId;
    }
    public LocalDateTime getDeleteDate() {
        return deleteDate;
    }

    public void setDeleteDate(LocalDateTime deleteDate) {
        this.deleteDate = deleteDate;
    }
    public Integer getDeleteUserId() {
        return deleteUserId;
    }

    public void setDeleteUserId(Integer deleteUserId) {
        this.deleteUserId = deleteUserId;
    }

    @Override
    public String toString() {
        return "User{" +
            "id=" + id +
            ", accountNumber=" + accountNumber +
            ", password=" + password +
            ", userName=" + userName +
            ", phone=" + phone +
            ", status=" + status +
            ", isDeleted=" + isDeleted +
            ", createDate=" + createDate +
            ", createUserId=" + createUserId +
            ", updateDate=" + updateDate +
            ", updateUserId=" + updateUserId +
            ", deleteDate=" + deleteDate +
            ", deleteUserId=" + deleteUserId +
        "}";
    }
}
