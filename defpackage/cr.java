package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: cr  reason: default package */
public final class cr extends l5e implements i26 {
    public final /* synthetic */ dr X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cr(dr drVar, Continuation continuation) {
        super(2, continuation);
        this.X = drVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((cr) n((ou3) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new cr(this.X, continuation);
    }

    public final Object o(Object obj) {
        Object value;
        wx3.H(obj);
        dr drVar = this.X;
        k77[] k77Arr = dr.N0;
        ud0 ud0 = drVar.v() ? this.X.D0 : this.X.C0;
        Collection<g32> values = (this.X.v() ? this.X.A0 : this.X.B0).values();
        ArrayList arrayList = new ArrayList(q23.H(values, 10));
        for (g32 g32 : values) {
            ud0 ud02 = g32.b;
            arrayList.add(new g32(Boolean.valueOf(hhd.f(ud0, ud02)), ud02, g32.c, g32.o));
        }
        grd grd = this.X.L0;
        do {
            value = grd.getValue();
            List list = (List) value;
        } while (!grd.b(value, arrayList));
        return jue.a;
    }
}
