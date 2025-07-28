package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.workmanager.BacklogWorker;

/* renamed from: be0  reason: default package */
public final class be0 extends l5e implements i26 {
    public final /* synthetic */ BacklogWorker X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public be0(BacklogWorker backlogWorker, Continuation continuation) {
        super(2, continuation);
        this.X = backlogWorker;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new be0(this.X, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        return new Integer(this.X.e().g().count(0));
    }
}
