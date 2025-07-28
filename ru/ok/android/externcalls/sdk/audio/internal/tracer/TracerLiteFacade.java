package ru.ok.android.externcalls.sdk.audio.internal.tracer;

import android.content.Context;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/tracer/TracerLiteFacade;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "cause", "", "issueKey", "Ljue;", "reportCrash", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "Lzne;", "tracerLite$delegate", "Lt97;", "getTracerLite", "()Lzne;", "tracerLite", "Ltne;", "crashReport$delegate", "getCrashReport", "()Ltne;", "crashReport", "Companion", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0})
public final class TracerLiteFacade {
    private static final Companion Companion = new Companion((x54) null);
    @Deprecated
    public static final String KEY_AUDIOMANAGER_VERSION = "calls-audiomanager-version";
    private final t97 crashReport$delegate = new r7e(new TracerLiteFacade$crashReport$2(this));
    private final t97 tracerLite$delegate;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lru/ok/android/externcalls/sdk/audio/internal/tracer/TracerLiteFacade$Companion;", "", "()V", "KEY_AUDIOMANAGER_VERSION", "", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(x54 x54) {
            this();
        }
    }

    public TracerLiteFacade(Context context) {
        this.tracerLite$delegate = new r7e(new TracerLiteFacade$tracerLite$2(context));
    }

    private final tne getCrashReport() {
        return (tne) this.crashReport$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final zne getTracerLite() {
        return (zne) this.tracerLite$delegate.getValue();
    }

    public static /* synthetic */ void reportCrash$default(TracerLiteFacade tracerLiteFacade, Throwable th, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        tracerLiteFacade.reportCrash(th, str);
    }

    public final void reportCrash(Throwable th) {
        reportCrash$default(this, th, (String) null, 2, (Object) null);
    }

    public final void reportCrash(Throwable th, String str) {
        try {
            getCrashReport().a(str, th);
        } catch (Throwable unused) {
        }
    }
}
