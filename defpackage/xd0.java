package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.workmanager.BacklogWorker;

/* renamed from: xd0  reason: default package */
public final class xd0 extends l5e implements i26 {
    public final /* synthetic */ l7c X;
    public final /* synthetic */ List Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xd0(l7c l7c, List list, Continuation continuation) {
        super(2, continuation);
        this.X = l7c;
        this.Y = list;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new xd0(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        return Boolean.valueOf(((BacklogWorker) this.X.a).e().g().contains(this.Y));
    }
}
