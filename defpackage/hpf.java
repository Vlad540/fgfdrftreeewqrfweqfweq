package defpackage;

import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: hpf  reason: default package */
public final class hpf extends l5e implements i26 {
    public int X;
    public final /* synthetic */ ipf Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hpf(ipf ipf, Continuation continuation) {
        super(2, continuation);
        this.Y = ipf;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new hpf(this.Y, continuation);
    }

    public final Object o(Object obj) {
        Object obj2;
        Object obj3;
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        int i2 = 2;
        ipf ipf = this.Y;
        if (i == 0) {
            wx3.H(obj);
            xff xff = (xff) ipf.c.getValue();
            this.X = 1;
            xff.getClass();
            pec a = pec.a(1, "SELECT * FROM webapp_biometry WHERE user_id = ?");
            a.j(1, ipf.b);
            obj3 = r1g.g(xff.a, new CancellationSignal(), new vff(xff, a, 0), this);
            if (obj3 == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
            obj3 = obj;
        } else if (i == 2) {
            wx3.H(obj);
            obj2 = obj;
            ipf.X.m((Object) null, o23.i0(Collections.singletonList(new vof()), (List) obj2));
            return jue;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        List list = (List) obj3;
        if (list.isEmpty()) {
            return jue;
        }
        ContextScope a2 = n1g.a(this.b);
        ArrayList arrayList = new ArrayList(q23.H(list, 10));
        int i3 = 0;
        for (Object next : list) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                gpf gpf = r8;
                gpf gpf2 = new gpf(i3, next, (Continuation) null, this.Y, list);
                arrayList.add(xs7.d(a2, (ju3) null, gpf, 3));
                i3 = i4;
                i2 = 2;
            } else {
                p23.G();
                throw null;
            }
        }
        this.X = i2;
        obj2 = lp.c(arrayList, this);
        if (obj2 == pu3) {
            return pu3;
        }
        ipf.X.m((Object) null, o23.i0(Collections.singletonList(new vof()), (List) obj2));
        return jue;
    }
}
