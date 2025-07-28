package defpackage;

import android.os.Handler;
import java.util.concurrent.CountDownLatch;

/* renamed from: moc  reason: default package */
public final /* synthetic */ class moc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ noc b;

    public /* synthetic */ moc(noc noc, int i) {
        this.a = i;
        this.b = noc;
    }

    public final void run() {
        int i = this.a;
        noc noc = this.b;
        switch (i) {
            case 0:
                if (noc.Z) {
                    py5 py5 = noc.o;
                    if (py5 != null) {
                        py5.o.c(new oy5(py5, 0));
                    }
                    ty5 ty5 = noc.X;
                    if (ty5 != null) {
                        ty5.c.c(new sy5(ty5, 1));
                    }
                    if (noc.Y != null) {
                        noc.Y.c(false);
                    }
                }
                py5 py52 = noc.o;
                if (py52 != null) {
                    py52.Z = null;
                    py52.o.a(new oy5(py52, 1));
                }
                ty5 ty52 = noc.X;
                if (ty52 != null) {
                    ty52.c.c(new sy5(ty52, 1));
                    ty52.c.a(new sy5(ty52, 2));
                }
                if (noc.Y != null) {
                    noc.Y.c(false);
                }
                py5 py53 = noc.o;
                if (py53 != null) {
                    jr3 jr3 = py53.o;
                    jr3.getClass();
                    try {
                        ((CountDownLatch) jr3.d).await();
                    } catch (InterruptedException unused) {
                    }
                }
                noc.o = null;
                noc.X = null;
                noc.Y = null;
                noc.c = true;
                return;
            case 1:
                py5 py54 = noc.o;
                if (py54 != null) {
                    py54.o.c(new oy5(py54, 0));
                }
                ty5 ty53 = noc.X;
                if (ty53 != null) {
                    ty53.c.c(new sy5(ty53, 1));
                }
                if (noc.Y != null) {
                    noc.Y.c(false);
                    return;
                }
                return;
            default:
                double b2 = noc.o.w0.b();
                double b3 = noc.X.y0.b();
                double b4 = noc.X.z0.b();
                double b5 = noc.Y.f.b();
                xwb xwb = noc.a;
                xwb.log("SSStat", "capturer: " + b2 + " , encoder: " + b3 + " | " + b4 + " , sender: " + b5);
                jr3 jr32 = noc.b;
                ((Handler) jr32.b).postDelayed(noc.w0, 1000);
                return;
        }
    }
}
