package defpackage;

import android.window.OnBackInvokedDispatcher;
import java.util.concurrent.CancellationException;

/* renamed from: y73  reason: default package */
public final /* synthetic */ class y73 implements dc7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y73(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final void m(nc7 nc7, nb7 nb7) {
        switch (this.a) {
            case 0:
                if (nb7 == nb7.ON_CREATE) {
                    OnBackInvokedDispatcher a2 = z73.a.a((e83) this.c);
                    ex9 ex9 = (ex9) this.b;
                    ex9.e = a2;
                    ex9.e(ex9.g);
                    return;
                }
                return;
            default:
                ob7 ob7 = nc7.R().d;
                ob7 ob72 = ob7.a;
                tb7 tb7 = (tb7) this.b;
                if (ob7 == ob72) {
                    ((g37) this.c).cancel((CancellationException) null);
                    tb7.a();
                    return;
                }
                int compareTo = nc7.R().d.compareTo(tb7.b);
                hi4 hi4 = tb7.c;
                if (compareTo < 0) {
                    hi4.a = true;
                    return;
                } else if (hi4.a) {
                    if (!hi4.b) {
                        hi4.a = false;
                        hi4.a();
                        return;
                    }
                    throw new IllegalStateException("Cannot resume a finished dispatcher".toString());
                } else {
                    return;
                }
        }
    }
}
