package com.mvc.DTO;

public class DTO {
		
	private int first;
    private int second;
    private int result;
    
	public DTO(int first, int second, int result) {
		this.first = first;
		this.second = second;
		this.result = result;
	}

	public int getFirst() {
		return first;
	}

	public void setFirst(int first) {
		this.first = first;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}
}
