package defpackage;

import android.animation.StateListAnimator;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import kotlin.coroutines.Continuation;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: ab1  reason: default package */
public final /* synthetic */ class ab1 implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallLinkInfoScreen b;

    public /* synthetic */ ab1(CallLinkInfoScreen callLinkInfoScreen, int i) {
        this.a = i;
        this.b = callLinkInfoScreen;
    }

    public final Object invoke(Object obj) {
        jue jue = jue.a;
        CallLinkInfoScreen callLinkInfoScreen = this.b;
        switch (this.a) {
            case 0:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) obj;
                k77[] k77Arr = CallLinkInfoScreen.F0;
                fm fmVar = new fm(coordinatorLayout.getContext());
                fmVar.setId(i1a.m);
                fmVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                fmVar.setBackground((Drawable) null);
                fmVar.setStateListAnimator((StateListAnimator) null);
                k77[] k77Arr2 = CallLinkInfoScreen.F0;
                ab1 ab1 = new ab1(callLinkInfoScreen, 1);
                n23 n23 = new n23(fmVar.getContext());
                dm dmVar = new dm(-1, -2);
                dmVar.a = 19;
                n23.setLayoutParams(dmVar);
                n23.setTitleEnabled(false);
                ab1.invoke(n23);
                fmVar.addView(n23);
                coordinatorLayout.addView(fmVar);
                RecyclerView recyclerView = new RecyclerView(coordinatorLayout.getContext(), (AttributeSet) null);
                recyclerView.setId(i1a.k);
                nt3 nt3 = new nt3(-1, -1);
                nt3.b(new AppBarLayout$ScrollingViewBehavior());
                recyclerView.setLayoutParams(nt3);
                recyclerView.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager());
                recyclerView.setAdapter(callLinkInfoScreen.D0);
                recyclerView.setItemAnimator((k6c) null);
                float f = (float) 12;
                recyclerView.setPadding(a24.X(dh4.c().getDisplayMetrics().density * f), 0, a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(((float) 0) * dh4.c().getDisplayMetrics().density));
                recyclerView.j(new qtc(km4.y0.r(recyclerView), new rgc(15, callLinkInfoScreen), (o8) null, 12));
                coordinatorLayout.addView(recyclerView);
                OneMeButton oneMeButton = new OneMeButton(coordinatorLayout.getContext(), (AttributeSet) null);
                oneMeButton.setId(i1a.n);
                oneMeButton.setSize(v0a.c);
                oneMeButton.setMode(u0a.a);
                oneMeButton.setAppearance(s0a.a);
                nt3 nt32 = new nt3(-1, -2);
                nt32.c = 81;
                nt32.setMarginStart(a24.X(dh4.c().getDisplayMetrics().density * f));
                nt32.setMarginEnd(a24.X(f * dh4.c().getDisplayMetrics().density));
                nt32.bottomMargin = a24.X(((float) 16) * dh4.c().getDisplayMetrics().density);
                nt32.topMargin = a24.X(((float) 8) * dh4.c().getDisplayMetrics().density);
                oneMeButton.setLayoutParams(nt32);
                coordinatorLayout.addView(oneMeButton);
                urd.B(new c3(callLinkInfoScreen, (Continuation) null, 3), coordinatorLayout);
                return jue;
            default:
                n23 n232 = (n23) obj;
                k77[] k77Arr3 = CallLinkInfoScreen.F0;
                o8 o8Var = new o8(callLinkInfoScreen, 23);
                Toolbar toolbar = new Toolbar(n232.getContext(), (AttributeSet) null);
                k23 k23 = new k23(-1, -2);
                k23.a = 1;
                toolbar.setLayoutParams(k23);
                toolbar.setNavigationIcon((Drawable) null);
                toolbar.u(0, 0);
                o8Var.invoke(toolbar);
                n232.addView(toolbar);
                o8 o8Var2 = new o8(callLinkInfoScreen, 24);
                LinearLayout linearLayout = new LinearLayout(n232.getContext());
                linearLayout.setId(i1a.o);
                k23 k232 = new k23(-1, -2);
                k232.a = 2;
                k232.bottomMargin = a24.X(((float) 16) * dh4.c().getDisplayMetrics().density);
                linearLayout.setLayoutParams(k232);
                linearLayout.setOrientation(1);
                o8Var2.invoke(linearLayout);
                n232.addView(linearLayout);
                return jue;
        }
    }
}
