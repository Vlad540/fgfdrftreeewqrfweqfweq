package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: a21  reason: default package */
public final class a21 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ jj7 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a21(jj7 jj7, Continuation continuation) {
        super(2, continuation);
        this.Y = jj7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((a21) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new a21(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        jj7 jj7 = this.Y;
        if (i == 0) {
            wx3.H(obj);
            String string = jj7.y().g.getString("user.callsToken", (String) null);
            if (string == null || h0e.c0(string)) {
                this.X = 1;
                if (((mq1) ((jq1) ((t97) jj7.c).getValue())).a(this) == pu3) {
                    return pu3;
                }
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jj7.y().g.getString("user.callsToken", (String) null);
    }
}
