package com.lighthouse.designpattern;

import com.lighthouse.designpattern.factory.OperationSimpleFactory;
import com.lighthouse.designpattern.model.simplefactory.BaseCalculate;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
@Slf4j
class DesignPatternApplicationTests {

    @Test
    void contextLoads(){
        String symbol = "*";
        double a= 1.4;
        double b = 1.6;
          BaseCalculate operate = OperationSimpleFactory.createOperate(symbol);
        operate.setFirstNum(a);
        operate.setSecondNum(b);
        System.out.println(operate.getResult());

    }

}
