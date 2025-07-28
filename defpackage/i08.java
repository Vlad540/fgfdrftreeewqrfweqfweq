package defpackage;

import android.os.Build;
import java.util.Collection;
import java.util.List;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: i08  reason: default package */
public final class i08 extends taf {
    public static final /* synthetic */ k77[] M0;
    public final l05 A0 = new l05(0);
    public final grd B0;
    public final pna C0;
    public final pna D0;
    public final t0c E0;
    public final v11 F0;
    public final ik5 G0;
    public final t0c H0;
    public final t0c I0;
    public final t0c J0;
    public final e3 K0;
    public final e3 L0;
    public final t97 X;
    public final t97 Y;
    public final t97 Z;
    public final s16 b;
    public final t97 c;
    public final t97 o;
    public final grd w0 = hrd.a(qz.a);
    public final us0 x0 = xs7.a(-2, 0, 6);
    public volatile List y0;
    public final qe4 z0 = new qe4(17);

    static {
        Class<i08> cls = i08.class;
        M0 = new k77[]{new hc9(cls, "fillByEditMessagesAttachmentsJob", "getFillByEditMessagesAttachmentsJob()Lkotlinx/coroutines/Job;"), c3d.g(m7c.a, cls, "finalActionJob", "getFinalActionJob()Lkotlinx/coroutines/Job;")};
    }

    public i08(t97 t97, t97 t972, t97 t973, t97 t974, gk2 gk2) {
        t97 t975 = rl2.a;
        this.b = gk2;
        this.c = t97;
        this.o = t972;
        this.X = t975;
        this.Y = t973;
        this.Z = t974;
        grd a = hrd.a(hw4.a);
        this.B0 = a;
        String[] strArr = qna.m;
        pna pna = new pna(strArr);
        this.C0 = pna;
        pna pna2 = new pna(Build.VERSION.SDK_INT >= 34 ? new String[]{"android.permission.READ_MEDIA_VISUAL_USER_SELECTED"} : strArr);
        this.D0 = pna2;
        v11 v11 = new v11(pna, pna2, new c08(3, (Continuation) null, 0), 4);
        p3b p3b = p3b.a;
        qr4 qr4 = ucd.a;
        t0c d0 = ez3.d0(v11, this.a, qr4, p3b);
        this.E0 = d0;
        this.F0 = new v11(pna, pna2, new c08(3, (Continuation) null, 1), 4);
        this.G0 = new ik5(d0, 20);
        ik5 ik5 = new ik5(a, 21);
        Boolean bool = Boolean.FALSE;
        this.H0 = ez3.d0(ik5, this.a, qr4, bool);
        ik5 ik52 = new ik5(a, 22);
        grd grd = e87.f;
        this.I0 = ez3.d0(new v11(ik52, grd, new j01(3, (Continuation) null, 1), 4), this.a, qr4, bool);
        this.J0 = ez3.d0(new bc(new v11(grd, a, a08.w0, 4), 27, this), this.a, qr4, jxc.b);
        this.K0 = hwf.t();
        this.L0 = hwf.t();
        taf.n(this, (hu3) null, (ru3) null, new b08(this, (Continuation) null), 3);
    }

    public static final wk7 q(i08 i08) {
        return (wk7) i08.o.getValue();
    }

    public final pwc r() {
        return (pwc) this.X.getValue();
    }

    public final boolean s() {
        return this.b.invoke() != null;
    }

    public final void t(boolean z) {
        us0 us0 = this.x0;
        if (!z) {
            int i = e87.a;
            if (e87.b(e87.c)) {
                us0.n(wy7.a);
                return;
            }
        }
        Long l = (Long) this.b.invoke();
        ru3 ru3 = ru3.b;
        e3 e3Var = this.L0;
        k77[] k77Arr = M0;
        if (l != null) {
            long longValue = l.longValue();
            vqc vqc = (xzc) this.Z.getValue();
            vqc.getClass();
            int o2 = (int) vqc.o(PmsKey.max-attach-count, (long) 12);
            if (r().b() > o2) {
                us0.n(new dz7(o2));
                return;
            }
            e3Var.o1(this, k77Arr[1], xs7.D(this.a, ((pae) this.Y.getValue()).b(), ru3, new yz7(this, longValue, (Continuation) null)));
            return;
        }
        e3Var.o1(this, k77Arr[1], taf.n(this, (hu3) null, ru3, new d08(this, (Continuation) null), 1));
        taf.o(this.A0, sz7.a);
    }

    public final boolean u() {
        if ((!(!((Collection) this.B0.getValue()).isEmpty()) || s()) && (this.y0 == null || hhd.f(this.B0.getValue(), this.y0))) {
            return true;
        }
        this.x0.n(zy7.a);
        return false;
    }
}
