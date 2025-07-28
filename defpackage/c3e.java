package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* renamed from: c3e  reason: default package */
public final class c3e extends l5e implements i26 {
    public final /* synthetic */ ul7 A0;
    public p2e X;
    public int Y;
    public final /* synthetic */ e3e Z;
    public final /* synthetic */ String w0;
    public final /* synthetic */ int x0;
    public final /* synthetic */ n62 y0;
    public final /* synthetic */ yha z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c3e(e3e e3e, String str, int i, n62 n62, yha yha, ul7 ul7, Continuation continuation) {
        super(2, continuation);
        this.Z = e3e;
        this.w0 = str;
        this.x0 = i;
        this.y0 = n62;
        this.z0 = yha;
        this.A0 = ul7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new c3e(this.Z, this.w0, this.x0, this.y0, this.z0, this.A0, continuation);
    }

    public final Object o(Object obj) {
        Object obj2;
        p2e p2e;
        grd grd;
        Object value;
        i22 i22;
        Object value2;
        Object value3;
        Object value4;
        pu3 pu3 = pu3.a;
        int i = this.Y;
        jue jue = jue.a;
        e3e e3e = this.Z;
        if (i == 0) {
            wx3.H(obj);
            String str = e3e.F0.a;
            String str2 = this.w0;
            if (!hhd.f(str, str2)) {
                e3e.F0 = m3e.g;
            }
            zqd zqd = e3e.b;
            i22 i222 = (i22) zqd.getValue();
            boolean z = false;
            if (i222 != null && i222.F()) {
                z = true;
            }
            p2e d = k2e.d(str2, this.x0, this.y0);
            p2e p2e2 = p2e.X;
            grd grd2 = e3e.G0;
            if (d == p2e2) {
                do {
                    value4 = grd2.getValue();
                    q2e q2e = (q2e) value4;
                } while (!grd2.b(value4, (Object) null));
                return jue;
            } else if (z && (d == p2e.a || d == p2e.b)) {
                do {
                    value3 = grd2.getValue();
                    q2e q2e2 = (q2e) value3;
                } while (!grd2.b(value3, (Object) null));
                return jue;
            } else if (d != p2e.c || ((i22 = (i22) zqd.getValue()) != null && i22.k0())) {
                m3e m3e = e3e.F0;
                this.X = d;
                this.Y = 1;
                yha yha = this.z0;
                obj2 = xs7.U(((pae) yha.b).a(), new n2e(m3e, this.w0, this.x0, yha, (Continuation) null), this);
                if (obj2 == pu3) {
                    return pu3;
                }
                p2e = d;
            } else {
                do {
                    value2 = grd2.getValue();
                    q2e q2e3 = (q2e) value2;
                } while (!grd2.b(value2, (Object) null));
                return jue;
            }
        } else if (i == 1) {
            p2e = this.X;
            wx3.H(obj);
            obj2 = obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        m3e m3e2 = (m3e) obj2;
        e3e.F0 = m3e2;
        ArrayList D = this.A0.D(m3e2.d);
        do {
            grd = e3e.G0;
            value = grd.getValue();
            q2e q2e4 = (q2e) value;
        } while (!grd.b(value, new q2e(p2e, D)));
        return jue;
    }
}
