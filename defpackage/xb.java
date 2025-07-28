package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: xb  reason: default package */
public final class xb extends l5e implements i26 {
    public int X;
    public final /* synthetic */ cc Y;
    public final /* synthetic */ String Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xb(cc ccVar, String str, Continuation continuation) {
        super(2, continuation);
        this.Y = ccVar;
        this.Z = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new xb(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        if (i == 0) {
            wx3.H(obj);
            qb qbVar = this.Y.c;
            this.X = 1;
            ArrayList arrayList = new ArrayList();
            for (Object next : (List) qbVar.h.getValue()) {
                tf3 tf3 = (tf3) next;
                String valueOf = String.valueOf(tf3.o());
                String str = this.Z;
                if (!p0e.Q(valueOf, str, false)) {
                    t97 t97 = qbVar.e;
                    if (!((gsc) t97.getValue()).h(String.valueOf(tf3.d()), str)) {
                        String b = ehe.b(tf3.g());
                        if (b != null) {
                            if (!((gsc) t97.getValue()).h(b, str)) {
                            }
                        }
                    }
                }
                arrayList.add(next);
            }
            ArrayList arrayList2 = new ArrayList(q23.H(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(qbVar.b((tf3) it.next()));
            }
            ((kn3) qbVar.b.getValue()).c(arrayList2, new o8(6));
            Object a = qbVar.k.a(arrayList2, this);
            if (a != pu3) {
                a = jue;
            }
            if (a == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue;
    }
}
