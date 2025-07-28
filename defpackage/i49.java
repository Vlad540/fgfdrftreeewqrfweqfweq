package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.logout.a;

/* renamed from: i49  reason: default package */
public final class i49 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ a Y;
    public final /* synthetic */ q49 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i49(a aVar, q49 q49, Continuation continuation) {
        super(2, continuation);
        this.Y = aVar;
        this.Z = q49;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((i49) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new i49(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            if (this.Y.a(this) == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        q49 q49 = this.Z;
        ((zb0) q49.g.getValue()).b.clear();
        n1g.c(q49.f, (CancellationException) null);
        return jue.a;
    }
}
