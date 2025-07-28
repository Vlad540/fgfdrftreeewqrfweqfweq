package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.media.Spatializer;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* renamed from: bc4  reason: default package */
public final class bc4 extends eu7 implements h9c {
    public static final kga j = kga.a(new yz(19));
    public final Object c;
    public final Context d;
    public final om3 e;
    public final boolean f;
    public nb4 g;
    public final e06 h;
    public k20 i;

    /* JADX WARNING: type inference failed for: r0v0, types: [om3, java.lang.Object] */
    public bc4(Context context) {
        this(context, new Object());
    }

    public static int c(int i2, int i3) {
        if (i2 == 0 || i2 != i3) {
            return Integer.bitCount(i2 & i3);
        }
        return Integer.MAX_VALUE;
    }

    public static void d(woe woe, mpe mpe, HashMap hashMap) {
        for (int i2 = 0; i2 < woe.a; i2++) {
            fpe fpe = (fpe) mpe.A.get(woe.a(i2));
            if (fpe != null) {
                uoe uoe = fpe.a;
                fpe fpe2 = (fpe) hashMap.get(Integer.valueOf(uoe.c));
                if (fpe2 == null || (fpe2.b.isEmpty() && !fpe.b.isEmpty())) {
                    hashMap.put(Integer.valueOf(uoe.c), fpe);
                }
            }
        }
    }

    public static int e(xu5 xu5, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(xu5.d)) {
            return 4;
        }
        String h2 = h(str);
        String h3 = h(xu5.d);
        if (h3 == null || h2 == null) {
            return (!z || h3 != null) ? 0 : 1;
        }
        if (h3.startsWith(h2) || h2.startsWith(h3)) {
            return 3;
        }
        int i2 = oze.a;
        return h3.split("-", 2)[0].equals(h2.split("-", 2)[0]) ? 2 : 0;
    }

    public static String h(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static boolean i(nb4 nb4, int i2, xu5 xu5) {
        if ((i2 & 3584) == 0) {
            return false;
        }
        ipe ipe = nb4.s;
        if (ipe.c && (i2 & 2048) == 0) {
            return false;
        }
        if (!ipe.b) {
            return true;
        }
        return !(xu5.E != 0 || xu5.F != 0) || ((i2 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0);
    }

    public static Pair j(int i2, cu7 cu7, int[][][] iArr, ub4 ub4, Comparator comparator) {
        Object obj;
        boolean z;
        cu7 cu72 = cu7;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (i3 < cu72.a) {
            if (i2 == cu72.b[i3]) {
                woe woe = cu72.c[i3];
                int i4 = 0;
                while (i4 < woe.a) {
                    uoe a = woe.a(i4);
                    e8c m = ub4.m(i3, a, iArr[i3][i4]);
                    int i5 = a.a;
                    boolean[] zArr = new boolean[i5];
                    int i6 = 0;
                    while (i6 < i5) {
                        wb4 wb4 = (wb4) m.get(i6);
                        int a2 = wb4.a();
                        if (!zArr[i6] && a2 != 0) {
                            if (a2 == 1) {
                                obj = ws6.n(wb4);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(wb4);
                                int i7 = i6 + 1;
                                while (i7 < i5) {
                                    wb4 wb42 = (wb4) m.get(i7);
                                    if (wb42.a() != 2 || !wb4.b(wb42)) {
                                        z = true;
                                    } else {
                                        arrayList2.add(wb42);
                                        z = true;
                                        zArr[i7] = true;
                                    }
                                    i7++;
                                    boolean z2 = z;
                                    cu7 cu73 = cu7;
                                }
                                obj = arrayList2;
                            }
                            arrayList.add(obj);
                        }
                        i6++;
                        cu7 cu74 = cu7;
                    }
                    i4++;
                    cu7 cu75 = cu7;
                }
            }
            ub4 ub42 = ub4;
            i3++;
            cu72 = cu7;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i8 = 0; i8 < list.size(); i8++) {
            iArr2[i8] = ((wb4) list.get(i8)).c;
        }
        wb4 wb43 = (wb4) list.get(0);
        return Pair.create(new e55(wb43.b, iArr2), Integer.valueOf(wb43.a));
    }

    public final void a(k20 k20) {
        boolean z;
        synchronized (this.c) {
            z = !this.i.equals(k20);
            this.i = k20;
        }
        if (z) {
            g();
        }
    }

    public final void b(mpe mpe) {
        if (mpe instanceof nb4) {
            k((nb4) mpe);
        }
        lb4 lb4 = new lb4(f());
        lb4.d(mpe);
        k(new nb4(lb4));
    }

    public final nb4 f() {
        nb4 nb4;
        synchronized (this.c) {
            nb4 = this.g;
        }
        return nb4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        r1 = r3.h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.c
            monitor-enter(r0)
            nb4 r1 = r3.g     // Catch:{ all -> 0x001d }
            boolean r1 = r1.s0     // Catch:{ all -> 0x001d }
            if (r1 == 0) goto L_0x001f
            boolean r1 = r3.f     // Catch:{ all -> 0x001d }
            if (r1 != 0) goto L_0x001f
            int r1 = defpackage.oze.a     // Catch:{ all -> 0x001d }
            r2 = 32
            if (r1 < r2) goto L_0x001f
            e06 r1 = r3.h     // Catch:{ all -> 0x001d }
            if (r1 == 0) goto L_0x001f
            boolean r1 = r1.a     // Catch:{ all -> 0x001d }
            if (r1 == 0) goto L_0x001f
            r1 = 1
            goto L_0x0020
        L_0x001d:
            r3 = move-exception
            goto L_0x0031
        L_0x001f:
            r1 = 0
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            if (r1 == 0) goto L_0x0030
            npe r3 = r3.a
            if (r3 == 0) goto L_0x0030
            z45 r3 = (defpackage.z45) r3
            h8e r3 = r3.w0
            r0 = 10
            r3.f(r0)
        L_0x0030:
            return
        L_0x0031:
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bc4.g():void");
    }

    public final void k(nb4 nb4) {
        boolean z;
        nb4.getClass();
        synchronized (this.c) {
            z = !this.g.equals(nb4);
            this.g = nb4;
        }
        if (z) {
            if (nb4.s0 && this.d == null) {
                ez3.j0("Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            npe npe = this.a;
            if (npe != null) {
                ((z45) npe).w0.f(10);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v5, types: [java.lang.Object, e06] */
    public bc4(Context context, om3 om3) {
        boolean z = false;
        String str = nb4.z0;
        nb4 nb4 = new nb4(new lb4(context));
        this.c = new Object();
        e06 e06 = null;
        this.d = context != null ? context.getApplicationContext() : null;
        this.e = om3;
        this.g = nb4;
        this.i = k20.g;
        boolean z2 = context != null && oze.P(context);
        this.f = z2;
        if (!z2 && context != null && oze.a >= 32) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager != null) {
                Spatializer b = audioManager.getSpatializer();
                ? obj = new Object();
                obj.b = b;
                obj.a = b.getImmersiveAudioLevel() != 0 ? true : z;
                e06 = obj;
            }
            this.h = e06;
        }
        if (this.g.s0 && context == null) {
            ez3.j0("Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }
}
