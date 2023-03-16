package com.ismeoh.DI.useXml.byConstructor;



public class MessagePrinter {
    final private MessageService messageService;

    public MessagePrinter(MessageService messageService){
        this.messageService = messageService;
    }

    public void printMessage(){
        System.out.println(this.messageService.getMessage());
    }
}
