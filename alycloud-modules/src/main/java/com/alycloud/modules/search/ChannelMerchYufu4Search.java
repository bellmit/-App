package com.alycloud.modules.search;

import com.alycloud.modules.entity.ChannelMerchYufu;

/**
 * 御付渠道商户
 * @author Moyq5
 * @date 2017年8月5日
 */
public class ChannelMerchYufu4Search extends ChannelMerchYufu {
	
	private Integer pageSize = SystemIC.PAGE_SIZE;
	private Integer page = 1;
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getStartIndex() {
		return (page - 1) * pageSize;
	}
	
	// 在这里扩展查询条件属性
	
}
