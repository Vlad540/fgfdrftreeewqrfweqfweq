package defpackage;

import android.view.View;
import java.util.Objects;

/* renamed from: s87  reason: default package */
public final class s87 implements x84 {
    public final View a;
    public final r87 b;
    public int c = 0;

    public s87(View view, q87 q87) {
        this.a = view;
        Objects.requireNonNull(view);
        this.b = new r87(q87, new a6(4, view));
    }

    public final void onPause(nc7 nc7) {
        udd.n("s87", "onPause: unregisterGlobalLayoutListener");
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this.b);
    }

    public final void onResume(nc7 nc7) {
        udd.n("s87", "onResume: registerGlobalLayoutListener");
        this.a.getViewTreeObserver().addOnGlobalLayoutListener(this.b);
    }
}
