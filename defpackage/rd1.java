package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.coroutines.Continuation;

/* renamed from: rd1  reason: default package */
public final class rd1 extends l5e implements i26 {
    public final /* synthetic */ td1 X;
    public final /* synthetic */ String Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rd1(td1 td1, String str, Continuation continuation) {
        super(2, continuation);
        this.X = td1;
        this.Y = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((rd1) n((ou3) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new rd1(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        td1 td1 = this.X;
        String str = this.Y;
        td1.A0 = str;
        bka bka = (bka) ((oka) td1.c).A0.a.getValue();
        if (!h0e.c0(str)) {
            lg7 c = hwf.c();
            t97 t97 = td1.Z;
            if (((gsc) t97.getValue()).h(bka.a.b.getName(), str)) {
                c.add(bka.a);
            }
            Collection values = bka.c.values();
            ArrayList arrayList = new ArrayList();
            for (Object next : values) {
                if (((gsc) t97.getValue()).h(((qja) next).b.getName(), str)) {
                    arrayList.add(next);
                }
            }
            c.addAll(arrayList);
            td1.q(td1, hwf.a(c), bka.g);
        } else {
            lg7 c2 = hwf.c();
            c2.add(bka.a);
            c2.addAll(bka.c.values());
            td1.q(td1, hwf.a(c2), bka.g);
        }
        return jue.a;
    }
}
