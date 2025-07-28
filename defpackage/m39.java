package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;

/* renamed from: m39  reason: default package */
public final class m39 extends qi0 implements Handler.Callback {
    public final zl3 G0;
    public final h45 H0;
    public final Handler I0;
    public final f39 J0;
    public at7 K0;
    public boolean L0;
    public boolean M0;
    public long N0;
    public a39 O0;
    public long P0;

    /* JADX WARNING: type inference failed for: r3v2, types: [n24, f39] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m39(h45 h45, Looper looper) {
        super(5);
        Handler handler;
        zl3 zl3 = zl3.o;
        this.H0 = h45;
        if (looper == null) {
            handler = null;
        } else {
            int i = oze.a;
            handler = new Handler(looper, this);
        }
        this.I0 = handler;
        this.G0 = zl3;
        this.J0 = new n24(1);
        this.P0 = -9223372036854775807L;
    }

    public final int D(xu5 xu5) {
        if (!this.G0.l(xu5)) {
            return qi0.b(0, 0, 0, 0);
        }
        return qi0.b(xu5.K == 0 ? 4 : 2, 0, 0, 0);
    }

    public final void F(a39 a39, ArrayList arrayList) {
        int i = 0;
        while (true) {
            x29[] x29Arr = a39.a;
            if (i < x29Arr.length) {
                xu5 k = x29Arr[i].k();
                if (k != null) {
                    zl3 zl3 = this.G0;
                    if (zl3.l(k)) {
                        at7 c = zl3.c(k);
                        byte[] o = x29Arr[i].o();
                        o.getClass();
                        f39 f39 = this.J0;
                        f39.v();
                        f39.x(o.length);
                        f39.X.put(o);
                        f39.y();
                        a39 l = c.l(f39);
                        if (l != null) {
                            F(l, arrayList);
                        }
                        i++;
                    }
                }
                arrayList.add(x29Arr[i]);
                i++;
            } else {
                return;
            }
        }
    }

    public final long G(long j) {
        boolean z = false;
        oyb.k(j != -9223372036854775807L);
        if (this.P0 != -9223372036854775807L) {
            z = true;
        }
        oyb.k(z);
        return j - this.P0;
    }

    public final void H(a39 a39) {
        h45 h45 = this.H0;
        n45 n45 = h45.a;
        x78 a = n45.u1.a();
        int i = 0;
        while (true) {
            x29[] x29Arr = a39.a;
            if (i >= x29Arr.length) {
                break;
            }
            x29Arr[i].w(a);
            i++;
        }
        n45.u1 = a.a();
        z78 b2 = n45.b2();
        boolean equals = b2.equals(n45.c1);
        qh7 qh7 = n45.B0;
        if (!equals) {
            n45.c1 = b2;
            qh7.c(14, new r34(17, (Object) h45));
        }
        qh7.c(28, new r34(19, (Object) a39));
        qh7.b();
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            H((a39) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    public final String l() {
        return "MetadataRenderer";
    }

    public final boolean n() {
        return this.M0;
    }

    public final boolean p() {
        return true;
    }

    public final void q() {
        this.O0 = null;
        this.K0 = null;
        this.P0 = -9223372036854775807L;
    }

    public final void s(long j, boolean z) {
        this.O0 = null;
        this.L0 = false;
        this.M0 = false;
    }

    public final void x(xu5[] xu5Arr, long j, long j2) {
        this.K0 = this.G0.c(xu5Arr[0]);
        a39 a39 = this.O0;
        if (a39 != null) {
            long j3 = this.P0;
            long j4 = a39.b;
            long j5 = (j3 + j4) - j2;
            if (j4 != j5) {
                a39 = new a39(j5, a39.a);
            }
            this.O0 = a39;
        }
        this.P0 = j2;
    }

    public final void z(long j, long j2) {
        boolean z = true;
        while (z) {
            if (!this.L0 && this.O0 == null) {
                f39 f39 = this.J0;
                f39.v();
                qe4 qe4 = this.c;
                qe4.t();
                int y = y(qe4, f39, 0);
                if (y == -4) {
                    if (f39.f(4)) {
                        this.L0 = true;
                    } else if (f39.Z >= this.A0) {
                        f39.z0 = this.N0;
                        f39.y();
                        at7 at7 = this.K0;
                        int i = oze.a;
                        a39 l = at7.l(f39);
                        if (l != null) {
                            ArrayList arrayList = new ArrayList(l.a.length);
                            F(l, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.O0 = new a39(G(f39.Z), (x29[]) arrayList.toArray(new x29[0]));
                            }
                        }
                    }
                } else if (y == -5) {
                    xu5 xu5 = (xu5) qe4.c;
                    xu5.getClass();
                    this.N0 = xu5.s;
                }
            }
            a39 a39 = this.O0;
            if (a39 == null || a39.b > G(j)) {
                z = false;
            } else {
                a39 a392 = this.O0;
                Handler handler = this.I0;
                if (handler != null) {
                    handler.obtainMessage(1, a392).sendToTarget();
                } else {
                    H(a392);
                }
                this.O0 = null;
                z = true;
            }
            if (this.L0 && this.O0 == null) {
                this.M0 = true;
            }
        }
    }
}
