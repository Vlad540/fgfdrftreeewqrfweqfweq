package defpackage;

import android.os.Handler;

/* renamed from: jd4  reason: default package */
public final /* synthetic */ class jd4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kd4 b;

    public /* synthetic */ jd4(kd4 kd4, int i) {
        this.a = i;
        this.b = kd4;
    }

    public final void run() {
        int i = this.a;
        kd4 kd4 = this.b;
        switch (i) {
            case 0:
                kd4.b(kd4);
                return;
            default:
                if (kd4.Z == 0) {
                    kd4.Z = 1;
                    a24 B = a24.B();
                    String str = kd4.B0;
                    B.t(str, "onAllConstraintsMet for " + kd4.c);
                    if (kd4.o.o.h(kd4.A0, (w4g) null)) {
                        guf guf = kd4.o.c;
                        btf btf = kd4.c;
                        synchronized (guf.d) {
                            a24 B2 = a24.B();
                            String str2 = guf.e;
                            B2.t(str2, "Starting timer for " + btf);
                            guf.a(btf);
                            fuf fuf = new fuf(guf, btf);
                            guf.b.put(btf, fuf);
                            guf.c.put(btf, kd4);
                            ((Handler) guf.a.b).postDelayed(fuf, 600000);
                        }
                        return;
                    }
                    kd4.c();
                    return;
                }
                a24 B3 = a24.B();
                String str3 = kd4.B0;
                B3.t(str3, "Already started work for " + kd4.c);
                return;
        }
    }
}
