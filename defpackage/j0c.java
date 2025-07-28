package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.onechat.reactions.ReactionsViewModel;

/* renamed from: j0c  reason: default package */
public final class j0c extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ k0c Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j0c(k0c k0c, Continuation continuation) {
        super(2, continuation);
        this.Y = k0c;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((i22) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        j0c j0c = new j0c(this.Y, continuation);
        j0c.X = obj;
        return j0c;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        ReactionsViewModel q = this.Y.q();
        long j = ((i22) this.X).b.l0;
        tkc tkc = q.g;
        if (tkc != null) {
            tkc.b(Long.valueOf(j), "lastReactedMessageId");
        }
        return jue.a;
    }
}
