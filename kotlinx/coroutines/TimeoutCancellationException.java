package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import me.leolin.shortcutbadger.BuildConfig;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/TimeoutCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "Lbu3;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
public final class TimeoutCancellationException extends CancellationException implements bu3 {
    public final transient g37 a;

    public TimeoutCancellationException(String str, g37 g37) {
        super(str);
        this.a = g37;
    }

    public final Throwable a() {
        String message = getMessage();
        if (message == null) {
            message = BuildConfig.FLAVOR;
        }
        TimeoutCancellationException timeoutCancellationException = new TimeoutCancellationException(message, this.a);
        timeoutCancellationException.initCause(this);
        return timeoutCancellationException;
    }
}
