package defpackage;

import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import ru.ok.tamtam.ExceptionHandler$HandledException;

/* renamed from: luf  reason: default package */
public final class luf {
    public static final /* synthetic */ int h = 0;
    public final t97 a;
    public final t97 b;
    public final t97 c;
    public final t97 d;
    public final t97 e;
    public final t97 f;
    public final t97 g;

    public luf(t97 t97, t97 t972, t97 t973, t97 t974, t97 t975, t97 t976, t97 t977) {
        this.a = t97;
        this.b = t972;
        this.c = t973;
        this.d = t974;
        this.e = t975;
        this.f = t976;
        this.g = t977;
    }

    public final void a(c0d c0d) {
        ExecutorService k;
        udd.p("luf", "execute task = %s", new Object[]{c0d});
        t97 t97 = this.b;
        t97 t972 = this.a;
        t97 t973 = this.f;
        kuf kuf = new kuf(c0d, t972, (g15) t97.getValue(), t973);
        boolean z = c0d instanceof o1d;
        t97 t974 = this.c;
        if (z) {
            udd.q("luf", "execute ServiceTaskTransmitTamTasks");
            x4a x4a = (x4a) t974.getValue();
            x4a.getClass();
            k77 k77 = x4a.p[5];
            ExecutorService d2 = x4a.d(x4a.k);
            if (d2.isShutdown() || d2.isTerminated()) {
                String str = "WARNING! SingleTransmitExecutor has broken state. isShutdown: " + d2.isShutdown() + ", isTerminated: " + d2.isTerminated();
                udd.R("luf", (IOException) null, str, Arrays.copyOf(new Object[0], 0));
                ((g15) t97.getValue()).a(new ExceptionHandler$HandledException(str, "ONEME-17687", (Throwable) null));
            }
            d2.execute(kuf);
        } else if (!c0d.v() || (k = c0d.k((x4a) ((d0d) t973.getValue()).D.getValue(), ((rf4) ((d0d) t973.getValue()).d.getValue()).b())) == null) {
            udd.q("WorkerService", "normal executor will run " + c0d);
            ((x4a) t974.getValue()).b().execute(kuf);
        } else {
            k.execute(kuf);
        }
    }

    public final long b(c0d c0d) {
        tna tna = (tna) c0d;
        ((jee) this.a.getValue()).g(tna, 0, 0);
        o1d.y(this);
        return tna.getId();
    }
}
