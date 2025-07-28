package defpackage;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: fbf  reason: default package */
public abstract class fbf extends kt3 {
    public gbf a;
    public int b = 0;

    public fbf() {
    }

    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        y(coordinatorLayout, view, i);
        if (this.a == null) {
            this.a = new gbf(view);
        }
        gbf gbf = this.a;
        View view2 = gbf.a;
        gbf.b = view2.getTop();
        gbf.c = view2.getLeft();
        this.a.a();
        int i2 = this.b;
        if (i2 == 0) {
            return true;
        }
        this.a.b(i2);
        this.b = 0;
        return true;
    }

    public final int x() {
        gbf gbf = this.a;
        if (gbf != null) {
            return gbf.d;
        }
        return 0;
    }

    public void y(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.p(view, i);
    }

    public boolean z(int i) {
        gbf gbf = this.a;
        if (gbf != null) {
            return gbf.b(i);
        }
        this.b = i;
        return false;
    }

    public fbf(int i) {
    }
}
