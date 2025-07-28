package defpackage;

import com.facebook.common.time.RealtimeSinceBootClock;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: h54  reason: default package */
public final class h54 implements wm4 {
    public final x3a a;
    public final ScheduledExecutorService b;
    public final ExecutorService c;
    public final b69 d;
    public final mxa e;
    public final fv3 f;
    public final o3e g;
    public final o3e h;
    public final o3e i;
    public final o3e j;
    public final o3e k;
    public final o3e l;

    public h54(x3a x3a, aue aue, wyc wyc, RealtimeSinceBootClock realtimeSinceBootClock, mxa mxa, fv3 fv3, xe xeVar, xe xeVar2, uz3 uz3, uz3 uz32, uz3 uz33, uz3 uz34) {
        this.a = x3a;
        this.b = aue;
        this.c = wyc;
        this.d = realtimeSinceBootClock;
        this.e = mxa;
        this.f = fv3;
        this.g = xeVar;
        this.h = xeVar2;
        this.i = uz3;
        this.k = uz33;
        this.j = uz32;
        this.l = uz34;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: ii5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: e06} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: ii5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: bfe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: ii5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: bfe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: e06} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: e06} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: e06} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: e06} */
    /* JADX WARNING: type inference failed for: r15v6 */
    /* JADX WARNING: type inference failed for: r15v7, types: [java.lang.Object, wf] */
    /* JADX WARNING: type inference failed for: r0v21, types: [j54, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v8, types: [gz5, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable a(defpackage.b13 r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof defpackage.z03
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            z03 r15 = (defpackage.z03) r15
            monitor-enter(r15)
            stf r0 = r15.o     // Catch:{ all -> 0x0151 }
            if (r0 != 0) goto L_0x000f
            r0 = r1
            goto L_0x0013
        L_0x000f:
            java.lang.Object r0 = r0.a     // Catch:{ all -> 0x0151 }
            com.facebook.animated.gif.GifImage r0 = (com.facebook.animated.gif.GifImage) r0     // Catch:{ all -> 0x0151 }
        L_0x0013:
            monitor-exit(r15)
            monitor-enter(r15)
            stf r2 = r15.o     // Catch:{ all -> 0x014e }
            monitor-exit(r15)
            r2.getClass()
            if (r0 == 0) goto L_0x0020
            android.graphics.Bitmap$Config r15 = r0.a
            goto L_0x0021
        L_0x0020:
            r15 = r1
        L_0x0021:
            java.lang.Object r0 = r2.a
            com.facebook.animated.gif.GifImage r0 = (com.facebook.animated.gif.GifImage) r0
            android.graphics.Rect r3 = new android.graphics.Rect
            int r4 = r0.k()
            int r0 = r0.h()
            r5 = 0
            r3.<init>(r5, r5, r4, r0)
            x3a r0 = r14.a
            ue r0 = r0.r(r2, r3)
            za6 r3 = new za6
            r3.<init>((java.lang.Object) r0)
            o3e r4 = r14.g
            java.lang.Object r4 = r4.get()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r6 = 1
            if (r4 == r6) goto L_0x0078
            r6 = 2
            if (r4 == r6) goto L_0x0062
            r5 = 3
            if (r4 == r5) goto L_0x0059
            oa2 r4 = new oa2
            r4.<init>()
            goto L_0x008d
        L_0x0059:
            gz5 r4 = new gz5
            r4.<init>()
            r5 = -1
            r4.a = r5
            goto L_0x008d
        L_0x0062:
            e06 r4 = new e06
            j8e r6 = new j8e
            cg r7 = new cg
            int r8 = r2.hashCode()
            r7.<init>(r8, r5)
            fv3 r8 = r14.f
            r6.<init>(r7, r8)
            r4.<init>(r6, r5)
            goto L_0x008d
        L_0x0078:
            e06 r4 = new e06
            j8e r7 = new j8e
            cg r8 = new cg
            int r9 = r2.hashCode()
            r8.<init>(r9, r5)
            fv3 r5 = r14.f
            r7.<init>(r8, r5)
            r4.<init>(r7, r6)
        L_0x008d:
            te r5 = new te
            o3e r12 = r14.i
            java.lang.Object r6 = r12.get()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r5.<init>(r4, r0, r6)
            o3e r0 = r14.h
            java.lang.Object r0 = r0.get()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            mxa r6 = r14.e
            if (r0 <= 0) goto L_0x00d1
            ii5 r1 = new ii5
            r7 = 0
            r1.<init>(r0, r7)
            j54 r0 = new j54
            if (r15 == 0) goto L_0x00b9
            goto L_0x00bb
        L_0x00b9:
            android.graphics.Bitmap$Config r15 = android.graphics.Bitmap.Config.ARGB_8888
        L_0x00bb:
            java.util.concurrent.ExecutorService r7 = r14.c
            r0.<init>()
            r0.a = r6
            r0.b = r5
            r0.c = r15
            r0.o = r7
            android.util.SparseArray r15 = new android.util.SparseArray
            r15.<init>()
            r0.X = r15
            r13 = r0
            goto L_0x00d2
        L_0x00d1:
            r13 = r1
        L_0x00d2:
            java.lang.Object r15 = r12.get()
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 == 0) goto L_0x0115
            bfe r15 = new bfe
            cz5 r10 = new cz5
            o3e r0 = r14.k
            java.lang.Object r0 = r0.get()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            o3e r1 = r14.l
            java.lang.Object r1 = r1.get()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r10.<init>(r6, r0, r1)
            o3e r0 = r14.j
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r11 = r0.booleanValue()
            java.lang.Object r0 = r2.b
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            r6 = r15
            r8 = r3
            r9 = r5
            r6.<init>(r7, r8, r9, r10, r11)
            goto L_0x0116
        L_0x0115:
            r15 = r1
        L_0x0116:
            lm0 r0 = new lm0
            java.lang.Object r1 = r12.get()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r11 = r1.booleanValue()
            mxa r7 = r14.e
            r6 = r0
            r8 = r4
            r9 = r3
            r10 = r5
            r12 = r15
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            wf r15 = new wf
            b69 r1 = r14.d
            java.util.concurrent.ScheduledExecutorService r14 = r14.b
            r15.<init>()
            r15.c = r0
            r2 = 0
            r15.a = r2
            re r2 = new re
            r3 = 1
            r2.<init>(r3, r15)
            r15.Z = r2
            r15.Y = r0
            r15.o = r1
            r15.X = r14
            se r14 = new se
            r14.<init>(r15)
            return r14
        L_0x014e:
            r14 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x014e }
            throw r14
        L_0x0151:
            r14 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x0151 }
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h54.a(b13):android.graphics.drawable.Drawable");
    }

    public final boolean b(b13 b13) {
        return b13 instanceof z03;
    }
}
