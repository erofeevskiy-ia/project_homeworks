package com.epam.javacore.homework.hw7.task3;

import java.util.ArrayList;
import java.util.List;
public class SharedResource {
    private List<Integer> list;

	public SharedResource() {
		list = new ArrayList<Integer>();
	}

	public void setElement(Integer element) {
		list.add(element);
	}

	public Integer getELement() {
		if (!list.isEmpty()) {
			return list.remove(0);
		} 
		return null;
	}

}
