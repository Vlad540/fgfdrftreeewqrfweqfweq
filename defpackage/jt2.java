package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: jt2  reason: default package */
public final class jt2 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ fu2 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jt2(fu2 fu2, Continuation continuation) {
        super(2, continuation);
        this.Y = fu2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((jt2) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new jt2(this.Y, continuation);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [i26, l5e] */
    public final Object o(Object obj) {
        Object obj2 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        if (i == 0) {
            wx3.H(obj);
            fu2 fu2 = this.Y;
            taf.o(fu2.Q0, new sg9(jue));
            ju3 a = fu2.Y.a();
            ? l5e = new l5e(2, (Continuation) null);
            this.X = 1;
            if (xs7.U(a, l5e, this) == obj2) {
                return obj2;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue;
    }
}
