abstract class MessageHandler {
    MessageHandler messageHandler;

    public MessageHandler(MessageHandler messageHandler) {
        this.messageHandler = messageHandler;
    }

    abstract void handle(String msg);
}

class MessagePrintHandler extends MessageHandler {
    public MessagePrintHandler(MessageHandler messageHandler) {
        super(messageHandler);
    }

    @Override
    void handle(String msg) {
        System.out.println(msg);
    }
}

class MessageVerifyHandler extends MessageHandler {
    public MessageVerifyHandler(MessageHandler messageHandler) {
        super(messageHandler);
    }

    @Override
    void handle(String msg) {
        if(!msg.matches(".*\\d.*")) {
            messageHandler.handle(msg);
        }
    }
}

class MessageAddAdvertisementHandler extends MessageHandler {
    public MessageAddAdvertisementHandler(MessageHandler messageHandler) {
        super(messageHandler);
    }

    @Override
    void handle(String msg) {
        messageHandler.handle(
                msg + "\n__________________________________________________________\n");
    }
}
