package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.devmenu.threadsviewer.ThreadsStateViewerScreen;

/* renamed from: pie  reason: default package */
public final class pie extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ThreadsStateViewerScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pie(Continuation continuation, ThreadsStateViewerScreen threadsStateViewerScreen) {
        super(2, continuation);
        this.Y = threadsStateViewerScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((pie) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        pie pie = new pie(continuation, this.Y);
        pie.X = obj;
        return pie;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [mr5, ig7] */
    public final Object o(Object obj) {
        wx3.H(obj);
        this.Y.o.E((List) this.X);
        return jue.a;
    }
}
