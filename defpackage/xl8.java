package defpackage;

import android.view.MenuItem;

/* renamed from: xl8  reason: default package */
public final class xl8 implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener a;
    public final /* synthetic */ yl8 b;

    public xl8(yl8 yl8, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.b = yl8;
        this.a = onActionExpandListener;
    }

    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.a.onMenuItemActionCollapse(this.b.M(menuItem));
    }

    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.a.onMenuItemActionExpand(this.b.M(menuItem));
    }
}
