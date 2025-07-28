package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.workmanager.BacklogWorker;

/* renamed from: wd0  reason: default package */
public final class wd0 extends er3 {
    public l7c X;
    public int Y;
    public /* synthetic */ Object Z;
    public List o;
    public final /* synthetic */ BacklogWorker w0;
    public int x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wd0(BacklogWorker backlogWorker, Continuation continuation) {
        super(continuation);
        this.w0 = backlogWorker;
    }

    public final Object o(Object obj) {
        this.Z = obj;
        this.x0 |= Integer.MIN_VALUE;
        return this.w0.c((List) null, 0, this);
    }
}
