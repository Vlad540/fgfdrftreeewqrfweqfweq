package defpackage;

import java.util.Iterator;

/* renamed from: kyf  reason: default package */
public final /* synthetic */ class kyf implements Runnable {
    public final /* synthetic */ lyf a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ kyf(lyf lyf, boolean z, boolean z2) {
        this.a = lyf;
        this.b = z;
        this.c = z2;
    }

    public final void run() {
        lyf lyf = this.a;
        boolean z = this.b;
        boolean z2 = this.c;
        xwb xwb = ((jl7) lyf.a).n;
        xwb.log("OKRTCLmsAdapter", "capture state changed, isCapturing=" + z + ", isFailedStart=" + z2);
        at1 at1 = ((jl7) lyf.a).r;
        if (at1 != null) {
            if (z) {
                Iterator it = at1.f.iterator();
                while (it.hasNext()) {
                    ((jl7) it.next()).getClass();
                }
            } else if (!z2) {
                at1.b();
            } else {
                return;
            }
        }
        qqe qqe = ((jl7) lyf.a).x;
        if (qqe != null) {
            ((gx0) qqe.a).k(g41.Z, Boolean.valueOf(z));
        }
        jl7 jl7 = (jl7) lyf.a;
        Iterator it2 = jl7.c.iterator();
        while (it2.hasNext()) {
            ((ll7) it2.next()).b(jl7);
        }
    }
}
