package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;
import ru.ok.tamtam.logout.a;

/* renamed from: kr2  reason: default package */
public final class kr2 implements fh6 {
    public final zt3 A0 = new zt3();
    public final grd B0 = hrd.a(hq2.c);
    public final ir2 C0 = new ir2(this);
    public final String D0;
    public final ContextScope E0;
    public final s30 F0;
    public final rj3 X;
    public final a Y;
    public final t97 Z;
    public final jh6 a;
    public final pae b;
    public final ku3 c;
    public final xg0 o;
    public final t97 w0;
    public final t97 x0;
    public final AtomicBoolean y0 = new AtomicBoolean(true);
    public final AtomicBoolean z0 = new AtomicBoolean(false);

    /* JADX WARNING: type inference failed for: r4v2, types: [s30, java.lang.Object] */
    public kr2(String str, r7e r7e, jh6 jh6, r7e r7e2, pae pae, ku3 ku3, ip5 ip5, rj3 rj3, a aVar, t97 t97) {
        this.a = jh6;
        this.b = pae;
        this.c = ku3;
        this.o = ip5;
        this.X = rj3;
        this.Y = aVar;
        this.Z = r7e;
        this.w0 = r7e2;
        this.x0 = t97;
        String concat = kr2.class.getName().concat(str.replace('.', '_'));
        this.D0 = concat;
        ContextScope a2 = n1g.a(((n3a) pae).a().plus(ku3));
        this.E0 = a2;
        String concat2 = "chats-list-job-executor#".concat(str);
        vg0 vg0 = new vg0(6);
        ? obj = new Object();
        obj.a = a2;
        obj.c = concat2;
        obj.b = vg0;
        obj.o = icd.a(1, Integer.MAX_VALUE, 2);
        obj.X = new ConcurrentHashMap();
        obj.Y = new AtomicInteger(0);
        vg0.invoke(concat2, "init " + obj);
        this.F0 = obj;
        udd.p(concat, "init " + this, new Object[0]);
        ez3.N(new ck5((hcd) obj.o, new z37(obj, new sq2(this, (Continuation) null), (Continuation) null), 5), a2);
    }

    /* JADX WARNING: type inference failed for: r10v7, types: [bs, java.util.List] */
    /* JADX WARNING: type inference failed for: r10v9 */
    /* JADX WARNING: type inference failed for: r10v10 */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02ca  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02d2  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x02e7  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0305  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x013e A[LOOP:2: B:45:0x0138->B:47:0x013e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0202 A[LOOP:5: B:75:0x01fc->B:77:0x0202, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(defpackage.kr2 r16, bq2 r17, kotlin.coroutines.Continuation r18) {
        /*
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = 1
            r16.getClass()
            boolean r4 = r2 instanceof defpackage.tq2
            if (r4 == 0) goto L_0x001d
            r4 = r2
            tq2 r4 = (defpackage.tq2) r4
            int r5 = r4.y0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001d
            int r5 = r5 - r6
            r4.y0 = r5
            goto L_0x0022
        L_0x001d:
            tq2 r4 = new tq2
            r4.<init>(r0, r2)
        L_0x0022:
            java.lang.Object r2 = r4.w0
            pu3 r5 = defpackage.pu3.a
            int r6 = r4.y0
            jue r7 = defpackage.jue.a
            r8 = 0
            r9 = 0
            r10 = 3
            r11 = 2
            if (r6 == 0) goto L_0x0061
            if (r6 == r3) goto L_0x005d
            if (r6 == r11) goto L_0x0049
            if (r6 != r10) goto L_0x0041
            java.lang.Object r0 = r4.X
            bs r0 = (defpackage.bs) r0
            kr2 r1 = r4.o
            defpackage.wx3.H(r2)
            goto L_0x02fb
        L_0x0041:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0049:
            bs r0 = r4.Z
            java.util.List r1 = r4.Y
            java.lang.Object r6 = r4.X
            bq2 r6 = (bq2) r6
            kr2 r11 = r4.o
            defpackage.wx3.H(r2)
            r10 = r2
            r2 = r1
            r1 = r6
            r6 = r0
            r0 = r11
            goto L_0x00e4
        L_0x005d:
            defpackage.wx3.H(r2)
            goto L_0x00a5
        L_0x0061:
            defpackage.wx3.H(r2)
            java.lang.String r2 = r0.D0
            fn6 r6 = defpackage.udd.e
            if (r6 != 0) goto L_0x006b
            goto L_0x008b
        L_0x006b:
            boolean r12 = r6.c()
            if (r12 == 0) goto L_0x008b
            tn7 r12 = tn7.X
            java.util.Set r13 = r1.c
            int r13 = r13.size()
            jh6 r14 = r0.a
            zt3 r14 = r14.h
            java.lang.Object[] r14 = r14.b
            int r14 = r14.length
            java.lang.String r15 = "handleChatsUpdate start "
            java.lang.String r10 = ", history = "
            java.lang.String r10 = me4.g(r15, r13, r14, r10)
            r6.d(r12, r2, r10, r9)
        L_0x008b:
            grd r2 = r0.B0
            java.lang.Object r2 = r2.getValue()
            hq2 r2 = (defpackage.hq2) r2
            java.util.List r2 = r2.a
            boolean r6 = r2.isEmpty()
            if (r6 == 0) goto L_0x00a8
            r4.y0 = r3
            java.lang.Object r0 = r0.d(r4)
            if (r0 != r5) goto L_0x00a5
            goto L_0x032d
        L_0x00a5:
            r5 = r7
            goto L_0x032d
        L_0x00a8:
            bs r6 = new bs
            r6.<init>((int) r8)
            java.util.Iterator r10 = r2.iterator()
        L_0x00b1:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L_0x00c8
            java.lang.Object r12 = r10.next()
            pi2 r12 = (defpackage.pi2) r12
            long r12 = r12.a
            java.lang.Long r14 = new java.lang.Long
            r14.<init>(r12)
            r6.add(r14)
            goto L_0x00b1
        L_0x00c8:
            java.util.Set r10 = r1.a
            t97 r12 = r0.w0
            java.lang.Object r12 = r12.getValue()
            aq2 r12 = (defpackage.aq2) r12
            r4.o = r0
            r4.X = r1
            r4.Y = r2
            r4.Z = r6
            r4.y0 = r11
            java.io.Serializable r10 = r12.a(r10, r4)
            if (r10 != r5) goto L_0x00e4
            goto L_0x032d
        L_0x00e4:
            java.util.List r10 = (java.util.List) r10
            java.lang.String r11 = r0.D0
            fn6 r12 = defpackage.udd.e
            if (r12 != 0) goto L_0x00ed
            goto L_0x0105
        L_0x00ed:
            boolean r13 = r12.c()
            if (r13 == 0) goto L_0x0105
            tn7 r13 = tn7.X
            jh6 r14 = r0.a
            zt3 r14 = r14.h
            java.lang.Object[] r14 = r14.b
            int r14 = r14.length
            java.lang.String r15 = "handleChatsUpdate step 1; history = "
            java.lang.String r14 = wn6.h(r14, r15)
            r12.d(r13, r11, r14, r9)
        L_0x0105:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r12 = r10.iterator()
        L_0x010e:
            boolean r13 = r12.hasNext()
            r14 = 0
            if (r13 == 0) goto L_0x012d
            java.lang.Object r13 = r12.next()
            r3 = r13
            pi2 r3 = (defpackage.pi2) r3
            r16 = r10
            long r9 = r3.F0
            int r3 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r3 != 0) goto L_0x0128
            r11.add(r13)
        L_0x0128:
            r10 = r16
            r3 = 1
            r9 = 0
            goto L_0x010e
        L_0x012d:
            r16 = r10
            bs r3 = new bs
            r3.<init>((int) r8)
            java.util.Iterator r9 = r11.iterator()
        L_0x0138:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x014f
            java.lang.Object r10 = r9.next()
            pi2 r10 = (defpackage.pi2) r10
            long r12 = r10.a
            java.lang.Long r10 = new java.lang.Long
            r10.<init>(r12)
            r3.add(r10)
            goto L_0x0138
        L_0x014f:
            java.util.Set r1 = r1.a
            java.util.Set r1 = defpackage.z3d.F(r3, r1)
            r6.retainAll(r1)
            jh6 r1 = r0.a
            r1.c(r6)
            zb9 r1 = new zb9
            int r3 = r2.size()
            r1.<init>((int) r3)
            java.util.Iterator r3 = r2.iterator()
        L_0x016a:
            boolean r9 = r3.hasNext()
            if (r9 == 0) goto L_0x0182
            java.lang.Object r9 = r3.next()
            pi2 r9 = (defpackage.pi2) r9
            long r12 = r9.F0
            int r10 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r10 != 0) goto L_0x016a
            long r9 = r9.a
            r1.a(r9)
            goto L_0x016a
        L_0x0182:
            java.lang.String r3 = r0.D0
            fn6 r9 = defpackage.udd.e
            if (r9 != 0) goto L_0x0189
            goto L_0x01a2
        L_0x0189:
            boolean r10 = r9.c()
            if (r10 == 0) goto L_0x01a2
            tn7 r10 = tn7.X
            jh6 r12 = r0.a
            zt3 r12 = r12.h
            java.lang.Object[] r12 = r12.b
            int r12 = r12.length
            java.lang.String r13 = "handleChatsUpdate step 2; history = "
            java.lang.String r12 = wn6.h(r12, r13)
            r13 = 0
            r9.d(r10, r3, r12, r13)
        L_0x01a2:
            java.util.Iterator r3 = r11.iterator()
            r9 = r8
            r10 = r9
        L_0x01a8:
            boolean r11 = r3.hasNext()
            if (r11 == 0) goto L_0x01d6
            java.lang.Object r11 = r3.next()
            pi2 r11 = (defpackage.pi2) r11
            long r12 = r11.a
            boolean r12 = r1.d(r12)
            if (r12 == 0) goto L_0x01c4
            r12 = 1
            int r10 = r10 + r12
            jh6 r13 = r0.a
            r13.r(r11)
            goto L_0x01d3
        L_0x01c4:
            r12 = 1
            long r14 = r11.a
            boolean r13 = r1.d(r14)
            if (r13 != 0) goto L_0x01d3
            int r9 = r9 + r12
            jh6 r12 = r0.a
            r12.b(r11)
        L_0x01d3:
            r14 = 0
            goto L_0x01a8
        L_0x01d6:
            java.lang.String r1 = r0.D0
            fn6 r3 = defpackage.udd.e
            if (r3 != 0) goto L_0x01dd
            goto L_0x01f1
        L_0x01dd:
            boolean r11 = r3.c()
            if (r11 == 0) goto L_0x01f1
            tn7 r11 = tn7.X
            java.lang.String r12 = "handleChatsUpdate step 3: insert="
            java.lang.String r13 = ", update="
            java.lang.String r9 = me4.g(r12, r9, r10, r13)
            r10 = 0
            r3.d(r11, r1, r9, r10)
        L_0x01f1:
            yb9 r1 = defpackage.pq7.a
            yb9 r1 = new yb9
            r1.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x01fc:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x020e
            java.lang.Object r3 = r2.next()
            pi2 r3 = (defpackage.pi2) r3
            long r9 = r3.a
            r1.e(r9, r3)
            goto L_0x01fc
        L_0x020e:
            bs r2 = new bs
            r2.<init>((int) r8)
            boolean r3 = r6.isEmpty()
            r9 = 1
            r3 = r3 ^ r9
            if (r3 == 0) goto L_0x0252
            zt3 r3 = r0.A0
            boolean r9 = r3 instanceof java.util.Collection
            if (r9 == 0) goto L_0x0228
            boolean r9 = r3.isEmpty()
            if (r9 == 0) goto L_0x0228
            goto L_0x0252
        L_0x0228:
            java.util.Iterator r3 = r3.iterator()
        L_0x022c:
            r9 = r3
            wt3 r9 = (wt3) r9
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0252
            java.lang.Object r9 = r9.next()
            pi2 r9 = (defpackage.pi2) r9
            long r9 = r9.a
            java.lang.Long r11 = new java.lang.Long
            r11.<init>(r9)
            boolean r9 = r6.contains(r11)
            if (r9 == 0) goto L_0x022c
            r9 = 1
            int r8 = r8 + r9
            if (r8 < 0) goto L_0x024d
            goto L_0x022c
        L_0x024d:
            defpackage.p23.F()
            r0 = 0
            throw r0
        L_0x0252:
            java.lang.String r3 = r0.D0
            fn6 r6 = defpackage.udd.e
            if (r6 != 0) goto L_0x0259
            goto L_0x0272
        L_0x0259:
            boolean r9 = r6.c()
            if (r9 == 0) goto L_0x0272
            tn7 r9 = tn7.X
            jh6 r10 = r0.a
            zt3 r10 = r10.h
            java.lang.Object[] r10 = r10.b
            int r10 = r10.length
            java.lang.String r11 = "handleChatsUpdate step 4 ; history = "
            java.lang.String r10 = wn6.h(r10, r11)
            r11 = 0
            r6.d(r9, r3, r10, r11)
        L_0x0272:
            java.util.Iterator r3 = r16.iterator()
        L_0x0276:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x02c4
            java.lang.Object r6 = r3.next()
            pi2 r6 = (defpackage.pi2) r6
            long r9 = r6.a
            java.lang.Object r9 = r1.c(r9)
            pi2 r9 = (defpackage.pi2) r9
            if (r9 != 0) goto L_0x0299
            long r10 = r6.F0
            r12 = 0
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 <= 0) goto L_0x0299
            r10 = 1
            int r8 = r8 + r10
        L_0x0296:
            r14 = 0
            goto L_0x0276
        L_0x0299:
            if (r9 == 0) goto L_0x0296
            long r10 = r9.F0
            long r12 = r6.F0
            int r6 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r6 == 0) goto L_0x0296
            r14 = 0
            int r6 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r6 <= 0) goto L_0x02b0
            int r10 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r10 <= 0) goto L_0x02b0
            r10 = 1
        L_0x02ae:
            int r8 = r8 + r10
            goto L_0x0276
        L_0x02b0:
            r10 = 1
            int r11 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r11 <= 0) goto L_0x02c1
            int r8 = r8 + r10
            long r11 = r9.a
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r11)
            r2.add(r6)
            goto L_0x0276
        L_0x02c1:
            if (r6 <= 0) goto L_0x0276
            goto L_0x02ae
        L_0x02c4:
            java.lang.String r1 = r0.D0
            fn6 r3 = defpackage.udd.e
            if (r3 != 0) goto L_0x02cc
        L_0x02ca:
            r10 = 0
            goto L_0x02e5
        L_0x02cc:
            boolean r6 = r3.c()
            if (r6 == 0) goto L_0x02ca
            tn7 r6 = tn7.X
            jh6 r9 = r0.a
            zt3 r9 = r9.h
            java.lang.Object[] r9 = r9.b
            int r9 = r9.length
            java.lang.String r10 = "handleChatsUpdate step 5; history = "
            java.lang.String r9 = wn6.h(r9, r10)
            r10 = 0
            r3.d(r6, r1, r9, r10)
        L_0x02e5:
            if (r8 <= 0) goto L_0x02fd
            r4.o = r0
            r4.X = r2
            r4.Y = r10
            r4.Z = r10
            r1 = 3
            r4.y0 = r1
            java.lang.Object r1 = r0.g(r4)
            if (r1 != r5) goto L_0x02f9
            goto L_0x032d
        L_0x02f9:
            r1 = r0
            r0 = r2
        L_0x02fb:
            r2 = r0
            r0 = r1
        L_0x02fd:
            boolean r1 = r2.isEmpty()
            r3 = 1
            r1 = r1 ^ r3
            if (r1 == 0) goto L_0x030a
            jh6 r1 = r0.a
            r1.c(r2)
        L_0x030a:
            java.lang.String r1 = r0.D0
            fn6 r2 = defpackage.udd.e
            if (r2 != 0) goto L_0x0312
            goto L_0x00a5
        L_0x0312:
            boolean r3 = r2.c()
            if (r3 == 0) goto L_0x00a5
            tn7 r3 = tn7.X
            jh6 r0 = r0.a
            zt3 r0 = r0.h
            java.lang.Object[] r0 = r0.b
            int r0 = r0.length
            java.lang.String r4 = "handleChatsUpdate finish; history = "
            java.lang.String r0 = wn6.h(r0, r4)
            r4 = 0
            r2.d(r3, r1, r0, r4)
            goto L_0x00a5
        L_0x032d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kr2.a(kr2, bq2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [i26, l5e] */
    /* JADX WARNING: type inference failed for: r12v0, types: [i7c, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object b(defpackage.kr2 r16, kj3 r17, kotlin.coroutines.Continuation r18) {
        /*
            r6 = r16
            r0 = r18
            r16.getClass()
            boolean r1 = r0 instanceof defpackage.vq2
            if (r1 == 0) goto L_0x001b
            r1 = r0
            vq2 r1 = (defpackage.vq2) r1
            int r2 = r1.w0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x001b
            int r2 = r2 - r3
            r1.w0 = r2
        L_0x0019:
            r7 = r1
            goto L_0x0021
        L_0x001b:
            vq2 r1 = new vq2
            r1.<init>(r6, r0)
            goto L_0x0019
        L_0x0021:
            java.lang.Object r0 = r7.Y
            pu3 r8 = defpackage.pu3.a
            int r1 = r7.w0
            r9 = 0
            r10 = 1
            if (r1 == 0) goto L_0x003e
            if (r1 != r10) goto L_0x0036
            i7c r1 = r7.X
            kr2 r2 = r7.o
            defpackage.wx3.H(r0)
            goto L_0x00ca
        L_0x0036:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003e:
            defpackage.wx3.H(r0)
            java.lang.String r0 = r6.D0
            fn6 r1 = defpackage.udd.e
            if (r1 != 0) goto L_0x004a
        L_0x0047:
            r11 = r17
            goto L_0x0065
        L_0x004a:
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x0047
            tn7 r2 = tn7.X
            r11 = r17
            zb9 r3 = r11.a
            r4 = 31
            java.lang.String r3 = defpackage.zb9.k(r3, r9, r9, r4)
            java.lang.String r4 = "handleContactsUpdateEvent "
            java.lang.String r3 = r4.concat(r3)
            r1.d(r2, r0, r3, r9)
        L_0x0065:
            i7c r12 = new i7c
            r12.<init>()
            grd r0 = r6.B0
            java.lang.Object r0 = r0.getValue()
            hq2 r0 = (defpackage.hq2) r0
            java.util.List r0 = r0.a
            pae r1 = r6.b
            n3a r1 = (defpackage.n3a) r1
            ju3 r1 = r1.b()
            ku3 r2 = r6.c
            hu3 r1 = r1.plus(r2)
            if (r1 != 0) goto L_0x0086
            hu3 r1 = r7.b
        L_0x0086:
            kotlinx.coroutines.internal.ContextScope r13 = defpackage.n1g.a(r1)
            java.util.ArrayList r14 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.q23.H(r0, r1)
            r14.<init>(r1)
            java.util.Iterator r15 = r0.iterator()
        L_0x0099:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x00ba
            java.lang.Object r1 = r15.next()
            uq2 r5 = new uq2
            r2 = 0
            r0 = r5
            r3 = r16
            r4 = r12
            r10 = r5
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = 3
            zc4 r0 = defpackage.xs7.d(r13, r9, r10, r0)
            r14.add(r0)
            r10 = 1
            goto L_0x0099
        L_0x00ba:
            r7.o = r6
            r7.X = r12
            r0 = 1
            r7.w0 = r0
            java.lang.Object r0 = defpackage.lp.c(r14, r7)
            if (r0 != r8) goto L_0x00c8
            goto L_0x00ef
        L_0x00c8:
            r2 = r6
            r1 = r12
        L_0x00ca:
            java.lang.String r0 = r2.D0
            fn6 r3 = defpackage.udd.e
            if (r3 != 0) goto L_0x00d1
            goto L_0x00de
        L_0x00d1:
            boolean r4 = r3.c()
            if (r4 == 0) goto L_0x00de
            tn7 r4 = tn7.X
            java.lang.String r5 = "handleContactsUpdateEvent finish"
            r3.d(r4, r0, r5, r9)
        L_0x00de:
            boolean r0 = r1.a
            if (r0 == 0) goto L_0x00ed
            s30 r0 = r2.F0
            wq2 r1 = new wq2
            r2 = 2
            r1.<init>(r2, r9)
            s30.r(r0, r1)
        L_0x00ed:
            jue r8 = defpackage.jue.a
        L_0x00ef:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kr2.b(kr2, kj3, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.yq2
            if (r0 == 0) goto L_0x0013
            r0 = r5
            yq2 r0 = (defpackage.yq2) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            yq2 r0 = new yq2
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.X
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kr2 r4 = r0.o
            defpackage.wx3.H(r5)
            goto L_0x004a
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            defpackage.wx3.H(r5)
            java.util.concurrent.atomic.AtomicBoolean r5 = r4.z0
            r5.set(r3)
            jh6 r5 = r4.a
            r5.j = r4
            s30 r5 = r4.F0
            r0.o = r4
            r0.Z = r3
            java.lang.Object r5 = r5.h(r0)
            if (r5 != r1) goto L_0x004a
            return r1
        L_0x004a:
            java.util.concurrent.atomic.AtomicBoolean r5 = r4.z0
            r5.set(r3)
            s30 r5 = r4.F0
            zq2 r0 = new zq2
            r1 = 0
            r0.<init>(r4, r1)
            s30.r(r5, r0)
            jue r4 = defpackage.jue.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kr2.c(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.ar2
            if (r0 == 0) goto L_0x0013
            r0 = r5
            ar2 r0 = (defpackage.ar2) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            ar2 r0 = new ar2
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.X
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kr2 r4 = r0.o
            defpackage.wx3.H(r5)
            goto L_0x0050
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            defpackage.wx3.H(r5)
            java.util.concurrent.atomic.AtomicBoolean r5 = r4.y0
            r2 = 0
            boolean r5 = r5.compareAndSet(r3, r2)
            if (r5 == 0) goto L_0x005f
            t97 r5 = r4.Z
            java.lang.Object r5 = r5.getValue()
            ja5 r5 = (defpackage.ja5) r5
            r0.o = r4
            r0.Z = r3
            java.io.Serializable r5 = r5.a(r0)
            if (r5 != r1) goto L_0x0050
            return r1
        L_0x0050:
            java.util.List r5 = (java.util.List) r5
            zt3 r0 = r4.A0
            r0.addAll(r5)
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r4.f(r0)
        L_0x005f:
            jue r4 = defpackage.jue.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kr2.d(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void e() {
        if (this.z0.compareAndSet(false, true)) {
            s30.r(this.F0, new br2(this, (Continuation) null)).invokeOnCompletion(new l(25, this));
        }
    }

    public final void f(long j) {
        String str = this.D0;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, str, us8.i(j, "loadNext: "), (Throwable) null);
        }
        jh6 jh6 = this.a;
        kh6 kh6 = jh6.e;
        if (kh6 != null) {
            String b2 = kh6.b(j);
            kh6.c("loadNext: " + b2);
        }
        jh6.q();
        if (!jh6.d().i().isEmpty()) {
            if (kh6 != null) {
                kh6.c("loadNext: Chunks not empty, started loading from datasources");
            }
            rg6 v = mt0.v(jh6.f(j));
            if (v != null) {
                j = v.k();
            }
            jh6.j(jh6.b, j, false, true, false);
            jh6.k(jh6.c, j, false, true);
        } else {
            jh6.l(j);
        }
        if (kh6 != null) {
            pa2.y(kh6, jh6.e());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object g(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.jr2
            if (r0 == 0) goto L_0x0013
            r0 = r5
            jr2 r0 = (defpackage.jr2) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            jr2 r0 = new jr2
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.X
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kr2 r4 = r0.o
            defpackage.wx3.H(r5)
            goto L_0x0047
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            defpackage.wx3.H(r5)
            t97 r5 = r4.Z
            java.lang.Object r5 = r5.getValue()
            ja5 r5 = (defpackage.ja5) r5
            r0.o = r4
            r0.Z = r3
            java.io.Serializable r5 = r5.a(r0)
            if (r5 != r1) goto L_0x0047
            return r1
        L_0x0047:
            java.util.List r5 = (java.util.List) r5
            zt3 r0 = r4.A0
            r0.clear()
            zt3 r4 = r4.A0
            r4.addAll(r5)
            jue r4 = defpackage.jue.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kr2.g(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
