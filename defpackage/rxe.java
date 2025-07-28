package defpackage;

/* renamed from: rxe  reason: default package */
public enum rxe {
    UNKNOWN(0),
    UPLOADING(1),
    UPLOADED(2);
    
    public static final rxe[] X = null;
    public final int a;

    static {
        X = values();
    }

    /* access modifiers changed from: public */
    rxe(int i) {
        this.a = i;
    }
}
