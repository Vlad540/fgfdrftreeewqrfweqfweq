package defpackage;

/* renamed from: uxb  reason: default package */
public enum uxb {
    AUDIO_FREEZES("AUDIO_FREEZES"),
    AUDIO_CALL_INTERRUPTION("AUDIO_CALL_INTERRUPTION"),
    VOICE_COMMUNICATION_PROBLEM("VOICE_COMMUNICATION_PROBLEM"),
    AUDIO_QUALITY("AUDIO_QUALITY"),
    AUDIO_ECHO("AUDIO_ECHO"),
    VIDEO_FREEZES("VIDEO_FREEZES"),
    VIDEO_QUALITY("VIDEO_QUALITY"),
    VIDEO_SYNC("VIDEO_SYNC"),
    VIDEO_CALL_INTERRUPTION("VIDEO_CALL_INTERRUPTION"),
    USERS_FREEZES("USERS_FREEZES"),
    OTHER((String) null);
    
    public static final smc b = null;
    public final String a;

    static {
        uxb[] uxbArr;
        D0 = new pz4(uxbArr);
        b = new smc(15);
    }

    /* access modifiers changed from: public */
    uxb(String str) {
        this.a = str;
    }
}
