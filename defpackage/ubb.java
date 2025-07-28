package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: ubb  reason: default package */
public final class ubb extends taf {
    public static final /* synthetic */ k77[] H0;
    public final AtomicLong A0 = new AtomicLong();
    public final AtomicLong B0 = new AtomicLong(-9223372036854775807L);
    public final AtomicBoolean C0 = new AtomicBoolean(false);
    public final grd D0;
    public final t0c E0;
    public final l05 F0;
    public final l05 G0;
    public final t97 X;
    public final hcd Y;
    public final t97 Z;
    public final long b;
    public final t97 c;
    public final t97 o;
    public final t97 w0;
    public final t97 x0;
    public final pab y0;
    public final e3 z0 = hwf.t();

    static {
        k77 hc9 = new hc9(ubb.class, "getChatLinkJob", "getGetChatLinkJob()Lkotlinx/coroutines/Job;");
        m7c.a.getClass();
        H0 = new k77[]{hc9};
    }

    public ubb(long j, t97 t97, t97 t972, t97 t973, t97 t974, t97 t975, t97 t976, t97 t977) {
        long j2 = j;
        this.b = j2;
        this.c = t972;
        this.o = t973;
        this.X = t974;
        hcd b2 = icd.b(0, 0, 0, 7);
        this.Y = b2;
        this.Z = t97;
        this.w0 = t976;
        this.x0 = t977;
        pab pab = (pab) i6b.a.getAccessor().c(pab.class);
        this.y0 = pab;
        q02 Q = ez3.Q(new pj5[]{new ik5(b2, 2), new qbb(((ng0) t975.getValue()).b, this, 1)});
        grd a = hrd.a(hw4.a);
        this.D0 = a;
        this.E0 = new t0c(a);
        this.F0 = new l05(0);
        this.G0 = new l05(0);
        ez3.N(ez3.J(new qbb(new ck5(new djc(new tbb(new ik5(((aw2) ((bv2) t972.getValue())).m(j2), 2), (Continuation) null, this)), new jbb(this, (Continuation) null), 5), this, 0), ((pae) t973.getValue()).a()), this.a);
        ez3.N(ez3.J(new ck5(Q, new kbb(2, this, ubb.class, "handleApiError", "handleApiError(Lone/me/profile/screens/invite/CreateLinkErrors;)V", 4, 0), 5), ((pae) t973.getValue()).a()), this.a);
        ez3.N(new ck5(new s0c(pab.b), new lbb(this, (Continuation) null), 5), this.a);
    }

    public final void p() {
        pab pab = this.y0;
        pab.a.f(pab);
        k77[] k77Arr = H0;
        k77 k77 = k77Arr[0];
        e3 e3Var = this.z0;
        g37 g37 = (g37) e3Var.T0(this, k77);
        if (g37 != null) {
            g37.cancel((CancellationException) null);
        }
        e3Var.o1(this, k77Arr[0], (Object) null);
    }

    public final void q(i22 i22) {
        mge mge;
        i22 i222 = i22;
        lg7 c2 = hwf.c();
        c2.add(new xbb(i222.b.r0 == 2 ? l8a.e1 : i22.H() ? l8a.R0 : l8a.P0, (nge) null, 6));
        o62 o62 = i222.b;
        String str = o62.I;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        c2.add(new ccb(new p92(i222.f(fj0.c, ej0.a), o62.a, i22.p(), str2, !this.C0.get() && str2.length() == 0, i22.W(), d8.v(i222.d(((lqc) ((f03) this.x0.getValue())).s()), 128))));
        c2.add(new xbb(l8a.S0, nte.o, 2));
        int i = j8a.P;
        o7d o7d = new o7d((long) i, 0, new hge(l8a.a), (d7d) null, (mge) null, Integer.valueOf(phc.X1), (b7d) null, (u6d) null, (mge) null, 0, (r6d) null, 2008);
        String s = s();
        c2.add(new jcb(i, o7d, !(s == null || s.length() == 0), 536879104));
        int i2 = j8a.O;
        o7d o7d2 = new o7d((long) i2, 0, new hge(l8a.f1), (d7d) null, (mge) null, Integer.valueOf(phc.Z1), (b7d) null, (u6d) null, (mge) null, 0, (r6d) null, 2008);
        String s2 = s();
        c2.add(new jcb(i2, o7d2, !(s2 == null || s2.length() == 0), -2147475456));
        if (i22.H() && i22.a0()) {
            kb5 kb5 = (kb5) ((jb5) this.w0.getValue());
            kb5.getClass();
            if (kb5.m(PmsKey.f31editchattypescreenenabled, false)) {
                int i3 = o62.r0;
                int i4 = i3 == 0 ? -1 : mbb.$EnumSwitchMapping$0[hr1.t(i3)];
                if (i4 == -1) {
                    mge = mge.a;
                } else if (i4 == 1) {
                    mge = new hge(l8a.n);
                } else if (i4 == 2) {
                    mge = new hge(l8a.m);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                int i5 = j8a.M;
                c2.add(new jcb(i5, new o7d((long) i5, 0, new hge(l8a.Z0), (d7d) null, (mge) null, Integer.valueOf(phc.f2), new x6d(mge, (Integer) null), (u6d) null, (mge) null, 0, (r6d) null, 1944), true, 8192));
            }
        }
        this.D0.setValue(hwf.a(c2));
    }

    public final i22 r() {
        return (i22) ((aw2) ((bv2) this.c.getValue())).m(this.b).a.getValue();
    }

    public final String s() {
        o62 o62;
        String str;
        i22 r = r();
        if (r == null || (o62 = r.b) == null || (str = o62.I) == null || str.length() == 0) {
            return null;
        }
        return str;
    }
}
