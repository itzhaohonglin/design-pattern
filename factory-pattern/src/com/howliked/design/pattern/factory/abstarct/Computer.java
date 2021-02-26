package com.howliked.design.pattern.factory.abstarct;

/**
 * 电脑工厂
 */
public interface Computer {
    /**
     * 键盘
     *
     * @return
     */
    Keyboard getKeyBoard();

    /**
     * 鼠标
     *
     * @return
     */
    Mouse getMouse();
}
