package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import ru.ok.onechat.reactions.ReactionsViewModel;

/* renamed from: b0c  reason: default package */
public final class b0c extends l5e implements i26 {
    public final /* synthetic */ ReactionsViewModel X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b0c(ReactionsViewModel reactionsViewModel, Continuation continuation) {
        super(2, continuation);
        this.X = reactionsViewModel;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new b0c(this.X, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        ReactionsViewModel reactionsViewModel = this.X;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, "ru.ok.onechat.reactions.ReactionsViewModel", wn6.i("defaultReactions = [", o23.c0(o23.n0((List) reactionsViewModel.q.getValue(), 8), (String) null, (String) null, (String) null, (u16) null, 63), "]"), (Throwable) null);
        }
        i22 i = this.X.i();
        if (i != null) {
            ReactionsViewModel reactionsViewModel2 = this.X;
            long j = i.b.l0;
            tkc tkc = reactionsViewModel2.g;
            if (tkc != null) {
                tkc.b(Long.valueOf(j), "lastReactedMessageId");
            }
        }
        return jue.a;
    }
}
