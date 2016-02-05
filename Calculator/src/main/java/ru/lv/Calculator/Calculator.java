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
	private double result;
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

    /**
     *
     * @param params
     * @throws UserException
     */
    public void div(int ... params) throws UserException {
        if ((params.length > 1) || (params.length < 3)){
            this.result = params[0];
            for(Integer param: params){
                if (param == 0) {
                    throw new IllegalArgumentException("Your second argument iz zero");
                } else {
                    this.result /= param;
                }
            }
        }
        else {
            throw new UserException("Please enter two arguments for division operation");
        }
    }
    /**
        Getting Result
        @return The final result
    */
    public double getResult(){
        return this.result;
    }
    /**
        Clean result
    */
    public void cleanResult(){
        this.result = 0;
    }
}

