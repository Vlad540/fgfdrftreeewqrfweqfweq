package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.coroutines.Continuation;

/* renamed from: fi9  reason: default package */
public final class fi9 extends l5e implements i26 {
    public final /* synthetic */ String X;
    public final /* synthetic */ Rect Y;
    public final /* synthetic */ ii9 Z;
    public final /* synthetic */ RectF w0;
    public final /* synthetic */ int x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fi9(String str, Rect rect, ii9 ii9, RectF rectF, int i, Continuation continuation) {
        super(2, continuation);
        this.X = str;
        this.Y = rect;
        this.Z = ii9;
        this.w0 = rectF;
        this.x0 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new fi9(this.X, this.Y, this.Z, this.w0, this.x0, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        ii9 ii9 = this.Z;
        String str = this.X;
        ii9.i.m((Object) null, new fc0(xs7.i(str, this.Y, (xzc) ii9.d.getValue()), str, xs7.g(this.w0), this.x0));
        return jue.a;
    }
}
