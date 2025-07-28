package kotlinx.coroutines.internal;

import java.util.Arrays;
import java.util.Collection;
import java.util.ServiceConfigurationError;
import kotlin.Metadata;
import kotlinx.coroutines.android.AndroidExceptionPreHandler;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\" \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t8\u0000X\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lku3;", "callback", "Ljue;", "ensurePlatformExceptionHandlerLoaded", "(Lku3;)V", "", "exception", "propagateExceptionFinalResort", "(Ljava/lang/Throwable;)V", "", "platformExceptionHandlers", "Ljava/util/Collection;", "getPlatformExceptionHandlers", "()Ljava/util/Collection;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0})
public final class CoroutineExceptionHandlerImplKt {
    private static final Collection<ku3> platformExceptionHandlers = myc.U(new le3(new es(7, Arrays.asList(new ku3[]{new AndroidExceptionPreHandler(), new f15()}).iterator())));

    static {
        try {
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static final void ensurePlatformExceptionHandlerLoaded(ku3 ku3) {
        if (!platformExceptionHandlers.contains(ku3)) {
            throw new IllegalStateException("Exception handler was not found via a ServiceLoader".toString());
        }
    }

    public static final Collection<ku3> getPlatformExceptionHandlers() {
        return platformExceptionHandlers;
    }

    public static final void propagateExceptionFinalResort(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }
}
