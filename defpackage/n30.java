package defpackage;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import one.me.calls.impl.service.CallServiceImpl;
import org.webrtc.HardwareVideoEncoder;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VpxDecoderWrapper;

/* renamed from: n30  reason: default package */
public final /* synthetic */ class n30 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n30(int i, int i2, Object obj) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    public final void run() {
        List<xc4> list;
        ScheduledFuture scheduledFuture;
        hx4 hx4;
        hu1 c2;
        int i = 2;
        int i2 = 1;
        switch (this.a) {
            case 0:
                p30 p30 = (p30) ((o30) this.c).c;
                p30.getClass();
                int i3 = this.b;
                if (i3 == -3 || i3 == -2) {
                    if (i3 != -2) {
                        j20 j20 = (j20) p30.i;
                        if (!(j20 != null && j20.a == 1)) {
                            p30.c(3);
                            return;
                        }
                    }
                    g45 g45 = (g45) p30.h;
                    if (g45 != null) {
                        m45 m45 = g45.a;
                        boolean u = m45.u();
                        if (u) {
                            i2 = 2;
                        }
                        m45.p2(0, i2, u);
                    }
                    p30.c(2);
                    return;
                } else if (i3 == -1) {
                    g45 g452 = (g45) p30.h;
                    if (g452 != null) {
                        m45 m452 = g452.a;
                        boolean u2 = m452.u();
                        if (!u2) {
                            i = 1;
                        }
                        m452.p2(-1, i, u2);
                    }
                    p30.a();
                    return;
                } else if (i3 == 1) {
                    p30.c(1);
                    g45 g453 = (g45) p30.h;
                    if (g453 != null) {
                        m45 m453 = g453.a;
                        m453.p2(1, 1, m453.u());
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 1:
                p30 p302 = (p30) ((o30) this.c).c;
                p302.getClass();
                int i4 = this.b;
                if (i4 == -3 || i4 == -2) {
                    if (i4 != -2) {
                        k20 k20 = (k20) p302.i;
                        if (!(k20 != null && k20.a == 1)) {
                            p302.c(4);
                            return;
                        }
                    }
                    h45 h45 = (h45) p302.h;
                    if (h45 != null) {
                        n45 n45 = h45.a;
                        n45.s2(0, 1, n45.u());
                    }
                    p302.c(3);
                    return;
                } else if (i4 == -1) {
                    h45 h452 = (h45) p302.h;
                    if (h452 != null) {
                        n45 n452 = h452.a;
                        n452.s2(-1, 2, n452.u());
                    }
                    p302.a();
                    p302.c(1);
                    return;
                } else if (i4 != 1) {
                    us8.l(i4, "Unknown focus change type: ");
                    return;
                } else {
                    p302.c(2);
                    h45 h453 = (h45) p302.h;
                    if (h453 != null) {
                        n45 n453 = h453.a;
                        n453.s2(1, 1, n453.u());
                        return;
                    }
                    return;
                }
            case 2:
                ls0 ls0 = (ls0) this.c;
                int i5 = ls0.l;
                int i6 = this.b;
                if (i5 != i6) {
                    int i7 = ls0.h;
                    ls0.l = (i6 / i7) * i7;
                    return;
                }
                return;
            case 3:
                dj1 dj1 = CallServiceImpl.w0;
                CallServiceImpl callServiceImpl = (CallServiceImpl) this.c;
                if (!((ep1) ((so1) callServiceImpl.b.getValue())).p()) {
                    a0d.a(callServiceImpl, 1);
                    callServiceImpl.stopSelfResult(this.b);
                    return;
                }
                return;
            case 4:
                ((ps1) this.c).a(this.b);
                return;
            case 5:
                ((st1) this.c).b = this.b;
                return;
            case 6:
                int i8 = this.b;
                Iterator it = ((LinkedHashSet) this.c).iterator();
                while (it.hasNext()) {
                    q7e q7e = (q7e) ((p7e) it.next());
                    if (i8 == 5) {
                        synchronized (q7e.o) {
                            try {
                                if (q7e.l() && (list = q7e.p) != null) {
                                    for (xc4 a2 : list) {
                                        a2.a();
                                    }
                                }
                            } finally {
                            }
                        }
                    } else {
                        q7e.getClass();
                    }
                }
                return;
            case 7:
                r24 r24 = (r24) this.c;
                r24.getClass();
                VpxDecoderWrapper.DecoderKind decoderKind = VpxDecoderWrapper.DecoderKind.values()[hr1.t(this.b)];
                VpxDecoderWrapper vpxDecoderWrapper = r24.a;
                vpxDecoderWrapper.init(decoderKind);
                vpxDecoderWrapper.setFrameHandler(r24);
                vpxDecoderWrapper.setErrorCallback(r24);
                vpxDecoderWrapper.setDesiredFps(10);
                return;
            case 8:
                vx4 vx4 = (vx4) this.c;
                boolean z = vx4.j;
                xx4 xx4 = vx4.k;
                if (z) {
                    String str = xx4.a;
                    return;
                }
                switch (hr1.t(xx4.D)) {
                    case 0:
                    case 7:
                    case 8:
                        return;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        xx4.k.offer(Integer.valueOf(this.b));
                        xx4.c();
                        return;
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(me4.r(xx4.D)));
                }
            case 9:
                ((ty4) this.c).P0(this.b + 1);
                return;
            case 10:
                HardwareVideoEncoder.a((HardwareVideoEncoder) this.c, this.b);
                return;
            case 11:
                ((o48) this.c).j.remove(Integer.valueOf(this.b));
                return;
            case 12:
                ((jq8) this.c).h(this.b);
                return;
            case 13:
                y5c y5c = (y5c) this.c;
                int i9 = y5c.g0;
                int i10 = this.b;
                y5c.g0 = i10;
                if (i9 == i10) {
                    return;
                }
                if (i10 == 3) {
                    if (y5c.B == null) {
                        ug4 ug4 = y5c.e0;
                        if (ug4 != null) {
                            if (!ug4.b) {
                                ug4.b = true;
                                ScheduledFuture scheduledFuture2 = (ScheduledFuture) ug4.f;
                                if (scheduledFuture2 != null) {
                                    scheduledFuture2.cancel(false);
                                    ug4.f = null;
                                }
                            }
                            y5c.e0 = null;
                        }
                        y5c.v(false);
                        return;
                    }
                    y5c.Z = true;
                    na0 na0 = y5c.q;
                    if (na0 != null && !na0.A0) {
                        y5c.s(na0, 4, (IOException) null);
                        return;
                    }
                    return;
                } else if (i10 == 2 && (scheduledFuture = y5c.Y) != null && scheduledFuture.cancel(false) && (hx4 = y5c.F) != null) {
                    y5c.r(hx4);
                    return;
                } else {
                    return;
                }
            case 14:
                ((vx3) this.c).D(this.b);
                return;
            case 15:
                tfc tfc = (tfc) this.c;
                if (tfc.c.get()) {
                    st1 st1 = (st1) tfc.a.b;
                    kp6 kp6 = st1.e;
                    int i11 = this.b;
                    if (kp6.B(i11) && (c2 = kp6.c()) != null) {
                        kp6.p.a = kp6.h(c2, false);
                    }
                    bq6 bq6 = st1.d;
                    int k = bq6.k();
                    if (bq6.B(i11) && bq6.t != null) {
                        bq6.t = am7.o(Math.abs(z3d.O(i11) - z3d.O(k)), bq6.t);
                    }
                    h2f h2f = st1.f;
                    if (h2f.B(i11)) {
                        h2f.P();
                        return;
                    }
                    return;
                }
                return;
            case 16:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.c;
                View view = (View) sideSheetBehavior.p.get();
                if (view != null) {
                    sideSheetBehavior.A(this.b, view, false);
                    return;
                }
                return;
            default:
                SurfaceTextureHelper.f((SurfaceTextureHelper) this.c, this.b);
                return;
        }
    }
}
