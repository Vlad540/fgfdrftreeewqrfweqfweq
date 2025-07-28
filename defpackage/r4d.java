package defpackage;

import android.graphics.RectF;
import kotlin.coroutines.Continuation;

/* renamed from: r4d  reason: default package */
public final class r4d extends l5e implements i26 {
    public final /* synthetic */ RectF X;
    public final /* synthetic */ v4d Y;
    public final /* synthetic */ String Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r4d(RectF rectF, v4d v4d, String str, Continuation continuation) {
        super(2, continuation);
        this.X = rectF;
        this.Y = v4d;
        this.Z = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new r4d(this.X, this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        d10 g = xs7.g(this.X);
        v4d v4d = this.Y;
        v4d.I0.set(((gy9) ((pk) v4d.y0.getValue())).G(this.Z, g));
        taf.o(v4d.B0, new t8d(new hge(zaa.q), new Integer(phc.m)));
        return jue.a;
    }
}
