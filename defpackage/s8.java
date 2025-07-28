package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: s8  reason: default package */
public final class s8 extends l5e implements i26 {
    public o58 X;
    public Iterator Y;
    public int Z;
    public /* synthetic */ Object w0;
    public final /* synthetic */ o58 x0;
    public final /* synthetic */ List y0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s8(o58 o58, List list, Continuation continuation) {
        super(2, continuation);
        this.x0 = o58;
        this.y0 = list;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        s8 s8Var = new s8(this.x0, this.y0, continuation);
        s8Var.w0 = obj;
        return s8Var;
    }

    public final Object o(Object obj) {
        ou3 ou3;
        o58 o58;
        Iterator it;
        String str;
        pu3 pu3 = pu3.a;
        int i = this.Z;
        if (i == 0) {
            wx3.H(obj);
            ou3 ou32 = (ou3) this.w0;
            String str2 = this.x0.b;
            List list = this.y0;
            fn6 fn6 = udd.e;
            if (fn6 != null && fn6.c()) {
                fn6.d(tn7.Y, str2, "invoke for ".concat(o23.c0(list, ",", "[", "]", r8.a, 24)), (Throwable) null);
            }
            km4 n = km4.y0.n(this.x0.a);
            vqe vqe = new vqe(myc.M(myc.R(myc.Q(new es(2, this.y0), new o8(2)), new l(1, n)), new o8(3)), new o8(4));
            pda g = n.g();
            vqe R = myc.R(hhd.Q(vqe, new o8(0), new p8(0, g)), new p8(1, g));
            o58 = this.x0;
            it = new uqe(R);
            ou3 = ou32;
        } else if (i == 1) {
            it = this.Y;
            o58 = this.X;
            ou3 = (ou3) this.w0;
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        while (it.hasNext()) {
            View view = (View) it.next();
            String str3 = o58.b;
            fn6 fn62 = udd.e;
            if (fn62 != null && fn62.c()) {
                tn7 tn7 = tn7.X;
                try {
                    str = o58.a.getResources().getResourceName(view.getId());
                } catch (Throwable th) {
                    str = new kcc(th);
                }
                if (str instanceof kcc) {
                    str = null;
                }
                fn62.d(tn7, str3, me4.j("colorized ", str, "/", view.getClass().getSimpleName()), (Throwable) null);
            }
            this.w0 = ou3;
            this.X = o58;
            this.Y = it;
            this.Z = 1;
            if (e07.O(this) == pu3) {
                return pu3;
            }
        }
        return jue.a;
    }
}
