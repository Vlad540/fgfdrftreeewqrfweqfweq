package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: ks5  reason: default package */
public final class ks5 extends l5e implements i26 {
    public xye X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ os5 w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ks5(os5 os5, Continuation continuation) {
        super(2, continuation);
        this.w0 = os5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ks5) n((List) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ks5 ks5 = new ks5(this.w0, continuation);
        ks5.Z = obj;
        return ks5;
    }

    public final Object o(Object obj) {
        List<ep5> list;
        Object obj2;
        xye xye;
        pu3 pu3 = pu3.a;
        int i = this.Y;
        jue jue = jue.a;
        os5 os5 = this.w0;
        if (i == 0) {
            wx3.H(obj);
            List list2 = (List) this.Z;
            xye xye2 = new xye((ep5) null, wye.c, new hge(f5a.m));
            b92 b92 = os5.b;
            this.Z = list2;
            this.X = xye2;
            this.Y = 1;
            b92 b922 = b92;
            b922.getClass();
            obj2 = xs7.U(b922.Y, new i82(b922, (Continuation) null), this);
            if (obj2 == pu3) {
                return pu3;
            }
            xye xye3 = xye2;
            list = list2;
            xye = xye3;
        } else if (i == 1) {
            xye = this.X;
            wx3.H(obj);
            list = (List) this.Z;
            obj2 = obj;
        } else if (i == 2) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Iterable<ep5> iterable = (Iterable) obj2;
        ArrayList arrayList = new ArrayList(q23.H(iterable, 10));
        for (ep5 ep5 : iterable) {
            wye wye = wye.o;
            CharSequence charSequence = ep5 != null ? ep5.b : null;
            if (charSequence == null) {
                charSequence = BuildConfig.FLAVOR;
            }
            arrayList.add(new xye(ep5, wye, new lge(charSequence)));
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        for (ep5 ep52 : list) {
            arrayList2.add(new xye(ep52, hhd.f(ep52.a, "all.chat.folder") ? wye.a : wye.b, new lge(((v6a) os5.o.getValue()).a(ep52.b, ep52.C0, 2, false, 0, true))));
        }
        arrayList2.add(xye);
        arrayList2.addAll(arrayList);
        grd grd = os5.X;
        this.Z = null;
        this.X = null;
        this.Y = 2;
        grd.m((Object) null, arrayList2);
        return jue == pu3 ? pu3 : jue;
    }
}
