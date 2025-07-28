package defpackage;

import android.os.Looper;
import kotlin.coroutines.Continuation;

/* renamed from: vx2  reason: default package */
public final class vx2 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ km4 Y;
    public final /* synthetic */ s16 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vx2(km4 km4, py9 py9, Continuation continuation) {
        super(2, continuation);
        this.Y = km4;
        this.Z = py9;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        vx2 vx2 = new vx2(this.Y, this.Z, continuation);
        vx2.X = obj;
        return vx2;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        ou3 ou3 = (ou3) this.X;
        if (!hhd.f(Looper.myLooper(), Looper.getMainLooper())) {
            km4 km4 = this.Y;
            pj5 mx2 = new mx2((t0c) ((ud) km4.o).o, km4, 1);
            pj5 pj5 = (s0c) ((jg8) km4.Y).o;
            pj5 z = ez3.z(ez3.h0(new ck5(new mx2(new zi1(pj5, 22), km4, 0), new nx2(km4, (Continuation) null)), new ox2(3, (Continuation) null, 0)));
            pj5 pj52 = (grd) km4.w0;
            ez3.N(new gl5(new bc(new ck5(new ik5(new mx2(ez3.I(new tj5(2, new pj5[]{(t0c) ((v4b) km4.c).c, mx2, pj5, z, pj52})), km4, 2), 2), new px2(km4, (Continuation) null), 5), 17, new qx2(km4, (Continuation) null, 0)), new qx2(km4, (Continuation) null, 1)), ou3);
            s16 s16 = this.Z;
            ez3.N(new ck5((t0c) km4.x0, new rx2(km4, s16, (Continuation) null), 5), ou3);
            ez3.N(new ck5(pj52, new sx2(km4, s16, (Continuation) null), 5), ou3);
            return jue.a;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
