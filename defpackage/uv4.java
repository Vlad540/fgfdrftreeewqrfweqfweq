package defpackage;

import android.graphics.drawable.Drawable;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: uv4  reason: default package */
public final class uv4 extends taf {
    public static final /* synthetic */ k77[] z0;
    public final t97 X;
    public final grd Y;
    public final t0c Z;
    public final ji b;
    public final c9 c;
    public final pae o;
    public final e3 w0 = hwf.t();
    public final grd x0;
    public final t0c y0;

    static {
        hc9 hc9 = new hc9(uv4.class, "selectedFindJob", "getSelectedFindJob()Lkotlinx/coroutines/Job;");
        m7c.a.getClass();
        z0 = new k77[]{hc9};
    }

    public uv4(t97 t97, ji jiVar, c9 c9Var, pae pae, v2c v2c) {
        this.b = jiVar;
        this.c = c9Var;
        this.o = pae;
        this.X = t97;
        grd a = hrd.a(new sv4(0, 0, 0, 7));
        this.Y = a;
        this.Z = new t0c(a);
        hw4 hw4 = hw4.a;
        grd a2 = hrd.a(new rv4(hw4, hw4));
        this.x0 = a2;
        this.y0 = new t0c(a2);
        udd.p(uv4.class.getName(), "Load emoji. Start", new Object[0]);
        djc djc = new djc(new ov4(this, (Continuation) null));
        rn1 c2 = am7.c(v2c.b().a(p23.B(r2c.c, r2c.Y)));
        gj gjVar = (gj) t97.getValue();
        gjVar.getClass();
        ez3.N(ez3.J(new ck5(ez3.s(djc, c2, new djc(new yi(gjVar, (Continuation) null)), pv4.w0), new qv4(this, (Continuation) null), 5), ((n3a) pae).b()), this.a);
    }

    public final ku4 q(List list, ph phVar, int i, int i2) {
        Drawable drawable;
        Object obj;
        ph phVar2 = phVar;
        Iterator it = list.iterator();
        while (true) {
            drawable = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (hhd.f(((ku4) obj).c, phVar2.b)) {
                break;
            }
        }
        ku4 ku4 = (ku4) obj;
        if (ku4 != null) {
            drawable = ku4.X;
        }
        long j = phVar2.a;
        int X2 = a24.X(((float) 28) * dh4.c().getDisplayMetrics().density);
        ji jiVar = this.b;
        jiVar.getClass();
        Long valueOf = Long.valueOf(j);
        String str = phVar2.c;
        String str2 = BuildConfig.FLAVOR;
        if (str == null) {
            str = str2;
        }
        String str3 = phVar2.e;
        if (str3 != null) {
            str2 = str3;
        }
        zj zjVar = new zj(jiVar.b, X2, hrd.a(new ese(valueOf, str, str2)), drawable == null ? li.a : new ki(drawable), jiVar.a);
        zjVar.setBounds(0, 0, X2, X2);
        return new ku4(i, ku4 != null ? ku4.b : i2, phVar2.b, (List) null, zjVar, phVar2.a, 8);
    }

    public final void r(int i, u16 u16) {
        qod D = xs7.D(this.a, this.o.b(), ru3.b, new tv4(u16, i, this, (Continuation) null));
        this.w0.o1(this, z0[0], D);
    }
}
