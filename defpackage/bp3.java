package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: bp3  reason: default package */
public final class bp3 extends l5e implements i26 {
    public final /* synthetic */ fp3 X;
    public final /* synthetic */ String Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bp3(fp3 fp3, String str, Continuation continuation) {
        super(2, continuation);
        this.X = fp3;
        this.Y = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bp3) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new bp3(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        z96 z96;
        wx3.H(obj);
        ud udVar = this.X.c;
        ArrayList arrayList = new ArrayList();
        for (yib yib : (List) ((vs7) ((t97) udVar.o).getValue()).e(this.Y).e()) {
            gn3 gn3 = yib.c;
            if (gn3 == null) {
                z96 = null;
            } else {
                to1 to1 = new to1((w6a) co3.a.getAccessor().c(w6a.class), yib, (Context) udVar.c, 5);
                uj3 uj3 = gn3.a;
                String a = uj3.a();
                q1b a2 = (a == null || a.length() == 0) ^ true ? (q1b) to1.invoke(uj3.a()) : q1b.a();
                String c = ehe.c(uj3.A0);
                gsc r = nqc.a.r();
                zy zyVar = yib.b;
                q1b a3 = true ^ r.d(c, zyVar).isEmpty() ? (q1b) to1.invoke(c) : q1b.a();
                int i = fu7.l(gn3.o).a;
                if (!(i == 10 || i == 20)) {
                }
                String a4 = uj3.a();
                if (a4 == null) {
                    a4 = BuildConfig.FLAVOR;
                }
                z96 = new z96(uj3.a, a4, a2, a3, at7.x(uj3.d(fj0.c)), uj3, zyVar, udVar.b);
            }
            if (z96 != null) {
                arrayList.add(z96);
            }
        }
        return arrayList;
    }
}
