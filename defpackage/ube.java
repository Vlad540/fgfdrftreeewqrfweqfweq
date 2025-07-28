package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: ube  reason: default package */
public final /* synthetic */ class ube implements Runnable {
    public final /* synthetic */ qce X;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ it4 b;
    public final /* synthetic */ ol c;
    public final /* synthetic */ uae o;

    public /* synthetic */ ube(it4 it4, ol olVar, uae uae, qce qce) {
        this.b = it4;
        this.c = olVar;
        this.o = uae;
        this.X = qce;
    }

    /* JADX WARNING: type inference failed for: r5v4, types: [java.lang.Object, xbe] */
    public final void run() {
        switch (this.a) {
            case 0:
                it4 it4 = this.b;
                it4.getClass();
                qce qce = this.X;
                qce.b().a(new ube(it4, this.c, this.o, qce));
                return;
            default:
                it4 it42 = this.b;
                it42.getClass();
                ol olVar = this.c;
                ibe s = olVar.s();
                uae uae = this.o;
                ybe ybe = (ybe) it42.c;
                if (s != null) {
                    ybe.getClass();
                    if (jbe.a0.contains(uae.b)) {
                        String name = s.getClass().getName();
                        ConcurrentHashMap concurrentHashMap = ybe.a;
                        xbe xbe = (xbe) concurrentHashMap.get(name);
                        xbe xbe2 = xbe;
                        if (xbe == null) {
                            ? obj = new Object();
                            obj.a = 0;
                            xbe2 = obj;
                        }
                        xbe2.a++;
                        xbe2.b = System.currentTimeMillis();
                        concurrentHashMap.put(name, xbe2);
                    }
                }
                this.X.d(uae);
                ybe.f(olVar, uae);
                return;
        }
    }

    public /* synthetic */ ube(it4 it4, qce qce, ol olVar, uae uae) {
        this.b = it4;
        this.X = qce;
        this.c = olVar;
        this.o = uae;
    }
}
