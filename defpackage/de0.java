package defpackage;

import java.util.HashSet;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.workmanager.BacklogWorker;

/* renamed from: de0  reason: default package */
public final class de0 extends l5e implements i26 {
    public final /* synthetic */ BacklogWorker X;
    public final /* synthetic */ HashSet Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public de0(BacklogWorker backlogWorker, HashSet hashSet, Continuation continuation) {
        super(2, continuation);
        this.X = backlogWorker;
        this.Y = hashSet;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new de0(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        this.X.e().g().updateState(0, o23.s0(this.Y));
        return jue.a;
    }
}
