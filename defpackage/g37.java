package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* renamed from: g37  reason: default package */
public interface g37 extends fu3 {
    public static final /* synthetic */ int N = 0;

    vw2 attachChild(yw2 yw2);

    void cancel(CancellationException cancellationException);

    CancellationException getCancellationException();

    dyc getChildren();

    aj4 invokeOnCompletion(u16 u16);

    aj4 invokeOnCompletion(boolean z, boolean z2, u16 u16);

    boolean isActive();

    boolean isCancelled();

    boolean isCompleted();

    Object join(Continuation continuation);

    boolean start();
}
