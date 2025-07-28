package defpackage;

import java.util.Collection;
import kotlin.coroutines.Continuation;

/* renamed from: lw  reason: default package */
public final class lw extends l5e implements i26 {
    public int X;
    public final /* synthetic */ mw Y;
    public final /* synthetic */ Collection Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lw(mw mwVar, Collection collection, Continuation continuation) {
        super(2, continuation);
        this.Y = mwVar;
        this.Z = collection;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new lw(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        Object obj2 = pu3.a;
        int i = this.X;
        Object obj3 = jue.a;
        if (i == 0) {
            wx3.H(obj);
            mw mwVar = this.Y;
            this.X = 1;
            nec nec = ((b29) ((t97) mwVar.k).getValue()).a;
            Object U = xs7.U(nec.c().b(), new gec(nec, mwVar.a, this.Z, (Continuation) null), this);
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
