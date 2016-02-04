package ru.lv.Calculator;
/**
*	Calculator Class
*   @author LeshaVasya
*   @since 03.02.2016
*/
public class Calculator{
	/**
		The final result
	*/
	private int result;
    /**
        Constructor
    */
    public void Calculator(){
        result = 0;
    }
    /**
        Addiction method
        @param params Arguments
    */
    public void add(int ... params){
        for (Integer param: params){
            this.result += param;
        }
    }

    public void div(int ... params){

    }
    /**
        Getting Result
        @return The final result
    */
    public int getResult(){
        return this.result;
    }
    /**
        Clean result
    */
    public void cleanResult(){
        this.result = 0;
    }
}

