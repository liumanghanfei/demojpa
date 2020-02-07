package com.example.demojap.utils.page;

import java.util.List;

public class PageDto<T> {
	private List<T> dtoList;
	private Page page;

	public PageDto() {
		super();
	}

	public PageDto(List<T> dtoList, Page page) {
		super();
		this.dtoList = dtoList;
		this.page = page;
	}

	public List<T> getDtoList() {
		return dtoList;
	}

	public void setDtoList(List<T> dtoList) {
		this.dtoList = dtoList;
	}

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}
}
