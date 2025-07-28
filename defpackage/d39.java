package defpackage;

import android.media.ImageReader;
import android.util.LongSparseArray;
import android.util.Size;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* renamed from: d39  reason: default package */
public final class d39 implements nr6, pw5 {
    public final ArrayList A0;
    public final ArrayList B0 = new ArrayList();
    public boolean X = false;
    public final nr6 Y;
    public mr6 Z;
    public final Object a = new Object();
    public final sw1 b = new sw1(1, this);
    public int c = 0;
    public final ss8 o = new ss8(5, this);
    public Executor w0;
    public final LongSparseArray x0 = new LongSparseArray();
    public final LongSparseArray y0 = new LongSparseArray();
    public int z0;

    public d39(int i, int i2, int i3, int i4) {
        ud udVar = new ud(ImageReader.newInstance(i, i2, i3, i4));
        this.Y = udVar;
        this.z0 = 0;
        this.A0 = new ArrayList(l());
    }

    public final void a(lr6 lr6) {
        synchronized (this.a) {
            b(lr6);
        }
    }

    public final void b(lr6 lr6) {
        synchronized (this.a) {
            try {
                int indexOf = this.A0.indexOf(lr6);
                if (indexOf >= 0) {
                    this.A0.remove(indexOf);
                    int i = this.z0;
                    if (indexOf <= i) {
                        this.z0 = i - 1;
                    }
                }
                this.B0.remove(lr6);
                if (this.c > 0) {
                    e(this.Y);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final lr6 c() {
        synchronized (this.a) {
            try {
                if (this.A0.isEmpty()) {
                    return null;
                }
                if (this.z0 < this.A0.size()) {
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < this.A0.size() - 1; i++) {
                        if (!this.B0.contains(this.A0.get(i))) {
                            arrayList.add((lr6) this.A0.get(i));
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((lr6) it.next()).close();
                    }
                    int size = this.A0.size();
                    ArrayList arrayList2 = this.A0;
                    this.z0 = size;
                    lr6 lr6 = (lr6) arrayList2.get(size - 1);
                    this.B0.add(lr6);
                    return lr6;
                }
                throw new IllegalStateException("Maximum image number reached.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void close() {
        synchronized (this.a) {
            try {
                if (!this.X) {
                    Iterator it = new ArrayList(this.A0).iterator();
                    while (it.hasNext()) {
                        ((lr6) it.next()).close();
                    }
                    this.A0.clear();
                    this.Y.close();
                    this.X = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(c4d c4d) {
        mr6 mr6;
        Executor executor;
        synchronized (this.a) {
            try {
                if (this.A0.size() < l()) {
                    c4d.a(this);
                    this.A0.add(c4d);
                    mr6 = this.Z;
                    executor = this.w0;
                } else {
                    c4d.close();
                    mr6 = null;
                    executor = null;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (mr6 == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new zo5(this, 27, mr6));
        } else {
            mr6.f(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0051, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0009, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0026 A[SYNTHETIC, Splitter:B:16:0x0026] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(defpackage.nr6 r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.a
            monitor-enter(r0)
            boolean r1 = r6.X     // Catch:{ all -> 0x0009 }
            if (r1 == 0) goto L_0x000b
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            return
        L_0x0009:
            r6 = move-exception
            goto L_0x0050
        L_0x000b:
            android.util.LongSparseArray r1 = r6.y0     // Catch:{ all -> 0x0009 }
            int r1 = r1.size()     // Catch:{ all -> 0x0009 }
            java.util.ArrayList r2 = r6.A0     // Catch:{ all -> 0x0009 }
            int r2 = r2.size()     // Catch:{ all -> 0x0009 }
            int r1 = r1 + r2
            int r2 = r7.l()     // Catch:{ all -> 0x0009 }
            if (r1 < r2) goto L_0x0020
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            return
        L_0x0020:
            lr6 r2 = r7.n()     // Catch:{ IllegalStateException -> 0x0041, all -> 0x003f }
            if (r2 == 0) goto L_0x0042
            int r3 = r6.c     // Catch:{ all -> 0x0009 }
            int r3 = r3 + -1
            r6.c = r3     // Catch:{ all -> 0x0009 }
            int r1 = r1 + 1
            android.util.LongSparseArray r3 = r6.y0     // Catch:{ all -> 0x0009 }
            pq6 r4 = r2.getImageInfo()     // Catch:{ all -> 0x0009 }
            long r4 = r4.getTimestamp()     // Catch:{ all -> 0x0009 }
            r3.put(r4, r2)     // Catch:{ all -> 0x0009 }
            r6.g()     // Catch:{ all -> 0x0009 }
            goto L_0x0042
        L_0x003f:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0009 }
        L_0x0041:
            r2 = 0
        L_0x0042:
            if (r2 == 0) goto L_0x004e
            int r2 = r6.c     // Catch:{ all -> 0x0009 }
            if (r2 <= 0) goto L_0x004e
            int r2 = r7.l()     // Catch:{ all -> 0x0009 }
            if (r1 < r2) goto L_0x0020
        L_0x004e:
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            return
        L_0x0050:
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d39.e(nr6):void");
    }

    public final int f() {
        int f;
        synchronized (this.a) {
            f = this.Y.f();
        }
        return f;
    }

    public final void g() {
        synchronized (this.a) {
            try {
                for (int size = this.x0.size() - 1; size >= 0; size--) {
                    pq6 pq6 = (pq6) this.x0.valueAt(size);
                    long timestamp = pq6.getTimestamp();
                    lr6 lr6 = (lr6) this.y0.get(timestamp);
                    if (lr6 != null) {
                        this.y0.remove(timestamp);
                        this.x0.removeAt(size);
                        d(new c4d(lr6, (Size) null, pq6));
                    }
                }
                i();
            } finally {
            }
        }
    }

    public final int getHeight() {
        int height;
        synchronized (this.a) {
            height = this.Y.getHeight();
        }
        return height;
    }

    public final Surface getSurface() {
        Surface surface;
        synchronized (this.a) {
            surface = this.Y.getSurface();
        }
        return surface;
    }

    public final int getWidth() {
        int width;
        synchronized (this.a) {
            width = this.Y.getWidth();
        }
        return width;
    }

    public final void h() {
        synchronized (this.a) {
            this.Y.h();
            this.Z = null;
            this.w0 = null;
            this.c = 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i() {
        /*
            r7 = this;
            java.lang.Object r0 = r7.a
            monitor-enter(r0)
            android.util.LongSparseArray r1 = r7.y0     // Catch:{ all -> 0x005b }
            int r1 = r1.size()     // Catch:{ all -> 0x005b }
            if (r1 == 0) goto L_0x007e
            android.util.LongSparseArray r1 = r7.x0     // Catch:{ all -> 0x005b }
            int r1 = r1.size()     // Catch:{ all -> 0x005b }
            if (r1 != 0) goto L_0x0014
            goto L_0x007e
        L_0x0014:
            android.util.LongSparseArray r1 = r7.y0     // Catch:{ all -> 0x005b }
            r2 = 0
            long r3 = r1.keyAt(r2)     // Catch:{ all -> 0x005b }
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x005b }
            android.util.LongSparseArray r5 = r7.x0     // Catch:{ all -> 0x005b }
            long r5 = r5.keyAt(r2)     // Catch:{ all -> 0x005b }
            java.lang.Long r2 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x005b }
            boolean r1 = r2.equals(r1)     // Catch:{ all -> 0x005b }
            r1 = r1 ^ 1
            defpackage.e07.k(r1)     // Catch:{ all -> 0x005b }
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0060
            android.util.LongSparseArray r1 = r7.y0     // Catch:{ all -> 0x005b }
            int r1 = r1.size()     // Catch:{ all -> 0x005b }
            int r1 = r1 + -1
        L_0x003e:
            if (r1 < 0) goto L_0x007c
            android.util.LongSparseArray r2 = r7.y0     // Catch:{ all -> 0x005b }
            long r2 = r2.keyAt(r1)     // Catch:{ all -> 0x005b }
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x005d
            android.util.LongSparseArray r2 = r7.y0     // Catch:{ all -> 0x005b }
            java.lang.Object r2 = r2.valueAt(r1)     // Catch:{ all -> 0x005b }
            lr6 r2 = (defpackage.lr6) r2     // Catch:{ all -> 0x005b }
            r2.close()     // Catch:{ all -> 0x005b }
            android.util.LongSparseArray r2 = r7.y0     // Catch:{ all -> 0x005b }
            r2.removeAt(r1)     // Catch:{ all -> 0x005b }
            goto L_0x005d
        L_0x005b:
            r7 = move-exception
            goto L_0x0080
        L_0x005d:
            int r1 = r1 + -1
            goto L_0x003e
        L_0x0060:
            android.util.LongSparseArray r1 = r7.x0     // Catch:{ all -> 0x005b }
            int r1 = r1.size()     // Catch:{ all -> 0x005b }
            int r1 = r1 + -1
        L_0x0068:
            if (r1 < 0) goto L_0x007c
            android.util.LongSparseArray r2 = r7.x0     // Catch:{ all -> 0x005b }
            long r5 = r2.keyAt(r1)     // Catch:{ all -> 0x005b }
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x0079
            android.util.LongSparseArray r2 = r7.x0     // Catch:{ all -> 0x005b }
            r2.removeAt(r1)     // Catch:{ all -> 0x005b }
        L_0x0079:
            int r1 = r1 + -1
            goto L_0x0068
        L_0x007c:
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            return
        L_0x007e:
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            return
        L_0x0080:
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d39.i():void");
    }

    public final void j(mr6 mr6, Executor executor) {
        synchronized (this.a) {
            mr6.getClass();
            this.Z = mr6;
            executor.getClass();
            this.w0 = executor;
            this.Y.j(this.o, executor);
        }
    }

    public final int l() {
        int l;
        synchronized (this.a) {
            l = this.Y.l();
        }
        return l;
    }

    public final lr6 n() {
        synchronized (this.a) {
            try {
                if (this.A0.isEmpty()) {
                    return null;
                }
                if (this.z0 < this.A0.size()) {
                    ArrayList arrayList = this.A0;
                    int i = this.z0;
                    this.z0 = i + 1;
                    lr6 lr6 = (lr6) arrayList.get(i);
                    this.B0.add(lr6);
                    return lr6;
                }
                throw new IllegalStateException("Maximum image number reached.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
