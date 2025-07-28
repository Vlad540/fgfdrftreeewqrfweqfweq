package defpackage;

import java.util.Collection;
import java.util.List;

/* renamed from: k92  reason: default package */
public final /* synthetic */ class k92 implements qf3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k92(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    public final void accept(Object obj) {
        Object obj2 = this.c;
        switch (this.a) {
            case 0:
                Collection collection = (Collection) obj;
                l92 l92 = (l92) obj2;
                l92.getClass();
                udd.p("l92", "ValidateMessagesTimeUseCase found some items for delete, size = %d", new Object[]{Integer.valueOf(collection.size())});
                l92.h.b(new v82((Object) l92, this.b, (Object) collection, 1));
                return;
            default:
                for (xga g : (List) obj) {
                    ((nec) obj2).g(g, this.b);
                }
                return;
        }
    }
}
