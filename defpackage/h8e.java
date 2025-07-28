package defpackage;

import android.os.Handler;
import java.util.ArrayList;

/* renamed from: h8e  reason: default package */
public final class h8e implements zd6 {
    public static final ArrayList b = new ArrayList(50);
    public final Handler a;

    public h8e(Handler handler) {
        this.a = handler;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: f8e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: f8e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: f8e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.f8e c() {
        /*
            java.util.ArrayList r0 = b
            monitor-enter(r0)
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x000f }
            if (r1 == 0) goto L_0x0011
            f8e r1 = new f8e     // Catch:{ all -> 0x000f }
            r1.<init>()     // Catch:{ all -> 0x000f }
            goto L_0x001d
        L_0x000f:
            r1 = move-exception
            goto L_0x001f
        L_0x0011:
            int r1 = r0.size()     // Catch:{ all -> 0x000f }
            int r1 = r1 + -1
            java.lang.Object r1 = r0.remove(r1)     // Catch:{ all -> 0x000f }
            f8e r1 = (defpackage.f8e) r1     // Catch:{ all -> 0x000f }
        L_0x001d:
            monitor-exit(r0)     // Catch:{ all -> 0x000f }
            return r1
        L_0x001f:
            monitor-exit(r0)     // Catch:{ all -> 0x000f }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h8e.c():f8e");
    }

    public final f8e a(int i, Object obj) {
        f8e c = c();
        c.a = this.a.obtainMessage(i, obj);
        return c;
    }

    public final f8e b(Object obj, int i, int i2, int i3) {
        f8e c = c();
        c.a = this.a.obtainMessage(i, i2, i3, obj);
        return c;
    }

    public final boolean d(Runnable runnable) {
        return this.a.post(runnable);
    }

    public final void e(int i) {
        oyb.d(i != 0);
        this.a.removeMessages(i);
    }

    public final boolean f(int i) {
        return this.a.sendEmptyMessage(i);
    }

    public final boolean g() {
        return this.a.sendEmptyMessageDelayed(3, (long) 10);
    }
}
