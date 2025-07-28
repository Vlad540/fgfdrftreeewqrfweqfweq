package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.Symbol;

/* renamed from: t0c  reason: default package */
public final class t0c implements zqd, cw1, g36 {
    public final /* synthetic */ zqd a;

    public t0c(zqd zqd) {
        this.a = zqd;
    }

    public final Object c(rj5 rj5, Continuation continuation) {
        return this.a.c(rj5, continuation);
    }

    public final pj5 d(hu3 hu3, int i, int i2) {
        Symbol symbol = hrd.a;
        return (((i < 0 || i >= 2) && i != -2) || i2 != 2) ? icd.e(this, hu3, i, i2) : this;
    }

    public final Object getValue() {
        return this.a.getValue();
    }
}
