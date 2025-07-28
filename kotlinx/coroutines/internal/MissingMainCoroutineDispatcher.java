package kotlinx.coroutines.internal;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import me.leolin.shortcutbadger.BuildConfig;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00172\n\u0010\u001b\u001a\u00060\u0019j\u0002`\u001a2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010\u001f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\n\u0010\u001b\u001a\u00060\u0019j\u0002`\u001aH\u0016¢\u0006\u0004\b\u001f\u0010 J%\u0010$\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0005H\u0016¢\u0006\u0004\b&\u0010'R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010(R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010)R\u0014\u0010,\u001a\u00020\u00018VX\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lkotlinx/coroutines/internal/MissingMainCoroutineDispatcher;", "Lzr7;", "Lhd4;", "", "cause", "", "errorHint", "<init>", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "", "missing", "()Ljava/lang/Void;", "Lhu3;", "context", "", "isDispatchNeeded", "(Lhu3;)Z", "", "parallelism", "name", "Lju3;", "limitedParallelism", "(ILjava/lang/String;)Lju3;", "", "timeMillis", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Laj4;", "invokeOnTimeout", "(JLjava/lang/Runnable;Lhu3;)Laj4;", "dispatch", "(Lhu3;Ljava/lang/Runnable;)Ljava/lang/Void;", "Lyv1;", "Ljue;", "continuation", "scheduleResumeAfterDelay", "(JLyv1;)Ljava/lang/Void;", "toString", "()Ljava/lang/String;", "Ljava/lang/Throwable;", "Ljava/lang/String;", "getImmediate", "()Lzr7;", "immediate", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
final class MissingMainCoroutineDispatcher extends zr7 implements hd4 {
    private final Throwable cause;
    private final String errorHint;

    public MissingMainCoroutineDispatcher(Throwable th, String str) {
        this.cause = th;
        this.errorHint = str;
    }

    private final Void missing() {
        String str;
        if (this.cause != null) {
            String str2 = this.errorHint;
            if (str2 == null || (str = ". ".concat(str2)) == null) {
                str = BuildConfig.FLAVOR;
            }
            throw new IllegalStateException("Module with the Main dispatcher had failed to initialize".concat(str), this.cause);
        }
        MainDispatchersKt.throwMissingMainDispatcherException();
        throw new KotlinNothingValueException();
    }

    public Object delay(long j, Continuation<? super jue> continuation) {
        return iu7.q(this, j, continuation);
    }

    public zr7 getImmediate() {
        return this;
    }

    public aj4 invokeOnTimeout(long j, Runnable runnable, hu3 hu3) {
        missing();
        throw new KotlinNothingValueException();
    }

    public boolean isDispatchNeeded(hu3 hu3) {
        missing();
        throw new KotlinNothingValueException();
    }

    public ju3 limitedParallelism(int i, String str) {
        missing();
        throw new KotlinNothingValueException();
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dispatchers.Main[missing");
        if (this.cause != null) {
            str = ", cause=" + this.cause;
        } else {
            str = BuildConfig.FLAVOR;
        }
        return me4.l(sb, str, ']');
    }

    public Void dispatch(hu3 hu3, Runnable runnable) {
        missing();
        throw new KotlinNothingValueException();
    }

    public Void scheduleResumeAfterDelay(long j, yv1 yv1) {
        missing();
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MissingMainCoroutineDispatcher(Throwable th, String str, int i, x54 x54) {
        this(th, (i & 2) != 0 ? null : str);
    }
}
