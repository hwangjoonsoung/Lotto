package org.example.custormexception;

public class LessSelectNumber extends Exception {
    public LessSelectNumber() {
        super("숫자를 6개이상 선택하셔야 합니다.");
    }
}
