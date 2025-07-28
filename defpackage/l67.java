package defpackage;

/* renamed from: l67  reason: default package */
public enum l67 implements b37 {
    ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS(g67.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS);
    
    public final int a;
    public final g67 b;

    /* access modifiers changed from: public */
    l67(g67 g67) {
        this.a = 1 << ordinal();
        this.b = g67;
    }

    public final boolean a() {
        return false;
    }

    public final int b() {
        return this.a;
    }
}
