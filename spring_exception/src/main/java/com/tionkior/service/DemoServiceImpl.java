package com.tionkior.service;

import com.tionkior.exception.MyException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * @ClassName : DemoServiceImpl
 * @Author : TionKior
 * @Date : 2021/6/15 14:42
 * @Version : V1.0
 * @Description :
 */

public class DemoServiceImpl implements DemoService {
    public void show1() {
        System.out.println("抛出类型转换异常");
        Object str = "zhangsan";
        Integer num = (Integer) str;
    }

    public void show2() {
        System.out.println("抛出除零异常");
        int i = 1 / 0;
    }

    public void show3() throws FileNotFoundException {
        System.out.println("文件找不到异常");
        Object str = "zhangsan";
        InputStream in = new FileInputStream("C:/xxx/xxx/xxx.txt");
    }

    public void show4() {
        System.out.println("空指针异常");
        String str = null;
        str.length();
    }

    @Override
    public void show5() throws MyException {
        System.out.println("自定义异常");
        throw new MyException();
    }

}
