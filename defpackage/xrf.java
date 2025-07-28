package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: xrf  reason: default package */
public final class xrf extends WindowInsetsAnimation$Callback {
    public final u12 a;
    public List b;
    public ArrayList c;
    public final HashMap d = new HashMap();

    public xrf(u12 u12) {
        super(u12.a);
        this.a = u12;
    }

    public final asf a(WindowInsetsAnimation windowInsetsAnimation) {
        asf asf = (asf) this.d.get(windowInsetsAnimation);
        if (asf == null) {
            asf = new asf(0, (Interpolator) null, 0);
            if (Build.VERSION.SDK_INT >= 30) {
                asf.a = new yrf(windowInsetsAnimation);
            }
            this.d.put(windowInsetsAnimation, asf);
        }
        return asf;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.b(a(windowInsetsAnimation));
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.c(a(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.c = arrayList2;
            this.b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation l = hia.l(list.get(size));
            asf a2 = a(l);
            a2.a.d(hia.y(l));
            this.c.add(a2);
        }
        return this.a.d(nsf.f((View) null, windowInsets), this.b).e();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        s5c e = this.a.e(a(windowInsetsAnimation), new s5c(bounds));
        e.getClass();
        hia.p();
        return hia.j(((qy6) e.b).d(), ((qy6) e.c).d());
    }
}
