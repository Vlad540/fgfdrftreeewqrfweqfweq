package defpackage;

import android.text.Layout;
import kotlin.coroutines.Continuation;

/* renamed from: nw8  reason: default package */
public final class nw8 extends l5e implements i26 {
    public final /* synthetic */ s97 X;
    public final /* synthetic */ t97 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nw8(s97 s97, r7e r7e, Continuation continuation) {
        super(2, continuation);
        this.X = s97;
        this.Y = r7e;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new nw8(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        this.X.b.b((Layout) this.Y.getValue());
        return jue.a;
    }
}
