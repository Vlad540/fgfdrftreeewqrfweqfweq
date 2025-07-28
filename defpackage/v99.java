package defpackage;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: v99  reason: default package */
public final class v99 extends l5e implements i26 {
    public Set X;
    public int Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ x99 w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v99(long j, x99 x99, Continuation continuation) {
        super(2, continuation);
        this.Z = j;
        this.w0 = x99;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new v99(this.Z, this.w0, continuation);
    }

    public final Object o(Object obj) {
        Set set;
        Set set2;
        hw4 hw4 = pu3.a;
        int i = this.Y;
        jue jue = jue.a;
        x99 x99 = this.w0;
        if (i == 0) {
            wx3.H(obj);
            long j = this.Z;
            if (j == -1) {
                return jue;
            }
            Set set3 = ((r99) x99.f.getValue()).a;
            if (set3.isEmpty()) {
                set2 = Collections.singleton(new Long(j));
            } else if (set3.contains(new Long(j))) {
                set2 = o23.v0(set3);
                set2.remove(new Long(j));
            } else {
                Long l = new Long(j);
                LinkedHashSet linkedHashSet = new LinkedHashSet(ju7.S(set3.size() + 1));
                linkedHashSet.addAll(set3);
                linkedHashSet.add(l);
                set2 = linkedHashSet;
            }
            this.X = set2;
            this.Y = 1;
            hw4 c = set2.isEmpty() ? hw4.a : set2.size() == 1 ? x99.c(((tw8) x99.c.getValue()).e(((Number) o23.U(set2)).longValue()), this) : x99.b(set2, this);
            if (c == hw4) {
                return hw4;
            }
            Set set4 = set2;
            obj = c;
            set = set4;
        } else if (i == 1) {
            set = this.X;
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        x99.f.m((Object) null, new r99((List) obj, set));
        return jue;
    }
}
