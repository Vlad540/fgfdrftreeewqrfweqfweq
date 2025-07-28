package defpackage;

/* renamed from: wt0  reason: default package */
public enum wt0 {
    DEFAULT("DEFAULT"),
    POSITIVE("POSITIVE"),
    NEGATIVE("NEGATIVE"),
    UNKNOWN("UNKNOWN");
    
    public static final wt0[] Y = null;
    public final String a;

    static {
        Y = values();
    }

    /* access modifiers changed from: public */
    wt0(String str) {
        this.a = str;
    }

    public final String toString() {
        return wn6.l(new StringBuilder("{value='"), this.a, "'}");
    }
}
