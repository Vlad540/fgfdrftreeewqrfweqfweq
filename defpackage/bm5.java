package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import kotlinx.coroutines.internal.Symbol;

/* renamed from: bm5  reason: default package */
public final class bm5 implements rj5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l7c b;

    public /* synthetic */ bm5(l7c l7c, int i) {
        this.a = i;
        this.b = l7c;
    }

    public final Object a(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                this.b.a = obj;
                throw new AbortFlowException(this);
            case 1:
                this.b.a = obj;
                throw new AbortFlowException(this);
            default:
                l7c l7c = this.b;
                Object obj2 = l7c.a;
                Symbol symbol = wr9.a;
                if (obj2 == symbol) {
                    l7c.a = obj;
                    return jue.a;
                }
                l7c.a = symbol;
                throw new AbortFlowException(this);
        }
    }
}
