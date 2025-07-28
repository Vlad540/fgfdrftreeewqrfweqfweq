package defpackage;

import android.view.View;
import java.util.List;

/* renamed from: dd7  reason: default package */
public final class dd7 {
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public List k;
    public boolean l;

    public final void a(View view) {
        int i2;
        int size = this.k.size();
        View view2 = null;
        int i3 = Integer.MAX_VALUE;
        for (int i4 = 0; i4 < size; i4++) {
            View view3 = ((b7c) this.k.get(i4)).a;
            n6c n6c = (n6c) view3.getLayoutParams();
            if (view3 != view && !n6c.a.p() && (i2 = (n6c.a.i() - this.d) * this.e) >= 0 && i2 < i3) {
                view2 = view3;
                if (i2 == 0) {
                    break;
                }
                i3 = i2;
            }
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((n6c) view2.getLayoutParams()).a.i();
        }
    }

    public final View b(t6c t6c) {
        List list = this.k;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = ((b7c) this.k.get(i2)).a;
                n6c n6c = (n6c) view.getLayoutParams();
                if (!n6c.a.p() && this.d == n6c.a.i()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }
        View view2 = t6c.j(this.d, Long.MAX_VALUE).a;
        this.d += this.e;
        return view2;
    }
}
