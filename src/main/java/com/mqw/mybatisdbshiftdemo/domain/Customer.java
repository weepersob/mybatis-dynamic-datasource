package com.mqw.mybatisdbshiftdemo.domain;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 客户表
 * </p>
 *
 * @author mqw
 * @since 2024-12-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Customer implements Serializable {


    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    private Long id;

    /**
     * 用户名
     */

    private String username;

    /**
     * 密码
     */

    private String password;

    /**
     * 手机号，确保唯一性
     */

    private String phone;

    /**
     * 邮箱
     */

    private String email;

    /**
     * 地址
     */

    private String address;

    /**
     * 用户头像路径
     */

    private String avatar;

    /**
     * 创建时间
     */

    private LocalDateTime createdTime;

    /**
     * 更新时间
     */

    private LocalDateTime updatedTime;

    /**
     * 状态：0-禁用，1-正常
     */

    private Integer status;

    /**
     * 联系人姓名
     */

    private String contactName;

    /**
     * 邮政编码
     */

    private String postcode;
}
