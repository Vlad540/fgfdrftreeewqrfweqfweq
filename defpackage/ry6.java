package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* renamed from: ry6  reason: default package */
public final class ry6 extends u12 {
    public final View c;
    public int d;
    public int e;
    public final int[] f = new int[2];

    public ry6(View view) {
        super(0);
        this.c = view;
    }

    public final void b(asf asf) {
        this.c.setTranslationY(0.0f);
    }

    public final void c(asf asf) {
        View view = this.c;
        int[] iArr = this.f;
        view.getLocationOnScreen(iArr);
        this.d = iArr[1];
    }

    public final nsf d(nsf nsf, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            asf asf = (asf) it.next();
            if ((asf.a.c() & 8) != 0) {
                this.c.setTranslationY((float) og.c(this.e, asf.a.b(), 0));
                break;
            }
        }
        return nsf;
    }

    public final s5c e(asf asf, s5c s5c) {
        View view = this.c;
        int[] iArr = this.f;
        view.getLocationOnScreen(iArr);
        int i = this.d - iArr[1];
        this.e = i;
        view.setTranslationY((float) i);
        return s5c;
    }
}
