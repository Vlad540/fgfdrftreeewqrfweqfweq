package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: ptd  reason: default package */
public final class ptd extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ttd Y;
    public final /* synthetic */ Long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ptd(ttd ttd, Long l, Continuation continuation) {
        super(2, continuation);
        this.Y = ttd;
        this.Z = l;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((wia) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ptd ptd = new ptd(this.Y, this.Z, continuation);
        ptd.X = obj;
        return ptd;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        wia wia = (wia) this.X;
        xtd xtd = (xtd) wia.a;
        ttd ttd = this.Y;
        grd grd = ttd.F0;
        boolean booleanValue = ((Boolean) wia.b).booleanValue();
        String str = xtd.b;
        if (str == null) {
            str = "";
        }
        lge lge = new lge(str);
        List<osd> list = xtd.h;
        ArrayList arrayList = new ArrayList(q23.H(list, 10));
        for (osd r : list) {
            arrayList.add(ttd.r(r, false, this.Z));
        }
        grd.m((Object) null, new hud(xtd.a, lge, xtd.c, (Integer) null, arrayList, booleanValue ? 2 : 4, false, false, 200));
        return jue.a;
    }
}
