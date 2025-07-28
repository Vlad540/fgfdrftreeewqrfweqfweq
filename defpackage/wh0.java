package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;

/* renamed from: wh0  reason: default package */
public final /* synthetic */ class wh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xh0 b;

    public /* synthetic */ wh0(xh0 xh0, int i) {
        this.a = i;
        this.b = xh0;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                Iterator it = this.b.g.iterator();
                while (it.hasNext()) {
                    w1f w1f = (w1f) it.next();
                    String str = w1f.d;
                    fn6 fn6 = udd.e;
                    if (fn6 != null && fn6.c()) {
                        fn6.d(tn7.X, str, "Player autoplay. onMediaProcessingFinished.", (Throwable) null);
                    }
                    w1f.n = false;
                    RecyclerView recyclerView = w1f.e;
                    if (recyclerView != null) {
                        w1f.e(recyclerView, false);
                    }
                }
                return;
            default:
                Iterator it2 = this.b.g.iterator();
                while (it2.hasNext()) {
                    ((w1f) it2.next()).c();
                }
                return;
        }
    }
}
