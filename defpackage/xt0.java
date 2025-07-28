package defpackage;

/* renamed from: xt0  reason: default package */
public enum xt0 {
    UNKNOWN("UNKNOWN");
    
    public static final xt0[] c = null;
    public final String a;

    static {
        c = values();
    }

    /* access modifiers changed from: public */
    xt0(String str) {
        this.a = str;
    }

    public final String toString() {
        return wn6.l(new StringBuilder("{value='"), this.a, "'}");
    }
}
