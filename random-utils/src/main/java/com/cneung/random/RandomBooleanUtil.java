package com.cneung.random;

import java.util.Random;

/**
 * 项目名称:       common-utils
 * 模块名称:
 * 说明:          随机布尔值
 * JDK 版本:      1.8
 * 作者(@author): zhangxl
 * 创建日期:       2019/12/18 15:13
 */
public class RandomBooleanUtil {

    /**
     * 定义范围开始数字
     */
    private static final int START = 0;

    /**
     * 定义范围结束数字
     */
    private static final int END = 100;

    /**
     * 最小概率
     */
    private static final int MIN_PROBABILITY = 0;

    /**
     * 最大概率
     */
    private static final int MAX_PROBABILITY = 100;

    /**
     * 随机布尔值(50%)
     *
     * @return  boolean
     */
    public static boolean getBoolean() {
        return new Random().nextInt(END - START + 1) + START <= 50;
    }

    /**
     * 随机布尔值
     *
     * @param trueProbability   true概率（%）
     * @return  boolean
     */
    public static boolean getBoolean(Integer trueProbability) {
        if (trueProbability < MIN_PROBABILITY) {
            return false;
        }
        if (trueProbability > MAX_PROBABILITY) {
            return true;
        }
        return new Random().nextInt(END - START + 1) + START <= trueProbability;
    }
}
