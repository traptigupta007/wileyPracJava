package com.wiley.spring_core.reftype;

public class WileyB {
	private int count;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public WileyB(int count) {
		super();
		this.count = count;
	}

	public WileyB() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "WileyB [count=" + count + "]";
	}
}