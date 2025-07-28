package one.me.sdk.contextmenu.popup;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0007B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lone/me/sdk/contextmenu/popup/ContextMenuPopupWindow;", "Lone/me/sdk/arch/Widget;", "Lnq3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "wq3", "context-menu_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ContextMenuPopupWindow extends Widget implements nq3 {
    public static final /* synthetic */ k77[] y0;
    public static final int z0 = zpb.context_menu_card_id;
    public final jr X;
    public final jr Y;
    public final jr Z;
    public final jr a;
    public final jr b;
    public final jr c;
    public final jr o;
    public final n0c w0;
    public final jr x0;

    static {
        Class<ContextMenuPopupWindow> cls = ContextMenuPopupWindow.class;
        y0 = new k77[]{new khb(cls, ApiProtocol.PARAM_PAYLOAD, "getPayload()Landroid/os/Bundle;", 0), m4b.g(m7c.a, cls, "highlightPadding", "getHighlightPadding()Landroid/graphics/Rect;", 0), new khb(cls, "highlightRadius", "getHighlightRadius()Ljava/lang/Float;", 0), new khb(cls, "anchorViewId", "getAnchorViewId()I", 0), new khb(cls, "anchorClass", "getAnchorClass()Ljava/lang/Class;", 0), new khb(cls, "parentViewId", "getParentViewId()Ljava/lang/Integer;", 0), new hc9(cls, "isCallbackSent", "isCallbackSent()Z"), new khb(cls, "cardView", "getCardView()Landroid/view/View;", 0), new khb(cls, "useDarkTheme", "getUseDarkTheme()Z", 0)};
    }

    public ContextMenuPopupWindow() {
        this((Bundle) null, 1, (x54) null);
    }

    public static final pda l0(ContextMenuPopupWindow contextMenuPopupWindow) {
        return contextMenuPopupWindow.m0() ? qda.a : km4.y0.n(contextMenuPopupWindow.getContext()).g();
    }

    public final void dismiss() {
        getRouter().B(this);
    }

    public final sy6 getInsetsConfig() {
        sy6 sy6 = sy6.c;
        return sy6.d;
    }

    public final boolean handleBack() {
        dismiss();
        return true;
    }

    public final boolean m0() {
        k77 k77 = y0[8];
        return ((Boolean) this.x0.a(this)).booleanValue();
    }

    public final void onAttach(View view) {
        ContextMenuPopupWindow.super.onAttach(view);
        hq0 hq0 = new hq0((rr3) this, (s16) new nl1(27, this));
        if (getRouter() != null) {
            getRouter().a(hq0);
        } else {
            addLifecycleListener(new s9(this, hq0, 3));
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return new yq3(this, layoutInflater, layoutInflater.getContext());
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        int X2 = a24.X(((float) 12) * dh4.c().getDisplayMetrics().density);
        int X3 = a24.X(((float) 8) * dh4.c().getDisplayMetrics().density);
        k77[] k77Arr = y0;
        k77 k77 = k77Arr[3];
        int intValue = ((Number) this.o.a(this)).intValue();
        if (intValue != -1) {
            k77 k772 = k77Arr[4];
            k96 k96 = new k96((Class) this.X.a(this), intValue);
            k96.f(this);
            bg6 bg6 = new bg6(k96);
            k77 k773 = k77Arr[1];
            k77 k774 = k77Arr[2];
            k77 k775 = k77Arr[5];
            bg6.a(view, (Rect) this.b.a(this), (Float) this.c.a(this), (Integer) this.Y.a(this));
            k77 k776 = k77Arr[7];
            ((ArrayList) k96.c).add(new pi4(new Rect(), (View) this.w0.T0(this, k776), view, new Rect(), X2, X3));
        }
        float f = getArgs().getFloat("x", -1.0f);
        float f2 = getArgs().getFloat("y", -1.0f);
        View findViewById = view.findViewById(z0);
        if (f > 0.0f && f2 > 0.0f) {
            findViewById.addOnLayoutChangeListener(new h1b(findViewById, f, f2));
        }
    }

    public final void q(rr3 rr3) {
        setTargetController(rr3);
        while (rr3.getParentController() != null) {
            rr3 = rr3.getParentController();
        }
        sgc sgc = null;
        ygc ygc = rr3 instanceof ygc ? (ygc) rr3 : null;
        if (ygc != null) {
            sgc = ygc.S();
        }
        if (sgc != null) {
            vgc vgc = new vgc(this, (String) null, (wr3) null, (wr3) null, false, -1);
            rf0.k(false, vgc, true, "BottomSheetWidget");
            sgc.G(vgc);
        }
    }

    public ContextMenuPopupWindow(Bundle bundle) {
        super(bundle, 0, 2, (x54) null);
        this.a = new jr(Bundle.class, (Object) null, ApiProtocol.PARAM_PAYLOAD);
        this.b = new jr(Rect.class, "highlight_padding");
        this.c = new jr(Float.class, "highlight_radius");
        Class<Integer> cls = Integer.class;
        this.o = new jr(cls, -1, "anchor_id");
        this.X = new jr(Class.class, "anchor_class");
        this.Y = new jr(cls, "parent_id");
        Boolean bool = Boolean.FALSE;
        Class<Boolean> cls2 = Boolean.class;
        this.Z = new jr(cls2, bool, "callback_sent");
        this.w0 = viewBinding(z0);
        this.x0 = new jr(cls2, bool, "dark_theme");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ContextMenuPopupWindow(Bundle bundle, int i, x54 x54) {
        this((i & 1) != 0 ? null : bundle);
    }
}
