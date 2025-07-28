package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.Collections;
import java.util.List;

/* renamed from: zfe  reason: default package */
public final class zfe extends pi0 implements Handler.Callback {
    public final Handler B0;
    public final g45 C0;
    public final g02 D0;
    public final otf E0;
    public boolean F0;
    public boolean G0;
    public boolean H0;
    public int I0;
    public vu5 J0;
    public i1e K0;
    public n1e L0;
    public p1e M0;
    public p1e N0;
    public int O0;
    public long P0;

    /* JADX WARNING: type inference failed for: r3v2, types: [otf, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zfe(g45 g45, Looper looper) {
        super(3);
        Handler handler;
        g02 g02 = g02.Y;
        this.C0 = g45;
        if (looper == null) {
            handler = null;
        } else {
            int i = mze.a;
            handler = new Handler(looper, this);
        }
        this.B0 = handler;
        this.D0 = g02;
        this.E0 = new Object();
        this.P0 = -9223372036854775807L;
    }

    public final int A(vu5 vu5) {
        this.D0.getClass();
        String str = vu5.A0;
        if (!"text/vtt".equals(str) && !"text/x-ssa".equals(str) && !"application/ttml+xml".equals(str) && !"application/x-mp4-vtt".equals(str) && !"application/x-subrip".equals(str) && !"application/x-quicktime-tx3g".equals(str) && !"application/cea-608".equals(str) && !"application/x-mp4-cea-608".equals(str) && !"application/cea-708".equals(str) && !"application/dvbsubs".equals(str) && !"application/pgs".equals(str) && !"text/x-exoplayer-cues".equals(str)) {
            return b49.i(vu5.A0) ? pi0.b(1, 0, 0) : pi0.b(0, 0, 0);
        }
        return pi0.b(vu5.T0 == 0 ? 4 : 2, 0, 0);
    }

    public final long C() {
        if (this.O0 == -1) {
            return Long.MAX_VALUE;
        }
        this.M0.getClass();
        if (this.O0 >= this.M0.u()) {
            return Long.MAX_VALUE;
        }
        return this.M0.k(this.O0);
    }

    public final void D(SubtitleDecoderException subtitleDecoderException) {
        String valueOf = String.valueOf(this.J0);
        StringBuilder sb = new StringBuilder(valueOf.length() + 39);
        sb.append("Subtitle decoding failed. streamFormat=");
        sb.append(valueOf);
        oyb.b(sb.toString(), subtitleDecoderException);
        List emptyList = Collections.emptyList();
        Handler handler = this.B0;
        if (handler != null) {
            handler.obtainMessage(0, emptyList).sendToTarget();
        } else {
            m45 m45 = this.C0.a;
            m45.getClass();
            m45.B0.m(27, new d52(4, emptyList));
        }
        F();
        i1e i1e = this.K0;
        i1e.getClass();
        i1e.release();
        this.K0 = null;
        this.I0 = 0;
        E();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009b, code lost:
        if (r2.equals("application/pgs") == false) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ef, code lost:
        r6.K0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f1, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E() {
        /*
            r6 = this;
            r0 = 1
            r6.H0 = r0
            vu5 r1 = r6.J0
            r1.getClass()
            g02 r2 = r6.D0
            r2.getClass()
            java.lang.String r2 = r1.A0
            if (r2 == 0) goto L_0x00f2
            int r3 = r1.S0
            java.util.List r1 = r1.C0
            r4 = -1
            int r5 = r2.hashCode()
            switch(r5) {
                case -1351681404: goto L_0x009f;
                case -1248334819: goto L_0x0095;
                case -1026075066: goto L_0x008a;
                case -1004728940: goto L_0x007f;
                case 691401887: goto L_0x0074;
                case 822864842: goto L_0x0069;
                case 930165504: goto L_0x005e;
                case 1201784583: goto L_0x0053;
                case 1566015601: goto L_0x0047;
                case 1566016562: goto L_0x003a;
                case 1668750253: goto L_0x002d;
                case 1693976202: goto L_0x0020;
                default: goto L_0x001d;
            }
        L_0x001d:
            r0 = r4
            goto L_0x00aa
        L_0x0020:
            java.lang.String r0 = "application/ttml+xml"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0029
            goto L_0x001d
        L_0x0029:
            r0 = 11
            goto L_0x00aa
        L_0x002d:
            java.lang.String r0 = "application/x-subrip"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0036
            goto L_0x001d
        L_0x0036:
            r0 = 10
            goto L_0x00aa
        L_0x003a:
            java.lang.String r0 = "application/cea-708"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0043
            goto L_0x001d
        L_0x0043:
            r0 = 9
            goto L_0x00aa
        L_0x0047:
            java.lang.String r0 = "application/cea-608"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0050
            goto L_0x001d
        L_0x0050:
            r0 = 8
            goto L_0x00aa
        L_0x0053:
            java.lang.String r0 = "text/x-exoplayer-cues"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x005c
            goto L_0x001d
        L_0x005c:
            r0 = 7
            goto L_0x00aa
        L_0x005e:
            java.lang.String r0 = "application/x-mp4-cea-608"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0067
            goto L_0x001d
        L_0x0067:
            r0 = 6
            goto L_0x00aa
        L_0x0069:
            java.lang.String r0 = "text/x-ssa"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0072
            goto L_0x001d
        L_0x0072:
            r0 = 5
            goto L_0x00aa
        L_0x0074:
            java.lang.String r0 = "application/x-quicktime-tx3g"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x007d
            goto L_0x001d
        L_0x007d:
            r0 = 4
            goto L_0x00aa
        L_0x007f:
            java.lang.String r0 = "text/vtt"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0088
            goto L_0x001d
        L_0x0088:
            r0 = 3
            goto L_0x00aa
        L_0x008a:
            java.lang.String r0 = "application/x-mp4-vtt"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0093
            goto L_0x001d
        L_0x0093:
            r0 = 2
            goto L_0x00aa
        L_0x0095:
            java.lang.String r5 = "application/pgs"
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L_0x00aa
            goto L_0x001d
        L_0x009f:
            java.lang.String r0 = "application/dvbsubs"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x00a9
            goto L_0x001d
        L_0x00a9:
            r0 = 0
        L_0x00aa:
            switch(r0) {
                case 0: goto L_0x00ea;
                case 1: goto L_0x00e4;
                case 2: goto L_0x00de;
                case 3: goto L_0x00d8;
                case 4: goto L_0x00d2;
                case 5: goto L_0x00cc;
                case 6: goto L_0x00c6;
                case 7: goto L_0x00c0;
                case 8: goto L_0x00c6;
                case 9: goto L_0x00ba;
                case 10: goto L_0x00b4;
                case 11: goto L_0x00ae;
                default: goto L_0x00ad;
            }
        L_0x00ad:
            goto L_0x00f2
        L_0x00ae:
            sse r0 = new sse
            r0.<init>()
            goto L_0x00ef
        L_0x00b4:
            y0e r0 = new y0e
            r0.<init>()
            goto L_0x00ef
        L_0x00ba:
            xx1 r0 = new xx1
            r0.<init>(r3, r1)
            goto L_0x00ef
        L_0x00c0:
            ex r0 = new ex
            r0.<init>()
            goto L_0x00ef
        L_0x00c6:
            qx1 r0 = new qx1
            r0.<init>(r2, r3)
            goto L_0x00ef
        L_0x00cc:
            mnd r0 = new mnd
            r0.<init>(r1)
            goto L_0x00ef
        L_0x00d2:
            ate r0 = new ate
            r0.<init>(r1)
            goto L_0x00ef
        L_0x00d8:
            tqf r0 = new tqf
            r0.<init>()
            goto L_0x00ef
        L_0x00de:
            fq4 r0 = new fq4
            r0.<init>()
            goto L_0x00ef
        L_0x00e4:
            aoa r0 = new aoa
            r0.<init>()
            goto L_0x00ef
        L_0x00ea:
            fq4 r0 = new fq4
            r0.<init>(r1)
        L_0x00ef:
            r6.K0 = r0
            return
        L_0x00f2:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = java.lang.String.valueOf(r2)
            int r1 = r0.length()
            java.lang.String r2 = "Attempted to create decoder for unsupported MIME type: "
            if (r1 == 0) goto L_0x0105
            java.lang.String r0 = r2.concat(r0)
            goto L_0x010a
        L_0x0105:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
        L_0x010a:
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zfe.E():void");
    }

    public final void F() {
        this.L0 = null;
        this.O0 = -1;
        p1e p1e = this.M0;
        if (p1e != null) {
            p1e.v();
            this.M0 = null;
        }
        p1e p1e2 = this.N0;
        if (p1e2 != null) {
            p1e2.v();
            this.N0 = null;
        }
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            m45 m45 = this.C0.a;
            m45.getClass();
            m45.B0.m(27, new d52(4, (List) message.obj));
            return true;
        }
        throw new IllegalStateException();
    }

    public final String k() {
        return "TextRenderer";
    }

    public final boolean m() {
        return this.G0;
    }

    public final boolean n() {
        return true;
    }

    public final void o() {
        this.J0 = null;
        this.P0 = -9223372036854775807L;
        List emptyList = Collections.emptyList();
        Handler handler = this.B0;
        if (handler != null) {
            handler.obtainMessage(0, emptyList).sendToTarget();
        } else {
            m45 m45 = this.C0.a;
            m45.getClass();
            m45.B0.m(27, new d52(4, emptyList));
        }
        F();
        i1e i1e = this.K0;
        i1e.getClass();
        i1e.release();
        this.K0 = null;
        this.I0 = 0;
    }

    public final void q(long j, boolean z) {
        List emptyList = Collections.emptyList();
        Handler handler = this.B0;
        if (handler != null) {
            handler.obtainMessage(0, emptyList).sendToTarget();
        } else {
            m45 m45 = this.C0.a;
            m45.getClass();
            m45.B0.m(27, new d52(4, emptyList));
        }
        this.F0 = false;
        this.G0 = false;
        this.P0 = -9223372036854775807L;
        if (this.I0 != 0) {
            F();
            i1e i1e = this.K0;
            i1e.getClass();
            i1e.release();
            this.K0 = null;
            this.I0 = 0;
            E();
            return;
        }
        F();
        i1e i1e2 = this.K0;
        i1e2.getClass();
        i1e2.flush();
    }

    public final void u(vu5[] vu5Arr, long j, long j2) {
        this.J0 = vu5Arr[0];
        if (this.K0 != null) {
            this.I0 = 1;
        } else {
            E();
        }
    }

    public final void w(long j, long j2) {
        boolean z;
        otf otf = this.E0;
        if (this.z0) {
            long j3 = this.P0;
            if (j3 != -9223372036854775807L && j >= j3) {
                F();
                this.G0 = true;
            }
        }
        if (!this.G0) {
            if (this.N0 == null) {
                i1e i1e = this.K0;
                i1e.getClass();
                i1e.a(j);
                try {
                    i1e i1e2 = this.K0;
                    i1e2.getClass();
                    this.N0 = i1e2.c();
                } catch (SubtitleDecoderException e) {
                    D(e);
                    return;
                }
            }
            if (this.Y == 2) {
                if (this.M0 != null) {
                    long C = C();
                    z = false;
                    while (C <= j) {
                        this.O0++;
                        C = C();
                        z = true;
                    }
                } else {
                    z = false;
                }
                p1e p1e = this.N0;
                if (p1e != null) {
                    if (p1e.f(4)) {
                        if (!z && C() == Long.MAX_VALUE) {
                            if (this.I0 == 2) {
                                F();
                                i1e i1e3 = this.K0;
                                i1e3.getClass();
                                i1e3.release();
                                this.K0 = null;
                                this.I0 = 0;
                                E();
                            } else {
                                F();
                                this.G0 = true;
                            }
                        }
                    } else if (p1e.c <= j) {
                        p1e p1e2 = this.M0;
                        if (p1e2 != null) {
                            p1e2.v();
                        }
                        this.O0 = p1e.h(j);
                        this.M0 = p1e;
                        this.N0 = null;
                        z = true;
                    }
                }
                if (z) {
                    this.M0.getClass();
                    List q = this.M0.q(j);
                    Handler handler = this.B0;
                    if (handler != null) {
                        handler.obtainMessage(0, q).sendToTarget();
                    } else {
                        m45 m45 = this.C0.a;
                        m45.getClass();
                        m45.B0.m(27, new d52(4, q));
                    }
                }
                if (this.I0 != 2) {
                    while (!this.F0) {
                        try {
                            n1e n1e = this.L0;
                            if (n1e == null) {
                                i1e i1e4 = this.K0;
                                i1e4.getClass();
                                n1e = (n1e) i1e4.e();
                                if (n1e != null) {
                                    this.L0 = n1e;
                                } else {
                                    return;
                                }
                            }
                            if (this.I0 == 1) {
                                n1e.b = 4;
                                i1e i1e5 = this.K0;
                                i1e5.getClass();
                                i1e5.l(n1e);
                                this.L0 = null;
                                this.I0 = 2;
                                return;
                            }
                            int v = v(otf, n1e, 0);
                            if (v == -4) {
                                if (n1e.f(4)) {
                                    this.F0 = true;
                                    this.H0 = false;
                                } else {
                                    vu5 vu5 = (vu5) otf.b;
                                    if (vu5 != null) {
                                        n1e.y0 = vu5.E0;
                                        n1e.y();
                                        this.H0 &= !n1e.f(1);
                                    } else {
                                        return;
                                    }
                                }
                                if (!this.H0) {
                                    i1e i1e6 = this.K0;
                                    i1e6.getClass();
                                    i1e6.l(n1e);
                                    this.L0 = null;
                                }
                            } else if (v == -3) {
                                return;
                            }
                        } catch (SubtitleDecoderException e2) {
                            D(e2);
                            return;
                        }
                    }
                }
            }
        }
    }
}
