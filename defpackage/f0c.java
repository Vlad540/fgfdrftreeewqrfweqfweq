package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import ru.ok.onechat.reactions.ReactionsViewModel;

/* renamed from: f0c  reason: default package */
public final class f0c extends l5e implements i26 {
    public int X;
    public final /* synthetic */ ReactionsViewModel Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f0c(ReactionsViewModel reactionsViewModel, Continuation continuation) {
        super(2, continuation);
        this.Y = reactionsViewModel;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new f0c(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        if (i == 0) {
            wx3.H(obj);
            fo2 fo2 = (fo2) this.Y.t.getValue();
            this.X = 1;
            fo2.getClass();
            Object U = xs7.U(fo2.l, new co2(fo2, (Continuation) null), this);
            if (U != pu3) {
                U = jue;
            }
            if (U == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            try {
                wx3.H(obj);
            } catch (Throwable th) {
                if (!(th instanceof CancellationException)) {
                    udd.s("ru.ok.onechat.reactions.ReactionsViewModel", "runChatSubscribeNotifObserving: fail to run()", th);
                }
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue;
    }
}
