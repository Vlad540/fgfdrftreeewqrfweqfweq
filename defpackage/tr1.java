package defpackage;

import android.hardware.camera2.TotalCaptureResult;

/* renamed from: tr1  reason: default package */
public final class tr1 implements zr1 {
    public final zq1 a;
    public final kp0 b;
    public final int c;
    public boolean d = false;

    public tr1(zq1 zq1, int i, kp0 kp0) {
        this.a = zq1;
        this.c = i;
        this.b = kp0;
    }

    public final ch7 a(TotalCaptureResult totalCaptureResult) {
        if (!w30.g(this.c, totalCaptureResult)) {
            return ct0.w(Boolean.FALSE);
        }
        this.d = true;
        j36 a2 = j36.a(hwf.f(new rgc(24, this)));
        sr1 sr1 = new sr1(0);
        mh4 j = pa2.j();
        a2.getClass();
        return ct0.N(a2, new e3(sr1), j);
    }

    public final boolean b() {
        return this.c == 0;
    }

    public final void c() {
        if (this.d) {
            this.a.h.a(false, true);
            this.b.b = false;
        }
    }
}
