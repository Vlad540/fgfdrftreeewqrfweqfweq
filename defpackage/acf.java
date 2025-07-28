package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: acf  reason: default package */
public final class acf {
    public final ArrayList a = new ArrayList();
    public long b = -1;
    public Interpolator c;
    public bcf d;
    public boolean e;
    public final bme f = new bme(this);

    public final void a() {
        if (this.e) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((zbf) it.next()).b();
            }
            this.e = false;
        }
    }

    public final void b() {
        View view;
        if (!this.e) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                zbf zbf = (zbf) it.next();
                long j = this.b;
                if (j >= 0) {
                    zbf.c(j);
                }
                Interpolator interpolator = this.c;
                if (!(interpolator == null || (view = (View) zbf.a.get()) == null)) {
                    view.animate().setInterpolator(interpolator);
                }
                if (this.d != null) {
                    zbf.d(this.f);
                }
                View view2 = (View) zbf.a.get();
                if (view2 != null) {
                    view2.animate().start();
                }
            }
            this.e = true;
        }
    }
}
