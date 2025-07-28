package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.Surface;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: d4b  reason: default package */
public final class d4b implements i36, p60, zhd, g1e, jtc, hcf, cr3 {
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;

    public /* synthetic */ d4b(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.w4g i(org.webrtc.RTCStats r7, org.webrtc.RTCStatsReport r8) {
        /*
            r0 = -1
            k77[] r1 = bxb.a
            java.util.Map r8 = r8.getStatsMap()
            java.util.Map r1 = r7.getMembers()
            java.lang.String r2 = "codecId"
            java.lang.Object r1 = r1.get(r2)
            java.lang.Object r8 = r8.get(r1)
            org.webrtc.RTCStats r8 = (org.webrtc.RTCStats) r8
            r1 = 1
            java.lang.String r2 = ""
            if (r8 == 0) goto L_0x0041
            q52 r3 = bxb.b
            k77[] r4 = bxb.a
            r5 = 0
            r4 = r4[r5]
            java.lang.Object r3 = r3.T0(r8, r4)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x0041
            int r4 = defpackage.h0e.V(r3)
        L_0x002f:
            if (r0 >= r4) goto L_0x0042
            char r5 = r3.charAt(r4)
            r6 = 47
            if (r5 == r6) goto L_0x003b
            int r4 = r4 + r0
            goto L_0x002f
        L_0x003b:
            int r4 = r4 + r1
            java.lang.String r3 = r3.substring(r4)
            goto L_0x0042
        L_0x0041:
            r3 = r2
        L_0x0042:
            q52 r0 = bxb.d
            k77[] r4 = bxb.a
            r5 = 2
            r5 = r4[r5]
            java.lang.Object r0 = r0.T0(r7, r5)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x005f
            q52 r0 = bxb.c
            r1 = r4[r1]
            java.lang.Object r7 = r0.T0(r7, r1)
            r0 = r7
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x005f
            r0 = r2
        L_0x005f:
            if (r8 == 0) goto L_0x0070
            q52 r7 = bxb.e
            r1 = 3
            r1 = r4[r1]
            java.lang.Object r7 = r7.T0(r8, r1)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r2 = r7
        L_0x0070:
            if (r8 == 0) goto L_0x007d
            q52 r7 = bxb.f
            r1 = 4
            r1 = r4[r1]
            java.lang.Object r7 = r7.T0(r8, r1)
            java.lang.Long r7 = (java.lang.Long) r7
        L_0x007d:
            w4g r7 = new w4g
            r8 = 14
            r7.<init>((java.lang.Object) r3, (java.lang.Object) r0, (java.lang.Object) r2, (int) r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d4b.i(org.webrtc.RTCStats, org.webrtc.RTCStatsReport):w4g");
    }

    public void a(Object obj) {
        switch (this.a) {
            case 0:
                Void voidR = (Void) obj;
                ((sn1) this.b).b((hv1) this.c);
                return;
            case 3:
                ((zhd) this.c).a(obj);
                return;
            case 6:
                zhd zhd = (zhd) this.b;
                try {
                    ((lk0) ((o73) this.c).c).accept(obj, (Object) null);
                    zhd.a(obj);
                    return;
                } catch (Throwable th) {
                    ek8.a0(th);
                    zhd.onError(th);
                    return;
                }
            default:
                Void voidR2 = (Void) obj;
                ((rf3) this.b).accept(new bb0(0, (Surface) this.c));
                return;
        }
    }

    public void b(bke bke, h75 h75, pse pse) {
    }

    public int c(int i) {
        return i;
    }

    public void d(xi4 xi4) {
        switch (this.a) {
            case 3:
                bj4.c((AtomicReference) this.b, xi4);
                return;
            default:
                ((zhd) this.b).d(xi4);
                return;
        }
    }

    public void dispose() {
        SparseArray sparseArray = (SparseArray) ((k2e) this.c).a;
        for (int size = sparseArray.size() - 1; size >= 0; size--) {
            List list = (List) sparseArray.valueAt(size);
            if (list.remove((zg9) this.b) && list.isEmpty()) {
                sparseArray.removeAt(size);
            }
        }
    }

    public void e(Throwable th) {
        switch (this.a) {
            case 0:
                ((sn1) this.b).d(th);
                return;
            default:
                e07.p("Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th, th instanceof w4e);
                ((rf3) this.b).accept(new bb0(1, (Surface) this.c));
                return;
        }
    }

    public int f(int i) {
        k2e k2e = (k2e) this.c;
        List list = (List) ((SparseArray) k2e.a).get(i);
        if (list == null) {
            list = new ArrayList();
            ((SparseArray) k2e.a).put(i, list);
        }
        zg9 zg9 = (zg9) this.b;
        if (!list.contains(zg9)) {
            list.add(zg9);
        }
        return i;
    }

    public void g(yze yze) {
        lse lse;
        if (yze.v() == 0 && (yze.v() & 128) != 0) {
            yze.I(6);
            int c2 = yze.c() / 4;
            int i = 0;
            while (true) {
                lse = (lse) this.c;
                if (i >= c2) {
                    break;
                }
                wx1 wx1 = (wx1) this.b;
                yze.g(0, wx1.b, 4);
                wx1.q(0);
                int i2 = wx1.i(16);
                wx1.t(3);
                if (i2 == 0) {
                    wx1.t(13);
                } else {
                    int i3 = wx1.i(13);
                    if (lse.f.get(i3) == null) {
                        lse.f.put(i3, new ltc(new ope(lse, i3)));
                        lse.l++;
                    }
                }
                i++;
            }
            if (lse.a != 2) {
                lse.f.remove(0);
            }
        }
    }

    public int h(long j) {
        int i;
        Long valueOf = Long.valueOf(j);
        int i2 = mze.a;
        List list = (List) this.c;
        int binarySearch = Collections.binarySearch(list, valueOf);
        if (binarySearch < 0) {
            i = ~binarySearch;
        } else {
            int size = list.size();
            do {
                binarySearch++;
                if (binarySearch >= size || ((Comparable) list.get(binarySearch)).compareTo(valueOf) != 0) {
                    i = binarySearch;
                }
                binarySearch++;
                break;
            } while (((Comparable) list.get(binarySearch)).compareTo(valueOf) != 0);
            i = binarySearch;
        }
        if (i < list.size()) {
            return i;
        }
        return -1;
    }

    public void j(h75 h75, pse pse) {
        int i = 0;
        while (true) {
            ape[] apeArr = (ape[]) this.c;
            if (i < apeArr.length) {
                pse.a();
                pse.b();
                ape B = h75.B(pse.e, 3);
                vu5 vu5 = (vu5) ((List) this.b).get(i);
                String str = vu5.A0;
                boolean z = "application/cea-608".equals(str) || "application/cea-708".equals(str);
                String valueOf = String.valueOf(str);
                swb.d(valueOf.length() != 0 ? "Invalid closed caption mime type provided: ".concat(valueOf) : new String("Invalid closed caption mime type provided: "), z);
                String str2 = vu5.a;
                if (str2 == null) {
                    pse.b();
                    str2 = pse.f;
                }
                tu5 tu5 = new tu5();
                tu5.a = str2;
                tu5.k = str;
                tu5.d = vu5.o;
                tu5.c = vu5.c;
                tu5.C = vu5.S0;
                tu5.m = vu5.C0;
                B.d(new vu5(tu5));
                apeArr[i] = B;
                i++;
            } else {
                return;
            }
        }
    }

    public long k(int i) {
        boolean z = false;
        swb.e(i >= 0);
        List list = (List) this.c;
        if (i < list.size()) {
            z = true;
        }
        swb.e(z);
        return ((Long) list.get(i)).longValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        r1 = (android.os.Bundle) r4.f();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object l(com.google.android.gms.tasks.Task r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.b
            zgc r0 = (defpackage.zgc) r0
            r0.getClass()
            boolean r1 = r4.h()
            if (r1 != 0) goto L_0x000e
            goto L_0x002e
        L_0x000e:
            java.lang.Object r1 = r4.f()
            android.os.Bundle r1 = (android.os.Bundle) r1
            if (r1 == 0) goto L_0x002e
            java.lang.String r2 = "google.messenger"
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto L_0x002e
            java.lang.Object r3 = r3.c
            android.os.Bundle r3 = (android.os.Bundle) r3
            n6g r3 = r0.a(r3)
            mh4 r4 = defpackage.mh4.o
            g02 r0 = g02.Z
            n6g r4 = r3.l(r4, r0)
        L_0x002e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d4b.l(com.google.android.gms.tasks.Task):java.lang.Object");
    }

    public String m(String str) {
        Resources resources = (Resources) this.b;
        int identifier = resources.getIdentifier(str, "string", (String) this.c);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public void n(String str) {
        ((xwb) this.b).log("OKWSSignaling", str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:289:0x05bd  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x05de  */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x0608  */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x0715  */
    /* JADX WARNING: Removed duplicated region for block: B:363:0x076c  */
    /* JADX WARNING: Removed duplicated region for block: B:399:0x0861  */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x0667 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zwb o(yrd r63) {
        /*
            r62 = this;
            r0 = r62
            zwb r7 = new zwb
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MICROSECONDS
            r2 = r63
            org.webrtc.RTCStatsReport r2 = r2.a
            double r3 = r2.getTimestampUs()
            long r3 = (long) r3
            long r3 = r1.toMillis(r3)
            hw4 r5 = defpackage.hw4.a
            java.util.Map r1 = r2.getStatsMap()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
            r9 = -1
            r10 = -1
        L_0x0028:
            boolean r11 = r1.hasNext()
            if (r11 == 0) goto L_0x061a
            java.lang.Object r11 = r1.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r11 = r11.getValue()
            org.webrtc.RTCStats r11 = (org.webrtc.RTCStats) r11
            java.lang.String r14 = r11.getType()
            java.lang.String r15 = "inbound-rtp"
            boolean r14 = defpackage.hhd.f(r14, r15)
            java.lang.String r8 = "jitter"
            java.lang.String r12 = "bytesReceived"
            java.lang.String r13 = "packetsDiscarded"
            r16 = r1
            java.lang.String r1 = "packetsReceived"
            r17 = r5
            java.lang.String r5 = "audio"
            r18 = 0
            r20 = 0
            if (r14 == 0) goto L_0x01a4
            java.lang.String r14 = bxb.e(r11)
            boolean r14 = defpackage.hhd.f(r14, r5)
            if (r14 == 0) goto L_0x01a4
            java.lang.Long r5 = bxb.g(r11)
            if (r5 == 0) goto L_0x0072
            long r23 = r5.longValue()
            java.lang.String r25 = bxb.i(r11)
            if (r25 != 0) goto L_0x007e
        L_0x0072:
            r22 = r3
            r26 = r6
            r24 = r7
            r25 = r9
        L_0x007a:
            r18 = r10
            goto L_0x05ba
        L_0x007e:
            java.util.Map r5 = r11.getMembers()
            java.lang.Object r1 = r5.get(r1)
            if (r1 == 0) goto L_0x008f
            java.math.BigInteger r1 = bxb.a(r1)
            r26 = r1
            goto L_0x0091
        L_0x008f:
            r26 = 0
        L_0x0091:
            java.math.BigInteger r27 = bxb.f(r11)
            java.util.Map r1 = r11.getMembers()
            java.lang.Object r1 = r1.get(r13)
            if (r1 == 0) goto L_0x00a2
            bxb.a(r1)
        L_0x00a2:
            java.util.Map r1 = r11.getMembers()
            java.lang.Object r1 = r1.get(r12)
            if (r1 == 0) goto L_0x00b3
            java.math.BigInteger r1 = bxb.a(r1)
            r28 = r1
            goto L_0x00b5
        L_0x00b3:
            r28 = 0
        L_0x00b5:
            java.util.Map r1 = r11.getMembers()
            java.lang.Object r1 = r1.get(r8)
            if (r1 == 0) goto L_0x00c4
            java.lang.Double r1 = bxb.b(r1)
            goto L_0x00c5
        L_0x00c4:
            r1 = 0
        L_0x00c5:
            if (r1 == 0) goto L_0x00cb
            double r18 = r1.doubleValue()
        L_0x00cb:
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            r12 = 1
            long r12 = r1.toMillis(r12)
            double r12 = (double) r12
            double r12 = r12 * r18
            long r12 = (long) r12
            java.lang.String r33 = bxb.h(r11)
            if (r33 != 0) goto L_0x00de
            goto L_0x0072
        L_0x00de:
            java.util.Map r1 = r11.getMembers()
            java.lang.String r5 = "totalSamplesReceived"
            java.lang.Object r1 = r1.get(r5)
            if (r1 == 0) goto L_0x00ef
            java.lang.Long r1 = bxb.c(r1)
            goto L_0x00f0
        L_0x00ef:
            r1 = 0
        L_0x00f0:
            if (r1 == 0) goto L_0x00f9
            long r14 = r1.longValue()
            r34 = r14
            goto L_0x00fb
        L_0x00f9:
            r34 = r20
        L_0x00fb:
            java.util.Map r1 = r11.getMembers()
            java.lang.String r5 = "insertedSamplesForDeceleration"
            java.lang.Object r1 = r1.get(r5)
            if (r1 == 0) goto L_0x010c
            java.lang.Long r1 = bxb.c(r1)
            goto L_0x010d
        L_0x010c:
            r1 = 0
        L_0x010d:
            if (r1 == 0) goto L_0x0116
            long r14 = r1.longValue()
            r36 = r14
            goto L_0x0118
        L_0x0116:
            r36 = r20
        L_0x0118:
            java.util.Map r1 = r11.getMembers()
            java.lang.String r5 = "removedSamplesForAcceleration"
            java.lang.Object r1 = r1.get(r5)
            if (r1 == 0) goto L_0x0129
            java.lang.Long r1 = bxb.c(r1)
            goto L_0x012a
        L_0x0129:
            r1 = 0
        L_0x012a:
            if (r1 == 0) goto L_0x0133
            long r14 = r1.longValue()
            r38 = r14
            goto L_0x0135
        L_0x0133:
            r38 = r20
        L_0x0135:
            java.util.Map r1 = r11.getMembers()
            java.lang.String r5 = "concealedSamples"
            java.lang.Object r1 = r1.get(r5)
            if (r1 == 0) goto L_0x0146
            java.lang.Long r1 = bxb.c(r1)
            goto L_0x0147
        L_0x0146:
            r1 = 0
        L_0x0147:
            if (r1 == 0) goto L_0x0150
            long r14 = r1.longValue()
            r40 = r14
            goto L_0x0152
        L_0x0150:
            r40 = r20
        L_0x0152:
            java.util.Map r1 = r11.getMembers()
            java.lang.String r5 = "silentConcealedSamples"
            java.lang.Object r1 = r1.get(r5)
            if (r1 == 0) goto L_0x0163
            java.lang.Long r1 = bxb.c(r1)
            goto L_0x0164
        L_0x0163:
            r1 = 0
        L_0x0164:
            if (r1 == 0) goto L_0x016d
            long r14 = r1.longValue()
            r42 = r14
            goto L_0x016f
        L_0x016d:
            r42 = r20
        L_0x016f:
            java.util.Map r1 = r11.getMembers()
            java.lang.String r5 = "concealmentEvents"
            java.lang.Object r1 = r1.get(r5)
            if (r1 == 0) goto L_0x0180
            java.lang.Long r14 = bxb.c(r1)
            goto L_0x0181
        L_0x0180:
            r14 = 0
        L_0x0181:
            if (r14 == 0) goto L_0x0187
            long r20 = r14.longValue()
        L_0x0187:
            r44 = r20
            w4g r46 = i(r11, r2)
            ynd r14 = new ynd
            r22 = r14
            r29 = -1
            r31 = r12
            r22.<init>(r23, r25, r26, r27, r28, r29, r31, r33, r34, r36, r38, r40, r42, r44, r46)
            r22 = r3
            r26 = r6
            r24 = r7
            r25 = r9
        L_0x01a0:
            r18 = r10
            goto L_0x05bb
        L_0x01a4:
            java.lang.String r14 = r11.getType()
            boolean r14 = defpackage.hhd.f(r14, r15)
            java.lang.String r15 = "frameHeight"
            r22 = r3
            java.lang.String r3 = "frameWidth"
            java.lang.String r4 = "firCount"
            r24 = r7
            java.lang.String r7 = "pliCount"
            r25 = r9
            java.lang.String r9 = "nackCount"
            r26 = r6
            java.lang.String r6 = "video"
            r27 = -1
            if (r14 == 0) goto L_0x0396
            java.lang.String r14 = bxb.e(r11)
            boolean r14 = defpackage.hhd.f(r14, r6)
            if (r14 == 0) goto L_0x0396
            java.lang.Long r5 = bxb.g(r11)
            if (r5 == 0) goto L_0x007a
            long r30 = r5.longValue()
            java.lang.String r32 = bxb.i(r11)
            if (r32 != 0) goto L_0x01e0
        L_0x01de:
            goto L_0x007a
        L_0x01e0:
            java.util.Map r5 = r11.getMembers()
            java.lang.Object r1 = r5.get(r1)
            if (r1 == 0) goto L_0x01f1
            java.math.BigInteger r1 = bxb.a(r1)
            r33 = r1
            goto L_0x01f3
        L_0x01f1:
            r33 = 0
        L_0x01f3:
            java.math.BigInteger r34 = bxb.f(r11)
            java.util.Map r1 = r11.getMembers()
            java.lang.Object r1 = r1.get(r13)
            if (r1 == 0) goto L_0x0204
            bxb.a(r1)
        L_0x0204:
            java.util.Map r1 = r11.getMembers()
            java.lang.Object r1 = r1.get(r12)
            if (r1 == 0) goto L_0x0215
            java.math.BigInteger r1 = bxb.a(r1)
            r35 = r1
            goto L_0x0217
        L_0x0215:
            r35 = 0
        L_0x0217:
            java.util.Map r1 = r11.getMembers()
            java.lang.Object r1 = r1.get(r8)
            if (r1 == 0) goto L_0x0226
            java.lang.Double r1 = bxb.b(r1)
            goto L_0x0227
        L_0x0226:
            r1 = 0
        L_0x0227:
            if (r1 == 0) goto L_0x022e
            double r5 = r1.doubleValue()
            goto L_0x0230
        L_0x022e:
            r5 = r18
        L_0x0230:
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            r8 = r15
            r12 = 1
            long r14 = r1.toMillis(r12)
            double r12 = (double) r14
            double r5 = r5 * r12
            long r5 = (long) r5
            java.util.Map r12 = r11.getMembers()
            java.lang.Object r9 = r12.get(r9)
            if (r9 == 0) goto L_0x024b
            java.lang.Long r9 = bxb.c(r9)
            goto L_0x024c
        L_0x024b:
            r9 = 0
        L_0x024c:
            if (r9 == 0) goto L_0x0255
            long r12 = r9.longValue()
            r38 = r12
            goto L_0x0257
        L_0x0255:
            r38 = r20
        L_0x0257:
            java.util.Map r9 = r11.getMembers()
            java.lang.Object r7 = r9.get(r7)
            if (r7 == 0) goto L_0x0266
            java.lang.Long r7 = bxb.c(r7)
            goto L_0x0267
        L_0x0266:
            r7 = 0
        L_0x0267:
            if (r7 == 0) goto L_0x0270
            long r12 = r7.longValue()
            r40 = r12
            goto L_0x0272
        L_0x0270:
            r40 = r20
        L_0x0272:
            java.util.Map r7 = r11.getMembers()
            java.lang.Object r4 = r7.get(r4)
            if (r4 == 0) goto L_0x0281
            java.lang.Long r4 = bxb.c(r4)
            goto L_0x0282
        L_0x0281:
            r4 = 0
        L_0x0282:
            if (r4 == 0) goto L_0x028b
            long r12 = r4.longValue()
            r42 = r12
            goto L_0x028d
        L_0x028b:
            r42 = r20
        L_0x028d:
            java.util.Map r4 = r11.getMembers()
            java.lang.String r7 = "framesDecoded"
            java.lang.Object r4 = r4.get(r7)
            if (r4 == 0) goto L_0x029e
            java.lang.Long r4 = bxb.c(r4)
            goto L_0x029f
        L_0x029e:
            r4 = 0
        L_0x029f:
            if (r4 == 0) goto L_0x02a8
            long r12 = r4.longValue()
            r44 = r12
            goto L_0x02aa
        L_0x02a8:
            r44 = r20
        L_0x02aa:
            java.util.Map r4 = r11.getMembers()
            java.lang.String r7 = "framesReceived"
            java.lang.Object r4 = r4.get(r7)
            if (r4 == 0) goto L_0x02bb
            java.lang.Long r4 = bxb.c(r4)
            goto L_0x02bc
        L_0x02bb:
            r4 = 0
        L_0x02bc:
            if (r4 == 0) goto L_0x02c5
            long r12 = r4.longValue()
            r46 = r12
            goto L_0x02c7
        L_0x02c5:
            r46 = r20
        L_0x02c7:
            java.util.Map r4 = r11.getMembers()
            java.lang.String r7 = "framesDropped"
            java.lang.Object r4 = r4.get(r7)
            if (r4 == 0) goto L_0x02d8
            java.lang.Long r4 = bxb.c(r4)
            goto L_0x02d9
        L_0x02d8:
            r4 = 0
        L_0x02d9:
            if (r4 == 0) goto L_0x02e2
            long r12 = r4.longValue()
            r53 = r12
            goto L_0x02e4
        L_0x02e2:
            r53 = r20
        L_0x02e4:
            java.util.Map r4 = r11.getMembers()
            java.lang.Object r3 = r4.get(r3)
            if (r3 == 0) goto L_0x02f3
            java.lang.Long r3 = bxb.c(r3)
            goto L_0x02f4
        L_0x02f3:
            r3 = 0
        L_0x02f4:
            if (r3 == 0) goto L_0x02fd
            long r3 = r3.longValue()
            r50 = r3
            goto L_0x02ff
        L_0x02fd:
            r50 = r27
        L_0x02ff:
            java.util.Map r3 = r11.getMembers()
            java.lang.Object r3 = r3.get(r8)
            if (r3 == 0) goto L_0x030e
            java.lang.Long r3 = bxb.c(r3)
            goto L_0x030f
        L_0x030e:
            r3 = 0
        L_0x030f:
            if (r3 == 0) goto L_0x0315
            long r27 = r3.longValue()
        L_0x0315:
            r48 = r27
            java.lang.String r52 = bxb.h(r11)
            if (r52 != 0) goto L_0x031f
            goto L_0x01de
        L_0x031f:
            java.util.Map r3 = r11.getMembers()
            java.lang.String r4 = "totalSquaredInterFrameDelay"
            java.lang.Object r3 = r3.get(r4)
            if (r3 == 0) goto L_0x0332
            java.lang.Double r3 = bxb.b(r3)
            r55 = r3
            goto L_0x0334
        L_0x0332:
            r55 = 0
        L_0x0334:
            java.util.Map r3 = r11.getMembers()
            java.lang.String r4 = "totalInterFrameDelay"
            java.lang.Object r3 = r3.get(r4)
            if (r3 == 0) goto L_0x0347
            java.lang.Double r3 = bxb.b(r3)
            r56 = r3
            goto L_0x0349
        L_0x0347:
            r56 = 0
        L_0x0349:
            w4g r57 = i(r11, r2)
            java.util.Map r3 = r11.getMembers()
            java.lang.String r4 = "freezeCount"
            java.lang.Object r3 = r3.get(r4)
            if (r3 == 0) goto L_0x035e
            java.lang.Long r3 = bxb.c(r3)
            goto L_0x035f
        L_0x035e:
            r3 = 0
        L_0x035f:
            if (r3 == 0) goto L_0x0365
            long r20 = r3.longValue()
        L_0x0365:
            r58 = r20
            java.util.Map r3 = r11.getMembers()
            java.lang.String r4 = "totalFreezesDuration"
            java.lang.Object r3 = r3.get(r4)
            if (r3 == 0) goto L_0x0378
            java.lang.Double r14 = bxb.b(r3)
            goto L_0x0379
        L_0x0378:
            r14 = 0
        L_0x0379:
            if (r14 == 0) goto L_0x037f
            double r18 = r14.doubleValue()
        L_0x037f:
            r3 = 1
            long r3 = r1.toMillis(r3)
            double r3 = (double) r3
            double r3 = r3 * r18
            long r3 = (long) r3
            r60 = r3
            cod r14 = new cod
            r29 = r14
            r36 = r5
            r29.<init>(r30, r32, r33, r34, r35, r36, r38, r40, r42, r44, r46, r48, r50, r52, r53, r55, r56, r57, r58, r60)
            goto L_0x01a0
        L_0x0396:
            r8 = r15
            java.lang.String r1 = r11.getType()
            java.lang.String r12 = "outbound-rtp"
            boolean r1 = defpackage.hhd.f(r1, r12)
            java.lang.String r13 = "mediaSourceId"
            java.lang.String r14 = "remoteId"
            java.lang.String r15 = "bytesSent"
            r18 = r10
            java.lang.String r10 = "packetsSent"
            if (r1 == 0) goto L_0x0460
            java.lang.String r1 = bxb.e(r11)
            boolean r1 = defpackage.hhd.f(r1, r5)
            if (r1 == 0) goto L_0x0460
            java.lang.Long r1 = bxb.g(r11)
            if (r1 == 0) goto L_0x05ba
            long r29 = r1.longValue()
            java.lang.String r31 = bxb.i(r11)
            if (r31 != 0) goto L_0x03c9
            goto L_0x05ba
        L_0x03c9:
            java.util.Map r1 = r11.getMembers()
            java.lang.Object r1 = r1.get(r10)
            if (r1 == 0) goto L_0x03da
            java.math.BigInteger r1 = bxb.a(r1)
            r32 = r1
            goto L_0x03dc
        L_0x03da:
            r32 = 0
        L_0x03dc:
            java.util.Map r1 = r11.getMembers()
            java.lang.Object r1 = r1.get(r15)
            if (r1 == 0) goto L_0x03ed
            java.math.BigInteger r1 = bxb.a(r1)
            r34 = r1
            goto L_0x03ef
        L_0x03ed:
            r34 = 0
        L_0x03ef:
            java.util.Map r1 = r2.getStatsMap()
            java.util.Map r3 = r11.getMembers()
            java.lang.Object r3 = r3.get(r14)
            java.lang.Object r1 = r1.get(r3)
            org.webrtc.RTCStats r1 = (org.webrtc.RTCStats) r1
            if (r1 == 0) goto L_0x040a
            java.math.BigInteger r1 = bxb.f(r1)
            r33 = r1
            goto L_0x040c
        L_0x040a:
            r33 = 0
        L_0x040c:
            java.util.Map r1 = r2.getStatsMap()
            java.util.Map r3 = r11.getMembers()
            java.lang.Object r3 = r3.get(r13)
            java.lang.Object r1 = r1.get(r3)
            org.webrtc.RTCStats r1 = (org.webrtc.RTCStats) r1
            if (r1 != 0) goto L_0x0422
            goto L_0x05ba
        L_0x0422:
            java.lang.String r1 = bxb.h(r1)
            if (r1 != 0) goto L_0x042a
            goto L_0x05ba
        L_0x042a:
            w4g r36 = i(r11, r2)
            java.lang.Object r3 = r0.c
            hl7 r3 = (hl7) r3
            if (r3 == 0) goto L_0x0451
            jl7 r3 = r3.a
            java.lang.String r4 = r3.k
            boolean r4 = r1.equals(r4)
            java.lang.String r3 = r3.l
            boolean r3 = r1.equals(r3)
            if (r4 != 0) goto L_0x0449
            if (r3 == 0) goto L_0x0447
            goto L_0x0449
        L_0x0447:
            r12 = 0
            goto L_0x044a
        L_0x0449:
            r12 = 1
        L_0x044a:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r12)
            r37 = r14
            goto L_0x0453
        L_0x0451:
            r37 = 0
        L_0x0453:
            znd r14 = new znd
            r28 = 1
            r27 = r14
            r35 = r1
            r27.<init>(r28, r29, r31, r32, r33, r34, r35, r36, r37)
            goto L_0x05bb
        L_0x0460:
            java.lang.String r1 = r11.getType()
            boolean r1 = defpackage.hhd.f(r1, r12)
            if (r1 == 0) goto L_0x05ba
            java.lang.String r1 = bxb.e(r11)
            boolean r1 = defpackage.hhd.f(r1, r6)
            if (r1 == 0) goto L_0x05ba
            java.lang.Long r1 = bxb.g(r11)
            if (r1 == 0) goto L_0x05ba
            long r30 = r1.longValue()
            java.lang.String r32 = bxb.i(r11)
            if (r32 != 0) goto L_0x0486
            goto L_0x05ba
        L_0x0486:
            java.util.Map r1 = r11.getMembers()
            java.lang.Object r1 = r1.get(r10)
            if (r1 == 0) goto L_0x0497
            java.math.BigInteger r1 = bxb.a(r1)
            r33 = r1
            goto L_0x0499
        L_0x0497:
            r33 = 0
        L_0x0499:
            java.util.Map r1 = r11.getMembers()
            java.lang.Object r1 = r1.get(r15)
            if (r1 == 0) goto L_0x04aa
            java.math.BigInteger r1 = bxb.a(r1)
            r35 = r1
            goto L_0x04ac
        L_0x04aa:
            r35 = 0
        L_0x04ac:
            java.util.Map r1 = r11.getMembers()
            java.lang.Object r1 = r1.get(r9)
            if (r1 == 0) goto L_0x04bb
            java.lang.Long r1 = bxb.c(r1)
            goto L_0x04bc
        L_0x04bb:
            r1 = 0
        L_0x04bc:
            if (r1 == 0) goto L_0x04c5
            long r5 = r1.longValue()
            r36 = r5
            goto L_0x04c7
        L_0x04c5:
            r36 = r20
        L_0x04c7:
            java.util.Map r1 = r11.getMembers()
            java.lang.Object r1 = r1.get(r7)
            if (r1 == 0) goto L_0x04d6
            java.lang.Long r1 = bxb.c(r1)
            goto L_0x04d7
        L_0x04d6:
            r1 = 0
        L_0x04d7:
            if (r1 == 0) goto L_0x04e0
            long r5 = r1.longValue()
            r38 = r5
            goto L_0x04e2
        L_0x04e0:
            r38 = r20
        L_0x04e2:
            java.util.Map r1 = r11.getMembers()
            java.lang.Object r1 = r1.get(r4)
            if (r1 == 0) goto L_0x04f1
            java.lang.Long r1 = bxb.c(r1)
            goto L_0x04f2
        L_0x04f1:
            r1 = 0
        L_0x04f2:
            if (r1 == 0) goto L_0x04fb
            long r4 = r1.longValue()
            r40 = r4
            goto L_0x04fd
        L_0x04fb:
            r40 = r20
        L_0x04fd:
            java.util.Map r1 = r11.getMembers()
            java.lang.String r4 = "framesEncoded"
            java.lang.Object r1 = r1.get(r4)
            if (r1 == 0) goto L_0x050e
            java.lang.Long r1 = bxb.c(r1)
            goto L_0x050f
        L_0x050e:
            r1 = 0
        L_0x050f:
            if (r1 == 0) goto L_0x0515
            long r20 = r1.longValue()
        L_0x0515:
            r42 = r20
            java.util.Map r1 = r11.getMembers()
            java.lang.Object r1 = r1.get(r8)
            if (r1 == 0) goto L_0x0526
            java.lang.Long r1 = bxb.c(r1)
            goto L_0x0527
        L_0x0526:
            r1 = 0
        L_0x0527:
            if (r1 == 0) goto L_0x0530
            long r4 = r1.longValue()
            r50 = r4
            goto L_0x0532
        L_0x0530:
            r50 = r27
        L_0x0532:
            java.util.Map r1 = r11.getMembers()
            java.lang.Object r1 = r1.get(r3)
            if (r1 == 0) goto L_0x0541
            java.lang.Long r1 = bxb.c(r1)
            goto L_0x0542
        L_0x0541:
            r1 = 0
        L_0x0542:
            if (r1 == 0) goto L_0x0548
            long r27 = r1.longValue()
        L_0x0548:
            r48 = r27
            java.util.Map r1 = r2.getStatsMap()
            java.util.Map r3 = r11.getMembers()
            java.lang.Object r3 = r3.get(r14)
            java.lang.Object r1 = r1.get(r3)
            org.webrtc.RTCStats r1 = (org.webrtc.RTCStats) r1
            if (r1 == 0) goto L_0x0565
            java.math.BigInteger r1 = bxb.f(r1)
            r34 = r1
            goto L_0x0567
        L_0x0565:
            r34 = 0
        L_0x0567:
            java.util.Map r1 = r2.getStatsMap()
            java.util.Map r3 = r11.getMembers()
            java.lang.Object r3 = r3.get(r13)
            java.lang.Object r1 = r1.get(r3)
            org.webrtc.RTCStats r1 = (org.webrtc.RTCStats) r1
            if (r1 != 0) goto L_0x057c
            goto L_0x05ba
        L_0x057c:
            java.lang.String r1 = bxb.h(r1)
            if (r1 != 0) goto L_0x0583
            goto L_0x05ba
        L_0x0583:
            w4g r53 = i(r11, r2)
            java.lang.Object r3 = r0.c
            hl7 r3 = (hl7) r3
            if (r3 == 0) goto L_0x05aa
            jl7 r3 = r3.a
            java.lang.String r4 = r3.k
            boolean r4 = r1.equals(r4)
            java.lang.String r3 = r3.l
            boolean r3 = r1.equals(r3)
            if (r4 != 0) goto L_0x05a2
            if (r3 == 0) goto L_0x05a0
            goto L_0x05a2
        L_0x05a0:
            r12 = 0
            goto L_0x05a3
        L_0x05a2:
            r12 = 1
        L_0x05a3:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r12)
            r54 = r14
            goto L_0x05ac
        L_0x05aa:
            r54 = 0
        L_0x05ac:
            dod r14 = new dod
            r29 = r14
            r44 = -1
            r46 = -1
            r52 = r1
            r29.<init>(r30, r32, r33, r34, r35, r36, r38, r40, r42, r44, r46, r48, r50, r52, r53, r54)
            goto L_0x05bb
        L_0x05ba:
            r14 = 0
        L_0x05bb:
            if (r14 == 0) goto L_0x0608
            boolean r1 = r14 instanceof dod
            r8 = r18
            if (r1 == 0) goto L_0x05f5
            r1 = -1
            if (r8 != r1) goto L_0x05da
            r3 = r14
            dod r3 = (dod) r3
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            java.lang.Boolean r3 = r3.k
            boolean r3 = defpackage.hhd.f(r3, r4)
            if (r3 == 0) goto L_0x05da
            int r10 = r26.size()
        L_0x05d7:
            r3 = r25
            goto L_0x05dc
        L_0x05da:
            r10 = r8
            goto L_0x05d7
        L_0x05dc:
            if (r3 != r1) goto L_0x05f3
            r1 = r14
            dod r1 = (dod) r1
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            java.lang.Boolean r1 = r1.k
            boolean r1 = defpackage.hhd.f(r1, r4)
            if (r1 == 0) goto L_0x05f3
            int r1 = r26.size()
            r9 = r1
        L_0x05f0:
            r5 = r26
            goto L_0x05fa
        L_0x05f3:
            r9 = r3
            goto L_0x05f0
        L_0x05f5:
            r3 = r25
            r9 = r3
            r10 = r8
            goto L_0x05f0
        L_0x05fa:
            r5.add(r14)
            r6 = r5
            r1 = r16
            r5 = r17
            r3 = r22
            r7 = r24
            goto L_0x0028
        L_0x0608:
            r8 = r18
            r3 = r25
            r9 = r3
            r10 = r8
            r1 = r16
            r5 = r17
            r3 = r22
            r7 = r24
            r6 = r26
            goto L_0x0028
        L_0x061a:
            r22 = r3
            r17 = r5
            r5 = r6
            r24 = r7
            r3 = r9
            r8 = r10
            if (r3 >= r8) goto L_0x0638
            r1 = -1
            if (r3 == r1) goto L_0x0638
            java.lang.Object r1 = r5.get(r8)
            eod r1 = (eod) r1
            java.lang.Object r4 = r5.get(r3)
            r5.set(r8, r4)
            r5.set(r3, r1)
        L_0x0638:
            int r1 = r5.size()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = " ssrcs parsed"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.Object r0 = r0.b
            xwb r0 = (xwb) r0
            java.lang.String r3 = "WebRTCToInternalStatsMapper"
            r0.log(r3, r1)
            java.util.Map r1 = r2.getStatsMap()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0667:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0866
            java.lang.Object r4 = r1.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r4 = r4.getValue()
            org.webrtc.RTCStats r4 = (org.webrtc.RTCStats) r4
            java.lang.String r7 = r4.getType()
            java.lang.String r8 = "candidate-pair"
            boolean r7 = defpackage.hhd.f(r7, r8)
            if (r7 != 0) goto L_0x0686
            goto L_0x0667
        L_0x0686:
            k77[] r7 = bxb.a
            java.util.Map r7 = r2.getStatsMap()
            java.util.Map r8 = r4.getMembers()
            java.lang.String r9 = "localCandidateId"
            java.lang.Object r8 = r8.get(r9)
            java.lang.Object r7 = r7.get(r8)
            org.webrtc.RTCStats r7 = (org.webrtc.RTCStats) r7
            if (r7 != 0) goto L_0x06a2
        L_0x069e:
            r12 = 1
            goto L_0x079c
        L_0x06a2:
            java.util.Map r8 = r2.getStatsMap()
            java.util.Map r9 = r4.getMembers()
            java.lang.String r10 = "remoteCandidateId"
            java.lang.Object r9 = r9.get(r10)
            java.lang.Object r8 = r8.get(r9)
            org.webrtc.RTCStats r8 = (org.webrtc.RTCStats) r8
            if (r8 != 0) goto L_0x06b9
            goto L_0x069e
        L_0x06b9:
            java.util.Map r9 = r7.getMembers()
            java.lang.String r10 = "candidateType"
            java.lang.Object r9 = r9.get(r10)
            if (r9 == 0) goto L_0x06cc
            java.lang.String r9 = r9.toString()
            r26 = r9
            goto L_0x06ce
        L_0x06cc:
            r26 = 0
        L_0x06ce:
            java.lang.String r9 = "protocol"
            java.lang.String r11 = "address"
            if (r26 != 0) goto L_0x06d5
            goto L_0x0707
        L_0x06d5:
            java.lang.String r27 = bxb.d(r7)
            if (r27 != 0) goto L_0x06dc
            goto L_0x0707
        L_0x06dc:
            java.util.Map r12 = r7.getMembers()
            java.lang.Object r12 = r12.get(r11)
            if (r12 == 0) goto L_0x06ed
            java.lang.String r12 = r12.toString()
            r28 = r12
            goto L_0x06ef
        L_0x06ed:
            r28 = 0
        L_0x06ef:
            if (r28 != 0) goto L_0x06f2
            goto L_0x0707
        L_0x06f2:
            java.util.Map r7 = r7.getMembers()
            java.lang.Object r7 = r7.get(r9)
            if (r7 == 0) goto L_0x0703
            java.lang.String r7 = r7.toString()
            r29 = r7
            goto L_0x0705
        L_0x0703:
            r29 = 0
        L_0x0705:
            if (r29 != 0) goto L_0x0709
        L_0x0707:
            r7 = 0
            goto L_0x0712
        L_0x0709:
            b0d r7 = new b0d
            r30 = 17
            r25 = r7
            r25.<init>(r26, r27, r28, r29, r30)
        L_0x0712:
            if (r7 != 0) goto L_0x0715
            goto L_0x069e
        L_0x0715:
            java.util.Map r12 = r8.getMembers()
            java.lang.Object r10 = r12.get(r10)
            if (r10 == 0) goto L_0x0726
            java.lang.String r10 = r10.toString()
            r26 = r10
            goto L_0x0728
        L_0x0726:
            r26 = 0
        L_0x0728:
            if (r26 != 0) goto L_0x072b
            goto L_0x075d
        L_0x072b:
            java.lang.String r27 = bxb.d(r8)
            if (r27 != 0) goto L_0x0732
            goto L_0x075d
        L_0x0732:
            java.util.Map r10 = r8.getMembers()
            java.lang.Object r10 = r10.get(r11)
            if (r10 == 0) goto L_0x0743
            java.lang.String r10 = r10.toString()
            r28 = r10
            goto L_0x0745
        L_0x0743:
            r28 = 0
        L_0x0745:
            if (r28 != 0) goto L_0x0748
            goto L_0x075d
        L_0x0748:
            java.util.Map r8 = r8.getMembers()
            java.lang.Object r8 = r8.get(r9)
            if (r8 == 0) goto L_0x0759
            java.lang.String r8 = r8.toString()
            r29 = r8
            goto L_0x075b
        L_0x0759:
            r29 = 0
        L_0x075b:
            if (r29 != 0) goto L_0x075f
        L_0x075d:
            r8 = 0
            goto L_0x0768
        L_0x075f:
            b0d r8 = new b0d
            r30 = 17
            r25 = r8
            r25.<init>(r26, r27, r28, r29, r30)
        L_0x0768:
            if (r8 != 0) goto L_0x076c
            goto L_0x069e
        L_0x076c:
            java.util.Map r9 = r4.getMembers()
            java.lang.String r10 = "currentRoundTripTime"
            java.lang.Object r9 = r9.get(r10)
            if (r9 == 0) goto L_0x077d
            java.lang.Double r9 = bxb.b(r9)
            goto L_0x077e
        L_0x077d:
            r9 = 0
        L_0x077e:
            if (r9 == 0) goto L_0x0793
            double r9 = r9.doubleValue()
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS
            r12 = 1
            long r14 = r11.toMillis(r12)
            double r14 = (double) r14
            double r9 = r9 * r14
            java.lang.Double r9 = java.lang.Double.valueOf(r9)
            goto L_0x0796
        L_0x0793:
            r12 = 1
            r9 = 0
        L_0x0796:
            java.lang.String r35 = bxb.i(r4)
            if (r35 != 0) goto L_0x079f
        L_0x079c:
            r10 = 0
            goto L_0x085f
        L_0x079f:
            java.util.Map r10 = r2.getStatsMap()
            java.util.ArrayList r11 = new java.util.ArrayList
            int r14 = r10.size()
            r11.<init>(r14)
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L_0x07b4:
            boolean r14 = r10.hasNext()
            if (r14 == 0) goto L_0x07ca
            java.lang.Object r14 = r10.next()
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14
            java.lang.Object r14 = r14.getValue()
            org.webrtc.RTCStats r14 = (org.webrtc.RTCStats) r14
            r11.add(r14)
            goto L_0x07b4
        L_0x07ca:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r11 = r11.iterator()
        L_0x07d3:
            boolean r14 = r11.hasNext()
            if (r14 == 0) goto L_0x07f2
            java.lang.Object r14 = r11.next()
            r15 = r14
            org.webrtc.RTCStats r15 = (org.webrtc.RTCStats) r15
            java.lang.String r15 = r15.getType()
            java.lang.String r12 = "transport"
            boolean r12 = defpackage.hhd.f(r15, r12)
            if (r12 == 0) goto L_0x07ef
            r10.add(r14)
        L_0x07ef:
            r12 = 1
            goto L_0x07d3
        L_0x07f2:
            boolean r11 = r10.isEmpty()
            if (r11 == 0) goto L_0x07f9
            goto L_0x0824
        L_0x07f9:
            java.util.Iterator r10 = r10.iterator()
        L_0x07fd:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0824
            java.lang.Object r11 = r10.next()
            org.webrtc.RTCStats r11 = (org.webrtc.RTCStats) r11
            java.lang.String r12 = "selectedCandidatePairId"
            java.lang.Object r11 = defpackage.xs7.b(r11, r12)
            if (r11 == 0) goto L_0x0816
            java.lang.String r11 = r11.toString()
            goto L_0x0817
        L_0x0816:
            r11 = 0
        L_0x0817:
            java.lang.String r12 = r4.getId()
            boolean r11 = defpackage.hhd.f(r11, r12)
            if (r11 == 0) goto L_0x07fd
            r36 = 1
            goto L_0x0826
        L_0x0824:
            r36 = 0
        L_0x0826:
            iw1 r10 = new iw1
            java.lang.String r26 = r4.getId()
            java.lang.String r33 = java.lang.String.valueOf(r9)
            java.lang.Object r4 = r8.b
            r30 = r4
            java.lang.String r30 = (java.lang.String) r30
            java.lang.Object r4 = r8.c
            r31 = r4
            java.lang.String r31 = (java.lang.String) r31
            java.lang.Object r4 = r7.b
            r27 = r4
            java.lang.String r27 = (java.lang.String) r27
            java.lang.Object r4 = r7.c
            r28 = r4
            java.lang.String r28 = (java.lang.String) r28
            java.lang.Object r4 = r7.o
            r29 = r4
            java.lang.String r29 = (java.lang.String) r29
            java.lang.Object r4 = r8.o
            r32 = r4
            java.lang.String r32 = (java.lang.String) r32
            java.lang.Object r4 = r7.X
            r34 = r4
            java.lang.String r34 = (java.lang.String) r34
            r25 = r10
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
        L_0x085f:
            if (r10 == 0) goto L_0x0667
            r6.add(r10)
            goto L_0x0667
        L_0x0866:
            int r1 = r6.size()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = " candidatePairs parsed"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.log(r3, r1)
            r3 = 0
            r0 = r24
            r1 = r22
            r4 = r17
            r0.<init>(r1, r3, r4, r5, r6)
            return r24
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d4b.o(yrd):zwb");
    }

    public void onError(Throwable th) {
        switch (this.a) {
            case 3:
                ((zhd) this.c).onError(th);
                return;
            default:
                try {
                    ((lk0) ((o73) this.c).c).accept((Object) null, th);
                } catch (Throwable th2) {
                    ek8.a0(th2);
                    th = new CompositeException(th, th2);
                }
                ((zhd) this.b).onError(th);
                return;
        }
    }

    public void p(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (((Map) this.b)) {
            hashMap = new HashMap((Map) this.b);
        }
        synchronized (((Map) this.c)) {
            hashMap2 = new HashMap((Map) this.c);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).Z(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((vde) entry2.getKey()).c(new ApiException(status));
            }
        }
    }

    public List q(long j) {
        int e = mze.e(Long.valueOf(j), (List) this.c, false);
        return e == -1 ? Collections.emptyList() : (List) ((List) this.b).get(e);
    }

    public String toString() {
        switch (this.a) {
            case 10:
                Throwable th = (Throwable) this.c;
                String Q = th != null ? jjd.Q(th) : null;
                return "ThreadDump(threadsCount=" + ((Map) this.b) + ", allStackTraces=" + Q + ")";
            default:
                return super.toString();
        }
    }

    public int u() {
        return ((List) this.c).size();
    }

    public /* synthetic */ d4b(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public d4b() {
        this.a = 16;
        this.b = Collections.synchronizedMap(new WeakHashMap());
        this.c = Collections.synchronizedMap(new WeakHashMap());
    }

    public d4b(xwb xwb) {
        this.a = 15;
        this.b = xwb;
    }

    public d4b(Context context) {
        this.a = 8;
        a24.o(context);
        Resources resources = context.getResources();
        this.b = resources;
        this.c = resources.getResourcePackageName(fvb.common_google_play_services_unknown_issue);
    }

    public d4b(g4g g4g) {
        this.a = 17;
        this.c = new Handler(Looper.getMainLooper());
        this.b = g4g;
    }

    public d4b(t97 t97) {
        this.a = 12;
        t97 t972 = mqc.e;
        this.b = t97;
        this.c = t972;
    }

    public d4b(List list) {
        this.a = 4;
        this.b = list;
        this.c = new ape[list.size()];
    }

    public d4b(lse lse) {
        this.a = 11;
        this.c = lse;
        this.b = new wx1(new byte[4], 4, 1, (byte) 0);
    }
}
