package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: ah2  reason: default package */
public final class ah2 extends taf implements t78 {
    public static final /* synthetic */ k77[] h1;
    public final String A0 = ah2.class.getName();
    public final t97 B0;
    public final t97 C0;
    public final t97 D0;
    public final t97 E0;
    public final t97 F0;
    public final t97 G0;
    public final t97 H0;
    public final t97 I0;
    public ax8 J0;
    public final Set K0;
    public final Set L0;
    public final AtomicReference M0;
    public final AtomicReference N0;
    public final AtomicReference O0;
    public final AtomicReference P0;
    public final AtomicLong Q0;
    public final l05 R0;
    public final l05 S0;
    public final grd T0;
    public final t0c U0;
    public final grd V0;
    public final t0c W0;
    public final boolean X;
    public final grd X0;
    public final boolean Y;
    public final t0c Y0;
    public final Context Z;
    public final grd Z0;
    public final t0c a1;
    public final long b;
    public final hcd b1;
    public final String c;
    public final s0c c1;
    public final e3 d1;
    public final e3 e1;
    public final e3 f1;
    public final e3 g1;
    public final long o;
    public final b29 w0;
    public final pae x0;
    public final pk y0;
    public final ew8 z0;

    static {
        Class<ah2> cls = ah2.class;
        h1 = new k77[]{new hc9(cls, "videoFetchJob", "getVideoFetchJob()Lkotlinx/coroutines/Job;"), c3d.g(m7c.a, cls, "newPageJob", "getNewPageJob()Lkotlinx/coroutines/Job;"), new hc9(cls, "actionJob", "getActionJob()Lkotlinx/coroutines/Job;"), new hc9(cls, "loadFrameJob", "getLoadFrameJob()Lkotlinx/coroutines/Job;")};
    }

    public ah2(t97 t97, t97 t972, t97 t973, t97 t974, t97 t975, t97 t976, t97 t977, t97 t978, t97 t979, long j, String str, long j2, boolean z, boolean z2, Context context, b29 b29, pae pae, pk pkVar, ew8 ew8) {
        pae pae2 = pae;
        ew8 ew82 = ew8;
        this.b = j;
        this.c = str;
        this.o = j2;
        this.X = z;
        this.Y = z2;
        this.Z = context;
        this.w0 = b29;
        this.x0 = pae2;
        this.y0 = pkVar;
        this.z0 = ew82;
        this.B0 = t97;
        this.C0 = t973;
        this.D0 = t974;
        this.E0 = t975;
        this.F0 = t976;
        this.G0 = t977;
        this.H0 = t978;
        this.I0 = t979;
        e00 e00 = e00.o;
        e00 e002 = e00.X;
        this.K0 = z3d.N("PHOTO", "VIDEO");
        this.L0 = z3d.N(e00, e002);
        this.M0 = new AtomicReference((Object) null);
        this.N0 = new AtomicReference(new zf2(false, false));
        this.O0 = new AtomicReference((Object) null);
        this.P0 = new AtomicReference((Object) null);
        this.Q0 = new AtomicLong();
        this.R0 = new l05(0);
        this.S0 = new l05(0);
        grd a = hrd.a(ag2.c);
        this.T0 = a;
        this.U0 = new t0c(a);
        grd a2 = hrd.a(new yf2(BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, new xf2((vy5) null, false, false, 7)));
        this.V0 = a2;
        this.W0 = new t0c(a2);
        grd a3 = hrd.a(new bg2((mge) null));
        this.X0 = a3;
        this.Y0 = new t0c(a3);
        grd a4 = hrd.a(new cg2((i68) null, 3));
        this.Z0 = a4;
        this.a1 = new t0c(a4);
        hcd a5 = icd.a(1, 0, 2);
        this.b1 = a5;
        this.c1 = new s0c(a5);
        this.d1 = hwf.t();
        this.e1 = hwf.t();
        this.f1 = hwf.t();
        this.g1 = hwf.t();
        n3a n3a = (n3a) pae2;
        t97 t9710 = t972;
        taf.n(this, n3a.b(), (ru3) null, new vf2(this, t972, (Continuation) null), 2);
        ez3.N(ez3.J(new ck5(ew82.e, new wf2(this, (Continuation) null), 5), n3a.b()), this.a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object q(defpackage.ah2 r7, java.util.List r8, kotlin.coroutines.Continuation r9) {
        /*
            r7.getClass()
            boolean r0 = r9 instanceof defpackage.dg2
            if (r0 == 0) goto L_0x0016
            r0 = r9
            dg2 r0 = (defpackage.dg2) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x001b
        L_0x0016:
            dg2 r0 = new dg2
            r0.<init>(r7, r9)
        L_0x001b:
            java.lang.Object r9 = r0.X
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.Z
            jue r3 = defpackage.jue.a
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x003e
            if (r2 == r5) goto L_0x0038
            if (r2 != r4) goto L_0x0030
            defpackage.wx3.H(r9)
            goto L_0x0089
        L_0x0030:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0038:
            ah2 r7 = r0.o
            defpackage.wx3.H(r9)
            goto L_0x007c
        L_0x003e:
            defpackage.wx3.H(r9)
            grd r9 = r7.T0
            java.lang.Object r9 = r9.getValue()
            ag2 r9 = (defpackage.ag2) r9
            java.util.List r9 = r9.a
            boolean r2 = r9.isEmpty()
            r2 = r2 ^ r5
            if (r2 == 0) goto L_0x0089
            int r2 = r8.size()
            int r9 = r9.size()
            if (r2 == r9) goto L_0x0089
            java.lang.String r9 = r7.A0
            java.lang.String r2 = "Media viewer. Items count changed. Try request new totalCount"
            defpackage.udd.p(r9, r2, new java.lang.Object[0])
            java.lang.Object r8 = defpackage.o23.X(r8)
            k68 r8 = (defpackage.k68) r8
            if (r8 == 0) goto L_0x007f
            long r8 = r8.j()
            r0.o = r7
            r0.Z = r5
            b29 r2 = r7.w0
            java.lang.Object r9 = r2.a(r8, r0)
            if (r9 != r1) goto L_0x007c
            goto L_0x0095
        L_0x007c:
            vo8 r9 = (vo8) r9
            goto L_0x0080
        L_0x007f:
            r9 = r6
        L_0x0080:
            if (r9 != 0) goto L_0x008b
            java.lang.String r7 = r7.A0
            java.lang.String r8 = "Media viewer. Items count changed. Can't request new totalCount, msg is null"
            defpackage.udd.T(r7, r8, new java.lang.Object[0])
        L_0x0089:
            r1 = r3
            goto L_0x0095
        L_0x008b:
            r0.o = r6
            r0.Z = r4
            java.lang.Object r7 = r7.F(r9, r0)
            if (r7 != r1) goto L_0x0089
        L_0x0095:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ah2.q(ah2, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00d4 A[EDGE_INSN: B:57:0x00d4->B:40:0x00d4 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object r(defpackage.ah2 r6, qp8 r7, kotlin.coroutines.Continuation r8) {
        /*
            r6.getClass()
            boolean r0 = r8 instanceof defpackage.fg2
            if (r0 == 0) goto L_0x0016
            r0 = r8
            fg2 r0 = (defpackage.fg2) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x001b
        L_0x0016:
            fg2 r0 = new fg2
            r0.<init>(r6, r8)
        L_0x001b:
            java.lang.Object r8 = r0.X
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.Z
            jue r3 = defpackage.jue.a
            r4 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r4) goto L_0x002e
            ah2 r6 = r0.o
            defpackage.wx3.H(r8)
            goto L_0x004f
        L_0x002e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0036:
            defpackage.wx3.H(r8)
            boolean r8 = r7 instanceof kp8
            b29 r2 = r6.w0
            if (r8 == 0) goto L_0x009d
            kp8 r7 = (kp8) r7
            java.util.Collection r7 = r7.a
            r0.o = r6
            r0.Z = r4
            java.lang.Object r8 = r2.b(r7, r0)
            if (r8 != r1) goto L_0x004f
            goto L_0x0124
        L_0x004f:
            java.util.List r8 = (java.util.List) r8
            boolean r7 = r8 instanceof java.util.Collection
            if (r7 == 0) goto L_0x005d
            boolean r7 = r8.isEmpty()
            if (r7 == 0) goto L_0x005d
            goto L_0x00d4
        L_0x005d:
            java.util.Iterator r7 = r8.iterator()
        L_0x0061:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00d4
            java.lang.Object r8 = r7.next()
            vo8 r8 = (vo8) r8
            boolean r0 = r8.m()
            if (r0 == 0) goto L_0x0061
            j10 r0 = j10.c
            boolean r0 = r8.l(r0)
            if (r0 != 0) goto L_0x0083
            j10 r0 = j10.o
            boolean r8 = r8.l(r0)
            if (r8 == 0) goto L_0x0061
        L_0x0083:
            java.lang.String r7 = r6.A0
            java.lang.String r8 = "Media viewer. On add new msg with media"
            defpackage.udd.p(r7, r8, new java.lang.Object[0])
            bv2 r7 = r6.w()
            hd1 r8 = new hd1
            r0 = 16
            r8.<init>(r0)
            aw2 r7 = (aw2) r7
            long r0 = r6.b
            r7.f(r0, r8)
            goto L_0x00d4
        L_0x009d:
            boolean r8 = r7 instanceof np8
            if (r8 == 0) goto L_0x00d4
            java.util.concurrent.atomic.AtomicReference r8 = r6.O0
            java.lang.Object r8 = r8.get()
            java.lang.String r8 = (java.lang.String) r8
            grd r0 = r6.T0
            java.lang.Object r0 = r0.getValue()
            ag2 r0 = (defpackage.ag2) r0
            java.util.List r0 = r0.a
            java.util.Iterator r0 = r0.iterator()
        L_0x00b7:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00cf
            java.lang.Object r1 = r0.next()
            r4 = r1
            k68 r4 = (defpackage.k68) r4
            java.lang.String r4 = r4.x()
            boolean r4 = defpackage.hhd.f(r4, r8)
            if (r4 == 0) goto L_0x00b7
            goto L_0x00d0
        L_0x00cf:
            r1 = 0
        L_0x00d0:
            k68 r1 = (defpackage.k68) r1
            if (r1 != 0) goto L_0x00d6
        L_0x00d4:
            r1 = r3
            goto L_0x0124
        L_0x00d6:
            np8 r7 = (np8) r7
            java.util.Collection r7 = r7.a
            long r4 = r1.j()
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r4)
            boolean r7 = r7.contains(r8)
            if (r7 == 0) goto L_0x010c
            b05 r7 = new b05
            boolean r8 = r1 instanceof defpackage.b68
            if (r8 == 0) goto L_0x00f2
            int r8 = defpackage.b2a.a
            goto L_0x00f8
        L_0x00f2:
            boolean r8 = r1 instanceof defpackage.i68
            if (r8 == 0) goto L_0x0106
            int r8 = defpackage.b2a.b
        L_0x00f8:
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r8)
            r7.<init>(r0)
            l05 r6 = r6.R0
            taf.o(r6, r7)
            goto L_0x00d4
        L_0x0106:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L_0x010c:
            ax8 r6 = r6.J0
            if (r6 == 0) goto L_0x00d4
            long r7 = r1.j()
            nec r0 = r2.a
            cw8 r0 = r0.d()
            long r7 = r0.k(r7)
            fw r6 = (fw) r6
            r6.r(r7)
            goto L_0x00d4
        L_0x0124:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ah2.r(ah2, qp8, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object s(defpackage.ah2 r10, int r11, java.util.List r12, kotlin.coroutines.Continuation r13) {
        /*
            r10.getClass()
            boolean r0 = r13 instanceof defpackage.jg2
            if (r0 == 0) goto L_0x0016
            r0 = r13
            jg2 r0 = (defpackage.jg2) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.w0 = r1
            goto L_0x001b
        L_0x0016:
            jg2 r0 = new jg2
            r0.<init>(r10, r13)
        L_0x001b:
            java.lang.Object r13 = r0.Y
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.w0
            jue r3 = defpackage.jue.a
            r4 = 1
            r5 = 2
            if (r2 == 0) goto L_0x0043
            if (r2 == r4) goto L_0x0038
            if (r2 != r5) goto L_0x0030
            defpackage.wx3.H(r13)
            goto L_0x00ca
        L_0x0030:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0038:
            k68 r10 = r0.X
            ah2 r11 = r0.o
            defpackage.wx3.H(r13)
            r13 = r10
            r10 = r11
            goto L_0x00bc
        L_0x0043:
            defpackage.wx3.H(r13)
            java.util.concurrent.atomic.AtomicReference r13 = r10.O0
            java.lang.Object r13 = r13.get()
            java.lang.String r13 = (java.lang.String) r13
            grd r2 = r10.T0
            r6 = -1
            if (r13 == 0) goto L_0x007a
            java.lang.Object r7 = r2.getValue()
            ag2 r7 = (defpackage.ag2) r7
            java.util.List r7 = r7.a
            java.util.Iterator r7 = r7.iterator()
            r8 = 0
        L_0x0060:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x007a
            java.lang.Object r9 = r7.next()
            k68 r9 = (defpackage.k68) r9
            java.lang.String r9 = r9.x()
            boolean r9 = defpackage.hhd.f(r9, r13)
            if (r9 == 0) goto L_0x0077
            goto L_0x007b
        L_0x0077:
            int r8 = r8 + 1
            goto L_0x0060
        L_0x007a:
            r8 = r6
        L_0x007b:
            if (r11 < 0) goto L_0x007e
            goto L_0x009d
        L_0x007e:
            if (r8 < 0) goto L_0x009c
            java.lang.Object r11 = r2.getValue()
            ag2 r11 = (defpackage.ag2) r11
            java.util.List r11 = r11.a
            int r11 = r11.size()
            int r13 = r12.size()
            if (r11 >= r13) goto L_0x009a
            int r13 = r12.size()
            int r11 = r11 - r8
            int r11 = r13 - r11
            goto L_0x009d
        L_0x009a:
            r11 = r8
            goto L_0x009d
        L_0x009c:
            r11 = r6
        L_0x009d:
            if (r11 < 0) goto L_0x00ca
            int r13 = r12.size()
            if (r11 >= r13) goto L_0x00ca
            java.lang.Object r13 = r12.get(r11)
            k68 r13 = (defpackage.k68) r13
            int r12 = r12.size()
            r0.o = r10
            r0.X = r13
            r0.w0 = r4
            java.lang.Object r11 = r10.D(r11, r13, r12, r0)
            if (r11 != r1) goto L_0x00bc
            goto L_0x00cb
        L_0x00bc:
            r11 = 0
            r0.o = r11
            r0.X = r11
            r0.w0 = r5
            java.lang.Object r10 = r10.C(r13, r0)
            if (r10 != r1) goto L_0x00ca
            goto L_0x00cb
        L_0x00ca:
            r1 = r3
        L_0x00cb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ah2.s(ah2, int, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: vo8} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object t(defpackage.ah2 r10, vo8 r11, kotlin.coroutines.Continuation r12) {
        /*
            r10.getClass()
            boolean r0 = r12 instanceof defpackage.lg2
            if (r0 == 0) goto L_0x0016
            r0 = r12
            lg2 r0 = (defpackage.lg2) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.w0 = r1
            goto L_0x001b
        L_0x0016:
            lg2 r0 = new lg2
            r0.<init>(r10, r12)
        L_0x001b:
            java.lang.Object r12 = r0.Y
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.w0
            r3 = 4
            r4 = 3
            r5 = 1
            r6 = 2
            r7 = 0
            if (r2 == 0) goto L_0x0059
            if (r2 == r5) goto L_0x004e
            if (r2 == r6) goto L_0x0047
            if (r2 == r4) goto L_0x003d
            if (r2 != r3) goto L_0x0035
            defpackage.wx3.H(r12)
            goto L_0x00bc
        L_0x0035:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x003d:
            java.lang.Object r10 = r0.X
            k68 r10 = (defpackage.k68) r10
            ah2 r11 = r0.o
            defpackage.wx3.H(r12)
            goto L_0x00af
        L_0x0047:
            ah2 r10 = r0.o
            defpackage.wx3.H(r12)
        L_0x004c:
            r11 = r10
            goto L_0x0086
        L_0x004e:
            java.lang.Object r10 = r0.X
            r11 = r10
            vo8 r11 = (vo8) r11
            ah2 r10 = r0.o
            defpackage.wx3.H(r12)
            goto L_0x006f
        L_0x0059:
            defpackage.wx3.H(r12)
            bv2 r12 = r10.w()
            r0.o = r10
            r0.X = r11
            r0.w0 = r5
            long r8 = r10.b
            java.lang.Object r12 = r12.d(r8, r0)
            if (r12 != r1) goto L_0x006f
            goto L_0x00be
        L_0x006f:
            i22 r12 = (i22) r12
            t97 r2 = r10.C0
            java.lang.Object r2 = r2.getValue()
            l3a r2 = (l3a) r2
            r0.o = r10
            r0.X = r7
            r0.w0 = r6
            java.lang.Object r12 = r2.h(r12, r11, r0)
            if (r12 != r1) goto L_0x004c
            goto L_0x00be
        L_0x0086:
            one.me.messages.list.loader.MessageModel r12 = (one.me.messages.list.loader.MessageModel) r12
            java.util.List r10 = gp0.H(r12)
            grd r12 = r11.T0
            ag2 r2 = new ag2
            r5 = 0
            r2.<init>(r10, r6, r5)
            r12.m(r7, r2)
            java.lang.Object r12 = defpackage.o23.V(r10)
            k68 r12 = (defpackage.k68) r12
            int r10 = r10.size()
            r0.o = r11
            r0.X = r12
            r0.w0 = r4
            java.lang.Object r10 = r11.D(r5, r12, r10, r0)
            if (r10 != r1) goto L_0x00ae
            goto L_0x00be
        L_0x00ae:
            r10 = r12
        L_0x00af:
            r0.o = r7
            r0.X = r7
            r0.w0 = r3
            java.lang.Object r10 = r11.C(r10, r0)
            if (r10 != r1) goto L_0x00bc
            goto L_0x00be
        L_0x00bc:
            jue r1 = defpackage.jue.a
        L_0x00be:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ah2.t(ah2, vo8, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final boolean u(ah2 ah2, s78 s78) {
        if (s78 != null) {
            if (s78.d == ah2.b) {
                Set<e00> set = s78.c;
                ArrayList arrayList = new ArrayList(q23.H(set, 10));
                for (e00 obj : set) {
                    arrayList.add(obj.toString());
                }
                if (o23.q0(arrayList).containsAll(ah2.K0)) {
                    return true;
                }
            }
        } else {
            ah2.getClass();
        }
        return false;
    }

    public final void A(long j, String str) {
        k68 x = x();
        if (x != null && x.j() == j && hhd.f(x.x(), str)) {
            taf.o(this.R0, new c05(4, false));
        }
    }

    public final void B(long j, String str) {
        k68 x = x();
        if (x != null && x.j() == j && hhd.f(x.x(), str)) {
            taf.o(this.R0, new c05(1, false));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object C(defpackage.k68 r12, kotlin.coroutines.Continuation r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.kg2
            if (r0 == 0) goto L_0x0013
            r0 = r13
            kg2 r0 = (defpackage.kg2) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w0 = r1
            goto L_0x0018
        L_0x0013:
            kg2 r0 = new kg2
            r0.<init>(r11, r13)
        L_0x0018:
            java.lang.Object r13 = r0.Y
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.w0
            r3 = 3
            r4 = 0
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0049
            if (r2 == r6) goto L_0x0043
            if (r2 == r5) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            vo8 r11 = r0.X
            ah2 r12 = r0.o
            defpackage.wx3.H(r13)
            goto L_0x00a2
        L_0x0033:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x003b:
            vo8 r11 = r0.X
            ah2 r12 = r0.o
            defpackage.wx3.H(r13)
            goto L_0x0080
        L_0x0043:
            ah2 r11 = r0.o
            defpackage.wx3.H(r13)
            goto L_0x005d
        L_0x0049:
            defpackage.wx3.H(r13)
            b29 r13 = r11.w0
            long r7 = r12.j()
            r0.o = r11
            r0.w0 = r6
            java.lang.Object r13 = r13.a(r7, r0)
            if (r13 != r1) goto L_0x005d
            return r1
        L_0x005d:
            r12 = r13
            vo8 r12 = (vo8) r12
            if (r12 != 0) goto L_0x0065
            jue r11 = defpackage.jue.a
            return r11
        L_0x0065:
            int r13 = r12.Z0
            r2 = 4
            if (r13 != r2) goto L_0x0088
            bv2 r13 = r11.w()
            long r6 = r12.x0
            r0.o = r11
            r0.X = r12
            r0.w0 = r5
            java.lang.Object r13 = r13.d(r6, r0)
            if (r13 != r1) goto L_0x007d
            return r1
        L_0x007d:
            r10 = r12
            r12 = r11
            r11 = r10
        L_0x0080:
            i22 r13 = (i22) r13
            r13.h0()
            java.lang.CharSequence r13 = r13.y0
            goto L_0x00b0
        L_0x0088:
            t97 r13 = r11.D0
            java.lang.Object r13 = r13.getValue()
            ap3 r13 = (ap3) r13
            long r5 = r12.Y
            r0.o = r11
            r0.X = r12
            r0.w0 = r3
            java.lang.Comparable r13 = r13.b(r5, r0)
            if (r13 != r1) goto L_0x009f
            return r1
        L_0x009f:
            r10 = r12
            r12 = r11
            r11 = r10
        L_0x00a2:
            tf3 r13 = (tf3) r13
            if (r13 == 0) goto L_0x00ab
            java.lang.String r13 = r13.d()
            goto L_0x00ac
        L_0x00ab:
            r13 = r4
        L_0x00ac:
            if (r13 != 0) goto L_0x00b0
            java.lang.String r13 = ""
        L_0x00b0:
            grd r0 = r12.V0
            yf2 r1 = new yf2
            t97 r2 = r12.E0
            java.lang.Object r2 = r2.getValue()
            w6a r2 = (defpackage.w6a) r2
            long r5 = r11.o
            i03 r7 = r2.c
            long r7 = r7.m()
            sz0 r7 = defpackage.xs7.v(r5, r7)
            int r7 = r7.b
            int r7 = defpackage.hr1.t(r7)
            switch(r7) {
                case 0: goto L_0x0143;
                case 1: goto L_0x0143;
                case 2: goto L_0x0143;
                case 3: goto L_0x012a;
                case 4: goto L_0x0105;
                case 5: goto L_0x0105;
                case 6: goto L_0x0105;
                case 7: goto L_0x00e0;
                case 8: goto L_0x0105;
                case 9: goto L_0x00d7;
                default: goto L_0x00d1;
            }
        L_0x00d1:
            java.lang.IncompatibleClassChangeError r11 = new java.lang.IncompatibleClassChangeError
            r11.<init>()
            throw r11
        L_0x00d7:
            android.content.Context r2 = r2.a
            int r5 = avb.presence_unknown_date
            java.lang.String r2 = r2.getString(r5)
            goto L_0x014f
        L_0x00e0:
            i03 r2 = r2.c
            java.util.Locale r2 = r2.u()
            java.lang.String r7 = "dd MMM yyyy"
            monitor-enter(r7)
            java.text.SimpleDateFormat r8 = defpackage.xs7.r     // Catch:{ all -> 0x0102 }
            if (r8 != 0) goto L_0x00f6
            java.text.SimpleDateFormat r8 = new java.text.SimpleDateFormat     // Catch:{ all -> 0x0102 }
            java.lang.String r9 = "dd MMM yyyy"
            r8.<init>(r9, r2)     // Catch:{ all -> 0x0102 }
            defpackage.xs7.r = r8     // Catch:{ all -> 0x0102 }
        L_0x00f6:
            java.text.SimpleDateFormat r2 = defpackage.xs7.r     // Catch:{ all -> 0x0102 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0102 }
            java.lang.String r2 = r2.format(r5)     // Catch:{ all -> 0x0102 }
            monitor-exit(r7)     // Catch:{ all -> 0x0102 }
            goto L_0x014f
        L_0x0102:
            r11 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0102 }
            throw r11
        L_0x0105:
            i03 r2 = r2.c
            java.util.Locale r2 = r2.u()
            java.lang.String r7 = "dd MMM"
            monitor-enter(r7)
            java.text.SimpleDateFormat r8 = defpackage.xs7.q     // Catch:{ all -> 0x0127 }
            if (r8 != 0) goto L_0x011b
            java.text.SimpleDateFormat r8 = new java.text.SimpleDateFormat     // Catch:{ all -> 0x0127 }
            java.lang.String r9 = "dd MMM"
            r8.<init>(r9, r2)     // Catch:{ all -> 0x0127 }
            defpackage.xs7.q = r8     // Catch:{ all -> 0x0127 }
        L_0x011b:
            java.text.SimpleDateFormat r2 = defpackage.xs7.q     // Catch:{ all -> 0x0127 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0127 }
            java.lang.String r2 = r2.format(r5)     // Catch:{ all -> 0x0127 }
            monitor-exit(r7)     // Catch:{ all -> 0x0127 }
            goto L_0x014f
        L_0x0127:
            r11 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0127 }
            throw r11
        L_0x012a:
            android.content.Context r7 = r2.a
            int r8 = avb.tt_dates_yesterday_format
            i03 r9 = r2.c
            java.util.Locale r9 = r9.u()
            android.content.Context r2 = r2.a
            java.lang.String r2 = defpackage.xs7.p(r2, r5, r9)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r2 = r7.getString(r8, r2)
            goto L_0x014f
        L_0x0143:
            i03 r7 = r2.c
            java.util.Locale r7 = r7.u()
            android.content.Context r2 = r2.a
            java.lang.String r2 = defpackage.xs7.p(r2, r5, r7)
        L_0x014f:
            t97 r5 = r12.E0
            java.lang.Object r5 = r5.getValue()
            w6a r5 = (defpackage.w6a) r5
            java.lang.String r6 = r11.w0
            java.util.List r11 = r11.V0
            nge r7 = nte.D
            yq4 r8 = yq4.b
            long r7 = r7.g(r8)
            float r7 = ah4.e(r7)
            android.content.res.Resources r8 = dh4.c()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            float r7 = r7 * r8
            int r7 = (int) r7
            java.lang.CharSequence r11 = r5.j(r6, r11, r7)
            if (r11 != 0) goto L_0x017b
            java.lang.String r11 = ""
        L_0x017b:
            xf2 r5 = new xf2
            t97 r12 = r12.I0
            java.lang.Object r12 = r12.getValue()
            jb5 r12 = (jb5) r12
            kb5 r12 = (kb5) r12
            r12.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r6 = ru.ok.tamtam.android.prefs.PmsKey.media-viewer-video-collage-enabled
            r7 = 0
            boolean r12 = r12.m(r6, r7)
            r5.<init>(r4, r7, r12, r3)
            r1.<init>(r13, r2, r11, r5)
            r0.m(r4, r1)
            jue r11 = defpackage.jue.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ah2.C(k68, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object D(int r11, defpackage.k68 r12, int r13, kotlin.coroutines.Continuation r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof defpackage.mg2
            if (r0 == 0) goto L_0x0013
            r0 = r14
            mg2 r0 = (defpackage.mg2) r0
            int r1 = r0.z0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.z0 = r1
            goto L_0x0018
        L_0x0013:
            mg2 r0 = new mg2
            r0.<init>(r10, r14)
        L_0x0018:
            java.lang.Object r14 = r0.x0
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.z0
            jue r3 = defpackage.jue.a
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x003d
            if (r2 != r4) goto L_0x0035
            int r13 = r0.w0
            int r11 = r0.Z
            zf2 r10 = r0.Y
            eb2 r12 = r0.X
            ah2 r0 = r0.o
            defpackage.wx3.H(r14)
            goto L_0x00b1
        L_0x0035:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x003d:
            defpackage.wx3.H(r14)
            java.lang.String r14 = r10.A0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r6 = "Media viewer. Prepare toolbar state by position:"
            r2.<init>(r6)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            defpackage.udd.p(r14, r2, new java.lang.Object[0])
            boolean r14 = r10.Y
            if (r14 == 0) goto L_0x007f
            boolean r11 = r12 instanceof defpackage.b68
            if (r11 == 0) goto L_0x0063
            int r11 = defpackage.b2a.i
            hge r12 = new hge
            r12.<init>(r11)
            goto L_0x006e
        L_0x0063:
            boolean r11 = r12 instanceof defpackage.i68
            if (r11 == 0) goto L_0x0079
            int r11 = defpackage.b2a.j
            hge r12 = new hge
            r12.<init>(r11)
        L_0x006e:
            grd r10 = r10.X0
            bg2 r11 = new bg2
            r11.<init>(r12)
            r10.m(r5, r11)
            return r3
        L_0x0079:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        L_0x007f:
            java.util.concurrent.atomic.AtomicReference r12 = r10.P0
            java.lang.Object r12 = r12.get()
            eb2 r12 = (eb2) r12
            java.util.concurrent.atomic.AtomicReference r14 = r10.N0
            java.lang.Object r14 = r14.get()
            zf2 r14 = (defpackage.zf2) r14
            if (r12 == 0) goto L_0x0094
            int r0 = r12.X
            goto L_0x00c2
        L_0x0094:
            bv2 r2 = r10.w()
            long r6 = r10.b
            r0.o = r10
            r0.X = r12
            r0.Y = r14
            r0.Z = r11
            r0.w0 = r13
            r0.z0 = r4
            java.lang.Object r0 = r2.d(r6, r0)
            if (r0 != r1) goto L_0x00ad
            return r1
        L_0x00ad:
            r9 = r0
            r0 = r10
            r10 = r14
            r14 = r9
        L_0x00b1:
            i22 r14 = (i22) r14
            o62 r14 = r14.b
            b62 r14 = r14.r
            if (r14 == 0) goto L_0x00ba
            goto L_0x00bc
        L_0x00ba:
            b62 r14 = b62.g
        L_0x00bc:
            int r14 = r14.b
            r9 = r14
            r14 = r10
            r10 = r0
            r0 = r9
        L_0x00c2:
            boolean r14 = r14.b
            java.lang.String r1 = ", pos:"
            if (r14 != 0) goto L_0x011a
            java.lang.String r14 = r10.A0
            fn6 r2 = defpackage.udd.e
            if (r2 != 0) goto L_0x00cf
            goto L_0x00ee
        L_0x00cf:
            boolean r6 = r2.c()
            if (r6 == 0) goto L_0x00ee
            tn7 r6 = tn7.X
            if (r12 == 0) goto L_0x00db
            r12 = r4
            goto L_0x00dc
        L_0x00db:
            r12 = 0
        L_0x00dc:
            java.lang.String r7 = "Media viewer. Prepare count for toolbar by server, total:"
            java.lang.String r8 = ", fromResp:"
            java.lang.StringBuilder r1 = rf0.i(r7, r0, r1, r11, r8)
            r1.append(r12)
            java.lang.String r12 = r1.toString()
            r2.d(r6, r14, r12, r5)
        L_0x00ee:
            int r12 = r0 - r13
            boolean r14 = r10.X
            if (r14 == 0) goto L_0x00f5
            goto L_0x00f9
        L_0x00f5:
            int r11 = r11 + 1
            int r11 = r13 - r11
        L_0x00f9:
            int r13 = r13 - r11
            int r13 = r13 + r12
            if (r13 >= r4) goto L_0x00fe
            goto L_0x0103
        L_0x00fe:
            if (r13 <= r0) goto L_0x0102
            r4 = r0
            goto L_0x0103
        L_0x0102:
            r4 = r13
        L_0x0103:
            android.content.Context r11 = r10.Z
            int r12 = defpackage.b2a.h
            java.lang.Integer r13 = new java.lang.Integer
            r13.<init>(r4)
            java.lang.Integer r14 = new java.lang.Integer
            r14.<init>(r0)
            java.lang.Object[] r13 = new java.lang.Object[]{r13, r14}
            java.lang.String r11 = r11.getString(r12, r13)
            goto L_0x015b
        L_0x011a:
            java.lang.String r12 = r10.A0
            fn6 r14 = defpackage.udd.e
            if (r14 != 0) goto L_0x0121
            goto L_0x013b
        L_0x0121:
            boolean r2 = r14.c()
            if (r2 == 0) goto L_0x013b
            tn7 r2 = tn7.X
            java.lang.String r4 = "Media viewer. Prepare count for toolbar by local, s:"
            java.lang.String r6 = ", total:"
            java.lang.StringBuilder r1 = rf0.i(r4, r13, r1, r11, r6)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            r14.d(r2, r12, r1, r5)
        L_0x013b:
            boolean r12 = r10.X
            if (r12 == 0) goto L_0x0140
            goto L_0x0144
        L_0x0140:
            int r11 = r11 + 1
            int r11 = r13 - r11
        L_0x0144:
            android.content.Context r12 = r10.Z
            int r14 = defpackage.b2a.h
            int r13 = r13 - r11
            java.lang.Integer r11 = new java.lang.Integer
            r11.<init>(r13)
            java.lang.Integer r13 = new java.lang.Integer
            r13.<init>(r0)
            java.lang.Object[] r11 = new java.lang.Object[]{r11, r13}
            java.lang.String r11 = r12.getString(r14, r11)
        L_0x015b:
            bg2 r12 = new bg2
            lge r13 = new lge
            r13.<init>(r11)
            r12.<init>(r13)
            grd r10 = r10.X0
            r10.m(r5, r12)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ah2.D(int, k68, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void E(int i) {
        qod n = taf.n(this, (hu3) null, ru3.b, new ng2(this, i, (Continuation) null), 1);
        this.f1.o1(this, h1[2], n);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c5 A[Catch:{ all -> 0x004a }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object F(vo8 r21, kotlin.coroutines.Continuation r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            boolean r2 = r1 instanceof defpackage.og2
            if (r2 == 0) goto L_0x0018
            r2 = r1
            og2 r2 = (defpackage.og2) r2
            int r3 = r2.w0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0018
            int r3 = r3 - r4
            r2.w0 = r3
        L_0x0016:
            r8 = r2
            goto L_0x001e
        L_0x0018:
            og2 r2 = new og2
            r2.<init>(r0, r1)
            goto L_0x0016
        L_0x001e:
            java.lang.Object r1 = r8.Y
            pu3 r2 = defpackage.pu3.a
            int r3 = r8.w0
            jue r9 = defpackage.jue.a
            r10 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L_0x0057
            if (r3 == r6) goto L_0x004d
            if (r3 == r5) goto L_0x0043
            if (r3 != r4) goto L_0x003b
            java.lang.Object r0 = r8.X
            ah2 r2 = r8.o
            defpackage.wx3.H(r1)
            goto L_0x0124
        L_0x003b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0043:
            ah2 r3 = r8.o
            defpackage.wx3.H(r1)     // Catch:{ all -> 0x004a }
            goto L_0x00c6
        L_0x004a:
            r0 = move-exception
            goto L_0x00cb
        L_0x004d:
            java.lang.Object r0 = r8.X
            vo8 r0 = (vo8) r0
            ah2 r3 = r8.o
            defpackage.wx3.H(r1)
            goto L_0x0074
        L_0x0057:
            defpackage.wx3.H(r1)
            bv2 r1 = r20.w()
            long r11 = r0.b
            r8.o = r0
            r3 = r21
            r8.X = r3
            r8.w0 = r6
            java.lang.Object r1 = r1.d(r11, r8)
            if (r1 != r2) goto L_0x006f
            return r2
        L_0x006f:
            r19 = r3
            r3 = r0
            r0 = r19
        L_0x0074:
            i22 r1 = (i22) r1
            long r11 = r0.c
            r13 = 0
            int r7 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r7 == 0) goto L_0x0132
            o62 r7 = r1.b
            long r11 = r7.a
            int r7 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r7 != 0) goto L_0x0088
            goto L_0x0132
        L_0x0088:
            java.lang.String r7 = r3.A0
            java.lang.String r11 = "Media viewer. Start request media total count."
            defpackage.udd.p(r7, r11, new java.lang.Object[0])
            dt r7 = new dt
            o62 r1 = r1.b
            long r13 = r1.a
            long r0 = r0.c
            java.lang.Long r15 = new java.lang.Long
            r15.<init>(r0)
            java.util.Set r0 = r3.L0
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r6)
            java.lang.Integer r11 = new java.lang.Integer
            r11.<init>(r6)
            r12 = r7
            r16 = r0
            r17 = r1
            r18 = r11
            r12.<init>(r13, r15, r16, r17, r18)
            pg2 r0 = new pg2     // Catch:{ all -> 0x004a }
            r0.<init>(r3, r7, r10)     // Catch:{ all -> 0x004a }
            r8.o = r3     // Catch:{ all -> 0x004a }
            r8.X = r10     // Catch:{ all -> 0x004a }
            r8.w0 = r5     // Catch:{ all -> 0x004a }
            r11 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r1 = defpackage.ez3.m0(r11, r0, r8)     // Catch:{ all -> 0x004a }
            if (r1 != r2) goto L_0x00c6
            return r2
        L_0x00c6:
            eb2 r1 = (eb2) r1     // Catch:{ all -> 0x004a }
        L_0x00c8:
            r0 = r1
            r1 = r3
            goto L_0x00d1
        L_0x00cb:
            kcc r1 = new kcc
            r1.<init>(r0)
            goto L_0x00c8
        L_0x00d1:
            boolean r3 = r0 instanceof defpackage.kcc
            r3 = r3 ^ r6
            if (r3 == 0) goto L_0x0125
            r3 = r0
            eb2 r3 = (eb2) r3
            java.lang.String r5 = r1.A0
            fn6 r6 = defpackage.udd.e
            if (r6 != 0) goto L_0x00e0
            goto L_0x00f9
        L_0x00e0:
            boolean r7 = r6.c()
            if (r7 == 0) goto L_0x00f9
            tn7 r7 = tn7.X
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Media viewer. Success request media total count: "
            r11.<init>(r12)
            r11.append(r3)
            java.lang.String r11 = r11.toString()
            r6.d(r7, r5, r11, r10)
        L_0x00f9:
            if (r3 == 0) goto L_0x0125
            java.util.concurrent.atomic.AtomicReference r5 = r1.P0
            zx0 r6 = new zx0
            r7 = 4
            r6.<init>(r7, r3)
            r5.updateAndGet(r6)
            bv2 r5 = r1.w()
            long r6 = r1.b
            java.util.Set r11 = r1.L0
            int r12 = r3.X
            r8.o = r1
            r8.X = r0
            r8.w0 = r4
            r3 = r5
            aw2 r3 = (aw2) r3
            r4 = r6
            r6 = r11
            r7 = r12
            java.lang.Object r3 = r3.v(r4, r6, r7, r8)
            if (r3 != r2) goto L_0x0123
            return r2
        L_0x0123:
            r2 = r1
        L_0x0124:
            r1 = r2
        L_0x0125:
            java.lang.Throwable r0 = defpackage.mcc.a(r0)
            if (r0 == 0) goto L_0x0132
            java.lang.String r0 = r1.A0
            java.lang.String r1 = "Media viewer. Fail request media total count."
            defpackage.udd.s(r0, r1, r10)
        L_0x0132:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ah2.F(vo8, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final s78 e() {
        s78 s78 = (s78) this.M0.get();
        return s78 == null ? new s78(0, 0, this.L0, this.b) : s78;
    }

    public final void p() {
        fw fwVar = this.J0;
        if (fwVar != null) {
            fwVar.h();
        }
        ew8 ew8 = this.z0;
        ew8.a.f(ew8);
    }

    public final void v(long j, String str) {
        String str2 = this.A0;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            fn6.d(tn7, str2, "Media viewer. Call fetch video msg:" + j + ", attach:" + str, (Throwable) null);
        }
        this.d1.o1(this, h1[0], xs7.D(this.a, this.x0.b(), ru3.b, new eg2(this, j, str, (Continuation) null)));
    }

    public final bv2 w() {
        return (bv2) this.B0.getValue();
    }

    public final k68 x() {
        Object obj;
        String str = (String) this.O0.get();
        Iterator it = ((ag2) this.T0.getValue()).a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (hhd.f(((k68) obj).x(), str)) {
                break;
            }
        }
        return (k68) obj;
    }

    public final k68 y(long j, String str) {
        Object obj;
        Iterator it = ((ag2) this.U0.a.getValue()).a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            k68 k68 = (k68) obj;
            if (k68.j() == j && str.equals(k68.x())) {
                break;
            }
        }
        return (k68) obj;
    }

    public final void z(long j, String str) {
        k68 x = x();
        if (x != null && x.j() == j && hhd.f(x.x(), str)) {
            taf.o(this.R0, new c05(5, false));
        }
    }
}
