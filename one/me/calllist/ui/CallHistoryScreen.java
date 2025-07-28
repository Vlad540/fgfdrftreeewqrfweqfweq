package one.me.calllist.ui;

import android.animation.StateListAnimator;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lone/me/calllist/ui/CallHistoryScreen;", "Lone/me/sdk/arch/Widget;", "Llc3;", "<init>", "()V", "call-list_release"}, k = 1, mv = {2, 0, 0})
public final class CallHistoryScreen extends Widget implements lc3 {
    public static final /* synthetic */ k77[] G0;
    public static final int[] H0 = {-11664148, -7436801};
    public final n0c A0 = viewBinding(sob.call_history_empty);
    public final f71 B0;
    public final p61 C0;
    public ur3 D0;
    public final sy6 E0;
    public final String F0;
    public final n0c X = viewBinding(i1a.h);
    public final n0c Y = viewBinding(i1a.j);
    public final n0c Z = viewBinding(sob.call_history_tabs);
    public final t97 a = mqc.l;
    public final t97 b = rna.a.b();
    public final t97 c = createViewModelLazy(e71.class, new s(10, new y61(this, 1)));
    public final t97 o = ez3.O(3, new y61(this, 2));
    public final n0c w0 = viewBinding(sob.call_history_pager);
    public final n0c x0 = viewBinding(i1a.i);
    public final n0c y0 = viewBinding(i1a.g);
    public final n0c z0 = viewBinding(i1a.f);

    static {
        Class<CallHistoryScreen> cls = CallHistoryScreen.class;
        khb khb = new khb(cls, "container", "getContainer()Landroidx/coordinatorlayout/widget/CoordinatorLayout;", 0);
        n7c n7c = m7c.a;
        G0 = new k77[]{khb, wn6.e(n7c, cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), wn6.f(cls, "callTabLayout", "getCallTabLayout()Lone/me/common/tablayout/OneMeTabLayout;", 0, n7c), wn6.f(cls, "callHistoryPager", "getCallHistoryPager()Landroidx/viewpager2/widget/ViewPager2;", 0, n7c), wn6.f(cls, "createGroupCallButton", "getCreateGroupCallButton()Lone/me/calllist/view/CallActionItemView;", 0, n7c), wn6.f(cls, "callToContactButton", "getCallToContactButton()Lone/me/calllist/view/CallActionItemView;", 0, n7c), wn6.f(cls, "micPermissionBanner", "getMicPermissionBanner()Lone/me/sdk/uikit/common/banner/OneMeCompactBannerView;", 0, n7c), wn6.f(cls, "callEmptyHistoryView", "getCallEmptyHistoryView()Lone/me/sdk/uikit/common/emptyview/OneMeEmptyView;", 0, n7c)};
    }

    /* JADX WARNING: type inference failed for: r0v25, types: [f71, java.lang.Object] */
    public CallHistoryScreen() {
        super((Bundle) null, 0, 3, (x54) null);
        ? obj = new Object();
        obj.a = hw4.a;
        this.B0 = obj;
        this.C0 = new p61(this);
        this.E0 = sy6.d;
        this.F0 = "call_history_scope_id";
    }

    public final sy6 getInsetsConfig() {
        return this.E0;
    }

    /* renamed from: getScopeId-IluPPks  reason: not valid java name */
    public final String m44getScopeIdIluPPks() {
        return this.F0;
    }

    public final void i(int i, Bundle bundle) {
        ((we1) this.o.getValue()).g(i);
    }

    public final ViewPager2 l0() {
        return (ViewPager2) this.w0.T0(this, G0[3]);
    }

    public final e71 m0() {
        return (e71) this.c.getValue();
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [rr3, one.me.calllist.ui.CallHistoryScreen] */
    public final void onAttach(View view) {
        Object value;
        CallHistoryScreen.super.onAttach(view);
        e71 m0 = m0();
        grd grd = m0.x0;
        do {
            value = grd.getValue();
        } while (!grd.b(value, sp1.a((sp1) value, (List) null, false, !((qna) m0.X.getValue()).b(qna.h), 3)));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        nea nea = new nea(linearLayout.getContext(), 6);
        nea.setId(i1a.j);
        nea.setForm(fea.b);
        nea.setTitle(ctb.call_history_call_title);
        nea.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        linearLayout.addView(nea);
        CoordinatorLayout coordinatorLayout = new CoordinatorLayout(linearLayout.getContext(), (AttributeSet) null);
        coordinatorLayout.setId(i1a.h);
        coordinatorLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        fm fmVar = new fm(coordinatorLayout.getContext());
        fmVar.setElevation(dh4.c().getDisplayMetrics().density * 0.0f);
        fmVar.setLayoutParams(new nt3(-1, -2));
        fmVar.setBackground((Drawable) null);
        n23 n23 = new n23(fmVar.getContext());
        n23.setTitleEnabled(false);
        dm dmVar = new dm(-1, -2);
        dmVar.a = 3;
        n23.setLayoutParams(dmVar);
        LinearLayout linearLayout2 = new LinearLayout(n23.getContext());
        linearLayout2.setOrientation(1);
        n2a n2a = new n2a(linearLayout2.getContext(), (AttributeSet) null);
        n2a.setId(i1a.f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        float f = (float) 12;
        layoutParams.setMarginStart(a24.X(dh4.c().getDisplayMetrics().density * f));
        layoutParams.setMarginEnd(a24.X(dh4.c().getDisplayMetrics().density * f));
        layoutParams.bottomMargin = a24.X(f * dh4.c().getDisplayMetrics().density);
        n2a.setLayoutParams(layoutParams);
        n2a.setTitle(n2a.getContext().getString(j1a.d));
        n2a.setSubtitle(n2a.getContext().getString(j1a.c));
        float f2 = (float) 24;
        n2a.x(gq3.b(n2a.getContext(), phc.W0), a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(f2 * dh4.c().getDisplayMetrics().density));
        n2a.V0.setColors(H0, new float[]{0.0f, 1.0f});
        a24.Z(n2a, 300, new x61(this, 1));
        linearLayout2.addView(n2a);
        hx0 hx0 = new hx0(linearLayout2.getContext(), (AttributeSet) null);
        float f3 = (float) 16;
        float f4 = (float) 0;
        hx0.setPadding(a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(dh4.c().getDisplayMetrics().density * f4), a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(dh4.c().getDisplayMetrics().density * f4));
        hx0.setId(i1a.g);
        hx0.setActionIcon(h1a.b);
        hx0.setActionText(ctb.call_history_call_contact_action);
        a24.Z(hx0, 300, new b20(2));
        float f5 = (float) 52;
        hx0.setLayoutParams(new LinearLayout.LayoutParams(-1, a24.X(dh4.c().getDisplayMetrics().density * f5)));
        linearLayout2.addView(hx0);
        hx0 hx02 = new hx0(linearLayout2.getContext(), (AttributeSet) null);
        hx02.setPadding(a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(dh4.c().getDisplayMetrics().density * f4), a24.X(f3 * dh4.c().getDisplayMetrics().density), a24.X(f4 * dh4.c().getDisplayMetrics().density));
        hx02.setId(i1a.i);
        hx02.setActionIcon(h1a.f);
        hx02.setActionText(ctb.call_history_call_create_group_call_by_link);
        a24.Z(hx02, 300, new x61(this, 0));
        hx02.setVisibility(8);
        hx02.setLayoutParams(new LinearLayout.LayoutParams(-1, a24.X(f5 * dh4.c().getDisplayMetrics().density)));
        linearLayout2.addView(hx02);
        linearLayout2.setLayoutParams(new k23(-1, -2));
        n23.addView(linearLayout2);
        fmVar.addView(n23);
        hda hda = new hda(fmVar.getContext(), (AttributeSet) null);
        hda.setId(sob.call_history_tabs);
        hda.setTabMode(0);
        hda.setLayoutParams(new dm(-1, -2));
        fmVar.addView(hda);
        fmVar.setStateListAnimator((StateListAnimator) null);
        coordinatorLayout.addView(fmVar);
        ViewPager2 viewPager2 = new ViewPager2(coordinatorLayout.getContext());
        viewPager2.setId(sob.call_history_pager);
        nt3 nt3 = new nt3(-1, -1);
        nt3.b(new AppBarLayout$ScrollingViewBehavior());
        viewPager2.setLayoutParams(nt3);
        swb.r(viewPager2);
        coordinatorLayout.addView(viewPager2);
        linearLayout.addView(coordinatorLayout);
        return linearLayout;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [rr3, one.me.sdk.arch.Widget, one.me.calllist.ui.CallHistoryScreen] */
    public final void onDestroyView(View view) {
        grd grd;
        Object value;
        CallHistoryScreen.super.onDestroyView(view);
        if (!requireActivity().isChangingConfigurations()) {
            l0().setAdapter((f6c) null);
            e71 m0 = m0();
            do {
                grd = m0.Z;
                value = grd.getValue();
                c71 c71 = (c71) value;
            } while (!grd.b(value, new c71()));
        }
        ur3 ur3 = this.D0;
        if (ur3 != null) {
            ur3.c();
        }
        this.D0 = null;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [rr3, one.me.sdk.arch.Widget, java.lang.Object, one.me.calllist.ui.CallHistoryScreen] */
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        CallHistoryScreen.super.onRequestPermissionsResult(i, strArr, iArr);
        if (!((we1) this.o.getValue()).b(i, strArr, iArr)) {
            if (i != 160 || !((qna) this.b.getValue()).b(strArr)) {
                for (int i2 : iArr) {
                    if (i2 == -1) {
                        new jrf(this, 0).g(j1a.b, j1a.a);
                        return;
                    }
                }
                return;
            }
            ((n2a) this.z0.T0(this, G0[6])).setVisibility(8);
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [f6c, p61] */
    public final void onViewCreated(View view) {
        CallHistoryScreen.super.onViewCreated(view);
        grd grd = m0().y0;
        ob7 ob7 = ob7.o;
        ez3.N(new ck5(wx3.e(grd, getViewLifecycleOwner().R(), ob7), new z61((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(m0().w0, getViewLifecycleOwner().R(), ob7), new a71((Continuation) null, this), 5), getViewLifecycleScope());
        l0().setAdapter(this.C0);
        l0().setOffscreenPageLimit(1);
        hda hda = (hda) this.Z.T0(this, G0[2]);
        ViewPager2 l0 = l0();
        f71 f71 = this.B0;
        f71.getClass();
        ur3 ur3 = new ur3(hda, l0, new j9(f71, 7, hda));
        ur3.a();
        this.D0 = ur3;
    }
}
