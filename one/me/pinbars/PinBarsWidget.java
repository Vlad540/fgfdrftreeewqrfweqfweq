package one.me.pinbars;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\tB\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\n"}, d2 = {"Lone/me/pinbars/PinBarsWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Linc;", "scopeId", "(Ljava/lang/String;Lx54;)V", "vua", "pinbars_release"}, k = 1, mv = {2, 0, 0})
public final class PinBarsWidget extends Widget {
    public static final /* synthetic */ int x0 = 0;
    public y49 X;
    public c8a Y;
    public pue Z;
    public jme a;
    public final t97 b;
    public final t97 c;
    public final t97 o;
    public xc6 w0;

    public PinBarsWidget() {
        this((Bundle) null, 1, (x54) null);
    }

    public final sua l0() {
        return (sua) this.c.getValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setId(z7a.h);
        linearLayout.setShowDividers(7);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        urd.B(new wua((Object) shapeDrawable, (Continuation) null, 1), linearLayout);
        shapeDrawable.setIntrinsicHeight(a24.W(((double) dh4.c().getDisplayMetrics().density) * 0.5d));
        linearLayout.setDividerDrawable(shapeDrawable);
        return linearLayout;
    }

    public final void onDestroyView(View view) {
        PinBarsWidget.super.onDestroyView(view);
        this.X = null;
        this.Z = null;
        this.Y = null;
        this.w0 = null;
        l0().Y.h();
        jme jme = this.a;
        if (jme != null) {
            jme.dismiss();
        }
        this.a = null;
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ViewGroup viewGroup = (ViewGroup) view;
        ez3.N(new ck5(l0().Z, new bva(view, (Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(l0().B0, new cva(view, (Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(new w09(l0().C0, this, 6), new dva((Continuation) null, this), 5), getViewLifecycleScope());
        t0c t0c = l0().y0;
        ob7 ob7 = ob7.o;
        ez3.N(new ck5(wx3.e(t0c, getViewLifecycleOwner().R(), ob7), new xua(view, (Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(l0().z0, getViewLifecycleOwner().R(), ob7), new yua((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(ez3.r(l0().B0, l0().Z, l0().w0, l0().y0, new eva(view, (Continuation) null, this)), getViewLifecycleScope());
        ez3.N(new ck5(l0().D0, new fva((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(l0().x0, getViewLifecycleOwner().R(), ob7), new zua((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public PinBarsWidget(String str, x54 x54) {
        this(jjd.j(new wia[]{new wia(Widget.ARG_SCOPE_ID, new inc(str))}));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r2 == null) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PinBarsWidget(android.os.Bundle r4) {
        /*
            r3 = this;
            r0 = 0
            r1 = 2
            r2 = 0
            r3.<init>(r4, r0, r1, r2)
            if (r4 == 0) goto L_0x0016
            java.lang.String r0 = "arg_key_scope_id"
            android.os.Parcelable r4 = r4.getParcelable(r0)
            inc r4 = (defpackage.inc) r4
            if (r4 == 0) goto L_0x0014
            java.lang.String r2 = r4.a
        L_0x0014:
            if (r2 != 0) goto L_0x0018
        L_0x0016:
            java.lang.String r2 = ""
        L_0x0018:
            qga r4 = new qga
            r0 = 14
            r4.<init>(r0)
            java.lang.Class<rua> r0 = defpackage.rua.class
            t97 r4 = r3.m25getSharedViewModelcp94BC8(r2, r0, r4)
            r3.b = r4
            tua r4 = new tua
            r0 = 2
            r4.<init>(r3, r0)
            wq9 r0 = new wq9
            r1 = 12
            r0.<init>(r1, r4)
            java.lang.Class<sua> r4 = defpackage.sua.class
            t97 r4 = r3.createViewModelLazy(r4, r0)
            r3.c = r4
            tua r4 = new tua
            r0 = 3
            r4.<init>(r3, r0)
            t97 r4 = ez3.O(r0, r4)
            r3.o = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.pinbars.PinBarsWidget.<init>(android.os.Bundle):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PinBarsWidget(Bundle bundle, int i, x54 x54) {
        this((i & 1) != 0 ? null : bundle);
    }
}
