package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.workmanager.BacklogWorker;

/* renamed from: yd0  reason: default package */
public final class yd0 extends er3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ BacklogWorker Y;
    public int Z;
    public l7c o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yd0(BacklogWorker backlogWorker, Continuation continuation) {
        super(continuation);
        this.Y = backlogWorker;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.d(this);
    }
}
