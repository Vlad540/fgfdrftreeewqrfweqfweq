package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: hp3  reason: default package */
public final class hp3 extends l5e implements i26 {
    public final /* synthetic */ jp3 X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ int Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hp3(jp3 jp3, String str, int i, Continuation continuation) {
        super(2, continuation);
        this.X = jp3;
        this.Y = str;
        this.Z = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new hp3(this.X, this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        jp3 jp3 = this.X;
        List f = jp3.c.f(this.Y, this.Z, hw4.a, jp3.e);
        jp3.getClass();
        return f;
    }
}
