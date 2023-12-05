package com.nageoffer.shortlink.admin.dto.req;

import lombok.Data;

/**
 * 短链接分组创建参数
 */
@Data
public class ShortLinkGroupUpdateReqDTO {

    /**
     * 分组表示
     */
    private String gid;

    /**
     * 分组名
     */
    private String name;
}
