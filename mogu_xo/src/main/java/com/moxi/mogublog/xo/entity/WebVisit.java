package com.moxi.mogublog.xo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.moxi.mougblog.base.entity.SuperEntity;

/**
 * <p>
 * Web访问记录表
 * </p>
 *
 * @author xuzhixiang
 * @since 2018年12月8日09:27:17
 */
@TableName("t_web_visit")
public class WebVisit extends SuperEntity<WebVisit> {

    private static final long serialVersionUID = 1L;


    /**
     * 用户UID
     */
    private String userUid;

    /**
     * 用户IP
     */
    private String ip;

    /**
     * 用户访问行为   (点击了文章，点击了标签，点击了分类，进行了搜索)
     */
    private String behavior;
    
    /**
     *  文章uid，标签uid，分类uid
     */
    private String moduleUid;
	
    /**
     * 附加数据(比如搜索内容)
     */
    private String otherData;

	public String getUserUid() {
		return userUid;
	}

	public void setUserUid(String userUid) {
		this.userUid = userUid;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getBehavior() {
		return behavior;
	}

	public void setBehavior(String behavior) {
		this.behavior = behavior;
	}

	public String getModuleUid() {
		return moduleUid;
	}

	public void setModuleUid(String moduleUid) {
		this.moduleUid = moduleUid;
	}

	public String getOtherData() {
		return otherData;
	}

	public void setOtherData(String otherData) {
		this.otherData = otherData;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
 
}
