package defpackage;

import android.os.Looper;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* renamed from: um6  reason: default package */
public final class um6 extends ki0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ um6(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final void a() {
        boolean remove;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ji0 ji0;
        ax4 ax4;
        switch (this.a) {
            case 0:
                if (((Future) this.b).cancel(false)) {
                    afc afc = (afc) this.c;
                    ((rh9) afc.b).getClass();
                    zb5 zb5 = (zb5) afc.a;
                    zb5.a().k(zb5.b, "NetworkFetchProducer");
                    zb5.a.c();
                    return;
                }
                return;
            case 1:
                synchronized (((oa9) this.c)) {
                    try {
                        remove = ((oa9) this.c).b.remove((Pair) this.b);
                        arrayList = null;
                        if (!remove) {
                            ji0 = null;
                            arrayList3 = null;
                        } else if (((oa9) this.c).b.isEmpty()) {
                            ji0 = ((oa9) this.c).f;
                            arrayList3 = null;
                        } else {
                            ArrayList k = ((oa9) this.c).k();
                            arrayList3 = ((oa9) this.c).l();
                            arrayList2 = ((oa9) this.c).j();
                            ArrayList arrayList4 = k;
                            ji0 = null;
                            arrayList = arrayList4;
                        }
                        arrayList2 = arrayList3;
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                            break;
                        }
                    }
                }
                ji0.c(arrayList);
                ji0.d(arrayList3);
                ji0.b(arrayList2);
                if (ji0 != null) {
                    if (!((oa9) this.c).h.c || ji0.g()) {
                        ji0.e();
                    } else {
                        ji0.d(ji0.i(u3b.a));
                    }
                }
                if (remove) {
                    ((ah0) ((Pair) this.b).first).c();
                    return;
                }
                return;
            case 2:
                fbc fbc = (fbc) this.c;
                w37 w37 = fbc.g;
                synchronized (w37) {
                    ax4 = w37.e;
                    w37.e = null;
                    w37.f = 0;
                }
                ax4.d(ax4);
                fbc.f = true;
                ((ah0) this.b).c();
                return;
            case 3:
                Looper myLooper = Looper.myLooper();
                Looper mainLooper = Looper.getMainLooper();
                y0c y0c = (y0c) this.b;
                if (myLooper != mainLooper) {
                    y0c.d();
                    return;
                }
                ExecutorService executorService = ((gbe) this.c).z0;
                Objects.requireNonNull(y0c);
                executorService.execute(new pzb(26, y0c));
                return;
            default:
                mrd mrd = (mrd) this.b;
                mrd.a();
                ((v4b) ((bie) this.c).c).n((ik7) mrd);
                return;
        }
    }

    public void b() {
        switch (this.a) {
            case 1:
                ji0.b(((oa9) this.c).j());
                return;
            case 2:
                fbc fbc = (fbc) this.c;
                if (((ji0) fbc.e).f()) {
                    fbc.g.c();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void c() {
        switch (this.a) {
            case 1:
                ji0.c(((oa9) this.c).k());
                return;
            default:
                return;
        }
    }

    public void d() {
        switch (this.a) {
            case 1:
                ji0.d(((oa9) this.c).l());
                return;
            default:
                return;
        }
    }

    public /* synthetic */ um6(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }
}
