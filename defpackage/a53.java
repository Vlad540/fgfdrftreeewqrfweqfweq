package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: a53  reason: default package */
public final class a53 {
    public static final /* synthetic */ k77[] m;
    public final long a;
    public final pae b;
    public final t97 c;
    public final t97 d;
    public final t97 e;
    public final t97 f;
    public final long[] g;
    public final grd h;
    public final t0c i;
    public zb9 j = new zb9(10);
    public final ContextScope k;
    public final e3 l;

    static {
        k77 hc9 = new hc9(a53.class, "loadMoreJob", "getLoadMoreJob()Lkotlinx/coroutines/Job;");
        m7c.a.getClass();
        m = new k77[]{hc9};
    }

    public a53(long j2) {
        i6b i6b = i6b.a;
        n3a n3a = (pae) i6b.f().getValue();
        t97 c2 = i6b.c();
        r7e d2 = i6b.getAccessor().d(r43.class);
        t97 b2 = i6b.b();
        r7e d3 = i6b.getAccessor().d(w6a.class);
        this.a = j2;
        this.b = n3a;
        this.c = d3;
        this.d = b2;
        this.e = d2;
        this.f = c2;
        this.g = new long[]{j2};
        grd a2 = hrd.a(c53.a);
        this.h = a2;
        this.i = new t0c(a2);
        ContextScope a3 = n1g.a(n3a.a());
        this.k = a3;
        this.l = hwf.t();
        xs7.E(a3, (hu3) null, (ru3) null, new s43(this, (Continuation) null), 3);
        ez3.N(new ck5(new s0c(((r43) d2.getValue()).c), new zv(2, this, a53.class, "handleEvent", "handleEvent(Lone/me/profile/viewmodel/commonchats/CommonChatsEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 13), 5), a3);
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(defpackage.a53 r17, defpackage.m43 r18, kotlin.coroutines.Continuation r19) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            r17.getClass()
            boolean r3 = r2 instanceof defpackage.u43
            if (r3 == 0) goto L_0x001c
            r3 = r2
            u43 r3 = (defpackage.u43) r3
            int r4 = r3.w0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001c
            int r4 = r4 - r5
            r3.w0 = r4
            goto L_0x0021
        L_0x001c:
            u43 r3 = new u43
            r3.<init>(r0, r2)
        L_0x0021:
            java.lang.Object r2 = r3.Y
            pu3 r4 = pu3.a
            int r5 = r3.w0
            jue r6 = jue.a
            r7 = 6
            r8 = 2
            r9 = 1
            r10 = 0
            if (r5 == 0) goto L_0x0056
            if (r5 == r9) goto L_0x0049
            if (r5 != r8) goto L_0x0041
            m43 r0 = r3.X
            a53 r1 = r3.o
            wx3.H(r2)
            r16 = r1
            r1 = r0
            r0 = r16
            goto L_0x011a
        L_0x0041:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0049:
            m43 r0 = r3.X
            a53 r1 = r3.o
            wx3.H(r2)
            r16 = r2
            r2 = r1
        L_0x0053:
            r1 = r16
            goto L_0x007d
        L_0x0056:
            wx3.H(r2)
            boolean r2 = r1 instanceof defpackage.k43
            pae r5 = r0.b
            if (r2 == 0) goto L_0x00ef
            n3a r5 = (n3a) r5
            ju3 r2 = r5.b()
            v43 r5 = new v43
            r5.<init>(r0, r1, r10)
            r3.o = r0
            r3.X = r1
            r3.w0 = r9
            java.lang.Object r2 = xs7.U(r2, r5, r3)
            if (r2 != r4) goto L_0x0078
            goto L_0x0192
        L_0x0078:
            r16 = r2
            r2 = r0
            r0 = r1
            goto L_0x0053
        L_0x007d:
            r9 = r1
            i22 r9 = (defpackage.i22) r9
            if (r9 != 0) goto L_0x0085
        L_0x0082:
            r4 = r6
            goto L_0x0192
        L_0x0085:
            o62 r1 = r9.b
            java.util.Map r1 = r1.e
            long r3 = r2.a
            java.lang.Long r5 = new java.lang.Long
            r5.<init>(r3)
            boolean r1 = r1.containsKey(r5)
            if (r1 != 0) goto L_0x0097
            goto L_0x0082
        L_0x0097:
            zb9 r1 = r2.j
            k43 r0 = (defpackage.k43) r0
            long r3 = r0.a
            r1.a(r3)
            grd r11 = r2.h
        L_0x00a2:
            java.lang.Object r0 = r11.getValue()
            r1 = r0
            i53 r1 = (defpackage.i53) r1
            g53 r3 = new g53
            r9.h0()
            java.lang.CharSequence r4 = r9.y0
            t97 r5 = r2.c
            java.lang.Object r5 = r5.getValue()
            w6a r5 = (w6a) r5
            o62 r8 = r9.b
            int r8 = r8.c()
            android.content.Context r5 = r5.a
            int r12 = defpackage.fsb.tt_chat_subtitle_count
            java.lang.String r5 = defpackage.dhe.s(r12, r8, r5)
            r3.<init>(r9, r4, r5)
            r1.getClass()
            boolean r4 = r1 instanceof defpackage.d53
            if (r4 == 0) goto L_0x00d4
            r4 = r1
            d53 r4 = (defpackage.d53) r4
            goto L_0x00d5
        L_0x00d4:
            r4 = r10
        L_0x00d5:
            if (r4 != 0) goto L_0x00d8
            goto L_0x00e7
        L_0x00d8:
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.List r5 = r4.a
            r1.<init>(r5)
            r5 = 0
            r1.add(r5, r3)
            d53 r1 = defpackage.d53.a(r4, r1, r7)
        L_0x00e7:
            boolean r0 = r11.b(r0, r1)
            if (r0 == 0) goto L_0x00a2
            goto L_0x0190
        L_0x00ef:
            boolean r2 = r1 instanceof defpackage.l43
            if (r2 == 0) goto L_0x0193
            zb9 r2 = r0.j
            r9 = r1
            l43 r9 = (defpackage.l43) r9
            long r11 = r9.a
            boolean r2 = r2.d(r11)
            if (r2 != 0) goto L_0x0101
            goto L_0x0082
        L_0x0101:
            n3a r5 = (n3a) r5
            ju3 r2 = r5.b()
            w43 r5 = new w43
            r5.<init>(r0, r1, r10)
            r3.o = r0
            r3.X = r1
            r3.w0 = r8
            java.lang.Object r2 = xs7.U(r2, r5, r3)
            if (r2 != r4) goto L_0x011a
            goto L_0x0192
        L_0x011a:
            i22 r2 = (defpackage.i22) r2
            if (r2 != 0) goto L_0x0120
            goto L_0x0082
        L_0x0120:
            o62 r2 = r2.b
            java.util.Map r2 = r2.e
            long r3 = r0.a
            java.lang.Long r5 = new java.lang.Long
            r5.<init>(r3)
            boolean r2 = r2.containsKey(r5)
            if (r2 == 0) goto L_0x0133
            goto L_0x0082
        L_0x0133:
            zb9 r2 = r0.j
            l43 r1 = (defpackage.l43) r1
            long r3 = r1.a
            r2.l(r3)
            grd r0 = r0.h
        L_0x013e:
            java.lang.Object r2 = r0.getValue()
            r3 = r2
            i53 r3 = (defpackage.i53) r3
            r3.getClass()
            boolean r4 = r3 instanceof defpackage.d53
            if (r4 == 0) goto L_0x0150
            r4 = r3
            d53 r4 = (defpackage.d53) r4
            goto L_0x0151
        L_0x0150:
            r4 = r10
        L_0x0151:
            if (r4 != 0) goto L_0x0154
            goto L_0x018a
        L_0x0154:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.List r8 = r4.a
            java.util.Iterator r9 = r8.iterator()
        L_0x015f:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x017b
            java.lang.Object r11 = r9.next()
            r12 = r11
            h53 r12 = (defpackage.h53) r12
            long r12 = r12.getId()
            long r14 = r1.a
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 != 0) goto L_0x0177
            goto L_0x015f
        L_0x0177:
            r5.add(r11)
            goto L_0x015f
        L_0x017b:
            int r9 = r5.size()
            int r8 = r8.size()
            if (r9 != r8) goto L_0x0186
            goto L_0x018a
        L_0x0186:
            d53 r3 = defpackage.d53.a(r4, r5, r7)
        L_0x018a:
            boolean r2 = r0.b(r2, r3)
            if (r2 == 0) goto L_0x013e
        L_0x0190:
            goto L_0x0082
        L_0x0192:
            return r4
        L_0x0193:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a53.a(a53, m43, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0087 A[LOOP:0: B:18:0x0087->B:29:0x00c3, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object b(defpackage.a53 r10, kotlin.coroutines.Continuation r11) {
        /*
            r10.getClass()
            boolean r0 = r11 instanceof defpackage.x43
            if (r0 == 0) goto L_0x0016
            r0 = r11
            x43 r0 = (defpackage.x43) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.w0 = r1
            goto L_0x001b
        L_0x0016:
            x43 r0 = new x43
            r0.<init>(r10, r11)
        L_0x001b:
            java.lang.Object r11 = r0.Y
            pu3 r1 = pu3.a
            int r2 = r0.w0
            jue r3 = jue.a
            java.lang.Class<a53> r4 = defpackage.a53.class
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0044
            if (r2 == r6) goto L_0x003e
            if (r2 != r5) goto L_0x0036
            qn2 r10 = r0.X
            a53 r0 = r0.o
            wx3.H(r11)
            goto L_0x00f4
        L_0x0036:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x003e:
            a53 r10 = r0.o
            wx3.H(r11)
            goto L_0x006a
        L_0x0044:
            wx3.H(r11)
            java.lang.String r11 = r4.getName()
            java.lang.String r2 = "load"
            udd.q(r11, r2)
            r0.o = r10
            r0.w0 = r6
            pae r11 = r10.b
            n3a r11 = (n3a) r11
            ju3 r11 = r11.b()
            t43 r2 = new t43
            r7 = 0
            r2.<init>(r10, r7)
            java.lang.Object r11 = xs7.U(r11, r2, r0)
            if (r11 != r1) goto L_0x006a
            goto L_0x0154
        L_0x006a:
            qn2 r11 = (defpackage.qn2) r11
            java.lang.Class r2 = r10.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "response = "
            r7.<init>(r8)
            r7.append(r11)
            java.lang.String r7 = r7.toString()
            udd.q(r2, r7)
            if (r11 != 0) goto L_0x00c8
        L_0x0087:
            grd r11 = r10.h
            java.lang.Object r0 = r11.getValue()
            r1 = r0
            i53 r1 = (defpackage.i53) r1
            boolean r2 = r1 instanceof defpackage.d53
            if (r2 == 0) goto L_0x00bd
            d53 r1 = (defpackage.d53) r1
            java.util.List r2 = r1.a
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x00a1:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x00b7
            java.lang.Object r5 = r2.next()
            r7 = r5
            h53 r7 = (defpackage.h53) r7
            boolean r7 = r7 instanceof defpackage.f53
            r7 = r7 ^ r6
            if (r7 == 0) goto L_0x00a1
            r4.add(r5)
            goto L_0x00a1
        L_0x00b7:
            r2 = 4
            d53 r1 = defpackage.d53.a(r1, r4, r2)
            goto L_0x00bf
        L_0x00bd:
            b53 r1 = defpackage.b53.a
        L_0x00bf:
            boolean r11 = r11.b(r0, r1)
            if (r11 == 0) goto L_0x0087
        L_0x00c5:
            r1 = r3
            goto L_0x0154
        L_0x00c8:
            java.lang.String r2 = r4.getName()
            java.util.List r4 = r11.c
            int r6 = r4.size()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "response chats count = "
            r7.<init>(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            udd.q(r2, r6)
            r0.o = r10
            r0.X = r11
            r0.w0 = r5
            java.io.Serializable r0 = r10.c(r4, r0)
            if (r0 != r1) goto L_0x00f0
            goto L_0x0154
        L_0x00f0:
            r9 = r0
            r0 = r10
            r10 = r11
            r11 = r9
        L_0x00f4:
            java.util.LinkedHashSet r11 = (java.util.LinkedHashSet) r11
            boolean r1 = r10.o
            if (r1 == 0) goto L_0x00ff
            f53 r1 = defpackage.f53.a
            r11.add(r1)
        L_0x00ff:
            java.util.List r11 = o23.s0(r11)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r11 = r11.iterator()
        L_0x0111:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto L_0x0131
            java.lang.Object r4 = r11.next()
            r5 = r4
            h53 r5 = (defpackage.h53) r5
            long r5 = r5.getId()
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r5)
            boolean r5 = r1.add(r7)
            if (r5 == 0) goto L_0x0111
            r2.add(r4)
            goto L_0x0111
        L_0x0131:
            grd r11 = r0.h
        L_0x0133:
            java.lang.Object r0 = r11.getValue()
            r1 = r0
            i53 r1 = (defpackage.i53) r1
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L_0x0143
            b53 r1 = defpackage.b53.a
            goto L_0x014c
        L_0x0143:
            d53 r1 = new d53
            boolean r4 = r10.o
            java.lang.Long r5 = r10.X
            r1.<init>(r5, r2, r4)
        L_0x014c:
            boolean r0 = r11.b(r0, r1)
            if (r0 == 0) goto L_0x0133
            goto L_0x00c5
        L_0x0154:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a53.b(a53, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.Serializable c(java.util.List r13, kotlin.coroutines.Continuation r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof defpackage.z43
            if (r0 == 0) goto L_0x0013
            r0 = r14
            z43 r0 = (defpackage.z43) r0
            int r1 = r0.y0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.y0 = r1
            goto L_0x0018
        L_0x0013:
            z43 r0 = new z43
            r0.<init>(r12, r14)
        L_0x0018:
            java.lang.Object r14 = r0.w0
            pu3 r1 = pu3.a
            int r2 = r0.y0
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.util.Iterator r12 = r0.Z
            java.util.LinkedHashSet r13 = r0.Y
            zb9 r2 = r0.X
            a53 r5 = r0.o
            wx3.H(r14)
            r11 = r5
            r5 = r13
            r13 = r11
            goto L_0x00a4
        L_0x0034:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x003c:
            wx3.H(r14)
            zb9 r14 = new zb9
            zb9 r2 = r12.j
            int r2 = r2.d
            r14.<init>(r2)
            zb9 r2 = r12.j
            r14.b(r2)
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            grd r5 = r12.h
            java.lang.Object r5 = r5.getValue()
            i53 r5 = (defpackage.i53) r5
            boolean r6 = r5 instanceof defpackage.d53
            if (r6 == 0) goto L_0x005e
            d53 r5 = (defpackage.d53) r5
            goto L_0x005f
        L_0x005e:
            r5 = r4
        L_0x005f:
            if (r5 == 0) goto L_0x0066
            java.util.List r5 = r5.a
            if (r5 == 0) goto L_0x0066
            goto L_0x0068
        L_0x0066:
            hw4 r5 = hw4.a
        L_0x0068:
            r2.<init>(r5)
            f53 r5 = defpackage.f53.a
            r2.remove(r5)
            java.util.Iterator r13 = r13.iterator()
            r11 = r13
            r13 = r12
            r12 = r11
        L_0x0077:
            boolean r5 = r12.hasNext()
            if (r5 == 0) goto L_0x00e3
            java.lang.Object r5 = r12.next()
            j22 r5 = (defpackage.j22) r5
            t97 r6 = r13.f
            java.lang.Object r6 = r6.getValue()
            bv2 r6 = (defpackage.bv2) r6
            long r7 = r5.a
            r0.o = r13
            r0.X = r14
            r0.Y = r2
            r0.Z = r12
            r0.y0 = r3
            aw2 r6 = (defpackage.aw2) r6
            java.lang.Object r5 = r6.k(r7, r0)
            if (r5 != r1) goto L_0x00a0
            return r1
        L_0x00a0:
            r11 = r2
            r2 = r14
            r14 = r5
            r5 = r11
        L_0x00a4:
            i22 r14 = (defpackage.i22) r14
            if (r14 != 0) goto L_0x00aa
        L_0x00a8:
            r6 = r4
            goto L_0x00db
        L_0x00aa:
            o62 r6 = r14.b
            int r6 = r6.c()
            if (r6 != 0) goto L_0x00b3
            goto L_0x00a8
        L_0x00b3:
            long r6 = r14.a
            r2.a(r6)
            r13.getClass()
            g53 r6 = new g53
            r14.h0()
            java.lang.CharSequence r7 = r14.y0
            t97 r8 = r13.c
            java.lang.Object r8 = r8.getValue()
            w6a r8 = (w6a) r8
            o62 r9 = r14.b
            int r9 = r9.c()
            android.content.Context r8 = r8.a
            int r10 = defpackage.fsb.tt_chat_subtitle_count
            java.lang.String r8 = defpackage.dhe.s(r10, r9, r8)
            r6.<init>(r14, r7, r8)
        L_0x00db:
            if (r6 == 0) goto L_0x00e0
            r5.add(r6)
        L_0x00e0:
            r14 = r2
            r2 = r5
            goto L_0x0077
        L_0x00e3:
            r13.j = r14
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a53.c(java.util.List, kotlin.coroutines.Continuation):java.io.Serializable");
    }
}
