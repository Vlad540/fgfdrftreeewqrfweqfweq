package defpackage;

import android.os.SystemClock;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import java.util.HashMap;
import java.util.Map;

/* renamed from: rbf  reason: default package */
public final class rbf implements v4, of3, c1g {
    public final Object a;

    public /* synthetic */ rbf(Object obj) {
        this.a = obj;
    }

    public void accept(Object obj) {
        zwb zwb = (zwb) obj;
        pf8 pf8 = (pf8) this.a;
        ((eje) pf8.j).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (Map.Entry entry : ((HashMap) pf8.d).entrySet()) {
            xrd xrd = (xrd) entry.getKey();
            uwf uwf = (uwf) entry.getValue();
            if ((uwf.b.toMillis(uwf.a) + uwf.c) - 10 < elapsedRealtime) {
                uwf.c = elapsedRealtime;
                xrd.a(zwb);
            }
        }
    }

    public boolean d(View view) {
        int currentItem = ((ViewPager2) view).getCurrentItem() + 1;
        ViewPager2 viewPager2 = (ViewPager2) ((j8e) this.a).o;
        if (viewPager2.J0) {
            viewPager2.f(currentItem, true);
        }
        return true;
    }

    public Object n() {
        y3g y3g = (y3g) ((c1g) this.a).n();
        if (y3g != null) {
            return y3g;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public rbf(i6g i6g, ih7 ih7) {
        this.a = i6g;
    }
}
