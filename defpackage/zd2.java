package defpackage;

import android.content.Context;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: zd2  reason: default package */
public final class zd2 implements yt, o8c {
    public final long a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;

    public zd2(t97 t97, t97 t972, t97 t973, t97 t974, gd2 gd2, long j, Set set, t78 t78) {
        this.b = gd2;
        this.a = j;
        this.c = set;
        this.d = t78;
        this.e = zd2.class.getName();
        this.f = t97;
        this.g = t972;
        this.h = t973;
        this.i = t974;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(long r28, int r30, int r31, long r32, long r34, kotlin.coroutines.Continuation r36) {
        /*
            r27 = this;
            r0 = r27
            r1 = r36
            boolean r2 = r1 instanceof defpackage.ud2
            if (r2 == 0) goto L_0x0017
            r2 = r1
            ud2 r2 = (defpackage.ud2) r2
            int r3 = r2.A0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.A0 = r3
            goto L_0x001c
        L_0x0017:
            ud2 r2 = new ud2
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.y0
            pu3 r3 = defpackage.pu3.a
            int r4 = r2.A0
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x0055
            if (r4 == r6) goto L_0x0049
            if (r4 != r5) goto L_0x0041
            int r0 = r2.x0
            int r3 = r2.w0
            long r4 = r2.Z
            vo8 r9 = r2.Y
            i22 r10 = r2.X
            zd2 r2 = r2.o
            defpackage.wx3.H(r1)
            r21 = r0
            r18 = r3
            r22 = r4
            goto L_0x0141
        L_0x0041:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0049:
            int r0 = r2.x0
            int r4 = r2.w0
            long r9 = r2.Z
            zd2 r11 = r2.o
            defpackage.wx3.H(r1)
            goto L_0x0080
        L_0x0055:
            defpackage.wx3.H(r1)
            java.lang.Object r1 = r0.f
            t97 r1 = (defpackage.t97) r1
            java.lang.Object r1 = r1.getValue()
            bv2 r1 = (bv2) r1
            r2.o = r0
            r9 = r28
            r2.Z = r9
            r4 = r30
            r2.w0 = r4
            r11 = r31
            r2.x0 = r11
            r2.A0 = r6
            long r12 = r0.a
            java.lang.Object r1 = r1.d(r12, r2)
            if (r1 != r3) goto L_0x007b
            return r3
        L_0x007b:
            r26 = r11
            r11 = r0
            r0 = r26
        L_0x0080:
            i22 r1 = (i22) r1
            java.lang.Object r12 = r11.d
            t78 r12 = (t78) r12
            s78 r12 = r12.e()
            java.lang.Object r13 = r11.g
            t97 r13 = (defpackage.t97) r13
            java.lang.Object r13 = r13.getValue()
            to8 r13 = (to8) r13
            long r14 = r11.a
            vo8 r13 = r13.r(r14, r9)
            if (r13 == 0) goto L_0x009f
            long r5 = r13.c
            goto L_0x00a1
        L_0x009f:
            r5 = 0
        L_0x00a1:
            long r7 = r12.d
            int r7 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r7 != 0) goto L_0x00cb
            java.lang.Object r7 = r11.c
            java.util.Set r7 = (java.util.Set) r7
            java.util.Set r8 = r12.c
            boolean r7 = r8.containsAll(r7)
            if (r7 == 0) goto L_0x00cb
            if (r0 <= 0) goto L_0x00bf
            long r7 = r12.b
            r14 = 0
            int r16 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r16 == 0) goto L_0x00c1
            r5 = r7
            goto L_0x00c1
        L_0x00bf:
            r14 = 0
        L_0x00c1:
            if (r4 <= 0) goto L_0x00cd
            long r7 = r12.a
            int r12 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r12 == 0) goto L_0x00cd
            r5 = r7
            goto L_0x00cd
        L_0x00cb:
            r14 = 0
        L_0x00cd:
            int r7 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r7 != 0) goto L_0x00e1
            java.lang.String r0 = "Media loader. Don't request media if messageId == 0"
            java.lang.Object r1 = r11.e
            java.lang.String r1 = (java.lang.String) r1
            defpackage.udd.p(r1, r0, new java.lang.Object[0])
            java.lang.Integer r0 = new java.lang.Integer
            r1 = -1
            r0.<init>(r1)
            return r0
        L_0x00e1:
            dt r7 = new dt
            o62 r8 = r1.b
            long r14 = r8.a
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r5)
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r0)
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r4)
            java.lang.Object r12 = r11.c
            r20 = r12
            java.util.Set r20 = (java.util.Set) r20
            r16 = r7
            r17 = r14
            r19 = r8
            r21 = r5
            r22 = r6
            r16.<init>(r17, r19, r20, r21, r22)
            vd2 r5 = new vd2
            r6 = 0
            r5.<init>(r11, r7, r6)
            djc r7 = new djc
            r7.<init>(r5)
            wd2 r5 = new wd2
            r8 = 0
            r5.<init>(r11, r6, r8)
            bc r6 = new bc
            r8 = 18
            r6.<init>(r7, r8, r5)
            r2.o = r11
            r2.X = r1
            r2.Y = r13
            r2.Z = r9
            r2.w0 = r4
            r2.x0 = r0
            r5 = 2
            r2.A0 = r5
            java.lang.Object r2 = defpackage.ez3.D(r6, r2)
            if (r2 != r3) goto L_0x0137
            return r3
        L_0x0137:
            r21 = r0
            r18 = r4
            r22 = r9
            r9 = r13
            r10 = r1
            r1 = r2
            r2 = r11
        L_0x0141:
            eb2 r1 = (eb2) r1
            java.util.List r0 = r1.c()
            boolean r0 = r0.isEmpty()
            r3 = 1
            r0 = r0 ^ r3
            if (r0 == 0) goto L_0x017a
            java.lang.Object r0 = r2.g
            t97 r0 = (defpackage.t97) r0
            java.lang.Object r0 = r0.getValue()
            to8 r0 = (to8) r0
            long r3 = r10.a
            java.util.List r5 = r1.c()
            java.lang.Object r6 = r2.h
            t97 r6 = (defpackage.t97) r6
            java.lang.Object r6 = r6.getValue()
            f03 r6 = (f03) r6
            lqc r6 = (lqc) r6
            long r6 = r6.s()
            r27 = r0
            r28 = r3
            r30 = r6
            r32 = r5
            r27.g(r28, r30, r32)
        L_0x017a:
            java.lang.Object r0 = r2.f
            t97 r0 = (defpackage.t97) r0
            java.lang.Object r0 = r0.getValue()
            bv2 r0 = (bv2) r0
            long r3 = r10.a
            if (r9 == 0) goto L_0x018d
            long r7 = r9.b
            r19 = r7
            goto L_0x018f
        L_0x018d:
            r19 = 0
        L_0x018f:
            aw2 r0 = (aw2) r0
            t52 r0 = r0.l()
            r0.getClass()
            m52 r5 = new m52
            java.lang.Object r2 = r2.c
            r16 = r2
            java.util.Set r16 = (java.util.Set) r16
            r14 = r5
            r15 = r0
            r17 = r1
            r24 = r3
            r14.<init>(r15, r16, r17, r18, r19, r21, r22, r24)
            r2 = 0
            r0.h(r3, r2, r5)
            java.util.List r0 = r1.c()
            int r0 = r0.size()
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zd2.a(long, int, int, long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0087 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0088 A[PHI: r0 
      PHI: (r0v2 java.lang.Object) = (r0v5 java.lang.Object), (r0v1 java.lang.Object) binds: [B:20:0x0085, B:11:0x002c] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(int r17, long r18, long r20, kotlin.coroutines.Continuation r22) {
        /*
            r16 = this;
            r10 = r16
            r0 = r22
            boolean r1 = r0 instanceof defpackage.yd2
            if (r1 == 0) goto L_0x0018
            r1 = r0
            yd2 r1 = (defpackage.yd2) r1
            int r2 = r1.y0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0018
            int r2 = r2 - r3
            r1.y0 = r2
        L_0x0016:
            r11 = r1
            goto L_0x001e
        L_0x0018:
            yd2 r1 = new yd2
            r1.<init>(r10, r0)
            goto L_0x0016
        L_0x001e:
            java.lang.Object r0 = r11.w0
            pu3 r12 = defpackage.pu3.a
            int r1 = r11.y0
            r13 = 2
            r2 = 1
            if (r1 == 0) goto L_0x0046
            if (r1 == r2) goto L_0x0038
            if (r1 != r13) goto L_0x0030
            defpackage.wx3.H(r0)
            goto L_0x0088
        L_0x0030:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0038:
            long r1 = r11.Y
            int r3 = r11.Z
            long r4 = r11.X
            zd2 r6 = r11.o
            defpackage.wx3.H(r0)
            r14 = r4
            r10 = r6
            goto L_0x006e
        L_0x0046:
            defpackage.wx3.H(r0)
            r11.o = r10
            r14 = r18
            r11.X = r14
            r9 = r17
            r11.Z = r9
            r7 = r20
            r11.Y = r7
            r11.y0 = r2
            r3 = 0
            r5 = 0
            r0 = r16
            r1 = r18
            r4 = r17
            r9 = r11
            java.lang.Object r0 = r0.a(r1, r3, r4, r5, r7, r9)
            if (r0 != r12) goto L_0x006a
            return r12
        L_0x006a:
            r3 = r17
            r1 = r20
        L_0x006e:
            java.lang.Object r0 = r10.b
            yt r0 = (yt) r0
            r4 = 0
            r11.o = r4
            r11.y0 = r13
            r16 = r0
            r17 = r3
            r18 = r14
            r20 = r1
            r22 = r11
            java.lang.Object r0 = r16.b(r17, r18, r20, r22)
            if (r0 != r12) goto L_0x0088
            return r12
        L_0x0088:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zd2.b(int, long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008f A[PHI: r0 
      PHI: (r0v2 java.lang.Object) = (r0v5 java.lang.Object), (r0v1 java.lang.Object) binds: [B:20:0x008c, B:11:0x002c] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object d(int r19, long r20, long r22, kotlin.coroutines.Continuation r24) {
        /*
            r18 = this;
            r10 = r18
            r0 = r24
            boolean r1 = r0 instanceof defpackage.xd2
            if (r1 == 0) goto L_0x0018
            r1 = r0
            xd2 r1 = (defpackage.xd2) r1
            int r2 = r1.y0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0018
            int r2 = r2 - r3
            r1.y0 = r2
        L_0x0016:
            r11 = r1
            goto L_0x001e
        L_0x0018:
            xd2 r1 = new xd2
            r1.<init>(r10, r0)
            goto L_0x0016
        L_0x001e:
            java.lang.Object r0 = r11.w0
            pu3 r12 = defpackage.pu3.a
            int r1 = r11.y0
            r13 = 2
            r2 = 1
            if (r1 == 0) goto L_0x0046
            if (r1 == r2) goto L_0x0038
            if (r1 != r13) goto L_0x0030
            defpackage.wx3.H(r0)
            goto L_0x008f
        L_0x0030:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0038:
            long r1 = r11.Y
            int r3 = r11.Z
            long r4 = r11.X
            zd2 r6 = r11.o
            defpackage.wx3.H(r0)
            r14 = r4
            r10 = r6
            goto L_0x0075
        L_0x0046:
            defpackage.wx3.H(r0)
            r11.o = r10
            r14 = r20
            r11.X = r14
            r9 = r19
            r11.Z = r9
            r7 = r22
            r11.Y = r7
            r11.y0 = r2
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r4 = 0
            r0 = r18
            r1 = r20
            r3 = r19
            r5 = r22
            r7 = r16
            r9 = r11
            java.lang.Object r0 = r0.a(r1, r3, r4, r5, r7, r9)
            if (r0 != r12) goto L_0x0071
            return r12
        L_0x0071:
            r3 = r19
            r1 = r22
        L_0x0075:
            java.lang.Object r0 = r10.b
            yt r0 = (yt) r0
            r4 = 0
            r11.o = r4
            r11.y0 = r13
            r18 = r0
            r19 = r3
            r20 = r14
            r22 = r1
            r24 = r11
            java.lang.Object r0 = r18.d(r19, r20, r22, r24)
            if (r0 != r12) goto L_0x008f
            return r12
        L_0x008f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zd2.d(int, long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public lr1 e(String str) {
        if (((ArrayList) this.g).contains(str)) {
            or1 f2 = f(str);
            v80 v80 = (v80) this.d;
            Executor executor = v80.a;
            return new lr1((Context) this.b, (ku1) this.f, str, f2, (ope) this.c, (bv1) this.e, executor, v80.b, (si4) this.h, this.a);
        }
        throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
    }

    public or1 f(String str) {
        HashMap hashMap = (HashMap) this.i;
        try {
            or1 or1 = (or1) hashMap.get(str);
            if (or1 != null) {
                return or1;
            }
            or1 or12 = new or1((ku1) this.f, str);
            hashMap.put(str, or12);
            return or12;
        } catch (CameraAccessExceptionCompat e2) {
            throw new Exception(e2);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:18|19|20|21|(4:24|(2:26|56)(2:27|57)|54|22)|55|28|(2:31|29)|58) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0067 */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0076 A[Catch:{ CameraAccessException -> 0x00ff, CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0099 A[Catch:{ CameraAccessException -> 0x00ff, CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }, LOOP:2: B:29:0x0093->B:31:0x0099, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zd2(android.content.Context r5, defpackage.v80 r6, defpackage.wu1 r7, long r8) {
        /*
            r4 = this;
            r4.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r4.i = r0
            r4.b = r5
            r4.d = r6
            ku1 r6 = new ku1
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            r2 = 0
            if (r0 < r1) goto L_0x001d
            mu1 r0 = new mu1
            r0.<init>(r5, r2)
            goto L_0x0022
        L_0x001d:
            lu1 r0 = new lu1
            r0.<init>(r5, r2)
        L_0x0022:
            r6.<init>(r0)
            r4.f = r6
            si4 r5 = defpackage.si4.b(r5)
            r4.h = r5
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            r5.<init>()     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            ibe r0 = r6.a     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            r0.getClass()     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            java.lang.Object r0 = r0.b     // Catch:{ CameraAccessException -> 0x00ff }
            android.hardware.camera2.CameraManager r0 = (android.hardware.camera2.CameraManager) r0     // Catch:{ CameraAccessException -> 0x00ff }
            java.lang.String[] r0 = r0.getCameraIdList()     // Catch:{ CameraAccessException -> 0x00ff }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            if (r7 != 0) goto L_0x005f
            java.util.Iterator r6 = r0.iterator()     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
        L_0x0049:
            boolean r7 = r6.hasNext()     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            if (r7 == 0) goto L_0x00a9
            java.lang.Object r7 = r6.next()     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            r5.add(r7)     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            goto L_0x0049
        L_0x0059:
            r4 = move-exception
            goto L_0x0106
        L_0x005c:
            r4 = move-exception
            goto L_0x010c
        L_0x005f:
            java.lang.Integer r1 = r7.b()     // Catch:{ IllegalStateException -> 0x0067 }
            java.lang.String r2 = defpackage.gt0.q(r6, r1, r0)     // Catch:{ IllegalStateException -> 0x0067 }
        L_0x0067:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            r6.<init>()     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
        L_0x0070:
            boolean r1 = r0.hasNext()     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            if (r1 == 0) goto L_0x008b
            java.lang.Object r1 = r0.next()     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            boolean r3 = r1.equals(r2)     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            if (r3 == 0) goto L_0x0083
            goto L_0x0070
        L_0x0083:
            or1 r1 = r4.f(r1)     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            r6.add(r1)     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            goto L_0x0070
        L_0x008b:
            java.util.List r6 = r7.a(r6)     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
        L_0x0093:
            boolean r7 = r6.hasNext()     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            if (r7 == 0) goto L_0x00a9
            java.lang.Object r7 = r6.next()     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            fu1 r7 = (defpackage.fu1) r7     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            fu1 r7 = (defpackage.fu1) r7     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            java.lang.String r7 = r7.d()     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            r5.add(r7)     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            goto L_0x0093
        L_0x00a9:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x00b2:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x00e1
            java.lang.Object r7 = r5.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r0 = "0"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x00dd
            java.lang.String r0 = "1"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x00cf
            goto L_0x00dd
        L_0x00cf:
            java.lang.Object r0 = r4.f
            ku1 r0 = (defpackage.ku1) r0
            boolean r0 = defpackage.js.x(r0, r7)
            if (r0 == 0) goto L_0x00b2
            r6.add(r7)
            goto L_0x00b2
        L_0x00dd:
            r6.add(r7)
            goto L_0x00b2
        L_0x00e1:
            r4.g = r6
            ope r5 = new ope
            java.lang.Object r6 = r4.f
            ku1 r6 = (defpackage.ku1) r6
            r5.<init>((defpackage.ku1) r6)
            r4.c = r5
            bv1 r6 = new bv1
            r6.<init>(r5)
            r4.e = r6
            java.lang.Object r5 = r5.o
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r5.add(r6)
            r4.a = r8
            return
        L_0x00ff:
            r4 = move-exception
            androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat r5 = new androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            r5.<init>(r4)     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
            throw r5     // Catch:{ CameraAccessExceptionCompat -> 0x005c, CameraUnavailableException -> 0x0059 }
        L_0x0106:
            androidx.camera.core.InitializationException r5 = new androidx.camera.core.InitializationException
            r5.<init>(r4)
            throw r5
        L_0x010c:
            androidx.camera.core.InitializationException r5 = new androidx.camera.core.InitializationException
            androidx.camera.core.CameraUnavailableException r6 = new androidx.camera.core.CameraUnavailableException
            r6.<init>(r4)
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zd2.<init>(android.content.Context, v80, wu1, long):void");
    }
}
