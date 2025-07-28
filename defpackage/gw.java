package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: gw  reason: default package */
public final class gw extends l5e implements i26 {
    public int X;
    public final /* synthetic */ t97 Y;
    public final /* synthetic */ mw Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gw(t97 t97, mw mwVar, Continuation continuation) {
        super(2, continuation);
        this.Y = t97;
        this.Z = mwVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new gw(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        Object obj2 = pu3.a;
        int i = this.X;
        Object obj3 = jue.a;
        if (i == 0) {
            wx3.H(obj);
            mw mwVar = this.Z;
            long j = mwVar.a;
            long h = ((lh6) mwVar.e).h();
            md4 md4 = md4.DELAYED;
            this.X = 1;
            nec nec = ((b29) this.Y.getValue()).a;
            Object U = xs7.U(nec.c().b(), new fec(md4, nec, j, h, (Continuation) null), this);
            if (U != obj2) {
                U = obj3;
            }
            if (U != obj2) {
                U = obj3;
            }
            if (U == obj2) {
                return obj2;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj3;
    }
}
