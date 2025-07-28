package defpackage;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: u99  reason: default package */
public final class u99 extends l5e implements i26 {
    public final /* synthetic */ w99 X;
    public final /* synthetic */ long Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u99(w99 w99, long j, Continuation continuation) {
        super(2, continuation);
        this.X = w99;
        this.Y = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new u99(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        Set set;
        hw4 hw4;
        wx3.H(obj);
        w99 w99 = this.X;
        Set set2 = ((q99) w99.d.getValue()).b;
        boolean isEmpty = set2.isEmpty();
        long j = this.Y;
        if (isEmpty) {
            set = Collections.singleton(new Long(j));
        } else if (set2.contains(new Long(j))) {
            set = o23.v0(set2);
            set.remove(new Long(j));
        } else {
            Long l = new Long(j);
            LinkedHashSet linkedHashSet = new LinkedHashSet(ju7.S(set2.size() + 1));
            linkedHashSet.addAll(set2);
            linkedHashSet.add(l);
            set = linkedHashSet;
        }
        if (set.isEmpty()) {
            hw4 = hw4.a;
        } else {
            lg7 c = hwf.c();
            c.add(new kea(rca.v, sca.h, phc.x));
            hw4 = hwf.a(c);
        }
        w99.d.m((Object) null, new q99(true, set, hw4));
        return jue.a;
    }
}
