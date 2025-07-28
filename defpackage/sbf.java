package defpackage;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Collections;
import java.util.Map;

/* renamed from: sbf  reason: default package */
public final class sbf implements v4, pd4 {
    public final /* synthetic */ Object a;

    public /* synthetic */ sbf(Object obj) {
        this.a = obj;
    }

    public boolean d(View view) {
        int currentItem = ((ViewPager2) view).getCurrentItem() - 1;
        ViewPager2 viewPager2 = (ViewPager2) ((j8e) this.a).o;
        if (viewPager2.J0) {
            viewPager2.f(currentItem, true);
        }
        return true;
    }

    public Map getRemoteVideoRenderers(ge1 ge1) {
        pd4 pd4 = ((gx0) this.a).z1;
        return pd4 != null ? pd4.getRemoteVideoRenderers(ge1) : Collections.emptyMap();
    }

    public boolean isEnabled() {
        return ((gx0) this.a).z1 != null;
    }
}
