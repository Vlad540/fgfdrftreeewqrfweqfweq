package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import androidx.viewpager2.widget.ViewPager2;

/* renamed from: pbf  reason: default package */
public final class pbf extends LinearLayoutManager {
    public final /* synthetic */ ViewPager2 E;

    public pbf(ViewPager2 viewPager2) {
        this.E = viewPager2;
    }

    public final void L0(x6c x6c, int[] iArr) {
        ViewPager2 viewPager2 = this.E;
        int offscreenPageLimit = viewPager2.getOffscreenPageLimit();
        if (offscreenPageLimit == -1) {
            super.L0(x6c, iArr);
            return;
        }
        int pageSize = viewPager2.getPageSize() * offscreenPageLimit;
        iArr[0] = pageSize;
        iArr[1] = pageSize;
    }

    public final void a0(t6c t6c, x6c x6c, l4 l4Var) {
        super.a0(t6c, x6c, l4Var);
        this.E.L0.getClass();
    }

    public final void b0(t6c t6c, x6c x6c, View view, l4 l4Var) {
        int i;
        int i2;
        ViewPager2 viewPager2 = (ViewPager2) this.E.L0.o;
        if (viewPager2.getOrientation() == 1) {
            viewPager2.y0.getClass();
            i = a.M(view);
        } else {
            i = 0;
        }
        if (viewPager2.getOrientation() == 0) {
            viewPager2.y0.getClass();
            i2 = a.M(view);
        } else {
            i2 = 0;
        }
        l4Var.i(k4.a(false, i, 1, i2, 1));
    }

    public final boolean o0(t6c t6c, x6c x6c, int i, Bundle bundle) {
        this.E.L0.getClass();
        return super.o0(t6c, x6c, i, bundle);
    }

    public final boolean v0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }
}
