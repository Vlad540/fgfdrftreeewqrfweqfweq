package defpackage;

/* renamed from: vs8  reason: default package */
public enum vs8 {
    UNKNOWN("UNKNOWN"),
    USER("USER"),
    GROUP("GROUP"),
    CHANNEL("CHANNEL"),
    CHANNEL_ADMIN("CHANNEL_ADMIN");
    
    public final String a;

    /* access modifiers changed from: public */
    vs8(String str) {
        this.a = str;
    }

    public final String toString() {
        return wn6.l(new StringBuilder("{value='"), this.a, "'}");
    }
}
