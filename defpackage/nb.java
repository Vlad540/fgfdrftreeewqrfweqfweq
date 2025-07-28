package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: nb  reason: default package */
public final class nb implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ou3 b;
    public final /* synthetic */ hu3 c;
    public final /* synthetic */ Object o;

    public /* synthetic */ nb(ContextScope contextScope, hu3 hu3, Object obj, int i) {
        this.a = i;
        this.b = contextScope;
        this.c = hu3;
        this.o = obj;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                mb mbVar = new mb(obj, (Continuation) null, (qb) this.o);
                return xs7.c(this.b, this.c, ru3.a, mbVar);
            default:
                kk8 kk8 = new kk8(obj, (Continuation) null, (mta) this.o);
                return xs7.c(this.b, this.c, ru3.a, kk8);
        }
    }
}
