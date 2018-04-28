package com.test.creationtype.builder;

import com.test.creationtype.builder.parts.Part1;
import com.test.creationtype.builder.parts.Part2;
import com.test.creationtype.builder.parts.Part3;

import java.io.Serializable;

/**
 * @Author: 危常焕
 * @Description:
 * @Date 2018/4/28
 */
public class Product implements Serializable {
    //定义部件
    private Part1 part1;
    private Part2 part2;
    private Part3 part3;

    public Part1 getPart1() {
        return part1;
    }

    public void setPart1(Part1 part1) {
        this.part1 = part1;
    }

    public Part2 getPart2() {
        return part2;
    }

    public void setPart2(Part2 part2) {
        this.part2 = part2;
    }

    public Part3 getPart3() {
        return part3;
    }

    public void setPart3(Part3 part3) {
        this.part3 = part3;
    }
}
