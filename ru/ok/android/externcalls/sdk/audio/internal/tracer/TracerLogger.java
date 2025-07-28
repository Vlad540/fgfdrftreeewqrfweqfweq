package ru.ok.android.externcalls.sdk.audio.internal.tracer;

import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.audio.Logger;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000b\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\fJ'\u0010\u0010\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\fJ'\u0010\u0011\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\fJ'\u0010\u0012\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\fJ'\u0010\u0014\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u000fJ'\u0010\u0015\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/tracer/TracerLogger;", "Lru/ok/android/externcalls/sdk/audio/Logger;", "Lru/ok/android/externcalls/sdk/audio/internal/tracer/TracerLiteFacade;", "tracer", "delegate", "<init>", "(Lru/ok/android/externcalls/sdk/audio/internal/tracer/TracerLiteFacade;Lru/ok/android/externcalls/sdk/audio/Logger;)V", "", "tag", "message", "Ljue;", "v", "(Ljava/lang/String;Ljava/lang/String;)V", "", "throwable", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "d", "i", "w", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "e", "reportError", "Lru/ok/android/externcalls/sdk/audio/internal/tracer/TracerLiteFacade;", "Lru/ok/android/externcalls/sdk/audio/Logger;", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0})
public final class TracerLogger implements Logger {
    private final Logger delegate;
    private final TracerLiteFacade tracer;

    public TracerLogger(TracerLiteFacade tracerLiteFacade, Logger logger) {
        this.tracer = tracerLiteFacade;
        this.delegate = logger;
    }

    public void d(String str, String str2) {
        this.delegate.d(str, str2);
    }

    public void e(String str, String str2) {
        this.delegate.e(str, str2);
    }

    public void i(String str, String str2) {
        this.delegate.i(str, str2);
    }

    public void reportError(String str, String str2, Throwable th) {
        this.delegate.reportError(str, str2, th);
        TracerLiteFacade.reportCrash$default(this.tracer, th, (String) null, 2, (Object) null);
    }

    public void v(String str, String str2) {
        this.delegate.v(str, str2);
    }

    public void w(String str, String str2) {
        this.delegate.w(str, str2);
    }

    public void d(String str, String str2, Throwable th) {
        this.delegate.d(str, str2, th);
    }

    public void e(String str, String str2, Throwable th) {
        this.delegate.e(str, str2, th);
    }

    public void i(String str, String str2, Throwable th) {
        this.delegate.i(str, str2, th);
    }

    public void v(String str, String str2, Throwable th) {
        this.delegate.v(str, str2, th);
    }

    public void w(String str, String str2, Throwable th) {
        this.delegate.w(str, str2, th);
    }

    public void w(String str, Throwable th) {
        this.delegate.w(str, th);
    }
}
