package defpackage;

import android.content.Context;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: mm7  reason: default package */
public final class mm7 implements km7 {
    public static final /* synthetic */ int w0 = 0;
    public final fq3 X;
    public final fq3 Y;
    public final fq3 Z;
    public final Set a = Collections.newSetFromMap(new ConcurrentHashMap());
    public final Set b = Collections.newSetFromMap(new ConcurrentHashMap());
    public final Set c = Collections.newSetFromMap(new ConcurrentHashMap());
    public final Context o;

    public mm7(Context context, t97 t97, t97 t972) {
        this.o = context;
        Objects.requireNonNull(t97);
        this.X = new fq3(new dz0(1, t97));
        this.Y = new fq3(new xz((Object) this, (Object) t97, (Object) context, 13));
        Objects.requireNonNull(t972);
        this.Z = new fq3(new dz0(2, t972));
    }

    public final void U0() {
        for (km7 U0 : this.a) {
            U0.U0();
        }
        for (km7 U02 : this.b) {
            U02.U0();
        }
        for (km7 U03 : this.c) {
            U03.U0();
        }
    }

    public final void a(km7 km7) {
        if (!urd.j(this.o, urd.e)) {
            udd.q("mm7", "start: no permissions");
            km7.U0();
            return;
        }
        za6 za6 = new za6(km7);
        l0g l0g = ((ua6) this.X.get()).a;
        l0g.getClass();
        bq0 bq0 = new bq0();
        bq0.c = true;
        bq0.d = dr9.w0;
        bq0.b = 2414;
        n6g c2 = l0g.c(0, bq0.a());
        c2.i(new sa6(za6));
        c2.c(cee.a, new sa6(za6));
    }

    public final void b(km7 km7) {
        synchronized (this.c) {
            try {
                if (this.c.isEmpty()) {
                    wf6 wf6 = (wf6) this.Y.get();
                    wf6.getClass();
                    at7.L(new lm7(wf6, 1));
                    udd.q("mm7", "requestHighAccuracyUpdates");
                }
                this.c.add(km7);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(km7 km7) {
        synchronized (this.c) {
            try {
                this.c.remove(km7);
                if (this.c.isEmpty() && this.Y.b != null) {
                    wf6 wf6 = (wf6) this.Y.get();
                    wf6.getClass();
                    at7.L(new lm7(wf6, 0));
                    udd.q("mm7", "stopHighAccuracyUpdates");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void p1(dm7 dm7) {
        for (km7 p1 : this.a) {
            p1.p1(dm7);
        }
        for (km7 p12 : this.b) {
            p12.p1(dm7);
        }
        for (km7 p13 : this.c) {
            p13.p1(dm7);
        }
    }
}
