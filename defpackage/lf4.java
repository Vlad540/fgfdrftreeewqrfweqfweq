package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.devmenu.DevMenuScreen;

/* renamed from: lf4  reason: default package */
public final class lf4 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ DevMenuScreen Y;
    public final /* synthetic */ List Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lf4(DevMenuScreen devMenuScreen, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.Y = devMenuScreen;
        this.Z = arrayList;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((lf4) n((List) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        lf4 lf4 = new lf4(this.Y, (ArrayList) this.Z, continuation);
        lf4.X = obj;
        return lf4;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        g7d g7d = this.Y.X;
        lg7 c = hwf.c();
        c.addAll(this.Z);
        c.addAll((List) this.X);
        g7d.E(hwf.a(c));
        return jue.a;
    }
}
