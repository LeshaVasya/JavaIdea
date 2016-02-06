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
        if ((params.length != 2)) {
            throw new UserException("Please enter two arguments for division operation");
        }
        else {
            if (params[1] == 0) {
                throw new IllegalArgumentException("Your second argument is zero");
            }
            else {
                this.result = params[0]/params[1];
            }
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

