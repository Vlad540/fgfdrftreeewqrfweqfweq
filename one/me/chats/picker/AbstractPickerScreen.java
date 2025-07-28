package one.me.chats.picker;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import defpackage.mua;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lone/me/chats/picker/AbstractPickerScreen;", "Lmua;", "T", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "chats-list_release"}, k = 1, mv = {2, 0, 0})
public abstract class AbstractPickerScreen<T extends mua> extends Widget {
    public static final /* synthetic */ k77[] w0;
    public final nl0 X;
    public final n0c Y;
    public final n0c Z;
    public final sy6 a = sy6.d;
    public final String b = "PickerScreen";
    public final t97 c;
    public final nl0 o;

    static {
        Class<AbstractPickerScreen> cls = AbstractPickerScreen.class;
        khb khb = new khb(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0);
        n7c n7c = m7c.a;
        w0 = new k77[]{khb, wn6.e(n7c, cls, "chips", "getChips()Lone/me/sdk/uikit/common/views/OneMeContactsChipGroup;", 0), wn6.f(cls, "mainContainer", "getMainContainer()Landroid/view/ViewGroup;", 0, n7c), wn6.f(cls, "pickerWidgetContainer", "getPickerWidgetContainer()Landroid/view/ViewGroup;", 0, n7c)};
    }

    public AbstractPickerScreen(Bundle bundle) {
        super(bundle, 0, 2, (x54) null);
        this.c = createViewModelLazy(wra.class, new s(1, new x2((Object) this, 0, (Object) bundle)));
        this.o = binding(new y2(this, 0));
        this.X = binding(new y2(this, 1));
        this.Y = viewBinding(f2a.f0);
        this.Z = viewBinding(f2a.d0);
    }

    public sy6 getInsetsConfig() {
        return this.a;
    }

    /* renamed from: getScopeId-IluPPks  reason: not valid java name */
    public final String m47getScopeIdIluPPks() {
        return this.b;
    }

    public abstract Iterable l0();

    public abstract lta m0();

    public abstract Widget n0(String str);

    public abstract nea o0(Context context);

    /* JADX WARNING: type inference failed for: r8v0, types: [rr3, one.me.chats.picker.AbstractPickerScreen] */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setId(f2a.f0);
        linearLayout.addView(t0(), new FrameLayout.LayoutParams(-1, -2));
        if (q0() != null) {
            zw7 zw7 = new zw7(linearLayout.getContext());
            zw7.setMaxHeight(a24.X(((float) 100) * dh4.c().getDisplayMetrics().density));
            zw7.addView(q0(), new LinearLayout.LayoutParams(-1, -2));
            linearLayout.addView(zw7, new LinearLayout.LayoutParams(-1, -2));
            View view = new View(linearLayout.getContext());
            urd.B(new a3(3, (Continuation) null, 0), view);
            linearLayout.addView(view, new LinearLayout.LayoutParams(-1, a24.W(((double) dh4.c().getDisplayMetrics().density) * 0.5d)));
        }
        FrameLayout frameLayout = new FrameLayout(linearLayout.getContext());
        frameLayout.setId(f2a.d0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        layoutParams.gravity = 112;
        linearLayout.addView(frameLayout, layoutParams);
        sgc childRouter = getChildRouter(frameLayout);
        Widget n0 = n0(this.b);
        n0.setRetainViewMode(qr3.b);
        if (!childRouter.n()) {
            childRouter.R(new vgc(n0, (String) null, (wr3) null, (wr3) null, false, -1));
        }
        for (View addView : l0()) {
            linearLayout.addView(addView);
        }
        FrameLayout frameLayout2 = new FrameLayout(layoutInflater.getContext());
        frameLayout2.addView(linearLayout);
        return frameLayout2;
    }

    public void onViewCreated(View view) {
        AbstractPickerScreen.super.onViewCreated(view);
        ez3.N(new v11(iw4.a, u0().X, new c3(this, (Continuation) null, 0)), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(u0().w0, getViewLifecycleOwner().R(), ob7.o), new b3((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public abstract mua p0();

    public x2a q0() {
        k77 k77 = w0[1];
        return (x2a) this.X.getValue();
    }

    public abstract zqd r0();

    public final ViewGroup s0() {
        return (ViewGroup) this.Y.T0(this, w0[2]);
    }

    public final nea t0() {
        k77 k77 = w0[0];
        return (nea) this.o.getValue();
    }

    public final wra u0() {
        return (wra) this.c.getValue();
    }

    public abstract Set v0(Bundle bundle);
}
