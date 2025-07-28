package defpackage;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: o7  reason: default package */
public abstract class o7 {
    public final Context a;

    public o7(Context context) {
        this.a = context;
    }

    public boolean a() {
        return false;
    }

    public abstract boolean b();

    public abstract View c();

    public View d(MenuItem menuItem) {
        return c();
    }

    public abstract boolean e();

    public void f(SubMenu subMenu) {
    }

    public abstract boolean g();

    public void h(lhd lhd) {
    }
}
