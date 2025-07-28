package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.messages.services.PipWorker;

/* renamed from: wwa  reason: default package */
public final class wwa extends er3 {
    public PipWorker X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ PipWorker Z;
    public PipWorker o;
    public int w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wwa(PipWorker pipWorker, Continuation continuation) {
        super(continuation);
        this.Z = pipWorker;
    }

    public final Object o(Object obj) {
        this.Y = obj;
        this.w0 |= Integer.MIN_VALUE;
        return this.Z.doWork(this);
    }
}
