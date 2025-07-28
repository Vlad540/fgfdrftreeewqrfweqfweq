package defpackage;

/* renamed from: gu1  reason: default package */
public enum gu1 {
    RELEASED(false),
    RELEASING(true),
    CLOSED(false),
    PENDING_OPEN(false),
    CLOSING(true),
    OPENING(true),
    OPEN(true),
    CONFIGURED(true);
    
    public final boolean a;

    /* access modifiers changed from: public */
    gu1(boolean z) {
        this.a = z;
    }
}
