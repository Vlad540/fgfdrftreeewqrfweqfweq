package defpackage;

import java.util.concurrent.Callable;
import kotlin.coroutines.Continuation;

/* renamed from: bv3  reason: default package */
public final class bv3 extends l5e implements i26 {
    public final /* synthetic */ Callable X;
    public final /* synthetic */ yv1 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bv3(Callable callable, zv1 zv1, Continuation continuation) {
        super(2, continuation);
        this.X = callable;
        this.Y = zv1;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((bv3) n((ou3) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new bv3(this.X, (zv1) this.Y, continuation);
    }

    public final Object o(Object obj) {
        yv1 yv1 = this.Y;
        wx3.H(obj);
        try {
            yv1.resumeWith(this.X.call());
        } catch (Throwable th) {
            yv1.resumeWith(new kcc(th));
        }
        return jue.a;
    }
}
