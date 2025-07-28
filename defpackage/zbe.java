package defpackage;

import android.graphics.drawable.Drawable;
import android.view.Surface;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import one.me.sdk.zoom.ZoomableDraweeView;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.VideoFileRenderer;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSource;
import ru.ok.android.externcalls.sdk.watch_together.internal.listener.WatchTogetherListenerManagerImpl;
import ru.ok.android.externcalls.sdk.watch_together.listener.WatchTogetherListener;
import ru.ok.tamtam.nano.Protos;

/* renamed from: zbe  reason: default package */
public final /* synthetic */ class zbe implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zbe(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                j6 j6Var = (j6) this.c;
                bce bce = (bce) this.b;
                bce.getClass();
                try {
                    j6Var.run();
                    return;
                } catch (Throwable th) {
                    Throwable th2 = th;
                    udd.s("bce", "fail", th2);
                    ((g15) bce.k.getValue()).c(th2, true);
                    return;
                }
            case 1:
                u1d u1d = (u1d) this.b;
                dce dce = (dce) this.c;
                if (u1d.f.get() != 1) {
                    String str = dce.x0;
                    fn6 fn6 = udd.e;
                    if (fn6 != null && fn6.c()) {
                        tn7 tn7 = tn7.X;
                        fn6.d(tn7, str, "old_session=" + u1d + " close", (Throwable) null);
                    }
                    u1d.d(true);
                    return;
                }
                return;
            case 2:
                jhe jhe = (jhe) this.b;
                y4e y4e = jhe.h;
                if (y4e != null && y4e == ((y4e) this.c)) {
                    jhe.h = null;
                    jhe.g = null;
                }
                xz xzVar = jhe.l;
                if (xzVar != null) {
                    xzVar.h();
                    jhe.l = null;
                    return;
                }
                return;
            case 3:
                Runnable runnable = (Runnable) this.b;
                qm qmVar = (qm) this.c;
                try {
                    runnable.run();
                    qmVar.a();
                    return;
                } catch (Throwable th3) {
                    Throwable th4 = th3;
                    qmVar.a();
                    throw th4;
                }
            case 4:
                oqe oqe = (oqe) this.b;
                oqe.getClass();
                e8c j = ((ts6) this.c).j();
                ydc ydc = oqe.d;
                String str2 = (String) ydc.c;
                String str3 = (String) ydc.o;
                kqe kqe = (kqe) oqe.e.a;
                kqe.q.a.e(j);
                m55 m55 = kqe.q;
                if (str2 != null) {
                    m55.g = str2;
                }
                if (str3 != null) {
                    m55.n = str3;
                }
                kqe.r = null;
                int i = kqe.v;
                if (i == 1) {
                    kqe.v = 2;
                    j93 j93 = kqe.t;
                    j93.getClass();
                    udd.g(j93, true, false);
                    kqe.s.getClass();
                    kqe.s.b();
                    throw null;
                } else if (i == 2) {
                    kqe.s = null;
                    kqe.v = 3;
                    throw null;
                } else if (i == 3) {
                    kqe.v = 4;
                    throw null;
                } else if (i == 5) {
                    kqe.v = 6;
                    j93 j932 = kqe.t;
                    oyb.g(j932);
                    t79 t79 = kqe.w;
                    oyb.g(t79);
                    v58 v58 = ((gs4) ((hs4) j932.a.get(0)).a.get(0)).a.e;
                    long j2 = v58.b;
                    j93 h = udd.h(kqe.t, t79.b, v58.d, t79.a, true, true);
                    oyb.g(kqe.s);
                    kqe.s.b();
                    kqe.f(h, kqe.s, kqe.p, t79.b - j2);
                    return;
                } else if (i == 6) {
                    kqe.w = null;
                    m55.p = 1;
                    kqe.b(kqe);
                    return;
                } else {
                    kqe.b(kqe);
                    return;
                }
            case 5:
                ch7 ch7 = (ch7) this.c;
                if (((a4d) this.b).a instanceof q0) {
                    ch7.cancel(false);
                    return;
                }
                return;
            case 6:
                h2f h2f = (h2f) this.b;
                if (((xc4) this.c) == h2f.p) {
                    h2f.I();
                    return;
                }
                return;
            case 7:
                d2f d2f = (d2f) this.b;
                d2f.getClass();
                y1d y1d = (y1d) this.c;
                ((ArrayList) y1d.b.d).remove(d2f);
                y1d.e.remove(d2f);
                return;
            case 8:
                ((fx4) ((vj4) this.b).j).a((Surface) this.c);
                return;
            case 9:
                ((VideoFileRenderer) this.b).lambda$onFrame$0((VideoFrame) this.c);
                return;
            case 10:
                ((VideoFileRenderer) this.b).lambda$release$2((CountDownLatch) this.c);
                return;
            case 11:
                i4f i4f = (i4f) this.c;
                ew0 ew0 = (ew0) this.b;
                ew0.getClass();
                try {
                    i4f.run();
                    return;
                } catch (Exception e) {
                    ew0.e(e);
                    return;
                }
            case Protos.Attaches.Attach.PRESENT:
                h6f h6f = (h6f) this.b;
                if (h6f.z0) {
                    udd.s(h6f.a, "postToGl, GL is already RELEASED, skip action!", (Throwable) null);
                    return;
                } else {
                    ((s16) this.c).invoke();
                    return;
                }
            case 13:
                d4b d4b = (d4b) this.b;
                d4b.getClass();
                int i2 = mze.a;
                m45 m45 = ((g45) d4b.c).a;
                m45.getClass();
                m45.B0.m(25, new c44((q8f) this.c));
                return;
            case Protos.Attaches.Attach.LOCATION:
                v4b v4b = (v4b) this.b;
                v4b.getClass();
                int i3 = oze.a;
                n45 n45 = ((h45) v4b.c).a;
                r8f r8f = (r8f) this.c;
                n45.t1 = r8f;
                n45.B0.f(25, new r34(21, r8f));
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA:
                d4b d4b2 = (d4b) this.b;
                d4b2.getClass();
                int i4 = mze.a;
                f44 f44 = ((g45) d4b2.c).a.G0;
                fd P = f44.P();
                f44.Q(P, 1019, new z34(P, (String) this.c, 13));
                return;
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK:
                d4b d4b3 = (d4b) this.b;
                d4b3.getClass();
                int i5 = mze.a;
                f44 f442 = ((g45) d4b3.c).a.G0;
                fd P2 = f442.P();
                f442.Q(P2, 1030, new z34(P2, (Exception) this.c, 26));
                return;
            case LangUtils.HASH_SEED:
                v4b v4b2 = (v4b) this.b;
                v4b2.getClass();
                int i6 = oze.a;
                g44 g44 = ((h45) v4b2.c).a.H0;
                gd I = g44.I();
                g44.J(I, 1030, new no3(I, (Exception) this.c));
                return;
            case 18:
                v4b v4b3 = (v4b) this.b;
                v4b3.getClass();
                int i7 = oze.a;
                g44 g442 = ((h45) v4b3.c).a.H0;
                gd I2 = g442.I();
                g442.J(I2, 1019, new o34(I2, (String) this.c, 1));
                return;
            case 19:
                ((VideoSource) this.b).lambda$setVideoProcessor$0((VideoFrame) this.c);
                return;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS:
                WatchTogetherListenerManagerImpl.sendActualState$lambda$5((WatchTogetherListenerManagerImpl) this.b, (WatchTogetherListener) this.c);
                return;
            case 21:
                zsf zsf = (zsf) this.b;
                b4d b4d = (b4d) this.c;
                if (!(zsf.a.a instanceof r0)) {
                    b4d.l(zsf.o.getForegroundInfoAsync());
                    return;
                } else {
                    b4d.cancel(true);
                    return;
                }
            case 22:
                ((mtf) this.b).i((ftf) this.c);
                return;
            case 23:
                ((mtf) this.b).a((juf) this.c, false);
                return;
            case 24:
                ch7 ch72 = (ch7) this.c;
                if (((nuf) this.b).F0.a instanceof r0) {
                    ch72.cancel(true);
                    return;
                }
                return;
            case 25:
                zbe.super.invalidateDrawable((Drawable) this.c);
                return;
            case 26:
                ((ZoomableDraweeView) ((o5) this.b).c).o((oq6) this.c);
                return;
            case 27:
                ((ZoomableDraweeView) ((o5) this.b).c).n((Throwable) this.c);
                return;
            case 28:
                Object obj = this.c;
                nwf nwf = (nwf) this.b;
                nwf.getClass();
                try {
                    fhc fhc = nwf.d.c;
                    if (fhc != null) {
                        fhc.a(nwf.c, (khc) obj);
                        return;
                    }
                    return;
                } catch (Throwable th5) {
                    nwf.a.reportException("ProtocolInfo", "rtc.command.handle.command.onsuccess", th5);
                    return;
                }
            default:
                Throwable th6 = (Throwable) this.c;
                nwf nwf2 = (nwf) this.b;
                nwf2.getClass();
                try {
                    rg4 rg4 = nwf2.d.d;
                    if (rg4 != null) {
                        rg4.b(nwf2.c, th6);
                        return;
                    }
                    return;
                } catch (Throwable th7) {
                    nwf2.a.reportException("ProtocolInfo", "rtc.command.handle.command.onerror", th7);
                    return;
                }
        }
    }
}
