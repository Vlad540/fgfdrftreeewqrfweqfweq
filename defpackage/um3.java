package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: um3  reason: default package */
public final class um3 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ym3 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public um3(ym3 ym3, Continuation continuation) {
        super(2, continuation);
        this.Y = ym3;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((i53) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        um3 um3 = new um3(this.Y, continuation);
        um3.X = obj;
        return um3;
    }

    public final Object o(Object obj) {
        ArrayList arrayList;
        d53 d53;
        Iterator it;
        fcb fcb;
        wx3.H(obj);
        i53 i53 = (i53) this.X;
        boolean equals = i53.equals(b53.a);
        ArrayList arrayList2 = hw4.a;
        if (equals || i53.equals(c53.a)) {
            arrayList = arrayList2;
        } else if (i53 instanceof d53) {
            d53 d532 = (d53) i53;
            List list = d532.a;
            arrayList = new ArrayList(q23.H(list, 10));
            Iterator it2 = list.iterator();
            int i = 0;
            while (it2.hasNext()) {
                Object next = it2.next();
                int i2 = i + 1;
                if (i >= 0) {
                    h53 h53 = (h53) next;
                    int i3 = h53 instanceof f53 ? 1024 : 512;
                    if (d532.a.size() != 1) {
                        i3 |= i == 0 ? 536870912 : i == p23.A(d532.a) ? Integer.MIN_VALUE : 1073741824;
                    }
                    if (hhd.f(h53, e53.a)) {
                        fcb = dcb.a;
                    } else if (hhd.f(h53, f53.a)) {
                        fcb = new ecb(i3);
                    } else if (h53 instanceof g53) {
                        g53 g53 = (g53) h53;
                        i22 i22 = g53.a;
                        long j = i22.a;
                        CharSequence charSequence = g53.b;
                        lge lge = new lge(g53.c);
                        String f = i22.f(fj0.c, ej0.a);
                        i22 i222 = g53.a;
                        d53 = d532;
                        it = it2;
                        long j2 = i222.b.a;
                        i222.i0();
                        fcb = new fcb(new j6b(j, charSequence, lge, f, j2, i222.B0), i3);
                        arrayList.add(fcb);
                        d532 = d53;
                        i = i2;
                        it2 = it;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    d53 = d532;
                    it = it2;
                    arrayList.add(fcb);
                    d532 = d53;
                    i = i2;
                    it2 = it;
                } else {
                    p23.G();
                    throw null;
                }
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        grd grd = this.Y.s;
        if (!arrayList.isEmpty()) {
            sp2 sp2 = this.Y.n;
            sp2.getClass();
            lg7 c = hwf.c();
            c.add((xbb) sp2.a.getValue());
            c.addAll(arrayList);
            arrayList2 = hwf.a(c);
        }
        grd.setValue(arrayList2);
        return jue.a;
    }
}
