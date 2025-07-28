package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: o35  reason: default package */
public final /* synthetic */ class o35 implements p3e {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ o35(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [zl3, java.lang.Object] */
    public final Object get() {
        f54 f54;
        g54 g54;
        switch (this.a) {
            case 0:
                return new ea4(this.b);
            case 1:
                return new n94(this.b, new t74());
            case 2:
                new HashMap();
                this.b.getApplicationContext();
                Object obj = new Object();
                new HashMap();
                new HashSet();
                new HashMap();
                return obj;
            case 3:
                return new ac4(this.b, new Object());
            case 4:
                return new n94(this.b, new t74());
            case 5:
                return new bc4(this.b);
            case 6:
                Context context = this.b;
                e8c e8c = f54.n;
                synchronized (f54.class) {
                    try {
                        if (f54.t == null) {
                            ex exVar = new ex(context, 3);
                            boolean z = exVar.b;
                            f54.t = new f54((Context) exVar.o, (HashMap) exVar.X, exVar.c, (y7e) exVar.Y, z);
                        }
                        f54 = f54.t;
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                            break;
                        }
                    }
                }
                return f54;
            default:
                Context context2 = this.b;
                e8c e8c2 = g54.n;
                synchronized (g54.class) {
                    try {
                        if (g54.t == null) {
                            ex exVar2 = new ex(context2, 4);
                            boolean z2 = exVar2.b;
                            g54.t = new g54((Context) exVar2.o, (HashMap) exVar2.X, exVar2.c, (z7e) exVar2.Y, z2);
                        }
                        g54 = g54.t;
                    } catch (Throwable th2) {
                        while (true) {
                            throw th2;
                            break;
                        }
                    }
                }
                return g54;
        }
    }
}
