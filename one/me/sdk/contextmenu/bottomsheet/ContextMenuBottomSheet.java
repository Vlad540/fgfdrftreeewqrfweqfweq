package one.me.sdk.contextmenu.bottomsheet;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import java.util.List;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0007B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lone/me/sdk/contextmenu/bottomsheet/ContextMenuBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Lnq3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "sq3", "context-menu_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ContextMenuBottomSheet extends BottomSheetWidget implements nq3 {
    public static final /* synthetic */ k77[] K0;
    public final jr C0;
    public final jr D0;
    public final jr E0;
    public final jr F0;
    public final jr G0;
    public final jr H0;
    public final jr I0;
    public final smc J0;

    static {
        Class<ContextMenuBottomSheet> cls = ContextMenuBottomSheet.class;
        K0 = new k77[]{new khb(cls, ApiProtocol.PARAM_PAYLOAD, "getPayload()Landroid/os/Bundle;", 0), m4b.g(m7c.a, cls, "anchorViewId", "getAnchorViewId()Ljava/lang/Integer;", 0), new khb(cls, "anchorClass", "getAnchorClass()Ljava/lang/Class;", 0), new khb(cls, "highlightPadding", "getHighlightPadding()Landroid/graphics/Rect;", 0), new khb(cls, "highlightRadius", "getHighlightRadius()Ljava/lang/Float;", 0), new khb(cls, "parentId", "getParentId()Ljava/lang/Integer;", 0), new hc9(cls, "isCallbackSent", "isCallbackSent()Z")};
    }

    public ContextMenuBottomSheet() {
        this((Bundle) null, 1, (x54) null);
    }

    public final void dismiss() {
        r0(true);
    }

    public final void onAttach(View view) {
        super.onAttach(view);
        hq0 hq0 = new hq0((rr3) this, (s16) new nl1(26, this));
        if (getRouter() != null) {
            getRouter().a(hq0);
        } else {
            addLifecycleListener(new s9(this, hq0, 2));
        }
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        k77[] k77Arr = K0;
        k77 k77 = k77Arr[1];
        Integer num = (Integer) this.D0.a(this);
        if (num != null) {
            int intValue = num.intValue();
            k77 k772 = k77Arr[2];
            Class cls = (Class) this.E0.a(this);
            if (cls != null) {
                k96 k96 = new k96(cls, intValue);
                k96.f(this);
                bg6 bg6 = new bg6(k96);
                k77 k773 = k77Arr[3];
                k77 k774 = k77Arr[4];
                k77 k775 = k77Arr[5];
                bg6.a(view, (Rect) this.F0.a(this), (Float) this.G0.a(this), (Integer) this.H0.a(this));
            }
        }
    }

    public final void q(Widget widget) {
        setTargetController(widget);
        Widget widget2 = widget;
        while (widget2.getParentController() != null) {
            widget2 = widget2.getParentController();
        }
        sgc sgc = null;
        ygc ygc = widget2 instanceof ygc ? (ygc) widget2 : null;
        if (ygc != null) {
            sgc = ygc.S();
        }
        y0(widget);
        if (sgc != null) {
            vgc vgc = new vgc(this, (String) null, (wr3) null, (wr3) null, false, -1);
            rf0.k(false, vgc, true, "BottomSheetWidget");
            sgc.G(vgc);
        }
    }

    public final View w0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        Context context = layoutInflater.getContext();
        Bundle bundle = getArgs().getBundle("actions");
        List f = bundle != null ? kjd.f(bundle) : null;
        if (f == null) {
            f = hw4.a;
        }
        gw2 gw2 = new gw2(4, this);
        this.J0.getClass();
        return smc.h(context, f, gw2);
    }

    public ContextMenuBottomSheet(Bundle bundle) {
        super(bundle);
        this.C0 = new jr(Bundle.class, (Object) null, ApiProtocol.PARAM_PAYLOAD);
        Class<Integer> cls = Integer.class;
        this.D0 = new jr(cls, "anchor_id");
        this.E0 = new jr(Class.class, "anchor_class");
        this.F0 = new jr(Rect.class, "highlight_padding");
        this.G0 = new jr(Float.class, "highlight_radius");
        this.H0 = new jr(cls, "parent_id");
        this.I0 = new jr(Boolean.class, Boolean.FALSE, "callback_sent");
        this.J0 = new smc(8);
        boolean z = false;
        if (bundle != null) {
            BaseBottomSheetWidget.X.getClass();
            z = bundle.getBoolean(BaseBottomSheetWidget.Z, false);
        }
        u0(z);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ContextMenuBottomSheet(Bundle bundle, int i, x54 x54) {
        this((i & 1) != 0 ? null : bundle);
    }
}
