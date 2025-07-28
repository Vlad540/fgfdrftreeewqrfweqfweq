package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import org.apache.http.conn.params.ConnManagerParams;
import org.webrtc.PeerConnectionFactory;
import ru.ok.tamtam.nano.Protos;

/* renamed from: kce  reason: default package */
public final /* synthetic */ class kce implements of3, v1b, j26, sfe, kt0, e26, nh7, bre {
    public final /* synthetic */ int a;

    public /* synthetic */ kce(int i) {
        this.a = i;
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                udd.n("lce", "retryWhenCommonError: connected");
                return;
            case 2:
                Integer num2 = (Integer) obj;
                udd.n("lce", "retryWhenCommonErrorObs: connected");
                return;
            case 3:
                Integer num3 = (Integer) obj;
                udd.n("nce", "retryWhenTamHttpError: connected");
                return;
            case 6:
                Long l = (Long) obj;
                return;
            default:
                Throwable th = (Throwable) obj;
                return;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0382  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0387  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object apply(java.lang.Object r52) {
        /*
            r51 = this;
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3 = 0
            r5 = 0
            r6 = 1
            r7 = r51
            int r7 = r7.a
            switch(r7) {
                case 4: goto L_0x048e;
                case 5: goto L_0x047c;
                case 8: goto L_0x0468;
                case 10: goto L_0x0456;
                case 12: goto L_0x03ce;
                case 13: goto L_0x02b2;
                case 17: goto L_0x00a2;
                case 19: goto L_0x0097;
                case 22: goto L_0x0074;
                case 23: goto L_0x0047;
                default: goto L_0x0010;
            }
        L_0x0010:
            r0 = r52
            android.os.Bundle r0 = (android.os.Bundle) r0
            java.lang.String r1 = rpe.f
            android.os.Bundle r1 = r0.getBundle(r1)
            r1.getClass()
            uoe r1 = uoe.b(r1)
            java.lang.String r2 = rpe.g
            int[] r2 = r0.getIntArray(r2)
            int r3 = r1.a
            int[] r4 = new int[r3]
            if (r2 == 0) goto L_0x002e
            goto L_0x002f
        L_0x002e:
            r2 = r4
        L_0x002f:
            java.lang.String r4 = rpe.h
            boolean[] r4 = r0.getBooleanArray(r4)
            boolean[] r3 = new boolean[r3]
            if (r4 == 0) goto L_0x003a
            goto L_0x003b
        L_0x003a:
            r4 = r3
        L_0x003b:
            java.lang.String r3 = rpe.i
            boolean r0 = r0.getBoolean(r3, r5)
            rpe r3 = new rpe
            r3.<init>(r1, r0, r2, r4)
            return r3
        L_0x0047:
            r0 = r52
            rpe r0 = (rpe) r0
            r0.getClass()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            uoe r2 = r0.b
            android.os.Bundle r2 = r2.f()
            java.lang.String r3 = rpe.f
            r1.putBundle(r3, r2)
            java.lang.String r2 = rpe.g
            int[] r3 = r0.d
            r1.putIntArray(r2, r3)
            java.lang.String r2 = rpe.h
            boolean[] r3 = r0.e
            r1.putBooleanArray(r2, r3)
            java.lang.String r2 = rpe.i
            boolean r0 = r0.c
            r1.putBoolean(r2, r0)
            return r1
        L_0x0074:
            r0 = r52
            fpe r0 = (fpe) r0
            r0.getClass()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            uoe r2 = r0.a
            android.os.Bundle r2 = r2.f()
            java.lang.String r3 = fpe.c
            r1.putBundle(r3, r2)
            ws6 r0 = r0.b
            int[] r0 = xie.H(r0)
            java.lang.String r2 = fpe.d
            r1.putIntArray(r2, r0)
            return r1
        L_0x0097:
            r0 = r52
            uoe r0 = (uoe) r0
            int r0 = r0.c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L_0x00a2:
            r7 = r52
            android.os.Bundle r7 = (android.os.Bundle) r7
            xu5 r0 = xu5.M
            uu5 r8 = new uu5
            r8.<init>()
            if (r7 == 0) goto L_0x00ba
            java.lang.Class<gt0> r0 = gt0.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            int r1 = oze.a
            r7.setClassLoader(r0)
        L_0x00ba:
            java.lang.String r0 = xu5.N
            java.lang.String r0 = r7.getString(r0)
            xu5 r9 = xu5.M
            java.lang.String r1 = r9.a
            if (r0 == 0) goto L_0x00c7
            goto L_0x00c8
        L_0x00c7:
            r0 = r1
        L_0x00c8:
            r8.a = r0
            java.lang.String r0 = xu5.O
            java.lang.String r0 = r7.getString(r0)
            if (r0 == 0) goto L_0x00d3
            goto L_0x00d5
        L_0x00d3:
            java.lang.String r0 = r9.b
        L_0x00d5:
            r8.b = r0
            java.lang.String r0 = xu5.t0
            java.util.ArrayList r0 = r7.getParcelableArrayList(r0)
            if (r0 != 0) goto L_0x00e2
            e8c r0 = e8c.X
            goto L_0x0113
        L_0x00e2:
            ts6 r1 = ws6.i()
            r2 = r5
        L_0x00e7:
            int r3 = r0.size()
            if (r2 >= r3) goto L_0x010f
            java.lang.Object r3 = r0.get(r2)
            android.os.Bundle r3 = (android.os.Bundle) r3
            r3.getClass()
            y87 r4 = new y87
            java.lang.String r10 = y87.c
            java.lang.String r10 = r3.getString(r10)
            java.lang.String r11 = y87.d
            java.lang.String r3 = r3.getString(r11)
            r3.getClass()
            r4.<init>(r10, r3)
            r1.a(r4)
            int r2 = r2 + r6
            goto L_0x00e7
        L_0x010f:
            e8c r0 = r1.j()
        L_0x0113:
            ws6 r0 = ws6.j(r0)
            r8.c = r0
            java.lang.String r0 = xu5.P
            java.lang.String r0 = r7.getString(r0)
            if (r0 == 0) goto L_0x0122
            goto L_0x0124
        L_0x0122:
            java.lang.String r0 = r9.d
        L_0x0124:
            r8.d = r0
            java.lang.String r0 = xu5.Q
            int r1 = r9.e
            int r0 = r7.getInt(r0, r1)
            r8.e = r0
            java.lang.String r0 = xu5.R
            int r1 = r9.f
            int r0 = r7.getInt(r0, r1)
            r8.f = r0
            java.lang.String r0 = xu5.S
            int r1 = r9.g
            int r0 = r7.getInt(r0, r1)
            r8.g = r0
            java.lang.String r0 = xu5.T
            int r1 = r9.h
            int r0 = r7.getInt(r0, r1)
            r8.h = r0
            java.lang.String r0 = xu5.U
            java.lang.String r0 = r7.getString(r0)
            if (r0 == 0) goto L_0x0157
            goto L_0x0159
        L_0x0157:
            java.lang.String r0 = r9.j
        L_0x0159:
            r8.i = r0
            java.lang.String r0 = xu5.V
            android.os.Parcelable r0 = r7.getParcelable(r0)
            a39 r0 = (a39) r0
            if (r0 == 0) goto L_0x0166
            goto L_0x0168
        L_0x0166:
            a39 r0 = r9.k
        L_0x0168:
            r8.j = r0
            java.lang.String r0 = xu5.W
            java.lang.String r0 = r7.getString(r0)
            if (r0 == 0) goto L_0x0173
            goto L_0x0175
        L_0x0173:
            java.lang.String r0 = r9.m
        L_0x0175:
            java.lang.String r0 = c49.l(r0)
            r8.l = r0
            java.lang.String r0 = xu5.X
            java.lang.String r0 = r7.getString(r0)
            if (r0 == 0) goto L_0x0184
            goto L_0x0186
        L_0x0184:
            java.lang.String r0 = r9.n
        L_0x0186:
            java.lang.String r0 = c49.l(r0)
            r8.m = r0
            java.lang.String r0 = xu5.Y
            int r1 = r9.o
            int r0 = r7.getInt(r0, r1)
            r8.n = r0
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
        L_0x019b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = xu5.Z
            r0.append(r1)
            java.lang.String r1 = "_"
            r0.append(r1)
            r1 = 36
            java.lang.String r1 = java.lang.Integer.toString(r5, r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            byte[] r0 = r7.getByteArray(r0)
            if (r0 != 0) goto L_0x02ac
            r8.p = r10
            java.lang.String r0 = xu5.a0
            android.os.Parcelable r0 = r7.getParcelable(r0)
            xn4 r0 = (xn4) r0
            r8.q = r0
            java.lang.String r0 = xu5.b0
            long r1 = r9.s
            long r0 = r7.getLong(r0, r1)
            r8.r = r0
            java.lang.String r0 = xu5.c0
            int r1 = r9.t
            int r0 = r7.getInt(r0, r1)
            r8.s = r0
            java.lang.String r0 = xu5.d0
            int r1 = r9.u
            int r0 = r7.getInt(r0, r1)
            r8.t = r0
            java.lang.String r0 = xu5.e0
            float r1 = r9.v
            float r0 = r7.getFloat(r0, r1)
            r8.u = r0
            java.lang.String r0 = xu5.f0
            int r1 = r9.w
            int r0 = r7.getInt(r0, r1)
            r8.v = r0
            java.lang.String r0 = xu5.g0
            float r1 = r9.x
            float r0 = r7.getFloat(r0, r1)
            r8.w = r0
            java.lang.String r0 = xu5.h0
            byte[] r0 = r7.getByteArray(r0)
            r8.x = r0
            java.lang.String r0 = xu5.i0
            int r1 = r9.z
            int r0 = r7.getInt(r0, r1)
            r8.y = r0
            java.lang.String r0 = xu5.j0
            android.os.Bundle r0 = r7.getBundle(r0)
            if (r0 == 0) goto L_0x024c
            z23 r1 = new z23
            java.lang.String r2 = z23.j
            r3 = -1
            int r11 = r0.getInt(r2, r3)
            java.lang.String r2 = z23.k
            int r12 = r0.getInt(r2, r3)
            java.lang.String r2 = z23.l
            int r13 = r0.getInt(r2, r3)
            java.lang.String r2 = z23.m
            byte[] r16 = r0.getByteArray(r2)
            java.lang.String r2 = z23.n
            int r14 = r0.getInt(r2, r3)
            java.lang.String r2 = z23.o
            int r15 = r0.getInt(r2, r3)
            r10 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r8.z = r1
        L_0x024c:
            java.lang.String r0 = xu5.k0
            int r1 = r9.B
            int r0 = r7.getInt(r0, r1)
            r8.A = r0
            java.lang.String r0 = xu5.l0
            int r1 = r9.C
            int r0 = r7.getInt(r0, r1)
            r8.B = r0
            java.lang.String r0 = xu5.m0
            int r1 = r9.D
            int r0 = r7.getInt(r0, r1)
            r8.C = r0
            java.lang.String r0 = xu5.n0
            int r1 = r9.E
            int r0 = r7.getInt(r0, r1)
            r8.D = r0
            java.lang.String r0 = xu5.o0
            int r1 = r9.F
            int r0 = r7.getInt(r0, r1)
            r8.E = r0
            java.lang.String r0 = xu5.p0
            int r1 = r9.G
            int r0 = r7.getInt(r0, r1)
            r8.F = r0
            java.lang.String r0 = xu5.r0
            int r1 = r9.I
            int r0 = r7.getInt(r0, r1)
            r8.H = r0
            java.lang.String r0 = xu5.s0
            int r1 = r9.J
            int r0 = r7.getInt(r0, r1)
            r8.I = r0
            java.lang.String r0 = xu5.q0
            int r1 = r9.K
            int r0 = r7.getInt(r0, r1)
            r8.J = r0
            xu5 r0 = new xu5
            r0.<init>(r8)
            return r0
        L_0x02ac:
            r10.add(r0)
            int r5 = r5 + r6
            goto L_0x019b
        L_0x02b2:
            r7 = r52
            android.os.Bundle r7 = (android.os.Bundle) r7
            java.lang.String r8 = qje.h
            int r12 = r7.getInt(r8, r5)
            java.lang.String r8 = qje.i
            long r13 = r7.getLong(r8, r1)
            java.lang.String r8 = qje.j
            long r15 = r7.getLong(r8, r3)
            java.lang.String r8 = qje.k
            boolean r18 = r7.getBoolean(r8, r5)
            java.lang.String r8 = qje.l
            android.os.Bundle r7 = r7.getBundle(r8)
            if (r7 == 0) goto L_0x03bf
            java.lang.String r8 = w8.i
            java.util.ArrayList r8 = r7.getParcelableArrayList(r8)
            if (r8 != 0) goto L_0x02e4
            u8[] r0 = new u8[r5]
            r20 = r0
            goto L_0x039c
        L_0x02e4:
            int r9 = r8.size()
            u8[] r9 = new u8[r9]
            r10 = r5
        L_0x02eb:
            int r11 = r8.size()
            if (r10 >= r11) goto L_0x039a
            java.lang.Object r11 = r8.get(r10)
            android.os.Bundle r11 = (android.os.Bundle) r11
            java.lang.String r0 = u8.j
            long r20 = r11.getLong(r0)
            java.lang.String r0 = u8.k
            int r22 = r11.getInt(r0)
            java.lang.String r0 = u8.q
            int r23 = r11.getInt(r0)
            java.lang.String r0 = u8.l
            java.util.ArrayList r0 = r11.getParcelableArrayList(r0)
            java.lang.String r1 = u8.r
            java.util.ArrayList r1 = r11.getParcelableArrayList(r1)
            java.lang.String r2 = u8.m
            int[] r2 = r11.getIntArray(r2)
            java.lang.String r3 = u8.n
            long[] r3 = r11.getLongArray(r3)
            java.lang.String r4 = u8.o
            long r27 = r11.getLong(r4)
            java.lang.String r4 = u8.p
            boolean r29 = r11.getBoolean(r4)
            u8 r4 = new u8
            if (r2 != 0) goto L_0x0333
            int[] r2 = new int[r5]
        L_0x0333:
            r24 = r2
            if (r1 == 0) goto L_0x0359
            int r0 = r1.size()
            l68[] r0 = new l68[r0]
            r2 = r5
        L_0x033e:
            int r11 = r1.size()
            if (r2 >= r11) goto L_0x0356
            java.lang.Object r11 = r1.get(r2)
            android.os.Bundle r11 = (android.os.Bundle) r11
            if (r11 != 0) goto L_0x034e
            r11 = 0
            goto L_0x0352
        L_0x034e:
            l68 r11 = l68.b(r11)
        L_0x0352:
            r0[r2] = r11
            int r2 = r2 + r6
            goto L_0x033e
        L_0x0356:
            r25 = r0
            goto L_0x0380
        L_0x0359:
            if (r0 == 0) goto L_0x037d
            int r1 = r0.size()
            l68[] r1 = new l68[r1]
            r2 = r5
        L_0x0362:
            int r11 = r0.size()
            if (r2 >= r11) goto L_0x037a
            java.lang.Object r11 = r0.get(r2)
            android.net.Uri r11 = (android.net.Uri) r11
            if (r11 != 0) goto L_0x0372
            r11 = 0
            goto L_0x0376
        L_0x0372:
            l68 r11 = l68.c(r11)
        L_0x0376:
            r1[r2] = r11
            int r2 = r2 + r6
            goto L_0x0362
        L_0x037a:
            r25 = r1
            goto L_0x0380
        L_0x037d:
            l68[] r0 = new l68[r5]
            goto L_0x0356
        L_0x0380:
            if (r3 != 0) goto L_0x0387
            long[] r0 = new long[r5]
            r26 = r0
            goto L_0x0389
        L_0x0387:
            r26 = r3
        L_0x0389:
            r19 = r4
            r19.<init>(r20, r22, r23, r24, r25, r26, r27, r29)
            r9[r10] = r4
            int r10 = r10 + r6
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3 = 0
            goto L_0x02eb
        L_0x039a:
            r20 = r9
        L_0x039c:
            java.lang.String r0 = w8.j
            r1 = 0
            long r21 = r7.getLong(r0, r1)
            java.lang.String r0 = w8.k
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r23 = r7.getLong(r0, r1)
            java.lang.String r0 = w8.l
            int r25 = r7.getInt(r0, r5)
            w8 r0 = new w8
            r19 = r0
            r19.<init>(r20, r21, r23, r25)
        L_0x03bc:
            r17 = r0
            goto L_0x03c2
        L_0x03bf:
            w8 r0 = w8.g
            goto L_0x03bc
        L_0x03c2:
            qje r0 = new qje
            r0.<init>()
            r10 = 0
            r11 = 0
            r9 = r0
            r9.j(r10, r11, r12, r13, r15, r17, r18)
            return r0
        L_0x03ce:
            r0 = r52
            android.os.Bundle r0 = (android.os.Bundle) r0
            java.lang.String r1 = tje.t
            android.os.Bundle r1 = r0.getBundle(r1)
            if (r1 == 0) goto L_0x03e1
            l68 r1 = l68.b(r1)
        L_0x03de:
            r32 = r1
            goto L_0x03e4
        L_0x03e1:
            l68 r1 = l68.g
            goto L_0x03de
        L_0x03e4:
            java.lang.String r1 = tje.u
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r34 = r0.getLong(r1, r2)
            java.lang.String r1 = tje.v
            long r36 = r0.getLong(r1, r2)
            java.lang.String r1 = tje.w
            long r38 = r0.getLong(r1, r2)
            java.lang.String r1 = tje.x
            boolean r40 = r0.getBoolean(r1, r5)
            java.lang.String r1 = tje.y
            boolean r41 = r0.getBoolean(r1, r5)
            java.lang.String r1 = tje.z
            android.os.Bundle r1 = r0.getBundle(r1)
            if (r1 == 0) goto L_0x0416
            z58 r1 = z58.b(r1)
            r42 = r1
            goto L_0x0418
        L_0x0416:
            r42 = 0
        L_0x0418:
            java.lang.String r1 = tje.A
            boolean r1 = r0.getBoolean(r1, r5)
            java.lang.String r2 = tje.B
            r3 = 0
            long r43 = r0.getLong(r2, r3)
            java.lang.String r2 = tje.C
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r45 = r0.getLong(r2, r3)
            java.lang.String r2 = tje.D
            int r47 = r0.getInt(r2, r5)
            java.lang.String r2 = tje.E
            int r48 = r0.getInt(r2, r5)
            java.lang.String r2 = tje.F
            r3 = 0
            long r49 = r0.getLong(r2, r3)
            tje r0 = new tje
            r30 = r0
            r0.<init>()
            java.lang.Object r31 = tje.r
            r33 = 0
            r30.b(r31, r32, r33, r34, r36, r38, r40, r41, r42, r43, r45, r47, r48, r49)
            r0.k = r1
            return r0
        L_0x0456:
            r0 = r52
            xfe r0 = (defpackage.xfe) r0
            boolean r1 = r0.a
            if (r1 != 0) goto L_0x0461
            hx7 r0 = hx7.a
            goto L_0x0467
        L_0x0461:
            java.lang.CharSequence r0 = r0.b
            px7 r0 = ax7.e(r0)
        L_0x0467:
            return r0
        L_0x0468:
            r0 = r52
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0477
            r5 = r6
        L_0x0477:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            return r0
        L_0x047c:
            r0 = r52
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            boolean r1 = r0 instanceof one.me.sdk.transfer.exceptions.HttpUrlExpiredException
            if (r1 == 0) goto L_0x0489
            lu9 r0 = ms9.m(r0)
            goto L_0x048d
        L_0x0489:
            et9 r0 = ms9.g(r0)
        L_0x048d:
            return r0
        L_0x048e:
            r0 = r52
            ms9 r0 = (ms9) r0
            kce r1 = new kce
            r2 = 5
            r1.<init>(r2)
            ms9 r0 = r0.h(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kce.apply(java.lang.Object):java.lang.Object");
    }

    public void c(zqe zqe, cre cre, boolean z) {
        switch (this.a) {
            case 27:
                zqe.d(cre);
                return;
            case 28:
                zqe.e(cre);
                return;
            default:
                zqe.g(cre);
                return;
        }
    }

    public void d(Object obj, wi5 wi5) {
        ig8 ig8 = (ig8) obj;
    }

    public lt0 e(Bundle bundle) {
        Bundle bundle2 = bundle;
        y58 y58 = null;
        switch (this.a) {
            case 11:
                swb.e(bundle2.getInt(Integer.toString(0, 36), -1) == 3);
                return bundle2.getBoolean(Integer.toString(1, 36), false) ? new tie(bundle2.getBoolean(Integer.toString(2, 36), false)) : new tie();
            case Protos.Attaches.Attach.LOCATION /*14*/:
                int i = bundle2.getInt(Integer.toString(0, 36), 0);
                long j = bundle2.getLong(Integer.toString(1, 36), -9223372036854775807L);
                long j2 = bundle2.getLong(Integer.toString(2, 36), 0);
                boolean z = bundle2.getBoolean(Integer.toString(3, 36));
                Bundle bundle3 = bundle2.getBundle(Integer.toString(4, 36));
                v8 v8Var = bundle3 != null ? (v8) v8.w0.e(bundle3) : v8.Y;
                pje pje = new pje();
                pje.h((Object) null, (Object) null, i, j, j2, v8Var, z);
                return pje;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                Bundle bundle4 = bundle2.getBundle(Integer.toString(1, 36));
                j68 j68 = bundle4 != null ? (j68) j68.Y.e(bundle4) : null;
                long j3 = bundle2.getLong(Integer.toString(2, 36), -9223372036854775807L);
                long j4 = bundle2.getLong(Integer.toString(3, 36), -9223372036854775807L);
                long j5 = bundle2.getLong(Integer.toString(4, 36), -9223372036854775807L);
                boolean z2 = bundle2.getBoolean(Integer.toString(5, 36), false);
                boolean z3 = bundle2.getBoolean(Integer.toString(6, 36), false);
                Bundle bundle5 = bundle2.getBundle(Integer.toString(7, 36));
                if (bundle5 != null) {
                    y58 = new y58(bundle5.getLong(Integer.toString(0, 36), -9223372036854775807L), bundle5.getLong(Integer.toString(1, 36), -9223372036854775807L), bundle5.getLong(Integer.toString(2, 36), -9223372036854775807L), bundle5.getFloat(Integer.toString(3, 36), -3.4028235E38f), bundle5.getFloat(Integer.toString(4, 36), -3.4028235E38f));
                }
                boolean z4 = bundle2.getBoolean(Integer.toString(8, 36), false);
                long j6 = bundle2.getLong(Integer.toString(9, 36), 0);
                long j7 = bundle2.getLong(Integer.toString(10, 36), -9223372036854775807L);
                int i2 = bundle2.getInt(Integer.toString(11, 36), 0);
                int i3 = bundle2.getInt(Integer.toString(12, 36), 0);
                long j8 = bundle2.getLong(Integer.toString(13, 36), 0);
                sje sje = r0;
                sje sje2 = new sje();
                sje.b(sje.H0, j68, (Object) null, j3, j4, j5, z2, z3, y58, j6, j7, i2, i3, j8);
                sje2.A0 = z4;
                return sje2;
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK /*16*/:
                yc5 yc5 = vu5.W0;
                ArrayList parcelableArrayList = bundle2.getParcelableArrayList(Integer.toString(0, 36));
                po5 po5 = ws6.b;
                return new toe(bundle2.getString(Integer.toString(1, 36), ""), (vu5[]) mt0.n(yc5, parcelableArrayList, e8c.X).toArray(new vu5[0]));
            case 18:
                kce kce = toe.X;
                ArrayList parcelableArrayList2 = bundle2.getParcelableArrayList(Integer.toString(0, 36));
                po5 po52 = ws6.b;
                return new voe((toe[]) mt0.n(kce, parcelableArrayList2, e8c.X).toArray(new toe[0]));
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /*20*/:
                kce kce2 = gpe.c;
                ArrayList parcelableArrayList3 = bundle2.getParcelableArrayList(Integer.toString(0, 36));
                po5 po53 = ws6.b;
                e8c n = mt0.n(kce2, parcelableArrayList3, e8c.X);
                jn jnVar = new jn(4);
                for (int i4 = 0; i4 < n.o; i4++) {
                    gpe gpe = (gpe) n.get(i4);
                    jnVar.I(gpe.a, gpe);
                }
                return new hpe(jnVar.k());
            case 21:
                Bundle bundle6 = bundle2.getBundle(Integer.toString(0, 36));
                bundle6.getClass();
                yc5 yc52 = vu5.W0;
                ArrayList parcelableArrayList4 = bundle6.getParcelableArrayList(Integer.toString(0, 36));
                po5 po54 = ws6.b;
                toe toe = new toe(bundle6.getString(Integer.toString(1, 36), ""), (vu5[]) mt0.n(yc52, parcelableArrayList4, e8c.X).toArray(new vu5[0]));
                int[] intArray = bundle2.getIntArray(Integer.toString(1, 36));
                return intArray == null ? new gpe(toe) : new gpe(toe, xie.f(intArray));
            default:
                Bundle bundle7 = bundle2.getBundle(Integer.toString(0, 36));
                if (bundle7 != null) {
                    yc5 yc53 = vu5.W0;
                    ArrayList parcelableArrayList5 = bundle7.getParcelableArrayList(Integer.toString(0, 36));
                    po5 po55 = ws6.b;
                    y58 = new toe(bundle7.getString(Integer.toString(1, 36), ""), (vu5[]) mt0.n(yc53, parcelableArrayList5, e8c.X).toArray(new vu5[0]));
                }
                y58.getClass();
                int[] intArray2 = bundle2.getIntArray(Integer.toString(1, 36));
                int i5 = y58.a;
                int[] iArr = new int[i5];
                if (intArray2 == null) {
                    intArray2 = iArr;
                }
                int i6 = bundle2.getInt(Integer.toString(2, 36), -1);
                boolean[] booleanArray = bundle2.getBooleanArray(Integer.toString(3, 36));
                boolean[] zArr = new boolean[i5];
                if (booleanArray == null) {
                    booleanArray = zArr;
                }
                return new tpe(y58, intArray2, i6, booleanArray);
        }
    }

    public boolean test(Object obj) {
        return lce.a(((Integer) obj).intValue());
    }
}
