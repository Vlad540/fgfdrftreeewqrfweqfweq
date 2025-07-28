package defpackage;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: yu5  reason: default package */
public final class yu5 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ zu5 Y;
    public final /* synthetic */ jv5 Z;
    public final /* synthetic */ List w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yu5(zu5 zu5, jv5 jv5, List list, Continuation continuation) {
        super(2, continuation);
        this.Y = zu5;
        this.Z = jv5;
        this.w0 = list;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new yu5(this.Y, this.Z, this.w0, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        jv5 jv5 = this.Z;
        zu5 zu5 = this.Y;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            obj = ((g86) zu5.b.getValue()).b(jv5, this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        List list = (List) obj;
        boolean isEmpty = list.isEmpty();
        jue jue = jue.a;
        if (isEmpty) {
            return jue;
        }
        CharSequence charSequence = jv5.d;
        if (charSequence != null && !h0e.c0(charSequence)) {
            list = o23.i0(Collections.singletonList(new j1d(new h1d(0, charSequence.toString(), true, ((m86) zu5.c.getValue()).a((i22) null, charSequence)))), list);
        }
        for (Number longValue : this.w0) {
            g0d g0d = new g0d(longValue.longValue(), new LinkedList(list), 2);
            g0d.e = true;
            ((luf) zu5.a.getValue()).a(new g1d(g0d));
        }
        return jue;
    }
}
