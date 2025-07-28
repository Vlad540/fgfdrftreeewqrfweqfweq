package defpackage;

import android.graphics.Rect;
import android.view.ViewTreeObserver;
import org.apache.http.HttpStatus;

/* renamed from: r87  reason: default package */
public final class r87 implements ViewTreeObserver.OnGlobalLayoutListener {
    public boolean X;
    public final int a = HttpStatus.SC_BAD_REQUEST;
    public final Rect b = new Rect();
    public final qf3 c;
    public int o;

    public r87(q87 q87, a6 a6Var) {
        this.c = a6Var;
    }

    public final void onGlobalLayout() {
        qf3 qf3 = this.c;
        Rect rect = this.b;
        qf3.accept(rect);
        int height = rect.height();
        int i = this.o;
        if (i != 0) {
            int i2 = this.a;
            if (i > height + i2) {
                this.X = true;
            } else if (i + i2 < height) {
                this.X = false;
            }
        }
        this.o = height;
    }
}
