package org.example;

public class WinningCheck {


    public String getResult(int correctCount, boolean correctBonus) {
        String result = "";

        switch (correctCount) {
            case 3:
                result = "5등";
                break;
            case 4:
                result = "4등";
                break;
            case 5:
                if (correctBonus) {
                    result = "2등";
                    break;
                } else {
                    result = "1등";
                    break;
                }

            default:result="꽝";
        }
        return result;
    }
}
