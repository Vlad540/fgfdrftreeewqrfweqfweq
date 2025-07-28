package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: tcf  reason: default package */
public final class tcf extends pr3 {
    public final /* synthetic */ k96 a;
    public final /* synthetic */ ViewTreeObserver b;
    public final /* synthetic */ ucf c;
    public final /* synthetic */ View d;

    public tcf(k96 k96, ViewTreeObserver viewTreeObserver, ucf ucf, View view) {
        this.a = k96;
        this.b = viewTreeObserver;
        this.c = ucf;
        this.d = view;
    }

    public final void s(rr3 rr3, View view) {
        Iterator it = ((ArrayList) this.a.c).iterator();
        while (it.hasNext()) {
            ((rcf) it.next()).b();
        }
        rr3.removeLifecycleListener(this);
        k96.a(this.c, this.d, this.b);
    }
}
