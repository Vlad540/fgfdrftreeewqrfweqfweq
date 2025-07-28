package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ls5  reason: default package */
public final class ls5 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ os5 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ls5(os5 os5, Continuation continuation) {
        super(2, continuation);
        this.Y = os5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ls5) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ls5(this.Y, continuation);
    }

    public final Object o(Object obj) {
        ep5 ep5;
        String str;
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        if (i == 0) {
            wx3.H(obj);
            os5 os5 = this.Y;
            xye xye = os5.x0;
            if (!(xye == null || (ep5 = xye.a) == null || (str = ep5.a) == null)) {
                b92 b92 = os5.b;
                this.X = 1;
                if (b92.c(str, this) == pu3) {
                    return pu3;
                }
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue;
    }
}
