package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.coroutines.Continuation;

/* renamed from: sj8  reason: default package */
public final class sj8 extends l5e implements i26 {
    public final /* synthetic */ uj8 X;
    public final /* synthetic */ Collection Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sj8(uj8 uj8, Collection collection, Continuation continuation) {
        super(2, continuation);
        this.X = uj8;
        this.Y = collection;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new sj8(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        qw4 qw4;
        wx3.H(obj);
        uj8 uj8 = this.X;
        Iterator it = myc.L(new es(2, (Iterable) uj8.B0.a.getValue()), new e98(2, this.Y)).iterator();
        if (!it.hasNext()) {
            qw4 = qw4.a;
        } else {
            Long valueOf = Long.valueOf(((ei8) it.next()).a);
            if (!it.hasNext()) {
                qw4 = Collections.singleton(valueOf);
            } else {
                qw4 linkedHashSet = new LinkedHashSet();
                linkedHashSet.add(valueOf);
                while (it.hasNext()) {
                    linkedHashSet.add(Long.valueOf(((ei8) it.next()).a));
                }
                qw4 = linkedHashSet;
            }
        }
        uj8.y0 = qw4;
        ri8 ri8 = new ri8(uj8.b, uj8.c, qw4);
        xi8 xi8 = uj8.Y;
        xi8.getClass();
        xs7.E(xi8.b, (hu3) null, (ru3) null, new wi8(xi8, ri8, (Continuation) null), 3);
        return jue.a;
    }
}
