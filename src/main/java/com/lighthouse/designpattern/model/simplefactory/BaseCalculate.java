package com.lighthouse.designpattern.model.simplefactory;

/**
 * @author gjk
 * @description 基础计算实体 简单工厂模式
 * @date 2022/4/24 15:57
 */

import lombok.Data;

@Data
public class BaseCalculate {

    private double firstNum;

    private double secondNum;

    public double getResult(){
        return 0.0;
    }


}
