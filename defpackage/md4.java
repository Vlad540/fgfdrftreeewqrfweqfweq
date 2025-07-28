package defpackage;

/* renamed from: md4  reason: default package */
public enum md4 {
    REGULAR((byte) 0),
    DELAYED((byte) 1);
    
    public static final xhd o = null;
    public final byte a;
    public final r7e b;
    public final r7e c;

    /* JADX WARNING: type inference failed for: r0v2, types: [xhd, java.lang.Object] */
    static {
        o = new Object();
    }

    /* access modifiers changed from: public */
    md4(byte b2) {
        this.a = b2;
        this.b = new r7e(new ld4(this, 0));
        this.c = new r7e(new ld4(this, 1));
    }

    public final boolean a() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }
}
