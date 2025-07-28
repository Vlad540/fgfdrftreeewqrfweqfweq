package androidx.mediarouter.app;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

public class MediaRouteActionProvider extends o7 {
    public final yb8 b;
    public final qb8 c = qb8.c;
    public final ua8 d = ua8.a;
    public ia8 e;

    public MediaRouteActionProvider(Context context) {
        super(context);
        this.b = yb8.d(context);
        new WeakReference(this);
    }

    public final boolean b() {
        qb8 qb8 = this.c;
        this.b.getClass();
        return yb8.e(qb8);
    }

    public final View c() {
        ia8 ia8 = new ia8(this.a);
        this.e = ia8;
        ia8.setCheatSheetEnabled(true);
        this.e.setRouteSelector(this.c);
        this.e.setAlwaysVisible(false);
        this.e.setDialogFactory(this.d);
        this.e.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        return this.e;
    }

    public final boolean e() {
        ia8 ia8 = this.e;
        if (ia8 != null) {
            return ia8.d();
        }
        return false;
    }

    public final boolean g() {
        return true;
    }
}
