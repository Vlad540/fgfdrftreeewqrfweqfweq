package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* renamed from: gbf  reason: default package */
public final class gbf {
    public final View a;
    public int b;
    public int c;
    public int d;

    public gbf(View view) {
        this.a = view;
    }

    public final void a() {
        int i = this.d;
        View view = this.a;
        int top = i - (view.getTop() - this.b);
        WeakHashMap weakHashMap = eaf.a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.c));
    }

    public final boolean b(int i) {
        if (this.d == i) {
            return false;
        }
        this.d = i;
        a();
        return true;
    }
}
