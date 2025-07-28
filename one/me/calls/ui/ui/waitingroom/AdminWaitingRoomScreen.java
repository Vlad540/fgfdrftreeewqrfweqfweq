package one.me.calls.ui.ui.waitingroom;

import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lone/me/calls/ui/ui/waitingroom/AdminWaitingRoomScreen;", "Lone/me/sdk/arch/Widget;", "Ldk9;", "<init>", "()V", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
public final class AdminWaitingRoomScreen extends Widget implements dk9 {
    public static final /* synthetic */ k77[] w0;
    public final n0c X = viewBinding(o1a.I0);
    public final n0c Y = viewBinding(o1a.F0);
    public final cpf Z = new cpf(new pa(this), ((x4a) bh1.a.getAccessor().c(x4a.class)).a(), 1);
    public final t97 a = createViewModelLazy(sa.class, new s(3, new m(3)));
    public final n0c b = viewBinding(o1a.J0);
    public final n0c c = viewBinding(o1a.G0);
    public final n0c o = viewBinding(o1a.E0);

    static {
        Class<AdminWaitingRoomScreen> cls = AdminWaitingRoomScreen.class;
        khb khb = new khb(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0);
        n7c n7c = m7c.a;
        w0 = new k77[]{khb, wn6.e(n7c, cls, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0), wn6.f(cls, "applyAllButton", "getApplyAllButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0, n7c), wn6.f(cls, "rejectAllButton", "getRejectAllButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0, n7c), wn6.f(cls, "emptyView", "getEmptyView()Lone/me/sdk/uikit/common/emptyview/OneMeEmptyView;", 0, n7c)};
    }

    public AdminWaitingRoomScreen() {
        super((Bundle) null, 0, 3, (x54) null);
    }

    public final sy6 getInsetsConfig() {
        sy6 sy6 = sy6.c;
        return sy6.d;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayout = new ConstraintLayout(layoutInflater.getContext());
        qda qda = qda.a;
        constraintLayout.setBackgroundColor(-15263716);
        nea nea = new nea(getContext(), 6);
        nea.setId(o1a.J0);
        nea.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        nea.setCustomTheme(qda);
        nea.setTitle(r1a.O0);
        nea.setSubtitle(r1a.V1);
        nea.setForm(fea.a);
        nea.setLeftActions(new vda(new l(4, this)));
        RecyclerView recyclerView = new RecyclerView(getContext(), (AttributeSet) null);
        recyclerView.setId(o1a.G0);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, 0));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.Z);
        recyclerView.setItemAnimator((k6c) null);
        OneMeButton oneMeButton = new OneMeButton(getContext(), (AttributeSet) null);
        oneMeButton.setId(o1a.E0);
        oneMeButton.setCustomTheme(qda);
        v0a v0a = v0a.c;
        oneMeButton.setSize(v0a);
        oneMeButton.setMode(u0a.a);
        oneMeButton.setAppearance(s0a.o);
        oneMeButton.setText(r1a.J0);
        a24.Z(oneMeButton, 300, new na(this, 0));
        oneMeButton.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        OneMeButton oneMeButton2 = new OneMeButton(getContext(), (AttributeSet) null);
        oneMeButton2.setId(o1a.I0);
        oneMeButton2.setCustomTheme(qda);
        oneMeButton2.setSize(v0a);
        oneMeButton2.setMode(u0a.b);
        oneMeButton2.setAppearance(s0a.c);
        oneMeButton2.setText(r1a.N0);
        a24.Z(oneMeButton2, 300, new na(this, 1));
        oneMeButton2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        p4a p4a = new p4a(getContext(), (AttributeSet) null);
        p4a.setId(o1a.F0);
        p4a.setIcon(n1a.G0);
        p4a.setTitle(new hge(r1a.M0));
        p4a.setSubtitle(new hge(r1a.L0));
        p4a.x(p4a.getContext().getString(r1a.K0), new na(this, 2));
        p4a.setCustomTheme(qda);
        p4a.setLayoutParams(new ViewGroup.LayoutParams(-1, 0));
        p4a.setVisibility(8);
        constraintLayout.addView(nea);
        constraintLayout.addView(p4a);
        constraintLayout.addView(recyclerView);
        constraintLayout.addView(oneMeButton);
        constraintLayout.addView(oneMeButton2);
        bf3 p = a06.p(constraintLayout);
        int id = nea.getId();
        p.d(id, 6, 0, 6);
        p.d(id, 3, 0, 3);
        p.d(id, 7, 0, 7);
        int id2 = recyclerView.getId();
        p.d(id2, 3, nea.getId(), 4);
        p.d(id2, 6, 0, 6);
        p.d(id2, 7, 0, 7);
        p.d(id2, 4, oneMeButton.getId(), 3);
        int id3 = p4a.getId();
        p.d(id3, 3, nea.getId(), 4);
        p.d(id3, 6, 0, 6);
        p.d(id3, 7, 0, 7);
        p.d(id3, 4, 0, 4);
        int id4 = oneMeButton.getId();
        p.d(id4, 6, oneMeButton2.getId(), 6);
        float f = (float) 12;
        new hw9(p, 6, id4, 4).e(a24.X(dh4.c().getDisplayMetrics().density * f));
        p.d(id4, 7, oneMeButton2.getId(), 7);
        new hw9(p, 7, id4, 4).e(a24.X(dh4.c().getDisplayMetrics().density * f));
        p.d(id4, 4, oneMeButton2.getId(), 3);
        new hw9(p, 4, id4, 4).e(a24.X(dh4.c().getDisplayMetrics().density * f));
        int id5 = oneMeButton2.getId();
        p.d(id5, 6, 0, 6);
        hr1.q(f, dh4.c().getDisplayMetrics().density, new hw9(p, 6, id5, 4));
        p.d(id5, 7, 0, 7);
        hr1.q(f, dh4.c().getDisplayMetrics().density, new hw9(p, 7, id5, 4));
        p.d(id5, 4, 0, 4);
        new hw9(p, 4, id5, 4).e(a24.X(f * dh4.c().getDisplayMetrics().density));
        p.a(constraintLayout);
        return constraintLayout;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [rr3, one.me.calls.ui.ui.waitingroom.AdminWaitingRoomScreen, java.lang.Object] */
    public final void onDestroyView(View view) {
        ((RecyclerView) this.c.T0(this, w0[1])).setAdapter((f6c) null);
        AdminWaitingRoomScreen.super.onDestroyView(view);
    }

    public final void onViewCreated(View view) {
        AdminWaitingRoomScreen.super.onViewCreated(view);
        ez3.N(new ck5(((sa) this.a.getValue()).X, new oa(this, (Continuation) null), 5), getLifecycleScope());
    }
}
