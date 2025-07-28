package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: ie5  reason: default package */
public final class ie5 extends l5e implements i26 {
    public final /* synthetic */ le5 X;
    public final /* synthetic */ List Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ie5(le5 le5, List list, Continuation continuation) {
        super(2, continuation);
        this.X = le5;
        this.Y = list;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ie5(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        le5.a(this.X, this.Y);
        return jue.a;
    }
}
