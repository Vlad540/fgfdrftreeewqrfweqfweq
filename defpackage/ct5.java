package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: ct5  reason: default package */
public final class ct5 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ ft5 Z;
    public final /* synthetic */ t97 w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ct5(ft5 ft5, t97 t97, Continuation continuation) {
        super(2, continuation);
        this.Z = ft5;
        this.w0 = t97;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ct5) n((List) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ct5 ct5 = new ct5(this.Z, this.w0, continuation);
        ct5.Y = obj;
        return ct5;
    }

    public final Object o(Object obj) {
        bs bsVar;
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        ft5 ft5 = this.Z;
        if (i == 0) {
            wx3.H(obj);
            List<ep5> list = (List) this.Y;
            if (list.size() != 1 || !hhd.f(((ep5) o23.V(list)).a, "all.chat.folder")) {
                bs bsVar2 = new bs((Collection) ft5.B0.getValue());
                ArrayList arrayList = new ArrayList(q23.H(list, 10));
                for (ep5 ep5 : list) {
                    boolean f = hhd.f(ep5.a, "all.chat.folder");
                    String str = ep5.a;
                    if (!f) {
                        if (ep5.z0.contains(new Long(ft5.b))) {
                            bsVar2.add(str);
                        }
                    }
                    arrayList.add(new xye(ep5, hhd.f(str, "all.chat.folder") ? wye.a : wye.b, new lge(((v6a) this.w0.getValue()).a(ep5.b, ep5.C0, 2, false, 0, true))));
                }
                if (((Set) ft5.A0.get()) == null) {
                    ft5.A0.updateAndGet(new at5(list, 0, ft5));
                }
                this.Y = bsVar2;
                this.X = 2;
                ft5.w0.m((Object) null, arrayList);
                if (jue == pu3) {
                    return pu3;
                }
                bsVar = bsVar2;
                ft5.B0.setValue(bsVar);
                return jue;
            }
            grd grd = ft5.w0;
            hw4 hw4 = hw4.a;
            this.X = 1;
            grd.m((Object) null, hw4);
            if (jue == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else if (i == 2) {
            bsVar = (bs) this.Y;
            wx3.H(obj);
            ft5.B0.setValue(bsVar);
            return jue;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue;
    }
}
