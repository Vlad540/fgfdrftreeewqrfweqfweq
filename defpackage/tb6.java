package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* renamed from: tb6  reason: default package */
public final class tb6 extends n1g {
    public final /* synthetic */ n1g f;
    public final /* synthetic */ n1g g;

    public tb6(n1g n1g, n1g n1g2) {
        super(10);
        this.f = n1g;
        this.g = n1g2;
    }

    public final int m(View view, int i, int i2) {
        WeakHashMap weakHashMap = eaf.a;
        return (view.getLayoutDirection() == 1 ? this.g : this.f).m(view, i, i2);
    }

    public final String p() {
        return "SWITCHING[L:" + this.f.p() + ", R:" + this.g.p() + "]";
    }

    public final int r(View view, int i) {
        WeakHashMap weakHashMap = eaf.a;
        return (view.getLayoutDirection() == 1 ? this.g : this.f).r(view, i);
    }
}
