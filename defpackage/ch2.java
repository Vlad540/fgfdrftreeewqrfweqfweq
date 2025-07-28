package defpackage;

/* renamed from: ch2  reason: default package */
public enum ch2 {
    MEMBER("MEMBER"),
    ADMIN("ADMIN"),
    BLOCKED_MEMBER("BLOCKED_MEMBER");
    
    public final String a;

    /* access modifiers changed from: public */
    ch2(String str) {
        this.a = str;
    }
}
