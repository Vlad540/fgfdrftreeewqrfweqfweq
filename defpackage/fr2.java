package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.logout.a;

/* renamed from: fr2  reason: default package */
public final class fr2 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ kr2 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fr2(kr2 kr2, Continuation continuation) {
        super(2, continuation);
        this.Y = kr2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((fr2) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new fr2(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        kr2 kr2 = this.Y;
        if (i == 0) {
            wx3.H(obj);
            a aVar = kr2.Y;
            this.X = 1;
            if (aVar.a(this) == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        udd.p(kr2.D0, "handle logout", new Object[0]);
        n1g.c(kr2.E0, (CancellationException) null);
        return jue.a;
    }
}
