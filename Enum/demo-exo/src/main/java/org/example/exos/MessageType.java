package org.example.exos;

public enum MessageType {
    A("A", Priority.HIGH),
    B("B", Priority.MEDIUM),
    C("C", Priority.LOW),
    D("D", Priority.LOW);

    private final String type;
    private final Priority priority;

    MessageType(String type, Priority priority) {
        this.type = type;
        this.priority = priority;
    }

    public Priority getPriority() {
        return priority;
    }

    public static MessageType fromString(String input) {
        for (MessageType messageType : MessageType.values()) {
            if (messageType.type.equals(input)) {
                return messageType;
            }
        }
        return null;
    }
}
