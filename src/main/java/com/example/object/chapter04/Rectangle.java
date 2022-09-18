package com.example.object.chapter04;

import lombok.Getter;
import lombok.Setter;

/**
 * 캡슐화를 위반하는 과도한 접근자(getter)와 수정자(setter)를 만드는 것은 지양
 */
@Getter @Setter
public class Rectangle {
    private int left;
    private int top;
    private int right;
    private int bottom;

    /**
     * 객체가 자기 스스로를 책임진다 -> 자율성이 높은 객체
     * @param multiple
     */
    public void enlarge(int multiple) {
        this.right *= multiple;
        this.bottom *= multiple;
    }

}
