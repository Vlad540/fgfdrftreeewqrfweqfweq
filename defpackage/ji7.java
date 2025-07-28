package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.location.live.LiveLocationWorker;

/* renamed from: ji7  reason: default package */
public final class ji7 extends er3 {
    public String X;
    public LiveLocationWorker Y;
    public /* synthetic */ Object Z;
    public LiveLocationWorker o;
    public final /* synthetic */ LiveLocationWorker w0;
    public int x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ji7(LiveLocationWorker liveLocationWorker, Continuation continuation) {
        super(continuation);
        this.w0 = liveLocationWorker;
    }

    public final Object o(Object obj) {
        this.Z = obj;
        this.x0 |= Integer.MIN_VALUE;
        return this.w0.doWork(this);
    }
}
