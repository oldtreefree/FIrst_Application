package ru.ishchenko.task8;

public class Converter implements IConverter {

    @Override
    public Contract actToContract(Act act) {
        Contract contract = new Contract();
        contract.setDate(act.getDate());
        contract.setNumber(act.getNumber());
        contract.setMyArray(act.getMyArray());
        return contract;
    }

    @Override
    public Act contractToAct(Contract contract) {
        Act act = new Act();
        act.setDate(contract.getDate());
        act.setNumber(contract.getNumber());
        act.setMyArray(contract.getMyArray());
        return act;
    }
}

