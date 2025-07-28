package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: l57  reason: default package */
public final class l57 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ b0d Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l57(b0d b0d, Continuation continuation) {
        super(2, continuation);
        this.Y = b0d;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new l57(this.Y, continuation);
    }

    public final Object o(Object obj) {
        Object obj2;
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            Iterator it = ((List) this.Y.o).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((q57) obj2).c().contains("WebAppBackButtonPressed")) {
                    break;
                }
            }
            q57 q57 = (q57) obj2;
            if (q57 != null) {
                this.X = 1;
                if (q57.a("WebAppBackButtonPressed", "{}", this) == pu3) {
                    return pu3;
                }
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue.a;
    }
}
