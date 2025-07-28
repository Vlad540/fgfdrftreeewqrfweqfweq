package defpackage;

import android.util.SparseArray;
import java.lang.reflect.Constructor;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: p64  reason: default package */
public final class p64 implements ul4 {
    public static final SparseArray c;
    public final gv0 a;
    public final Executor b;

    static {
        SparseArray sparseArray = new SparseArray();
        try {
            sparseArray.put(0, b(cy3.class));
        } catch (ClassNotFoundException unused) {
        }
        try {
            sparseArray.put(2, b(vh6.class));
        } catch (ClassNotFoundException unused2) {
        }
        try {
            sparseArray.put(1, b(Class.forName("androidx.media3.exoplayer.smoothstreaming.offline.SsDownloader")));
        } catch (ClassNotFoundException unused3) {
        }
        c = sparseArray;
    }

    public p64(gv0 gv0, ExecutorService executorService) {
        this.a = gv0;
        this.b = executorService;
    }

    public static Constructor b(Class cls) {
        try {
            return cls.asSubclass(tl4.class).getConstructor(new Class[]{l68.class, gv0.class, Executor.class});
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException("Downloader constructor missing", e);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: t58} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: v58} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: t58} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: v58} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.tl4 a(defpackage.pl4 r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            android.net.Uri r2 = r1.b
            java.lang.String r3 = r1.c
            int r2 = defpackage.oze.J(r2, r3)
            java.util.concurrent.Executor r3 = r0.b
            gv0 r0 = r0.a
            r4 = 0
            r5 = 1
            r6 = 0
            android.net.Uri r8 = r1.b
            if (r2 == 0) goto L_0x009b
            if (r2 == r5) goto L_0x009b
            r7 = 2
            if (r2 == r7) goto L_0x009b
            r7 = 4
            if (r2 != r7) goto L_0x008f
            mgb r2 = new mgb
            r58 r15 = new r58
            r15.<init>()
            q44 r7 = new q44
            r7.<init>()
            java.util.List r12 = java.util.Collections.emptyList()
            e8c r14 = defpackage.e8c.X
            x58 r13 = new x58
            r13.<init>()
            d68 r22 = defpackage.d68.d
            java.lang.Object r9 = r7.e
            android.net.Uri r9 = (android.net.Uri) r9
            if (r9 == 0) goto L_0x0044
            java.lang.Object r9 = r7.d
            java.util.UUID r9 = (java.util.UUID) r9
            if (r9 == 0) goto L_0x0045
        L_0x0044:
            r4 = r5
        L_0x0045:
            defpackage.oyb.k(r4)
            if (r8 == 0) goto L_0x006e
            a68 r4 = new a68
            java.lang.Object r5 = r7.d
            java.util.UUID r5 = (java.util.UUID) r5
            if (r5 == 0) goto L_0x0057
            w58 r6 = new w58
            r6.<init>(r7)
        L_0x0057:
            r10 = r6
            r5 = 0
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = 0
            r11 = 0
            java.lang.String r1 = r1.Y
            r7 = r4
            r6 = r13
            r13 = r1
            r1 = r15
            r15 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r19 = r4
            r4 = r6
            goto L_0x0072
        L_0x006e:
            r4 = r13
            r1 = r15
            r19 = r6
        L_0x0072:
            l68 r5 = new l68
            v58 r6 = new v58
            r6.<init>(r1)
            z58 r1 = new z58
            r1.<init>(r4)
            z78 r21 = defpackage.z78.J
            java.lang.String r17 = ""
            r16 = r5
            r18 = r6
            r20 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r2.<init>(r5, r0, r3)
            return r2
        L_0x008f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported type: "
            java.lang.String r1 = wn6.h(r2, r1)
            r0.<init>(r1)
            throw r0
        L_0x009b:
            android.util.SparseArray r7 = c
            java.lang.Object r7 = r7.get(r2)
            r15 = r7
            java.lang.reflect.Constructor r15 = (java.lang.reflect.Constructor) r15
            if (r15 == 0) goto L_0x014b
            r58 r14 = new r58
            r14.<init>()
            q44 r7 = new q44
            r7.<init>()
            java.util.Collections.emptyList()
            e8c r16 = defpackage.e8c.X
            x58 r13 = new x58
            r13.<init>()
            d68 r23 = defpackage.d68.d
            java.util.List r9 = r1.o
            if (r9 == 0) goto L_0x00d1
            boolean r10 = r9.isEmpty()
            if (r10 != 0) goto L_0x00d1
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r9)
            java.util.List r9 = java.util.Collections.unmodifiableList(r10)
        L_0x00cf:
            r12 = r9
            goto L_0x00d6
        L_0x00d1:
            java.util.List r9 = java.util.Collections.emptyList()
            goto L_0x00cf
        L_0x00d6:
            java.lang.Object r9 = r7.e
            android.net.Uri r9 = (android.net.Uri) r9
            if (r9 == 0) goto L_0x00e2
            java.lang.Object r9 = r7.d
            java.util.UUID r9 = (java.util.UUID) r9
            if (r9 == 0) goto L_0x00e3
        L_0x00e2:
            r4 = r5
        L_0x00e3:
            defpackage.oyb.k(r4)
            if (r8 == 0) goto L_0x0112
            a68 r4 = new a68
            java.lang.Object r5 = r7.d
            java.util.UUID r5 = (java.util.UUID) r5
            if (r5 == 0) goto L_0x00f5
            w58 r6 = new w58
            r6.<init>(r7)
        L_0x00f5:
            r10 = r6
            r11 = 0
            java.lang.String r1 = r1.Y
            r9 = 0
            r5 = 0
            r17 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r4
            r6 = r13
            r13 = r1
            r1 = r14
            r14 = r16
            r24 = r15
            r15 = r5
            r16 = r17
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r20 = r4
            r4 = r6
            goto L_0x0118
        L_0x0112:
            r4 = r13
            r1 = r14
            r24 = r15
            r20 = r6
        L_0x0118:
            l68 r5 = new l68
            v58 r6 = new v58
            r6.<init>(r1)
            z58 r1 = new z58
            r1.<init>(r4)
            z78 r22 = defpackage.z78.J
            java.lang.String r18 = ""
            r17 = r5
            r19 = r6
            r21 = r1
            r17.<init>(r18, r19, r20, r21, r22, r23)
            java.lang.Object[] r0 = new java.lang.Object[]{r5, r0, r3}     // Catch:{ Exception -> 0x013e }
            r7 = r24
            java.lang.Object r0 = r7.newInstance(r0)     // Catch:{ Exception -> 0x013e }
            tl4 r0 = (defpackage.tl4) r0     // Catch:{ Exception -> 0x013e }
            return r0
        L_0x013e:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r3 = "Failed to instantiate downloader for content type "
            java.lang.String r2 = wn6.h(r2, r3)
            r1.<init>(r2, r0)
            throw r1
        L_0x014b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Module missing for content type "
            java.lang.String r1 = wn6.h(r2, r1)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p64.a(pl4):tl4");
    }
}
