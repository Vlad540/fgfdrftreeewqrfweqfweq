package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import androidx.media3.extractor.text.SubtitleDecoderException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Objects;

/* renamed from: age  reason: default package */
public final class age extends qi0 implements Handler.Callback {
    public final om3 G0;
    public final n24 H0;
    public ww3 I0;
    public final k1e J0;
    public boolean K0;
    public int L0;
    public j1e M0;
    public o1e N0;
    public q1e O0;
    public q1e P0;
    public int Q0;
    public final Handler R0;
    public final h45 S0;
    public final qe4 T0;
    public boolean U0;
    public boolean V0;
    public xu5 W0;
    public long X0;
    public long Y0;
    public long Z0;

    /* JADX WARNING: type inference failed for: r3v2, types: [om3, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public age(h45 h45, Looper looper) {
        super(3);
        Handler handler;
        wwc wwc = k1e.V;
        this.S0 = h45;
        if (looper == null) {
            handler = null;
        } else {
            int i = oze.a;
            handler = new Handler(looper, this);
        }
        this.R0 = handler;
        this.J0 = wwc;
        this.G0 = new Object();
        this.H0 = new n24(1);
        this.T0 = new qe4(19);
        this.Z0 = -9223372036854775807L;
        this.X0 = -9223372036854775807L;
        this.Y0 = -9223372036854775807L;
    }

    public final int D(xu5 xu5) {
        if (!Objects.equals(xu5.n, "application/x-media3-cues")) {
            wwc wwc = this.J0;
            wwc.getClass();
            if (!((smc) wwc.b).b(xu5)) {
                String str = xu5.n;
                if (!Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                    return c49.j(str) ? qi0.b(1, 0, 0, 0) : qi0.b(0, 0, 0, 0);
                }
            }
        }
        return qi0.b(xu5.K == 0 ? 4 : 2, 0, 0, 0);
    }

    public final void F() {
        boolean z = Objects.equals(this.W0.n, "application/cea-608") || Objects.equals(this.W0.n, "application/x-mp4-cea-608") || Objects.equals(this.W0.n, "application/cea-708");
        oyb.j("Legacy decoding is disabled, can't handle " + this.W0.n + " samples (expected application/x-media3-cues).", z);
    }

    public final long G() {
        if (this.Q0 == -1) {
            return Long.MAX_VALUE;
        }
        this.O0.getClass();
        if (this.Q0 >= this.O0.u()) {
            return Long.MAX_VALUE;
        }
        return this.O0.k(this.Q0);
    }

    public final long H(long j) {
        boolean z = false;
        oyb.k(j != -9223372036854775807L);
        if (this.X0 != -9223372036854775807L) {
            z = true;
        }
        oyb.k(z);
        return j - this.X0;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0030, code lost:
        if (r3.equals("application/cea-608") == false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void J() {
        /*
            r7 = this;
            r0 = 1
            r7.K0 = r0
            xu5 r1 = r7.W0
            r1.getClass()
            k1e r2 = r7.J0
            wwc r2 = (wwc) r2
            r2.getClass()
            java.lang.String r3 = r1.n
            if (r3 == 0) goto L_0x004f
            int r4 = r1.G
            r5 = -1
            int r6 = r3.hashCode()
            switch(r6) {
                case 930165504: goto L_0x0033;
                case 1566015601: goto L_0x002a;
                case 1566016562: goto L_0x001f;
                default: goto L_0x001d;
            }
        L_0x001d:
            r0 = r5
            goto L_0x003d
        L_0x001f:
            java.lang.String r0 = "application/cea-708"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0028
            goto L_0x001d
        L_0x0028:
            r0 = 2
            goto L_0x003d
        L_0x002a:
            java.lang.String r6 = "application/cea-608"
            boolean r6 = r3.equals(r6)
            if (r6 != 0) goto L_0x003d
            goto L_0x001d
        L_0x0033:
            java.lang.String r0 = "application/x-mp4-cea-608"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x003c
            goto L_0x001d
        L_0x003c:
            r0 = 0
        L_0x003d:
            switch(r0) {
                case 0: goto L_0x0049;
                case 1: goto L_0x0049;
                case 2: goto L_0x0041;
                default: goto L_0x0040;
            }
        L_0x0040:
            goto L_0x004f
        L_0x0041:
            yx1 r0 = new yx1
            java.util.List r1 = r1.q
            r0.<init>(r4, r1)
            goto L_0x0070
        L_0x0049:
            rx1 r0 = new rx1
            r0.<init>(r3, r4)
            goto L_0x0070
        L_0x004f:
            java.lang.Object r0 = r2.b
            smc r0 = (smc) r0
            boolean r2 = r0.b(r1)
            if (r2 == 0) goto L_0x0078
            u1e r0 = r0.d(r1)
            qm0 r1 = new qm0
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getSimpleName()
            java.lang.String r3 = "Decoder"
            r2.concat(r3)
            r1.<init>((defpackage.u1e) r0)
            r0 = r1
        L_0x0070:
            r7.M0 = r0
            long r1 = r7.A0
            r0.b(r1)
            return
        L_0x0078:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Attempted to create decoder for unsupported MIME type: "
            java.lang.String r0 = rf0.h(r0, r3)
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.age.J():void");
    }

    public final void K(vw3 vw3) {
        ws6 ws6 = vw3.a;
        h45 h45 = this.S0;
        h45.a.B0.f(27, new d52(5, ws6));
        n45 n45 = h45.a;
        n45.n1 = vw3;
        n45.B0.f(27, new r34(15, (Object) vw3));
    }

    public final void L() {
        this.N0 = null;
        this.Q0 = -1;
        q1e q1e = this.O0;
        if (q1e != null) {
            q1e.w();
            this.O0 = null;
        }
        q1e q1e2 = this.P0;
        if (q1e2 != null) {
            q1e2.w();
            this.P0 = null;
        }
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            K((vw3) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    public final String l() {
        return "TextRenderer";
    }

    public final boolean n() {
        return this.V0;
    }

    public final boolean p() {
        return true;
    }

    public final void q() {
        this.W0 = null;
        this.Z0 = -9223372036854775807L;
        vw3 vw3 = new vw3(H(this.Y0), e8c.X);
        Handler handler = this.R0;
        if (handler != null) {
            handler.obtainMessage(1, vw3).sendToTarget();
        } else {
            K(vw3);
        }
        this.X0 = -9223372036854775807L;
        this.Y0 = -9223372036854775807L;
        if (this.M0 != null) {
            L();
            j1e j1e = this.M0;
            j1e.getClass();
            j1e.release();
            this.M0 = null;
            this.L0 = 0;
        }
    }

    public final void s(long j, boolean z) {
        this.Y0 = j;
        ww3 ww3 = this.I0;
        if (ww3 != null) {
            ww3.clear();
        }
        vw3 vw3 = new vw3(H(this.Y0), e8c.X);
        Handler handler = this.R0;
        if (handler != null) {
            handler.obtainMessage(1, vw3).sendToTarget();
        } else {
            K(vw3);
        }
        this.U0 = false;
        this.V0 = false;
        this.Z0 = -9223372036854775807L;
        xu5 xu5 = this.W0;
        if (xu5 != null && !Objects.equals(xu5.n, "application/x-media3-cues")) {
            if (this.L0 != 0) {
                L();
                j1e j1e = this.M0;
                j1e.getClass();
                j1e.release();
                this.M0 = null;
                this.L0 = 0;
                J();
                return;
            }
            L();
            j1e j1e2 = this.M0;
            j1e2.getClass();
            j1e2.flush();
            j1e2.b(this.A0);
        }
    }

    public final void x(xu5[] xu5Arr, long j, long j2) {
        this.X0 = j2;
        xu5 xu5 = xu5Arr[0];
        this.W0 = xu5;
        if (!Objects.equals(xu5.n, "application/x-media3-cues")) {
            F();
            if (this.M0 != null) {
                this.L0 = 1;
            } else {
                J();
            }
        } else {
            this.I0 = this.W0.H == 1 ? new nm8() : new xe6(2);
        }
    }

    public final void z(long j, long j2) {
        boolean z;
        long j3;
        long j4 = j;
        if (this.C0) {
            long j5 = this.Z0;
            if (j5 != -9223372036854775807L && j4 >= j5) {
                L();
                this.V0 = true;
            }
        }
        if (!this.V0) {
            xu5 xu5 = this.W0;
            xu5.getClass();
            boolean equals = Objects.equals(xu5.n, "application/x-media3-cues");
            Handler handler = this.R0;
            int i = 0;
            qe4 qe4 = this.T0;
            if (equals) {
                this.I0.getClass();
                if (!this.U0) {
                    n24 n24 = this.H0;
                    if (y(qe4, n24, 0) == -4) {
                        if (n24.f(4)) {
                            this.U0 = true;
                        } else {
                            n24.y();
                            ByteBuffer byteBuffer = n24.X;
                            byteBuffer.getClass();
                            long j6 = n24.Z;
                            byte[] array = byteBuffer.array();
                            int arrayOffset = byteBuffer.arrayOffset();
                            int limit = byteBuffer.limit();
                            this.G0.getClass();
                            Parcel obtain = Parcel.obtain();
                            obtain.unmarshall(array, arrayOffset, limit);
                            obtain.setDataPosition(0);
                            Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
                            obtain.recycle();
                            ArrayList parcelableArrayList = readBundle.getParcelableArrayList("c");
                            parcelableArrayList.getClass();
                            ts6 i2 = ws6.i();
                            while (i < parcelableArrayList.size()) {
                                Bundle bundle = (Bundle) parcelableArrayList.get(i);
                                bundle.getClass();
                                i2.a(uw3.a(bundle));
                                i++;
                            }
                            xw3 xw3 = new xw3(j6, readBundle.getLong("d"), i2.j());
                            n24.v();
                            i = this.I0.b(xw3, j4);
                        }
                    }
                }
                long a = this.I0.a(this.Y0);
                int i3 = (a > Long.MIN_VALUE ? 1 : (a == Long.MIN_VALUE ? 0 : -1));
                if (i3 == 0 && this.U0 && i == 0) {
                    this.V0 = true;
                }
                if (i3 != 0 && a <= j4) {
                    i = 1;
                }
                if (i != 0) {
                    ws6 c = this.I0.c(j4);
                    long d = this.I0.d(j4);
                    vw3 vw3 = new vw3(H(d), c);
                    if (handler != null) {
                        handler.obtainMessage(1, vw3).sendToTarget();
                    } else {
                        K(vw3);
                    }
                    this.I0.e(d);
                }
                this.Y0 = j4;
                return;
            }
            F();
            this.Y0 = j4;
            if (this.P0 == null) {
                j1e j1e = this.M0;
                j1e.getClass();
                j1e.a(j4);
                try {
                    j1e j1e2 = this.M0;
                    j1e2.getClass();
                    this.P0 = (q1e) j1e2.c();
                } catch (SubtitleDecoderException e) {
                    ez3.B("Subtitle decoding failed. streamFormat=" + this.W0, e);
                    vw3 vw32 = new vw3(H(this.Y0), e8c.X);
                    if (handler != null) {
                        handler.obtainMessage(1, vw32).sendToTarget();
                    } else {
                        K(vw32);
                    }
                    L();
                    j1e j1e3 = this.M0;
                    j1e3.getClass();
                    j1e3.release();
                    this.M0 = null;
                    this.L0 = 0;
                    J();
                    return;
                }
            }
            if (this.w0 == 2) {
                if (this.O0 != null) {
                    long G = G();
                    z = false;
                    while (G <= j4) {
                        this.Q0++;
                        G = G();
                        z = true;
                    }
                } else {
                    z = false;
                }
                q1e q1e = this.P0;
                if (q1e != null) {
                    if (q1e.f(4)) {
                        if (!z && G() == Long.MAX_VALUE) {
                            if (this.L0 == 2) {
                                L();
                                j1e j1e4 = this.M0;
                                j1e4.getClass();
                                j1e4.release();
                                this.M0 = null;
                                this.L0 = 0;
                                J();
                            } else {
                                L();
                                this.V0 = true;
                            }
                        }
                    } else if (q1e.c <= j4) {
                        q1e q1e2 = this.O0;
                        if (q1e2 != null) {
                            q1e2.w();
                        }
                        this.Q0 = q1e.h(j4);
                        this.O0 = q1e;
                        this.P0 = null;
                        z = true;
                    }
                }
                if (z) {
                    this.O0.getClass();
                    int h = this.O0.h(j4);
                    if (h == 0 || this.O0.u() == 0) {
                        j3 = this.O0.c;
                    } else if (h == -1) {
                        q1e q1e3 = this.O0;
                        j3 = q1e3.k(q1e3.u() - 1);
                    } else {
                        j3 = this.O0.k(h - 1);
                    }
                    vw3 vw33 = new vw3(H(j3), this.O0.q(j4));
                    if (handler != null) {
                        handler.obtainMessage(1, vw33).sendToTarget();
                    } else {
                        K(vw33);
                    }
                }
                if (this.L0 != 2) {
                    while (!this.U0) {
                        try {
                            o1e o1e = this.N0;
                            if (o1e == null) {
                                j1e j1e5 = this.M0;
                                j1e5.getClass();
                                o1e = (o1e) j1e5.e();
                                if (o1e != null) {
                                    this.N0 = o1e;
                                } else {
                                    return;
                                }
                            }
                            if (this.L0 == 1) {
                                o1e.b = 4;
                                j1e j1e6 = this.M0;
                                j1e6.getClass();
                                j1e6.d(o1e);
                                this.N0 = null;
                                this.L0 = 2;
                                return;
                            }
                            int y = y(qe4, o1e, 0);
                            if (y == -4) {
                                if (o1e.f(4)) {
                                    this.U0 = true;
                                    this.K0 = false;
                                } else {
                                    xu5 xu52 = (xu5) qe4.c;
                                    if (xu52 != null) {
                                        o1e.z0 = xu52.s;
                                        o1e.y();
                                        this.K0 &= !o1e.f(1);
                                    } else {
                                        return;
                                    }
                                }
                                if (!this.K0) {
                                    j1e j1e7 = this.M0;
                                    j1e7.getClass();
                                    j1e7.d(o1e);
                                    this.N0 = null;
                                }
                            } else if (y == -3) {
                                return;
                            }
                        } catch (SubtitleDecoderException e2) {
                            ez3.B("Subtitle decoding failed. streamFormat=" + this.W0, e2);
                            vw3 vw34 = new vw3(H(this.Y0), e8c.X);
                            if (handler != null) {
                                handler.obtainMessage(1, vw34).sendToTarget();
                            } else {
                                K(vw34);
                            }
                            L();
                            j1e j1e8 = this.M0;
                            j1e8.getClass();
                            j1e8.release();
                            this.M0 = null;
                            this.L0 = 0;
                            J();
                            return;
                        }
                    }
                }
            }
        }
    }
}
