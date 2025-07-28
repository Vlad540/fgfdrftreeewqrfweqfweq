package defpackage;

import java.util.HashSet;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.workmanager.BacklogWorker;

/* renamed from: ce0  reason: default package */
public final class ce0 extends er3 {
    public HashSet X;
    public HashSet Y;
    public /* synthetic */ Object Z;
    public Object o;
    public final /* synthetic */ BacklogWorker w0;
    public int x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ce0(BacklogWorker backlogWorker, Continuation continuation) {
        super(continuation);
        this.w0 = backlogWorker;
    }

    public final Object o(Object obj) {
        this.Z = obj;
        this.x0 |= Integer.MIN_VALUE;
        return this.w0.h(this);
    }
}
