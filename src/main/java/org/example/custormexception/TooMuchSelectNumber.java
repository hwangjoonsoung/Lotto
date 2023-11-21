package org.example.custormexception;

public class TooMuchSelectNumber extends Exception{
    public TooMuchSelectNumber() {
        super("숫자를 너무 많이 선택했습니다.");
    }

}
