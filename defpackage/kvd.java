package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: kvd  reason: default package */
public final class kvd {
    public final t97 a;
    public final t97 b;

    public kvd(t97 t97, t97 t972) {
        this.a = t97;
        this.b = t972;
    }

    public static /* synthetic */ Object d(kvd kvd, String str, long j, Continuation continuation, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        String str2 = str;
        if ((i & 2) != 0) {
            j = 0;
        }
        return kvd.c(str2, j, 50, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.Serializable a(long r5, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.hvd
            if (r0 == 0) goto L_0x0013
            r0 = r7
            hvd r0 = (defpackage.hvd) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            hvd r0 = new hvd
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.o
            pu3 r1 = pu3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            wx3.H(r7)
            goto L_0x0064
        L_0x0027:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x002f:
            wx3.H(r7)
            t97 r4 = r4.a
            java.lang.Object r7 = r4.getValue()
            zsd r7 = (defpackage.zsd) r7
            java.util.concurrent.ConcurrentHashMap r7 = r7.a
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            java.lang.Object r7 = r7.get(r2)
            osd r7 = (defpackage.osd) r7
            if (r7 != 0) goto L_0x006d
            java.lang.Object r4 = r4.getValue()
            zsd r4 = (defpackage.zsd) r4
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r5)
            java.util.List r5 = java.util.Collections.singletonList(r7)
            phd r4 = r4.b(r5)
            r0.Y = r3
            java.lang.Object r7 = e07.d(r4, r0)
            if (r7 != r1) goto L_0x0064
            return r1
        L_0x0064:
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r4 = o23.X(r7)
            r7 = r4
            osd r7 = (defpackage.osd) r7
        L_0x006d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kvd.a(long, kotlin.coroutines.Continuation):java.io.Serializable");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0081 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(java.lang.String r16, long r17, int r19, kotlin.coroutines.Continuation r20) {
        /*
            r15 = this;
            r0 = r15
            r1 = r20
            boolean r2 = r1 instanceof defpackage.ivd
            if (r2 == 0) goto L_0x0016
            r2 = r1
            ivd r2 = (defpackage.ivd) r2
            int r3 = r2.Z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0016
            int r3 = r3 - r4
            r2.Z = r3
            goto L_0x001b
        L_0x0016:
            ivd r2 = new ivd
            r2.<init>(r15, r1)
        L_0x001b:
            java.lang.Object r1 = r2.X
            pu3 r3 = pu3.a
            int r4 = r2.Z
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x0041
            if (r4 == r6) goto L_0x0039
            if (r4 != r5) goto L_0x0031
            java.lang.Object r0 = r2.o
            kt r0 = (defpackage.kt) r0
            wx3.H(r1)
            goto L_0x0085
        L_0x0031:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0039:
            java.lang.Object r0 = r2.o
            kvd r0 = (defpackage.kvd) r0
            wx3.H(r1)
            goto L_0x0067
        L_0x0041:
            wx3.H(r1)
            t97 r1 = r0.b
            java.lang.Object r1 = r1.getValue()
            pk r1 = (defpackage.pk) r1
            dt r4 = new dt
            r8 = 2
            r9 = 0
            r7 = r4
            r10 = r17
            r12 = r19
            r13 = r16
            r7.<init>((int) r8, (java.lang.String) r9, (long) r10, (int) r12, (java.lang.String) r13)
            r2.o = r0
            r2.Z = r6
            gy9 r1 = (defpackage.gy9) r1
            java.lang.Object r1 = r1.K(r4, r2)
            if (r1 != r3) goto L_0x0067
            return r3
        L_0x0067:
            kt r1 = (defpackage.kt) r1
            t97 r0 = r0.a
            java.lang.Object r0 = r0.getValue()
            zsd r0 = (defpackage.zsd) r0
            java.util.List r4 = r1.c
            phd r0 = r0.b(r4)
            r2.o = r1
            r2.Z = r5
            java.lang.Object r0 = e07.d(r0, r2)
            if (r0 != r3) goto L_0x0082
            return r3
        L_0x0082:
            r14 = r1
            r1 = r0
            r0 = r14
        L_0x0085:
            java.util.List r1 = (java.util.List) r1
            fvd r2 = new fvd
            long r3 = r0.Y
            r2.<init>(r3, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kvd.b(java.lang.String, long, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(java.lang.String r14, long r15, int r17, kotlin.coroutines.Continuation r18) {
        /*
            r13 = this;
            r0 = r13
            r1 = r18
            boolean r2 = r1 instanceof defpackage.jvd
            if (r2 == 0) goto L_0x0016
            r2 = r1
            jvd r2 = (defpackage.jvd) r2
            int r3 = r2.Y
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0016
            int r3 = r3 - r4
            r2.Y = r3
            goto L_0x001b
        L_0x0016:
            jvd r2 = new jvd
            r2.<init>(r13, r1)
        L_0x001b:
            java.lang.Object r1 = r2.o
            pu3 r3 = pu3.a
            int r4 = r2.Y
            r5 = 1
            if (r4 == 0) goto L_0x0032
            if (r4 != r5) goto L_0x002a
            wx3.H(r1)
            goto L_0x0054
        L_0x002a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0032:
            wx3.H(r1)
            t97 r0 = r0.b
            java.lang.Object r0 = r0.getValue()
            pk r0 = (defpackage.pk) r0
            dt r1 = new dt
            r7 = 3
            r8 = 0
            r6 = r1
            r9 = r15
            r11 = r17
            r12 = r14
            r6.<init>((int) r7, (java.lang.String) r8, (long) r9, (int) r11, (java.lang.String) r12)
            r2.Y = r5
            gy9 r0 = (defpackage.gy9) r0
            java.lang.Object r1 = r0.K(r1, r2)
            if (r1 != r3) goto L_0x0054
            return r3
        L_0x0054:
            kt r1 = (defpackage.kt) r1
            gvd r0 = new gvd
            java.util.List r2 = r1.o
            long r3 = r1.Y
            r0.<init>(r3, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kvd.c(java.lang.String, long, int, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
