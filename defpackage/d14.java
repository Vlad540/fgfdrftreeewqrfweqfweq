package defpackage;

/* renamed from: d14  reason: default package */
public final class d14 {
    public static final d14 f = new d14(false, false, tq7.a, false, (cb5) null);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final cb5 d;
    public final zb9 e;

    public d14(boolean z, boolean z2, zb9 zb9, boolean z3, cb5 cb5) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = cb5;
        zb9 zb92 = new zb9(zb9.d);
        zb92.b(zb9);
        this.e = zb92;
    }

    public final String toString() {
        return "DispatchParams(retry=" + this.a + ", skipDebounce=" + this.b + ", allChats=" + this.c + ", serverChats=" + this.e + ", notification=" + this.d + ")";
    }
}
