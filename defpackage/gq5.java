package defpackage;

import android.net.Uri;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: gq5  reason: default package */
public final class gq5 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ rq5 Y;
    public final /* synthetic */ t97 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gq5(rq5 rq5, t97 t97, Continuation continuation) {
        super(2, continuation);
        this.Y = rq5;
        this.Z = t97;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((gq5) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new gq5(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        Object obj2;
        tf3 k;
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            rq5 rq5 = this.Y;
            k77[] k77Arr = rq5.H0;
            long j = this.Y.c;
            this.X = 1;
            obj2 = ((bv2) rq5.Z.getValue()).k(j, this);
            if (obj2 == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
            obj2 = obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i22 i22 = (i22) obj2;
        ep5 ep5 = this.Y.E0;
        String str = null;
        Set set = ep5 != null ? ep5.G0 : null;
        if (set == null) {
            set = qw4.a;
        }
        pg7 wp5 = new wp5((lge) null, !set.contains(fr5.o));
        jue jue = jue.a;
        if (i22 == null) {
            this.Y.z0.m((Object) null, p23.B(wp5, new sq5(2)));
            return jue;
        }
        this.Y.C0.updateAndGet(new g22(i22, 1));
        rq5 rq52 = this.Y;
        t97 t97 = this.Z;
        lg7 c = hwf.c();
        c.add(wp5);
        c.add(new sq5(536870914));
        rq52.getClass();
        Uri t = rq5.t(i22);
        long j2 = i22.b.a;
        if (t != null) {
            str = t.toString();
        }
        String str2 = str;
        ((ho2) t97.getValue()).getClass();
        i22.h0();
        CharSequence charSequence = i22.y0;
        long e = i22.e();
        i22.i0();
        c.add(new tq5(j2, str2, charSequence, e, i22.B0, i22.U() || ((k = i22.k()) != null && k.u()), -2147483644));
        this.Y.z0.setValue(hwf.a(c));
        return jue;
    }
}
