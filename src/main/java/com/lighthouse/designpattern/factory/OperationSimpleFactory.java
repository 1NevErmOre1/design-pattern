package com.lighthouse.designpattern.factory;

import com.lighthouse.designpattern.model.simplefactory.*;

/**
 * @author gjk
 * @description
 * @date 2022/4/24 16:30
 */
public class OperationSimpleFactory {

    public static BaseCalculate createOperate(String symbol) {
        BaseCalculate calculate = null;
        switch (symbol) {
            case "+":
                calculate = new OperationAdd();
                break;
            case "-":
                calculate = new OperationSub();
                break;
            case "*":
                calculate = new OperationMul();
                break;
            case "/":
                calculate = new OperationDiv();
                break;
        }
        return calculate;
    }

}
