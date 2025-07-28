package defpackage;

import android.app.Application;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: rj9  reason: default package */
public final class rj9 extends taf {
    public final s0c A0;
    public final v11 B0;
    public final grd C0;
    public final u09 D0;
    public final grd X;
    public volatile int Y;
    public final l05 Z;
    public final /* synthetic */ ii9 b;
    public final zwc c;
    public volatile mi9 o;
    public final dcd w0;
    public final ghe x0;
    public final t0c y0;
    public final hcd z0;

    /* JADX WARNING: type inference failed for: r11v8, types: [s30, java.lang.Object] */
    public rj9(Long l, z7c z7c, r7e r7e, r7e r7e2, r7e r7e3, t97 t97, t97 t972) {
        c8c c8c;
        cxa cxa = cxa.a;
        ko7 ko7 = ko7.a;
        r7e d = ko7.getAccessor().d(qna.class);
        r7e d2 = ko7.getAccessor().d(mg5.class);
        r7e d3 = ko7.getAccessor().d(Application.class);
        r7e d4 = ko7.getAccessor().d(xzc.class);
        t97 d5 = ko7.getAccessor().d(pk.class);
        r7e d6 = ko7.getAccessor().d(hba.class);
        r7e d7 = ko7.getAccessor().d(ap3.class);
        r7e d8 = ko7.getAccessor().d(c70.class);
        r7e b2 = ko7.getAccessor().b(vw9.class);
        ii9 ii9 = new ii9(d, t97, d2, d3, d4, d6);
        this.b = ii9;
        if (z7c != null) {
            c8c = new c8c(z7c, this.a, new mj9(this, 0), r7e3, t972, r7e2, t97, d5, d8, b2);
        } else if (l != null) {
            long longValue = l.longValue();
            ContextScope contextScope = this.a;
            mj9 mj9 = new mj9(this, 1);
            ? obj = new Object();
            obj.a = mj9;
            obj.b = d5;
            hcd a = icd.a(1, 1, 2);
            obj.c = a;
            obj.o = new s0c(a);
            grd a2 = hrd.a(cxa);
            obj.X = a2;
            obj.Y = new t0c(a2);
            ez3.N(new ck5(((ap3) d7.getValue()).c(longValue), new dfb(obj, (Continuation) null), 5), contextScope);
            c8c = obj;
        } else {
            throw new IllegalStateException("Pass registrationData or contactId to work with NeuroAvatarsDelegate".toString());
        }
        this.c = c8c;
        pj5 u09 = new u09(ii9.j, 4);
        grd a3 = hrd.a(hw4.a);
        this.X = a3;
        this.Z = new l05(0);
        bd3 bd3 = c8c instanceof bd3 ? c8c : null;
        this.w0 = bd3 != null ? bd3.f() : null;
        this.x0 = c8c.g();
        this.y0 = ez3.d0(new ck5(ez3.z(new v11(ez3.Q(new pj5[]{c8c.e(), u09}), c8c.c(), new z9(3, (Continuation) null, 25), 4)), new oj9(this, (Continuation) null), 5), this.a, ucd.a, new kwc((jwc) null, cxa));
        hcd b3 = icd.b(0, Integer.MAX_VALUE, 0, 4);
        this.z0 = b3;
        this.A0 = new s0c(b3);
        hcd a4 = icd.a(1, 1, 2);
        this.B0 = new v11(new t0c(a3), a4, new vp7(3, (Continuation) null, 2), 4);
        grd a5 = hrd.a(iw4.a);
        this.C0 = a5;
        this.D0 = new u09(new t0c(a5), 5);
        ArrayList arrayList = new ArrayList(16);
        for (int i = 0; i < 16; i++) {
            arrayList.add(new Object());
        }
        a4.g(arrayList);
        qi9 qi9 = (qi9) r7e.getValue();
        qi9.getClass();
        ez3.N(ez3.J(new ck5(ez3.J(new djc(new pi9(qi9, (Continuation) null)), ((pae) qi9.c.getValue()).b()), new nj9(this, (Continuation) null), 5), ((pae) t97.getValue()).b()), this.a);
    }

    public final void p() {
        lp.d(this.b.f.getCoroutineContext());
    }

    public final void q() {
        ii9 ii9 = this.b;
        if (!((qna) ii9.a.getValue()).b(qna.l)) {
            ii9.g.g(bc0.a);
            return;
        }
        xs7.E(ii9.f, (hu3) null, (ru3) null, new hi9(ii9, (Continuation) null), 3);
    }
}
