package defpackage;

import java.lang.Thread;
import kotlin.coroutines.Continuation;

/* renamed from: b6a  reason: default package */
public final /* synthetic */ class b6a implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ i6a a;
    public final /* synthetic */ Thread.UncaughtExceptionHandler b;

    public /* synthetic */ b6a(i6a i6a, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = i6a;
        this.b = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        i6a i6a = this.a;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
        String str = i6a.g;
        fn6 fn6 = udd.e;
        if (fn6 != null) {
            fn6.b(fn6, tn7.x0, str, "!!! APPCRASH !!!", (Object[]) null, th, 8);
        }
        i6a.h();
        xs7.N(new g6a(i6a, (Continuation) null));
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
