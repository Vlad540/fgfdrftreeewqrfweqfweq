package defpackage;

import com.google.android.exoplayer2.source.BehindLiveWindowException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: iy2  reason: default package */
public final class iy2 implements xjc, jyc, cj7, hj7 {
    public final List A0;
    public final vjc B0;
    public final vjc[] C0;
    public final afc D0;
    public xx2 E0;
    public vu5 F0;
    public gy2 G0;
    public long H0;
    public long I0;
    public int J0;
    public th0 K0;
    public boolean L0;
    public final d64 X;
    public final hyc Y;
    public final af8 Z;
    public final int a;
    public final int[] b;
    public final vu5[] c;
    public final boolean[] o;
    public final lk9 w0;
    public final jj7 x0 = new jj7("ChunkSampleStream");
    public final xp0 y0 = new Object();
    public final ArrayList z0;

    /* JADX WARNING: type inference failed for: r3v2, types: [xp0, java.lang.Object] */
    public iy2(int i, int[] iArr, vu5[] vu5Arr, d64 d64, hyc hyc, l34 l34, long j, mo4 mo4, eo4 eo4, lk9 lk9, af8 af8) {
        this.a = i;
        this.b = iArr;
        this.c = vu5Arr;
        this.X = d64;
        this.Y = hyc;
        this.Z = af8;
        this.w0 = lk9;
        ArrayList arrayList = new ArrayList();
        this.z0 = arrayList;
        this.A0 = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.C0 = new vjc[length];
        this.o = new boolean[length];
        int i2 = length + 1;
        int[] iArr2 = new int[i2];
        vjc[] vjcArr = new vjc[i2];
        mo4.getClass();
        vjc vjc = new vjc(l34, mo4, eo4);
        this.B0 = vjc;
        int i3 = 0;
        iArr2[0] = i;
        vjcArr[0] = vjc;
        while (i3 < length) {
            vjc vjc2 = new vjc(l34, (mo4) null, (eo4) null);
            this.C0[i3] = vjc2;
            int i4 = i3 + 1;
            vjcArr[i4] = vjc2;
            iArr2[i4] = this.b[i3];
            i3 = i4;
        }
        this.D0 = new afc(iArr2, vjcArr);
        this.H0 = j;
        this.I0 = j;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v0, resolved type: mp3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v35, resolved type: gid} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v36, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v2, resolved type: gid} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x03fc  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0409  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean F(long r60) {
        /*
            r59 = this;
            r0 = r59
            boolean r1 = r0.L0
            if (r1 != 0) goto L_0x0014
            jj7 r11 = r0.x0
            boolean r1 = r11.C()
            if (r1 != 0) goto L_0x0014
            boolean r1 = r11.B()
            if (r1 == 0) goto L_0x0017
        L_0x0014:
            r0 = 0
            goto L_0x0499
        L_0x0017:
            boolean r12 = r59.n()
            if (r12 == 0) goto L_0x0026
            java.util.List r1 = java.util.Collections.emptyList()
            long r2 = r0.H0
        L_0x0023:
            r13 = r1
            r14 = r2
            goto L_0x002f
        L_0x0026:
            th0 r1 = r59.l()
            long r2 = r1.w0
            java.util.List r1 = r0.A0
            goto L_0x0023
        L_0x002f:
            d64 r9 = r0.X
            com.google.android.exoplayer2.source.BehindLiveWindowException r1 = r9.l
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            xp0 r5 = r0.y0
            if (r1 == 0) goto L_0x0043
        L_0x003c:
            r0 = r5
            r26 = r11
            r23 = r12
            goto L_0x03ee
        L_0x0043:
            long r16 = r14 - r60
            dy3 r1 = r9.j
            long r1 = r1.a
            long r1 = defpackage.mze.D(r1)
            dy3 r3 = r9.j
            int r4 = r9.k
            vma r3 = r3.b(r4)
            long r3 = r3.b
            long r3 = defpackage.mze.D(r3)
            long r3 = r3 + r1
            long r3 = r3 + r14
            vya r1 = r9.g
            if (r1 == 0) goto L_0x00d7
            xya r1 = r1.e
            java.lang.Object r2 = r1.y0
            dy3 r2 = (defpackage.dy3) r2
            boolean r10 = r2.d
            if (r10 != 0) goto L_0x006f
            r20 = r9
            r2 = 0
            goto L_0x00d1
        L_0x006f:
            boolean r10 = r1.X
            if (r10 == 0) goto L_0x0077
            r20 = r9
            r2 = 1
            goto L_0x00d1
        L_0x0077:
            java.util.TreeMap r10 = r1.c
            r20 = r9
            long r8 = r2.h
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            java.util.Map$Entry r2 = r10.ceilingEntry(r2)
            java.lang.Object r8 = r1.w0
            c9 r8 = (defpackage.c9) r8
            if (r2 == 0) goto L_0x00b5
            java.lang.Object r9 = r2.getValue()
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            int r3 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x00b5
            java.lang.Object r2 = r2.getKey()
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            java.lang.Object r4 = r8.b
            ty3 r4 = (defpackage.ty3) r4
            long r9 = r4.N
            int r22 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r22 == 0) goto L_0x00b1
            int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r9 >= 0) goto L_0x00b3
        L_0x00b1:
            r4.N = r2
        L_0x00b3:
            r2 = 1
            goto L_0x00b6
        L_0x00b5:
            r2 = 0
        L_0x00b6:
            if (r2 == 0) goto L_0x00d1
            boolean r3 = r1.o
            if (r3 != 0) goto L_0x00bd
            goto L_0x00d1
        L_0x00bd:
            r3 = 1
            r1.X = r3
            r3 = 0
            r1.o = r3
            java.lang.Object r1 = r8.b
            ty3 r1 = (defpackage.ty3) r1
            android.os.Handler r3 = r1.D
            ny3 r4 = r1.w
            r3.removeCallbacks(r4)
            r1.t()
        L_0x00d1:
            if (r2 == 0) goto L_0x00d5
            goto L_0x003c
        L_0x00d5:
            r9 = r20
        L_0x00d7:
            long r1 = r9.f
            long r1 = defpackage.mze.t(r1)
            long r2 = defpackage.mze.D(r1)
            dy3 r1 = r9.j
            r8 = r5
            long r4 = r1.a
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 != 0) goto L_0x00ed
            r24 = r6
            goto L_0x00fe
        L_0x00ed:
            int r10 = r9.k
            vma r1 = r1.b(r10)
            long r6 = r1.b
            long r4 = r4 + r6
            long r4 = defpackage.mze.D(r4)
            long r4 = r2 - r4
            r24 = r4
        L_0x00fe:
            boolean r1 = r13.isEmpty()
            if (r1 == 0) goto L_0x0108
            r10 = 1
            r20 = 0
            goto L_0x0116
        L_0x0108:
            int r1 = r13.size()
            r10 = 1
            int r1 = r1 - r10
            java.lang.Object r1 = r13.get(r1)
            x18 r1 = (defpackage.x18) r1
            r20 = r1
        L_0x0116:
            f55 r1 = r9.i
            int r1 = r1.length()
            z18[] r6 = new defpackage.z18[r1]
            r4 = 0
        L_0x011f:
            a64[] r5 = r9.h
            if (r4 >= r1) goto L_0x0180
            r5 = r5[r4]
            java.lang.Object r7 = r5.g
            vy3 r7 = (defpackage.vy3) r7
            m54 r21 = defpackage.z18.O
            if (r7 != 0) goto L_0x0134
            r6[r4] = r21
            r30 = r8
            r26 = r11
            goto L_0x0178
        L_0x0134:
            r26 = r11
            long r10 = r5.b
            long r28 = r7.l(r10, r2)
            r30 = r8
            long r7 = r5.c
            long r28 = r28 + r7
            long r37 = r5.d(r2)
            if (r20 == 0) goto L_0x014f
            long r7 = r20.b()
        L_0x014c:
            r33 = r7
            goto L_0x0162
        L_0x014f:
            java.lang.Object r5 = r5.g
            vy3 r5 = (defpackage.vy3) r5
            long r10 = r5.v(r14, r10)
            long r31 = r10 + r7
            r33 = r28
            r35 = r37
            long r7 = defpackage.mze.k(r31, r33, r35)
            goto L_0x014c
        L_0x0162:
            int r5 = (r33 > r28 ? 1 : (r33 == r28 ? 0 : -1))
            if (r5 >= 0) goto L_0x0169
            r6[r4] = r21
            goto L_0x0178
        L_0x0169:
            a64 r32 = r9.b(r4)
            b64 r5 = new b64
            r31 = r5
            r35 = r37
            r31.<init>(r32, r33, r35)
            r6[r4] = r5
        L_0x0178:
            int r4 = r4 + 1
            r11 = r26
            r8 = r30
            r10 = 1
            goto L_0x011f
        L_0x0180:
            r30 = r8
            r26 = r11
            dy3 r1 = r9.j
            boolean r1 = r1.d
            if (r1 != 0) goto L_0x0195
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r21 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x01ce
        L_0x0195:
            r1 = 0
            r4 = r5[r1]
            long r7 = r4.d(r2)
            r4 = r5[r1]
            long r4 = r4.f(r7)
            dy3 r1 = r9.j
            long r7 = r1.a
            r21 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r23 = (r7 > r21 ? 1 : (r7 == r21 ? 0 : -1))
            if (r23 != 0) goto L_0x01b2
            r7 = r21
            goto L_0x01c1
        L_0x01b2:
            int r10 = r9.k
            vma r1 = r1.b(r10)
            long r10 = r1.b
            long r7 = r7 + r10
            long r7 = defpackage.mze.D(r7)
            long r7 = r2 - r7
        L_0x01c1:
            long r4 = java.lang.Math.min(r7, r4)
            long r4 = r4 - r60
            r7 = 0
            long r4 = java.lang.Math.max(r7, r4)
            r7 = r4
        L_0x01ce:
            f55 r1 = r9.i
            r10 = r2
            r2 = r60
            r23 = r12
            r12 = r30
            r4 = r16
            r16 = r14
            r14 = r21
            r21 = r6
            r6 = r7
            r8 = r13
            r14 = r9
            r9 = r21
            r1.t(r2, r4, r6, r8, r9)
            f55 r1 = r14.i
            int r1 = r1.b()
            a64 r1 = r14.b(r1)
            java.lang.Object r2 = r1.g
            vy3 r2 = (defpackage.vy3) r2
            java.lang.Object r3 = r1.f
            gj0 r3 = (defpackage.gj0) r3
            java.lang.Object r4 = r1.d
            pt0 r4 = (defpackage.pt0) r4
            java.lang.Object r5 = r1.e
            jac r5 = (defpackage.jac) r5
            if (r4 == 0) goto L_0x0254
            vu5[] r6 = r4.x0
            if (r6 != 0) goto L_0x020a
            mxb r6 = r5.X
            goto L_0x020b
        L_0x020a:
            r6 = 0
        L_0x020b:
            if (r2 != 0) goto L_0x0212
            mxb r7 = r5.d()
            goto L_0x0213
        L_0x0212:
            r7 = 0
        L_0x0213:
            if (r6 != 0) goto L_0x0217
            if (r7 == 0) goto L_0x0254
        L_0x0217:
            f55 r2 = r14.i
            vu5 r30 = r2.j()
            f55 r2 = r14.i
            int r31 = r2.k()
            f55 r2 = r14.i
            java.lang.Object r32 = r2.m()
            if (r6 == 0) goto L_0x0236
            java.lang.String r2 = r3.a
            mxb r2 = r6.a(r7, r2)
            if (r2 != 0) goto L_0x0234
            goto L_0x0237
        L_0x0234:
            r6 = r2
            goto L_0x0237
        L_0x0236:
            r6 = r7
        L_0x0237:
            java.lang.String r2 = r3.a
            r3 = 0
            xz3 r29 = defpackage.mt0.e(r5, r2, r6, r3)
            pw6 r2 = new pw6
            java.lang.Object r1 = r1.d
            r33 = r1
            pt0 r33 = (defpackage.pt0) r33
            oz3 r1 = r14.e
            r27 = r2
            r28 = r1
            r27.<init>(r28, r29, r30, r31, r32, r33)
            r12.b = r2
        L_0x0251:
            r0 = r12
            goto L_0x03ee
        L_0x0254:
            long r6 = r1.b
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r15 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r15 == 0) goto L_0x0261
            r8 = 1
            goto L_0x0262
        L_0x0261:
            r8 = 0
        L_0x0262:
            long r21 = r2.D(r6)
            r27 = 0
            int r9 = (r21 > r27 ? 1 : (r21 == r27 ? 0 : -1))
            if (r9 != 0) goto L_0x026f
            r12.a = r8
            goto L_0x0251
        L_0x026f:
            long r21 = r2.l(r6, r10)
            r27 = r3
            r9 = r4
            long r3 = r1.c
            long r21 = r21 + r3
            long r10 = r1.d(r10)
            if (r20 == 0) goto L_0x028b
            long r28 = r20.b()
            r20 = r12
            r34 = r13
        L_0x0288:
            r12 = r28
            goto L_0x02a2
        L_0x028b:
            r20 = r12
            r34 = r13
            r12 = r16
            long r16 = r2.v(r12, r6)
            long r28 = r16 + r3
            r30 = r21
            r32 = r10
            long r28 = defpackage.mze.k(r28, r30, r32)
            r16 = r12
            goto L_0x0288
        L_0x02a2:
            int r21 = (r12 > r21 ? 1 : (r12 == r21 ? 0 : -1))
            if (r21 >= 0) goto L_0x02b1
            com.google.android.exoplayer2.source.BehindLiveWindowException r1 = new com.google.android.exoplayer2.source.BehindLiveWindowException
            r1.<init>()
            r14.l = r1
            r0 = r20
            goto L_0x03ee
        L_0x02b1:
            int r21 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r21 > 0) goto L_0x02bb
            boolean r0 = r14.m
            if (r0 == 0) goto L_0x02bf
            if (r21 < 0) goto L_0x02bf
        L_0x02bb:
            r0 = r20
            goto L_0x03ec
        L_0x02bf:
            if (r8 == 0) goto L_0x02d1
            long r21 = r1.g(r12)
            int r0 = (r21 > r6 ? 1 : (r21 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x02d1
            r8 = r20
            r0 = 1
            r8.a = r0
            r0 = r8
            goto L_0x03ee
        L_0x02d1:
            r0 = 1
            r30 = r20
            r20 = r9
            long r8 = (long) r0
            long r10 = r10 - r12
            r21 = 1
            long r10 = r10 + r21
            long r8 = java.lang.Math.min(r8, r10)
            int r8 = (int) r8
            if (r15 == 0) goto L_0x02f4
        L_0x02e3:
            if (r8 <= r0) goto L_0x02f4
            long r9 = (long) r8
            long r9 = r9 + r12
            long r9 = r9 - r21
            long r9 = r1.g(r9)
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 < 0) goto L_0x02f4
            int r8 = r8 + -1
            goto L_0x02e3
        L_0x02f4:
            boolean r9 = r34.isEmpty()
            if (r9 == 0) goto L_0x02fd
            r49 = r16
            goto L_0x0302
        L_0x02fd:
            r49 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0302:
            f55 r9 = r14.i
            vu5 r9 = r9.j()
            f55 r10 = r14.i
            int r43 = r10.k()
            f55 r10 = r14.i
            java.lang.Object r44 = r10.m()
            long r45 = r1.g(r12)
            long r10 = r12 - r3
            mxb r10 = r2.p(r10)
            oz3 r11 = r14.e
            r16 = 8
            if (r20 != 0) goto L_0x036a
            long r47 = r1.f(r12)
            boolean r2 = r2.A()
            if (r2 == 0) goto L_0x0330
        L_0x032e:
            r8 = r0
            goto L_0x0343
        L_0x0330:
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r24 > r2 ? 1 : (r24 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x032e
            long r1 = r1.f(r12)
            int r1 = (r1 > r24 ? 1 : (r1 == r24 ? 0 : -1))
            if (r1 > 0) goto L_0x0342
            goto L_0x032e
        L_0x0342:
            r8 = 0
        L_0x0343:
            if (r8 == 0) goto L_0x0349
            r2 = r27
            r1 = 0
            goto L_0x034d
        L_0x0349:
            r1 = r16
            r2 = r27
        L_0x034d:
            java.lang.String r2 = r2.a
            xz3 r41 = defpackage.mt0.e(r5, r2, r10, r1)
            gid r1 = new gid
            int r2 = r14.d
            r39 = r1
            r40 = r11
            r42 = r9
            r49 = r12
            r51 = r2
            r52 = r9
            r39.<init>(r40, r41, r42, r43, r44, r45, r47, r49, r51, r52)
        L_0x0366:
            r0 = r30
            goto L_0x03e9
        L_0x036a:
            r14 = r27
            r17 = r9
            r9 = r0
            r0 = r10
            r10 = r9
        L_0x0371:
            r27 = r6
            r7 = r5
            if (r10 >= r8) goto L_0x038f
            long r5 = (long) r10
            long r5 = r5 + r12
            long r5 = r5 - r3
            mxb r5 = r2.p(r5)
            java.lang.String r6 = r14.a
            mxb r5 = r0.a(r5, r6)
            if (r5 != 0) goto L_0x0386
            goto L_0x038f
        L_0x0386:
            int r9 = r9 + 1
            int r10 = r10 + 1
            r0 = r5
            r5 = r7
            r6 = r27
            goto L_0x0371
        L_0x038f:
            long r3 = (long) r9
            long r3 = r3 + r12
            long r3 = r3 - r21
            long r47 = r1.f(r3)
            if (r15 == 0) goto L_0x03a0
            int r5 = (r27 > r47 ? 1 : (r27 == r47 ? 0 : -1))
            if (r5 > 0) goto L_0x03a0
            r51 = r27
            goto L_0x03a5
        L_0x03a0:
            r51 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x03a5:
            boolean r2 = r2.A()
            if (r2 == 0) goto L_0x03ad
        L_0x03ab:
            r8 = 1
            goto L_0x03c0
        L_0x03ad:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r24 > r5 ? 1 : (r24 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x03ab
            long r2 = r1.f(r3)
            int r2 = (r2 > r24 ? 1 : (r2 == r24 ? 0 : -1))
            if (r2 > 0) goto L_0x03bf
            goto L_0x03ab
        L_0x03bf:
            r8 = 0
        L_0x03c0:
            if (r8 == 0) goto L_0x03c4
            r2 = 0
            goto L_0x03c6
        L_0x03c4:
            r2 = r16
        L_0x03c6:
            java.lang.String r3 = r14.a
            xz3 r41 = defpackage.mt0.e(r7, r3, r0, r2)
            long r2 = r7.c
            long r2 = -r2
            r56 = r2
            mp3 r0 = new mp3
            r39 = r0
            java.lang.Object r1 = r1.d
            r58 = r1
            pt0 r58 = (defpackage.pt0) r58
            r40 = r11
            r42 = r17
            r53 = r12
            r55 = r9
            r39.<init>(r40, r41, r42, r43, r44, r45, r47, r49, r51, r53, r55, r56, r58)
            r1 = r0
            goto L_0x0366
        L_0x03e9:
            r0.b = r1
            goto L_0x03ee
        L_0x03ec:
            r0.a = r8
        L_0x03ee:
            boolean r1 = r0.a
            java.lang.Object r2 = r0.b
            xx2 r2 = (defpackage.xx2) r2
            r3 = 0
            r0.b = r3
            r3 = 0
            r0.a = r3
            if (r1 == 0) goto L_0x0409
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0 = r59
            r0.H0 = r4
            r1 = 1
            r0.L0 = r1
            return r1
        L_0x0409:
            r0 = r59
            if (r2 != 0) goto L_0x040e
            return r3
        L_0x040e:
            r0.E0 = r2
            boolean r1 = r2 instanceof defpackage.th0
            afc r3 = r0.D0
            if (r1 == 0) goto L_0x045e
            r1 = r2
            th0 r1 = (defpackage.th0) r1
            if (r23 == 0) goto L_0x043d
            long r4 = r0.H0
            long r6 = r1.Z
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0436
            vjc r6 = r0.B0
            r6.t = r4
            vjc[] r4 = r0.C0
            int r5 = r4.length
            r6 = 0
        L_0x042b:
            if (r6 >= r5) goto L_0x0436
            r7 = r4[r6]
            long r8 = r0.H0
            r7.t = r8
            int r6 = r6 + 1
            goto L_0x042b
        L_0x0436:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.H0 = r4
        L_0x043d:
            r1.B0 = r3
            java.lang.Object r3 = r3.b
            vjc[] r3 = (defpackage.vjc[]) r3
            int r4 = r3.length
            int[] r4 = new int[r4]
            r10 = 0
        L_0x0447:
            int r5 = r3.length
            if (r10 >= r5) goto L_0x0456
            r5 = r3[r10]
            int r6 = r5.q
            int r5 = r5.p
            int r6 = r6 + r5
            r4[r10] = r6
            int r10 = r10 + 1
            goto L_0x0447
        L_0x0456:
            r1.C0 = r4
            java.util.ArrayList r3 = r0.z0
            r3.add(r1)
            goto L_0x0467
        L_0x045e:
            boolean r1 = r2 instanceof defpackage.pw6
            if (r1 == 0) goto L_0x0467
            r1 = r2
            pw6 r1 = (defpackage.pw6) r1
            r1.z0 = r3
        L_0x0467:
            lk9 r1 = r0.w0
            int r3 = r2.c
            int r1 = r1.h(r3)
            r3 = r26
            long r8 = r3.G(r2, r0, r1)
            xi7 r11 = new xi7
            long r5 = r2.a
            xz3 r7 = r2.b
            r4 = r11
            r4.<init>(r5, r7, r8)
            int r15 = r2.X
            java.lang.Object r1 = r2.Y
            af8 r10 = r0.Z
            int r12 = r2.c
            int r13 = r0.a
            vu5 r14 = r2.o
            long r3 = r2.Z
            long r5 = r2.w0
            r16 = r1
            r17 = r3
            r19 = r5
            r10.k(r11, r12, r13, r14, r15, r16, r17, r19)
            r0 = 1
        L_0x0499:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iy2.F(long):boolean");
    }

    public final void a() {
        vjc vjc = this.B0;
        vjc.z(true);
        yn4 yn4 = vjc.h;
        if (yn4 != null) {
            yn4.f(vjc.e);
            vjc.h = null;
            vjc.g = null;
        }
        for (vjc vjc2 : this.C0) {
            vjc2.z(true);
            yn4 yn42 = vjc2.h;
            if (yn42 != null) {
                yn42.f(vjc2.e);
                vjc2.h = null;
                vjc2.g = null;
            }
        }
        for (a64 a64 : this.X.h) {
            pt0 pt0 = (pt0) a64.d;
            if (pt0 != null) {
                pt0.c();
            }
        }
        gy2 gy2 = this.G0;
        if (gy2 != null) {
            ly3 ly3 = (ly3) gy2;
            synchronized (ly3) {
                vya vya = (vya) ly3.C0.remove(this);
                if (vya != null) {
                    vjc vjc3 = vya.a;
                    vjc3.z(true);
                    yn4 yn43 = vjc3.h;
                    if (yn43 != null) {
                        yn43.f(vjc3.e);
                        vjc3.h = null;
                        vjc3.g = null;
                    }
                }
            }
        }
    }

    public final boolean b() {
        return this.x0.C();
    }

    public final void c() {
        jj7 jj7 = this.x0;
        jj7.c();
        this.B0.v();
        if (!jj7.C()) {
            d64 d64 = this.X;
            BehindLiveWindowException behindLiveWindowException = d64.l;
            if (behindLiveWindowException == null) {
                d64.a.c();
                return;
            }
            throw behindLiveWindowException;
        }
    }

    public final boolean d() {
        return !n() && this.B0.t(this.L0);
    }

    public final int e(long j) {
        if (n()) {
            return 0;
        }
        vjc vjc = this.B0;
        int q = vjc.q(j, this.L0);
        th0 th0 = this.K0;
        if (th0 != null) {
            q = Math.min(q, th0.d(0) - vjc.o());
        }
        vjc.B(q);
        t();
        return q;
    }

    public final long f() {
        if (n()) {
            return this.H0;
        }
        if (this.L0) {
            return Long.MIN_VALUE;
        }
        return l().w0;
    }

    public final void g(fj7 fj7, long j, long j2, boolean z) {
        xx2 xx2 = (xx2) fj7;
        this.E0 = null;
        this.K0 = null;
        long j3 = xx2.a;
        esd esd = xx2.x0;
        xi7 xi7 = new xi7(j3, xx2.b, esd.c, esd.o, j, j2, esd.b);
        this.w0.getClass();
        this.Z.d(xi7, xx2.c, this.a, xx2.o, xx2.X, xx2.Y, xx2.Z, xx2.w0);
        if (!z) {
            if (n()) {
                this.B0.z(false);
                for (vjc z2 : this.C0) {
                    z2.z(false);
                }
            } else if (xx2 instanceof th0) {
                ArrayList arrayList = this.z0;
                j(arrayList.size() - 1);
                if (arrayList.isEmpty()) {
                    this.H0 = this.I0;
                }
            }
            this.Y.c(this);
        }
    }

    public final int h(otf otf, m24 m24, int i) {
        if (n()) {
            return -3;
        }
        th0 th0 = this.K0;
        vjc vjc = this.B0;
        if (th0 != null && th0.d(0) <= vjc.o()) {
            return -3;
        }
        t();
        return vjc.y(otf, m24, i, this.L0);
    }

    public final th0 j(int i) {
        ArrayList arrayList = this.z0;
        th0 th0 = (th0) arrayList.get(i);
        mze.I(arrayList, i, arrayList.size());
        this.J0 = Math.max(this.J0, arrayList.size());
        int i2 = 0;
        this.B0.k(th0.d(0));
        while (true) {
            vjc[] vjcArr = this.C0;
            if (i2 >= vjcArr.length) {
                return th0;
            }
            vjc vjc = vjcArr[i2];
            i2++;
            vjc.k(th0.d(i2));
        }
    }

    public final th0 l() {
        return (th0) rf0.e(this.z0, 1);
    }

    public final boolean m(int i) {
        int o2;
        th0 th0 = (th0) this.z0.get(i);
        if (this.B0.o() > th0.d(0)) {
            return true;
        }
        int i2 = 0;
        do {
            vjc[] vjcArr = this.C0;
            if (i2 >= vjcArr.length) {
                return false;
            }
            o2 = vjcArr[i2].o();
            i2++;
        } while (o2 <= th0.d(i2));
        return true;
    }

    public final boolean n() {
        return this.H0 != -9223372036854775807L;
    }

    public final void q(fj7 fj7, long j, long j2) {
        by2 a2;
        xx2 xx2 = (xx2) fj7;
        this.E0 = null;
        d64 d64 = this.X;
        d64.getClass();
        if (xx2 instanceof pw6) {
            int q = d64.i.q(((pw6) xx2).o);
            a64[] a64Arr = d64.h;
            a64 a64 = a64Arr[q];
            if (((vy3) a64.g) == null && (a2 = ((pt0) a64.d).a()) != null) {
                jac jac = (jac) a64.e;
                a64Arr[q] = new a64(a64.b, jac, (gj0) a64.f, (pt0) a64.d, a64.c, new xw2((Object) a2, jac.c, 2), 0);
            }
        }
        vya vya = d64.g;
        if (vya != null) {
            long j3 = vya.d;
            if (j3 == -9223372036854775807L || xx2.w0 > j3) {
                vya.d = xx2.w0;
            }
            vya.e.o = true;
        }
        long j4 = xx2.a;
        esd esd = xx2.x0;
        xi7 xi7 = new xi7(j4, xx2.b, esd.c, esd.o, j, j2, esd.b);
        this.w0.getClass();
        xi7 xi72 = xi7;
        this.Z.f(xi72, xx2.c, this.a, xx2.o, xx2.X, xx2.Y, xx2.Z, xx2.w0);
        this.Y.c(this);
    }

    public final long r() {
        long j;
        if (this.L0) {
            return Long.MIN_VALUE;
        }
        if (n()) {
            return this.H0;
        }
        long j2 = this.I0;
        th0 l = l();
        if (!l.c()) {
            ArrayList arrayList = this.z0;
            l = arrayList.size() > 1 ? (th0) rf0.e(arrayList, 2) : null;
        }
        if (l != null) {
            j2 = Math.max(j2, l.w0);
        }
        vjc vjc = this.B0;
        synchronized (vjc) {
            j = vjc.v;
        }
        return Math.max(j2, j);
    }

    public final void t() {
        int v = v(this.B0.o(), this.J0 - 1);
        while (true) {
            int i = this.J0;
            if (i <= v) {
                this.J0 = i + 1;
                th0 th0 = (th0) this.z0.get(i);
                vu5 vu5 = th0.o;
                if (!vu5.equals(this.F0)) {
                    vu5 vu52 = vu5;
                    this.Z.b(this.a, vu52, th0.X, th0.Y, th0.Z);
                }
                this.F0 = vu5;
            } else {
                return;
            }
        }
    }

    public final void u(long j) {
        long j2 = j;
        jj7 jj7 = this.x0;
        if (!jj7.B() && !n()) {
            boolean C = jj7.C();
            ArrayList arrayList = this.z0;
            boolean z = false;
            List list = this.A0;
            d64 d64 = this.X;
            if (C) {
                xx2 xx2 = this.E0;
                xx2.getClass();
                boolean z2 = xx2 instanceof th0;
                if (!z2 || !m(arrayList.size() - 1)) {
                    if (d64.l == null) {
                        z = d64.i.u(j2, xx2, list);
                    }
                    if (z) {
                        jj7.o();
                        if (z2) {
                            this.K0 = (th0) xx2;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            int size = (d64.l != null || d64.i.length() < 2) ? list.size() : d64.i.g(j2, list);
            if (size < arrayList.size()) {
                swb.h(!jj7.C());
                int size2 = arrayList.size();
                while (true) {
                    if (size >= size2) {
                        size = -1;
                        break;
                    } else if (!m(size)) {
                        break;
                    } else {
                        size++;
                    }
                }
                if (size != -1) {
                    long j3 = l().w0;
                    th0 j4 = j(size);
                    if (arrayList.isEmpty()) {
                        this.H0 = this.I0;
                    }
                    this.L0 = false;
                    af8 af8 = this.Z;
                    af8.m(new i78(1, this.a, (Object) null, 3, (Object) null, af8.a(j4.Z), af8.a(j3)));
                }
            }
        }
    }

    public final int v(int i, int i2) {
        ArrayList arrayList;
        do {
            i2++;
            arrayList = this.z0;
            if (i2 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((th0) arrayList.get(i2)).d(0) <= i);
        return i2 - 1;
    }

    public final void w(gy2 gy2) {
        this.G0 = gy2;
        vjc vjc = this.B0;
        vjc.i();
        yn4 yn4 = vjc.h;
        if (yn4 != null) {
            yn4.f(vjc.e);
            vjc.h = null;
            vjc.g = null;
        }
        for (vjc vjc2 : this.C0) {
            vjc2.i();
            yn4 yn42 = vjc2.h;
            if (yn42 != null) {
                yn42.f(vjc2.e);
                vjc2.h = null;
                vjc2.g = null;
            }
        }
        this.x0.F(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0266  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x028d  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02b5  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x023f A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final sz0 y(defpackage.fj7 r33, long r34, long r36, java.io.IOException r38, int r39) {
        /*
            r32 = this;
            r0 = r32
            r12 = r38
            r1 = 1
            r2 = r33
            xx2 r2 = (defpackage.xx2) r2
            esd r3 = r2.x0
            long r3 = r3.b
            boolean r5 = r2 instanceof defpackage.th0
            java.util.ArrayList r6 = r0.z0
            int r7 = r6.size()
            int r7 = r7 - r1
            r8 = 0
            int r10 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0027
            if (r5 == 0) goto L_0x0027
            boolean r10 = r0.m(r7)
            if (r10 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r10 = 0
            goto L_0x0028
        L_0x0027:
            r10 = r1
        L_0x0028:
            xi7 r25 = new xi7
            esd r13 = r2.x0
            android.net.Uri r14 = r13.c
            java.util.Map r15 = r13.o
            long r8 = r2.a
            xz3 r13 = r2.b
            r16 = r13
            r13 = r25
            r17 = r14
            r18 = r15
            r14 = r8
            r19 = r34
            r21 = r36
            r23 = r3
            r13.<init>(r14, r16, r17, r18, r19, r21, r23)
            long r3 = r2.Z
            defpackage.mze.M(r3)
            long r8 = r2.w0
            defpackage.mze.M(r8)
            wi7 r8 = new wi7
            r9 = r39
            r8.<init>(r9, r12)
            d64 r9 = r0.X
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            lk9 r15 = r0.w0
            if (r10 != 0) goto L_0x006c
            r9.getClass()
            r20 = r2
            r16 = r6
        L_0x0069:
            r1 = 0
            goto L_0x023c
        L_0x006c:
            vya r11 = r9.g
            r20 = r2
            if (r11 == 0) goto L_0x00b3
            long r1 = r11.d
            int r16 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r16 == 0) goto L_0x007e
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x007e
            r1 = 1
            goto L_0x007f
        L_0x007e:
            r1 = 0
        L_0x007f:
            xya r2 = r11.e
            java.lang.Object r3 = r2.y0
            dy3 r3 = (defpackage.dy3) r3
            boolean r3 = r3.d
            if (r3 != 0) goto L_0x008a
            goto L_0x00b3
        L_0x008a:
            boolean r3 = r2.X
            if (r3 == 0) goto L_0x008f
            goto L_0x00ae
        L_0x008f:
            if (r1 == 0) goto L_0x00b3
            boolean r1 = r2.o
            if (r1 != 0) goto L_0x0096
            goto L_0x00ae
        L_0x0096:
            r1 = 1
            r2.X = r1
            r1 = 0
            r2.o = r1
            java.lang.Object r1 = r2.w0
            c9 r1 = (defpackage.c9) r1
            java.lang.Object r1 = r1.b
            ty3 r1 = (defpackage.ty3) r1
            android.os.Handler r2 = r1.D
            ny3 r3 = r1.w
            r2.removeCallbacks(r3)
            r1.t()
        L_0x00ae:
            r16 = r6
        L_0x00b0:
            r1 = 1
            goto L_0x023c
        L_0x00b3:
            dy3 r1 = r9.j
            boolean r1 = r1.d
            r2 = r20
            vu5 r3 = r2.o
            a64[] r4 = r9.h
            if (r1 != 0) goto L_0x0111
            boolean r1 = r2 instanceof defpackage.x18
            if (r1 == 0) goto L_0x0111
            boolean r1 = r12 instanceof com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException
            if (r1 == 0) goto L_0x0111
            r1 = r12
            com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException r1 = (com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException) r1
            int r1 = r1.c
            r11 = 404(0x194, float:5.66E-43)
            if (r1 != r11) goto L_0x0111
            f55 r1 = r9.i
            int r1 = r1.q(r3)
            r1 = r4[r1]
            java.lang.Object r11 = r1.g
            vy3 r11 = (defpackage.vy3) r11
            long r13 = r1.b
            long r13 = r11.D(r13)
            r16 = -1
            int r11 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r11 == 0) goto L_0x0111
            r16 = 0
            int r11 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r11 == 0) goto L_0x0111
            java.lang.Object r11 = r1.g
            vy3 r11 = (defpackage.vy3) r11
            long r16 = r11.C()
            long r11 = r1.c
            long r16 = r16 + r11
            long r16 = r16 + r13
            r11 = 1
            long r16 = r16 - r11
            r1 = r2
            x18 r1 = (defpackage.x18) r1
            long r11 = r1.b()
            int r1 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r1 <= 0) goto L_0x0111
            r1 = 1
            r9.m = r1
        L_0x010e:
            r20 = r2
            goto L_0x00ae
        L_0x0111:
            f55 r1 = r9.i
            int r1 = r1.q(r3)
            r1 = r4[r1]
            java.lang.Object r4 = r1.e
            jac r4 = (defpackage.jac) r4
            ws6 r4 = r4.b
            b0d r11 = r9.b
            gj0 r4 = r11.A(r4)
            java.lang.Object r12 = r1.f
            gj0 r12 = (defpackage.gj0) r12
            if (r4 == 0) goto L_0x0132
            boolean r4 = r12.equals(r4)
            if (r4 != 0) goto L_0x0132
            goto L_0x010e
        L_0x0132:
            f55 r4 = r9.i
            java.lang.Object r1 = r1.e
            jac r1 = (defpackage.jac) r1
            ws6 r1 = r1.b
            long r13 = android.os.SystemClock.elapsedRealtime()
            r16 = r6
            int r6 = r4.length()
            r20 = r2
            r2 = 0
            r30 = 0
        L_0x0149:
            if (r2 >= r6) goto L_0x015b
            boolean r17 = r4.s(r2, r13)
            if (r17 == 0) goto L_0x0156
            r17 = 1
            int r30 = r30 + 1
            goto L_0x0158
        L_0x0156:
            r17 = 1
        L_0x0158:
            int r2 = r2 + 1
            goto L_0x0149
        L_0x015b:
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r4 = 0
        L_0x0161:
            int r13 = r1.size()
            if (r4 >= r13) goto L_0x0179
            java.lang.Object r13 = r1.get(r4)
            gj0 r13 = (defpackage.gj0) r13
            int r13 = r13.c
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r2.add(r13)
            r13 = 1
            int r4 = r4 + r13
            goto L_0x0161
        L_0x0179:
            int r27 = r2.size()
            nv4 r2 = new nv4
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.ArrayList r1 = r11.o(r1)
            r13 = 0
        L_0x0189:
            int r14 = r1.size()
            if (r13 >= r14) goto L_0x01a1
            java.lang.Object r14 = r1.get(r13)
            gj0 r14 = (defpackage.gj0) r14
            int r14 = r14.c
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r4.add(r14)
            r14 = 1
            int r13 = r13 + r14
            goto L_0x0189
        L_0x01a1:
            int r1 = r4.size()
            int r28 = r27 - r1
            r31 = 1
            r26 = r2
            r29 = r6
            r26.<init>(r27, r28, r29, r30, r31)
            r1 = 2
            boolean r4 = r2.a(r1)
            if (r4 != 0) goto L_0x01c0
            r4 = 1
            boolean r6 = r2.a(r4)
            if (r6 != 0) goto L_0x01c0
            goto L_0x0069
        L_0x01c0:
            r15.getClass()
            sz0 r4 = defpackage.lk9.f(r2, r8)
            if (r4 == 0) goto L_0x0069
            int r6 = r4.b
            boolean r2 = r2.a(r6)
            if (r2 != 0) goto L_0x01d3
            goto L_0x0069
        L_0x01d3:
            long r13 = r4.c
            if (r6 != r1) goto L_0x01e2
            f55 r1 = r9.i
            int r2 = r1.q(r3)
            boolean r1 = r1.r(r2, r13)
            goto L_0x023c
        L_0x01e2:
            r1 = 1
            if (r6 != r1) goto L_0x0069
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r1 = r1 + r13
            java.lang.String r3 = r12.b
            java.lang.Object r4 = r11.b
            java.util.HashMap r4 = (java.util.HashMap) r4
            boolean r6 = r4.containsKey(r3)
            if (r6 == 0) goto L_0x0207
            java.lang.Object r6 = r4.get(r3)
            java.lang.Long r6 = (java.lang.Long) r6
            int r9 = defpackage.mze.a
            long r13 = r6.longValue()
            long r13 = java.lang.Math.max(r1, r13)
            goto L_0x0208
        L_0x0207:
            r13 = r1
        L_0x0208:
            java.lang.Long r6 = java.lang.Long.valueOf(r13)
            r4.put(r3, r6)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            int r4 = r12.c
            if (r4 == r3) goto L_0x00b0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r11.c
            java.util.HashMap r4 = (java.util.HashMap) r4
            boolean r6 = r4.containsKey(r3)
            if (r6 == 0) goto L_0x0233
            java.lang.Object r6 = r4.get(r3)
            java.lang.Long r6 = (java.lang.Long) r6
            int r9 = defpackage.mze.a
            long r11 = r6.longValue()
            long r1 = java.lang.Math.max(r1, r11)
        L_0x0233:
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r4.put(r3, r1)
            goto L_0x00b0
        L_0x023c:
            r12 = 0
            if (r1 == 0) goto L_0x0261
            if (r10 == 0) goto L_0x0261
            if (r5 == 0) goto L_0x025c
            th0 r1 = r0.j(r7)
            r2 = r20
            if (r1 != r2) goto L_0x024d
            r1 = 1
            goto L_0x024e
        L_0x024d:
            r1 = 0
        L_0x024e:
            swb.h(r1)
            boolean r1 = r16.isEmpty()
            if (r1 == 0) goto L_0x025e
            long r3 = r0.I0
            r0.H0 = r3
            goto L_0x025e
        L_0x025c:
            r2 = r20
        L_0x025e:
            sz0 r1 = defpackage.jj7.X
            goto L_0x0264
        L_0x0261:
            r2 = r20
            r1 = r12
        L_0x0264:
            if (r1 != 0) goto L_0x028d
            r15.getClass()
            long r3 = defpackage.lk9.j(r8)
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x0287
            sz0 r1 = new sz0
            r17 = 4
            r18 = 0
            r13 = r1
            r20 = r15
            r14 = r3
            r3 = 0
            r16 = r3
            r13.<init>(r14, r16, r17, r18)
            goto L_0x028b
        L_0x0287:
            r20 = r15
            sz0 r1 = defpackage.jj7.Y
        L_0x028b:
            r14 = r1
            goto L_0x0290
        L_0x028d:
            r20 = r15
            goto L_0x028b
        L_0x0290:
            boolean r1 = r14.a()
            r3 = 1
            r15 = r1 ^ 1
            long r8 = r2.Z
            long r10 = r2.w0
            af8 r1 = r0.Z
            int r3 = r2.c
            int r4 = r0.a
            vu5 r5 = r2.o
            int r6 = r2.X
            java.lang.Object r7 = r2.Y
            r2 = r25
            r13 = r12
            r12 = r38
            r33 = r14
            r14 = r13
            r13 = r15
            r1.h(r2, r3, r4, r5, r6, r7, r8, r10, r12, r13)
            if (r15 == 0) goto L_0x02bf
            r0.E0 = r14
            r20.getClass()
            hyc r1 = r0.Y
            r1.c(r0)
        L_0x02bf:
            return r33
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iy2.y(fj7, long, long, java.io.IOException, int):sz0");
    }
}
