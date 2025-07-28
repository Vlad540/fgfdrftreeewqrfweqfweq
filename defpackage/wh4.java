package defpackage;

import java.util.Map;

/* renamed from: wh4  reason: default package */
public final class wh4 extends rd4 {
    public final z4b c;
    public final o3e d;
    public final m54 e;

    public wh4(ah0 ah0, z4b z4b, o3e o3e, m54 m54) {
        super(ah0);
        this.c = z4b;
        this.d = o3e;
        this.e = m54;
    }

    public final void h(int i, Object obj) {
        ax4 ax4 = (ax4) obj;
        z4b z4b = this.c;
        ji0 ji0 = (ji0) z4b;
        ji0.c.j(z4b, "DiskCacheWriteProducer");
        boolean b = ah0.b(i);
        c5b c5b = ji0.c;
        ah0 ah0 = this.b;
        if (!b && ax4 != null && (i & 10) == 0) {
            ax4.n0();
            if (ax4.c != lq6.c) {
                m54 m54 = this.e;
                m54.getClass();
                tr6 tr6 = ji0.a;
                ngd o = m54.o(tr6.b);
                zh4 zh4 = (zh4) this.d.get();
                ys0 m = xie.m(tr6, (ys0) zh4.d.getValue(), zh4.a(), (at6) zh4.f.getValue());
                if (m == null) {
                    c5b.d(z4b, "DiskCacheWriteProducer", new Exception("Got no disk cache for CacheChoice: " + Integer.valueOf(tr6.a.ordinal()).toString()), (Map) null);
                    ah0.g(i, ax4);
                    return;
                }
                m.d(o, ax4);
                c5b.a(z4b, "DiskCacheWriteProducer", (Map) null);
                ah0.g(i, ax4);
                return;
            }
        }
        c5b.a(z4b, "DiskCacheWriteProducer", (Map) null);
        ah0.g(i, ax4);
    }
}
