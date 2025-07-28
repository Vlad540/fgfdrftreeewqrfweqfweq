package defpackage;

/* renamed from: gb5  reason: default package */
public enum gb5 {
    MESSAGE("Message"),
    CHAT_MESSAGE("ChatMessage"),
    CHANNEL_MESSAGE("ChatMessage-channel"),
    CHAT_SYSTEM_MESSAGE("ChatSystemMessage"),
    CHAT_REPLY("ChatReply"),
    GROUP_CHAT("GroupChat"),
    SCHEDULED("Scheduled"),
    UNKNOWN("Unknown");
    
    public static final gb5[] b = null;
    public final String a;

    static {
        b = values();
    }

    /* access modifiers changed from: public */
    gb5(String str) {
        this.a = str;
    }
}
