package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: n83  reason: default package */
public final class n83 implements xi4, yi4 {
    public mu0 a;
    public volatile boolean b;

    public static void e(mu0 mu0) {
        if (mu0 != null) {
            ArrayList arrayList = null;
            for (Object obj : (Object[]) mu0.e) {
                if (obj instanceof xi4) {
                    try {
                        ((xi4) obj).f();
                    } catch (Throwable th) {
                        ek8.a0(th);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(th);
                    }
                }
            }
            if (arrayList == null) {
                return;
            }
            if (arrayList.size() == 1) {
                throw i15.f((Throwable) arrayList.get(0));
            }
            throw new CompositeException((List) arrayList);
        }
    }

    public final boolean a(xi4 xi4) {
        Objects.requireNonNull(xi4, "disposable is null");
        if (!this.b) {
            synchronized (this) {
                try {
                    if (!this.b) {
                        mu0 mu0 = this.a;
                        if (mu0 == null) {
                            mu0 = new mu0();
                            this.a = mu0;
                        }
                        mu0.a(xi4);
                        return true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        xi4.f();
        return false;
    }

    public final boolean b(xi4 xi4) {
        if (!c(xi4)) {
            return false;
        }
        xi4.f();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004b, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004d, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c(defpackage.xi4 r8) {
        /*
            r7 = this;
            java.lang.String r0 = "disposable is null"
            java.util.Objects.requireNonNull(r8, r0)
            boolean r0 = r7.b
            r1 = 0
            if (r0 == 0) goto L_0x000b
            return r1
        L_0x000b:
            monitor-enter(r7)
            boolean r0 = r7.b     // Catch:{ all -> 0x0012 }
            if (r0 == 0) goto L_0x0014
            monitor-exit(r7)     // Catch:{ all -> 0x0012 }
            return r1
        L_0x0012:
            r8 = move-exception
            goto L_0x004e
        L_0x0014:
            mu0 r0 = r7.a     // Catch:{ all -> 0x0012 }
            if (r0 == 0) goto L_0x004c
            java.io.Serializable r2 = r0.e     // Catch:{ all -> 0x0012 }
            java.lang.Object[] r2 = (java.lang.Object[]) r2     // Catch:{ all -> 0x0012 }
            int r3 = r0.b     // Catch:{ all -> 0x0012 }
            int r4 = r8.hashCode()     // Catch:{ all -> 0x0012 }
            r5 = -1640531527(0xffffffff9e3779b9, float:-9.713111E-21)
            int r4 = r4 * r5
            int r5 = r4 >>> 16
            r4 = r4 ^ r5
            r4 = r4 & r3
            r5 = r2[r4]     // Catch:{ all -> 0x0012 }
            if (r5 != 0) goto L_0x002f
            goto L_0x004c
        L_0x002f:
            boolean r5 = r5.equals(r8)     // Catch:{ all -> 0x0012 }
            r6 = 1
            if (r5 == 0) goto L_0x003a
            r0.d(r4, r3, r2)     // Catch:{ all -> 0x0012 }
            goto L_0x004a
        L_0x003a:
            int r4 = r4 + r6
            r4 = r4 & r3
            r5 = r2[r4]     // Catch:{ all -> 0x0012 }
            if (r5 != 0) goto L_0x0041
            goto L_0x004c
        L_0x0041:
            boolean r5 = r5.equals(r8)     // Catch:{ all -> 0x0012 }
            if (r5 == 0) goto L_0x003a
            r0.d(r4, r3, r2)     // Catch:{ all -> 0x0012 }
        L_0x004a:
            monitor-exit(r7)     // Catch:{ all -> 0x0012 }
            return r6
        L_0x004c:
            monitor-exit(r7)     // Catch:{ all -> 0x0012 }
            return r1
        L_0x004e:
            monitor-exit(r7)     // Catch:{ all -> 0x0012 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n83.c(xi4):boolean");
    }

    public final void d() {
        if (!this.b) {
            synchronized (this) {
                try {
                    if (!this.b) {
                        mu0 mu0 = this.a;
                        this.a = null;
                        e(mu0);
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
        }
    }

    public final void f() {
        if (!this.b) {
            synchronized (this) {
                try {
                    if (!this.b) {
                        this.b = true;
                        mu0 mu0 = this.a;
                        this.a = null;
                        e(mu0);
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
        }
    }

    public final boolean h() {
        return this.b;
    }
}
