package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.onechat.reactions.ReactionsViewModel;

/* renamed from: c0c  reason: default package */
public final class c0c extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ ReactionsViewModel Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c0c(ReactionsViewModel reactionsViewModel, Continuation continuation) {
        super(2, continuation);
        this.Z = reactionsViewModel;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((d0c) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        c0c c0c = new c0c(this.Z, continuation);
        c0c.Y = obj;
        return c0c;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            if (ReactionsViewModel.e(this.Z, (d0c) this.Y, this) == pu3) {
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
