package defpackage;

import kotlin.coroutines.Continuation;
import one.me.android.OneMeApplication;

/* renamed from: qy9  reason: default package */
public final class qy9 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ OneMeApplication Y;
    public final /* synthetic */ ry9 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qy9(OneMeApplication oneMeApplication, ry9 ry9, Continuation continuation) {
        super(2, continuation);
        this.Y = oneMeApplication;
        this.Z = ry9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((qy9) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new qy9(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        if (i == 0) {
            wx3.H(obj);
            km4 n = km4.y0.n(this.Y);
            py9 py9 = new py9(0, 0, ry9.class, this.Z, "weakActivities", "getWeakActivities()Ljava/util/concurrent/CopyOnWriteArrayList;");
            this.X = 1;
            n.getClass();
            Object f = n1g.f(new vx2(n, py9, (Continuation) null), this);
            if (f != pu3) {
                f = jue;
            }
            if (f == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue;
    }
}
