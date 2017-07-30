package angulartest;

public class ResultDTO {

	private int firstNum;
	private int secondNum;
	private int result;
	
	
	
	public ResultDTO(int firstNum, int secondNum, int result) {
		super();
		this.firstNum = firstNum;
		this.secondNum = secondNum;
	    this.result = result;
	}
	
	
	
	@Override
	public String toString() {
		return "ResultDTO [firstNum=" + firstNum + ", secondNum=" + secondNum + ", Result=" + result + "]";
	}



	public int getFirstNum() {
		return firstNum;
	}
	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}
	public int getSecondNum() {
		return secondNum;
	}
	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	
	
	
}
