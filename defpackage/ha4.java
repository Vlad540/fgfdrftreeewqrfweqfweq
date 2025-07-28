package defpackage;

import kotlinx.coroutines.internal.LimitedDispatcherKt;

/* renamed from: ha4  reason: default package */
public final class ha4 extends umc {
    public static final ha4 b = new umc(oee.c, oee.d, oee.e);

    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    public final ju3 limitedParallelism(int i, String str) {
        LimitedDispatcherKt.checkParallelism(i);
        return i >= oee.c ? LimitedDispatcherKt.namedOrThis(this, str) : super.limitedParallelism(i, str);
    }

    public final String toString() {
        return "Dispatchers.Default";
    }
}
