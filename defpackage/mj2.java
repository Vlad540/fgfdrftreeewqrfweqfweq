package defpackage;

/* renamed from: mj2  reason: default package */
public enum mj2 {
    SOUND("SOUND"),
    VIBRATION("VIBR"),
    LED("LED");
    
    public static final int X = 0;
    public final String a;

    static {
        X = values().length;
    }

    /* access modifiers changed from: public */
    mj2(String str) {
        this.a = str;
    }

    public final String toString() {
        return wn6.l(new StringBuilder("{value='"), this.a, "'}");
    }
}
