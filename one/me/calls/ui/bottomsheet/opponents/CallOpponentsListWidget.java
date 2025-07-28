package one.me.calls.ui.bottomsheet.opponents;

import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lone/me/calls/ui/bottomsheet/opponents/CallOpponentsListWidget;", "Lone/me/sdk/arch/Widget;", "Ltq3;", "Lzk1;", "Ldk9;", "<init>", "()V", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
public final class CallOpponentsListWidget extends Widget implements tq3, zk1, dk9 {
    public static final /* synthetic */ k77[] L0;
    public final nl0 A0;
    public final nl0 B0;
    public final nl0 C0;
    public final n0c D0;
    public final nl0 E0;
    public final nl0 F0;
    public final nl0 G0;
    public final r7e H0;
    public final cpf I0;
    public final nl0 J0;
    public final jj7 K0;
    public final t97 X;
    public final t97 Y;
    public final nl0 Z;
    public final t97 a = ez3.O(3, new a01(20));
    public final t97 b;
    public final t97 c;
    public final t97 o;
    public final t97 w0;
    public final nl0 x0;
    public final nl0 y0;
    public final nl0 z0;

    static {
        Class<CallOpponentsListWidget> cls = CallOpponentsListWidget.class;
        khb khb = new khb(cls, "collapsibleHeaderContainer", "getCollapsibleHeaderContainer()Landroid/widget/LinearLayout;", 0);
        n7c n7c = m7c.a;
        L0 = new k77[]{khb, wn6.e(n7c, cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), wn6.f(cls, "oneMeButtonToolStack", "getOneMeButtonToolStack()Lone/me/sdk/uikit/common/buttonstack/OneMeButtonToolStack;", 0, n7c), wn6.f(cls, "opponentsListView", "getOpponentsListView()Landroidx/recyclerview/widget/RecyclerView;", 0, n7c), wn6.f(cls, "titleView", "getTitleView()Landroid/widget/TextView;", 0, n7c), wn6.f(cls, "subtitleView", "getSubtitleView()Landroid/widget/TextView;", 0, n7c), wn6.f(cls, "titleOpponentListView", "getTitleOpponentListView()Landroid/widget/TextView;", 0, n7c), wn6.f(cls, "titleWaitingListView", "getTitleWaitingListView()Landroid/widget/TextView;", 0, n7c), wn6.f(cls, "searchView", "getSearchView()Landroid/widget/EditText;", 0, n7c), wn6.f(cls, "emptyStateViewStub", "getEmptyStateViewStub()Landroid/view/ViewStub;", 0, n7c), wn6.f(cls, "emptyStateView", "getEmptyStateView()Lone/me/sdk/uikit/common/emptyview/OneMeEmptyView;", 0, n7c), wn6.f(cls, "appBarLayoutView", "getAppBarLayoutView()Lcom/google/android/material/appbar/AppBarLayout;", 0, n7c)};
    }

    public CallOpponentsListWidget() {
        super((Bundle) null, 0, 3, (x54) null);
        bh1 bh1 = bh1.a;
        this.b = bh1.getAccessor().d(xk1.class);
        this.c = ez3.O(3, new ud1(this, 1));
        this.o = ez3.O(3, new a01(19));
        this.X = ez3.O(3, new ud1(this, 2));
        this.Y = createViewModelLazy(td1.class, new s(16, new ud1(this, 3)));
        this.Z = binding(new ud1(this, 4));
        this.w0 = ez3.O(3, new ud1(this, 5));
        this.x0 = binding(new ud1(this, 6));
        this.y0 = binding(new ud1(this, 7));
        this.z0 = binding(new ud1(this, 8));
        this.A0 = binding(new ud1(this, 10));
        this.B0 = binding(new ud1(this, 11));
        this.C0 = binding(new ud1(this, 12));
        this.D0 = viewBinding(o1a.J0);
        this.E0 = binding(new ud1(this, 13));
        this.F0 = binding(new ud1(this, 14));
        this.G0 = binding(new ud1(this, 15));
        this.H0 = new r7e(new ud1(this, 16));
        this.I0 = new cpf(new lv1(6, this), ((x4a) bh1.getAccessor().c(x4a.class)).a(), 1);
        this.J0 = binding(new ud1(this, 0));
        this.K0 = new jj7((s16) new a01(18), (s16) null, 6);
    }

    public final sy6 getInsetsConfig() {
        sy6 sy6 = sy6.c;
        return sy6.d;
    }

    public final rnc getScreenDelegate() {
        return this.K0;
    }

    public final fm l0() {
        k77 k77 = L0[11];
        return (fm) this.J0.getValue();
    }

    public final LinearLayout m0() {
        k77 k77 = L0[0];
        return (LinearLayout) this.Z.getValue();
    }

    public final EditText n0() {
        k77 k77 = L0[8];
        return (EditText) this.E0.getValue();
    }

    public final nea o0() {
        k77 k77 = L0[1];
        return (nea) this.x0.getValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ka kaVar = new ka(this, 2, layoutInflater);
        CoordinatorLayout coordinatorLayout = new CoordinatorLayout(getContext(), (AttributeSet) null);
        coordinatorLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        coordinatorLayout.setBackgroundColor(-15263716);
        kaVar.invoke(coordinatorLayout);
        return coordinatorLayout;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [rr3, java.lang.Object, one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget] */
    public final void onDestroyView(View view) {
        CallOpponentsListWidget.super.onDestroyView(view);
        bm3.r(n0());
        n0().clearFocus();
        p0().D0.a.remove(this);
        td1 p0 = p0();
        yl1 yl1 = p0.b;
        yl1.getClass();
        g37 g37 = (g37) yl1.h.T0(yl1, yl1.k[0]);
        if (g37 != null) {
            g37.cancel((CancellationException) null);
        }
        ((ep1) ((so1) p0.x0.getValue())).G.remove(p0);
    }

    public final void onViewCreated(View view) {
        CallOpponentsListWidget.super.onViewCreated(view);
        n0().clearFocus();
        l0().requestFocus();
        al1 al1 = p0().D0;
        al1.a.add(this);
        x(al1.b);
        l0().a(am7.F(new db1(new p85(), this, 1), l0(), getViewLifecycleOwner()));
        t0c t0c = p0().F0;
        ob7 ob7 = ob7.o;
        ez3.N(new ck5(wx3.e(t0c, getViewLifecycleOwner().R(), ob7), new xd1((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(p0().C0, getViewLifecycleOwner().R(), ob7), new yd1((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(p0().G0, getViewLifecycleOwner().R(), ob7), new zd1((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final td1 p0() {
        return (td1) this.Y.getValue();
    }

    public final void x(yk1 yk1) {
        k77 k77 = L0[5];
        ((TextView) this.B0.getValue()).setText(yk1 != null ? yk1.c : null);
    }

    public final void y(int i, Bundle bundle) {
        p0().b.b(i, bundle);
    }
}
