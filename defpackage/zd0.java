package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.workmanager.BacklogWorker;

/* renamed from: zd0  reason: default package */
public final class zd0 extends er3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ BacklogWorker Y;
    public int Z;
    public BacklogWorker o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zd0(BacklogWorker backlogWorker, Continuation continuation) {
        super(continuation);
        this.Y = backlogWorker;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.doWork(this);
    }
}
