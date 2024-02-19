package ru.relex.controller;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

@Component
public class TelegramBot extends TelegramLongPollingBot {
    @Override
    public String getBotUsername() {
        return "babushkin_pogreb_27_bot";
    }

    @Override
    public String getBotToken(){
        return "6489103428:AAEEsnsNFD-qcrsUy_jgiM6Qoxb-uu7UQSQ";
    }


    @Override
    public void onUpdateReceived(Update update) {
        var originalMessage = update.getMessage();
        System.out.println(originalMessage.getText());
    }


//    @Override
//    public void onUpdateReceived(Update update) {
//        // We check if the update has a message and the message has text
//        if (update.hasMessage() && update.getMessage().hasText()) {
//            System.out.println("QWERTY123456");
//
//
//        }
//    }
}
