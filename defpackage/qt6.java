package defpackage;

/* renamed from: qt6  reason: default package */
public enum qt6 {
    SEND_5_MESSAGES("messageSent"),
    CREATE_FOLDER("folderCreated"),
    SEND_AUDIO_MESSAGE("voiceMessageSent"),
    ADD_2_REACTIONS("reactionSet"),
    SEND_3_STICKERS("stickerSent"),
    CREATE_2_GROUP_CHATS("groupChatCreated"),
    MADE_2_PIN("pinMade"),
    PARTICIPATED_IN_CALL("callMade");
    
    public final String a;

    static {
        qt6[] qt6Arr;
        z0 = new pz4(qt6Arr);
    }

    /* access modifiers changed from: public */
    qt6(String str) {
        this.a = str;
    }
}
