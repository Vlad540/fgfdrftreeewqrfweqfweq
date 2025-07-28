package defpackage;

import android.database.DataSetObserver;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;

/* renamed from: cx3  reason: default package */
public final class cx3 extends DataSetObserver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cx3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onChanged() {
        switch (this.a) {
            case 0:
                dx3 dx3 = (dx3) this.b;
                dx3.a = true;
                dx3.notifyDataSetChanged();
                return;
            case 1:
                xg7 xg7 = (xg7) this.b;
                if (xg7.O0.isShowing()) {
                    xg7.g();
                    return;
                }
                return;
            case 2:
                ((TabLayout) this.b).j();
                return;
            default:
                ((ViewPager) this.b).f();
                return;
        }
    }

    public final void onInvalidated() {
        switch (this.a) {
            case 0:
                dx3 dx3 = (dx3) this.b;
                dx3.a = false;
                dx3.notifyDataSetInvalidated();
                return;
            case 1:
                ((xg7) this.b).dismiss();
                return;
            case 2:
                ((TabLayout) this.b).j();
                return;
            default:
                ((ViewPager) this.b).f();
                return;
        }
    }
}
