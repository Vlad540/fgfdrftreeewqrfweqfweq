package defpackage;

import java.util.concurrent.Callable;
import kotlin.coroutines.Continuation;

/* renamed from: xu3  reason: default package */
public final class xu3 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ aec w0;
    public final /* synthetic */ rj5 x0;
    public final /* synthetic */ String[] y0;
    public final /* synthetic */ Callable z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xu3(boolean z, aec aec, rj5 rj5, String[] strArr, Callable callable, Continuation continuation) {
        super(2, continuation);
        this.Z = z;
        this.w0 = aec;
        this.x0 = rj5;
        this.y0 = strArr;
        this.z0 = callable;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xu3) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        xu3 xu3 = new xu3(this.Z, this.w0, this.x0, this.y0, this.z0, continuation);
        xu3.Y = obj;
        return xu3;
    }

    public final Object o(Object obj) {
        hu3 hu3;
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        if (i == 0) {
            wx3.H(obj);
            ou3 ou3 = (ou3) this.Y;
            us0 a = xs7.a(-1, 0, 6);
            wu3 wu3 = new wu3(this.y0, a, 0);
            a.n(jue);
            ype ype = (ype) ou3.getCoroutineContext().get(ype.c);
            if (ype == null || (hu3 = ype.a) == null) {
                boolean z = this.Z;
                aec aec = this.w0;
                hu3 = z ? h2g.m(aec) : h2g.l(aec);
            }
            us0 a2 = xs7.a(0, 0, 7);
            xs7.E(ou3, hu3, (ru3) null, new vu3(this.w0, wu3, a, this.z0, a2, (Continuation) null), 2);
            this.X = 1;
            Object w = a24.w(this.x0, a2, true, this);
            if (w != pu3) {
                w = jue;
            }
            if (w == pu3) {
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
