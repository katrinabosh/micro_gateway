package ru.test.gateway.info;

import org.springframework.stereotype.Service;
import ru.test.gateway.history.PaymentsRestClient;
import ru.test.gateway.person.PersonRestClient;

import java.util.UUID;

@Service
public class PaymentsInfoService {

    private final PaymentsRestClient paymentsRestClient;
    private final PersonRestClient personRestClient;

    public PaymentsInfoService(PaymentsRestClient paymentsRestClient, PersonRestClient personRestClient) {
        this.paymentsRestClient = paymentsRestClient;
        this.personRestClient = personRestClient;
    }

    public PaymentsInfo getPaymentHistory(UUID personId) {
        return new PaymentsInfo(personRestClient.getPersonInfo(personId),
                paymentsRestClient.getPayments(personId));
    }

}
