package defpackage;

import java.util.concurrent.Executor;

/* renamed from: ene  reason: default package */
public final class ene {
    public final zq1 a;
    public final vb9 b = new yh7(0);
    public final boolean c;
    public final Executor d;
    public boolean e;
    public sn1 f;
    public boolean g;

    /* JADX WARNING: type inference failed for: r3v2, types: [yh7, vb9] */
    public ene(zq1 zq1, et1 et1, ryc ryc) {
        this.a = zq1;
        this.d = ryc;
        this.c = pa2.w(new rgc(23, et1));
        zq1.p(new dne(this));
    }

    public static void b(vb9 vb9, Integer num) {
        if (gt0.C()) {
            vb9.k(num);
        } else {
            vb9.i(num);
        }
    }

    public final void a(sn1 sn1, boolean z) {
        if (this.c) {
            boolean z2 = this.e;
            vb9 vb9 = this.b;
            if (!z2) {
                b(vb9, 0);
                if (sn1 != null) {
                    sn1.d(new Exception("Camera is not active."));
                    return;
                }
                return;
            }
            this.g = z;
            this.a.r(z);
            b(vb9, Integer.valueOf(z ? 1 : 0));
            sn1 sn12 = this.f;
            if (sn12 != null) {
                sn12.d(new Exception("There is a new enableTorch being set"));
            }
            this.f = sn1;
        } else if (sn1 != null) {
            sn1.d(new IllegalStateException("No flash unit"));
        }
    }
}
