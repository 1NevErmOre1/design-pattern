package com.lighthouse.designpattern.model.simplefactory;

import lombok.Data;

/**
 * @author gjk
 * @description
 * @date 2022/4/24 16:23
 */
@Data
public class OperationDiv extends BaseCalculate{

    @Override
    public double getResult(){
        return getFirstNum() / getSecondNum();
    }


}
