package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: wb  reason: default package */
public final class wb extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ cc Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wb(cc ccVar, Continuation continuation) {
        super(2, continuation);
        this.Z = ccVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((List) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        wb wbVar = new wb(this.Z, continuation);
        wbVar.Y = obj;
        return wbVar;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            hcd hcd = this.Z.Y;
            this.X = 1;
            if (hcd.a((List) this.Y, this) == pu3) {
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
