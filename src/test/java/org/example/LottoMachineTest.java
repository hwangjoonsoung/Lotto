package org.example;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class LottoMachineTest {
    LottoMachine lottoMachine = new LottoMachine();

    @Test
    @DisplayName("로또 기계 셋팅 테스트")
    public void machineSetting(){

        //given

        //when
        List bolls = lottoMachine.machineSet();

        //then
        assertThat(bolls).isNotEmpty();
        
    }

    @Test
    @DisplayName("로또기계에서 공 뽑기 테스트")
    public void machinePullOut(){

        //given

        //when
        lottoMachine.machinePullOutBalls();

        //then
        assertThat(lottoMachine.pickedNumbers).hasSize(7).isNotNull().doesNotContainValue(null)
                .doesNotContainValue("").doesNotContainValue(0);


    }

}
