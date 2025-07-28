package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.Symbol;

/* renamed from: yv1  reason: default package */
public interface yv1 extends Continuation {
    void c(ju3 ju3);

    boolean cancel(Throwable th);

    void d(u16 u16);

    void e(Object obj, k26 k26);

    boolean isActive();

    boolean isCancelled();

    Symbol j(Throwable th);

    Symbol l(Object obj, k26 k26);

    void q(Object obj);
}
