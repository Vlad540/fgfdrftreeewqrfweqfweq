package defpackage;

import java.util.LinkedHashMap;

/* renamed from: kr7  reason: default package */
public class kr7 {
    public final int a;
    public final lhd b;
    public final kk9 c;
    public int d;
    public int e;
    public int f;

    /* JADX WARNING: type inference failed for: r3v4, types: [kk9, java.lang.Object] */
    public kr7(int i) {
        this.a = i;
        if (i > 0) {
            this.b = new lhd(19, (byte) 0);
            this.c = new Object();
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0".toString());
    }

    public Object a(Object obj) {
        return null;
    }

    public void b(boolean z, Object obj, Object obj2, Object obj3) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        r0 = a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        if (r0 != null) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        r1 = r5.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r2 = ((java.util.LinkedHashMap) r5.b.b).put(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0035, code lost:
        if (r2 == null) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0037, code lost:
        ((java.util.LinkedHashMap) r5.b.b).put(r6, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
        r5.d += f(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004c, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004d, code lost:
        if (r2 == null) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004f, code lost:
        b(false, r6, r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0055, code lost:
        i(r5.a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005c, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(java.lang.Object r6) {
        /*
            r5 = this;
            kk9 r0 = r5.c
            monitor-enter(r0)
            lhd r1 = r5.b     // Catch:{ all -> 0x0017 }
            java.lang.Object r1 = r1.b     // Catch:{ all -> 0x0017 }
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch:{ all -> 0x0017 }
            java.lang.Object r1 = r1.get(r6)     // Catch:{ all -> 0x0017 }
            if (r1 == 0) goto L_0x0019
            int r6 = r5.e     // Catch:{ all -> 0x0017 }
            int r6 = r6 + 1
            r5.e = r6     // Catch:{ all -> 0x0017 }
            monitor-exit(r0)
            return r1
        L_0x0017:
            r5 = move-exception
            goto L_0x005d
        L_0x0019:
            int r1 = r5.f     // Catch:{ all -> 0x0017 }
            int r1 = r1 + 1
            r5.f = r1     // Catch:{ all -> 0x0017 }
            monitor-exit(r0)
            java.lang.Object r0 = r5.a(r6)
            if (r0 != 0) goto L_0x0028
            r5 = 0
            return r5
        L_0x0028:
            kk9 r1 = r5.c
            monitor-enter(r1)
            lhd r2 = r5.b     // Catch:{ all -> 0x0041 }
            java.lang.Object r2 = r2.b     // Catch:{ all -> 0x0041 }
            java.util.LinkedHashMap r2 = (java.util.LinkedHashMap) r2     // Catch:{ all -> 0x0041 }
            java.lang.Object r2 = r2.put(r6, r0)     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x0043
            lhd r3 = r5.b     // Catch:{ all -> 0x0041 }
            java.lang.Object r3 = r3.b     // Catch:{ all -> 0x0041 }
            java.util.LinkedHashMap r3 = (java.util.LinkedHashMap) r3     // Catch:{ all -> 0x0041 }
            r3.put(r6, r2)     // Catch:{ all -> 0x0041 }
            goto L_0x004c
        L_0x0041:
            r5 = move-exception
            goto L_0x005b
        L_0x0043:
            int r3 = r5.d     // Catch:{ all -> 0x0041 }
            int r4 = r5.f(r6, r0)     // Catch:{ all -> 0x0041 }
            int r3 = r3 + r4
            r5.d = r3     // Catch:{ all -> 0x0041 }
        L_0x004c:
            monitor-exit(r1)
            if (r2 == 0) goto L_0x0055
            r1 = 0
            r5.b(r1, r6, r0, r2)
            r0 = r2
            goto L_0x005a
        L_0x0055:
            int r6 = r5.a
            r5.i(r6)
        L_0x005a:
            return r0
        L_0x005b:
            monitor-exit(r1)
            throw r5
        L_0x005d:
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kr7.c(java.lang.Object):java.lang.Object");
    }

    public final Object d(Object obj, Object obj2) {
        Object put;
        synchronized (this.c) {
            this.d += f(obj, obj2);
            put = ((LinkedHashMap) this.b.b).put(obj, obj2);
            if (put != null) {
                this.d -= f(obj, put);
            }
        }
        if (put != null) {
            b(false, obj, put, obj2);
        }
        i(this.a);
        return put;
    }

    public final void e(Object obj) {
        Object remove;
        synchronized (this.c) {
            remove = ((LinkedHashMap) this.b.b).remove(obj);
            if (remove != null) {
                this.d -= f(obj, remove);
            }
        }
        if (remove != null) {
            b(false, obj, remove, (Object) null);
        }
    }

    public final int f(Object obj, Object obj2) {
        int h = h(obj2);
        if (h >= 0) {
            return h;
        }
        throw new IllegalStateException(("Negative size: " + obj + '=' + obj2).toString());
    }

    public final int g() {
        int i;
        synchronized (this.c) {
            i = this.d;
        }
        return i;
    }

    public int h(Object obj) {
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006d, code lost:
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!".toString());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(int r6) {
        /*
            r5 = this;
        L_0x0000:
            kk9 r0 = r5.c
            monitor-enter(r0)
            int r1 = r5.d     // Catch:{ all -> 0x0018 }
            if (r1 < 0) goto L_0x0062
            lhd r1 = r5.b     // Catch:{ all -> 0x0018 }
            java.lang.Object r1 = r1.b     // Catch:{ all -> 0x0018 }
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch:{ all -> 0x0018 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0018 }
            if (r1 == 0) goto L_0x001a
            int r1 = r5.d     // Catch:{ all -> 0x0018 }
            if (r1 != 0) goto L_0x0062
            goto L_0x001a
        L_0x0018:
            r5 = move-exception
            goto L_0x006e
        L_0x001a:
            int r1 = r5.d     // Catch:{ all -> 0x0018 }
            if (r1 <= r6) goto L_0x0060
            lhd r1 = r5.b     // Catch:{ all -> 0x0018 }
            java.lang.Object r1 = r1.b     // Catch:{ all -> 0x0018 }
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch:{ all -> 0x0018 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0018 }
            if (r1 == 0) goto L_0x002b
            goto L_0x0060
        L_0x002b:
            lhd r1 = r5.b     // Catch:{ all -> 0x0018 }
            java.lang.Object r1 = r1.b     // Catch:{ all -> 0x0018 }
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch:{ all -> 0x0018 }
            java.util.Set r1 = r1.entrySet()     // Catch:{ all -> 0x0018 }
            java.lang.Object r1 = defpackage.o23.W(r1)     // Catch:{ all -> 0x0018 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x0018 }
            if (r1 != 0) goto L_0x003f
            monitor-exit(r0)
            return
        L_0x003f:
            java.lang.Object r2 = r1.getKey()     // Catch:{ all -> 0x0018 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x0018 }
            lhd r3 = r5.b     // Catch:{ all -> 0x0018 }
            java.lang.Object r3 = r3.b     // Catch:{ all -> 0x0018 }
            java.util.LinkedHashMap r3 = (java.util.LinkedHashMap) r3     // Catch:{ all -> 0x0018 }
            r3.remove(r2)     // Catch:{ all -> 0x0018 }
            int r3 = r5.d     // Catch:{ all -> 0x0018 }
            int r4 = r5.f(r2, r1)     // Catch:{ all -> 0x0018 }
            int r3 = r3 - r4
            r5.d = r3     // Catch:{ all -> 0x0018 }
            monitor-exit(r0)
            r0 = 0
            r3 = 1
            r5.b(r3, r2, r1, r0)
            goto L_0x0000
        L_0x0060:
            monitor-exit(r0)
            return
        L_0x0062:
            java.lang.String r5 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0018 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0018 }
            r6.<init>(r5)     // Catch:{ all -> 0x0018 }
            throw r6     // Catch:{ all -> 0x0018 }
        L_0x006e:
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kr7.i(int):void");
    }

    public final String toString() {
        String str;
        synchronized (this.c) {
            try {
                int i = this.e;
                int i2 = this.f + i;
                str = "LruCache[maxSize=" + this.a + ",hits=" + this.e + ",misses=" + this.f + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
