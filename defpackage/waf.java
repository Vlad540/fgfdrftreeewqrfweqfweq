package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: waf  reason: default package */
public final class waf implements bd3 {
    public final u16 a;
    public final t97 b;
    public final hcd c;
    public final s0c o;

    public waf(t97 t97, u16 u16) {
        this.a = u16;
        this.b = t97;
        hcd b2 = icd.b(0, 0, 0, 7);
        this.c = b2;
        this.o = new s0c(b2);
    }

    public final g37 a(ou3 ou3, hu3 hu3, ru3 ru3, i26 i26) {
        return xs7.D(ou3, hu3, ru3, new vaf(this, i26, (Continuation) null));
    }

    public final s0c f() {
        return this.o;
    }
}
