package defpackage;

import java.util.Collections;

/* renamed from: nv2  reason: default package */
public final /* synthetic */ class nv2 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;

    public /* synthetic */ nv2(Object obj, long j, int i) {
        this.a = i;
        this.b = obj;
        this.c = j;
    }

    /* JADX INFO: finally extract failed */
    public final Object invoke() {
        switch (this.a) {
            case 0:
                t52 l = ((aw2) this.b).l();
                long j = this.c;
                i22 E = l.E(j);
                if (E != null && (E.A() || E.O())) {
                    return E;
                }
                return l.b(n62.a, Collections.singletonList(Long.valueOf(j)), (String) null, (String) null);
            case 1:
                return ((aw2) this.b).l().y(this.c);
            default:
                long j2 = this.c;
                xdc xdc = (xdc) this.b;
                yp2 c2 = xdc.c();
                aec aec = c2.a;
                aec.c();
                try {
                    yp2.c(c2, j2);
                    aec.r();
                    aec.l();
                    ((cw8) xdc.d.getValue()).e(j2);
                    pkc pkc = (pkc) xdc.c.getValue();
                    aec aec2 = pkc.a;
                    aec2.b();
                    tdc tdc = pkc.c;
                    yz5 f = tdc.f();
                    f.j(1, j2);
                    try {
                        aec2.c();
                        f.n();
                        aec2.r();
                        aec2.l();
                        tdc.u(f);
                        return jue.a;
                    } catch (Throwable th) {
                        tdc.u(f);
                        throw th;
                    }
                } catch (Throwable th2) {
                    aec.l();
                    throw th2;
                }
        }
    }
}
