package defpackage;

import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: vh4  reason: default package */
public final class vh4 implements y4b {
    public final /* synthetic */ int a;
    public final o3e b;
    public final m54 c;
    public final y4b d;

    public /* synthetic */ vh4(o3e o3e, m54 m54, y4b y4b, int i) {
        this.a = i;
        this.b = o3e;
        this.c = m54;
        this.d = y4b;
    }

    public static Map c(wz6 wz6, z4b z4b, boolean z, int i) {
        if (!wz6.i(z4b, "DiskCacheProducer")) {
            return null;
        }
        return z ? at6.b("cached_value_found", String.valueOf(z), "encodedImageSize", String.valueOf(i)) : at6.a("cached_value_found", String.valueOf(z));
    }

    public final void a(ah0 ah0, z4b z4b) {
        switch (this.a) {
            case 0:
                ji0 ji0 = (ji0) z4b;
                tr6 tr6 = ji0.a;
                if (!tr6.d(16)) {
                    d(ah0, z4b);
                    return;
                }
                c5b c5b = ji0.c;
                c5b.j(z4b, "DiskCacheProducer");
                m54 m54 = this.c;
                m54.getClass();
                ngd o = m54.o(tr6.b);
                zh4 zh4 = (zh4) this.b.get();
                ys0 m = xie.m(tr6, (ys0) zh4.d.getValue(), zh4.a(), (at6) zh4.f.getValue());
                if (m == null) {
                    c5b.d(z4b, "DiskCacheProducer", new Exception("Got no disk cache for CacheChoice: " + Integer.valueOf(tr6.a.ordinal()).toString()), (Map) null);
                    d(ah0, z4b);
                    return;
                }
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                m.b(o, atomicBoolean).continueWith(new th4(this, (wz6) c5b, z4b, ah0));
                ji0.a(new uh4(0, atomicBoolean));
                return;
            default:
                ji0 ji02 = (ji0) z4b;
                if (ji02.X.a >= 2) {
                    ji02.h("disk", "nil-result_write");
                    ah0.g(1, (Object) null);
                    return;
                }
                if (ji02.a.d(32)) {
                    ah0 = new wh4(ah0, z4b, this.b, this.c);
                }
                this.d.a(ah0, z4b);
                return;
        }
    }

    public void d(ah0 ah0, z4b z4b) {
        ji0 ji0 = (ji0) z4b;
        if (ji0.X.a >= 2) {
            ji0.h("disk", "nil-result_read");
            ah0.g(1, (Object) null);
            return;
        }
        this.d.a(ah0, z4b);
    }
}
