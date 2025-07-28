package defpackage;

import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.coroutines.Continuation;
import one.me.settings.SettingsListScreen;

/* renamed from: x7d  reason: default package */
public final /* synthetic */ class x7d implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SettingsListScreen b;

    public /* synthetic */ x7d(SettingsListScreen settingsListScreen, int i) {
        this.a = i;
        this.b = settingsListScreen;
    }

    public final Object invoke(Object obj) {
        jue jue = jue.a;
        SettingsListScreen settingsListScreen = this.b;
        switch (this.a) {
            case 0:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) obj;
                k77[] k77Arr = SettingsListScreen.D0;
                fm fmVar = new fm(coordinatorLayout.getContext());
                fmVar.setId(yaa.g);
                fmVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                urd.B(new zi9(3, (Continuation) null, 1), fmVar);
                settingsListScreen.A0 = fmVar;
                fmVar.setLiftOnScroll(true);
                n23 n23 = new n23(fmVar.getContext());
                n23.setId(yaa.e);
                dm dmVar = new dm(-1, -2);
                dmVar.a = 19;
                n23.setLayoutParams(dmVar);
                n23.setTitleEnabled(false);
                x7d x7d = new x7d(settingsListScreen, 1);
                Toolbar toolbar = new Toolbar(n23.getContext(), (AttributeSet) null);
                toolbar.setId(yaa.h);
                k23 k23 = new k23(-1, -2);
                k23.a = 1;
                toolbar.setLayoutParams(k23);
                toolbar.setNavigationIcon((Drawable) null);
                toolbar.u(0, 0);
                x7d.invoke(toolbar);
                n23.addView(toolbar);
                n23.addView(new v9d(n23.getContext()));
                fmVar.addView(n23);
                coordinatorLayout.addView(fmVar);
                RecyclerView n0 = settingsListScreen.n0(24);
                nt3 nt3 = new nt3(-1, -1);
                nt3.b(new AppBarLayout.ScrollingViewBehavior());
                n0.setLayoutParams(nt3);
                n0.setPaddingRelative(n0.getPaddingStart(), n0.getPaddingTop(), n0.getPaddingEnd(), a24.X(((float) 12) * dh4.c().getDisplayMetrics().density));
                n0.setClipToPadding(false);
                n0.setItemAnimator((k6c) null);
                n0.setClipChildren(false);
                n0.j(new iq(9));
                n0.j(new iq(10));
                coordinatorLayout.addView(n0);
                return jue;
            case 1:
                Toolbar toolbar2 = (Toolbar) obj;
                k77[] k77Arr2 = SettingsListScreen.D0;
                nea nea = new nea(toolbar2.getContext(), 6);
                nea.setId(yaa.i);
                nea.setForm(fea.a);
                nea.setRightActions(new aea((jea) null, new gea(phc.G, new x7d(settingsListScreen, 2))));
                nea.setLeftActions(new zda(new gea(phc.M1, new u1c(8))));
                toolbar2.addView(nea);
                return jue;
            default:
                View view = (View) obj;
                k77[] k77Arr3 = SettingsListScreen.D0;
                v4d p0 = settingsListScreen.p0();
                Long t = p0.t();
                if (t != null) {
                    taf.o(p0.B0, new p8d(t.longValue()));
                }
                return jue;
        }
    }
}
