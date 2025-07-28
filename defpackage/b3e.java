package defpackage;

import android.content.Context;
import kotlin.coroutines.Continuation;

/* renamed from: b3e  reason: default package */
public final class b3e extends l5e implements i26 {
    public int X;
    public final /* synthetic */ n62 Y;
    public final /* synthetic */ e3e Z;
    public final /* synthetic */ Context w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b3e(n62 n62, e3e e3e, Context context, Continuation continuation) {
        super(2, continuation);
        this.Y = n62;
        this.Z = e3e;
        this.w0 = context;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new b3e(this.Y, this.Z, this.w0, continuation);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [ul7, java.lang.Object] */
    public final Object o(Object obj) {
        Object obj2;
        Object obj3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        n62 n62 = this.Y;
        e3e e3e = this.Z;
        if (i == 0) {
            wx3.H(obj);
            if (n62 == null) {
                return jue;
            }
            ik5 ik5 = new ik5(e3e.b, 2);
            this.X = 1;
            obj2 = ez3.D(ik5, this);
            if (obj2 == obj3) {
                return obj3;
            }
        } else if (i == 1) {
            wx3.H(obj);
            obj2 = obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        pk pkVar = (pk) e3e.Z.getValue();
        tt0 tt0 = (tt0) e3e.w0.getValue();
        t52 t52 = (t52) e3e.y0.getValue();
        zo0 zo0 = (zo0) e3e.z0.getValue();
        qmc a = ((nbe) ((mbe) e3e.A0.getValue())).a();
        t97 t97 = e3e.X;
        t97 t972 = e3e.E0;
        t97 t973 = e3e.B0;
        jue jue2 = jue;
        t97 t974 = e3e.C0;
        k3e k3e = new k3e(pkVar, tt0, t52, zo0, (i22) obj2, a, (gsc) t97.getValue(), (w6a) t972.getValue(), (g2b) t973.getValue(), (o2b) t974.getValue(), (f3d) e3e.D0.getValue());
        t97 t975 = e3e.Y;
        n62 n622 = this.Y;
        yha yha = new yha(n62, (pae) t975.getValue(), k3e, new jp3(n622, (di3) e3e.x0.getValue(), (pae) t975.getValue(), (gsc) t97.getValue(), (w6a) t972.getValue(), (g2b) t973.getValue(), (o2b) t974.getValue()));
        Context context = this.w0;
        t97 t976 = mqc.h;
        ? obj4 = new Object();
        obj4.c = context;
        obj4.a = n62;
        obj4.b = t976;
        e3e.T0 = n62;
        e3e.S0 = yha;
        e3e.U0 = obj4;
        return jue2;
    }
}
