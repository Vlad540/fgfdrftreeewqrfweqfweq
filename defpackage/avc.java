package defpackage;

import android.net.Uri;
import androidx.media3.common.PriorityTaskManager$PriorityTooLowException;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: avc  reason: default package */
public abstract class avc implements tl4 {
    public final yz3 a;
    public final lja b;
    public final ArrayList c;
    public final gv0 d;
    public final av0 e;
    public final pv0 f = pv0.c;
    public final Executor g;
    public final long h = oze.S(20000);
    public final ArrayList i = new ArrayList();
    public volatile boolean j;

    public avc(l68 l68, lja lja, gv0 gv0, Executor executor) {
        l68.b.getClass();
        a68 a68 = l68.b;
        this.a = d(a68.a);
        this.b = lja;
        this.c = new ArrayList(a68.e);
        this.d = gv0;
        this.g = executor;
        av0 av0 = gv0.a;
        av0.getClass();
        this.e = av0;
    }

    public static yz3 d(Uri uri) {
        Map emptyMap = Collections.emptyMap();
        oyb.m(uri, "The uri must be set.");
        return new yz3(uri, 0, 1, (byte[]) null, emptyMap, 0, -1, (String) null, 1, (Object) null);
    }

    public static void f(List list, pv0 pv0, long j2) {
        int i2;
        HashMap hashMap;
        String str;
        yuc yuc;
        List list2 = list;
        HashMap hashMap2 = new HashMap();
        int i3 = 0;
        int i4 = 0;
        while (i3 < list.size()) {
            yuc yuc2 = (yuc) list2.get(i3);
            String g2 = pv0.g(yuc2.b);
            Integer num = (Integer) hashMap2.get(g2);
            yuc yuc3 = num == null ? null : (yuc) list2.get(num.intValue());
            if (yuc3 != null) {
                long j3 = yuc3.a;
                if (yuc2.a <= j3 + j2) {
                    yz3 yz3 = yuc3.b;
                    Uri uri = yz3.a;
                    yz3 yz32 = yuc2.b;
                    if (uri.equals(yz32.a)) {
                        long j4 = yz3.g;
                        long j5 = -1;
                        if (j4 != -1) {
                            hashMap = hashMap2;
                            i2 = i3;
                            yuc = yuc2;
                            str = g2;
                            if (yz3.f + j4 == yz32.f && oze.a(yz3.h, yz32.h) && yz3.i == yz32.i && yz3.c == yz32.c && yz3.e.equals(yz32.e)) {
                                long j6 = yz32.g;
                                if (j6 != -1) {
                                    j5 = j4 + j6;
                                }
                                yz3 c2 = yz3.c(0, j5);
                                num.getClass();
                                list2.set(num.intValue(), new yuc(j3, c2));
                                i3 = i2 + 1;
                                hashMap2 = hashMap;
                            }
                            hashMap.put(str, Integer.valueOf(i4));
                            list2.set(i4, yuc);
                            i4++;
                            i3 = i2 + 1;
                            hashMap2 = hashMap;
                        }
                    }
                }
            }
            hashMap = hashMap2;
            i2 = i3;
            yuc = yuc2;
            str = g2;
            hashMap.put(str, Integer.valueOf(i4));
            list2.set(i4, yuc);
            i4++;
            i3 = i2 + 1;
            hashMap2 = hashMap;
        }
        oze.X(list2, i4, list.size());
    }

    public final void a(sl4 sl4) {
        iv0 iv0;
        byte[] bArr;
        ArrayDeque arrayDeque;
        ArrayDeque arrayDeque2 = new ArrayDeque();
        ArrayDeque arrayDeque3 = new ArrayDeque();
        try {
            iv0 c2 = this.d.c();
            qg5 qg5 = (qg5) c(new wuc(this, c2, this.a), false);
            if (!this.c.isEmpty()) {
                qg5 = (qg5) qg5.a(this.c);
            }
            ArrayList e2 = e(c2, qg5, false);
            Collections.sort(e2);
            f(e2, this.f, this.h);
            int size = e2.size();
            int size2 = e2.size() - 1;
            int i2 = 0;
            long j2 = 0;
            long j3 = 0;
            while (size2 >= 0) {
                yz3 yz3 = ((yuc) e2.get(size2)).b;
                String g2 = this.f.g(yz3);
                long j4 = yz3.g;
                if (j4 == -1) {
                    long a2 = zp3.a(((mgd) this.e).i(g2));
                    if (a2 != -1) {
                        j4 = a2 - yz3.f;
                    }
                }
                ArrayDeque arrayDeque4 = arrayDeque3;
                long g3 = ((mgd) this.e).g(yz3.f, g2, j4);
                j3 += g3;
                if (j4 != -1) {
                    if (j4 == g3) {
                        i2++;
                        e2.remove(size2);
                    }
                    if (j2 != -1) {
                        j2 += j4;
                    }
                } else {
                    j2 = -1;
                }
                size2--;
                arrayDeque3 = arrayDeque4;
            }
            ArrayDeque arrayDeque5 = arrayDeque3;
            xuc xuc = sl4 != null ? new xuc(sl4, j2, size, j3, i2) : null;
            arrayDeque2.addAll(e2);
            while (!this.j && !arrayDeque2.isEmpty()) {
                if (!arrayDeque5.isEmpty()) {
                    zuc zuc = (zuc) arrayDeque5.removeFirst();
                    iv0 = zuc.x0;
                    bArr = zuc.z0;
                } else {
                    iv0 = this.d.c();
                    bArr = new byte[131072];
                }
                zuc zuc2 = new zuc((yuc) arrayDeque2.removeFirst(), iv0, xuc, bArr);
                b(zuc2);
                this.g.execute(zuc2);
                int size3 = this.i.size() - 1;
                while (size3 >= 0) {
                    zuc zuc3 = (zuc) this.i.get(size3);
                    if (arrayDeque2.isEmpty() || zuc3.b.e()) {
                        try {
                            zuc3.get();
                            g(size3);
                            arrayDeque = arrayDeque5;
                            try {
                                arrayDeque.addLast(zuc3);
                            } catch (ExecutionException e3) {
                                e = e3;
                            }
                        } catch (ExecutionException e4) {
                            e = e4;
                            arrayDeque = arrayDeque5;
                            Throwable cause = e.getCause();
                            cause.getClass();
                            if (cause instanceof PriorityTaskManager$PriorityTooLowException) {
                                arrayDeque2.addFirst(zuc3.w0);
                                g(size3);
                                arrayDeque.addLast(zuc3);
                                size3--;
                                arrayDeque5 = arrayDeque;
                            } else if (cause instanceof IOException) {
                                throw ((IOException) cause);
                            } else {
                                throw cause;
                            }
                        }
                    } else {
                        arrayDeque = arrayDeque5;
                    }
                    size3--;
                    arrayDeque5 = arrayDeque;
                }
                ArrayDeque arrayDeque6 = arrayDeque5;
                zuc2.a.b();
                arrayDeque5 = arrayDeque6;
            }
            for (int i3 = 0; i3 < this.i.size(); i3++) {
                ((iic) this.i.get(i3)).cancel(true);
            }
            for (int size4 = this.i.size() - 1; size4 >= 0; size4--) {
                ((iic) this.i.get(size4)).a();
                g(size4);
            }
        } catch (Throwable th) {
            for (int i4 = 0; i4 < this.i.size(); i4++) {
                ((iic) this.i.get(i4)).cancel(true);
            }
            for (int size5 = this.i.size() - 1; size5 >= 0; size5--) {
                ((iic) this.i.get(size5)).a();
                g(size5);
            }
            throw th;
        }
    }

    public final void b(iic iic) {
        synchronized (this.i) {
            try {
                if (!this.j) {
                    this.i.add(iic);
                } else {
                    throw new InterruptedException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object c(iic iic, boolean z) {
        if (z) {
            iic.run();
            try {
                return iic.get();
            } catch (ExecutionException e2) {
                Throwable cause = e2.getCause();
                cause.getClass();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                int i2 = oze.a;
                throw e2;
            }
        } else {
            while (!this.j) {
                b(iic);
                this.g.execute(iic);
                try {
                    return iic.get();
                } catch (ExecutionException e3) {
                    Throwable cause2 = e3.getCause();
                    cause2.getClass();
                    if (!(cause2 instanceof PriorityTaskManager$PriorityTooLowException)) {
                        if (cause2 instanceof IOException) {
                            throw ((IOException) cause2);
                        }
                        int i3 = oze.a;
                        throw e3;
                    }
                } finally {
                    iic.a();
                    h(iic);
                }
            }
            throw new InterruptedException();
        }
    }

    public final void cancel() {
        synchronized (this.i) {
            try {
                this.j = true;
                for (int i2 = 0; i2 < this.i.size(); i2++) {
                    ((iic) this.i.get(i2)).cancel(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract ArrayList e(iv0 iv0, qg5 qg5, boolean z);

    public final void g(int i2) {
        synchronized (this.i) {
            this.i.remove(i2);
        }
    }

    public final void h(iic iic) {
        synchronized (this.i) {
            this.i.remove(iic);
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x004a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void remove() {
        /*
            r8 = this;
            pv0 r0 = r8.f
            av0 r1 = r8.e
            yz3 r2 = r8.a
            gv0 r3 = r8.d
            int r4 = r3.e
            r5 = 1
            r4 = r4 | r5
            r6 = -4000(0xfffffffffffff060, float:NaN)
            r7 = 0
            iv0 r3 = r3.d(r7, r4, r6)
            wuc r4 = new wuc     // Catch:{ InterruptedException -> 0x004a, Exception -> 0x0040 }
            r4.<init>(r8, r3, r2)     // Catch:{ InterruptedException -> 0x004a, Exception -> 0x0040 }
            java.lang.Object r4 = r8.c(r4, r5)     // Catch:{ InterruptedException -> 0x004a, Exception -> 0x0040 }
            qg5 r4 = (defpackage.qg5) r4     // Catch:{ InterruptedException -> 0x004a, Exception -> 0x0040 }
            java.util.ArrayList r8 = r8.e(r3, r4, r5)     // Catch:{ InterruptedException -> 0x004a, Exception -> 0x0040 }
            r3 = 0
        L_0x0023:
            int r4 = r8.size()     // Catch:{ InterruptedException -> 0x004a, Exception -> 0x0040 }
            if (r3 >= r4) goto L_0x0040
            java.lang.Object r4 = r8.get(r3)     // Catch:{ InterruptedException -> 0x004a, Exception -> 0x0040 }
            yuc r4 = (defpackage.yuc) r4     // Catch:{ InterruptedException -> 0x004a, Exception -> 0x0040 }
            yz3 r4 = r4.b     // Catch:{ InterruptedException -> 0x004a, Exception -> 0x0040 }
            java.lang.String r4 = r0.g(r4)     // Catch:{ InterruptedException -> 0x004a, Exception -> 0x0040 }
            r5 = r1
            mgd r5 = (defpackage.mgd) r5     // Catch:{ InterruptedException -> 0x004a, Exception -> 0x0040 }
            r5.l(r4)     // Catch:{ InterruptedException -> 0x004a, Exception -> 0x0040 }
            int r3 = r3 + 1
            goto L_0x0023
        L_0x003e:
            r8 = move-exception
            goto L_0x0053
        L_0x0040:
            java.lang.String r8 = r0.g(r2)
            mgd r1 = (defpackage.mgd) r1
            r1.l(r8)
            goto L_0x0052
        L_0x004a:
            java.lang.Thread r8 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x003e }
            r8.interrupt()     // Catch:{ all -> 0x003e }
            goto L_0x0040
        L_0x0052:
            return
        L_0x0053:
            java.lang.String r0 = r0.g(r2)
            mgd r1 = (defpackage.mgd) r1
            r1.l(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avc.remove():void");
    }
}
