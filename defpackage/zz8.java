package defpackage;

import android.app.Application;
import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import one.me.messages.list.loader.MessageModel;

/* renamed from: zz8  reason: default package */
public final class zz8 extends taf {
    public static final /* synthetic */ k77[] I1;
    public final ikc A0;
    public final epc A1;
    public final l83 B0;
    public final l05 B1;
    public final nxc C0;
    public final ConcurrentHashMap C1;
    public final f03 D0;
    public final HashSet D1;
    public final lz E0;
    public final r7e E1;
    public final String F0 = zz8.class.getName();
    public final pj5 F1;
    public final ju3 G0;
    public final grd G1;
    public final t97 H0;
    public final t0c H1;
    public final t97 I0;
    public final t97 J0;
    public final t97 K0;
    public final t97 L0;
    public final t97 M0;
    public final t97 N0;
    public final t97 O0;
    public final t97 P0;
    public final t97 Q0;
    public final t97 R0;
    public final t97 S0;
    public final t97 T0;
    public final t97 U0;
    public final t97 V0;
    public final t97 W0;
    public final mu7 X;
    public final t97 X0;
    public final pae Y;
    public final t97 Y0;
    public final sya Z;
    public final t97 Z0;
    public final t97 a1;
    public final f19 b;
    public final t97 b1;
    public final we1 c;
    public final t97 c1;
    public final t97 d1;
    public final t97 e1;
    public final t97 f1;
    public final t97 g1;
    public final t97 h1;
    public final t97 i1;
    public final ydc j1;
    public final e3 k1;
    public final e3 l1;
    public final e3 m1;
    public final e3 n1;
    public final ax8 o;
    public final e3 o1;
    public final e3 p1;
    public final e3 q1;
    public final t0c r1;
    public final grd s1;
    public final t0c t1;
    public final t0c u1;
    public final grd v1;
    public final bv2 w0;
    public final t0c w1;
    public final acc x0;
    public final AtomicBoolean x1;
    public final s86 y0;
    public final l05 y1;
    public final nu7 z0;
    public final l05 z1;

    static {
        Class<zz8> cls = zz8.class;
        I1 = new k77[]{new hc9(cls, "markAsUnreadJob", "getMarkAsUnreadJob()Lkotlinx/coroutines/Job;"), c3d.g(m7c.a, cls, "markMessageAsReadJob", "getMarkMessageAsReadJob()Lkotlinx/coroutines/Job;"), new hc9(cls, "scrollClickJob", "getScrollClickJob()Lkotlinx/coroutines/Job;"), new hc9(cls, "attachClickJob", "getAttachClickJob()Lkotlinx/coroutines/Job;"), new hc9(cls, "linkInterceptJob", "getLinkInterceptJob()Lkotlinx/coroutines/Job;"), new hc9(cls, "keyboardActionJob", "getKeyboardActionJob()Lkotlinx/coroutines/Job;"), new hc9(cls, "saveVideoProgressJob", "getSaveVideoProgressJob()Lkotlinx/coroutines/Job;")};
    }

    /* JADX WARNING: type inference failed for: r9v2, types: [s86, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v2, types: [nu7, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v1, types: [l83, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v9, types: [nxc, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v22, types: [i7c, java.lang.Object] */
    public zz8(f19 f19, we1 we1, fw fwVar, mu7 mu7) {
        f19 f192 = f19;
        fw fwVar2 = fwVar;
        xv8 xv8 = xv8.a;
        n3a dispatchers = xv8.getDispatchers();
        sya sya = (sya) xv8.getAccessor().c(sya.class);
        Class<bv2> cls = bv2.class;
        Class<xzc> cls2 = xzc.class;
        acc acc = new acc(xv8.getAccessor().d(cls2), xv8.getAccessor().d(jb5.class), xv8.getAccessor().d(kvd.class), 1);
        Class<pae> cls3 = pae.class;
        r7e d = xv8.getAccessor().d(sce.class);
        r7e d2 = xv8.getAccessor().d(cls);
        Class<b29> cls4 = b29.class;
        r7e d3 = xv8.getAccessor().d(cls4);
        ? obj = new Object();
        obj.a = (pae) xv8.getAccessor().c(cls3);
        obj.b = s86.class.getName();
        obj.c = d;
        obj.o = d2;
        obj.X = d3;
        r7e d4 = xv8.getAccessor().d(m0c.class);
        ? obj2 = new Object();
        obj2.a = nu7.class.getName();
        obj2.b = d4;
        ikc b2 = xv8.b();
        ju3 b3 = ((pae) xv8.getAccessor().c(cls3)).b();
        ikc ikc = b2;
        Class<ed3> cls5 = ed3.class;
        r7e d5 = xv8.getAccessor().d(cls5);
        nu7 nu7 = obj2;
        r7e d6 = xv8.getAccessor().d(cls4);
        s86 s86 = obj;
        ikc b4 = xv8.b();
        acc acc2 = acc;
        ? obj3 = new Object();
        obj3.a = (Context) xv8.getAccessor().c(Context.class);
        obj3.b = b3;
        obj3.c = b4;
        obj3.d = d6;
        obj3.e = d5;
        obj3.f = ez3.O(3, new xd3(9));
        obj3.g = ez3.O(3, new xd3(10));
        Class<pk> cls6 = pk.class;
        r7e d7 = xv8.getAccessor().d(cls6);
        Class<tt0> cls7 = tt0.class;
        r7e d8 = xv8.getAccessor().d(cls7);
        l83 l83 = obj3;
        r7e d9 = xv8.getAccessor().d(cls4);
        ? obj4 = new Object();
        bv2 bv2 = (bv2) xv8.getAccessor().c(cls);
        obj4.a = nxc.class.getName();
        obj4.b = d7;
        obj4.c = d8;
        obj4.o = d9;
        t97 d10 = xv8.getAccessor().d(cls6);
        t97 d11 = xv8.getAccessor().d(hba.class);
        t97 d12 = xv8.getAccessor().d(Application.class);
        t97 d13 = xv8.getAccessor().d(cls2);
        t97 t97 = d12;
        t97 d14 = xv8.getAccessor().d(ap3.class);
        t97 d15 = xv8.getAccessor().d(cls4);
        t97 t972 = d14;
        t97 d16 = xv8.getAccessor().d(gn8.class);
        t97 t973 = d15;
        t97 d17 = xv8.getAccessor().d(ap8.class);
        t97 d18 = xv8.getAccessor().d(pj2.class);
        t97 d19 = xv8.getAccessor().d(e29.class);
        t97 d20 = xv8.getAccessor().d(do8.class);
        t97 d21 = xv8.getAccessor().d(sk7.class);
        t97 d22 = xv8.getAccessor().d(kp2.class);
        t97 d23 = xv8.getAccessor().d(h29.class);
        t97 d24 = xv8.getAccessor().d(cr8.class);
        t97 d25 = xv8.getAccessor().d(bs8.class);
        t97 d26 = xv8.getAccessor().d(nve.class);
        t97 d27 = xv8.getAccessor().d(hc5.class);
        pae dispatchers2 = xv8.getDispatchers();
        t97 t974 = d16;
        t97 t975 = d10;
        t97 t976 = d13;
        long j = f192.a;
        ew8 ew8 = new ew8(j, (tt0) xv8.getAccessor().c(cls7), dispatchers2);
        k19 k19 = new k19((tt0) xv8.getAccessor().c(cls7), xv8.getDispatchers());
        r7e d28 = xv8.getAccessor().d(luf.class);
        k19 k192 = k19;
        r7e d29 = xv8.getAccessor().d(al.class);
        ew8 ew82 = ew8;
        r7e d30 = xv8.getAccessor().d(ef7.class);
        r7e d31 = xv8.getAccessor().d(cls5);
        long j2 = j;
        r7e d32 = xv8.getAccessor().d(gj.class);
        t97 d33 = xv8.getAccessor().d(n76.class);
        t97 d34 = xv8.getAccessor().d(hb2.class);
        t97 d35 = xv8.getAccessor().d(okc.class);
        r7e d36 = xv8.getAccessor().d(iq1.class);
        r7e d37 = xv8.getAccessor().d(u5f.class);
        this.b = f192;
        this.c = we1;
        this.o = fwVar2;
        this.X = mu7;
        this.Y = dispatchers;
        this.Z = sya;
        bv2 bv22 = bv2;
        this.w0 = bv22;
        sya sya2 = sya;
        this.x0 = acc2;
        this.y0 = s86;
        this.z0 = nu7;
        this.A0 = ikc;
        this.B0 = l83;
        this.C0 = obj4;
        this.D0 = (f03) xv8.getAccessor().c(f03.class);
        this.E0 = (lz) xv8.getAccessor().c(lz.class);
        n3a n3a = dispatchers;
        this.G0 = n3a.b().limitedParallelism(1, "messages-list-vm-io");
        this.H0 = t975;
        this.I0 = t976;
        this.J0 = t97;
        t97 t977 = t974;
        this.K0 = t977;
        this.L0 = t973;
        this.M0 = d19;
        this.N0 = d11;
        this.O0 = t972;
        this.P0 = d24;
        this.Q0 = d17;
        this.R0 = d20;
        this.S0 = d18;
        this.T0 = d22;
        this.U0 = d21;
        this.V0 = d25;
        this.W0 = d26;
        this.X0 = d27;
        this.Y0 = d28;
        this.Z0 = d29;
        this.a1 = d30;
        this.b1 = d31;
        this.c1 = d32;
        this.d1 = d33;
        this.e1 = d34;
        this.f1 = d35;
        this.g1 = d36;
        this.h1 = d23;
        this.i1 = d37;
        this.j1 = new ydc(p23.B(new m02[]{new m02(1), new m02(0)}));
        this.k1 = hwf.t();
        this.l1 = hwf.t();
        this.m1 = hwf.t();
        this.n1 = hwf.t();
        this.o1 = hwf.t();
        this.p1 = hwf.t();
        this.q1 = hwf.t();
        t0c m = ((aw2) bv22).m(j2);
        this.r1 = m;
        grd a = hrd.a(tw8.o);
        this.s1 = a;
        t0c t0c = new t0c(a);
        this.t1 = t0c;
        v11 v11 = new v11(m, t0c, new c3(this, (Continuation) null, 19), 4);
        hw4 hw4 = hw4.a;
        qr4 qr4 = ucd.a;
        this.u1 = ez3.d0(v11, this.a, qr4, hw4);
        grd a2 = hrd.a(jpc.e);
        this.v1 = a2;
        this.w1 = new t0c(a2);
        this.x1 = new AtomicBoolean(false);
        this.y1 = new l05(0);
        this.z1 = new l05(1);
        this.A1 = new epc();
        this.B1 = new l05(0);
        this.C1 = new ConcurrentHashMap(0);
        this.D1 = new HashSet();
        this.E1 = new r7e(new zu4((Object) t977, 16, (Object) this));
        this.F1 = ez3.J(new ik5(a, 28), n3a.a());
        grd a3 = hrd.a((Object) null);
        this.G1 = a3;
        this.H1 = ez3.d0(ez3.s(new ik5(a, 29), new ik5(m, 2), a3, new b81(this, (Continuation) null, 2)), this.a, qr4, (Object) null);
        ? obj5 = new Object();
        obj5.a = f192.f;
        ez3.N(ez3.J(new ck5(new djc(new uz8(new v11(new ik5(m, 2), fwVar2.B, new z9(3, (Continuation) null, 22), 4), (Continuation) null, this)), new ox8(this, obj5, (Continuation) null), 5), n3a.a()), this.a);
        taf.n(this, n3a.b(), (ru3) null, new px8(this, (Continuation) null), 2);
        ez3.N(new ck5(ew82.e, new qx8(this, (Continuation) null), 5), this.a);
        ez3.N(new ck5(new s0c(k192.a), new rx8(this, (Continuation) null), 5), this.a);
        sya sya3 = sya2;
        ((nb9) sya3.a).e(sya3.g);
        sya3.b();
        xs7.E(this.a, (hu3) null, (ru3) null, new sx8(this, (Continuation) null), 3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: one.me.messages.list.loader.MessageModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: one.me.messages.list.loader.MessageModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: one.me.messages.list.loader.MessageModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: one.me.messages.list.loader.MessageModel} */
    /* JADX WARNING: type inference failed for: r2v8, types: [i7c, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v4, types: [i7c, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object q(defpackage.zz8 r23, defpackage.i22 r24, java.util.List r25, kotlin.coroutines.Continuation r26) {
        /*
            r0 = r23
            r1 = r24
            r2 = r26
            r23.getClass()
            boolean r3 = r2 instanceof defpackage.wx8
            if (r3 == 0) goto L_0x001c
            r3 = r2
            wx8 r3 = (defpackage.wx8) r3
            int r4 = r3.z0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001c
            int r4 = r4 - r5
            r3.z0 = r4
            goto L_0x0021
        L_0x001c:
            wx8 r3 = new wx8
            r3.<init>(r0, r2)
        L_0x0021:
            java.lang.Object r2 = r3.x0
            pu3 r4 = pu3.a
            int r5 = r3.z0
            r6 = 0
            r11 = 0
            r7 = 1
            if (r5 == 0) goto L_0x004d
            if (r5 != r7) goto L_0x0045
            i7c r0 = r3.w0
            i7c r1 = r3.Z
            java.util.List r4 = r3.Y
            i22 r5 = r3.X
            zz8 r3 = r3.o
            wx3.H(r2)
            r14 = r4
            r22 = r5
            r5 = r0
            r0 = r3
            r3 = r2
            r2 = r1
            r1 = r22
            goto L_0x0084
        L_0x0045:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x004d:
            wx3.H(r2)
            i7c r2 = new i7c
            r2.<init>()
            r2.a = r7
            i7c r5 = new i7c
            r5.<init>()
            f19 r8 = r0.b
            long r9 = r8.c
            r12 = 0
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 == 0) goto L_0x00f5
            b29 r8 = r23.y()
            f19 r9 = r0.b
            long r9 = r9.c
            r3.o = r0
            r3.X = r1
            r14 = r25
            r3.Y = r14
            r3.Z = r2
            r3.w0 = r5
            r3.z0 = r7
            java.lang.Object r3 = r8.a(r9, r3)
            if (r3 != r4) goto L_0x0084
            goto L_0x01b4
        L_0x0084:
            vo8 r3 = (defpackage.vo8) r3
            if (r3 != 0) goto L_0x00cb
            long r3 = oyb.C(r1)
            r2.a = r11
            java.lang.String r1 = r0.F0
            fn6 r7 = udd.e
            if (r7 != 0) goto L_0x0096
            goto L_0x0158
        L_0x0096:
            boolean r8 = r7.c()
            if (r8 == 0) goto L_0x0158
            tn7 r8 = defpackage.tn7.X
            java.lang.Long r9 = new java.lang.Long
            r9.<init>(r3)
            java.lang.String r9 = ez3.T(r9)
            f19 r10 = r0.b
            long r12 = r10.c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r15 = "getMessageAnchor: Fallback on chatReadMark="
            r10.<init>(r15)
            r10.append(r9)
            java.lang.String r9 = " cause of loadMessageId="
            r10.append(r9)
            r10.append(r12)
            java.lang.String r9 = " doesn't exists"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r7.d(r8, r1, r9, r6)
            goto L_0x0158
        L_0x00cb:
            java.lang.String r1 = r0.F0
            fn6 r4 = udd.e
            if (r4 != 0) goto L_0x00d2
            goto L_0x00f0
        L_0x00d2:
            boolean r7 = r4.c()
            if (r7 == 0) goto L_0x00f0
            tn7 r7 = defpackage.tn7.X
            long r8 = r3.k()
            java.lang.Long r10 = new java.lang.Long
            r10.<init>(r8)
            java.lang.String r8 = ez3.T(r10)
            java.lang.String r9 = "getMessageAnchor: loadMessageIdMark="
            java.lang.String r8 = defpackage.rf0.h(r9, r8)
            r4.d(r7, r1, r8, r6)
        L_0x00f0:
            long r3 = r3.k()
            goto L_0x0158
        L_0x00f5:
            r14 = r25
            long r3 = r8.b
            int r3 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r3 == 0) goto L_0x0127
            java.lang.String r1 = r0.F0
            fn6 r3 = udd.e
            if (r3 != 0) goto L_0x0104
            goto L_0x0122
        L_0x0104:
            boolean r4 = r3.c()
            if (r4 == 0) goto L_0x0122
            tn7 r4 = defpackage.tn7.X
            f19 r7 = r0.b
            long r7 = r7.b
            java.lang.Long r9 = new java.lang.Long
            r9.<init>(r7)
            java.lang.String r7 = ez3.T(r9)
            java.lang.String r8 = "getMessageAnchor: loadMark="
            java.lang.String r7 = defpackage.rf0.h(r8, r7)
            r3.d(r4, r1, r7, r6)
        L_0x0122:
            f19 r1 = r0.b
            long r3 = r1.b
            goto L_0x0158
        L_0x0127:
            long r3 = oyb.C(r24)
            r2.a = r11
            o62 r1 = r1.b
            int r1 = r1.m
            if (r1 != 0) goto L_0x0134
            goto L_0x0135
        L_0x0134:
            r7 = r11
        L_0x0135:
            r5.a = r7
            java.lang.String r1 = r0.F0
            fn6 r7 = udd.e
            if (r7 != 0) goto L_0x013e
            goto L_0x0158
        L_0x013e:
            boolean r8 = r7.c()
            if (r8 == 0) goto L_0x0158
            tn7 r8 = defpackage.tn7.X
            java.lang.Long r9 = new java.lang.Long
            r9.<init>(r3)
            java.lang.String r9 = ez3.T(r9)
            java.lang.String r10 = "getMessageAnchor: chatReadMark="
            java.lang.String r9 = defpackage.rf0.h(r10, r9)
            r7.d(r8, r1, r9, r6)
        L_0x0158:
            boolean r1 = r2.a
            if (r1 == 0) goto L_0x0179
            epc r2 = r0.A1
            boolean r5 = r5.a
            r2.getClass()
            bpc r6 = new bpc
            r18 = 0
            r20 = 0
            r15 = r6
            r16 = r3
            r19 = r1
            r21 = r5
            r15.<init>(r16, r18, r19, r20, r21)
            mc9 r1 = r2.a
            r1.setValue(r6)
            goto L_0x01ab
        L_0x0179:
            java.util.Iterator r1 = r14.iterator()
        L_0x017d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0191
            java.lang.Object r2 = r1.next()
            r7 = r2
            one.me.messages.list.loader.MessageModel r7 = (one.me.messages.list.loader.MessageModel) r7
            long r7 = r7.c
            int r7 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r7 < 0) goto L_0x017d
            r6 = r2
        L_0x0191:
            one.me.messages.list.loader.MessageModel r6 = (one.me.messages.list.loader.MessageModel) r6
            if (r6 == 0) goto L_0x01ab
            long r8 = r6.c
            epc r1 = r0.A1
            boolean r13 = r5.a
            r1.getClass()
            bpc r2 = new bpc
            r10 = 0
            r12 = 0
            r7 = r2
            r7.<init>(r8, r10, r11, r12, r13)
            mc9 r1 = r1.a
            r1.setValue(r2)
        L_0x01ab:
            ax8 r0 = r0.o
            fw r0 = (defpackage.fw) r0
            r0.r(r3)
            jue r4 = jue.a
        L_0x01b4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zz8.q(zz8, i22, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object r(defpackage.zz8 r12, long r13, kotlin.coroutines.Continuation r15) {
        /*
            r12.getClass()
            boolean r0 = r15 instanceof defpackage.hy8
            if (r0 == 0) goto L_0x0016
            r0 = r15
            hy8 r0 = (defpackage.hy8) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.w0 = r1
            goto L_0x001b
        L_0x0016:
            hy8 r0 = new hy8
            r0.<init>(r12, r15)
        L_0x001b:
            java.lang.Object r15 = r0.Y
            pu3 r1 = pu3.a
            int r2 = r0.w0
            jue r3 = jue.a
            r4 = 0
            r9 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r9) goto L_0x0031
            long r13 = r0.X
            zz8 r12 = r0.o
            wx3.H(r15)
            goto L_0x0092
        L_0x0031:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0039:
            wx3.H(r15)
            grd r15 = r12.s1
            java.lang.Object r15 = r15.getValue()
            tw8 r15 = (defpackage.tw8) r15
            one.me.messages.list.loader.MessageModel r15 = r15.e(r13)
            java.lang.String r2 = r12.F0
            fn6 r5 = udd.e
            if (r5 != 0) goto L_0x004f
            goto L_0x0068
        L_0x004f:
            boolean r6 = r5.c()
            if (r6 == 0) goto L_0x0068
            tn7 r6 = defpackage.tn7.X
            if (r15 == 0) goto L_0x005e
            java.lang.String r7 = r15.m()
            goto L_0x005f
        L_0x005e:
            r7 = r4
        L_0x005f:
            java.lang.String r8 = "loadIfNeedAndScrollToMessage="
            java.lang.String r7 = defpackage.rf0.h(r8, r7)
            r5.d(r6, r2, r7, r4)
        L_0x0068:
            if (r15 == 0) goto L_0x0081
            epc r12 = r12.A1
            long r5 = r15.c
            r12.getClass()
            bpc r13 = new bpc
            r8 = 1
            r10 = 0
            r7 = 1
            r9 = 1
            r4 = r13
            r4.<init>(r5, r7, r8, r9, r10)
            mc9 r12 = r12.a
            r12.setValue(r13)
            goto L_0x00ae
        L_0x0081:
            b29 r15 = r12.y()
            r0.o = r12
            r0.X = r13
            r0.w0 = r9
            java.lang.Object r15 = r15.a(r13, r0)
            if (r15 != r1) goto L_0x0092
            goto L_0x00d3
        L_0x0092:
            vo8 r15 = (defpackage.vo8) r15
            if (r15 != 0) goto L_0x00b0
            java.lang.String r12 = r12.F0
            fn6 r15 = udd.e
            if (r15 != 0) goto L_0x009d
            goto L_0x00ae
        L_0x009d:
            boolean r0 = r15.c()
            if (r0 == 0) goto L_0x00ae
            tn7 r0 = defpackage.tn7.w0
            java.lang.String r1 = "Trying to scroll for non-existing messageId="
            java.lang.String r13 = defpackage.us8.i(r13, r1)
            r15.d(r0, r12, r13, r4)
        L_0x00ae:
            r1 = r3
            goto L_0x00d3
        L_0x00b0:
            ax8 r13 = r12.o
            long r0 = r15.k()
            fw r13 = (defpackage.fw) r13
            r13.r(r0)
            epc r12 = r12.A1
            long r6 = r15.k()
            r12.getClass()
            bpc r13 = new bpc
            r8 = 0
            r10 = 1
            r11 = 0
            r5 = r13
            r5.<init>(r6, r8, r9, r10, r11)
            mc9 r12 = r12.a
            r12.setValue(r13)
            goto L_0x00ae
        L_0x00d3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zz8.r(zz8, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object s(defpackage.zz8 r12, defpackage.vo8 r13, kotlin.coroutines.Continuation r14) {
        /*
            r12.getClass()
            boolean r0 = r14 instanceof defpackage.jz8
            if (r0 == 0) goto L_0x0016
            r0 = r14
            jz8 r0 = (defpackage.jz8) r0
            int r1 = r0.x0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.x0 = r1
            goto L_0x001b
        L_0x0016:
            jz8 r0 = new jz8
            r0.<init>(r12, r14)
        L_0x001b:
            java.lang.Object r14 = r0.Z
            pu3 r1 = pu3.a
            int r2 = r0.x0
            jue r3 = jue.a
            r4 = 0
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            if (r2 == 0) goto L_0x004d
            if (r2 == r8) goto L_0x0032
            if (r2 == r7) goto L_0x0032
            if (r2 == r6) goto L_0x003f
            if (r2 != r5) goto L_0x0037
        L_0x0032:
            wx3.H(r14)
            goto L_0x00e9
        L_0x0037:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x003f:
            o10 r12 = r0.Y
            vo8 r13 = r0.X
            zz8 r2 = r0.o
            wx3.H(r14)
            r10 = r12
            r8 = r13
            r7 = r2
            goto L_0x00c5
        L_0x004d:
            wx3.H(r14)
            j10 r14 = defpackage.j10.c
            o10 r14 = r13.a(r14)
            pae r2 = r12.Y
            if (r14 == 0) goto L_0x00ff
            t97 r9 = r12.b1
            java.lang.Object r9 = r9.getValue()
            ed3 r9 = (defpackage.ed3) r9
            boolean r9 = r9.f()
            if (r9 != 0) goto L_0x006a
            goto L_0x00ff
        L_0x006a:
            boolean r8 = r14.d()
            a10 r9 = r14.b
            if (r8 == 0) goto L_0x008c
            if (r9 == 0) goto L_0x008a
            java.lang.String r8 = r9.a
            boolean r9 = r1g.p(r8)
            if (r9 != 0) goto L_0x008a
            boolean r9 = r1g.p(r8)
            if (r9 == 0) goto L_0x0083
            goto L_0x008a
        L_0x0083:
            java.lang.String r9 = "&fn=legacy_44"
            java.lang.String r8 = hr1.g(r8, r9)
            goto L_0x0092
        L_0x008a:
            r8 = r4
            goto L_0x0092
        L_0x008c:
            if (r9 == 0) goto L_0x008a
            java.lang.String r8 = r9.a()
        L_0x0092:
            java.lang.String r9 = r14.r
            if (r9 == 0) goto L_0x009e
            int r10 = r9.length()
            if (r10 != 0) goto L_0x009d
            goto L_0x009e
        L_0x009d:
            r8 = r9
        L_0x009e:
            if (r8 == 0) goto L_0x00eb
            int r9 = r8.length()
            if (r9 != 0) goto L_0x00a7
            goto L_0x00eb
        L_0x00a7:
            n3a r2 = (n3a) r2
            ju3 r2 = r2.b()
            nz8 r7 = new nz8
            r7.<init>(r12, r8, r14, r4)
            r0.o = r12
            r0.X = r13
            r0.Y = r14
            r0.x0 = r6
            java.lang.Object r2 = xs7.U(r2, r7, r0)
            if (r2 != r1) goto L_0x00c1
            goto L_0x0112
        L_0x00c1:
            r7 = r12
            r8 = r13
            r10 = r14
            r14 = r2
        L_0x00c5:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r9 = r14.booleanValue()
            pae r12 = r7.Y
            n3a r12 = (n3a) r12
            zr7 r12 = r12.c()
            mz8 r13 = new mz8
            r11 = 0
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            r0.o = r4
            r0.X = r4
            r0.Y = r4
            r0.x0 = r5
            java.lang.Object r12 = xs7.U(r12, r13, r0)
            if (r12 != r1) goto L_0x00e9
            goto L_0x0112
        L_0x00e9:
            r1 = r3
            goto L_0x0112
        L_0x00eb:
            n3a r2 = (n3a) r2
            zr7 r14 = r2.c()
            lz8 r2 = new lz8
            r2.<init>(r12, r13, r4)
            r0.x0 = r7
            java.lang.Object r12 = xs7.U(r14, r2, r0)
            if (r12 != r1) goto L_0x00e9
            goto L_0x0112
        L_0x00ff:
            n3a r2 = (n3a) r2
            zr7 r14 = r2.c()
            kz8 r2 = new kz8
            r2.<init>(r12, r13, r4)
            r0.x0 = r8
            java.lang.Object r12 = xs7.U(r14, r2, r0)
            if (r12 != r1) goto L_0x00e9
        L_0x0112:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zz8.s(zz8, vo8, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: i22} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object t(defpackage.zz8 r28, defpackage.vo8 r29, kotlin.coroutines.Continuation r30) {
        /*
            r0 = r28
            r1 = r29
            r2 = r30
            r28.getClass()
            boolean r3 = r2 instanceof defpackage.pz8
            if (r3 == 0) goto L_0x001d
            r3 = r2
            pz8 r3 = (defpackage.pz8) r3
            int r4 = r3.y0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001d
            int r4 = r4 - r5
            r3.y0 = r4
        L_0x001b:
            r11 = r3
            goto L_0x0023
        L_0x001d:
            pz8 r3 = new pz8
            r3.<init>(r0, r2)
            goto L_0x001b
        L_0x0023:
            java.lang.Object r2 = r11.w0
            pu3 r3 = pu3.a
            int r4 = r11.y0
            jue r12 = jue.a
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x0051
            if (r4 == r6) goto L_0x004b
            if (r4 != r5) goto L_0x0043
            i22 r0 = r11.Z
            o10 r1 = r11.Y
            vo8 r3 = r11.X
            zz8 r4 = r11.o
            wx3.H(r2)
            r13 = r0
            r2 = r1
            r1 = r3
            r0 = r4
            goto L_0x0096
        L_0x0043:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x004b:
            wx3.H(r2)
            r2 = r12
            goto L_0x00d0
        L_0x0051:
            wx3.H(r2)
            j10 r2 = defpackage.j10.o
            o10 r2 = r1.a(r2)
            t0c r4 = r0.r1
            zqd r4 = r4.a
            java.lang.Object r4 = r4.getValue()
            r13 = r4
            i22 r13 = (defpackage.i22) r13
            if (r2 == 0) goto L_0x0077
            if (r13 == 0) goto L_0x0077
            t97 r4 = r0.b1
            java.lang.Object r4 = r4.getValue()
            ed3 r4 = (defpackage.ed3) r4
            boolean r4 = r4.f()
            if (r4 != 0) goto L_0x0079
        L_0x0077:
            r2 = r12
            goto L_0x00d2
        L_0x0079:
            nve r4 = r28.z()
            g10 r10 = defpackage.g10.X
            r11.o = r0
            r11.X = r1
            r11.Y = r2
            r11.Z = r13
            r11.y0 = r5
            long r7 = r1.b
            java.lang.String r9 = r2.q
            long r5 = r13.a
            java.lang.Object r4 = r4.a(r5, r7, r9, r10, r11)
            if (r4 != r3) goto L_0x0096
            goto L_0x00e8
        L_0x0096:
            t97 r3 = r0.H0
            java.lang.Object r3 = r3.getValue()
            pk r3 = (defpackage.pk) r3
            n10 r4 = r2.d
            long r5 = r4.a
            o62 r7 = r13.b
            long r7 = r7.a
            long r9 = r1.c
            r14 = r3
            gy9 r14 = (defpackage.gy9) r14
            java.lang.String r3 = r2.q
            java.lang.String r4 = r4.m
            r15 = 1
            r30 = r12
            long r11 = r1.b
            r25 = 1
            r26 = 1
            r16 = r5
            r18 = r7
            r20 = r9
            r22 = r11
            r24 = r3
            r27 = r4
            r14.M(r15, r16, r18, r20, r22, r24, r25, r26, r27)
            java.util.concurrent.ConcurrentHashMap r0 = r0.C1
            java.lang.String r1 = r2.q
            r2 = r30
            r0.putIfAbsent(r1, r2)
        L_0x00d0:
            r3 = r2
            goto L_0x00e8
        L_0x00d2:
            pae r4 = r0.Y
            n3a r4 = (n3a) r4
            zr7 r4 = r4.c()
            qz8 r5 = new qz8
            r7 = 0
            r5.<init>(r0, r1, r7)
            r11.y0 = r6
            java.lang.Object r0 = xs7.U(r4, r5, r11)
            if (r0 != r3) goto L_0x00d0
        L_0x00e8:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zz8.t(zz8, vo8, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final x99 A() {
        return (x99) this.E1.getValue();
    }

    public final hba B() {
        return (hba) this.N0.getValue();
    }

    public final void C(String str) {
        qod D = xs7.D(this.a, this.Y.b(), ru3.b, new ey8(str, this, (Continuation) null));
        this.o1.o1(this, I1[4], D);
    }

    public final void D(String str) {
        String a;
        if (str != null && (a = ((gg7) ((al) this.Z0.getValue())).a(str)) != null) {
            C(a);
        }
    }

    public final void E(long j) {
        xs7.E(this.a, (hu3) null, (ru3) null, new gy8(this, j, (Continuation) null), 3);
    }

    public final void F(long j, boolean z) {
        boolean z2 = ((tw8) this.s1.getValue()).f(j) >= 0;
        String str = this.F0;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            fn6.d(tn7, str, "loadIfNeedAndScrollToMessageByTime: is message with time=" + j + " loaded=" + z2, (Throwable) null);
        }
        if (z2) {
            epc epc = this.A1;
            epc.getClass();
            epc.a.setValue(new bpc(j, true, true, true, z));
            return;
        }
        ((fw) this.o).r(j);
        epc epc2 = this.A1;
        epc2.getClass();
        epc2.a.setValue(new bpc(j, false, true, true, z));
    }

    public final boolean G(rz rzVar, long j, String str) {
        if (A().d()) {
            A().e(j);
            return true;
        } else if (rzVar instanceof ag3) {
            return false;
        } else {
            if (((rzVar instanceof w13) && str == null) || (rzVar instanceof m40)) {
                return false;
            }
            ru3 ru3 = ru3.b;
            jy8 jy8 = new jy8(rzVar, this, j, str, (Continuation) null);
            qod D = xs7.D(this.a, this.G0, ru3, jy8);
            this.n1.o1(this, I1[3], D);
            return true;
        }
    }

    public final boolean H(MessageModel messageModel) {
        this.l1.o1(this, I1[1], xs7.D(this.a, this.G0, ru3.b, new ly8(this, messageModel, (Continuation) null)));
        return messageModel.b != 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:136:0x034c, code lost:
        r14 = r0.longValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void I(int r21, java.util.List r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            int r3 = defpackage.a7a.y
            l05 r4 = r0.y1
            if (r1 != r3) goto L_0x0023
            java.lang.Object r0 = o23.X(r22)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L_0x0022
            long r0 = r0.longValue()
            ied r2 = new ied
            r2.<init>(r0)
            defpackage.taf.o(r4, r2)
            goto L_0x03c2
        L_0x0022:
            return
        L_0x0023:
            int r3 = defpackage.a7a.v
            r5 = 0
            t0c r6 = r0.t1
            r7 = 1
            l05 r8 = r0.B1
            if (r1 != r3) goto L_0x0071
            int r0 = r22.size()
            if (r0 != r7) goto L_0x0063
            java.lang.Object r0 = o23.X(r22)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L_0x0062
            long r0 = r0.longValue()
            zqd r3 = r6.a
            java.lang.Object r3 = r3.getValue()
            tw8 r3 = (defpackage.tw8) r3
            one.me.messages.list.loader.MessageModel r0 = r3.e(r0)
            if (r0 != 0) goto L_0x004e
            return
        L_0x004e:
            bx8 r1 = defpackage.bx8.c
            wy r0 = r0.y0
            rz r0 = r0.d
            boolean r0 = r0 instanceof defpackage.pc5
            r1.getClass()
            a34 r0 = defpackage.bx8.Z1(r2, r0)
            defpackage.taf.o(r8, r0)
            goto L_0x03c2
        L_0x0062:
            return
        L_0x0063:
            bx8 r0 = defpackage.bx8.c
            r0.getClass()
            a34 r0 = defpackage.bx8.Z1(r2, r5)
            defpackage.taf.o(r8, r0)
            goto L_0x03c2
        L_0x0071:
            int r3 = defpackage.a7a.q
            r9 = 2
            r10 = 0
            pae r11 = r0.Y
            if (r1 != r3) goto L_0x0089
            n3a r11 = (n3a) r11
            ju3 r1 = r11.b()
            ty8 r3 = new ty8
            r3.<init>(r0, r2, r10)
            defpackage.taf.n(r0, r1, r10, r3, r9)
            goto L_0x03c2
        L_0x0089:
            int r3 = defpackage.a7a.z
            if (r1 != r3) goto L_0x009d
            n3a r11 = (n3a) r11
            ju3 r1 = r11.b()
            vy8 r3 = new vy8
            r3.<init>(r0, r2, r10)
            defpackage.taf.n(r0, r1, r10, r3, r9)
            goto L_0x03c2
        L_0x009d:
            int r3 = defpackage.a7a.w
            kotlinx.coroutines.internal.ContextScope r12 = r0.a
            if (r1 != r3) goto L_0x00bf
            n3a r11 = (n3a) r11
            ju3 r1 = r11.b()
            ru3 r3 = ru3.b
            xy8 r4 = new xy8
            r4.<init>(r0, r2, r10)
            qod r1 = xs7.D(r12, r1, r3, r4)
            k77[] r2 = I1
            r2 = r2[r5]
            e3 r3 = r0.k1
            r3.o1(r0, r2, r1)
            goto L_0x03c2
        L_0x00bf:
            int r3 = defpackage.a7a.s
            if (r1 != r3) goto L_0x00d3
            n3a r11 = (n3a) r11
            ju3 r1 = r11.b()
            yy8 r3 = new yy8
            r3.<init>(r0, r2, r10)
            defpackage.taf.n(r0, r1, r10, r3, r9)
            goto L_0x03c2
        L_0x00d3:
            int r3 = defpackage.a7a.m
            if (r1 != r3) goto L_0x00e7
            n3a r11 = (n3a) r11
            ju3 r1 = r11.b()
            zy8 r3 = new zy8
            r3.<init>(r0, r2, r10)
            defpackage.taf.n(r0, r1, r10, r3, r9)
            goto L_0x03c2
        L_0x00e7:
            int r3 = defpackage.a7a.n
            if (r1 != r3) goto L_0x00fb
            n3a r11 = (n3a) r11
            ju3 r1 = r11.b()
            az8 r3 = new az8
            r3.<init>(r0, r2, r10)
            defpackage.taf.n(r0, r1, r10, r3, r9)
            goto L_0x03c2
        L_0x00fb:
            int r3 = defpackage.a7a.k
            if (r1 != r3) goto L_0x0113
            java.lang.Object r1 = o23.X(r22)
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 == 0) goto L_0x0112
            long r1 = r1.longValue()
            j63 r3 = defpackage.j63.SPAM
            r0.u(r1, r3)
            goto L_0x03c2
        L_0x0112:
            return
        L_0x0113:
            int r3 = defpackage.a7a.j
            if (r1 != r3) goto L_0x012b
            java.lang.Object r1 = o23.X(r22)
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 == 0) goto L_0x012a
            long r1 = r1.longValue()
            j63 r3 = defpackage.j63.PORNO
            r0.u(r1, r3)
            goto L_0x03c2
        L_0x012a:
            return
        L_0x012b:
            int r3 = defpackage.a7a.g
            if (r1 != r3) goto L_0x0143
            java.lang.Object r1 = o23.X(r22)
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 == 0) goto L_0x0142
            long r1 = r1.longValue()
            j63 r3 = defpackage.j63.EXTREMISM
            r0.u(r1, r3)
            goto L_0x03c2
        L_0x0142:
            return
        L_0x0143:
            int r3 = defpackage.a7a.h
            if (r1 != r3) goto L_0x015b
            java.lang.Object r1 = o23.X(r22)
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 == 0) goto L_0x015a
            long r1 = r1.longValue()
            j63 r3 = defpackage.j63.FAKE
            r0.u(r1, r3)
            goto L_0x03c2
        L_0x015a:
            return
        L_0x015b:
            int r3 = defpackage.a7a.l
            if (r1 != r3) goto L_0x0173
            java.lang.Object r1 = o23.X(r22)
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 == 0) goto L_0x0172
            long r1 = r1.longValue()
            j63 r3 = defpackage.j63.THREAT
            r0.u(r1, r3)
            goto L_0x03c2
        L_0x0172:
            return
        L_0x0173:
            int r3 = defpackage.a7a.i
            if (r1 != r3) goto L_0x018b
            java.lang.Object r1 = o23.X(r22)
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 == 0) goto L_0x018a
            long r1 = r1.longValue()
            j63 r3 = defpackage.j63.OTHER
            r0.u(r1, r3)
            goto L_0x03c2
        L_0x018a:
            return
        L_0x018b:
            int r3 = defpackage.a7a.x
            r13 = 3
            if (r1 != r3) goto L_0x0224
            t0c r0 = r0.r1
            zqd r0 = r0.a
            java.lang.Object r0 = r0.getValue()
            i22 r0 = (defpackage.i22) r0
            if (r0 != 0) goto L_0x019d
            return
        L_0x019d:
            java.lang.Object r1 = o23.X(r22)
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 == 0) goto L_0x0223
            xm8 r0 = r0.X
            if (r0 == 0) goto L_0x01e6
            kc3 r0 = defpackage.an8.a
            ded r0 = new ded
            java.util.List r1 = java.util.Collections.singletonList(r1)
            int r2 = defpackage.c7a.J
            hge r3 = new hge
            r3.<init>(r2)
            kc3 r2 = new kc3
            int r6 = defpackage.a7a.o
            int r7 = defpackage.c7a.H
            hge r8 = new hge
            r8.<init>(r7)
            r2.<init>(r6, r8, r13, r5)
            kc3 r6 = new kc3
            int r7 = defpackage.a7a.p
            int r8 = defpackage.c7a.I
            hge r9 = new hge
            r9.<init>(r8)
            r6.<init>(r7, r9, r13, r5)
            kc3 r5 = defpackage.an8.a
            kc3[] r2 = new defpackage.kc3[]{r2, r6, r5}
            java.util.List r2 = p23.B(r2)
            r0.<init>(r1, r3, r10, r2)
            defpackage.taf.o(r4, r0)
            goto L_0x03c2
        L_0x01e6:
            kc3 r0 = defpackage.an8.a
            ded r0 = new ded
            java.util.List r1 = java.util.Collections.singletonList(r1)
            int r2 = defpackage.c7a.G
            hge r3 = new hge
            r3.<init>(r2)
            kc3 r2 = new kc3
            int r6 = defpackage.a7a.o
            int r7 = defpackage.c7a.H
            hge r8 = new hge
            r8.<init>(r7)
            r2.<init>(r6, r8, r13, r5)
            kc3 r6 = new kc3
            int r7 = defpackage.a7a.p
            int r8 = defpackage.c7a.I
            hge r9 = new hge
            r9.<init>(r8)
            r6.<init>(r7, r9, r13, r5)
            kc3 r5 = defpackage.an8.a
            kc3[] r2 = new defpackage.kc3[]{r2, r6, r5}
            java.util.List r2 = p23.B(r2)
            r0.<init>(r1, r3, r10, r2)
            defpackage.taf.o(r4, r0)
            goto L_0x03c2
        L_0x0223:
            return
        L_0x0224:
            int r3 = defpackage.a7a.o
            if (r1 != r3) goto L_0x0238
            n3a r11 = (n3a) r11
            ju3 r1 = r11.b()
            bz8 r3 = new bz8
            r3.<init>(r0, r2, r10)
            defpackage.taf.n(r0, r1, r10, r3, r9)
            goto L_0x03c2
        L_0x0238:
            int r3 = defpackage.a7a.p
            if (r1 != r3) goto L_0x024c
            n3a r11 = (n3a) r11
            ju3 r1 = r11.b()
            cz8 r3 = new cz8
            r3.<init>(r0, r2, r10)
            defpackage.taf.n(r0, r1, r10, r3, r9)
            goto L_0x03c2
        L_0x024c:
            int r3 = defpackage.a7a.C
            if (r1 != r3) goto L_0x0260
            n3a r11 = (n3a) r11
            ju3 r1 = r11.b()
            dz8 r3 = new dz8
            r3.<init>(r0, r2, r10)
            defpackage.taf.n(r0, r1, r10, r3, r9)
            goto L_0x03c2
        L_0x0260:
            int r3 = defpackage.a7a.B
            if (r1 != r3) goto L_0x027a
            java.lang.Object r1 = o23.X(r22)
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 == 0) goto L_0x0279
            long r1 = r1.longValue()
            x99 r0 = r20.A()
            r0.e(r1)
            goto L_0x03c2
        L_0x0279:
            return
        L_0x027a:
            int r3 = defpackage.a7a.u
            if (r1 != r3) goto L_0x0295
            java.lang.Object r0 = o23.X(r22)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L_0x0294
            long r0 = r0.longValue()
            fed r2 = new fed
            r2.<init>(r0)
            defpackage.taf.o(r4, r2)
            goto L_0x03c2
        L_0x0294:
            return
        L_0x0295:
            int r3 = defpackage.a7a.c
            if (r1 != r3) goto L_0x02a9
            n3a r11 = (n3a) r11
            ju3 r1 = r11.b()
            py8 r3 = new py8
            r3.<init>(r0, r2, r10)
            defpackage.taf.n(r0, r1, r10, r3, r9)
            goto L_0x03c2
        L_0x02a9:
            int r3 = defpackage.a7a.b
            if (r1 != r3) goto L_0x02bd
            n3a r11 = (n3a) r11
            ju3 r1 = r11.b()
            ry8 r2 = new ry8
            r2.<init>(r0, r10)
            defpackage.taf.n(r0, r1, r10, r2, r9)
            goto L_0x03c2
        L_0x02bd:
            int r3 = defpackage.a7a.a
            if (r1 != r3) goto L_0x02d1
            n3a r11 = (n3a) r11
            ju3 r1 = r11.b()
            sy8 r3 = new sy8
            r3.<init>(r0, r2, r10)
            defpackage.taf.n(r0, r1, r10, r3, r9)
            goto L_0x03c2
        L_0x02d1:
            int r3 = defpackage.a7a.A
            java.util.HashSet r4 = r0.D1
            if (r1 != r3) goto L_0x02fe
            java.lang.Object r1 = o23.X(r22)
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 == 0) goto L_0x02fd
            long r2 = r1.longValue()
            boolean r5 = r4.contains(r1)
            if (r5 == 0) goto L_0x02ea
            return
        L_0x02ea:
            r4.add(r1)
            n3a r11 = (n3a) r11
            ju3 r1 = r11.b()
            xx8 r4 = new xx8
            r4.<init>(r0, r2, r10)
            defpackage.taf.n(r0, r1, r10, r4, r9)
            goto L_0x03c2
        L_0x02fd:
            return
        L_0x02fe:
            int r3 = defpackage.a7a.r
            if (r1 != r3) goto L_0x0340
            java.lang.Object r1 = o23.X(r22)
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 == 0) goto L_0x033f
            long r2 = r1.longValue()
            boolean r5 = r4.contains(r1)
            if (r5 == 0) goto L_0x0315
            return
        L_0x0315:
            r4.add(r1)
            l83 r1 = r0.B0
            r1.getClass()
            vt3 r4 = new vt3
            r4.<init>(r1, r2, r10)
            djc r5 = new djc
            r5.<init>(r4)
            java.lang.Object r1 = r1.b
            ju3 r1 = (ju3) r1
            pj5 r1 = ez3.J(r5, r1)
            vx8 r4 = new vx8
            r4.<init>(r0, r2, r10)
            ck5 r0 = new ck5
            r2 = 5
            r0.<init>(r1, r4, r2)
            ez3.N(r0, r12)
            goto L_0x03c2
        L_0x033f:
            return
        L_0x0340:
            int r0 = defpackage.opb.messages_list_context_action_share_externally
            if (r1 != r0) goto L_0x03c2
            java.lang.Object r0 = o23.X(r22)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L_0x03c2
            long r14 = r0.longValue()
            zqd r0 = r6.a
            java.lang.Object r0 = r0.getValue()
            tw8 r0 = (defpackage.tw8) r0
            one.me.messages.list.loader.MessageModel r0 = r0.e(r14)
            if (r0 != 0) goto L_0x035f
            return
        L_0x035f:
            wy r0 = r0.y0
            rz r0 = r0.d
            if (r0 != 0) goto L_0x0366
            return
        L_0x0366:
            boolean r1 = r0 instanceof defpackage.pc5
            if (r1 == 0) goto L_0x03a3
            pc5 r0 = (defpackage.pc5) r0
            bx8 r1 = defpackage.bx8.c
            int r2 = r0.j
            int r2 = hr1.t(r2)
            if (r2 == 0) goto L_0x038d
            if (r2 == r7) goto L_0x038a
            if (r2 == r9) goto L_0x0387
            if (r2 != r13) goto L_0x0381
            ak4 r2 = ak4.w0
        L_0x037e:
            r19 = r2
            goto L_0x0390
        L_0x0381:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0387:
            ak4 r2 = ak4.Y
            goto L_0x037e
        L_0x038a:
            ak4 r2 = ak4.b
            goto L_0x037e
        L_0x038d:
            ak4 r2 = ak4.o
            goto L_0x037e
        L_0x0390:
            r1.getClass()
            long r1 = r0.a
            java.lang.String r0 = r0.c
            r16 = r1
            r18 = r0
            a34 r0 = defpackage.bx8.b2(r14, r16, r18, r19)
            defpackage.taf.o(r8, r0)
            goto L_0x03c2
        L_0x03a3:
            boolean r1 = r0 instanceof defpackage.wid
            if (r1 == 0) goto L_0x03c2
            wid r0 = (defpackage.wid) r0
            bx8 r1 = defpackage.bx8.c
            q1f r2 = r0.c
            long r2 = r2.a
            ak4 r19 = ak4.b
            r1.getClass()
            java.lang.String r0 = r0.b
            r16 = r2
            r18 = r0
            a34 r0 = defpackage.bx8.b2(r14, r16, r18, r19)
            defpackage.taf.o(r8, r0)
        L_0x03c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zz8.I(int, java.util.List):void");
    }

    public final void J(long j, boolean z, boolean z2, boolean z3) {
        this.D1.remove(Long.valueOf(j));
        if (z) {
            int i = z2 ? c7a.o0 : z3 ? c7a.m0 : c7a.n0;
            hba B = B();
            B.f(new vba(phc.m));
            B.h(new hge(i));
            B.j();
            return;
        }
        hba B2 = B();
        B2.f(new vba(phc.J));
        B2.h(new hge(c7a.p0));
        B2.j();
    }

    public final void K(qod qod) {
        this.m1.o1(this, I1[2], qod);
    }

    public final void p() {
        ((fw) this.o).h();
        sya sya = this.Z;
        e3 e3Var = sya.d;
        k77[] k77Arr = sya.i;
        g37 g37 = (g37) e3Var.T0(sya, k77Arr[0]);
        if (g37 != null) {
            g37.cancel((CancellationException) null);
        }
        sya.d.o1(sya, k77Arr[0], (Object) null);
        sya.e.setValue((Object) null);
        ((nb9) sya.a).s(sya.g);
        this.C1.clear();
        this.D1.clear();
        lz lzVar = this.E0;
        e3 e3Var2 = lzVar.d;
        k77[] k77Arr2 = lz.f;
        g37 g372 = (g37) e3Var2.T0(lzVar, k77Arr2[0]);
        if (g372 != null) {
            g372.cancel((CancellationException) null);
        }
        lzVar.d.o1(lzVar, k77Arr2[0], (Object) null);
        lzVar.e.setValue((Object) null);
    }

    public final void u(long j, j63 j63) {
        taf.n(this, this.Y.b(), (ru3) null, new ux8(this, j63, j, (Continuation) null), 2);
    }

    public final js8 v() {
        i22 i22 = (i22) this.r1.a.getValue();
        if (i22 == null) {
            return null;
        }
        boolean G = i22.G();
        o62 o62 = i22.b;
        if (G) {
            return new fs8(o62.a);
        }
        if (i22.F()) {
            tf3 k = i22.k();
            if (k != null) {
                return new hs8(k.n());
            }
            return null;
        } else if (!i22.J()) {
            return new gs8(o62.a);
        } else {
            tf3 k2 = i22.k();
            if (k2 != null) {
                return new is8(k2.n());
            }
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object w(long r6, java.lang.String r8, long r9, boolean r11, kotlin.coroutines.Continuation r12) {
        /*
            r5 = this;
            boolean r0 = r12 instanceof defpackage.yx8
            if (r0 == 0) goto L_0x0013
            r0 = r12
            yx8 r0 = (defpackage.yx8) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            yx8 r0 = new yx8
            r0.<init>(r5, r12)
        L_0x0018:
            java.lang.Object r12 = r0.X
            pu3 r1 = pu3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.lang.String r8 = r0.o
            wx3.H(r12)
            goto L_0x0092
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            wx3.H(r12)
            t97 r12 = r5.I0
            java.lang.Object r12 = r12.getValue()
            xzc r12 = (defpackage.xzc) r12
            vqc r12 = (defpackage.vqc) r12
            r12.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r2 = ru.ok.tamtam.android.prefs.PmsKey.f85newmediaviewerenabled
            r4 = 0
            boolean r12 = r12.m(r2, r4)
            if (r12 == 0) goto L_0x007b
            bx8 r5 = defpackage.bx8.c
            r5.getClass()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r12 = ":attach/viewer?chat_id="
            r5.<init>(r12)
            r5.append(r6)
            java.lang.String r6 = "&attach_id="
            r5.append(r6)
            r5.append(r8)
            java.lang.String r6 = "&msg_id="
            r5.append(r6)
            r5.append(r9)
            java.lang.String r6 = "&single="
            r5.append(r6)
            r5.append(r11)
            java.lang.String r5 = r5.toString()
            a34 r6 = new a34
            r6.<init>(r5)
            goto L_0x00af
        L_0x007b:
            t97 r5 = r5.U0
            java.lang.Object r5 = r5.getValue()
            sk7 r5 = (defpackage.sk7) r5
            mv9 r5 = defpackage.sk7.a(r5, r9)
            r0.o = r8
            r0.Z = r3
            java.lang.Object r12 = e07.d(r5, r0)
            if (r12 != r1) goto L_0x0092
            return r1
        L_0x0092:
            xm8 r12 = (defpackage.xm8) r12
            xv8 r5 = defpackage.xv8.a
            w4 r5 = r5.getAccessor()
            java.lang.Class<na7> r6 = na7.class
            java.lang.Object r5 = r5.c(r6)
            na7 r5 = (na7) r5
            r5.getClass()
            nr8 r5 = new nr8
            r5.<init>((defpackage.xm8) r12)
            ofa r6 = new ofa
            r6.<init>(r5, r8)
        L_0x00af:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zz8.w(long, java.lang.String, long, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(long r9, kotlin.coroutines.Continuation r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.zx8
            if (r0 == 0) goto L_0x0013
            r0 = r11
            zx8 r0 = (defpackage.zx8) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            zx8 r0 = new zx8
            r0.<init>(r8, r11)
        L_0x0018:
            java.lang.Object r11 = r0.o
            pu3 r1 = pu3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            wx3.H(r11)
            goto L_0x0043
        L_0x0027:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x002f:
            wx3.H(r11)
            t97 r8 = r8.K0
            java.lang.Object r8 = r8.getValue()
            gn8 r8 = (defpackage.gn8) r8
            r0.Y = r3
            java.io.Serializable r11 = r8.c(r9, r0)
            if (r11 != r1) goto L_0x0043
            return r1
        L_0x0043:
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            es r8 = new es
            r9 = 2
            r8.<init>(r9, r11)
            xz6 r9 = new xz6
            r10 = 22
            r9.<init>(r10)
            sg5 r8 = myc.M(r8, r9)
            h87 r9 = new h87
            bn8 r2 = defpackage.bn8.a
            java.lang.Class<bn8> r3 = defpackage.bn8.class
            java.lang.String r4 = "convert"
            r1 = 1
            java.lang.String r5 = "convert$message_list_release(Lru/ok/tamtam/messages/MessageAction;)Lone/me/sdk/contextmenu/ContextMenuAction;"
            r6 = 0
            r7 = 6
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            vqe r10 = new vqe
            r10.<init>(r8, r9)
            java.util.List r8 = myc.U(r10)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zz8.x(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final b29 y() {
        return (b29) this.L0.getValue();
    }

    public final nve z() {
        return (nve) this.W0.getValue();
    }
}
