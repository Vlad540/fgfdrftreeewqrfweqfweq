package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: d71  reason: default package */
public final class d71 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ e71 Y;
    public final /* synthetic */ List Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d71(e71 e71, List list, Continuation continuation) {
        super(2, continuation);
        this.Y = e71;
        this.Z = list;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((d71) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new d71(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        if (i == 0) {
            wx3.H(obj);
            nxc nxc = this.Y.c;
            this.X = 1;
            Object U = xs7.U(((pae) ((t97) nxc.o).getValue()).b(), new up1(this.Z, nxc, (Continuation) null), this);
            if (U != pu3) {
                U = jue;
            }
            if (U == pu3) {
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
