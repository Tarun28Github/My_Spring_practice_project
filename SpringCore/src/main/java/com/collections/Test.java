package com.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
	
    private int id;
    private List<String> list;    
    private Set<String> set;
    private Map<String, String> map;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public Set<String> getSet() {
		return set;
	}
	public void setSet(Set<String> set) {
		this.set = set;
	}
	public Map<String, String> getMap() {
		return map;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	public Test(int id, List<String> list, Set<String> set, Map<String, String> map) {
		super();
		this.id = id;
		this.list = list;
		this.set = set;
		this.map = map;
	}
	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Test [id=" + id + ", list=" + list + ", set=" + set + ", map=" + map + "]";
	}
    
    

}
