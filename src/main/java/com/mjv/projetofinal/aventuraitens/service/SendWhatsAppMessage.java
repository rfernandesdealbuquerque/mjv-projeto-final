package com.mjv.projetofinal.aventuraitens.service;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class SendWhatsAppMessage {
   // Replace these placeholders with your Account Sid and Auth Token
   public static final String ACCOUNT_SID = "AC7040aa2c8109036b5b4e21326ef11be0";
   public static final String AUTH_TOKEN = "9bae1bcec47e9537c28da8606ce8872b";

   public static void sendMessage() {
       Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
       Message message = Message.creator(
               new com.twilio.type.PhoneNumber("whatsapp:+15005550006"),
               new com.twilio.type.PhoneNumber("whatsapp:+14155238886"),
               "Obrigado por comprar os itens da Loja do Seu Joao! Boas aventuras!")
           .create();
   }
}