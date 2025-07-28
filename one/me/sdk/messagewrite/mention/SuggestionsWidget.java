package one.me.sdk.messagewrite.mention;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lone/me/sdk/messagewrite/mention/SuggestionsWidget;", "Lone/me/sdk/bottomsheet/BaseBottomSheetWidget;", "Lu2e;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Linc;", "scopeId", "(Ljava/lang/String;Lx54;)V", "message-write-widget_release"}, k = 1, mv = {2, 0, 0})
public final class SuggestionsWidget extends BaseBottomSheetWidget implements u2e {
    public static final /* synthetic */ k77[] F0;
    public final nl0 A0;
    public final nl0 B0;
    public final nl0 C0;
    public final nl0 D0;
    public final nl0 E0;
    public final t97 w0;
    public final n0c x0;
    public final t97 y0;
    public final nl0 z0;

    static {
        Class<SuggestionsWidget> cls = SuggestionsWidget.class;
        F0 = new k77[]{new hc9(cls, "parentScopeId", "getParentScopeId-IluPPks()Ljava/lang/String;"), m4b.g(m7c.a, cls, "suggestionsContainer", "getSuggestionsContainer()Landroidx/constraintlayout/widget/ConstraintLayout;", 0), new khb(cls, "dragView", "getDragView()Landroid/widget/FrameLayout;", 0), new khb(cls, "suggestionsRecyclerView", "getSuggestionsRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView;", 0), new khb(cls, "closeView", "getCloseView()Landroidx/appcompat/widget/AppCompatImageView;", 0), new khb(cls, "titleView", "getTitleView()Landroidx/appcompat/widget/AppCompatTextView;", 0), new khb(cls, "closePanelView", "getClosePanelView()Landroid/widget/FrameLayout;", 0), new khb(cls, "notFoundView", "getNotFoundView()Landroidx/appcompat/widget/AppCompatTextView;", 0)};
    }

    public SuggestionsWidget(String str, x54 x54) {
        this(jjd.j(new wia[]{new wia(Widget.ARG_SCOPE_ID, new inc(str))}));
    }

    public final e3e A0() {
        return (e3e) this.w0.getValue();
    }

    public final void B0() {
        Object value;
        grd grd = A0().M0;
        do {
            value = grd.getValue();
            x2e x2e = (x2e) value;
        } while (!grd.b(value, (Object) null));
        r0(true);
    }

    public final boolean handleBack() {
        B0();
        return true;
    }

    public final t0b m0() {
        return new x9(this, 6);
    }

    public final sy6 n0() {
        return new sy6(0, new up0(1, 3, false), 1);
    }

    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        z0().setAdapter((f6c) null);
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        z0().setAdapter((v2e) this.y0.getValue());
        ez3.N(new ck5(A0().H0, new g3e(this, (Continuation) null), 5), getViewLifecycleScope());
        urd.B(new wua((Object) this, (Continuation) null, 18), view);
    }

    /* JADX WARNING: type inference failed for: r12v4, types: [android.view.View, ty4] */
    /* JADX WARNING: type inference failed for: r1v12, types: [android.view.View, ty4] */
    public final void v0(FrameLayout frameLayout, LayoutInflater layoutInflater, Bundle bundle) {
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.addView(x0());
        ConstraintLayout constraintLayout = new ConstraintLayout(layoutInflater.getContext());
        constraintLayout.setId(y9a.E);
        constraintLayout.addView(w0(), -1, -2);
        constraintLayout.addView(z0());
        constraintLayout.addView(y0());
        bf3 p = a06.p(constraintLayout);
        int id = x0().getId();
        p.d(id, 3, 0, 3);
        p.d(id, 6, 0, 6);
        p.d(id, 7, 0, 7);
        int id2 = w0().getId();
        p.d(id2, 3, 0, 3);
        p.d(id2, 7, 0, 7);
        float f = (float) 8;
        hr1.q(f, dh4.c().getDisplayMetrics().density, new hw9(p, 7, id2, 4));
        p.d(id2, 6, 0, 6);
        new hw9(p, 6, id2, 4).e(a24.X(dh4.c().getDisplayMetrics().density * f));
        int id3 = y0().getId();
        p.d(id3, 3, w0().getId(), 4);
        hr1.q(f, dh4.c().getDisplayMetrics().density, new hw9(p, 3, id3, 4));
        p.d(id3, 6, 0, 6);
        int id4 = z0().getId();
        p.d(id4, 3, w0().getId(), 4);
        hr1.q((float) 20, dh4.c().getDisplayMetrics().density, new hw9(p, 3, id4, 4));
        p.d(id4, 7, 0, 7);
        p.d(id4, 6, 0, 6);
        p.d(id4, 4, 0, 4);
        p.g(id4).d.m0 = true;
        p.g(id4).d.x = 0.0f;
        p.a(constraintLayout);
        frameLayout.addView(constraintLayout, -1, -1);
    }

    public final FrameLayout w0() {
        k77 k77 = F0[6];
        return (FrameLayout) this.D0.getValue();
    }

    public final FrameLayout x0() {
        k77 k77 = F0[2];
        return (FrameLayout) this.z0.getValue();
    }

    public final AppCompatTextView y0() {
        k77 k77 = F0[7];
        return (AppCompatTextView) this.E0.getValue();
    }

    public final ty4 z0() {
        k77 k77 = F0[3];
        return (ty4) this.A0.getValue();
    }

    public SuggestionsWidget(Bundle bundle) {
        super(bundle);
        jr jrVar = new jr(inc.class, Widget.ARG_SCOPE_ID);
        k77 k77 = F0[0];
        this.w0 = m25getSharedViewModelcp94BC8(((inc) jrVar.a(this)).a, e3e.class, (s16) null);
        this.x0 = viewBinding(y9a.E);
        this.y0 = ez3.O(3, new f3e(this, 0));
        this.z0 = binding(new f3e(this, 1));
        this.A0 = binding(new f3e(this, 2));
        this.B0 = binding(new f3e(this, 3));
        this.C0 = binding(new f3e(this, 4));
        this.D0 = binding(new f3e(this, 5));
        this.E0 = binding(new f3e(this, 6));
        u0(false);
    }
}
