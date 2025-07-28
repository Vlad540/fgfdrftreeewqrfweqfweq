package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: qj  reason: default package */
public final class qj extends e0 implements ku3 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ Object b;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public qj(defpackage.rj r2) {
        /*
            r1 = this;
            r0 = 0
            r1.a = r0
            zl3 r0 = defpackage.zl3.b
            r1.b = r2
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qj.<init>(rj):void");
    }

    public final void g(hu3 hu3, Throwable th) {
        switch (this.a) {
            case 0:
                if (!(th instanceof CancellationException)) {
                    udd.s(((rj) this.b).a, "Can't invalidate chats and messages cache", th);
                    return;
                }
                return;
            case 1:
                fw fwVar = (fw) this.b;
                kh6 kh6 = fwVar.c;
                if (kh6 != null) {
                    int identityHashCode = System.identityHashCode(fwVar);
                    kh6.c("failed " + hu3 + " with " + th + " @" + identityHashCode);
                }
                fwVar.g.g(hu3, th);
                return;
            case 2:
                if (!(th instanceof CancellationException)) {
                    udd.s(((bt2) this.b).N0, "Exception when search chats/messages", th);
                    return;
                }
                return;
            case 3:
                ((g15) ((t97) this.b).getValue()).c(th, true);
                return;
            case 4:
                if (!(th instanceof CancellationException)) {
                    udd.s(((bv4) this.b).c, "Exception while loading emoji sprite", th);
                    return;
                }
                return;
            case 5:
                ((r4a) ((g15) this.b)).c(th, false);
                return;
            case 6:
                if (!(th instanceof CancellationException)) {
                    udd.s(((ok7) this.b).b, "Can't load frames", th);
                    return;
                }
                return;
            case 7:
                if (!(th instanceof CancellationException)) {
                    ((voa) this.b).c.c(th, false);
                    return;
                }
                return;
            default:
                if (!(th instanceof CancellationException)) {
                    udd.s(((c4f) this.b).g, "Fetch video. Exception", th);
                    return;
                }
                return;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public qj(defpackage.fw r2) {
        /*
            r1 = this;
            r0 = 1
            r1.a = r0
            zl3 r0 = defpackage.zl3.b
            r1.b = r2
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qj.<init>(fw):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public qj(bt2 r2) {
        /*
            r1 = this;
            r0 = 2
            r1.a = r0
            zl3 r0 = defpackage.zl3.b
            r1.b = r2
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qj.<init>(bt2):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public qj(defpackage.bv4 r2) {
        /*
            r1 = this;
            r0 = 4
            r1.a = r0
            zl3 r0 = defpackage.zl3.b
            r1.b = r2
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qj.<init>(bv4):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public qj(defpackage.g15 r2) {
        /*
            r1 = this;
            r0 = 5
            r1.a = r0
            zl3 r0 = defpackage.zl3.b
            r1.b = r2
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qj.<init>(g15):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public qj(ok7 r2) {
        /*
            r1 = this;
            r0 = 6
            r1.a = r0
            zl3 r0 = defpackage.zl3.b
            r1.b = r2
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qj.<init>(ok7):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public qj(defpackage.voa r2) {
        /*
            r1 = this;
            r0 = 7
            r1.a = r0
            zl3 r0 = defpackage.zl3.b
            r1.b = r2
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qj.<init>(voa):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public qj(r7e r2) {
        /*
            r1 = this;
            r0 = 3
            r1.a = r0
            zl3 r0 = defpackage.zl3.b
            r1.b = r2
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qj.<init>(r7e):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public qj(defpackage.c4f r2) {
        /*
            r1 = this;
            r0 = 8
            r1.a = r0
            zl3 r0 = defpackage.zl3.b
            r1.b = r2
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qj.<init>(c4f):void");
    }
}
