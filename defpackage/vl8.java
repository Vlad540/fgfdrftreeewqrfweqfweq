package defpackage;

import android.content.Context;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: vl8  reason: default package */
public final class vl8 extends o7 implements ActionProvider.VisibilityListener {
    public lhd b;
    public final ActionProvider c;
    public final /* synthetic */ yl8 d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vl8(yl8 yl8, Context context, ActionProvider actionProvider) {
        super(context);
        this.d = yl8;
        this.c = actionProvider;
    }

    public final boolean a() {
        return this.c.hasSubMenu();
    }

    public final boolean b() {
        return this.c.isVisible();
    }

    public final View c() {
        return this.c.onCreateActionView();
    }

    public final View d(MenuItem menuItem) {
        return this.c.onCreateActionView(menuItem);
    }

    public final boolean e() {
        return this.c.onPerformDefaultAction();
    }

    public final void f(SubMenu subMenu) {
        this.d.getClass();
        this.c.onPrepareSubMenu(subMenu);
    }

    public final boolean g() {
        return this.c.overridesItemVisibility();
    }

    public final void h(lhd lhd) {
        this.b = lhd;
        this.c.setVisibilityListener(this);
    }

    public final void onActionProviderVisibilityChanged(boolean z) {
        lhd lhd = this.b;
        if (lhd != null) {
            pl8 pl8 = ((ul8) lhd.b).C0;
            pl8.w0 = true;
            pl8.p(true);
        }
    }
}
