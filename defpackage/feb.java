package defpackage;

import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.coroutines.Continuation;
import one.me.profile.ProfileScreen;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: feb  reason: default package */
public final /* synthetic */ class feb implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileScreen b;

    public /* synthetic */ feb(ProfileScreen profileScreen, int i) {
        this.a = i;
        this.b = profileScreen;
    }

    public final Object invoke(Object obj) {
        jue jue = jue.a;
        ProfileScreen profileScreen = this.b;
        switch (this.a) {
            case 0:
                fm fmVar = (fm) obj;
                k77[] k77Arr = ProfileScreen.H0;
                feb feb = new feb(profileScreen, 1);
                n23 n23 = new n23(fmVar.getContext());
                dm dmVar = new dm(-1, -2);
                dmVar.a = 19;
                n23.setLayoutParams(dmVar);
                n23.setTitleEnabled(false);
                feb.invoke(n23);
                fmVar.addView(n23);
                return jue;
            case 1:
                n23 n232 = (n23) obj;
                k77[] k77Arr2 = ProfileScreen.H0;
                qq9 qq9 = new qq9(profileScreen, 22);
                Toolbar toolbar = new Toolbar(n232.getContext(), (AttributeSet) null);
                k23 k23 = new k23(-1, -2);
                k23.a = 1;
                toolbar.setLayoutParams(k23);
                toolbar.setNavigationIcon((Drawable) null);
                toolbar.u(0, 0);
                qq9.invoke(toolbar);
                n232.addView(toolbar);
                qq9 qq92 = new qq9(profileScreen, 23);
                LinearLayout linearLayout = new LinearLayout(n232.getContext());
                linearLayout.setId(j8a.e1);
                k23 k232 = new k23(-1, -2);
                k232.a = 2;
                k232.bottomMargin = a24.X(((float) 16) * dh4.c().getDisplayMetrics().density);
                linearLayout.setLayoutParams(k232);
                linearLayout.setOrientation(1);
                qq92.invoke(linearLayout);
                n232.addView(linearLayout);
                return jue;
            case 2:
                LinearLayout linearLayout2 = (LinearLayout) obj;
                k77[] k77Arr3 = ProfileScreen.H0;
                RecyclerView endlessRecyclerView2 = new EndlessRecyclerView2(linearLayout2.getContext(), (AttributeSet) null, 6);
                endlessRecyclerView2.setId(j8a.k1);
                endlessRecyclerView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                endlessRecyclerView2.setItemAnimator((k6c) null);
                endlessRecyclerView2.getContext();
                endlessRecyclerView2.setLayoutManager(new LinearLayoutManager());
                endlessRecyclerView2.setOverScrollMode(2);
                b bVar = new b();
                bVar.setMaxRecycledViews(1, 1);
                bVar.setMaxRecycledViews(2, 1);
                bVar.setMaxRecycledViews(128, 1);
                bVar.setMaxRecycledViews(64, 1);
                bVar.setMaxRecycledViews(32768, 1);
                bVar.setMaxRecycledViews(32, 1);
                bVar.setMaxRecycledViews(16, 1);
                bVar.setMaxRecycledViews(8, 1);
                bVar.setMaxRecycledViews(65536, 1);
                bVar.setMaxRecycledViews(4096, 1);
                endlessRecyclerView2.setRecycledViewPool(bVar);
                endlessRecyclerView2.setAdapter(new seb(((x4a) i6b.a.getAccessor().c(x4a.class)).a(), profileScreen));
                endlessRecyclerView2.setClipToPadding(false);
                endlessRecyclerView2.setClipChildren(false);
                endlessRecyclerView2.setPager(new t61(profileScreen, 8));
                ub9 ub9 = gz6.a;
                ub9 ub92 = new ub9(3);
                ub92.g(1);
                ub92.g(4);
                ub92.g(2);
                endlessRecyclerView2.j(new qtc(km4.y0.r(endlessRecyclerView2), new w48(endlessRecyclerView2, 22, ub92), (o8) null, 12));
                float f = (float) 12;
                float f2 = (float) 24;
                float f3 = (float) 18;
                float f4 = (float) 6;
                float f5 = (float) 10;
                endlessRecyclerView2.j(new ku7(jjd.r(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f), 512, a24.X(dh4.c().getDisplayMetrics().density * f), 1024, a24.X(dh4.c().getDisplayMetrics().density * f), 4096, a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f)), jjd.r(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(f3 * dh4.c().getDisplayMetrics().density), 512, 0, 1024, 0, 4096, a24.X(dh4.c().getDisplayMetrics().density * f4), 0), jjd.r(a24.X(((float) 8) * dh4.c().getDisplayMetrics().density), 0, a24.X(f4 * dh4.c().getDisplayMetrics().density), 0, 0, 0, 0, 0, 0, 0, a24.X(dh4.c().getDisplayMetrics().density * f5), 4096, a24.X(dh4.c().getDisplayMetrics().density * f5), 512, a24.X(dh4.c().getDisplayMetrics().density * f5), 1024, a24.X(dh4.c().getDisplayMetrics().density * f5), a24.X(f5 * dh4.c().getDisplayMetrics().density)), 1));
                linearLayout2.addView(endlessRecyclerView2);
                FrameLayout frameLayout = new FrameLayout(linearLayout2.getContext());
                frameLayout.setId(j8a.i1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.rightMargin = a24.X(dh4.c().getDisplayMetrics().density * f);
                layoutParams.leftMargin = a24.X(f * dh4.c().getDisplayMetrics().density);
                layoutParams.bottomMargin = a24.X(f2 * dh4.c().getDisplayMetrics().density);
                layoutParams.topMargin = a24.X(((float) 3) * dh4.c().getDisplayMetrics().density);
                frameLayout.setLayoutParams(layoutParams);
                frameLayout.setOutlineProvider(new eu3(dh4.c().getDisplayMetrics().density * 16.0f));
                urd.B(new ml2(3, (Continuation) null, 1), frameLayout);
                linearLayout2.addView(frameLayout);
                return jue;
            default:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) obj;
                k77[] k77Arr4 = ProfileScreen.H0;
                feb feb2 = new feb(profileScreen, 0);
                fm fmVar2 = new fm(coordinatorLayout.getContext());
                fmVar2.setId(j8a.c1);
                fmVar2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                fmVar2.setBackground((Drawable) null);
                feb2.invoke(fmVar2);
                coordinatorLayout.addView(fmVar2);
                NestedScrollView nestedScrollView = new NestedScrollView(coordinatorLayout.getContext(), (AttributeSet) null);
                nt3 nt3 = new nt3(-1, -1);
                nt3.b(new AppBarLayout.ScrollingViewBehavior());
                nestedScrollView.setLayoutParams(nt3);
                feb feb3 = new feb(profileScreen, 2);
                LinearLayout linearLayout3 = new LinearLayout(nestedScrollView.getContext());
                linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                linearLayout3.setOrientation(1);
                feb3.invoke(linearLayout3);
                nestedScrollView.addView(linearLayout3);
                coordinatorLayout.addView(nestedScrollView);
                return jue;
        }
    }
}
