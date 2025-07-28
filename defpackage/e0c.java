package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import ru.ok.onechat.reactions.ReactionsViewModel;

/* renamed from: e0c  reason: default package */
public final class e0c extends l5e implements i26 {
    public int X;
    public final /* synthetic */ ReactionsViewModel Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e0c(ReactionsViewModel reactionsViewModel, Continuation continuation) {
        super(2, continuation);
        this.Y = reactionsViewModel;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new e0c(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = jue.a;
        pu3 pu32 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            fo2 fo2 = (fo2) this.Y.t.getValue();
            this.X = 1;
            fo2.j = true;
            try {
                g37 g37 = fo2.f;
                if (g37 != null) {
                    g37.cancel((CancellationException) null);
                }
            } catch (Throwable th) {
                udd.s("fo2", "cancel fail!", th);
            }
            fo2.e(this);
            if (pu3 == pu32) {
                return pu32;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return pu3;
    }
}
