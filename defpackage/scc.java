package defpackage;

import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: scc  reason: default package */
public final /* synthetic */ class scc implements j26, tn1 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ scc(vj4 vj4, y4e y4e, kje kje, nb0 nb0, z90 z90) {
        this.a = vj4;
        this.b = y4e;
        this.c = kje;
        this.o = nb0;
        this.X = z90;
    }

    public Object apply(Object obj) {
        return ((ms9) obj).h(new bd4((u16) this.a, (ge0) this.c, (i26) this.o, (qmc) this.X, (u16) this.b));
    }

    public String z(sn1 sn1) {
        Surface surface;
        vj4 vj4 = (vj4) this.a;
        y4e y4e = (y4e) this.b;
        kje kje = (kje) this.c;
        z90 z90 = (z90) this.X;
        vj4.getClass();
        zq4 zq4 = y4e.c;
        kb0 b2 = t2f.b(z90, zq4, (nb0) this.o);
        mb0 mb0 = z90.a;
        Size size = y4e.b;
        Range range = y4e.d;
        g90 g90 = b2.c;
        ib0 ib0 = (ib0) (g90 != null ? new h2d(b2.a, kje, mb0, size, g90, zq4, range) : new p3f(b2.a, kje, mb0, size, zq4, range)).get();
        try {
            ((hs1) vj4.e).getClass();
            xx4 xx4 = new xx4((Executor) vj4.c, ib0);
            vj4.f = xx4;
            wx4 wx4 = xx4.f;
            if (!(wx4 instanceof wx4)) {
                sn1.d(new AssertionError("The EncoderInput of video isn't a SurfaceInput."));
            } else {
                wx4 wx42 = wx4;
                ryc ryc = (Executor) vj4.d;
                cwe cwe = new cwe(vj4, sn1, y4e, 2);
                synchronized (wx42.a) {
                    wx42.o = cwe;
                    ryc.getClass();
                    wx42.X = ryc;
                    surface = wx42.b;
                }
                if (surface != null) {
                    try {
                        ryc.execute(new ii4((Object) cwe, 17, (Object) surface));
                    } catch (RejectedExecutionException unused) {
                        String str = wx42.Y.a;
                    }
                }
            }
        } catch (InvalidConfigException e) {
            sn1.d(e);
        }
        return "ConfigureVideoEncoderFuture " + vj4;
    }

    public /* synthetic */ scc(u16 u16, ge0 ge0, i26 i26, qmc qmc, u16 u162) {
        this.a = u16;
        this.c = ge0;
        this.o = i26;
        this.X = qmc;
        this.b = u162;
    }
}
