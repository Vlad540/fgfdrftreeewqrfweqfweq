package one.me.sdk.bottomsheet;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.webapp.rootscreen.WebAppRootScreen;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lone/me/sdk/bottomsheet/BaseBottomSheetWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "bqc", "x9", "bottom-sheet_release"}, k = 1, mv = {2, 0, 0})
public abstract class BaseBottomSheetWidget extends Widget {
    public static final bqc X = new Object();
    public static final /* synthetic */ k77[] Y;
    public static final String Z = "need_dim";
    public z0b a;
    public final jr b;
    public final n0c c;
    public final sy6 o;

    /* JADX WARNING: type inference failed for: r0v2, types: [bqc, java.lang.Object] */
    static {
        Class<BaseBottomSheetWidget> cls = BaseBottomSheetWidget.class;
        Y = new k77[]{new hc9(cls, "needDim", "getNeedDim()Z"), m4b.g(m7c.a, cls, "cardView", "getCardView()Landroid/view/View;", 0)};
    }

    public BaseBottomSheetWidget() {
        this((Bundle) null, 1, (x54) null);
    }

    public boolean handleBack() {
        r0(true);
        return true;
    }

    public boolean isDialog() {
        return !(this instanceof WebAppRootScreen);
    }

    public FrameLayout l0(LayoutInflater layoutInflater, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(h9a.b);
        frameLayout.setClipToPadding(false);
        frameLayout.setOutlineProvider(new tp0(1, dh4.c().getDisplayMetrics().density * 20.0f));
        v0(frameLayout, layoutInflater, bundle);
        urd.B(new z9((Object) this, (Continuation) null, 1), frameLayout);
        return frameLayout;
    }

    public t0b m0() {
        return new x9(this, 1);
    }

    public sy6 n0() {
        return this.o;
    }

    public final View o0() {
        return (View) this.c.T0(this, Y[1]);
    }

    public void onAttach(View view) {
        BaseBottomSheetWidget.super.onAttach(view);
        z0b z0b = this.a;
        if (z0b != null && z0b.getScrollState() == x0b.a) {
            afa.a(z0b, new re(4, z0b, z0b));
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        z0b z0b = new z0b(layoutInflater.getContext());
        z0b.setId(h9a.a);
        FrameLayout l0 = l0(layoutInflater, bundle);
        ViewGroup.LayoutParams layoutParams = l0.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        z0b.addView(l0, layoutParams);
        z0b.setCallback(m0());
        ek8.g(l0, n0(), (u16) null);
        urd.B(new c3(this, (Continuation) null, 2), z0b);
        this.a = z0b;
        return z0b;
    }

    public void onDestroyView(View view) {
        z0b z0b = this.a;
        if (z0b != null) {
            z0b.setCallback((t0b) null);
        }
        z0b z0b2 = this.a;
        if (z0b2 != null) {
            ValueAnimator valueAnimator = z0b2.w0;
            if (valueAnimator != null) {
                vx3.f(valueAnimator);
            }
            z0b2.w0 = null;
        }
        this.a = null;
        BaseBottomSheetWidget.super.onDestroyView(view);
    }

    public pda p0() {
        return null;
    }

    public boolean q0() {
        return true;
    }

    public final void r0(boolean z) {
        z0b z0b = this.a;
        if (z0b == null) {
            s0();
        } else if (z0b.getScrollState() != x0b.a) {
            t0();
            z0b.j(z);
        }
    }

    public void s0() {
        t0();
        getRouter().B(this);
    }

    public void t0() {
    }

    public final void u0(boolean z) {
        k77 k77 = Y[0];
        this.b.b(this, Boolean.valueOf(z));
    }

    public abstract void v0(FrameLayout frameLayout, LayoutInflater layoutInflater, Bundle bundle);

    public BaseBottomSheetWidget(Bundle bundle) {
        super(bundle, 0, 2, (x54) null);
        this.b = new jr(Boolean.class, Boolean.TRUE, Z);
        this.c = viewBinding(h9a.b);
        this.o = new sy6(5, new up0(3, 3, false));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BaseBottomSheetWidget(Bundle bundle, int i, x54 x54) {
        this((i & 1) != 0 ? null : bundle);
    }
}
