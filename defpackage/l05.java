package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: l05  reason: default package */
public final class l05 implements dcd {
    public final /* synthetic */ int a;
    public final lc9 b;

    public l05(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = icd.b(1, 0, 0, 6);
                return;
            default:
                this.b = icd.b(0, Integer.MAX_VALUE, 0, 4);
                return;
        }
    }

    public final Object c(rj5 rj5, Continuation continuation) {
        switch (this.a) {
            case 0:
                return this.b.c(rj5, continuation);
            default:
                return this.b.c(rj5, continuation);
        }
    }

    public Object e(long j, Continuation continuation) {
        Object a2 = this.b.a(new xue(j), continuation);
        return a2 == pu3.a ? a2 : jue.a;
    }
}
