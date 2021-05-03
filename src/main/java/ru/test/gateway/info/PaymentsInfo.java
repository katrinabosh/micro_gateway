package ru.test.gateway.info;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import ru.test.gateway.history.Payment;
import ru.test.gateway.person.PersonInfo;

import java.util.List;

@ApiModel(description = "Персональные данные по участнику")
public class PaymentsInfo {

    @ApiModelProperty("Информация об участнике")
    private PersonInfo person;

    @ApiModelProperty("Совершённые платежи (сделки)")
    private List<Payment> payments;

    public PaymentsInfo(PersonInfo person, List<Payment> payments) {
        this.person = person;
        this.payments = payments;
    }

    public PersonInfo getPerson() {
        return person;
    }

    public List<Payment> getPayments() {
        return payments;
    }
}
