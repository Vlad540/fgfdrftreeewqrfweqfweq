package defpackage;

import android.animation.StateListAnimator;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import one.me.profileedit.ProfileEditScreen;

/* renamed from: l9b  reason: default package */
public final /* synthetic */ class l9b implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileEditScreen b;

    public /* synthetic */ l9b(ProfileEditScreen profileEditScreen, int i) {
        this.a = i;
        this.b = profileEditScreen;
    }

    public final Object invoke(Object obj) {
        jue jue = jue.a;
        ProfileEditScreen profileEditScreen = this.b;
        switch (this.a) {
            case 0:
                View view = (View) obj;
                k77[] k77Arr = ProfileEditScreen.C0;
                ex9 onBackPressedDispatcher = profileEditScreen.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                }
                return jue;
            case 1:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) obj;
                k77[] k77Arr2 = ProfileEditScreen.C0;
                fm fmVar = new fm(coordinatorLayout.getContext());
                fmVar.setId(f8a.U);
                fmVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                fmVar.setBackground((Drawable) null);
                fmVar.setLiftOnScroll(true);
                fmVar.setStateListAnimator((StateListAnimator) null);
                k77[] k77Arr3 = ProfileEditScreen.C0;
                l9b l9b = new l9b(profileEditScreen, 2);
                n23 n23 = new n23(fmVar.getContext());
                n23.setId(View.generateViewId());
                dm dmVar = new dm(-1, -2);
                dmVar.a = 19;
                n23.setLayoutParams(dmVar);
                n23.setTitleEnabled(false);
                l9b.invoke(n23);
                fmVar.addView(n23);
                coordinatorLayout.addView(fmVar);
                RecyclerView recyclerView = new RecyclerView(coordinatorLayout.getContext(), (AttributeSet) null);
                recyclerView.setId(f8a.r0);
                nt3 nt3 = new nt3(-1, -1);
                nt3.b(new AppBarLayout.ScrollingViewBehavior());
                recyclerView.setLayoutParams(nt3);
                recyclerView.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager());
                recyclerView.setClipToPadding(false);
                recyclerView.setClipChildren(false);
                recyclerView.setAdapter(profileEditScreen.X);
                recyclerView.setItemAnimator((k6c) null);
                int[] iArr = {2048, 128, 1, 2, 512, 131072};
                ub9 ub9 = gz6.a;
                ub9 ub92 = new ub9(6);
                for (int i = 0; i < 6; i++) {
                    ub92.g(iArr[i]);
                }
                recyclerView.j(new qtc(km4.y0.r(recyclerView), new w48(profileEditScreen, 19, ub92), (o8) null, 12));
                recyclerView.j(new ku7(0));
                coordinatorLayout.addView(recyclerView);
                return jue;
            case 2:
                n23 n232 = (n23) obj;
                k77[] k77Arr4 = ProfileEditScreen.C0;
                l9b l9b2 = new l9b(profileEditScreen, 3);
                Toolbar toolbar = new Toolbar(n232.getContext(), (AttributeSet) null);
                toolbar.setId(View.generateViewId());
                k23 k23 = new k23(-1, -2);
                k23.a = 1;
                toolbar.setLayoutParams(k23);
                toolbar.setNavigationIcon((Drawable) null);
                toolbar.u(0, 0);
                l9b2.invoke(toolbar);
                n232.addView(toolbar);
                l9b l9b3 = new l9b(profileEditScreen, 4);
                LinearLayout linearLayout = new LinearLayout(n232.getContext());
                linearLayout.setId(f8a.b0);
                k23 k232 = new k23(-1, -2);
                k232.a = 2;
                k232.bottomMargin = a24.X(((float) 16) * dh4.c().getDisplayMetrics().density);
                linearLayout.setLayoutParams(k232);
                linearLayout.setOrientation(1);
                l9b3.invoke(linearLayout);
                n232.addView(linearLayout);
                return jue;
            case 3:
                Toolbar toolbar2 = (Toolbar) obj;
                k77[] k77Arr5 = ProfileEditScreen.C0;
                nea nea = new nea(toolbar2.getContext(), 6);
                nea.setId(f8a.q0);
                nea.setForm(fea.a);
                nea.setLeftActions(new vda(new l9b(profileEditScreen, 0)));
                nea.setRightActions(yda.a);
                toolbar2.addView(nea);
                return jue;
            case 4:
                LinearLayout linearLayout2 = (LinearLayout) obj;
                k77[] k77Arr6 = ProfileEditScreen.C0;
                mz9 mz9 = new mz9(linearLayout2.getContext());
                mz9.setId(f8a.V);
                float f = (float) 96;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density));
                layoutParams.gravity = 1;
                layoutParams.topMargin = a24.X(((float) 6) * dh4.c().getDisplayMetrics().density);
                mz9.setLayoutParams(layoutParams);
                mz9.setAddBadgeVisibility(false);
                a24.a0(mz9, new m9b(profileEditScreen, 0));
                linearLayout2.addView(mz9);
                return jue;
            default:
                View view2 = (View) obj;
                k77[] k77Arr7 = ProfileEditScreen.C0;
                profileEditScreen.m0().u();
                return jue;
        }
    }
}
