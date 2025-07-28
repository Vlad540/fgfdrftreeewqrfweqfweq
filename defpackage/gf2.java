package defpackage;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: gf2  reason: default package */
public final class gf2 extends taf implements hu, t78 {
    public static final /* synthetic */ k77[] V0;
    public final r7e A0 = new r7e(new p22(14));
    public final t97 B0;
    public final yzc C0;
    public final kb5 D0;
    public final t97 E0;
    public final AtomicReference F0;
    public final t97 G0;
    public final e3 H0;
    public final e3 I0;
    public final e3 J0;
    public final r7e K0;
    public final r7e L0;
    public final grd M0;
    public final grd N0;
    public final l05 O0;
    public final r7e P0;
    public final r7e Q0;
    public final mb1 R0;
    public final grd S0;
    public final t0c T0;
    public final t97 U0;
    public final to8 X;
    public final pk Y;
    public final tt0 Z;
    public final long b;
    public final ie2 c;
    public final bv2 o;
    public final t97 w0;
    public final t97 x0;
    public final t97 y0;
    public final t97 z0;

    static {
        Class<gf2> cls = gf2.class;
        V0 = new k77[]{new hc9(cls, "attachClickJob", "getAttachClickJob()Lkotlinx/coroutines/Job;"), c3d.g(m7c.a, cls, "confirmationBottomSheetJob", "getConfirmationBottomSheetJob()Lkotlinx/coroutines/Job;"), new hc9(cls, "editMessageJob", "getEditMessageJob()Lkotlinx/coroutines/Job;")};
    }

    public gf2(long j, ie2 ie2, kc2 kc2) {
        ie2 ie22 = ie2;
        i6b i6b = i6b.a;
        r7e d = i6b.getAccessor().d(sk7.class);
        r7e d2 = i6b.getAccessor().d(yr4.class);
        r7e d3 = i6b.getAccessor().d(ap8.class);
        r7e d4 = i6b.getAccessor().d(hc5.class);
        t97 f = i6b.f();
        t97 d5 = i6b.getAccessor().d(r10.class);
        r7e d6 = i6b.getAccessor().d(sya.class);
        hb2 hb2 = (hb2) i6b.getAccessor().d(hb2.class).getValue();
        t52 t52 = (t52) i6b.getAccessor().c(t52.class);
        g2b g2b = (g2b) i6b.getAccessor().c(g2b.class);
        gn8 gn8 = (gn8) i6b.getAccessor().c(gn8.class);
        t97 t97 = f;
        lce lce = (lce) i6b.getAccessor().c(lce.class);
        mbe mbe = (mbe) i6b.getAccessor().c(mbe.class);
        g15 g15 = (g15) i6b.getAccessor().d(g15.class).getValue();
        tt0 tt0 = (tt0) i6b.getAccessor().c(tt0.class);
        r7e d7 = i6b.getAccessor().d(hba.class);
        this.b = j;
        this.c = ie22;
        this.o = (bv2) i6b.c().getValue();
        this.X = (to8) i6b.getAccessor().c(to8.class);
        this.Y = (pk) i6b.b().getValue();
        this.Z = tt0;
        this.w0 = d;
        this.x0 = d2;
        this.y0 = d3;
        this.z0 = d4;
        this.B0 = d7;
        j2b j2b = (j2b) g2b;
        this.C0 = j2b.b;
        this.D0 = j2b.e;
        this.E0 = d6;
        this.F0 = new AtomicReference((Object) null);
        this.G0 = t97;
        this.H0 = hwf.t();
        this.I0 = hwf.t();
        this.J0 = hwf.t();
        this.K0 = new r7e(new p22(15));
        this.L0 = new r7e(new x2(gn8, 21, g2b));
        this.M0 = hrd.a(new wb9());
        this.N0 = hrd.a(new wb9());
        this.O0 = new l05(0);
        tt0 tt02 = tt0;
        s16 s16 = r0;
        s16 z41 = new z41(this, t52, hb2, g2b, lce, mbe, g15, 1);
        this.P0 = new r7e(s16);
        this.Q0 = new r7e(new nl1(8, this));
        this.R0 = new mb1(1, this);
        grd a = hrd.a(le2.d);
        this.S0 = a;
        this.T0 = new t0c(a);
        this.U0 = ez3.O(3, new cp(g2b, hb2, d5, (t97) d6));
        i22 v = v();
        xm8 xm8 = v != null ? v.c : null;
        if (xm8 != null) {
            tt02.d(this);
            if (ie22 == ie2.b) {
                sya sya = (sya) d6.getValue();
                ((nb9) sya.a).e(sya.g);
                sya.b();
            }
            vc2 x = x();
            if (x != null) {
                x.X.a(x.c.b(new bu(x, xm8, 0)));
                x.Z = this;
            }
            ez3.N(ez3.J(new ck5(new bc(new ik5(new t0c(t52.I(j)), 2), 10, this), new ke2(this, (Continuation) null), 5), w().a()), this.a);
            ez3.N(ez3.J(new ck5(new s0c(kc2.b), new zv(2, this, gf2.class, "handleChatMediaEvent", "handleChatMediaEvent(Lone/me/profile/screens/media/ChatMediaEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 7), 5), w().a()), this.a);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0062, code lost:
        r12 = (defpackage.xm8) r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0064, code lost:
        if (r12 != null) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0069, code lost:
        r10 = r10.x();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006d, code lost:
        if (r10 == null) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006f, code lost:
        r10.X.a(r10.c.b(new defpackage.bu(r10, r12, 0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b7, code lost:
        if (((wb9) r10.M0.getValue()).b(((defpackage.dc2) r11).a) != false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ba, code lost:
        r11 = r10.w().c();
        r12 = new defpackage.te2(r10, (kotlin.coroutines.Continuation) null);
        r0.o = null;
        r0.X = null;
        r0.w0 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d4, code lost:
        if (xs7.U(r11, r12, r0) != r1) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0101, code lost:
        if (((wb9) r10.M0.getValue()).b(((defpackage.ec2) r11).a) != false) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0105, code lost:
        r11 = r10.w().c();
        r12 = new defpackage.ue2(r10, (kotlin.coroutines.Continuation) null);
        r0.o = null;
        r0.X = null;
        r0.w0 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x011f, code lost:
        if (xs7.U(r11, r12, r0) != r1) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        return r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object q(defpackage.gf2 r10, defpackage.ic2 r11, kotlin.coroutines.Continuation r12) {
        /*
            r10.getClass()
            boolean r0 = r12 instanceof defpackage.se2
            if (r0 == 0) goto L_0x0016
            r0 = r12
            se2 r0 = (defpackage.se2) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.w0 = r1
            goto L_0x001b
        L_0x0016:
            se2 r0 = new se2
            r0.<init>(r10, r12)
        L_0x001b:
            java.lang.Object r12 = r0.Y
            pu3 r1 = pu3.a
            int r2 = r0.w0
            jue r3 = jue.a
            r4 = 0
            switch(r2) {
                case 0: goto L_0x004a;
                case 1: goto L_0x0044;
                case 2: goto L_0x003c;
                case 3: goto L_0x0038;
                case 4: goto L_0x002f;
                case 5: goto L_0x0038;
                case 6: goto L_0x0038;
                default: goto L_0x0027;
            }
        L_0x0027:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x002f:
            ic2 r11 = r0.X
            gf2 r10 = r0.o
            wx3.H(r12)
            goto L_0x00f1
        L_0x0038:
            wx3.H(r12)
            goto L_0x0066
        L_0x003c:
            ic2 r11 = r0.X
            gf2 r10 = r0.o
            wx3.H(r12)
            goto L_0x00a7
        L_0x0044:
            gf2 r10 = r0.o
            wx3.H(r12)
            goto L_0x0062
        L_0x004a:
            wx3.H(r12)
            boolean r12 = r11 instanceof defpackage.cc2
            if (r12 == 0) goto L_0x0081
            cc2 r11 = (defpackage.cc2) r11
            long r11 = r11.a
            r0.o = r10
            r2 = 1
            r0.w0 = r2
            java.lang.Object r12 = r10.y(r11, r0)
            if (r12 != r1) goto L_0x0062
            goto L_0x01dd
        L_0x0062:
            xm8 r12 = (defpackage.xm8) r12
            if (r12 != 0) goto L_0x0069
        L_0x0066:
            r1 = r3
            goto L_0x01dd
        L_0x0069:
            vc2 r10 = r10.x()
            if (r10 == 0) goto L_0x0066
            bu r11 = new bu
            r0 = 0
            r11.<init>(r10, r12, r0)
            qmc r12 = r10.c
            xi4 r11 = r12.b(r11)
            n83 r10 = r10.X
            r10.a(r11)
            goto L_0x0066
        L_0x0081:
            boolean r12 = r11 instanceof defpackage.dc2
            if (r12 == 0) goto L_0x00d8
            r12 = r11
            dc2 r12 = (defpackage.dc2) r12
            long r5 = r12.a
            grd r2 = r10.N0
            java.lang.Object r2 = r2.getValue()
            wb9 r2 = (wb9) r2
            long r7 = r12.a
            boolean r12 = r2.b(r7)
            r0.o = r10
            r0.X = r11
            r2 = 2
            r0.w0 = r2
            java.lang.Object r12 = r10.B(r5, r12, r0)
            if (r12 != r1) goto L_0x00a7
            goto L_0x01dd
        L_0x00a7:
            grd r12 = r10.M0
            java.lang.Object r12 = r12.getValue()
            wb9 r12 = (wb9) r12
            dc2 r11 = (defpackage.dc2) r11
            long r5 = r11.a
            boolean r11 = r12.b(r5)
            if (r11 != 0) goto L_0x00ba
            goto L_0x0066
        L_0x00ba:
            pae r11 = r10.w()
            n3a r11 = (n3a) r11
            zr7 r11 = r11.c()
            te2 r12 = new te2
            r12.<init>(r10, r4)
            r0.o = r4
            r0.X = r4
            r10 = 3
            r0.w0 = r10
            java.lang.Object r10 = xs7.U(r11, r12, r0)
            if (r10 != r1) goto L_0x0066
            goto L_0x01dd
        L_0x00d8:
            boolean r12 = r11 instanceof defpackage.ec2
            r2 = 0
            if (r12 == 0) goto L_0x0123
            r12 = r11
            ec2 r12 = (defpackage.ec2) r12
            long r5 = r12.a
            r0.o = r10
            r0.X = r11
            r12 = 4
            r0.w0 = r12
            java.lang.Object r12 = r10.B(r5, r2, r0)
            if (r12 != r1) goto L_0x00f1
            goto L_0x01dd
        L_0x00f1:
            grd r12 = r10.M0
            java.lang.Object r12 = r12.getValue()
            wb9 r12 = (wb9) r12
            ec2 r11 = (defpackage.ec2) r11
            long r5 = r11.a
            boolean r11 = r12.b(r5)
            if (r11 != 0) goto L_0x0105
            goto L_0x0066
        L_0x0105:
            pae r11 = r10.w()
            n3a r11 = (n3a) r11
            zr7 r11 = r11.c()
            ue2 r12 = new ue2
            r12.<init>(r10, r4)
            r0.o = r4
            r0.X = r4
            r10 = 5
            r0.w0 = r10
            java.lang.Object r10 = xs7.U(r11, r12, r0)
            if (r10 != r1) goto L_0x0066
            goto L_0x01dd
        L_0x0123:
            boolean r12 = r11 instanceof defpackage.gc2
            if (r12 == 0) goto L_0x0152
            grd r12 = r10.M0
            java.lang.Object r12 = r12.getValue()
            wb9 r12 = (wb9) r12
            gc2 r11 = (defpackage.gc2) r11
            long r4 = r11.a
            long[] r6 = r12.a
            int r12 = r12.b
            r7 = r2
        L_0x0138:
            if (r7 >= r12) goto L_0x0145
            r8 = r6[r7]
            int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r8 != 0) goto L_0x0142
            goto L_0x0066
        L_0x0142:
            int r7 = r7 + 1
            goto L_0x0138
        L_0x0145:
            r12 = 6
            r0.w0 = r12
            long r11 = r11.a
            java.lang.Object r10 = r10.B(r11, r2, r0)
            if (r10 != r1) goto L_0x0066
            goto L_0x01dd
        L_0x0152:
            boolean r12 = r11 instanceof defpackage.fc2
            if (r12 == 0) goto L_0x01de
            t0c r12 = r10.T0
            zqd r12 = r12.a
            java.lang.Object r12 = r12.getValue()
            le2 r12 = (defpackage.le2) r12
            java.util.List r12 = r12.a
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = q23.H(r12, r1)
            r0.<init>(r1)
            java.util.Iterator r12 = r12.iterator()
        L_0x0171:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x018a
            java.lang.Object r1 = r12.next()
            rh8 r1 = (defpackage.rh8) r1
            long r1 = r1.j()
            java.lang.Long r4 = new java.lang.Long
            r4.<init>(r1)
            r0.add(r4)
            goto L_0x0171
        L_0x018a:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0193:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01b8
            java.lang.Object r1 = r0.next()
            r2 = r1
            java.lang.Number r2 = (java.lang.Number) r2
            long r4 = r2.longValue()
            r2 = r11
            fc2 r2 = (defpackage.fc2) r2
            java.util.List r2 = r2.a
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r4)
            boolean r2 = r2.contains(r6)
            if (r2 == 0) goto L_0x0193
            r12.add(r1)
            goto L_0x0193
        L_0x01b8:
            java.util.Set r11 = o23.w0(r12)
            boolean r12 = r11.isEmpty()
            if (r12 == 0) goto L_0x01c4
            goto L_0x0066
        L_0x01c4:
            vc2 r10 = r10.x()
            if (r10 == 0) goto L_0x0066
            c r12 = new c
            r0 = 4
            r12.<init>(r10, r0, r11)
            qmc r11 = r10.c
            xi4 r11 = r11.b(r12)
            n83 r10 = r10.X
            r10.a(r11)
            goto L_0x0066
        L_0x01dd:
            return r1
        L_0x01de:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gf2.q(gf2, ic2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object r(defpackage.gf2 r18, defpackage.oh8 r19, kotlin.coroutines.Continuation r20) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            boolean r3 = r2 instanceof defpackage.df2
            if (r3 == 0) goto L_0x0019
            r3 = r2
            df2 r3 = (defpackage.df2) r3
            int r4 = r3.w0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.w0 = r4
            goto L_0x001e
        L_0x0019:
            df2 r3 = new df2
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r2 = r3.Y
            pu3 r14 = pu3.a
            int r4 = r3.w0
            jue r15 = jue.a
            r5 = 1
            r13 = 2
            r6 = 3
            r7 = 4
            if (r4 == 0) goto L_0x0054
            if (r4 == r5) goto L_0x0049
            if (r4 == r13) goto L_0x0042
            if (r4 == r6) goto L_0x003d
            if (r4 != r7) goto L_0x0035
            goto L_0x003d
        L_0x0035:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003d:
            wx3.H(r2)
            goto L_0x00ec
        L_0x0042:
            gf2 r0 = r3.o
            wx3.H(r2)
            goto L_0x00dc
        L_0x0049:
            long r0 = r3.X
            gf2 r4 = r3.o
            wx3.H(r2)
            r5 = r0
            r0 = r4
            r1 = r13
            goto L_0x00a4
        L_0x0054:
            wx3.H(r2)
            i22 r2 = r18.v()
            if (r2 == 0) goto L_0x00ec
            nh8 r4 = r1.z0
            boolean r8 = r4 instanceof defpackage.kh8
            t97 r9 = r0.z0
            long r11 = r2.a
            if (r8 == 0) goto L_0x00ee
            java.lang.Object r2 = r9.getValue()
            r4 = r2
            hc5 r4 = (defpackage.hc5) r4
            int r2 = r1.y0
            int r2 = hr1.t(r2)
            if (r2 == 0) goto L_0x0084
            if (r2 == r5) goto L_0x0082
            if (r2 != r13) goto L_0x007c
            r2 = r6
            goto L_0x0085
        L_0x007c:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0082:
            r2 = r13
            goto L_0x0085
        L_0x0084:
            r2 = r5
        L_0x0085:
            r3.o = r0
            r3.X = r11
            r3.w0 = r5
            long r7 = r1.b
            java.lang.String r9 = r1.w0
            java.lang.String r10 = r1.X
            java.lang.String r1 = r1.x0
            r5 = r11
            r16 = r11
            r11 = r1
            r12 = r2
            r1 = r13
            r13 = r3
            java.lang.Object r2 = r4.a(r5, r7, r9, r10, r11, r12, r13)
            if (r2 != r14) goto L_0x00a2
            goto L_0x0148
        L_0x00a2:
            r5 = r16
        L_0x00a4:
            nfa r2 = (defpackage.nfa) r2
            kfa r4 = defpackage.kfa.a
            boolean r4 = hhd.f(r2, r4)
            if (r4 != 0) goto L_0x00ec
            boolean r4 = r2 instanceof defpackage.lfa
            if (r4 == 0) goto L_0x00c3
            l05 r0 = r0.O0
            id2 r1 = new id2
            lfa r2 = (defpackage.lfa) r2
            android.content.Intent r3 = r2.a
            android.net.Uri r2 = r2.b
            r1.<init>(r3, r2)
            defpackage.taf.o(r0, r1)
            goto L_0x00ec
        L_0x00c3:
            boolean r4 = r2 instanceof defpackage.mfa
            if (r4 == 0) goto L_0x00e6
            mfa r2 = (defpackage.mfa) r2
            java.lang.String r7 = r2.b
            r3.o = r0
            r3.w0 = r1
            r10 = 1
            long r8 = r2.a
            r4 = r0
            r11 = r3
            java.lang.Object r2 = r4.z(r5, r7, r8, r10, r11)
            if (r2 != r14) goto L_0x00dc
            goto L_0x0148
        L_0x00dc:
            qd2 r2 = (defpackage.qd2) r2
            if (r2 == 0) goto L_0x00ec
            l05 r0 = r0.O0
            defpackage.taf.o(r0, r2)
            goto L_0x00ec
        L_0x00e6:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00ec:
            r14 = r15
            goto L_0x0148
        L_0x00ee:
            r16 = r11
            boolean r2 = r4 instanceof defpackage.lh8
            grd r0 = r0.N0
            long r10 = r1.b
            if (r2 == 0) goto L_0x011a
            java.lang.Object r0 = r0.getValue()
            wb9 r0 = (wb9) r0
            r0.b(r10)
            java.lang.Object r0 = r9.getValue()
            r4 = r0
            hc5 r4 = (defpackage.hc5) r4
            r3.w0 = r6
            java.lang.String r11 = r1.w0
            long r7 = r1.b
            long r9 = r1.c
            r5 = r16
            r12 = r3
            java.lang.Object r0 = r4.b(r5, r7, r9, r11, r12)
            if (r0 != r14) goto L_0x00ec
            goto L_0x0148
        L_0x011a:
            boolean r2 = r4 instanceof defpackage.mh8
            if (r2 == 0) goto L_0x0142
            java.lang.Object r0 = r0.getValue()
            wb9 r0 = (wb9) r0
            r0.a(r10)
            java.lang.Object r0 = r9.getValue()
            r4 = r0
            hc5 r4 = (defpackage.hc5) r4
            r3.w0 = r7
            long r7 = r1.b
            long r9 = r1.c
            java.lang.String r11 = r1.w0
            java.lang.String r12 = r1.X
            r5 = r16
            r13 = r3
            java.lang.Object r0 = r4.c(r5, r7, r9, r11, r12, r13)
            if (r0 != r14) goto L_0x00ec
            goto L_0x0148
        L_0x0142:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0148:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gf2.r(gf2, oh8, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void s(gf2 gf2) {
        hba hba = (hba) gf2.B0.getValue();
        hba.h(new hge(l8a.R1));
        hba.f(new vba(phc.J));
        hba.j();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object t(defpackage.gf2 r7, java.util.List r8, kotlin.coroutines.Continuation r9) {
        /*
            r7.getClass()
            boolean r0 = r9 instanceof defpackage.ff2
            if (r0 == 0) goto L_0x0016
            r0 = r9
            ff2 r0 = (defpackage.ff2) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.w0 = r1
            goto L_0x001b
        L_0x0016:
            ff2 r0 = new ff2
            r0.<init>(r7, r9)
        L_0x001b:
            java.lang.Object r9 = r0.Y
            pu3 r1 = pu3.a
            int r2 = r0.w0
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            long r7 = r0.X
            gf2 r0 = r0.o
            wx3.H(r9)
            goto L_0x00a1
        L_0x002f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0037:
            wx3.H(r9)
            grd r9 = r7.S0
            java.lang.Object r9 = r9.getValue()
            le2 r9 = (defpackage.le2) r9
            java.util.List r9 = r9.a
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x00b8
            ie2 r9 = defpackage.ie2.a
            ie2 r2 = r7.c
            if (r2 != r9) goto L_0x00b8
            int r9 = r8.size()
            java.util.ListIterator r8 = r8.listIterator(r9)
        L_0x0058:
            boolean r9 = r8.hasPrevious()
            r2 = 0
            if (r9 == 0) goto L_0x0077
            java.lang.Object r9 = r8.previous()
            r4 = r9
            rg6 r4 = (defpackage.rg6) r4
            boolean r5 = r4 instanceof defpackage.xm8
            if (r5 == 0) goto L_0x0058
            xm8 r4 = (defpackage.xm8) r4
            vo8 r4 = r4.a
            if (r4 == 0) goto L_0x0058
            boolean r4 = r4.m()
            if (r4 != r3) goto L_0x0058
            goto L_0x0078
        L_0x0077:
            r9 = r2
        L_0x0078:
            boolean r8 = r9 instanceof defpackage.xm8
            if (r8 == 0) goto L_0x007f
            r2 = r9
            xm8 r2 = (defpackage.xm8) r2
        L_0x007f:
            if (r2 == 0) goto L_0x0086
            vo8 r8 = r2.a
            long r8 = r8.b
            goto L_0x0088
        L_0x0086:
            r8 = 0
        L_0x0088:
            java.util.HashSet r2 = defpackage.e00.H0
            r0.o = r7
            r0.X = r8
            r0.w0 = r3
            bv2 r3 = r7.o
            aw2 r3 = (defpackage.aw2) r3
            long r4 = r7.b
            java.lang.Object r0 = r3.t(r4, r2, r0)
            if (r0 != r1) goto L_0x009d
            goto L_0x00ba
        L_0x009d:
            r6 = r0
            r0 = r7
            r7 = r8
            r9 = r6
        L_0x00a1:
            b62 r9 = (defpackage.b62) r9
            long r1 = r9.d
            int r9 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r9 == 0) goto L_0x00b8
            bv2 r9 = r0.o
            je2 r1 = new je2
            r2 = 0
            r1.<init>(r7, r2)
            aw2 r9 = (defpackage.aw2) r9
            long r7 = r0.b
            r9.f(r7, r1)
        L_0x00b8:
            jue r1 = jue.a
        L_0x00ba:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gf2.t(gf2, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b7, code lost:
        r15 = (defpackage.r78) r2.U0.getValue();
        r12 = (java.util.Set) r2.Q0.getValue();
        r4.o = r2;
        r4.X = r0;
        r4.Y = r1;
        r4.Z = r9;
        r4.w0 = r8;
        r4.x0 = r8;
        r4.y0 = r7;
        r4.B0 = r6;
        r15.getClass();
        r13 = r2.c.ordinal();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e3, code lost:
        if (r13 == 0) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00e5, code lost:
        if (r13 == r6) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e7, code lost:
        if (r13 == 2) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e9, code lost:
        if (r13 != 3) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00eb, code lost:
        r10 = r15.a(r11, r12, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ef, code lost:
        r18 = r1;
        r23 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00fa, code lost:
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00fb, code lost:
        r10 = r15.c(r11, r12, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0100, code lost:
        r10 = r15.b(r11, r12, r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0105, code lost:
        r13 = r11.a.D0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0109, code lost:
        if (r13 == null) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x010b, code lost:
        r13 = (java.util.List) r13.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x010f, code lost:
        if (r13 == null) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0111, code lost:
        r14 = new java.util.ArrayList();
        r13 = r13.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x011e, code lost:
        if (r13.hasNext() == false) goto L_0x0166;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0120, code lost:
        r5 = r13.next();
        r6 = (defpackage.o10) r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0131, code lost:
        if (r12.contains(r6.a.toString()) == false) goto L_0x0162;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0135, code lost:
        if (r6.s != false) goto L_0x0162;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0137, code lost:
        r18 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x013d, code lost:
        if (r6.a == defpackage.j10.o) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x013f, code lost:
        r6 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0149, code lost:
        if (((defpackage.kb5) r15.d).u() != false) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0150, code lost:
        if (r6.i() == false) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0152, code lost:
        r1 = r6.d.b;
        r6 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0157, code lost:
        if (r1 == 2) goto L_0x015c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0159, code lost:
        r14.add(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x015c, code lost:
        r10 = r6;
        r1 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0162, code lost:
        r18 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0164, code lost:
        r6 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0166, code lost:
        r18 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0169, code lost:
        r18 = r1;
        r14 = hw4.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0172, code lost:
        if (r14.size() <= 1) goto L_0x0176;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0174, code lost:
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0176, code lost:
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0177, code lost:
        r1 = n1g.a(r4.b);
        r5 = new java.util.ArrayList(q23.H(r14, 10));
        r6 = r14.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0190, code lost:
        if (r6.hasNext() == false) goto L_0x01bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0192, code lost:
        r13 = r6.next();
        r21 = r6;
        r6 = r12;
        r19 = r15;
        r12 = new defpackage.q78(r13, (kotlin.coroutines.Continuation) null, r11, r10, r19);
        r5.add(xs7.d(r1, (ju3) null, r6, 3));
        r6 = r21;
        r2 = r2;
        r15 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01bc, code lost:
        r23 = r2;
        r10 = lp.c(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01c3, code lost:
        if (r10 != r3) goto L_0x01c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01c5, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01c6, code lost:
        r11 = r23;
        r1 = r4;
        r2 = r7;
        r4 = r8;
        r7 = r4;
        r8 = r9;
        r9 = r18;
        r20 = r10;
        r10 = r0;
        r0 = r20;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0216  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A(java.util.List r22, java.lang.Long r23, kotlin.coroutines.Continuation r24) {
        /*
            r21 = this;
            r0 = r24
            boolean r1 = r0 instanceof defpackage.re2
            if (r1 == 0) goto L_0x0017
            r1 = r0
            re2 r1 = (defpackage.re2) r1
            int r2 = r1.B0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.B0 = r2
            r2 = r21
            goto L_0x001e
        L_0x0017:
            re2 r1 = new re2
            r2 = r21
            r1.<init>(r2, r0)
        L_0x001e:
            java.lang.Object r0 = r1.z0
            pu3 r3 = pu3.a
            int r4 = r1.B0
            r5 = -1
            r6 = 1
            if (r4 == 0) goto L_0x0045
            if (r4 != r6) goto L_0x003d
            int r2 = r1.y0
            java.util.ArrayList r4 = r1.x0
            java.util.ArrayList r7 = r1.w0
            java.util.List r8 = r1.Z
            java.lang.Long r9 = r1.Y
            java.util.List r10 = r1.X
            gf2 r11 = r1.o
            wx3.H(r0)
            goto L_0x01d4
        L_0x003d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0045:
            wx3.H(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r22.iterator()
        L_0x0051:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x0063
            java.lang.Object r7 = r4.next()
            boolean r8 = r7 instanceof defpackage.xm8
            if (r8 == 0) goto L_0x0051
            r0.add(r7)
            goto L_0x0051
        L_0x0063:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r7 = r0.size()
            int r7 = r7 - r6
            r9 = r0
            r8 = r4
            r0 = r22
            r4 = r1
            r1 = r23
        L_0x0074:
            if (r5 >= r7) goto L_0x01eb
            java.lang.Object r11 = r9.get(r7)
            xm8 r11 = (defpackage.xm8) r11
            r7e r12 = r2.Q0
            java.lang.Object r12 = r12.getValue()
            java.util.Set r12 = (java.util.Set) r12
            vo8 r13 = r11.a
            jj7 r13 = r13.D0
            if (r13 != 0) goto L_0x0090
        L_0x008a:
            r18 = r1
            r23 = r2
            goto L_0x01e2
        L_0x0090:
            java.lang.Object r13 = r13.a
            java.util.List r13 = (java.util.List) r13
            boolean r14 = r13.isEmpty()
            if (r14 == 0) goto L_0x009b
            goto L_0x008a
        L_0x009b:
            java.util.Iterator r13 = r13.iterator()
        L_0x009f:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x008a
            java.lang.Object r14 = r13.next()
            o10 r14 = (defpackage.o10) r14
            j10 r14 = r14.a
            java.lang.String r14 = r14.toString()
            boolean r14 = r12.contains(r14)
            if (r14 == 0) goto L_0x009f
            t97 r12 = r2.U0
            java.lang.Object r12 = r12.getValue()
            r15 = r12
            r78 r15 = (defpackage.r78) r15
            r7e r12 = r2.Q0
            java.lang.Object r12 = r12.getValue()
            java.util.Set r12 = (java.util.Set) r12
            r4.o = r2
            r4.X = r0
            r4.Y = r1
            r4.Z = r9
            r4.w0 = r8
            r4.x0 = r8
            r4.y0 = r7
            r4.B0 = r6
            r15.getClass()
            ie2 r13 = r2.c
            int r13 = r13.ordinal()
            r14 = 3
            r10 = 2
            if (r13 == 0) goto L_0x0105
            if (r13 == r6) goto L_0x0100
            if (r13 == r10) goto L_0x00fb
            if (r13 != r14) goto L_0x00f5
            java.lang.Object r10 = r15.a(r11, r12, r4)
        L_0x00ef:
            r18 = r1
            r23 = r2
            goto L_0x01c3
        L_0x00f5:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00fb:
            java.lang.Object r10 = r15.c(r11, r12, r4)
            goto L_0x00ef
        L_0x0100:
            java.lang.Object r10 = r15.b(r11, r12, r1, r4)
            goto L_0x00ef
        L_0x0105:
            vo8 r13 = r11.a
            jj7 r13 = r13.D0
            if (r13 == 0) goto L_0x0169
            java.lang.Object r13 = r13.a
            java.util.List r13 = (java.util.List) r13
            if (r13 == 0) goto L_0x0169
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r13 = r13.iterator()
        L_0x011a:
            boolean r16 = r13.hasNext()
            if (r16 == 0) goto L_0x0166
            java.lang.Object r5 = r13.next()
            r6 = r5
            o10 r6 = (defpackage.o10) r6
            j10 r10 = r6.a
            java.lang.String r10 = r10.toString()
            boolean r10 = r12.contains(r10)
            if (r10 == 0) goto L_0x0162
            boolean r10 = r6.s
            if (r10 != 0) goto L_0x0162
            j10 r10 = defpackage.j10.o
            r18 = r1
            j10 r1 = r6.a
            if (r1 == r10) goto L_0x0141
        L_0x013f:
            r6 = 2
            goto L_0x0159
        L_0x0141:
            jb5 r1 = r15.d
            kb5 r1 = (defpackage.kb5) r1
            boolean r1 = r1.u()
            if (r1 != 0) goto L_0x014c
            goto L_0x013f
        L_0x014c:
            boolean r1 = r6.i()
            if (r1 == 0) goto L_0x0164
            n10 r1 = r6.d
            int r1 = r1.b
            r6 = 2
            if (r1 == r6) goto L_0x015c
        L_0x0159:
            r14.add(r5)
        L_0x015c:
            r10 = r6
            r1 = r18
            r5 = -1
            r6 = 1
            goto L_0x011a
        L_0x0162:
            r18 = r1
        L_0x0164:
            r6 = 2
            goto L_0x015c
        L_0x0166:
            r18 = r1
            goto L_0x016d
        L_0x0169:
            r18 = r1
            hw4 r14 = hw4.a
        L_0x016d:
            int r1 = r14.size()
            r5 = 1
            if (r1 <= r5) goto L_0x0176
            r10 = 1
            goto L_0x0177
        L_0x0176:
            r10 = 0
        L_0x0177:
            hu3 r1 = r4.b
            kotlinx.coroutines.internal.ContextScope r1 = n1g.a(r1)
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = q23.H(r14, r6)
            r5.<init>(r6)
            java.util.Iterator r6 = r14.iterator()
        L_0x018c:
            boolean r12 = r6.hasNext()
            if (r12 == 0) goto L_0x01bc
            java.lang.Object r13 = r6.next()
            q78 r14 = new q78
            r16 = 0
            r12 = r14
            r23 = r2
            r21 = r6
            r6 = r14
            r2 = 3
            r14 = r16
            r19 = r15
            r15 = r11
            r16 = r10
            r17 = r19
            r12.<init>(r13, r14, r15, r16, r17)
            r12 = 0
            zc4 r6 = xs7.d(r1, r12, r6, r2)
            r5.add(r6)
            r6 = r21
            r2 = r23
            r15 = r19
            goto L_0x018c
        L_0x01bc:
            r23 = r2
            java.lang.Object r1 = lp.c(r5, r4)
            r10 = r1
        L_0x01c3:
            if (r10 != r3) goto L_0x01c6
            return r3
        L_0x01c6:
            r11 = r23
            r1 = r4
            r2 = r7
            r4 = r8
            r7 = r4
            r8 = r9
            r9 = r18
            r20 = r10
            r10 = r0
            r0 = r20
        L_0x01d4:
            java.util.Collection r0 = (java.util.Collection) r0
            r4.addAll(r0)
            r4 = r1
            r1 = r9
            r0 = r10
            r5 = -1
            r9 = r8
            r8 = r7
            r7 = r2
            r2 = r11
            goto L_0x01e7
        L_0x01e2:
            r2 = r23
            r1 = r18
            r5 = -1
        L_0x01e7:
            int r7 = r7 + r5
            r6 = 1
            goto L_0x0074
        L_0x01eb:
            boolean r1 = r0.isEmpty()
            r5 = 1
            r1 = r1 ^ r5
            if (r1 == 0) goto L_0x01fe
            r1 = 0
            java.lang.Object r2 = r0.get(r1)
            boolean r2 = r2 instanceof defpackage.qg6
            if (r2 == 0) goto L_0x01ff
            r2 = r5
            goto L_0x0200
        L_0x01fe:
            r1 = 0
        L_0x01ff:
            r2 = r1
        L_0x0200:
            boolean r3 = r0.isEmpty()
            r3 = r3 ^ r5
            if (r3 == 0) goto L_0x0216
            int r3 = r0.size()
            int r3 = r3 - r5
            java.lang.Object r0 = r0.get(r3)
            boolean r0 = r0 instanceof defpackage.qg6
            if (r0 == 0) goto L_0x0216
            r6 = r5
            goto L_0x0217
        L_0x0216:
            r6 = r1
        L_0x0217:
            le2 r0 = new le2
            r0.<init>(r8, r6, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gf2.A(java.util.List, java.lang.Long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e3, code lost:
        if (r2.b(r11, (defpackage.le2) r12) == false) goto L_0x00b8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object B(long r9, boolean r11, kotlin.coroutines.Continuation r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof defpackage.ve2
            if (r0 == 0) goto L_0x0013
            r0 = r12
            ve2 r0 = (defpackage.ve2) r0
            int r1 = r0.A0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.A0 = r1
            goto L_0x0018
        L_0x0013:
            ve2 r0 = new ve2
            r0.<init>(r8, r12)
        L_0x0018:
            java.lang.Object r12 = r0.y0
            pu3 r1 = pu3.a
            int r2 = r0.A0
            jue r3 = jue.a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x004b
            if (r2 == r5) goto L_0x0041
            if (r2 != r4) goto L_0x0039
            boolean r8 = r0.x0
            long r9 = r0.w0
            java.lang.Object r11 = r0.Z
            mc9 r2 = r0.Y
            java.util.List r5 = r0.X
            gf2 r6 = r0.o
            wx3.H(r12)
            goto L_0x00dd
        L_0x0039:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0041:
            boolean r11 = r0.x0
            long r9 = r0.w0
            gf2 r8 = r0.o
            wx3.H(r12)
            goto L_0x008b
        L_0x004b:
            wx3.H(r12)
            grd r12 = r8.S0
            java.lang.Object r12 = r12.getValue()
            le2 r12 = (defpackage.le2) r12
            java.util.List r12 = r12.a
            boolean r2 = r12 instanceof java.util.Collection
            if (r2 == 0) goto L_0x0064
            boolean r2 = r12.isEmpty()
            if (r2 == 0) goto L_0x0064
            goto L_0x00e5
        L_0x0064:
            java.util.Iterator r12 = r12.iterator()
        L_0x0068:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L_0x00e5
            java.lang.Object r2 = r12.next()
            rh8 r2 = (defpackage.rh8) r2
            long r6 = r2.j()
            int r2 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x0068
            r0.o = r8
            r0.w0 = r9
            r0.x0 = r11
            r0.A0 = r5
            java.lang.Object r12 = r8.y(r9, r0)
            if (r12 != r1) goto L_0x008b
            return r1
        L_0x008b:
            xm8 r12 = (defpackage.xm8) r12
            if (r12 != 0) goto L_0x0090
            return r3
        L_0x0090:
            vc2 r2 = r8.x()
            if (r2 == 0) goto L_0x00a7
            bu r5 = new bu
            r6 = 1
            r5.<init>(r2, r12, r6)
            qmc r12 = r2.c
            xi4 r12 = r12.b(r5)
            n83 r2 = r2.X
            r2.a(r12)
        L_0x00a7:
            vc2 r12 = r8.x()
            if (r12 == 0) goto L_0x00e5
            jh6 r12 = r12.b
            java.util.ArrayList r12 = r12.e()
            grd r2 = r8.S0
            r6 = r8
            r8 = r11
            r5 = r12
        L_0x00b8:
            java.lang.Object r11 = r2.getValue()
            r12 = r11
            le2 r12 = (defpackage.le2) r12
            if (r8 == 0) goto L_0x00c7
            java.lang.Long r12 = new java.lang.Long
            r12.<init>(r9)
            goto L_0x00c8
        L_0x00c7:
            r12 = 0
        L_0x00c8:
            r0.o = r6
            r0.X = r5
            r0.Y = r2
            r0.Z = r11
            r0.w0 = r9
            r0.x0 = r8
            r0.A0 = r4
            java.lang.Object r12 = r6.A(r5, r12, r0)
            if (r12 != r1) goto L_0x00dd
            return r1
        L_0x00dd:
            le2 r12 = (defpackage.le2) r12
            boolean r11 = r2.b(r11, r12)
            if (r11 == 0) goto L_0x00b8
        L_0x00e5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gf2.B(long, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void C(int i, rh8 rh8) {
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        int i2 = j8a.Z;
        l05 l05 = this.O0;
        if (i == i2) {
            taf.o(l05, new md2(this.b, rh8.j()));
        } else if (i != j8a.Y) {
            int i3 = j8a.d0;
            ph8 ph8 = null;
            ContextScope contextScope = this.a;
            if (i == i3) {
                qod D = xs7.D(contextScope, w().b(), ru3.b, new ye2(this, rh8, (Continuation) null));
                this.I0.o1(this, V0[1], D);
            } else if (i == j8a.X) {
                u(rh8, true);
            } else if (i == j8a.W) {
                u(rh8, false);
            } else if (i == j8a.a0) {
                if (rh8 instanceof ph8) {
                    ph8 = (ph8) rh8;
                }
                if (ph8 != null && (charSequence3 = ph8.Z) != null) {
                    taf.o(l05, new ld2(charSequence3.toString()));
                }
            } else if (i == j8a.V) {
                if (rh8 instanceof ph8) {
                    ph8 = (ph8) rh8;
                }
                if (ph8 != null && (charSequence2 = ph8.Z) != null) {
                    taf.o(l05, new hd2(charSequence2.toString()));
                    hba hba = (hba) this.B0.getValue();
                    hba.h(new hge(l8a.q1));
                    hba.f(new vba(phc.v));
                    hba.j();
                }
            } else if (i == j8a.c0) {
                if (rh8 instanceof ph8) {
                    ph8 = (ph8) rh8;
                }
                if (ph8 != null && (charSequence = ph8.Z) != null) {
                    taf.o(l05, new od2(charSequence.toString()));
                }
            } else if (i == j8a.b0 && (rh8 instanceof qh8)) {
                xs7.E(contextScope, w().b(), (ru3) null, new cf2(this, rh8, (Continuation) null), 2);
            }
        } else if (rh8 instanceof oh8) {
            oh8 oh8 = (oh8) rh8;
            taf.o(l05, new nd2(Long.valueOf(oh8.c), oh8.b, false));
        } else if (rh8 instanceof ph8) {
            ph8 ph82 = (ph8) rh8;
            taf.o(l05, new nd2(Long.valueOf(ph82.c), ph82.b, true));
        } else if (rh8 instanceof qh8) {
            qh8 qh8 = (qh8) rh8;
            taf.o(l05, new nd2(Long.valueOf(qh8.c), qh8.b, true));
        } else if (rh8 instanceof jh8) {
            jh8 jh8 = (jh8) rh8;
            taf.o(l05, new nd2(Long.valueOf(jh8.c), jh8.b, false));
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final s78 e() {
        s78 s78 = (s78) this.F0.get();
        if (s78 != null) {
            return s78;
        }
        Set<String> set = (Set) this.Q0.getValue();
        ArrayList arrayList = new ArrayList(q23.H(set, 10));
        for (String a : set) {
            arrayList.add(e00.a(a));
        }
        return new s78(0, 0, o23.w0(arrayList), this.b);
    }

    public final void k() {
        vc2 x = x();
        if (x != null) {
            xs7.E(this.a, w().b().plus(sk9.a), (ru3) null, new xe2(this, x, (Continuation) null), 2);
        }
    }

    public final void p() {
        vc2 x = x();
        if (x != null) {
            udd.q(x.a, "clear");
            iu iuVar = x.w0;
            iuVar.c();
            iuVar.a();
            synchronized (iuVar) {
                iuVar.c = null;
            }
            iu iuVar2 = x.y0;
            iuVar2.c();
            iuVar2.a();
            synchronized (iuVar2) {
                iuVar2.c = null;
            }
            iu iuVar3 = x.x0;
            iuVar3.c();
            iuVar3.a();
            synchronized (iuVar3) {
                iuVar3.c = null;
            }
            x.X.d();
        }
        this.Z.f(this);
    }

    public final void u(rh8 rh8, boolean z) {
        qod D = xs7.D(this.a, w().b(), ru3.b, new oe2(this, rh8, z, (Continuation) null));
        this.J0.o1(this, V0[2], D);
    }

    public final i22 v() {
        return (i22) ((aw2) this.o).m(this.b).a.getValue();
    }

    public final pae w() {
        return (pae) this.G0.getValue();
    }

    public final vc2 x() {
        return (vc2) this.P0.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0055 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object y(long r5, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.pe2
            if (r0 == 0) goto L_0x0013
            r0 = r7
            pe2 r0 = (defpackage.pe2) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            pe2 r0 = new pe2
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.o
            pu3 r1 = pu3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            wx3.H(r7)     // Catch:{ all -> 0x0027 }
            goto L_0x0049
        L_0x0027:
            r4 = move-exception
            goto L_0x004c
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            wx3.H(r7)
            t97 r4 = r4.w0     // Catch:{ all -> 0x0027 }
            java.lang.Object r4 = r4.getValue()     // Catch:{ all -> 0x0027 }
            sk7 r4 = (defpackage.sk7) r4     // Catch:{ all -> 0x0027 }
            mv9 r4 = defpackage.sk7.a(r4, r5)     // Catch:{ all -> 0x0027 }
            r0.Y = r3     // Catch:{ all -> 0x0027 }
            java.lang.Object r7 = e07.d(r4, r0)     // Catch:{ all -> 0x0027 }
            if (r7 != r1) goto L_0x0049
            return r1
        L_0x0049:
            xm8 r7 = (defpackage.xm8) r7     // Catch:{ all -> 0x0027 }
            goto L_0x0051
        L_0x004c:
            kcc r7 = new kcc
            r7.<init>(r4)
        L_0x0051:
            boolean r4 = r7 instanceof kcc
            if (r4 == 0) goto L_0x0056
            r7 = 0
        L_0x0056:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gf2.y(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0071 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object z(long r15, java.lang.String r17, long r18, boolean r20, kotlin.coroutines.Continuation r21) {
        /*
            r14 = this;
            r0 = r14
            r1 = r21
            boolean r2 = r1 instanceof defpackage.qe2
            if (r2 == 0) goto L_0x0016
            r2 = r1
            qe2 r2 = (defpackage.qe2) r2
            int r3 = r2.w0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0016
            int r3 = r3 - r4
            r2.w0 = r3
            goto L_0x001b
        L_0x0016:
            qe2 r2 = new qe2
            r2.<init>(r14, r1)
        L_0x001b:
            java.lang.Object r1 = r2.Y
            pu3 r3 = pu3.a
            int r4 = r2.w0
            r5 = 1
            if (r4 == 0) goto L_0x0039
            if (r4 != r5) goto L_0x0031
            boolean r0 = r2.X
            java.lang.String r2 = r2.o
            wx3.H(r1)
            r13 = r2
            r2 = r1
            r1 = r13
            goto L_0x006d
        L_0x0031:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0039:
            wx3.H(r1)
            yzc r1 = r0.C0
            r1.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r4 = ru.ok.tamtam.android.prefs.PmsKey.f85newmediaviewerenabled
            r6 = 0
            boolean r1 = r1.m(r4, r6)
            if (r1 == 0) goto L_0x0058
            jd2 r0 = new jd2
            r6 = r0
            r7 = r15
            r9 = r18
            r11 = r17
            r12 = r20
            r6.<init>(r7, r9, r11, r12)
            goto L_0x008f
        L_0x0058:
            r1 = r17
            r2.o = r1
            r4 = r20
            r2.X = r4
            r2.w0 = r5
            r5 = r18
            java.lang.Object r0 = r14.y(r5, r2)
            if (r0 != r3) goto L_0x006b
            return r3
        L_0x006b:
            r2 = r0
            r0 = r4
        L_0x006d:
            xm8 r2 = (defpackage.xm8) r2
            if (r2 != 0) goto L_0x0073
            r0 = 0
            return r0
        L_0x0073:
            i6b r3 = defpackage.i6b.a
            w4 r3 = r3.getAccessor()
            java.lang.Class<na7> r4 = na7.class
            java.lang.Object r3 = r3.c(r4)
            na7 r3 = (na7) r3
            r3.getClass()
            nr8 r3 = new nr8
            r3.<init>((defpackage.xm8) r2)
            kd2 r2 = new kd2
            r2.<init>(r3, r1, r0)
            r0 = r2
        L_0x008f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gf2.z(long, java.lang.String, long, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
