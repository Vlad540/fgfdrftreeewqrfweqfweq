package one.me.keyboardmedia.emoji;

import android.os.Bundle;
import android.os.Parcelable;
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

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/keyboardmedia/emoji/KeyboardEmojiWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Linc;", "scopeId", "(Ljava/lang/String;Lx54;)V", "keyboard-media_release"}, k = 1, mv = {2, 0, 0})
public final class KeyboardEmojiWidget extends Widget {
    public static final /* synthetic */ k77[] w0;
    public final mr5 X;
    public final fv4 Y;
    public final kx1 Z;
    public final t97 a;
    public final t97 b;
    public final n0c c;
    public final n0c o;

    static {
        Class<KeyboardEmojiWidget> cls = KeyboardEmojiWidget.class;
        w0 = new k77[]{new khb(cls, "contentRecyclerView", "getContentRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0), wn6.e(m7c.a, cls, "tabsRecyclerView", "getTabsRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0)};
    }

    public KeyboardEmojiWidget(String str, x54 x54) {
        this(jjd.j(new wia("arg_key_scope_id", new inc(str))));
    }

    public final RecyclerView l0() {
        return (RecyclerView) this.c.T0(this, w0[0]);
    }

    public final RecyclerView m0() {
        return (RecyclerView) this.o.T0(this, w0[1]);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(x5a.b);
        int X2 = a24.X(((float) 44) * dh4.c().getDisplayMetrics().density);
        RecyclerView recyclerView = new RecyclerView(frameLayout.getContext(), (AttributeSet) null);
        recyclerView.setId(x5a.d);
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, X2));
        int X3 = a24.X(((float) 4) * dh4.c().getDisplayMetrics().density);
        int X4 = a24.X(((float) 8) * dh4.c().getDisplayMetrics().density);
        recyclerView.setPadding(X4, X3, X4, X3);
        recyclerView.setClipToPadding(false);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setNestedScrollingEnabled(false);
        urd.B(new w77(3, (Continuation) null, 0), recyclerView);
        frameLayout.addView(recyclerView);
        RecyclerView recyclerView2 = new RecyclerView(frameLayout.getContext(), (AttributeSet) null);
        recyclerView2.setId(x5a.c);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = X2;
        recyclerView2.setLayoutParams(layoutParams);
        urd.B(new w77(3, (Continuation) null, 1), recyclerView2);
        recyclerView2.setClipToPadding(false);
        recyclerView2.setClipChildren(false);
        recyclerView2.setItemAnimator((k6c) null);
        int X5 = a24.X(((float) 12) * dh4.c().getDisplayMetrics().density);
        recyclerView2.setPadding(X5, recyclerView2.getPaddingTop(), X5, a24.X(((float) 48) * dh4.c().getDisplayMetrics().density));
        frameLayout.addView(recyclerView2);
        return frameLayout;
    }

    public final void onDestroyView(View view) {
        l0().setAdapter((f6c) null);
        l0().s0(this.Z);
        m0().setAdapter((f6c) null);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [f6c, fv4] */
    /* JADX WARNING: type inference failed for: r0v11, types: [mr5, f6c] */
    public final void onViewCreated(View view) {
        m0().setAdapter(this.Y);
        m0().j(new n51(a24.X(((float) 2) * dh4.c().getDisplayMetrics().density), 3));
        RecyclerView l0 = l0();
        int X2 = a24.X(((float) 32) * dh4.c().getDisplayMetrics().density);
        int X3 = a24.X(((float) 12) * dh4.c().getDisplayMetrics().density);
        int X4 = a24.X(((float) 11) * dh4.c().getDisplayMetrics().density);
        int i = (l0.getContext().getResources().getDisplayMetrics().widthPixels - (X3 * 2)) / (X2 + X4);
        if (i < 1) {
            i = 1;
        }
        v77 v77 = new v77(this, l0);
        l0.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(i);
        gridLayoutManager.K = v77;
        l0.setLayoutManager(gridLayoutManager);
        l0.m(this.Z);
        l0.j(new ix0(i, X4, 1));
        l0.setAdapter(this.X);
        ez3.N(new ck5(((uv4) this.a.getValue()).Z, new x77(this, (Continuation) null), 5), getViewLifecycleScope());
    }

    public KeyboardEmojiWidget(Bundle bundle) {
        super(bundle, 0, 2, (x54) null);
        t97 createViewModelLazy = createViewModelLazy(uv4.class, new js5(8, new fs5(27)));
        this.a = createViewModelLazy;
        Class<inc> cls = inc.class;
        Object E = ek8.E(bundle, "arg_key_scope_id", cls);
        if (E != null) {
            this.b = getSharedViewModel-cp94BC8(((Parcelable) E).a, u68.class, (s16) null);
            this.c = viewBinding(x5a.c);
            this.o = viewBinding(x5a.d);
            t77 t77 = t77.a;
            Class<x4a> cls2 = x4a.class;
            mr5 mr5 = new mr5(((x4a) t77.getAccessor().c(cls2)).a(), (Object) new u5g(16, (Object) this), 6);
            this.X = mr5;
            this.Y = new fv4(((x4a) t77.getAccessor().c(cls2)).a(), new gw2(21, this));
            this.Z = new kx1(mr5, new f(1, (uv4) createViewModelLazy.getValue(), uv4.class, "onNewItemInFocus", "onNewItemInFocus(Lone/me/sdk/lists/adapter/ListItem;)V", 0, 29));
            ez3.N(new ck5(((uv4) createViewModelLazy.getValue()).y0, new u77(this, (Continuation) null), 5), getLifecycleScope());
            return;
        }
        throw new IllegalArgumentException(wn6.i("No value passed for key arg_key_scope_id of type ", cls.getSimpleName(), " in bundle").toString());
    }
}
