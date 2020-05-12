package ru.ishchenko.task8;

public class Converter {

    public static Act converterContractToAct(Contract contract) {
        Act act = new Act();

        act.setDate(contract.getDate());
        act.setNumber(contract.getNumber());

        return act;


    }
}
