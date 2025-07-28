package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: fab  reason: default package */
public final class fab extends l5e implements i26 {
    public int X;
    public final /* synthetic */ hab Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fab(hab hab, Continuation continuation) {
        super(2, continuation);
        this.Y = hab;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new fab(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        hab hab = this.Y;
        if (i == 0) {
            wx3.H(obj);
            bs4 bs4 = hab.b;
            this.X = 1;
            obj = bs4.l(this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (((Boolean) obj).booleanValue()) {
            taf.o(hab.A0, v03.b);
        }
        return jue.a;
    }
}
