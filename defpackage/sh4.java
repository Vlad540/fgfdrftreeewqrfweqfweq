package defpackage;

import android.content.Context;

/* renamed from: sh4  reason: default package */
public final class sh4 {
    public final int a;
    public final String b;
    public final o3e c;
    public final long d;
    public final long e;
    public final long f;
    public final gk9 g;
    public final gk9 h;
    public final hk9 i;
    public final Context j;

    /* JADX WARNING: type inference failed for: r6v7, types: [jk9, java.lang.Object] */
    public sh4(rh4 rh4) {
        gk9 gk9;
        hk9 hk9;
        Context context = rh4.g;
        this.j = context;
        o3e o3e = rh4.b;
        if ((o3e == null && context == null) ? false : true) {
            if (o3e == null && context != null) {
                rh4.b = new uz3(1, this);
            }
            this.a = 1;
            String str = rh4.a;
            str.getClass();
            this.b = str;
            o3e o3e2 = rh4.b;
            o3e2.getClass();
            this.c = o3e2;
            this.d = rh4.c;
            this.e = rh4.d;
            this.f = rh4.e;
            gk9 gk92 = rh4.f;
            gk92.getClass();
            this.g = gk92;
            synchronized (gk9.class) {
                try {
                    if (gk9.b == null) {
                        gk9.b = new gk9(0);
                    }
                    gk9 = gk9.b;
                } finally {
                    while (true) {
                    }
                }
            }
            this.h = gk9;
            synchronized (hk9.class) {
                try {
                    if (hk9.b == null) {
                        hk9.b = new hk9(0);
                    }
                    hk9 = hk9.b;
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            this.i = hk9;
            synchronized (jk9.class) {
                if (jk9.a == null) {
                    jk9.a = new Object();
                }
            }
            return;
        }
        throw new IllegalStateException("Either a non-null context or a base directory path or supplier must be provided.");
    }
}
