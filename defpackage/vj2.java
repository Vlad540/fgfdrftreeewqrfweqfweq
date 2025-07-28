package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: vj2  reason: default package */
public final class vj2 extends l5e implements i26 {
    public final /* synthetic */ dk2 X;
    public final /* synthetic */ i22 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vj2(dk2 dk2, i22 i22, Continuation continuation) {
        super(2, continuation);
        this.X = dk2;
        this.Y = i22;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new vj2(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        dk2 dk2 = this.X;
        dk2.getClass();
        i22 i22 = this.Y;
        if (i22.G()) {
            o62 o62 = i22.b;
            if (o62.g()) {
                ((gy9) ((pk) dk2.p.getValue())).j(o62.a);
            }
        }
        return jue.a;
    }
}
