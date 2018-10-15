package pl.kurs.lottery_machine.test;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.kurs.lottery_machine.src.LotteryMachine;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LotteryMachineTest {

    LotteryMachine machine;

    @BeforeEach
    public void setUp() throws IOException {
        machine = new LotteryMachine("C:\\Users\\Standard\\Desktop\\mlos.csv",2);
        machine.inputFromFile();
    }

    @Test
    public void shouldAddToMailList() {
        Assert.assertTrue("Did not add the name or e-mail", machine.getList().contains("imie03"));
    }




}