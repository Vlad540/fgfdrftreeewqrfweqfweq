package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: eyd  reason: default package */
public final class eyd extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ wxd Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eyd(wxd wxd, Continuation continuation) {
        super(2, continuation);
        this.Z = wxd;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((rj5) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        eyd eyd = new eyd(this.Z, continuation);
        eyd.Y = obj;
        return eyd;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            if (((rj5) this.Y).a(this.Z, this) == pu3) {
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
