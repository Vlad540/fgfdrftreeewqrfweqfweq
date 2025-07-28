package defpackage;

import java.util.LinkedHashSet;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: jp3  reason: default package */
public final class jp3 implements h3e {
    public final di3 a;
    public final pae b;
    public final k2e c;
    public final r7e d = new r7e(new x2(this));
    public final pb5 e;

    public jp3(n62 n62, di3 di3, pae pae, gsc gsc, w6a w6a, g2b g2b, o2b o2b) {
        t97 t97 = mqc.z;
        this.a = di3;
        this.b = pae;
        this.c = new k2e(n62);
        this.e = new pb5(gsc, new f2b(gsc, w6a, false, 9), g2b, o2b, t97, (h2e) new zx1(24, this));
    }

    public final mv9 a(int i, String str) {
        return new mv9(1, new nic(bw4.a, new ip3(this, str, i, (Continuation) null)));
    }

    public final List b(LinkedHashSet linkedHashSet) {
        this.c.getClass();
        return this.e.m(linkedHashSet);
    }

    public final void clear() {
    }
}
