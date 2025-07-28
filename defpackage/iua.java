package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: iua  reason: default package */
public final class iua extends l5e implements i26 {
    public int X;
    public final /* synthetic */ kua Y;
    public final /* synthetic */ String Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public iua(kua kua, String str, Continuation continuation) {
        super(2, continuation);
        this.Y = kua;
        this.Z = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((iua) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new iua(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        if (i == 0) {
            wx3.H(obj);
            dl8 dl8 = this.Y.o;
            this.X = 1;
            pk8 pk8 = (pk8) dl8;
            pk8.getClass();
            Object f = n1g.f(new jk8(pk8, this.Z, (Continuation) null), this);
            if (f != pu3) {
                f = jue;
            }
            if (f == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue;
    }
}
