package defpackage;

import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import one.me.android.root.RootController;

/* renamed from: ffc  reason: default package */
public final /* synthetic */ class ffc implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ RootController b;

    public /* synthetic */ ffc(RootController rootController, int i) {
        this.a = i;
        this.b = rootController;
    }

    public final Object invoke() {
        RootController rootController = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = RootController.x0;
                az1 b2 = x87.b(rootController.getContext());
                b2.setId(nob.root_screen);
                nt3 nt3 = new nt3(-1, -1);
                nt3.b(new AppBarLayout$ScrollingViewBehavior());
                b2.setLayoutParams(nt3);
                return b2;
            default:
                k77[] k77Arr2 = RootController.x0;
                az1 b3 = x87.b(rootController.getContext());
                b3.setId(nob.root_top_indicator);
                b3.setLayoutParams(new nt3(-1, -2));
                b3.setTranslationY(-((float) a24.X(((float) 100) * dh4.c().getDisplayMetrics().density)));
                return b3;
        }
    }
}
