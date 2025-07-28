package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.text.Layout;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.exoplayer2.ExoPlaybackException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;

/* renamed from: kv2  reason: default package */
public final class kv2 implements s52, u1e {
    public static final byte[] w0 = {0, 7, 8, 15};
    public static final byte[] x0 = {0, 119, -120, -1};
    public static final byte[] y0 = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public Object X;
    public Object Y;
    public Object Z;
    public Object a;
    public Object b;
    public Object c;
    public Object o;

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Comparable a(defpackage.kv2 r4, long r5, kotlin.coroutines.Continuation r7) {
        /*
            r4.getClass()
            boolean r0 = r7 instanceof defpackage.fv2
            if (r0 == 0) goto L_0x0016
            r0 = r7
            fv2 r0 = (defpackage.fv2) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.w0 = r1
            goto L_0x001b
        L_0x0016:
            fv2 r0 = new fv2
            r0.<init>(r4, r7)
        L_0x001b:
            java.lang.Object r7 = r0.Y
            pu3 r1 = pu3.a
            int r2 = r0.w0
            r3 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            long r5 = r0.X
            kv2 r4 = r0.o
            wx3.H(r7)     // Catch:{ ChatNotFoundException -> 0x002e }
            goto L_0x0056
        L_0x002e:
            r7 = move-exception
            goto L_0x005a
        L_0x0030:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0038:
            wx3.H(r7)
            java.lang.Object r7 = r4.c     // Catch:{ ChatNotFoundException -> 0x002e }
            t97 r7 = (t97) r7     // Catch:{ ChatNotFoundException -> 0x002e }
            java.lang.Object r7 = r7.getValue()     // Catch:{ ChatNotFoundException -> 0x002e }
            t52 r7 = (defpackage.t52) r7     // Catch:{ ChatNotFoundException -> 0x002e }
            dhd r7 = r7.x(r5)     // Catch:{ ChatNotFoundException -> 0x002e }
            r0.o = r4     // Catch:{ ChatNotFoundException -> 0x002e }
            r0.X = r5     // Catch:{ ChatNotFoundException -> 0x002e }
            r0.w0 = r3     // Catch:{ ChatNotFoundException -> 0x002e }
            java.lang.Object r7 = e07.d(r7, r0)     // Catch:{ ChatNotFoundException -> 0x002e }
            if (r7 != r1) goto L_0x0056
            goto L_0x0071
        L_0x0056:
            i22 r7 = (defpackage.i22) r7     // Catch:{ ChatNotFoundException -> 0x002e }
            r1 = r7
            goto L_0x0071
        L_0x005a:
            java.lang.Object r4 = r4.a
            java.lang.String r4 = (java.lang.String) r4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "failed to fetch chat for chatId="
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            udd.s(r4, r5, r7)
            r4 = 0
            r1 = r4
        L_0x0071:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kv2.a(kv2, long, kotlin.coroutines.Continuation):java.lang.Comparable");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Comparable d(defpackage.kv2 r7, long r8, kotlin.coroutines.Continuation r10) {
        /*
            r7.getClass()
            boolean r0 = r10 instanceof defpackage.gv2
            if (r0 == 0) goto L_0x0016
            r0 = r10
            gv2 r0 = (defpackage.gv2) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.w0 = r1
            goto L_0x001b
        L_0x0016:
            gv2 r0 = new gv2
            r0.<init>(r7, r10)
        L_0x001b:
            java.lang.Object r10 = r0.Y
            pu3 r1 = pu3.a
            int r2 = r0.w0
            r3 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            long r8 = r0.X
            kv2 r7 = r0.o
            wx3.H(r10)     // Catch:{ ChatNotFoundException -> 0x002e }
            goto L_0x006d
        L_0x002e:
            r10 = move-exception
            goto L_0x0071
        L_0x0030:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0038:
            wx3.H(r10)
            java.lang.Object r10 = r7.c     // Catch:{ ChatNotFoundException -> 0x002e }
            t97 r10 = (t97) r10     // Catch:{ ChatNotFoundException -> 0x002e }
            java.lang.Object r10 = r10.getValue()     // Catch:{ ChatNotFoundException -> 0x002e }
            t52 r10 = (defpackage.t52) r10     // Catch:{ ChatNotFoundException -> 0x002e }
            v63 r2 = r10.f()     // Catch:{ ChatNotFoundException -> 0x002e }
            f52 r4 = new f52     // Catch:{ ChatNotFoundException -> 0x002e }
            r5 = 1
            r4.<init>(r10, r8, r5)     // Catch:{ ChatNotFoundException -> 0x002e }
            mv9 r5 = new mv9     // Catch:{ ChatNotFoundException -> 0x002e }
            r6 = 2
            r5.<init>(r6, r4)     // Catch:{ ChatNotFoundException -> 0x002e }
            o73 r4 = new o73     // Catch:{ ChatNotFoundException -> 0x002e }
            r4.<init>(r5, r2)     // Catch:{ ChatNotFoundException -> 0x002e }
            qmc r10 = r10.y     // Catch:{ ChatNotFoundException -> 0x002e }
            yhd r10 = r4.m(r10)     // Catch:{ ChatNotFoundException -> 0x002e }
            r0.o = r7     // Catch:{ ChatNotFoundException -> 0x002e }
            r0.X = r8     // Catch:{ ChatNotFoundException -> 0x002e }
            r0.w0 = r3     // Catch:{ ChatNotFoundException -> 0x002e }
            java.lang.Object r10 = e07.d(r10, r0)     // Catch:{ ChatNotFoundException -> 0x002e }
            if (r10 != r1) goto L_0x006d
            goto L_0x0088
        L_0x006d:
            i22 r10 = (defpackage.i22) r10     // Catch:{ ChatNotFoundException -> 0x002e }
            r1 = r10
            goto L_0x0088
        L_0x0071:
            java.lang.Object r7 = r7.a
            java.lang.String r7 = (java.lang.String) r7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "failed to fetch chat for serverId="
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            udd.s(r7, r8, r10)
            r7 = 0
            r1 = r7
        L_0x0088:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kv2.d(kv2, long, kotlin.coroutines.Continuation):java.lang.Comparable");
    }

    public static boolean e(ooe ooe, vu5 vu5) {
        return r1g.c(vu5.a, ooe.a) && r1g.c(vu5.b, ooe.b) && r1g.c(vu5.c, ooe.c) && vu5.F0 == ooe.o && vu5.G0 == ooe.X && vu5.w0 == ooe.Y;
    }

    public static byte[] f(int i, int i2, wx1 wx1) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) wx1.i(i2);
        }
        return bArr;
    }

    public static int[] g() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            if (i < 8) {
                iArr[i] = i(255, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                int i2 = 127;
                int i3 = (i & 1) != 0 ? 127 : 0;
                int i4 = (i & 2) != 0 ? 127 : 0;
                if ((i & 4) == 0) {
                    i2 = 0;
                }
                iArr[i] = i(255, i3, i4, i2);
            }
        }
        return iArr;
    }

    public static int[] h() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            int i2 = 255;
            if (i < 8) {
                int i3 = (i & 1) != 0 ? 255 : 0;
                int i4 = (i & 2) != 0 ? 255 : 0;
                if ((i & 4) == 0) {
                    i2 = 0;
                }
                iArr[i] = i(63, i3, i4, i2);
            } else {
                int i5 = i & 136;
                int i6 = 170;
                int i7 = 85;
                if (i5 == 0) {
                    int i8 = ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0);
                    int i9 = ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0);
                    if ((i & 4) == 0) {
                        i7 = 0;
                    }
                    if ((i & 64) == 0) {
                        i6 = 0;
                    }
                    iArr[i] = i(255, i8, i9, i7 + i6);
                } else if (i5 != 8) {
                    int i10 = 43;
                    if (i5 == 128) {
                        int i11 = ((i & 1) != 0 ? 43 : 0) + 127 + ((i & 16) != 0 ? 85 : 0);
                        int i12 = ((i & 2) != 0 ? 43 : 0) + 127 + ((i & 32) != 0 ? 85 : 0);
                        if ((i & 4) == 0) {
                            i10 = 0;
                        }
                        int i13 = i10 + 127;
                        if ((i & 64) == 0) {
                            i7 = 0;
                        }
                        iArr[i] = i(255, i11, i12, i13 + i7);
                    } else if (i5 == 136) {
                        int i14 = ((i & 1) != 0 ? 43 : 0) + ((i & 16) != 0 ? 85 : 0);
                        int i15 = ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0);
                        if ((i & 4) == 0) {
                            i10 = 0;
                        }
                        if ((i & 64) == 0) {
                            i7 = 0;
                        }
                        iArr[i] = i(255, i14, i15, i10 + i7);
                    }
                } else {
                    int i16 = ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0);
                    int i17 = ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0);
                    if ((i & 4) == 0) {
                        i7 = 0;
                    }
                    if ((i & 64) == 0) {
                        i6 = 0;
                    }
                    iArr[i] = i(127, i16, i17, i7 + i6);
                }
            }
        }
        return iArr;
    }

    public static int i(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r3v32, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r3v7, types: [byte] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01f8 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x022b A[LOOP:3: B:84:0x017a->B:113:0x022b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0226 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0189  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void n(byte[] r23, int[] r24, int r25, int r26, int r27, android.graphics.Paint r28, android.graphics.Canvas r29) {
        /*
            r0 = r23
            r1 = r25
            r8 = r28
            wx1 r9 = new wx1
            int r2 = r0.length
            r3 = 2
            r4 = 0
            r9.<init>(r0, r2, r3, r4)
            r2 = r26
            r10 = r27
            r11 = 0
            r12 = 0
            r13 = 0
        L_0x0015:
            int r3 = r9.b()
            if (r3 == 0) goto L_0x0236
            r14 = 8
            int r3 = r9.i(r14)
            r4 = 240(0xf0, float:3.36E-43)
            if (r3 == r4) goto L_0x0230
            r15 = 1
            r16 = 0
            r7 = 3
            r6 = 4
            r5 = 2
            switch(r3) {
                case 16: goto L_0x015f;
                case 17: goto L_0x00a0;
                case 18: goto L_0x0043;
                default: goto L_0x002e;
            }
        L_0x002e:
            switch(r3) {
                case 32: goto L_0x003e;
                case 33: goto L_0x0039;
                case 34: goto L_0x0032;
                default: goto L_0x0031;
            }
        L_0x0031:
            goto L_0x0015
        L_0x0032:
            r3 = 16
            byte[] r12 = f(r3, r14, r9)
            goto L_0x0015
        L_0x0039:
            byte[] r11 = f(r6, r14, r9)
            goto L_0x0015
        L_0x003e:
            byte[] r13 = f(r6, r6, r9)
            goto L_0x0015
        L_0x0043:
            r7 = r2
            r2 = r16
        L_0x0046:
            int r3 = r9.i(r14)
            if (r3 == 0) goto L_0x0051
            r17 = r2
            r18 = r15
            goto L_0x0079
        L_0x0051:
            boolean r3 = r9.h()
            r4 = 7
            if (r3 != 0) goto L_0x006c
            int r3 = r9.i(r4)
            if (r3 == 0) goto L_0x0065
            r17 = r2
            r18 = r3
            r3 = r16
            goto L_0x0079
        L_0x0065:
            r17 = r15
            r3 = r16
            r18 = r3
            goto L_0x0079
        L_0x006c:
            int r3 = r9.i(r4)
            int r4 = r9.i(r14)
            r17 = r2
            r18 = r3
            r3 = r4
        L_0x0079:
            if (r18 == 0) goto L_0x0094
            if (r8 == 0) goto L_0x0094
            r2 = r24[r3]
            r8.setColor(r2)
            float r3 = (float) r7
            float r4 = (float) r10
            int r2 = r7 + r18
            float r5 = (float) r2
            int r2 = r10 + 1
            float r6 = (float) r2
            r2 = r29
            r19 = r7
            r7 = r28
            r2.drawRect(r3, r4, r5, r6, r7)
            goto L_0x0096
        L_0x0094:
            r19 = r7
        L_0x0096:
            int r7 = r19 + r18
            if (r17 == 0) goto L_0x009d
        L_0x009a:
            r2 = r7
            goto L_0x0015
        L_0x009d:
            r2 = r17
            goto L_0x0046
        L_0x00a0:
            if (r1 != r7) goto L_0x00ab
            if (r12 != 0) goto L_0x00a7
            byte[] r3 = y0
            goto L_0x00a8
        L_0x00a7:
            r3 = r12
        L_0x00a8:
            r17 = r3
            goto L_0x00ad
        L_0x00ab:
            r17 = 0
        L_0x00ad:
            r4 = r2
            r2 = r16
        L_0x00b0:
            int r3 = r9.i(r6)
            if (r3 == 0) goto L_0x00bc
            r18 = r2
            r19 = r15
            goto L_0x011d
        L_0x00bc:
            boolean r3 = r9.h()
            if (r3 != 0) goto L_0x00d8
            int r3 = r9.i(r7)
            if (r3 == 0) goto L_0x00d1
            int r3 = r3 + 2
            r18 = r2
            r19 = r3
        L_0x00ce:
            r3 = r16
            goto L_0x011d
        L_0x00d1:
            r18 = r15
        L_0x00d3:
            r3 = r16
            r19 = r3
            goto L_0x011d
        L_0x00d8:
            boolean r3 = r9.h()
            if (r3 != 0) goto L_0x00ee
            int r3 = r9.i(r5)
            int r3 = r3 + r6
            int r18 = r9.i(r6)
        L_0x00e7:
            r19 = r3
            r3 = r18
            r18 = r2
            goto L_0x011d
        L_0x00ee:
            int r3 = r9.i(r5)
            if (r3 == 0) goto L_0x0118
            if (r3 == r15) goto L_0x0113
            if (r3 == r5) goto L_0x0108
            if (r3 == r7) goto L_0x00fd
            r18 = r2
            goto L_0x00d3
        L_0x00fd:
            int r3 = r9.i(r14)
            int r3 = r3 + 25
            int r18 = r9.i(r6)
            goto L_0x00e7
        L_0x0108:
            int r3 = r9.i(r6)
            int r3 = r3 + 9
            int r18 = r9.i(r6)
            goto L_0x00e7
        L_0x0113:
            r18 = r2
            r19 = r5
            goto L_0x00ce
        L_0x0118:
            r18 = r2
            r19 = r15
            goto L_0x00ce
        L_0x011d:
            if (r19 == 0) goto L_0x0148
            if (r8 == 0) goto L_0x0148
            if (r17 == 0) goto L_0x0125
            byte r3 = r17[r3]
        L_0x0125:
            r2 = r24[r3]
            r8.setColor(r2)
            float r3 = (float) r4
            float r2 = (float) r10
            int r0 = r4 + r19
            float r0 = (float) r0
            int r5 = r10 + 1
            float r5 = (float) r5
            r20 = r2
            r2 = r29
            r21 = r4
            r4 = r20
            r22 = r5
            r14 = 2
            r5 = r0
            r0 = r6
            r6 = r22
            r0 = r7
            r7 = r28
            r2.drawRect(r3, r4, r5, r6, r7)
            goto L_0x014c
        L_0x0148:
            r21 = r4
            r14 = r5
            r0 = r7
        L_0x014c:
            int r4 = r21 + r19
            if (r18 == 0) goto L_0x0156
            r9.c()
            r2 = r4
            goto L_0x0015
        L_0x0156:
            r7 = r0
            r5 = r14
            r2 = r18
            r6 = 4
            r14 = 8
            goto L_0x00b0
        L_0x015f:
            r14 = r5
            r0 = r7
            if (r1 != r0) goto L_0x016c
            if (r11 != 0) goto L_0x0168
            byte[] r3 = x0
            goto L_0x0169
        L_0x0168:
            r3 = r11
        L_0x0169:
            r17 = r3
            goto L_0x0177
        L_0x016c:
            if (r1 != r14) goto L_0x0175
            if (r13 != 0) goto L_0x0173
            byte[] r3 = w0
            goto L_0x0169
        L_0x0173:
            r3 = r13
            goto L_0x0169
        L_0x0175:
            r17 = 0
        L_0x0177:
            r7 = r2
            r2 = r16
        L_0x017a:
            int r3 = r9.i(r14)
            if (r3 == 0) goto L_0x0189
            r18 = r2
            r19 = r15
        L_0x0184:
            r5 = 4
            r6 = 8
            goto L_0x01f6
        L_0x0189:
            boolean r3 = r9.h()
            if (r3 == 0) goto L_0x019e
            int r3 = r9.i(r0)
            int r5 = r3 + 3
            int r3 = r9.i(r14)
            r18 = r2
            r19 = r5
            goto L_0x0184
        L_0x019e:
            boolean r3 = r9.h()
            if (r3 == 0) goto L_0x01ab
            r18 = r2
            r19 = r15
            r3 = r16
            goto L_0x0184
        L_0x01ab:
            int r3 = r9.i(r14)
            if (r3 == 0) goto L_0x01ed
            if (r3 == r15) goto L_0x01e3
            if (r3 == r14) goto L_0x01d0
            if (r3 == r0) goto L_0x01be
            r18 = r2
            r3 = r16
            r19 = r3
            goto L_0x0184
        L_0x01be:
            r6 = 8
            int r3 = r9.i(r6)
            int r5 = r3 + 29
            int r3 = r9.i(r14)
            r18 = r2
            r19 = r5
            r5 = 4
            goto L_0x01f6
        L_0x01d0:
            r5 = 4
            r6 = 8
            int r3 = r9.i(r5)
            int r3 = r3 + 12
            int r4 = r9.i(r14)
            r18 = r2
            r19 = r3
            r3 = r4
            goto L_0x01f6
        L_0x01e3:
            r5 = 4
            r6 = 8
            r18 = r2
            r19 = r14
            r3 = r16
            goto L_0x01f6
        L_0x01ed:
            r5 = 4
            r6 = 8
            r18 = r15
            r3 = r16
            r19 = r3
        L_0x01f6:
            if (r19 == 0) goto L_0x021d
            if (r8 == 0) goto L_0x021d
            if (r17 == 0) goto L_0x01fe
            byte r3 = r17[r3]
        L_0x01fe:
            r2 = r24[r3]
            r8.setColor(r2)
            float r3 = (float) r7
            float r4 = (float) r10
            int r2 = r7 + r19
            float r2 = (float) r2
            int r0 = r10 + 1
            float r0 = (float) r0
            r21 = r2
            r2 = r29
            r22 = r5
            r5 = r21
            r21 = r6
            r6 = r0
            r0 = r7
            r7 = r28
            r2.drawRect(r3, r4, r5, r6, r7)
            goto L_0x0222
        L_0x021d:
            r22 = r5
            r21 = r6
            r0 = r7
        L_0x0222:
            int r7 = r0 + r19
            if (r18 == 0) goto L_0x022b
            r9.c()
            goto L_0x009a
        L_0x022b:
            r2 = r18
            r0 = 3
            goto L_0x017a
        L_0x0230:
            int r10 = r10 + 2
            r2 = r26
            goto L_0x0015
        L_0x0236:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kv2.n(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static hq4 o(wx1 wx1, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        wx1 wx12 = wx1;
        int i7 = 8;
        int i8 = wx12.i(8);
        wx12.t(8);
        int i9 = 2;
        int i10 = i - 2;
        int i11 = 0;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] g = g();
        int[] h = h();
        while (i10 > 0) {
            int i12 = wx12.i(i7);
            int i13 = wx12.i(i7);
            int[] iArr2 = (i13 & 128) != 0 ? iArr : (i13 & 64) != 0 ? g : h;
            if ((i13 & 1) != 0) {
                i5 = wx12.i(i7);
                i4 = wx12.i(i7);
                i3 = wx12.i(i7);
                i2 = wx12.i(i7);
                i6 = i10 - 6;
            } else {
                i3 = wx12.i(4) << 4;
                i6 = i10 - 4;
                int i14 = wx12.i(4) << 4;
                i2 = wx12.i(i9) << 6;
                i5 = wx12.i(6) << i9;
                i4 = i14;
            }
            if (i5 == 0) {
                i4 = i11;
                i3 = i4;
                i2 = 255;
            }
            double d = (double) i5;
            double d2 = (double) (i4 - 128);
            double d3 = (double) (i3 - 128);
            iArr2[i12] = i((byte) (255 - (i2 & 255)), oze.j((int) ((1.402d * d2) + d), 0, 255), oze.j((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255), oze.j((int) ((d3 * 1.772d) + d), 0, 255));
            i10 = i6;
            i11 = 0;
            i8 = i8;
            h = h;
            i7 = 8;
            i9 = 2;
        }
        return new hq4(i8, iArr, g, h);
    }

    public static kq4 p(wx1 wx1) {
        byte[] bArr;
        int i = wx1.i(16);
        wx1.t(4);
        int i2 = wx1.i(2);
        boolean h = wx1.h();
        wx1.t(1);
        byte[] bArr2 = oze.f;
        if (i2 == 1) {
            wx1.t(wx1.i(8) * 16);
        } else if (i2 == 0) {
            int i3 = wx1.i(16);
            int i4 = wx1.i(16);
            if (i3 > 0) {
                bArr2 = new byte[i3];
                wx1.l(i3, bArr2);
            }
            if (i4 > 0) {
                bArr = new byte[i4];
                wx1.l(i4, bArr);
                return new kq4(i, h, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new kq4(i, h, bArr2, bArr);
    }

    public void Q(byte[] bArr, int i, int i2, t1e t1e, nf3 nf3) {
        sq4 sq4;
        xw3 xw3;
        char c2;
        char c3;
        int i3;
        int i4;
        iq4 iq4;
        ArrayList arrayList;
        int i5;
        sq4 sq42;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        pq4 pq4;
        pq4 pq42;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = i;
        int i16 = 8;
        int i17 = 0;
        wx1 wx1 = new wx1(bArr, i15 + i2, 2, (byte) 0);
        wx1.q(i15);
        while (true) {
            int b2 = wx1.b();
            sq4 = (sq4) this.Y;
            if (b2 < 48 || wx1.i(i16) != 15) {
                lq4 lq4 = (lq4) sq4.i;
            } else {
                int i18 = wx1.i(i16);
                int i19 = 16;
                int i20 = wx1.i(16);
                int i21 = wx1.i(16);
                int f = wx1.f() + i21;
                if (i21 * 8 > wx1.b()) {
                    ez3.j0("Data field length exceeds limit");
                    wx1.t(wx1.b());
                } else {
                    switch (i18) {
                        case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK /*16*/:
                            if (i20 == sq4.a) {
                                lq4 lq42 = (lq4) sq4.i;
                                wx1.i(i16);
                                int i22 = wx1.i(4);
                                int i23 = wx1.i(2);
                                wx1.t(2);
                                int i24 = i21 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i24 > 0) {
                                    int i25 = wx1.i(i16);
                                    wx1.t(i16);
                                    i24 -= 6;
                                    sparseArray.put(i25, new nq4(wx1.i(16), wx1.i(16)));
                                    i16 = 8;
                                }
                                lq4 lq43 = new lq4(i22, i23, sparseArray);
                                if (i23 == 0) {
                                    if (!(lq42 == null || lq42.a == i22)) {
                                        sq4.i = lq43;
                                        break;
                                    }
                                } else {
                                    sq4.i = lq43;
                                    sq4.c.clear();
                                    sq4.d.clear();
                                    sq4.e.clear();
                                    break;
                                }
                            }
                            break;
                        case LangUtils.HASH_SEED /*17*/:
                            lq4 lq44 = (lq4) sq4.i;
                            if (i20 == sq4.a && lq44 != null) {
                                int i26 = wx1.i(i16);
                                wx1.t(4);
                                boolean h = wx1.h();
                                wx1.t(3);
                                int i27 = wx1.i(16);
                                int i28 = wx1.i(16);
                                wx1.i(3);
                                int i29 = wx1.i(3);
                                wx1.t(2);
                                int i30 = wx1.i(i16);
                                int i31 = wx1.i(i16);
                                int i32 = wx1.i(4);
                                int i33 = wx1.i(2);
                                wx1.t(2);
                                int i34 = i21 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i34 > 0) {
                                    int i35 = wx1.i(i19);
                                    int i36 = wx1.i(2);
                                    wx1.i(2);
                                    int i37 = wx1.i(12);
                                    wx1.t(4);
                                    int i38 = wx1.i(12);
                                    int i39 = i34 - 6;
                                    if (i36 == 1 || i36 == 2) {
                                        wx1.i(i16);
                                        wx1.i(i16);
                                        i34 -= 8;
                                    } else {
                                        i34 = i39;
                                    }
                                    sparseArray2.put(i35, new rq4(i37, i38));
                                    i19 = 16;
                                }
                                pq4 pq43 = new pq4(i26, h, i27, i28, i29, i30, i31, i32, i33, sparseArray2);
                                SparseArray sparseArray3 = sq4.c;
                                if (lq44.b == 0 && (pq42 = (pq4) sparseArray3.get(i26)) != null) {
                                    int i40 = 0;
                                    while (true) {
                                        SparseArray sparseArray4 = pq42.j;
                                        if (i40 < sparseArray4.size()) {
                                            pq43.j.put(sparseArray4.keyAt(i40), (rq4) sparseArray4.valueAt(i40));
                                            i40++;
                                        }
                                    }
                                }
                                sparseArray3.put(pq43.a, pq43);
                                break;
                            }
                        case 18:
                            if (i20 != sq4.a) {
                                if (i20 == sq4.b) {
                                    hq4 o2 = o(wx1, i21);
                                    sq4.f.put(o2.a, o2);
                                    break;
                                }
                            } else {
                                hq4 o3 = o(wx1, i21);
                                sq4.d.put(o3.a, o3);
                                break;
                            }
                            break;
                        case 19:
                            if (i20 != sq4.a) {
                                if (i20 == sq4.b) {
                                    kq4 p = p(wx1);
                                    sq4.g.put(p.a, p);
                                    break;
                                }
                            } else {
                                kq4 p2 = p(wx1);
                                sq4.e.put(p2.a, p2);
                                break;
                            }
                            break;
                        case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /*20*/:
                            if (i20 == sq4.a) {
                                wx1.t(4);
                                boolean h2 = wx1.h();
                                wx1.t(3);
                                int i41 = wx1.i(16);
                                int i42 = wx1.i(16);
                                if (h2) {
                                    int i43 = wx1.i(16);
                                    int i44 = wx1.i(16);
                                    int i45 = wx1.i(16);
                                    i14 = i43;
                                    i11 = wx1.i(16);
                                    i13 = i44;
                                    i12 = i45;
                                } else {
                                    i14 = i17;
                                    i12 = i14;
                                    i13 = i41;
                                    i11 = i42;
                                }
                                sq4.h = new iq4(i41, i42, i14, i13, i12, i11);
                                break;
                            }
                            break;
                    }
                    wx1.u(f - wx1.f());
                }
                i16 = 8;
                i17 = 0;
            }
        }
        lq4 lq45 = (lq4) sq4.i;
        if (lq45 == null) {
            po5 po5 = ws6.b;
            xw3 = new xw3(-9223372036854775807L, -9223372036854775807L, e8c.X);
        } else {
            iq4 iq42 = (iq4) sq4.h;
            if (iq42 == null) {
                iq42 = (iq4) this.o;
            }
            Bitmap bitmap = (Bitmap) this.Z;
            Canvas canvas = (Canvas) this.c;
            if (!(bitmap != null && iq42.a + 1 == bitmap.getWidth() && iq42.b + 1 == ((Bitmap) this.Z).getHeight())) {
                Bitmap createBitmap = Bitmap.createBitmap(iq42.a + 1, iq42.b + 1, Bitmap.Config.ARGB_8888);
                this.Z = createBitmap;
                canvas.setBitmap(createBitmap);
            }
            ArrayList arrayList2 = new ArrayList();
            int i46 = 0;
            while (true) {
                SparseArray sparseArray5 = lq45.c;
                if (i46 < sparseArray5.size()) {
                    canvas.save();
                    nq4 nq4 = (nq4) sparseArray5.valueAt(i46);
                    pq4 pq44 = (pq4) sq4.c.get(sparseArray5.keyAt(i46));
                    int i47 = nq4.a + iq42.c;
                    int i48 = nq4.b + iq42.e;
                    int min = Math.min(pq44.c + i47, iq42.d);
                    int i49 = pq44.d;
                    int i50 = i48 + i49;
                    canvas.clipRect(i47, i48, min, Math.min(i50, iq42.f));
                    SparseArray sparseArray6 = sq4.d;
                    int i51 = pq44.f;
                    hq4 hq4 = (hq4) sparseArray6.get(i51);
                    if (hq4 == null && (hq4 = (hq4) sq4.f.get(i51)) == null) {
                        hq4 = (hq4) this.X;
                    }
                    int i52 = 0;
                    while (true) {
                        SparseArray sparseArray7 = pq44.j;
                        if (i52 < sparseArray7.size()) {
                            int keyAt = sparseArray7.keyAt(i52);
                            rq4 rq4 = (rq4) sparseArray7.valueAt(i52);
                            lq4 lq46 = lq45;
                            kq4 kq4 = (kq4) sq4.e.get(keyAt);
                            if (kq4 == null) {
                                kq4 = (kq4) sq4.g.get(keyAt);
                            }
                            if (kq4 != null) {
                                Paint paint = kq4.b ? null : (Paint) this.a;
                                sq42 = sq4;
                                int i53 = rq4.a + i47;
                                int i54 = rq4.b + i48;
                                i5 = i46;
                                int i55 = pq44.e;
                                i6 = i52;
                                arrayList = arrayList2;
                                int i56 = i50;
                                int[] iArr = i55 == 3 ? hq4.d : i55 == 2 ? hq4.c : hq4.b;
                                iq4 = iq42;
                                int i57 = i49;
                                int i58 = i55;
                                i8 = i57;
                                int i59 = i48;
                                int i60 = i53;
                                i7 = i56;
                                i10 = i47;
                                i9 = i59;
                                pq4 = pq44;
                                Paint paint2 = paint;
                                Canvas canvas2 = canvas;
                                n(kq4.c, iArr, i58, i60, i54, paint2, canvas2);
                                n(kq4.d, iArr, i58, i60, i54 + 1, paint2, canvas2);
                            } else {
                                iq4 = iq42;
                                arrayList = arrayList2;
                                i5 = i46;
                                sq42 = sq4;
                                i6 = i52;
                                i7 = i50;
                                i8 = i49;
                                i9 = i48;
                                i10 = i47;
                                pq4 = pq44;
                            }
                            i52 = i6 + 1;
                            lq45 = lq46;
                            pq44 = pq4;
                            i47 = i10;
                            sq4 = sq42;
                            i46 = i5;
                            arrayList2 = arrayList;
                            iq42 = iq4;
                            i49 = i8;
                            i50 = i7;
                            i48 = i9;
                        } else {
                            lq4 lq47 = lq45;
                            iq4 iq43 = iq42;
                            ArrayList arrayList3 = arrayList2;
                            int i61 = i46;
                            sq4 sq43 = sq4;
                            int i62 = i50;
                            int i63 = i49;
                            int i64 = i48;
                            int i65 = i47;
                            pq4 pq45 = pq44;
                            boolean z = pq45.b;
                            int i66 = pq45.c;
                            if (z) {
                                int i67 = pq45.e;
                                c3 = 3;
                                if (i67 == 3) {
                                    i4 = hq4.d[pq45.g];
                                    c2 = 2;
                                } else {
                                    c2 = 2;
                                    i4 = i67 == 2 ? hq4.c[pq45.h] : hq4.b[pq45.i];
                                }
                                Paint paint3 = (Paint) this.b;
                                paint3.setColor(i4);
                                i3 = i64;
                                canvas.drawRect((float) i65, (float) i3, (float) (i65 + i66), (float) i62, paint3);
                            } else {
                                i3 = i64;
                                c3 = 3;
                                c2 = 2;
                            }
                            int i68 = i63;
                            Bitmap createBitmap2 = Bitmap.createBitmap((Bitmap) this.Z, i65, i3, i66, i68);
                            float f2 = (float) i65;
                            iq4 iq44 = iq43;
                            float f3 = (float) iq44.a;
                            float f4 = f2 / f3;
                            float f5 = (float) iq44.b;
                            ArrayList arrayList4 = arrayList3;
                            arrayList4.add(new uw3((CharSequence) null, (Layout.Alignment) null, (Layout.Alignment) null, createBitmap2, ((float) i3) / f5, 0, 0, f4, 0, Integer.MIN_VALUE, -3.4028235E38f, ((float) i66) / f3, ((float) i68) / f5, false, -16777216, Integer.MIN_VALUE, 0.0f));
                            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                            canvas.restore();
                            sq4 = sq43;
                            lq45 = lq47;
                            iq4 iq45 = iq44;
                            arrayList2 = arrayList4;
                            iq42 = iq45;
                            char c4 = c3;
                            i46 = i61 + 1;
                            char c5 = c2;
                            char c6 = c4;
                        }
                    }
                } else {
                    xw3 = new xw3(-9223372036854775807L, -9223372036854775807L, arrayList2);
                }
            }
        }
        nf3.accept(xw3);
    }

    public int R() {
        return 2;
    }

    public void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mc9 mc9 = (mc9) ((ConcurrentHashMap) this.Y).remove(Long.valueOf(((Number) it.next()).longValue()));
            if (mc9 != null) {
                i22 i22 = (i22) mc9.getValue();
                mc9.setValue((Object) null);
                if (i22 != null) {
                    o62 o62 = i22.b;
                    if (o62.a != 0 || o62.f(((aqc) ((t97) this.o).getValue()).a())) {
                        mc9 mc92 = (mc9) ((ConcurrentHashMap) this.Z).remove(Long.valueOf(o62.a));
                        if (mc92 != null) {
                            mc92.setValue((Object) null);
                        }
                    } else {
                        return;
                    }
                } else {
                    continue;
                }
            }
        }
    }

    public void c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i22 i22 = (i22) it.next();
            ((mc9) ((ConcurrentHashMap) this.Y).computeIfAbsent(Long.valueOf(i22.a), new di(2, new cv2(i22, 1)))).setValue(i22);
            o62 o62 = i22.b;
            if (o62.a != 0 || o62.f(((aqc) ((t97) this.o).getValue()).a())) {
                ((mc9) ((ConcurrentHashMap) this.Z).computeIfAbsent(Long.valueOf(o62.a), new di(3, new cv2(i22, 0)))).setValue(i22);
            } else {
                return;
            }
        }
    }

    public poe j() {
        ac4 ac4 = (ac4) this.a;
        bu7 bu7 = ac4.c;
        if (bu7 == null) {
            return poe.c;
        }
        int intValue = ((Integer) k(bu7).first).intValue();
        pb4 a2 = ((mb4) ac4.e.get()).a(intValue, bu7.c[intValue]);
        if (a2 == null) {
            return poe.c;
        }
        for (poe poe : (List) this.o) {
            ooe ooe = poe.a;
            if (ooe.Z == intValue && ooe.w0 == a2.a && ooe.x0 == a2.b[0]) {
                return poe;
            }
        }
        return poe.c;
    }

    public Pair k(bu7 bu7) {
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < bu7.a; i3++) {
            if (bu7.c[i3].a != 0) {
                tgd tgd = (tgd) this.b;
                tgd.Z1();
                m45 m45 = tgd.c;
                m45.s2();
                int i4 = m45.w0[i3].a;
                if (i4 == 1) {
                    i2 = i3;
                } else if (i4 == 2) {
                    i = i3;
                }
            }
        }
        return new Pair(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public boolean l() {
        int i;
        int i2;
        bu7 bu7;
        int intValue;
        List list;
        if (((u2f) this.c) == null) {
            return false;
        }
        ac4 ac4 = (ac4) this.a;
        bu7 bu72 = ac4.c;
        ArrayList arrayList = null;
        if (bu72 != null) {
            Pair k = k(bu72);
            int intValue2 = ((Integer) k.first).intValue();
            int intValue3 = ((Integer) k.second).intValue();
            if (intValue2 >= 0) {
                voe[] voeArr = bu72.c;
                ArrayList m = m(intValue2, voeArr[intValue2]);
                ArrayList<ooe> m2 = intValue3 > 0 ? m(intValue3, voeArr[intValue3]) : null;
                ArrayList arrayList2 = new ArrayList(m.size());
                for (int i3 = 0; i3 < m.size(); i3++) {
                    ooe ooe = (ooe) m.get(i3);
                    int i4 = ooe.x0;
                    if (m2 == null) {
                        list = Collections.emptyList();
                    } else {
                        ArrayList arrayList3 = new ArrayList();
                        for (ooe ooe2 : m2) {
                            if (ooe2.x0 == i4) {
                                arrayList3.add(ooe2);
                            }
                        }
                        list = arrayList3;
                    }
                    arrayList2.add(new poe(ooe, list));
                    if ((((u2f) this.c) instanceof uj6) && ooe.X == 0) {
                        oa7 oa7 = (oa7) this.Y;
                        if (oa7.get() != null) {
                            ((bd) oa7.get()).f("HLS_WITHOUT_HEIGHT");
                        }
                    }
                }
                if (!arrayList2.isEmpty()) {
                    arrayList = arrayList2;
                }
            }
        }
        if (arrayList == null) {
            this.o = Collections.emptyList();
            return false;
        }
        this.o = arrayList;
        int i5 = ((i03) this.X).g.getInt("app.video.play.quality", -1);
        if (i5 > 0) {
            q(i5);
        }
        u2f u2f = (u2f) this.c;
        if (u2f == null) {
            return true;
        }
        jj0 jj0 = (jj0) u2f;
        if (jj0.b <= 0 || (i = jj0.h) == -1 || (i2 = jj0.i) == -1 || (bu7 = ac4.c) == null || (intValue = ((Integer) k(bu7).second).intValue()) < 0) {
            return true;
        }
        pb4 pb4 = new pb4(i2, 0, new int[]{i});
        voe voe = bu7.c[intValue];
        ob4 b2 = ac4.b();
        b2.e(intValue, voe, pb4);
        ac4.h(b2);
        return true;
    }

    public ArrayList m(int i, voe voe) {
        int i2;
        ArrayList arrayList;
        voe voe2 = voe;
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < voe2.a; i3++) {
            toe a2 = voe2.a(i3);
            int i4 = 0;
            while (i4 < a2.a) {
                vu5 vu5 = a2.c[i4];
                hbe hbe = (hbe) this.Z;
                hbe.getClass();
                if (b49.g(vu5.A0) == 1) {
                    List list = hbe.c;
                    arrayList = new ArrayList();
                    for (Object next : list) {
                        if (next instanceof l28) {
                            arrayList.add(next);
                        }
                    }
                } else {
                    if (b49.g(vu5.A0) == 2) {
                        List list2 = hbe.d;
                        arrayList = new ArrayList();
                        for (Object next2 : list2) {
                            if (next2 instanceof j38) {
                                arrayList.add(next2);
                            }
                        }
                    }
                    ooe ooe = r4;
                    i2 = i4;
                    ooe ooe2 = new ooe(vu5.a, vu5.b, vu5.c, vu5.F0, vu5.G0, vu5.w0, i, i3, i4);
                    arrayList2.add(ooe);
                    i4 = i2 + 1;
                }
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            udd.p("kv2", "mapTracks: Skip format %s", new Object[]{vu5});
                            i2 = i4;
                            break;
                        }
                        try {
                            if ((((w28) it.next()).A(vu5) & 7) == 4) {
                                break;
                            }
                        } catch (ExoPlaybackException unused) {
                        }
                    }
                    i4 = i2 + 1;
                }
                ooe ooe3 = ooe2;
                i2 = i4;
                ooe ooe22 = new ooe(vu5.a, vu5.b, vu5.c, vu5.F0, vu5.G0, vu5.w0, i, i3, i4);
                arrayList2.add(ooe3);
                i4 = i2 + 1;
            }
        }
        Collections.sort(arrayList2, new xb4(26));
        return arrayList2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0083, code lost:
        r5 = r9.w0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void q(int r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.a
            ac4 r0 = (ac4) r0
            bu7 r1 = r0.c
            if (r1 != 0) goto L_0x0009
            return
        L_0x0009:
            java.lang.Object r8 = r8.o
            java.util.List r8 = (java.util.List) r8
            java.util.Iterator r8 = r8.iterator()
            r2 = 0
        L_0x0012:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x0037
            java.lang.Object r3 = r8.next()
            poe r3 = (defpackage.poe) r3
            if (r2 != 0) goto L_0x0022
        L_0x0020:
            r2 = r3
            goto L_0x0012
        L_0x0022:
            ooe r4 = r3.a
            int r4 = r4.X
            int r4 = r4 - r9
            int r4 = java.lang.Math.abs(r4)
            ooe r5 = r2.a
            int r5 = r5.X
            int r5 = r5 - r9
            int r5 = java.lang.Math.abs(r5)
            if (r4 >= r5) goto L_0x0012
            goto L_0x0020
        L_0x0037:
            if (r2 != 0) goto L_0x003a
            return
        L_0x003a:
            java.lang.Object[] r8 = new java.lang.Object[]{r2}
            java.lang.String r9 = "kv2"
            java.lang.String r3 = "selectTrackWithHeight %s"
            udd.p(r9, r3, r8)
            pb4 r8 = new pb4
            ooe r9 = r2.a
            int r3 = r9.w0
            int r4 = r9.x0
            int[] r5 = new int[]{r4}
            r6 = 0
            r8.<init>(r3, r6, r5)
            voe[] r1 = r1.c
            int r3 = r9.Z
            r5 = r1[r3]
            ob4 r7 = r0.b()
            r7.e(r3, r5, r8)
            r0.h(r7)
            java.util.List r8 = r2.b
            boolean r2 = r8.isEmpty()
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x00a0
            java.util.Iterator r8 = r8.iterator()
        L_0x0073:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L_0x00a0
            java.lang.Object r2 = r8.next()
            ooe r2 = (defpackage.ooe) r2
            int r3 = r2.x0
            if (r3 != r4) goto L_0x0073
            int r5 = r9.w0
            int r7 = r2.w0
            if (r7 != r5) goto L_0x0073
            pb4 r8 = new pb4
            int[] r9 = new int[]{r3}
            r8.<init>(r7, r6, r9)
            int r9 = r2.Z
            r1 = r1[r9]
            ob4 r2 = r0.b()
            r2.e(r9, r1, r8)
            r0.h(r2)
        L_0x00a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kv2.q(int):void");
    }

    public void reset() {
        sq4 sq4 = (sq4) this.Y;
        sq4.c.clear();
        sq4.d.clear();
        sq4.e.clear();
        sq4.f.clear();
        sq4.g.clear();
        sq4.h = null;
        sq4.i = null;
    }
}
