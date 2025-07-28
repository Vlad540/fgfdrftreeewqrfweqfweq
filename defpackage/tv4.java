package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: tv4  reason: default package */
public final class tv4 extends l5e implements i26 {
    public final /* synthetic */ u16 X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ uv4 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tv4(u16 u16, int i, uv4 uv4, Continuation continuation) {
        super(2, continuation);
        this.X = u16;
        this.Y = i;
        this.Z = uv4;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((tv4) n((ou3) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new tv4(this.X, this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        int i = this.Y;
        u16 u16 = this.X;
        if (u16 != null) {
            u16.invoke(new Integer(i));
        }
        uv4 uv4 = this.Z;
        List<hx1> list = ((rv4) uv4.y0.a.getValue()).a;
        ArrayList arrayList = new ArrayList(q23.H(list, 10));
        for (hx1 hx1 : list) {
            if (hx1.a == i) {
                hx1 = hx1.k(hx1, true);
            } else if (hx1.c) {
                hx1 = hx1.k(hx1, false);
            }
            arrayList.add(hx1);
        }
        grd grd = uv4.x0;
        grd.m((Object) null, new rv4(arrayList, ((rv4) grd.getValue()).b));
        return jue.a;
    }
}
