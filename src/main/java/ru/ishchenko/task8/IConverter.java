package ru.ishchenko.task8;

public interface IConverter {
    Contract actToContract(Act act);

    Act contractToAct(Contract contract);
}
