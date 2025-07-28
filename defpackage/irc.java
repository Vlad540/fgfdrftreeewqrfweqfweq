package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: irc  reason: default package */
public final class irc extends l5e implements i26 {
    public int X;
    public final /* synthetic */ jrc Y;
    public final /* synthetic */ jh0 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public irc(jrc jrc, jh0 jh0, Continuation continuation) {
        super(2, continuation);
        this.Y = jrc;
        this.Z = jh0;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((irc) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new irc(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            hcd hcd = this.Y.a;
            erc erc = new erc(this.Z);
            this.X = 1;
            if (hcd.a(erc, this) == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue.a;
    }
}
