package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.workmanager.BacklogWorker;

/* renamed from: ae0  reason: default package */
public final class ae0 extends er3 {
    public List X;
    public int Y;
    public /* synthetic */ Object Z;
    public BacklogWorker o;
    public final /* synthetic */ BacklogWorker w0;
    public int x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ae0(BacklogWorker backlogWorker, Continuation continuation) {
        super(continuation);
        this.w0 = backlogWorker;
    }

    public final Object o(Object obj) {
        this.Z = obj;
        this.x0 |= Integer.MIN_VALUE;
        return this.w0.g((List) null, this);
    }
}
