package defpackage;

/* renamed from: ep7  reason: default package */
public enum ep7 {
    LOGIN("LOGIN"),
    RECOVERY("RECOVERY"),
    PHONE_BINDING("PHONE_BINDING"),
    PHONE_CONFIRM("PHONE_CONFIRM");
    
    public final String a;

    /* access modifiers changed from: public */
    ep7(String str) {
        this.a = str;
    }

    public final String toString() {
        return wn6.l(new StringBuilder("{value='"), this.a, "'}");
    }
}
