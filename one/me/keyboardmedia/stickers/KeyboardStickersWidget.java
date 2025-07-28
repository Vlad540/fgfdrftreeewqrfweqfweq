package one.me.keyboardmedia.stickers;

import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\f"}, d2 = {"Lone/me/keyboardmedia/stickers/KeyboardStickersWidget;", "Lone/me/sdk/arch/Widget;", "Llc3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "chatId", "Linc;", "scopeId", "(JLjava/lang/String;Lx54;)V", "keyboard-media_release"}, k = 1, mv = {2, 0, 0})
public final class KeyboardStickersWidget extends Widget implements lc3 {
    public static final /* synthetic */ k77[] x0;
    public final n0c X;
    public final fv4 Y;
    public final xud Z;
    public final t97 a;
    public final t97 b;
    public er7 c;
    public final n0c o;
    public final kx1 w0;

    static {
        Class<KeyboardStickersWidget> cls = KeyboardStickersWidget.class;
        x0 = new k77[]{new khb(cls, "contentRecyclerView", "getContentRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0), wn6.e(m7c.a, cls, "stickersTabsRecyclerView", "getStickersTabsRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0)};
    }

    public KeyboardStickersWidget(Bundle bundle) {
        super(bundle, 0, 2, (x54) null);
        Class<lyd> cls = lyd.class;
        this.a = createViewModelLazy(cls, new js5(9, new fe2(bundle, 4)));
        this.b = m25getSharedViewModelcp94BC8(bundle.getString(Widget.ARG_SCOPE_ID), u68.class, (s16) null);
        this.o = viewBinding(x5a.n);
        this.X = viewBinding(x5a.o);
        t77 t77 = t77.a;
        Class<x4a> cls2 = x4a.class;
        this.Y = new fv4(((x4a) t77.getAccessor().c(cls2)).a(), new gw2(22, this), (byte) 0);
        xud xud = new xud(((x4a) t77.getAccessor().c(cls2)).a(), new k87(this, bundle));
        this.Z = xud;
        lyd n0 = n0();
        n0.getClass();
        udd.q(cls.getName(), "loadStickers");
        rn1 c2 = am7.c(((zsd) n0.c.getValue()).a());
        rn1 c3 = am7.c(((fa5) n0.X.getValue()).a());
        jk0 jk0 = ((l95) n0.Y.getValue()).w0;
        jk0.getClass();
        rn1 c4 = am7.c(new au9(new it9(jk0, 0), new g95(24), 3));
        wed wed = (wed) n0.Z.getValue();
        ez3.N(ez3.J(new ck5(ez3.r(c2, c3, c4, new v11(new w09(am7.c(((zsd) wed.a.getValue()).l), wed, 8), ((lwd) wed.b.getValue()).e, ved.w0, 4), new l5e(5, (Continuation) null)), new gyd(n0, (Continuation) null), 5), n0.b.b()), n0.a);
        ez3.N(new ck5(n0().y0, new g87(this, (Continuation) null), 5), getLifecycleScope());
        this.w0 = new kx1(xud, new h87(1, n0(), lyd.class, "onNewItemInFocus", "onNewItemInFocus(Lone/me/sdk/lists/adapter/ListItem;)V", 0, 0));
    }

    public final void i(int i, Bundle bundle) {
        if (i == x5a.g) {
            lyd n0 = n0();
            qod D = xs7.D(n0.a, n0.b.b(), ru3.b, new hyd(n0, (Continuation) null));
            n0.E0.o1(n0, lyd.F0[2], D);
        }
    }

    public final EndlessRecyclerView2 l0() {
        return (EndlessRecyclerView2) this.o.T0(this, x0[0]);
    }

    public final RecyclerView m0() {
        return (RecyclerView) this.X.T0(this, x0[1]);
    }

    public final lyd n0() {
        return (lyd) this.a.getValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(x5a.l);
        int X2 = a24.X(((float) 44) * dh4.c().getDisplayMetrics().density);
        RecyclerView recyclerView = new RecyclerView(frameLayout.getContext(), (AttributeSet) null);
        recyclerView.setId(x5a.o);
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, X2));
        int X3 = a24.X(((float) 4) * dh4.c().getDisplayMetrics().density);
        int X4 = a24.X(((float) 8) * dh4.c().getDisplayMetrics().density);
        recyclerView.setPadding(X4, X3, X4, X3);
        recyclerView.setClipToPadding(false);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setItemAnimator((k6c) null);
        urd.B(new w77(3, (Continuation) null, 2), recyclerView);
        frameLayout.addView(recyclerView);
        RecyclerView endlessRecyclerView2 = new EndlessRecyclerView2(frameLayout.getContext(), (AttributeSet) null, 6);
        endlessRecyclerView2.setId(x5a.n);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = X2;
        endlessRecyclerView2.setLayoutParams(layoutParams);
        urd.B(new pf0(3, (Continuation) null, 7), endlessRecyclerView2);
        endlessRecyclerView2.setClipToPadding(false);
        endlessRecyclerView2.setClipChildren(false);
        int X5 = a24.X(((float) 12) * dh4.c().getDisplayMetrics().density);
        endlessRecyclerView2.setPadding(X5, endlessRecyclerView2.getPaddingTop(), X5, a24.X(((float) 48) * dh4.c().getDisplayMetrics().density));
        frameLayout.addView(endlessRecyclerView2);
        return frameLayout;
    }

    public final void onDestroyView(View view) {
        l0().setAdapter((f6c) null);
        l0().s0(this.w0);
        m0().setAdapter((f6c) null);
    }

    public final void onViewCreated(View view) {
        m0().setAdapter(this.Y);
        m0().j(new n51(a24.X(((float) 2) * dh4.c().getDisplayMetrics().density), 3));
        RecyclerView l0 = l0();
        er7 er7 = this.c;
        xud xud = this.Z;
        xud.Z = er7;
        int t = gp0.t(l0.getContext());
        l0.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(t);
        gridLayoutManager.K = new v77(gridLayoutManager, xud);
        l0.setLayoutManager(gridLayoutManager);
        l0.j(new ix0(t, a24.X(((float) 4) * dh4.c().getDisplayMetrics().density), 7));
        l0.m(this.w0);
        l0.m(new my4(2, this));
        l0.k(new i87(0, this));
        l0.setAdapter(xud);
        ez3.N(new ck5(n0().B0, new j87(this, (Continuation) null), 5), getViewLifecycleScope());
    }

    public KeyboardStickersWidget(long j, String str, x54 x54) {
        this(jjd.j(new wia[]{new wia("arg_key_chat_id", Long.valueOf(j)), new wia(Widget.ARG_SCOPE_ID, str)}));
    }
}
