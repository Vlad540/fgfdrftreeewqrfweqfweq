package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Map;
import kotlin.coroutines.Continuation;
import one.me.login.neuroavatars.NeuroAvatarsScreen;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: ui9  reason: default package */
public final /* synthetic */ class ui9 implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NeuroAvatarsScreen b;

    public /* synthetic */ ui9(NeuroAvatarsScreen neuroAvatarsScreen, int i) {
        this.a = i;
        this.b = neuroAvatarsScreen;
    }

    /* JADX WARNING: type inference failed for: r2v33, types: [android.widget.LinearLayout, android.view.View, lj9] */
    public final Object invoke(Object obj) {
        boolean z = true;
        jue jue = jue.a;
        NeuroAvatarsScreen neuroAvatarsScreen = this.b;
        boolean z2 = false;
        switch (this.a) {
            case 0:
                mi9 J = neuroAvatarsScreen.M0.J(((Integer) obj).intValue());
                String str = J != null ? (String) ((Map) neuroAvatarsScreen.q0().C0.getValue()).get(Integer.valueOf(J.c)) : null;
                return str == null ? "" : str;
            case 1:
                int intValue = ((Integer) obj).intValue();
                mr5 mr5 = neuroAvatarsScreen.M0;
                if (mr5.j() > 0) {
                    mi9 J2 = mr5.J(intValue);
                    if (J2 == null || !J2.o) {
                        z = false;
                    }
                    z2 = z;
                }
                return Boolean.valueOf(z2);
            case 2:
                n23 n23 = (n23) obj;
                k77[] k77Arr = NeuroAvatarsScreen.Q0;
                ui9 ui9 = new ui9(neuroAvatarsScreen, 3);
                Toolbar toolbar = new Toolbar(n23.getContext(), (AttributeSet) null);
                float f = (float) 52;
                k23 k23 = new k23(-1, a24.X(dh4.c().getDisplayMetrics().density * f));
                k23.a = 1;
                toolbar.setLayoutParams(k23);
                toolbar.setNavigationIcon((Drawable) null);
                toolbar.u(0, 0);
                ui9.invoke(toolbar);
                n23.addView(toolbar);
                ui9 ui92 = new ui9(neuroAvatarsScreen, 4);
                LinearLayout linearLayout = new LinearLayout(n23.getContext());
                linearLayout.setId(jpb.oneme_login_neuro_avatars_collapsible);
                k23 k232 = new k23(-1, -2);
                k232.a = 2;
                float f2 = (float) 24;
                k232.setMargins(0, me4.c(f, dh4.c().getDisplayMetrics().density, a24.X(dh4.c().getDisplayMetrics().density * f2)), 0, a24.X(f2 * dh4.c().getDisplayMetrics().density));
                linearLayout.setLayoutParams(k232);
                linearLayout.setOrientation(1);
                ui92.invoke(linearLayout);
                n23.addView(linearLayout);
                return jue;
            case 3:
                Toolbar toolbar2 = (Toolbar) obj;
                k77[] k77Arr2 = NeuroAvatarsScreen.Q0;
                nea nea = new nea(toolbar2.getContext(), 6);
                nea.setId(jpb.oneme_login_neuro_avatars_toolbar);
                nea.setForm(fea.a);
                nea.setLeftActions(new vda(new ui9(neuroAvatarsScreen, 5)));
                nea.setTitle(neuroAvatarsScreen.q0().x0.a);
                nea.setTitleAlpha(0.0f);
                toolbar2.addView(nea);
                return jue;
            case 4:
                LinearLayout linearLayout2 = (LinearLayout) obj;
                k77[] k77Arr3 = NeuroAvatarsScreen.Q0;
                TextView textView = new TextView(linearLayout2.getContext());
                textView.setId(jpb.oneme_login_neuro_avatars_title);
                nte.c.b(textView, yq4.b);
                textView.setText(neuroAvatarsScreen.q0().x0.a);
                textView.setGravity(1);
                k23 k233 = new k23(-1, -2);
                float f3 = (float) 12;
                k233.setMargins(a24.X(dh4.c().getDisplayMetrics().density * f3), 0, a24.X(dh4.c().getDisplayMetrics().density * f3), 0);
                textView.setLayoutParams(k233);
                urd.B(new y9(3, (Continuation) null, 19), textView);
                linearLayout2.addView(textView);
                TextView textView2 = new TextView(linearLayout2.getContext());
                textView2.setId(jpb.oneme_login_neuro_avatars_description);
                nte.l.b(textView2, yq4.b);
                textView2.setText(neuroAvatarsScreen.q0().x0.b);
                textView2.setGravity(1);
                k23 k234 = new k23(-1, -2);
                k234.setMargins(a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(f3 * dh4.c().getDisplayMetrics().density), 0);
                textView2.setLayoutParams(k234);
                urd.B(new y9(3, (Continuation) null, 18), textView2);
                linearLayout2.addView(textView2);
                return jue;
            case 5:
                View view = (View) obj;
                k77[] k77Arr4 = NeuroAvatarsScreen.Q0;
                neuroAvatarsScreen.getRouter().C();
                return jue;
            case 6:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) obj;
                k77[] k77Arr5 = NeuroAvatarsScreen.Q0;
                ui9 ui93 = new ui9(neuroAvatarsScreen, 7);
                fm fmVar = new fm(coordinatorLayout.getContext());
                fmVar.setId(jpb.oneme_login_neuro_avatars_appbar);
                fmVar.setLayoutParams(new nt3(-1, -2));
                fmVar.setElevation(0.0f);
                urd.B(new zi9(3, (Continuation) null, 0), fmVar);
                ui93.invoke(fmVar);
                coordinatorLayout.addView(fmVar);
                RecyclerView recyclerView = new RecyclerView(coordinatorLayout.getContext(), (AttributeSet) null);
                recyclerView.setId(jpb.oneme_login_neuro_avatars_recycler_view);
                nt3 nt3 = new nt3(-1, -1);
                nt3.b(new AppBarLayout.ScrollingViewBehavior());
                recyclerView.setLayoutParams(nt3);
                recyclerView.setClipToPadding(false);
                recyclerView.setItemAnimator((k6c) null);
                recyclerView.setOverScrollMode(2);
                recyclerView.getContext();
                recyclerView.setLayoutManager(new GridLayoutManager(4));
                mr5 mr52 = neuroAvatarsScreen.M0;
                recyclerView.setAdapter(mr52);
                recyclerView.m(neuroAvatarsScreen.N0);
                hk3 hk3 = new hk3(recyclerView, mr52, new ui9(neuroAvatarsScreen, 0));
                es5 es5 = new es5(new ui9(neuroAvatarsScreen, 1), recyclerView.getContext());
                recyclerView.j(hk3);
                recyclerView.j(es5);
                recyclerView.j(new vi2(a24.X(((float) 16) * dh4.c().getDisplayMetrics().density), a24.X(((float) 12) * dh4.c().getDisplayMetrics().density), 4));
                recyclerView.addOnLayoutChangeListener(new zm1(recyclerView, 4, neuroAvatarsScreen));
                coordinatorLayout.addView(recyclerView);
                ui9 ui94 = new ui9(neuroAvatarsScreen, 8);
                FrameLayout frameLayout = new FrameLayout(coordinatorLayout.getContext());
                frameLayout.setId(jpb.oneme_login_neuro_avatars_button_background);
                nt3 nt32 = new nt3(-1, -2);
                nt32.c = 80;
                frameLayout.setLayoutParams(nt32);
                frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, km4.y0.r(frameLayout).d().d.a));
                ek8.g(frameLayout, new sy6(0, new up0(3, 1, false), 1), (u16) null);
                ui94.invoke(frameLayout);
                urd.B(new ql2(3, (Continuation) null, 3), frameLayout);
                coordinatorLayout.addView(frameLayout);
                return jue;
            case 7:
                fm fmVar2 = (fm) obj;
                k77[] k77Arr6 = NeuroAvatarsScreen.Q0;
                ui9 ui95 = new ui9(neuroAvatarsScreen, 2);
                n23 n232 = new n23(fmVar2.getContext());
                dm dmVar = new dm(-1, -2);
                dmVar.a = 19;
                n232.setLayoutParams(dmVar);
                n232.setTitleEnabled(false);
                ui95.invoke(n232);
                fmVar2.addView(n232);
                mz9 mz9 = new mz9(fmVar2.getContext());
                mz9.setId(jpb.oneme_login_neuro_avatars_avatar);
                float f4 = (float) 96;
                mz9.setLayoutParams(new dm(a24.X(dh4.c().getDisplayMetrics().density * f4), a24.X(f4 * dh4.c().getDisplayMetrics().density)));
                fmVar2.setGravity(1);
                mz9.setCloseBadgeClickListener(new vi9(neuroAvatarsScreen, 0));
                mz9.setOnImageLoadedListener(new vi9(neuroAvatarsScreen, 1));
                mz9.h(mz9, (Drawable) neuroAvatarsScreen.P0.getValue(), (gz9) null, 30);
                mz9.setAvatarShape(dz9.a);
                fmVar2.addView(mz9);
                ? linearLayout3 = new LinearLayout(fmVar2.getContext(), (AttributeSet) null, 0);
                float f5 = (float) 8;
                linearLayout3.setPadding(a24.X(dh4.c().getDisplayMetrics().density * f5), 0, a24.X(f5 * dh4.c().getDisplayMetrics().density), 0);
                linearLayout3.setId(jpb.oneme_login_neuro_avatars_tabs_shimmer);
                linearLayout3.setElevation(0.0f);
                dm dmVar2 = new dm(-1, -2);
                float f6 = (float) 32;
                dmVar2.topMargin = a24.X(dh4.c().getDisplayMetrics().density * f6);
                linearLayout3.setLayoutParams(dmVar2);
                linearLayout3.setVisibility(8);
                linearLayout3.setTabs(3);
                linearLayout3.setOverScrollMode(2);
                fmVar2.addView(linearLayout3);
                hda hda = new hda(fmVar2.getContext(), (AttributeSet) null);
                hda.setId(jpb.oneme_login_neuro_avatars_tabs);
                hda.setTabMode(0);
                hda.setElevation(0.0f);
                dm dmVar3 = new dm(-1, -2);
                dmVar3.topMargin = a24.X(f6 * dh4.c().getDisplayMetrics().density);
                hda.setLayoutParams(dmVar3);
                hda.setOverScrollMode(2);
                fmVar2.addView(hda);
                return jue;
            default:
                FrameLayout frameLayout2 = (FrameLayout) obj;
                k77[] k77Arr7 = NeuroAvatarsScreen.Q0;
                OneMeButton oneMeButton = new OneMeButton(frameLayout2.getContext(), (AttributeSet) null);
                oneMeButton.setId(jpb.oneme_login_neuro_avatars_continue_btn);
                oneMeButton.setMode(u0a.a);
                oneMeButton.setSize(v0a.c);
                oneMeButton.setAppearance(s0a.o);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                float f7 = (float) 12;
                layoutParams.setMargins(a24.X(dh4.c().getDisplayMetrics().density * f7), 0, a24.X(f7 * dh4.c().getDisplayMetrics().density), a24.X(((float) 16) * dh4.c().getDisplayMetrics().density));
                layoutParams.gravity = 48;
                oneMeButton.setLayoutParams(layoutParams);
                oneMeButton.setText(neuroAvatarsScreen.q0().x0.c);
                frameLayout2.addView(oneMeButton);
                return jue;
        }
    }
}
