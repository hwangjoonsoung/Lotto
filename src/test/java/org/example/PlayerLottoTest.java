package org.example;

import org.example.custormexception.LessSelectNumber;
import org.example.custormexception.TooMuchSelectNumber;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.assertj.core.api.Assertions.*;

public class PlayerLottoTest {

    PlayerLotto playerLotto = new PlayerLotto();

    @Test
    @DisplayName("숫자 정상선택")
    public void playerSeletedSixNumbers() throws Exception {
        //given
        int [] numberArr= {1,2,3,4,5,6};
        //when
        playerLotto.selectNumber(numberArr);

        //then
        assertThat(playerLotto.playerSelectNumberSet).isNotNull().hasSize(6);
        assertThatCode(() -> playerLotto.selectNumber(numberArr)).doesNotThrowAnyException();

    }

    @Test
    @DisplayName("숫자 6개 초과 선택")
    public void playerSeletedOverSixNumbers() throws Exception {
        //given
        int [] numberArr= {1,2,3,4,5,6,7};
        //when
        assertThatThrownBy(() -> {
            playerLotto.selectNumber(numberArr);
        }).isInstanceOf(TooMuchSelectNumber.class);

        //then

    }

    @Test
    @DisplayName("숫자 6개 미만 선택")
    public void playerSeletedLessSixNumbers() throws Exception {
        //given
        int [] numberArr= {};
        //when
        assertThatThrownBy(() -> {
            playerLotto.selectNumber(numberArr);
        }).isInstanceOf(LessSelectNumber.class);
        //then

    }



}
