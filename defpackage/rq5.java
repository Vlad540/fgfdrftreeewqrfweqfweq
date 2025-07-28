package defpackage;

import android.net.Uri;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;

/* renamed from: rq5  reason: default package */
public final class rq5 extends taf {
    public static final /* synthetic */ k77[] H0;
    public final t0c A0;
    public final l05 B0 = new l05(0);
    public final AtomicReference C0 = new AtomicReference(new LinkedHashSet());
    public final AtomicReference D0 = new AtomicReference(tq7.a());
    public volatile ep5 E0;
    public final e3 F0 = hwf.t();
    public final e3 G0 = hwf.t();
    public final v72 X;
    public final t97 Y;
    public final t97 Z;
    public final String b;
    public final long c;
    public final pae o;
    public final t97 w0;
    public final grd x0;
    public final t0c y0;
    public final grd z0;

    static {
        Class<rq5> cls = rq5.class;
        H0 = new k77[]{new hc9(cls, "addChatsClickJob", "getAddChatsClickJob()Lkotlinx/coroutines/Job;"), c3d.g(m7c.a, cls, "addChatsResultJob", "getAddChatsResultJob()Lkotlinx/coroutines/Job;")};
    }

    public rq5(String str, long j) {
        as5 as5 = as5.a;
        n3a n3a = (pae) as5.getAccessor().c(pae.class);
        as5.getAccessor().d(f03.class);
        r7e d = as5.getAccessor().d(ho2.class);
        r7e d2 = as5.getAccessor().d(bv2.class);
        r7e d3 = as5.getAccessor().d(v6a.class);
        as5.getAccessor().d(aw2.class);
        this.b = str;
        this.c = j;
        this.o = n3a;
        this.X = (v72) as5.getAccessor().c(v72.class);
        this.Y = d;
        this.Z = d2;
        this.w0 = d3;
        grd a = hrd.a(new bq5());
        this.x0 = a;
        this.y0 = new t0c(a);
        grd a2 = hrd.a(hw4.a);
        this.z0 = a2;
        this.A0 = new t0c(a2);
        if (str != null) {
            a.m((Object) null, new cq5(str, (CharSequence) null, 5));
            taf.n(this, n3a.b(), (ru3) null, new fq5(this, d3, d, (Continuation) null), 2);
            return;
        }
        a.m((Object) null, new bq5());
        if (j != 0) {
            taf.n(this, n3a.b(), (ru3) null, new gq5(this, d, (Continuation) null), 2);
            return;
        }
        a2.m((Object) null, p23.B(new wp5((lge) null, true), new sq5(2)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object q(defpackage.rq5 r16, java.util.Set r17, kotlin.coroutines.Continuation r18) {
        /*
            r0 = r16
            r1 = r18
            r16.getClass()
            boolean r2 = r1 instanceof defpackage.oq5
            if (r2 == 0) goto L_0x001a
            r2 = r1
            oq5 r2 = (defpackage.oq5) r2
            int r3 = r2.A0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x001a
            int r3 = r3 - r4
            r2.A0 = r3
            goto L_0x001f
        L_0x001a:
            oq5 r2 = new oq5
            r2.<init>(r0, r1)
        L_0x001f:
            java.lang.Object r1 = r2.y0
            pu3 r3 = defpackage.pu3.a
            int r4 = r2.A0
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L_0x0046
            if (r4 != r6) goto L_0x003e
            java.util.Iterator r0 = r2.x0
            bs r4 = r2.w0
            zb9 r7 = r2.Z
            java.util.Set r8 = r2.Y
            ep5 r9 = r2.X
            rq5 r10 = r2.o
            defpackage.wx3.H(r1)
            r15 = r10
            r10 = r0
            r0 = r15
            goto L_0x00a5
        L_0x003e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0046:
            defpackage.wx3.H(r1)
            ep5 r1 = r0.E0
            java.util.concurrent.atomic.AtomicReference r4 = r0.C0
            pb2 r7 = new pb2
            r8 = 3
            r7.<init>(r8)
            java.lang.Object r4 = r4.updateAndGet(r7)
            java.util.Set r4 = (java.util.Set) r4
            java.util.concurrent.atomic.AtomicReference r7 = r0.D0
            pb2 r8 = new pb2
            r9 = 4
            r8.<init>(r9)
            java.lang.Object r7 = r7.updateAndGet(r8)
            zb9 r7 = (defpackage.zb9) r7
            bs r8 = new bs
            r8.<init>((int) r5)
            java.util.Iterator r9 = r17.iterator()
            r15 = r8
            r8 = r4
            r4 = r15
        L_0x0073:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x00d4
            java.lang.Object r10 = r9.next()
            java.lang.Number r10 = (java.lang.Number) r10
            long r10 = r10.longValue()
            t97 r12 = r0.Z
            java.lang.Object r12 = r12.getValue()
            bv2 r12 = (bv2) r12
            r2.o = r0
            r2.X = r1
            r2.Y = r8
            r2.Z = r7
            r2.w0 = r4
            r2.x0 = r9
            r2.A0 = r6
            java.lang.Object r10 = r12.d(r10, r2)
            if (r10 != r3) goto L_0x00a1
            goto L_0x013b
        L_0x00a1:
            r15 = r9
            r9 = r1
            r1 = r10
            r10 = r15
        L_0x00a5:
            i22 r1 = (i22) r1
            o62 r11 = r1.b
            long r11 = r11.a
            java.lang.Long r13 = new java.lang.Long
            r13.<init>(r11)
            r4.add(r13)
            if (r9 == 0) goto L_0x00ce
            java.util.Set r11 = r9.z0
            boolean r11 = r11.isEmpty()
            if (r11 != 0) goto L_0x00ce
            java.util.Set r11 = r9.z0
            o62 r12 = r1.b
            long r12 = r12.a
            java.lang.Long r14 = new java.lang.Long
            r14.<init>(r12)
            boolean r11 = r11.contains(r14)
            if (r11 != 0) goto L_0x00d1
        L_0x00ce:
            r8.add(r1)
        L_0x00d1:
            r1 = r9
            r9 = r10
            goto L_0x0073
        L_0x00d4:
            if (r1 == 0) goto L_0x00fd
            java.util.Set r1 = r1.z0
            if (r1 == 0) goto L_0x00fd
            java.util.Iterator r1 = r1.iterator()
        L_0x00de:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00fd
            java.lang.Object r2 = r1.next()
            java.lang.Number r2 = (java.lang.Number) r2
            long r2 = r2.longValue()
            java.lang.Long r9 = new java.lang.Long
            r9.<init>(r2)
            boolean r9 = r4.contains(r9)
            if (r9 != 0) goto L_0x00de
            r7.a(r2)
            goto L_0x00de
        L_0x00fd:
            grd r1 = r0.x0
            java.lang.Object r1 = r1.getValue()
            boolean r1 = r1 instanceof defpackage.cq5
            if (r1 == 0) goto L_0x0139
            boolean r1 = r7.j()
            if (r1 != 0) goto L_0x0117
            boolean r1 = r8.isEmpty()
            r1 = r1 ^ r6
            if (r1 == 0) goto L_0x0115
            goto L_0x0117
        L_0x0115:
            r1 = r5
            goto L_0x0118
        L_0x0117:
            r1 = r6
        L_0x0118:
            grd r0 = r0.x0
        L_0x011a:
            java.lang.Object r2 = r0.getValue()
            r3 = r2
            dq5 r3 = (defpackage.dq5) r3
            cq5 r3 = (defpackage.cq5) r3
            if (r1 != 0) goto L_0x012c
            boolean r4 = r3.c
            if (r4 == 0) goto L_0x012a
            goto L_0x012c
        L_0x012a:
            r4 = r5
            goto L_0x012d
        L_0x012c:
            r4 = r6
        L_0x012d:
            r7 = 0
            r8 = 3
            cq5 r3 = defpackage.cq5.b(r3, r7, r4, r8)
            boolean r2 = r0.b(r2, r3)
            if (r2 == 0) goto L_0x011a
        L_0x0139:
            jue r3 = defpackage.jue.a
        L_0x013b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rq5.q(rq5, java.util.Set, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: java.util.Set} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: java.util.Set} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: java.util.Set} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: java.util.Set} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: java.util.Set} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: java.util.List} */
    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r6v12 */
    /* JADX WARNING: type inference failed for: r6v13, types: [kotlin.coroutines.Continuation, ju3] */
    /* JADX WARNING: type inference failed for: r6v20 */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01b7 A[EDGE_INSN: B:90:0x01b7->B:76:0x01b7 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01b2 A[SYNTHETIC] */
    public static final java.lang.Object r(defpackage.rq5 r25, kotlin.coroutines.Continuation r26) {
        /*
            r0 = r25
            r1 = r26
            boolean r2 = r1 instanceof defpackage.pq5
            if (r2 == 0) goto L_0x0017
            r2 = r1
            pq5 r2 = (defpackage.pq5) r2
            int r3 = r2.x0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.x0 = r3
            goto L_0x001c
        L_0x0017:
            pq5 r2 = new pq5
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.Z
            pu3 r3 = defpackage.pu3.a
            int r4 = r2.x0
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x003a
            if (r4 != r5) goto L_0x0032
            java.lang.Object r0 = r2.Y
            mc9 r4 = r2.X
            rq5 r7 = r2.o
            defpackage.wx3.H(r1)
            goto L_0x0092
        L_0x0032:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003a:
            defpackage.wx3.H(r1)
            grd r1 = r0.z0
            r4 = r1
        L_0x0040:
            java.lang.Object r1 = r4.getValue()
            r7 = r1
            java.util.List r7 = (java.util.List) r7
            ep5 r7 = r0.E0
            if (r7 == 0) goto L_0x00a5
            java.util.Set r7 = r7.z0
            if (r7 == 0) goto L_0x00a5
            hu3 r8 = r2.b
            kotlinx.coroutines.internal.ContextScope r8 = defpackage.n1g.a(r8)
            java.util.ArrayList r9 = new java.util.ArrayList
            r10 = 10
            int r10 = defpackage.q23.H(r7, r10)
            r9.<init>(r10)
            java.util.Iterator r7 = r7.iterator()
        L_0x0064:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x007c
            java.lang.Object r10 = r7.next()
            qq5 r11 = new qq5
            r11.<init>(r10, r6, r0)
            r10 = 3
            zc4 r10 = defpackage.xs7.d(r8, r6, r11, r10)
            r9.add(r10)
            goto L_0x0064
        L_0x007c:
            r2.o = r0
            r2.X = r4
            r2.Y = r1
            r2.x0 = r5
            java.lang.Object r7 = defpackage.lp.c(r9, r2)
            if (r7 != r3) goto L_0x008c
            goto L_0x01db
        L_0x008c:
            r24 = r7
            r7 = r0
            r0 = r1
            r1 = r24
        L_0x0092:
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x00a3
            java.util.List r1 = defpackage.o23.T(r1)
            r24 = r1
            r1 = r0
            r0 = r7
            r7 = r4
            r4 = r2
            r2 = r24
            goto L_0x00a8
        L_0x00a3:
            r1 = r0
            r0 = r7
        L_0x00a5:
            r7 = r4
            r4 = r2
            r2 = r6
        L_0x00a8:
            if (r2 != 0) goto L_0x00ac
            hw4 r2 = defpackage.hw4.a
        L_0x00ac:
            java.util.concurrent.atomic.AtomicReference r8 = r0.D0
            java.lang.Object r8 = r8.get()
            zb9 r8 = (defpackage.zb9) r8
            java.util.concurrent.atomic.AtomicReference r9 = r0.C0
            java.lang.Object r9 = r9.get()
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r2 = defpackage.o23.i0(r2, r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x00c9:
            boolean r10 = r2.hasNext()
            if (r10 == 0) goto L_0x00e4
            java.lang.Object r10 = r2.next()
            r11 = r10
            i22 r11 = (i22) r11
            o62 r11 = r11.b
            long r11 = r11.a
            boolean r11 = r8.d(r11)
            if (r11 != 0) goto L_0x00c9
            r9.add(r10)
            goto L_0x00c9
        L_0x00e4:
            lg7 r2 = defpackage.hwf.c()
            grd r8 = r0.x0
            java.lang.Object r8 = r8.getValue()
            dq5 r8 = (defpackage.dq5) r8
            java.lang.CharSequence r8 = r8.a()
            if (r8 != 0) goto L_0x00f8
            java.lang.String r8 = ""
        L_0x00f8:
            wp5 r10 = new wp5
            lge r11 = new lge
            r11.<init>(r8)
            ep5 r8 = r0.E0
            if (r8 == 0) goto L_0x0106
            java.util.Set r8 = r8.G0
            goto L_0x0107
        L_0x0106:
            r8 = r6
        L_0x0107:
            if (r8 != 0) goto L_0x010b
            qw4 r8 = defpackage.qw4.a
        L_0x010b:
            fr5 r12 = fr5.o
            boolean r8 = r8.contains(r12)
            r8 = r8 ^ r5
            r10.<init>(r11, r8)
            r2.add(r10)
            sq5 r8 = new sq5
            boolean r10 = r9.isEmpty()
            r10 = r10 ^ r5
            if (r10 == 0) goto L_0x0125
            r10 = 536870914(0x20000002, float:1.0842024E-19)
            goto L_0x0126
        L_0x0125:
            r10 = 2
        L_0x0126:
            r8.<init>(r10)
            r2.add(r8)
            java.util.Iterator r8 = r9.iterator()
            r10 = 0
            r11 = r10
        L_0x0132:
            boolean r12 = r8.hasNext()
            if (r12 == 0) goto L_0x01b7
            java.lang.Object r12 = r8.next()
            int r13 = r11 + 1
            if (r11 < 0) goto L_0x01b2
            i22 r12 = (i22) r12
            int r14 = r9.size()
            int r14 = r14 - r5
            if (r11 != r14) goto L_0x014f
            r11 = -2147483644(0xffffffff80000004, float:-5.6E-45)
        L_0x014c:
            r23 = r11
            goto L_0x0153
        L_0x014f:
            r11 = 1073741828(0x40000004, float:2.000001)
            goto L_0x014c
        L_0x0153:
            android.net.Uri r11 = t(r12)
            tq5 r15 = new tq5
            o62 r14 = r12.b
            r25 = r7
            long r6 = r14.a
            if (r11 == 0) goto L_0x0168
            java.lang.String r11 = r11.toString()
            r17 = r11
            goto L_0x016a
        L_0x0168:
            r17 = 0
        L_0x016a:
            t97 r11 = r0.Y
            java.lang.Object r11 = r11.getValue()
            ho2 r11 = (ho2) r11
            ma2 r11 = (defpackage.ma2) r11
            r11.getClass()
            r12.h0()
            java.lang.CharSequence r11 = r12.y0
            long r19 = r12.e()
            r12.i0()
            java.lang.CharSequence r14 = r12.B0
            boolean r16 = r12.U()
            if (r16 != 0) goto L_0x019c
            tf3 r12 = r12.k()
            if (r12 == 0) goto L_0x0198
            boolean r12 = r12.u()
            if (r12 != r5) goto L_0x0198
            goto L_0x019c
        L_0x0198:
            r22 = r10
        L_0x019a:
            r12 = r14
            goto L_0x019f
        L_0x019c:
            r22 = r5
            goto L_0x019a
        L_0x019f:
            r14 = r15
            r5 = r15
            r15 = r6
            r18 = r11
            r21 = r12
            r14.<init>(r15, r17, r18, r19, r21, r22, r23)
            r2.add(r5)
            r7 = r25
            r11 = r13
            r5 = 1
            r6 = 0
            goto L_0x0132
        L_0x01b2:
            defpackage.p23.G()
            r5 = 0
            throw r5
        L_0x01b7:
            r5 = r6
            r25 = r7
            ep5 r6 = r0.E0
            if (r6 == 0) goto L_0x01cd
            java.util.Set r6 = r6.G0
            fr5 r7 = fr5.c
            boolean r6 = r6.contains(r7)
            if (r6 != 0) goto L_0x01cd
            pp5 r6 = defpackage.pp5.a
            r2.add(r6)
        L_0x01cd:
            lg7 r2 = defpackage.hwf.a(r2)
            r6 = r25
            boolean r1 = r6.b(r1, r2)
            if (r1 == 0) goto L_0x01dc
            jue r3 = defpackage.jue.a
        L_0x01db:
            return r3
        L_0x01dc:
            r2 = r4
            r4 = r6
            r6 = r5
            r5 = 1
            goto L_0x0040
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rq5.r(rq5, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static Uri t(i22 i22) {
        String f = i22.f(fj0.b, ej0.a);
        if (f == null) {
            return null;
        }
        if (h0e.c0(f)) {
            f = null;
        }
        if (f != null) {
            return at7.x(f);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void s(long r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            java.util.concurrent.atomic.AtomicReference r3 = r0.C0
            java.lang.Object r3 = r3.get()
            java.util.Set r3 = (java.util.Set) r3
            boolean r4 = r3 instanceof java.util.Collection
            if (r4 == 0) goto L_0x0017
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x0017
            goto L_0x003f
        L_0x0017:
            java.util.Iterator r4 = r3.iterator()
        L_0x001b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x003f
            java.lang.Object r5 = r4.next()
            i22 r5 = (i22) r5
            o62 r5 = r5.b
            long r5 = r5.a
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x001b
            je2 r4 = new je2
            r5 = 2
            r4.<init>(r1, r5)
            eq5 r5 = new eq5
            r6 = 0
            r5.<init>(r6, r4)
            r3.removeIf(r5)
            goto L_0x004a
        L_0x003f:
            java.util.concurrent.atomic.AtomicReference r3 = r0.D0
            java.lang.Object r3 = r3.get()
            zb9 r3 = (defpackage.zb9) r3
            r3.a(r1)
        L_0x004a:
            grd r3 = r0.z0
        L_0x004c:
            java.lang.Object r4 = r3.getValue()
            r5 = r4
            java.util.List r5 = (java.util.List) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x005c:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x007a
            java.lang.Object r7 = r5.next()
            r8 = r7
            pg7 r8 = (pg7) r8
            boolean r9 = r8 instanceof defpackage.tq5
            if (r9 == 0) goto L_0x0076
            tq5 r8 = (defpackage.tq5) r8
            long r8 = r8.a
            int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r8 != 0) goto L_0x0076
            goto L_0x005c
        L_0x0076:
            r6.add(r7)
            goto L_0x005c
        L_0x007a:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r6)
            int r6 = r5.size()
            java.util.ListIterator r6 = r5.listIterator(r6)
        L_0x0087:
            boolean r7 = r6.hasPrevious()
            if (r7 == 0) goto L_0x012e
            java.lang.Object r7 = r6.previous()
            pg7 r7 = (pg7) r7
            boolean r8 = r7 instanceof defpackage.pp5
            r9 = 1
            r8 = r8 ^ r9
            if (r8 == 0) goto L_0x0087
            int r6 = r5.lastIndexOf(r7)
            int r8 = r7.l()
            r10 = 1073741824(0x40000000, float:2.0)
            r10 = r10 & r8
            if (r10 == 0) goto L_0x00ce
            boolean r10 = r7 instanceof defpackage.tq5
            if (r10 == 0) goto L_0x00ce
            tq5 r7 = (defpackage.tq5) r7
            tq5 r8 = new tq5
            long r11 = r7.a
            java.lang.String r13 = r7.b
            java.lang.CharSequence r14 = r7.c
            long r9 = r7.o
            java.lang.CharSequence r15 = r7.X
            boolean r7 = r7.Y
            r19 = -2147483644(0xffffffff80000004, float:-5.6E-45)
            r16 = r9
            r10 = r8
            r9 = r15
            r15 = r16
            r17 = r9
            r18 = r7
            r10.<init>(r11, r13, r14, r15, r17, r18, r19)
            r5.set(r6, r8)
            goto L_0x00e2
        L_0x00ce:
            r9 = 536870912(0x20000000, float:1.0842022E-19)
            r8 = r8 & r9
            if (r8 == 0) goto L_0x00e2
            boolean r8 = r7 instanceof defpackage.sq5
            if (r8 == 0) goto L_0x00e2
            sq5 r7 = (defpackage.sq5) r7
            sq5 r7 = new sq5
            r8 = 2
            r7.<init>(r8)
            r5.set(r6, r7)
        L_0x00e2:
            boolean r4 = r3.b(r4, r5)
            if (r4 == 0) goto L_0x004c
            ep5 r3 = r0.E0
            r4 = 0
            if (r3 == 0) goto L_0x0100
            java.util.Set r3 = r3.z0
            if (r3 == 0) goto L_0x0100
            java.lang.Long r1 = java.lang.Long.valueOf(r21)
            boolean r1 = r3.contains(r1)
            r2 = 1
            if (r1 != r2) goto L_0x00fe
            r1 = r2
            goto L_0x0102
        L_0x00fe:
            r1 = r4
            goto L_0x0102
        L_0x0100:
            r2 = 1
            goto L_0x00fe
        L_0x0102:
            grd r3 = r0.x0
            java.lang.Object r3 = r3.getValue()
            boolean r3 = r3 instanceof defpackage.cq5
            if (r3 == 0) goto L_0x012d
            grd r0 = r0.x0
        L_0x010e:
            java.lang.Object r3 = r0.getValue()
            r5 = r3
            dq5 r5 = (defpackage.dq5) r5
            cq5 r5 = (defpackage.cq5) r5
            if (r1 != 0) goto L_0x0120
            boolean r6 = r5.c
            if (r6 == 0) goto L_0x011e
            goto L_0x0120
        L_0x011e:
            r6 = r4
            goto L_0x0121
        L_0x0120:
            r6 = r2
        L_0x0121:
            r7 = 3
            r8 = 0
            cq5 r5 = defpackage.cq5.b(r5, r8, r6, r7)
            boolean r3 = r0.b(r3, r5)
            if (r3 == 0) goto L_0x010e
        L_0x012d:
            return
        L_0x012e:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "List contains no element matching the predicate."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rq5.s(long):void");
    }

    public final void u() {
        taf.n(this, this.o.b(), (ru3) null, new nq5((dq5) this.y0.a.getValue(), this, (Continuation) null), 2);
    }
}
