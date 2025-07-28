package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: jyd  reason: default package */
public final class jyd extends l5e implements i26 {
    public final /* synthetic */ u16 X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ lyd Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jyd(u16 u16, long j, lyd lyd, Continuation continuation) {
        super(2, continuation);
        this.X = u16;
        this.Y = j;
        this.Z = lyd;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new jyd(this.X, this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        ix1 ix1;
        wx3.H(obj);
        long j = this.Y;
        u16 u16 = this.X;
        if (u16 != null) {
            u16.invoke(new Long(j));
        }
        lyd lyd = this.Z;
        List<ix1> list = ((vxd) lyd.x0.getValue()).a;
        ArrayList arrayList = new ArrayList(q23.H(list, 10));
        for (ix1 ix12 : list) {
            hud hud = ix12.b;
            int i = (hud.a > j ? 1 : (hud.a == j ? 0 : -1));
            long j2 = ix12.a;
            if (i == 0) {
                ix1 = new ix1(j2, hud.k(hud, (ArrayList) null, true, false, 191));
            } else if (hud.Z) {
                ix1 = new ix1(j2, hud.k(hud, (ArrayList) null, false, false, 191));
            } else {
                arrayList.add(ix12);
            }
            ix12 = ix1;
            arrayList.add(ix12);
        }
        grd grd = lyd.x0;
        grd.m((Object) null, new vxd(arrayList, ((vxd) grd.getValue()).b));
        return jue.a;
    }
}
