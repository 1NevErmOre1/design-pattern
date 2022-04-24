package com.lighthouse.designpattern.model.simplefactory;

import lombok.Data;

/**
 * @author gjk
 * @description
 * @date 2022/4/24 16:23
 */
@Data
public class OperationMul extends BaseCalculate{

    @Override
    public double getResult(){
        return super.getFirstNum() * super.getSecondNum();
    }


}
