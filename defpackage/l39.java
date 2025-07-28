package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;

/* renamed from: l39  reason: default package */
public final class l39 extends pi0 implements Handler.Callback {
    public final oa2 B0;
    public final g45 C0;
    public final Handler D0;
    public final e39 E0;
    public xs7 F0;
    public boolean G0;
    public boolean H0;
    public long I0;
    public long J0;
    public y29 K0;

    /* JADX WARNING: type inference failed for: r3v2, types: [e39, m24] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l39(g45 g45, Looper looper) {
        super(5);
        Handler handler;
        oa2 oa2 = oa2.X;
        this.C0 = g45;
        if (looper == null) {
            handler = null;
        } else {
            int i = mze.a;
            handler = new Handler(looper, this);
        }
        this.D0 = handler;
        this.B0 = oa2;
        this.E0 = new m24(1);
        this.J0 = -9223372036854775807L;
    }

    public final int A(vu5 vu5) {
        if (!this.B0.G(vu5)) {
            return pi0.b(0, 0, 0);
        }
        return pi0.b(vu5.T0 == 0 ? 4 : 2, 0, 0);
    }

    public final void C(y29 y29, ArrayList arrayList) {
        int i = 0;
        while (true) {
            w29[] w29Arr = y29.a;
            if (i < w29Arr.length) {
                vu5 k = w29Arr[i].k();
                if (k != null) {
                    oa2 oa2 = this.B0;
                    if (oa2.G(k)) {
                        xs7 B = oa2.B(k);
                        byte[] o = w29Arr[i].o();
                        o.getClass();
                        e39 e39 = this.E0;
                        e39.v();
                        e39.x(o.length);
                        e39.o.put(o);
                        e39.y();
                        y29 j = B.j(e39);
                        if (j != null) {
                            C(j, arrayList);
                        }
                        i++;
                    }
                }
                arrayList.add(w29Arr[i]);
                i++;
            } else {
                return;
            }
        }
    }

    public final void D(y29 y29) {
        g45 g45 = this.C0;
        m45 m45 = g45.a;
        w78 a = m45.n1.a();
        int i = 0;
        while (true) {
            w29[] w29Arr = y29.a;
            if (i >= w29Arr.length) {
                break;
            }
            w29Arr[i].p(a);
            i++;
        }
        m45.n1 = new y78(a);
        y78 Z1 = m45.Z1();
        boolean equals = Z1.equals(m45.Z0);
        oz2 oz2 = m45.B0;
        if (!equals) {
            m45.Z0 = Z1;
            oz2.l(14, new r34(16, (Object) g45));
        }
        oz2.l(28, new r34(18, (Object) y29));
        oz2.h();
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            D((y29) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    public final String k() {
        return "MetadataRenderer";
    }

    public final boolean m() {
        return this.H0;
    }

    public final boolean n() {
        return true;
    }

    public final void o() {
        this.K0 = null;
        this.J0 = -9223372036854775807L;
        this.F0 = null;
    }

    public final void q(long j, boolean z) {
        this.K0 = null;
        this.J0 = -9223372036854775807L;
        this.G0 = false;
        this.H0 = false;
    }

    public final void u(vu5[] vu5Arr, long j, long j2) {
        this.F0 = this.B0.B(vu5Arr[0]);
    }

    public final void w(long j, long j2) {
        boolean z = true;
        while (z) {
            if (!this.G0 && this.K0 == null) {
                e39 e39 = this.E0;
                e39.v();
                otf otf = this.b;
                otf.w();
                int v = v(otf, e39, 0);
                if (v == -4) {
                    if (e39.f(4)) {
                        this.G0 = true;
                    } else {
                        e39.y0 = this.I0;
                        e39.y();
                        xs7 xs7 = this.F0;
                        int i = mze.a;
                        y29 j3 = xs7.j(e39);
                        if (j3 != null) {
                            ArrayList arrayList = new ArrayList(j3.a.length);
                            C(j3, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.K0 = new y29((List) arrayList);
                                this.J0 = e39.Y;
                            }
                        }
                    }
                } else if (v == -5) {
                    vu5 vu5 = (vu5) otf.b;
                    vu5.getClass();
                    this.I0 = vu5.E0;
                }
            }
            y29 y29 = this.K0;
            if (y29 == null || this.J0 > j) {
                z = false;
            } else {
                Handler handler = this.D0;
                if (handler != null) {
                    handler.obtainMessage(0, y29).sendToTarget();
                } else {
                    D(y29);
                }
                this.K0 = null;
                this.J0 = -9223372036854775807L;
                z = true;
            }
            if (this.G0 && this.K0 == null) {
                this.H0 = true;
            }
        }
    }
}
