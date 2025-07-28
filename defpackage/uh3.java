package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: uh3  reason: default package */
public final class uh3 extends l5e implements i26 {
    public final /* synthetic */ yh3 X;
    public final /* synthetic */ String Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uh3(yh3 yh3, String str, Continuation continuation) {
        super(2, continuation);
        this.X = yh3;
        this.Y = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new uh3(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        yh3 yh3 = this.X;
        yh3.p.set(((gy9) ((pk) yh3.l.getValue())).I(2, 0, (d10) null, (String) null, (String) null, (String) null, (String) null, this.Y));
        return jue.a;
    }
}
