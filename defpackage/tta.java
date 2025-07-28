package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: tta  reason: default package */
public final class tta extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ wta Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tta(wta wta, Continuation continuation) {
        super(2, continuation);
        this.Z = wta;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((tta) n((bk3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        tta tta = new tta(this.Z, continuation);
        tta.Y = obj;
        return tta;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        if (i == 0) {
            wx3.H(obj);
            wta wta = this.Z;
            grd grd = wta.o;
            List q = wta.q(wta, (bk3) this.Y);
            this.X = 1;
            grd.setValue(q);
            if (jue == pu3) {
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
