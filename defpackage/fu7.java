package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.b;

/* renamed from: fu7  reason: default package */
public abstract class fu7 {
    public static final /* synthetic */ int a = 0;

    public static o10 a(byte[] bArr) {
        if (bArr != null && bArr.length > 0) {
            try {
                byte[] bArr2 = b.a;
                return b.c(Protos.Attaches.Attach.parseFrom(bArr));
            } catch (InvalidProtocolBufferNanoException e) {
                throw new IOException(e);
            } catch (ProtoException unused) {
            }
        }
        return null;
    }

    public static jj7 b(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        try {
            byte[] bArr2 = b.a;
            return b.e(Protos.Attaches.parseFrom(bArr));
        } catch (InvalidProtocolBufferNanoException e) {
            throw new IOException(e);
        } catch (ProtoException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static int c(jj7 jj7) {
        if (jj7 == null) {
            return 0;
        }
        if (jj7.v() != 1) {
            return jj7.v() > 1 ? 4 : 0;
        }
        o10 u = jj7.u(0);
        switch (u.a.ordinal()) {
            case 1:
            case 8:
            case 10:
            case 11:
                return 0;
            case 2:
                return 1;
            case 3:
                return u.d.b == 2 ? 11 : 3;
            case 4:
                return 2;
            case 5:
                return 10;
            case 6:
                return 5;
            case 7:
                return 8;
            case 9:
                return 7;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                return 9;
            default:
                udd.s("fu7", "new attach type " + jj7.u(0).a + " in calcMediaType method. developer, please add mapping logic for it", (Throwable) null);
                return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0115  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.fy d(defpackage.o10 r50) {
        /*
            r0 = r50
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            j10 r2 = r0.a
            int r2 = r2.ordinal()
            r3 = 6
            r4 = 5
            r5 = 4
            r6 = 1
            r7 = 2
            r8 = 3
            switch(r2) {
                case 0: goto L_0x0290;
                case 1: goto L_0x0233;
                case 2: goto L_0x022c;
                case 3: goto L_0x01f8;
                case 4: goto L_0x01c8;
                case 5: goto L_0x015d;
                case 6: goto L_0x012f;
                case 7: goto L_0x00e8;
                case 8: goto L_0x0015;
                case 9: goto L_0x00cb;
                case 10: goto L_0x00a1;
                case 11: goto L_0x005d;
                case 12: goto L_0x0016;
                default: goto L_0x0015;
            }
        L_0x0015:
            return r1
        L_0x0016:
            x00 r0 = r0.m
            java.util.List r1 = r0.e
            if (r1 == 0) goto L_0x0040
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0025:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x003e
            java.lang.Object r3 = r1.next()
            y00 r3 = (defpackage.y00) r3
            em7 r4 = new em7
            dm7 r5 = r3.a
            long r6 = r3.b
            r4.<init>(r5, r6)
            r2.add(r4)
            goto L_0x0025
        L_0x003e:
            r11 = r2
            goto L_0x0045
        L_0x0040:
            java.util.List r2 = java.util.Collections.emptyList()
            goto L_0x003e
        L_0x0045:
            bm7 r1 = new bm7
            r15 = 0
            r16 = 0
            dm7 r4 = r0.a
            long r5 = r0.b
            long r7 = r0.c
            long r9 = r0.d
            java.lang.String r12 = r0.f
            float r13 = r0.g
            boolean r14 = r0.h
            r3 = r1
            r3.<init>(r4, r5, r7, r9, r11, r12, r13, r14, r15, r16)
            return r1
        L_0x005d:
            b10 r0 = r0.l
            int r1 = r0.e
            if (r1 == 0) goto L_0x0071
            int r1 = hr1.t(r1)
            if (r1 == r6) goto L_0x007b
            if (r1 == r7) goto L_0x0079
            if (r1 == r8) goto L_0x0077
            if (r1 == r5) goto L_0x0075
            if (r1 == r4) goto L_0x0073
        L_0x0071:
            r14 = r6
            goto L_0x007c
        L_0x0073:
            r14 = r3
            goto L_0x007c
        L_0x0075:
            r14 = r4
            goto L_0x007c
        L_0x0077:
            r14 = r5
            goto L_0x007c
        L_0x0079:
            r14 = r8
            goto L_0x007c
        L_0x007b:
            r14 = r7
        L_0x007c:
            t2b r1 = new t2b
            long r2 = r0.a
            java.lang.Long r10 = java.lang.Long.valueOf(r2)
            long r2 = r0.b
            java.lang.Long r11 = java.lang.Long.valueOf(r2)
            long r2 = r0.c
            java.lang.Long r12 = java.lang.Long.valueOf(r2)
            long r2 = r0.d
            java.lang.Long r13 = java.lang.Long.valueOf(r2)
            java.lang.String r15 = r0.f
            r16 = 0
            r17 = 0
            r9 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            return r1
        L_0x00a1:
            yf3 r1 = new yf3
            q00 r0 = r0.k
            java.lang.String r2 = r0.a
            r27 = 0
            r28 = 0
            long r3 = r0.b
            java.lang.String r5 = r0.c
            java.lang.String r6 = r0.d
            java.lang.String r7 = r0.e
            java.lang.String r8 = r0.f
            java.lang.String r0 = r0.g
            r18 = r1
            r19 = r2
            r20 = r3
            r22 = r5
            r23 = r6
            r24 = r7
            r25 = r8
            r26 = r0
            r18.<init>(r19, r20, r22, r23, r24, r25, r26, r27, r28)
            return r1
        L_0x00cb:
            dc5 r1 = new dc5
            v00 r0 = r0.j
            long r10 = r0.a
            o10 r2 = r0.d
            fy r15 = d(r2)
            java.lang.String r14 = r0.c
            r18 = 0
            long r12 = r0.b
            r16 = 0
            java.lang.String r0 = r0.e
            r9 = r1
            r17 = r0
            r9.<init>(r10, r12, r14, r15, r16, r17, r18)
            return r1
        L_0x00e8:
            o00 r0 = r0.i
            int r1 = r0.c
            if (r1 == 0) goto L_0x00fb
            int r1 = hr1.t(r1)
            if (r1 == r6) goto L_0x00f9
            if (r1 == r7) goto L_0x00f7
            goto L_0x00fb
        L_0x00f7:
            r12 = r7
            goto L_0x00fc
        L_0x00f9:
            r12 = r8
            goto L_0x00fc
        L_0x00fb:
            r12 = r6
        L_0x00fc:
            int r1 = r0.d
            if (r1 == 0) goto L_0x0117
            int r1 = hr1.t(r1)
            if (r1 == 0) goto L_0x0117
            if (r1 == r6) goto L_0x0115
            if (r1 == r7) goto L_0x0113
            if (r1 == r8) goto L_0x0111
            if (r1 == r5) goto L_0x010f
            goto L_0x0117
        L_0x010f:
            r13 = r4
            goto L_0x0118
        L_0x0111:
            r13 = r5
            goto L_0x0118
        L_0x0113:
            r13 = r8
            goto L_0x0118
        L_0x0115:
            r13 = r7
            goto L_0x0118
        L_0x0117:
            r13 = r6
        L_0x0118:
            oz0 r1 = new oz0
            long r2 = r0.e
            java.lang.Long r14 = java.lang.Long.valueOf(r2)
            r16 = 0
            r17 = 0
            java.lang.String r10 = r0.a
            java.lang.String r11 = r0.b
            java.util.List r15 = r0.f
            r9 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            return r1
        L_0x012f:
            qad r1 = new qad
            f10 r0 = r0.g
            long r2 = r0.a
            a10 r4 = r0.f
            fpa r25 = x(r4)
            o10 r4 = r0.g
            fy r26 = d(r4)
            r27 = 0
            r28 = 0
            java.lang.String r4 = r0.b
            java.lang.String r5 = r0.c
            java.lang.String r6 = r0.d
            java.lang.String r0 = r0.e
            r18 = r1
            r19 = r2
            r21 = r4
            r22 = r5
            r23 = r6
            r24 = r0
            r18.<init>(r19, r21, r22, r23, r24, r25, r26, r27, r28)
            return r1
        L_0x015d:
            qsd r1 = new qsd
            i10 r0 = r0.f
            long r2 = r0.a
            int r4 = r0.j
            int r4 = hr1.t(r4)
            if (r4 == r6) goto L_0x0178
            if (r4 == r7) goto L_0x0175
            if (r4 == r8) goto L_0x0172
            r41 = r6
            goto L_0x017a
        L_0x0172:
            r41 = r5
            goto L_0x017a
        L_0x0175:
            r41 = r8
            goto L_0x017a
        L_0x0178:
            r41 = r7
        L_0x017a:
            int r4 = r0.n
            int r4 = hr1.t(r4)
            if (r4 == r6) goto L_0x018a
            if (r4 == r7) goto L_0x0187
            r46 = r6
            goto L_0x018c
        L_0x0187:
            r46 = r8
            goto L_0x018c
        L_0x018a:
            r46 = r7
        L_0x018c:
            long r4 = r0.k
            r42 = r4
            java.lang.String r4 = r0.l
            r44 = r4
            boolean r4 = r0.m
            r45 = r4
            r47 = 0
            int r4 = r0.c
            r32 = r4
            int r4 = r0.d
            r33 = r4
            java.lang.String r4 = r0.b
            r34 = r4
            long r4 = r0.i
            r35 = r4
            java.lang.String r4 = r0.e
            r37 = r4
            java.lang.String r4 = r0.f
            r38 = r4
            java.util.List r4 = r0.g
            r39 = r4
            java.lang.String r4 = r0.h
            r40 = r4
            r48 = 0
            java.lang.String r0 = r0.o
            r49 = r0
            r29 = r1
            r30 = r2
            r29.<init>(r30, r32, r33, r34, r35, r37, r38, r39, r40, r41, r42, r44, r45, r46, r47, r48, r49)
            return r1
        L_0x01c8:
            y10 r1 = new y10
            l00 r0 = r0.e
            long r2 = r0.a
            int r9 = r0.i
            if (r9 != 0) goto L_0x01d4
        L_0x01d2:
            r15 = r6
            goto L_0x01e8
        L_0x01d4:
            int r9 = hr1.t(r9)
            if (r9 == r6) goto L_0x01e7
            if (r9 == r7) goto L_0x01e5
            if (r9 == r8) goto L_0x01e3
            if (r9 == r5) goto L_0x01e1
            goto L_0x01d2
        L_0x01e1:
            r15 = r4
            goto L_0x01e8
        L_0x01e3:
            r15 = r5
            goto L_0x01e8
        L_0x01e5:
            r15 = r8
            goto L_0x01e8
        L_0x01e7:
            r15 = r7
        L_0x01e8:
            r11 = 0
            java.lang.String r12 = r0.e
            r7 = 0
            r8 = 0
            r10 = 0
            java.lang.String r13 = r0.f
            r14 = 0
            r4 = r1
            r5 = r2
            r4.<init>(r5, r7, r8, r10, r11, r12, r13, r14, r15)
            return r1
        L_0x01f8:
            p1f r1 = new p1f
            n10 r0 = r0.d
            long r2 = r0.a
            int r4 = r0.b
            int r19 = hr1.t(r4)
            r4 = 0
            java.lang.Long r20 = java.lang.Long.valueOf(r4)
            r31 = 0
            r32 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            java.lang.String r0 = r0.m
            r30 = r0
            r16 = r1
            r17 = r2
            r16.<init>(r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            return r1
        L_0x022c:
            a10 r0 = r0.b
            fpa r0 = x(r0)
            return r0
        L_0x0233:
            t00 r0 = r0.c
            s00 r2 = r0.a
            int r2 = r2.ordinal()
            switch(r2) {
                case 1: goto L_0x0250;
                case 2: goto L_0x024e;
                case 3: goto L_0x0251;
                case 4: goto L_0x024c;
                case 5: goto L_0x0242;
                case 6: goto L_0x024a;
                case 7: goto L_0x0247;
                case 8: goto L_0x0244;
                case 9: goto L_0x023e;
                case 10: goto L_0x0240;
                default: goto L_0x023e;
            }
        L_0x023e:
            r5 = r6
            goto L_0x0251
        L_0x0240:
            r3 = 12
        L_0x0242:
            r5 = r3
            goto L_0x0251
        L_0x0244:
            r3 = 10
            goto L_0x0242
        L_0x0247:
            r3 = 9
            goto L_0x0242
        L_0x024a:
            r3 = 7
            goto L_0x0242
        L_0x024c:
            r5 = r4
            goto L_0x0251
        L_0x024e:
            r5 = r8
            goto L_0x0251
        L_0x0250:
            r5 = r7
        L_0x0251:
            d10 r2 = r0.h
            if (r2 == 0) goto L_0x0264
            d10 r1 = new d10
            float r9 = r2.d
            float r10 = r2.e
            float r7 = r2.b
            float r8 = r2.c
            r11 = 2
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11)
        L_0x0264:
            r12 = r1
            gr3 r1 = new gr3
            long r2 = r0.b
            java.lang.Long r6 = java.lang.Long.valueOf(r2)
            java.util.ArrayList r7 = r0.c
            r19 = 0
            r20 = 0
            java.lang.String r8 = r0.d
            java.lang.String r9 = r0.e
            java.lang.String r10 = r0.f
            java.lang.String r11 = r0.g
            java.lang.String r13 = r0.i
            java.lang.String r14 = r0.j
            boolean r15 = r0.k
            int r2 = r0.l
            r16 = r2
            r17 = 0
            java.lang.String r0 = r0.o
            r18 = r0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r1
        L_0x0290:
            kue r0 = new kue
            r1 = 0
            r0.<init>(r1, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fu7.d(o10):fy");
    }

    /* JADX WARNING: type inference failed for: r10v2, types: [r00, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r11v3, types: [java.lang.Object, m00] */
    /* JADX WARNING: type inference failed for: r10v15, types: [java.lang.Object, m00] */
    /* JADX WARNING: type inference failed for: r10v19, types: [java.lang.Object, k00] */
    /* JADX WARNING: type inference failed for: r11v14, types: [java.lang.Object, m00] */
    /* JADX WARNING: type inference failed for: r10v21, types: [h10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r11v35, types: [java.lang.Object, m00] */
    /* JADX WARNING: type inference failed for: r11v40, types: [e10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r12v35, types: [java.lang.Object, m00] */
    /* JADX WARNING: type inference failed for: r10v26, types: [i00, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v28, types: [java.lang.Object, m00] */
    /* JADX WARNING: type inference failed for: r10v31, types: [java.lang.Object, m00] */
    /* JADX WARNING: type inference failed for: r11v67, types: [u00, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r11v69, types: [java.lang.Object, m00] */
    /* JADX WARNING: type inference failed for: r10v38, types: [p00, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v40, types: [java.lang.Object, m00] */
    /* JADX WARNING: type inference failed for: r10v41, types: [b10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v43, types: [java.lang.Object, m00] */
    /* JADX WARNING: type inference failed for: r10v44, types: [w00, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r11v102, types: [java.lang.Object, m00] */
    /* JADX WARNING: type inference failed for: r10v48, types: [java.lang.Object, m00] */
    public static o10 e(fy fyVar, zpc zpc, long j, long j2) {
        int i;
        List list;
        int i2 = 5;
        int i3 = 0;
        int i4 = 4;
        int i5 = 3;
        int i6 = 1;
        switch (fyVar.a.ordinal()) {
            case 1:
                gr3 gr3 = (gr3) fyVar;
                int i7 = t00.p;
                ? obj = new Object();
                int i8 = gr3.o;
                switch (hr1.t(i8)) {
                    case 0:
                        obj.a = s00.a;
                        break;
                    case 1:
                        obj.a = s00.b;
                        break;
                    case 2:
                        obj.a = s00.c;
                        break;
                    case 3:
                        obj.a = s00.o;
                        break;
                    case 4:
                        obj.a = s00.X;
                        break;
                    case 5:
                        obj.a = s00.Y;
                        break;
                    case 6:
                        obj.a = s00.Z;
                        break;
                    case 8:
                        obj.a = s00.w0;
                        break;
                    case 9:
                        obj.a = s00.x0;
                        break;
                    case 10:
                        obj.a = s00.y0;
                        break;
                    case 11:
                        obj.a = s00.z0;
                        break;
                }
                Long l = gr3.X;
                if (l != null) {
                    obj.b = l.longValue();
                }
                List list2 = gr3.Y;
                if (list2 != null && list2.size() > 0) {
                    if (obj.c == null) {
                        obj.c = new ArrayList();
                    }
                    obj.c.addAll(list2);
                }
                String str = gr3.Z;
                if (str != null) {
                    obj.d = str;
                }
                String str2 = gr3.w0;
                if (str2 != null) {
                    obj.e = str2;
                }
                String str3 = gr3.x0;
                if (str3 != null) {
                    obj.f = str3;
                }
                String str4 = gr3.y0;
                if (str4 != null) {
                    obj.g = str4;
                }
                d10 d10 = gr3.z0;
                if (d10 != null) {
                    obj.h = new d10(d10.b, d10.c, d10.d, d10.e, 0);
                }
                String str5 = gr3.A0;
                if (str5 != null) {
                    obj.i = str5;
                }
                String str6 = gr3.B0;
                if (str6 != null) {
                    obj.j = str6;
                }
                obj.k = gr3.C0;
                int i9 = gr3.D0;
                if (i9 != 0) {
                    obj.l = i9;
                }
                if (i8 == 11) {
                    obj.m = j;
                    obj.n = j2;
                }
                obj.o = gr3.F0;
                int i10 = o10.z;
                ? obj2 = new Object();
                obj2.l = UUID.randomUUID().toString();
                obj2.a = j10.b;
                obj2.c = obj.a();
                obj2.n = gr3.b;
                obj2.y = gr3.c;
                return obj2.a();
            case 2:
                return w((fpa) fyVar, zpc);
            case 3:
                p1f p1f = (p1f) fyVar;
                n10 n10 = n10.r;
                k10 k10 = new k10();
                Long l2 = p1f.Y;
                if (l2 != null) {
                    k10.b = l2.longValue();
                }
                Integer num = p1f.x0;
                if (num != null) {
                    k10.e = num.intValue();
                }
                Integer num2 = p1f.w0;
                if (num2 != null) {
                    k10.d = num2.intValue();
                }
                byte[] bArr = p1f.B0;
                if (bArr != null && bArr.length > 0) {
                    try {
                        zpc.getClass();
                        k10.i = bArr;
                    } catch (Throwable th) {
                        throw new RuntimeException(th);
                    }
                }
                String str7 = p1f.Z;
                if (str7 != null) {
                    k10.c = str7;
                }
                k10.f = p1f.y0;
                String str8 = p1f.z0;
                if (str8 != null) {
                    k10.g = str8;
                }
                String str9 = p1f.A0;
                if (str9 != null) {
                    k10.h = str9;
                }
                Long l3 = p1f.o;
                if (l3 != null) {
                    k10.a = l3.longValue();
                }
                Integer num3 = p1f.X;
                if (num3 != null) {
                    int intValue = num3.intValue();
                    int[] w = hr1.w(2);
                    int length = w.length;
                    while (true) {
                        if (i3 < length) {
                            int i11 = w[i3];
                            if (hr1.t(i11) == intValue) {
                                i6 = i11;
                            } else {
                                i3++;
                            }
                        }
                    }
                    k10.q = i6;
                }
                Long l4 = p1f.C0;
                if (l4 != null) {
                    k10.j = l4.longValue();
                }
                k10.l = p1f.D0;
                m2f m2f = p1f.E0;
                if (m2f != null) {
                    k10.m = new xx(m2f.b, m2f.c, m2f.o, m2f.X, m2f.a);
                }
                int i12 = o10.z;
                ? obj3 = new Object();
                obj3.l = UUID.randomUUID().toString();
                obj3.a = j10.o;
                obj3.n = p1f.b;
                obj3.y = p1f.c;
                obj3.d = new n10(k10);
                return obj3.a();
            case 4:
                y10 y10 = (y10) fyVar;
                l00 l00 = l00.j;
                ? obj4 = new Object();
                Long l5 = y10.o;
                if (l5 != null) {
                    obj4.a = l5.longValue();
                }
                Long l6 = y10.Y;
                if (l6 != null) {
                    obj4.c = l6.longValue();
                }
                String str10 = y10.X;
                if (str10 != null) {
                    obj4.b = str10;
                }
                byte[] bArr2 = y10.Z;
                if (bArr2 != null) {
                    obj4.d = bArr2;
                }
                String str11 = y10.x0;
                if (str11 != null) {
                    obj4.f = str11;
                }
                int i13 = y10.y0;
                if (i13 != 0) {
                    int t = hr1.t(i13);
                    if (t == 1) {
                        i2 = 2;
                    } else if (t == 2) {
                        i2 = 3;
                    } else if (t == 3) {
                        i2 = 4;
                    } else if (t != 4) {
                        i2 = 1;
                    }
                    obj4.i = i2;
                }
                obj4.e = y10.w0;
                int i14 = o10.z;
                ? obj5 = new Object();
                obj5.l = UUID.randomUUID().toString();
                obj5.a = j10.X;
                obj5.n = y10.b;
                obj5.y = y10.c;
                obj5.e = new l00(obj4);
                return obj5.a();
            case 5:
                qsd qsd = (qsd) fyVar;
                i10 i102 = i10.p;
                ? obj6 = new Object();
                obj6.a = qsd.o;
                obj6.d = qsd.Z;
                obj6.b = qsd.X;
                obj6.c = qsd.Y;
                obj6.e = qsd.w0;
                String str12 = qsd.x0;
                if (!r1g.p(str12)) {
                    obj6.f = str12;
                }
                String str13 = qsd.y0;
                if (!r1g.p(str13)) {
                    obj6.g = str13;
                }
                if (obj6.i == null) {
                    obj6.i = new ArrayList();
                }
                obj6.i.addAll(qsd.z0);
                String str14 = qsd.A0;
                if (!r1g.p(str14)) {
                    obj6.h = str14;
                }
                int i15 = qsd.B0;
                if (i15 != 0) {
                    int t2 = hr1.t(i15);
                    if (t2 == 1) {
                        i4 = 2;
                    } else if (t2 == 2) {
                        i4 = 3;
                    } else if (t2 != 3) {
                        i4 = 1;
                    }
                    obj6.j = i4;
                }
                obj6.k = qsd.C0;
                obj6.l = qsd.D0;
                obj6.m = qsd.E0;
                int i16 = qsd.F0;
                if (i16 != 0) {
                    int t3 = hr1.t(i16);
                    if (t3 == 1) {
                        i5 = 2;
                    } else if (t3 != 2) {
                        i5 = 1;
                    }
                    obj6.n = i5;
                } else {
                    obj6.n = 1;
                }
                obj6.o = qsd.G0;
                int i17 = o10.z;
                ? obj7 = new Object();
                obj7.l = UUID.randomUUID().toString();
                obj7.a = j10.Y;
                obj7.f = obj6.a();
                obj7.n = qsd.b;
                obj7.y = qsd.c;
                return obj7.a();
            case 6:
                qad qad = (qad) fyVar;
                int i18 = f10.i;
                ? obj8 = new Object();
                obj8.a = qad.o;
                String str15 = qad.Y;
                if (str15 != null) {
                    obj8.c = str15;
                }
                String str16 = qad.X;
                if (str16 != null) {
                    obj8.b = str16;
                }
                if (str15 != null) {
                    obj8.c = str15;
                }
                String str17 = qad.Z;
                if (str17 != null) {
                    obj8.d = str17;
                }
                String str18 = qad.w0;
                if (str18 != null) {
                    obj8.e = str18;
                }
                fpa fpa = qad.x0;
                if (fpa != null) {
                    obj8.f = w(fpa, zpc).b;
                }
                fy fyVar2 = qad.y0;
                if (fyVar2 != null) {
                    obj8.g = e(fyVar2, zpc, 0, 0);
                }
                boolean z = qad.b;
                obj8.h = z;
                int i19 = o10.z;
                ? obj9 = new Object();
                obj9.l = UUID.randomUUID().toString();
                obj9.a = j10.Z;
                obj9.g = new f10(obj8);
                obj9.n = z;
                obj9.y = qad.c;
                return obj9.a();
            case 7:
                wl wlVar = (wl) fyVar;
                ? obj10 = new Object();
                obj10.a = wlVar.o;
                obj10.b = wlVar.X;
                obj10.c = wlVar.Y;
                obj10.d = wlVar.Z;
                obj10.e = wlVar.w0;
                obj10.f = wlVar.x0;
                j00 j00 = new j00(obj10);
                int i20 = o10.z;
                ? obj11 = new Object();
                obj11.l = UUID.randomUUID().toString();
                obj11.a = j10.x0;
                obj11.n = wlVar.b;
                obj11.y = wlVar.c;
                obj11.h = j00;
                return obj11.a();
            case 8:
                oz0 oz0 = (oz0) fyVar;
                n00 n00 = new n00();
                n00.a = oz0.o;
                n00.c = oz0.X;
                int i21 = oz0.Y;
                if (i21 != 0) {
                    int t4 = hr1.t(i21);
                    i = t4 != 1 ? t4 != 2 ? 1 : 2 : 3;
                } else {
                    i = 0;
                }
                n00.d = i;
                int i22 = oz0.Z;
                if (i22 != 0) {
                    int t5 = hr1.t(i22);
                    if (t5 == 1) {
                        i2 = 2;
                    } else if (t5 == 2) {
                        i2 = 3;
                    } else if (t5 == 3) {
                        i2 = 4;
                    } else if (t5 != 4) {
                        i2 = 1;
                    }
                    i3 = i2;
                }
                n00.f = i3;
                Long l7 = oz0.w0;
                n00.b = l7 != null ? l7.longValue() : 0;
                List list3 = oz0.x0;
                n00.e = list3;
                if (list3 == null) {
                    n00.e = Collections.emptyList();
                }
                o00 o00 = new o00(n00);
                int i23 = o10.z;
                ? obj12 = new Object();
                obj12.l = UUID.randomUUID().toString();
                obj12.a = j10.w0;
                obj12.q = o00;
                obj12.n = oz0.b;
                obj12.y = oz0.c;
                return obj12.a();
            case 9:
                dc5 dc5 = (dc5) fyVar;
                ? obj13 = new Object();
                obj13.a = dc5.o;
                obj13.b = dc5.X;
                obj13.c = dc5.Y;
                fy fyVar3 = dc5.Z;
                obj13.e = fyVar3 != null ? e(fyVar3, zpc, 0, 0) : null;
                obj13.d = dc5.w0;
                v00 v00 = new v00(obj13);
                int i24 = o10.z;
                ? obj14 = new Object();
                obj14.l = UUID.randomUUID().toString();
                obj14.a = j10.y0;
                obj14.r = v00;
                obj14.n = dc5.b;
                obj14.y = dc5.c;
                return obj14.a();
            case 10:
                yf3 yf3 = (yf3) fyVar;
                ? obj15 = new Object();
                obj15.a = yf3.o;
                obj15.b = yf3.X;
                obj15.c = yf3.Y;
                obj15.f = yf3.x0;
                obj15.g = yf3.y0;
                obj15.d = yf3.Z;
                obj15.e = yf3.w0;
                q00 q00 = new q00(obj15);
                int i25 = o10.z;
                ? obj16 = new Object();
                obj16.l = UUID.randomUUID().toString();
                obj16.a = j10.z0;
                obj16.s = q00;
                obj16.n = yf3.b;
                obj16.y = yf3.c;
                return obj16.a();
            case 11:
                t2b t2b = (t2b) fyVar;
                ? obj17 = new Object();
                obj17.a = t2b.o.longValue();
                obj17.b = t2b.X.longValue();
                obj17.c = t2b.Y.longValue();
                obj17.d = t2b.Z.longValue();
                int i26 = t2b.w0;
                if (i26 != 0) {
                    int t6 = hr1.t(i26);
                    if (t6 == 1) {
                        i2 = 2;
                    } else if (t6 == 2) {
                        i2 = 3;
                    } else if (t6 == 3) {
                        i2 = 4;
                    } else if (t6 != 4) {
                        if (t6 == 5) {
                            i2 = 6;
                        }
                    }
                    obj17.e = i2;
                    obj17.f = t2b.x0;
                    b10 b10 = new b10(obj17);
                    int i27 = o10.z;
                    ? obj18 = new Object();
                    obj18.l = UUID.randomUUID().toString();
                    obj18.a = j10.A0;
                    obj18.t = b10;
                    obj18.n = t2b.b;
                    obj18.y = t2b.c;
                    return obj18.a();
                }
                i2 = 1;
                obj17.e = i2;
                obj17.f = t2b.x0;
                b10 b102 = new b10(obj17);
                int i272 = o10.z;
                ? obj182 = new Object();
                obj182.l = UUID.randomUUID().toString();
                obj182.a = j10.A0;
                obj182.t = b102;
                obj182.n = t2b.b;
                obj182.y = t2b.c;
                return obj182.a();
            case 13:
                bm7 bm7 = (bm7) fyVar;
                ? obj19 = new Object();
                obj19.a = bm7.o;
                obj19.b = bm7.X;
                obj19.c = bm7.Y;
                obj19.d = bm7.Z;
                List<em7> list4 = bm7.w0;
                if (list4 == null) {
                    list = Collections.emptyList();
                } else {
                    ArrayList arrayList = new ArrayList(list4.size());
                    for (em7 em7 : list4) {
                        arrayList.add(new y00(em7.a, em7.b));
                    }
                    list = arrayList;
                }
                obj19.e = list;
                obj19.f = bm7.x0;
                obj19.g = bm7.y0;
                obj19.h = bm7.z0;
                x00 a2 = obj19.a();
                int i28 = o10.z;
                ? obj20 = new Object();
                obj20.l = UUID.randomUUID().toString();
                obj20.a = j10.B0;
                obj20.v = a2;
                obj20.n = bm7.b;
                obj20.y = bm7.c;
                return obj20.a();
            default:
                int i29 = o10.z;
                ? obj21 = new Object();
                obj21.a = j10.a;
                obj21.l = UUID.randomUUID().toString();
                obj21.n = fyVar.b;
                obj21.y = fyVar.c;
                return obj21.a();
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.AbstractCollection, java.util.ArrayList, zy] */
    /* JADX WARNING: type inference failed for: r6v4, types: [f71, java.lang.Object] */
    public static zy f(jj7 jj7) {
        int i;
        int i2;
        xt0 xt0;
        jj7 jj72 = jj7;
        if (jj72 == null) {
            return null;
        }
        ? arrayList = new ArrayList();
        for (o10 d : (List) jj72.a) {
            fy d2 = d(d);
            if (d2 != null) {
                arrayList.add(d2);
            }
        }
        vw6 vw6 = (vw6) jj72.b;
        if (vw6 != null) {
            ? obj = new Object();
            ArrayList arrayList2 = new ArrayList();
            for (fu0 it : vw6.a) {
                ArrayList arrayList3 = new ArrayList();
                arrayList2.add(arrayList3);
                Iterator it2 = it.iterator();
                while (it2.hasNext()) {
                    yt0 yt0 = (yt0) it2.next();
                    String str = yt0.b.a;
                    xt0[] xt0Arr = xt0.c;
                    int length = xt0Arr.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            xt0 = xt0.UNKNOWN;
                            break;
                        }
                        xt0 = xt0Arr[i3];
                        if (xt0.a.equalsIgnoreCase(str)) {
                            break;
                        }
                        i3++;
                    }
                    wt0 wt0 = wt0.UNKNOWN;
                    int t = hr1.t(yt0.c);
                    if (t == 0) {
                        wt0 = wt0.DEFAULT;
                    } else if (t == 1) {
                        wt0 = wt0.POSITIVE;
                    } else if (t == 2) {
                        wt0 = wt0.NEGATIVE;
                    }
                    wf wfVar = new wf();
                    wfVar.c = xt0;
                    wfVar.X = wt0;
                    wfVar.o = yt0.a;
                    wfVar.Y = yt0.o;
                    wfVar.Z = yt0.X;
                    wfVar.a = yt0.Y;
                    wfVar.b = yt0.Z;
                    arrayList3.add(new zt0(wfVar));
                }
            }
            obj.a = arrayList2;
            arrayList.add(new ww6(new s77((f71) obj), vw6.b, false, false));
        }
        v9c v9c = (v9c) jj72.c;
        if (v9c != null) {
            ArrayList arrayList4 = new ArrayList();
            for (u9c it3 : v9c.a) {
                ArrayList arrayList5 = new ArrayList();
                arrayList4.add(arrayList5);
                Iterator it4 = it3.iterator();
                while (it4.hasNext()) {
                    s9c s9c = (s9c) it4.next();
                    String e = m4b.e(s9c.a);
                    int[] w = hr1.w(5);
                    int length2 = w.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length2) {
                            i = 0;
                            break;
                        }
                        i = w[i4];
                        if (m4b.f(i).equals(e)) {
                            break;
                        }
                        i4++;
                    }
                    int i5 = i == 0 ? 5 : i;
                    int t2 = hr1.t(s9c.b);
                    if (t2 == 0) {
                        i2 = 1;
                    } else if (t2 != 1) {
                        i2 = t2 != 2 ? 4 : 3;
                    } else {
                        i2 = 2;
                    }
                    arrayList5.add(new t9c(i5, i2, s9c.c, x(s9c.d), (xga) null));
                }
            }
            arrayList.add(new x9c(v9c.b, new w9c(arrayList4), false, false));
        }
        return arrayList;
    }

    public static jj7 g(zy zyVar, zpc zpc) {
        return h(zyVar, zpc, 0, 0, (qf3) null);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, p10] */
    public static jj7 h(zy zyVar, zpc zpc, long j, long j2, qf3 qf3) {
        int i;
        hu0 hu0;
        int i2;
        int i3;
        long j3;
        qf3 qf32 = qf3;
        ? obj = new Object();
        if (zyVar == null) {
            return obj.c();
        }
        Iterator it = zyVar.iterator();
        while (it.hasNext()) {
            fy fyVar = (fy) it.next();
            int ordinal = fyVar.a.ordinal();
            if (ordinal == 12) {
                ww6 ww6 = (ww6) fyVar;
                int i4 = vw6.c;
                uw6 uw6 = new uw6();
                ArrayList arrayList = new ArrayList();
                for (List<zt0> it2 : (List) ww6.o.a) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList.add(arrayList2);
                    for (zt0 zt0 : it2) {
                        String str = zt0.a.a;
                        hu0[] hu0Arr = hu0.y0;
                        int length = hu0Arr.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length) {
                                i = 1;
                                hu0 = hu0.UNKNOWN;
                                break;
                            }
                            hu0 hu02 = hu0Arr[i5];
                            if (hu02.a.equalsIgnoreCase(str)) {
                                hu0 = hu02;
                                i = 1;
                                break;
                            }
                            i5++;
                        }
                        int ordinal2 = zt0.c.ordinal();
                        vt0 vt0 = new vt0(zt0.b, hu0, ordinal2 != 0 ? ordinal2 != i ? ordinal2 != 2 ? 4 : 3 : 2 : i);
                        vt0.d = zt0.o;
                        vt0.e = zt0.X;
                        vt0.f = zt0.Y;
                        vt0.h = zt0.Z;
                        arrayList2.add(new yt0(vt0));
                    }
                }
                uw6.a = arrayList;
                uw6.b = ww6.X;
                obj.b = new vw6(uw6);
            } else if (ordinal != 14) {
                obj.a(e(fyVar, zpc, j, j2));
            } else {
                x9c x9c = (x9c) fyVar;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (List<t9c> it3 : x9c.X.a) {
                    u9c u9c = new u9c();
                    arrayList3.add(u9c);
                    for (t9c t9c : it3) {
                        String f = m4b.f(t9c.a);
                        int[] w = hr1.w(5);
                        int length2 = w.length;
                        int i6 = 0;
                        while (true) {
                            if (i6 >= length2) {
                                i2 = 1;
                                i3 = 0;
                                break;
                            }
                            i3 = w[i6];
                            if (m4b.e(i3).equals(f)) {
                                i2 = 1;
                                break;
                            }
                            i6++;
                        }
                        int i7 = i3 == 0 ? 5 : i3;
                        int t = hr1.t(t9c.b);
                        int i8 = t != 0 ? t != i2 ? t != 2 ? 4 : 3 : 2 : 1;
                        a10 a10 = null;
                        fpa fpa = t9c.o;
                        if (fpa != null) {
                            a10 = w(fpa, (zpc) null).b;
                        }
                        a10 a102 = a10;
                        xga xga = t9c.X;
                        if (xga != null) {
                            arrayList4.add(xga);
                            j3 = xga.a;
                        } else {
                            j3 = -1;
                        }
                        u9c.add(new s9c(i7, i8, t9c.c, a102, j3));
                    }
                }
                if (qf32 != null) {
                    qf32.accept(arrayList4);
                }
                obj.c = new v9c(arrayList3, x9c.o);
            }
        }
        return obj.c();
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [e62, java.lang.Object] */
    public static f62 i(tn2 tn2, f62 f62) {
        f62 f622 = f62.h;
        ? obj = new Object();
        obj.a = tn2.b;
        Long l = tn2.c;
        if (l != null) {
            obj.e = l.longValue();
        }
        ArrayList arrayList = new ArrayList();
        List<mj2> list = tn2.a;
        if (list != null) {
            for (mj2 ordinal : list) {
                int ordinal2 = ordinal.ordinal();
                if (ordinal2 == 0) {
                    arrayList.add(c62.a);
                } else if (ordinal2 == 1) {
                    arrayList.add(c62.b);
                } else if (ordinal2 == 2) {
                    arrayList.add(c62.c);
                }
            }
        }
        if (obj.b == null) {
            obj.b = new ArrayList();
        }
        obj.b.addAll(arrayList);
        obj.c = f62.c;
        obj.d = f62.d;
        obj.f = f62.f;
        obj.g = f62.g;
        return obj.b();
    }

    public static ArrayList j(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            km3 km3 = (km3) it.next();
            String str = km3.a;
            int ordinal = km3.b.ordinal();
            arrayList.add(new ii3(str, ordinal != 0 ? ordinal != 2 ? ordinal != 3 ? null : hi3.o : hi3.c : hi3.a, km3.c));
        }
        return arrayList;
    }

    public static ArrayList k(List list) {
        ArrayList arrayList = new ArrayList();
        if (ek8.J(list)) {
            return arrayList;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e2c e2c = (e2c) it.next();
            if (e2c.b == d2c.EMOJI) {
                String str = e2c.c;
                if (r1g.q(str)) {
                    arrayList.add(new vu4(str));
                }
            }
            if (e2c.b == d2c.ANIMOJI) {
                long j = e2c.a;
                if (j != 0) {
                    arrayList.add(new oi(j));
                }
            }
        }
        return arrayList;
    }

    public static l2b l(m2b m2b) {
        if (m2b == null) {
            return l2b.c;
        }
        int t = hr1.t(m2b.a);
        return new l2b(t != 1 ? t != 2 ? t != 3 ? t != 4 ? 0 : 40 : 30 : 20 : 10, m2b.b);
    }

    public static m2b m(l2b l2b) {
        int i = l2b.a;
        return new m2b(i != 10 ? i != 20 ? i != 30 ? i != 40 ? 1 : 5 : 4 : 3 : 2, l2b.b);
    }

    public static HashMap n(Map map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            hashMap.put((Long) entry.getKey(), l((m2b) entry.getValue()));
        }
        return hashMap;
    }

    public static ArrayList o(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c62 c62 = (c62) it.next();
            if (c62 == c62.a) {
                arrayList.add(mj2.SOUND);
            } else if (c62 == c62.b) {
                arrayList.add(mj2.VIBRATION);
            } else if (c62 == c62.c) {
                arrayList.add(mj2.LED);
            }
        }
        return arrayList;
    }

    public static ArrayList p(List list, zpc zpc) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g2c g2c = (g2c) it.next();
            int t = hr1.t(g2c.a);
            long j = g2c.b;
            if (t == 1) {
                arrayList.add(new utd(g2c.c, j));
            } else if (t != 2) {
                Locale locale = Locale.ENGLISH;
                udd.s("fu7", "Unknown RecentItem " + g2c, (Throwable) null);
            } else {
                arrayList.add(new c96(w(g2c.d, zpc).b, j));
            }
        }
        return arrayList;
    }

    public static ls8 q(ms8 ms8) {
        int ordinal;
        ls8 ls8 = ls8.ACTIVE;
        return (ms8 == null || (ordinal = ms8.ordinal()) == 0) ? ls8 : ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ls8 : ls8.DELAYED_FIRE_ERROR : ls8.DELETED : ls8.EDITED;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [h10, java.lang.Object] */
    public static osd r(psd psd) {
        ? obj = new Object();
        obj.a = psd.a;
        obj.b = psd.b;
        obj.c = psd.c;
        obj.d = psd.d;
        obj.e = psd.e;
        obj.f = psd.f;
        obj.g = psd.g;
        obj.h = psd.h;
        obj.i = psd.i;
        int t = hr1.t(psd.j);
        int i = 3;
        obj.j = t != 1 ? t != 2 ? t != 3 ? 1 : 4 : 3 : 2;
        obj.k = psd.k;
        obj.l = psd.l;
        obj.m = psd.m;
        int t2 = hr1.t(psd.n);
        if (t2 == 1) {
            i = 2;
        } else if (t2 != 2) {
            i = 1;
        }
        obj.n = i;
        obj.o = psd.o;
        return obj.b();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [h10, java.lang.Object] */
    public static i10 s(osd osd) {
        ? obj = new Object();
        obj.a = osd.a;
        obj.d = osd.o;
        obj.b = osd.b;
        obj.c = osd.c;
        obj.f = osd.Y;
        obj.g = osd.Z;
        obj.i = osd.x0;
        obj.h = osd.w0;
        obj.e = osd.X;
        int t = hr1.t(osd.y0);
        int i = 3;
        obj.j = t != 1 ? t != 2 ? t != 3 ? 1 : 4 : 3 : 2;
        obj.k = osd.z0;
        obj.l = osd.A0;
        obj.m = osd.B0;
        int t2 = hr1.t(osd.C0);
        if (t2 == 1) {
            i = 2;
        } else if (t2 != 2) {
            i = 1;
        }
        obj.n = i;
        obj.o = osd.D0;
        return obj.a();
    }

    public static uj3 t(tf3 tf3) {
        ln3 ln3;
        int i;
        ln3 ln32;
        long n = tf3.n();
        oi3 oi3 = tf3.a;
        ni3 ni3 = oi3.c;
        long j = ni3.g;
        String str = ni3.c;
        String str2 = ni3.d;
        ArrayList arrayList = new ArrayList();
        for (ii3 ii3 : ni3.f) {
            String str3 = ii3.a;
            int ordinal = ii3.c.ordinal();
            jm3 jm3 = jm3.c;
            jm3 jm32 = ordinal != 0 ? ordinal != 2 ? ordinal != 3 ? null : jm3 : jm3.b : jm3.a;
            if (jm32 != null) {
                jm3 = jm32;
            }
            arrayList.add(new km3(str3, jm3, ii3.b));
        }
        ni3 ni32 = oi3.c;
        long j2 = ni32.e;
        li3 li3 = oi3.c.i;
        if (li3 == null) {
            ln3 = null;
        } else {
            int ordinal2 = li3.ordinal();
            if (ordinal2 == 0) {
                ln32 = ln3.BLOCKED;
            } else if (ordinal2 == 1) {
                ln32 = ln3.REMOVED;
            } else {
                throw new IllegalArgumentException("No such value for " + li3 + " in ContactStatus");
            }
            ln3 = ln32;
        }
        int i2 = oi3.c.l;
        int t = hr1.t(i2);
        if (t == 0) {
            i = 1;
        } else if (t == 1) {
            i = 2;
        } else if (t == 2) {
            i = 3;
        } else {
            StringBuilder sb = new StringBuilder("No such value for ");
            sb.append(i2 != 1 ? i2 != 2 ? i2 != 3 ? "null" : "FEMALE" : "MALE" : "UNKNOWN");
            sb.append(" in ContactInfo.Gender");
            throw new IllegalArgumentException(sb.toString());
        }
        List<ki3> list = ni32.n;
        ArrayList arrayList2 = new ArrayList();
        for (ki3 ordinal3 : list) {
            int ordinal4 = ordinal3.ordinal();
            if (ordinal4 == 0) {
                arrayList2.add(tj3.OFFICIAL);
            } else if (ordinal4 == 1) {
                arrayList2.add(tj3.BOT);
            } else if (ordinal4 == 2) {
                arrayList2.add(tj3.SERVICE_ACCOUNT);
            } else if (ordinal4 == 3) {
                arrayList2.add(tj3.HAS_WEBAPP);
            }
        }
        String str4 = ni32.o;
        ji3 ji3 = ni32.u;
        return new uj3(n, j, str, str2, arrayList, j2, ni32.h, ln3, i, arrayList2, str4, ni32.p, ni32.q, ji3 == null ? null : new s77(ji3.a), ni32.v);
    }

    public static ArrayList u(List list) {
        ep8 ep8;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dp8 dp8 = (dp8) it.next();
            if (dp8 != null) {
                switch (dp8.c.ordinal()) {
                    case 1:
                        ep8 = ep8.a;
                        break;
                    case 2:
                        ep8 = ep8.b;
                        break;
                    case 3:
                        ep8 = ep8.c;
                        break;
                    case 4:
                        ep8 = ep8.o;
                        break;
                    case 5:
                        ep8 = ep8.X;
                        break;
                    case 6:
                        ep8 = ep8.Y;
                        break;
                    case 7:
                        ep8 = ep8.Z;
                        break;
                    case 8:
                        ep8 = ep8.x0;
                        break;
                    case 9:
                        ep8 = ep8.y0;
                        break;
                    case 10:
                        ep8 = ep8.w0;
                        break;
                    case 11:
                        ep8 = ep8.z0;
                        break;
                }
                ep8 ep82 = ep8;
                Map map = dp8.Y;
                arrayList.add(new fp8(dp8.a, dp8.b, ep82, dp8.o, dp8.X, map == null ? null : new HashMap(map)));
            }
        }
        return arrayList;
    }

    public static ArrayList v(List list) {
        hp8 hp8;
        HashMap hashMap;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fp8 fp8 = (fp8) it.next();
            switch (fp8.c.ordinal()) {
                case 0:
                    hp8 = hp8.b;
                    break;
                case 1:
                    hp8 = hp8.c;
                    break;
                case 2:
                    hp8 = hp8.o;
                    break;
                case 3:
                    hp8 = hp8.X;
                    break;
                case 4:
                    hp8 = hp8.Y;
                    break;
                case 5:
                    hp8 = hp8.Z;
                    break;
                case 6:
                    hp8 = hp8.w0;
                    break;
                case 7:
                    hp8 = hp8.z0;
                    break;
                case 8:
                    hp8 = hp8.x0;
                    break;
                case 9:
                    hp8 = hp8.y0;
                    break;
                case 10:
                    hp8 = hp8.A0;
                    break;
            }
            hp8 hp82 = hp8;
            short s = (short) fp8.d;
            short s2 = (short) fp8.e;
            Map map = fp8.f;
            if (map == null || map.size() == 0) {
                hashMap = Collections.emptyMap();
            } else {
                HashMap hashMap2 = new HashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (entry.getValue() instanceof Serializable) {
                        hashMap2.put((String) entry.getKey(), (Serializable) entry.getValue());
                    } else {
                        throw new IllegalStateException("attribute must be Serializable");
                    }
                }
                hashMap = hashMap2;
            }
            arrayList.add(new dp8(fp8.a, fp8.b, hp82, s, s2, hashMap));
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, z00] */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, m00] */
    public static o10 w(fpa fpa, zpc zpc) {
        a10 a10 = a10.A0;
        ? obj = new Object();
        String str = fpa.o;
        if (str != null) {
            obj.a = str;
        }
        String str2 = fpa.X;
        if (str2 != null) {
            obj.b = str2;
        }
        Integer num = fpa.Y;
        if (num != null) {
            obj.c = num.intValue();
        }
        Integer num2 = fpa.Z;
        if (num2 != null) {
            obj.d = num2.intValue();
        }
        obj.e = fpa.w0;
        byte[] bArr = fpa.x0;
        if (bArr != null && bArr.length > 0) {
            try {
                zpc.getClass();
                obj.f = bArr;
            } catch (Throwable unused) {
                obj.f = bArr;
            }
        }
        Long l = fpa.A0;
        if (l != null) {
            obj.h = l.longValue();
        }
        String str3 = fpa.z0;
        if (str3 != null) {
            obj.i = str3;
        }
        String str4 = fpa.y0;
        if (str4 != null) {
            obj.g = str4;
        }
        obj.k = fpa.B0;
        a10 a2 = obj.a();
        int i = o10.z;
        ? obj2 = new Object();
        obj2.l = UUID.randomUUID().toString();
        obj2.a = j10.c;
        obj2.n = fpa.b;
        obj2.y = fpa.c;
        obj2.b = a2;
        return obj2.a();
    }

    public static fpa x(a10 a10) {
        if (a10 == null) {
            return null;
        }
        String str = !r1g.p(a10.a) ? a10.a : null;
        String str2 = a10.b;
        String str3 = !r1g.p(str2) ? str2 : null;
        int i = a10.c;
        Integer valueOf = i > 0 ? Integer.valueOf(i) : null;
        int i2 = a10.o;
        Integer valueOf2 = i2 > 0 ? Integer.valueOf(i2) : null;
        byte[] bArr = a10.Y;
        byte[] bArr2 = (bArr == null || bArr.length <= 0) ? null : bArr;
        String str4 = a10.x0;
        String str5 = !r1g.p(str4) ? str4 : null;
        String str6 = a10.Z;
        String str7 = !r1g.p(str6) ? str6 : null;
        String str8 = a10.z0;
        return new fpa(str, str3, valueOf, valueOf2, a10.X, bArr2, Long.valueOf(a10.w0), str5, str7, false, false, !r1g.p(str8) ? str8 : null);
    }
}
