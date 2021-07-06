package com.sai.webapp.spring.config;

import com.sai.webapp.spring.domain.PaymenetEvent;
import com.sai.webapp.spring.domain.PaymentState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.config.StateMachineFactory;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StateMachineConfigTest {

    @Autowired
    StateMachineFactory<PaymentState, PaymenetEvent> factory;

    void  testNewStateMachine(){
        StateMachine<PaymentState,PaymenetEvent> stateMachine=factory.getStateMachine(UUID.randomUUID());
        stateMachine.start();
        System.out.println(stateMachine.getState().toString());
        stateMachine.sendEvent(PaymenetEvent.PRE_AUTHORIZE);
        System.out.println(stateMachine.getState().toString());
        stateMachine.sendEvent(PaymenetEvent.PRE_AUTH_APPROVED);
        System.out.println(stateMachine.getState().toString());



    }


}