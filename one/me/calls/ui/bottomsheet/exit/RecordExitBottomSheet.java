package one.me.calls.ui.bottomsheet.exit;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/calls/ui/bottomsheet/exit/RecordExitBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Ly4c;", "openType", "", "enableRecordInCall", "(Ly4c;Ljava/lang/Boolean;)V", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
public final class RecordExitBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ k77[] K0;
    public final t97 C0;
    public final t97 D0;
    public final nl0 E0;
    public final nl0 F0;
    public final nl0 G0;
    public final nl0 H0;
    public final nl0 I0;
    public final nl0 J0;

    static {
        Class<RecordExitBottomSheet> cls = RecordExitBottomSheet.class;
        khb khb = new khb(cls, "titleView", "getTitleView()Landroid/widget/TextView;", 0);
        n7c n7c = m7c.a;
        K0 = new k77[]{khb, wn6.e(n7c, cls, "subtitleView", "getSubtitleView()Landroid/widget/TextView;", 0), wn6.f(cls, "negativeBtn", "getNegativeBtn()Lone/me/sdk/uikit/common/button/OneMeButton;", 0, n7c), wn6.f(cls, "positiveBtn", "getPositiveBtn()Lone/me/sdk/uikit/common/button/OneMeButton;", 0, n7c), wn6.f(cls, "recordInfo", "getRecordInfo()Lone/me/sdk/sections/ui/recyclerview/settingsitem/SettingsItemContent;", 0, n7c), wn6.f(cls, "needRemoveView", "getNeedRemoveView()Lone/me/calls/ui/view/CheckBoxWithPaddingFix;", 0, n7c)};
    }

    public RecordExitBottomSheet(Bundle bundle) {
        super(bundle);
        this.C0 = ez3.O(3, new x4c(this, 0));
        this.D0 = createViewModelLazy(h5c.class, new wq9(21, new fe2(bundle, 9)));
        this.E0 = binding(new x4c(this, 1));
        this.F0 = binding(new x4c(this, 2));
        this.G0 = binding(new x4c(this, 3));
        this.H0 = binding(new x4c(this, 4));
        this.I0 = binding(new x4c(this, 5));
        this.J0 = binding(new x4c(this, 6));
    }

    public final OneMeButton A0() {
        k77 k77 = K0[2];
        return (OneMeButton) this.G0.getValue();
    }

    public final OneMeButton B0() {
        k77 k77 = K0[3];
        return (OneMeButton) this.H0.getValue();
    }

    public final n7d C0() {
        k77 k77 = K0[4];
        return (n7d) this.I0.getValue();
    }

    public final TextView D0() {
        k77 k77 = K0[1];
        return (TextView) this.F0.getValue();
    }

    public final TextView E0() {
        k77 k77 = K0[0];
        return (TextView) this.E0.getValue();
    }

    public final void onViewCreated(View view) {
        RecordExitBottomSheet.super.onViewCreated(view);
        t97 t97 = this.D0;
        l05 l05 = ((h5c) t97.getValue()).y0;
        ob7 ob7 = ob7.o;
        ez3.N(new ck5(wx3.e(l05, getViewLifecycleOwner().R(), ob7), new z4c((Continuation) null, this), 5), getViewLifecycleScope());
        if (((h5c) t97.getValue()).b == y4c.b) {
            ez3.N(new ck5(wx3.e(((h5c) t97.getValue()).x0, getViewLifecycleOwner().R(), ob7), new a5c((Continuation) null, this), 5), getViewLifecycleScope());
        }
        ez3.N(new ck5(wx3.e(new ik5(((h5c) t97.getValue()).w0, 2), getViewLifecycleOwner().R(), ob7), new b5c((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final pda p0() {
        return qda.a;
    }

    public final View w0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        ConstraintLayout constraintLayout = new ConstraintLayout(layoutInflater.getContext());
        constraintLayout.addView(E0(), -1, -2);
        constraintLayout.addView(D0(), -1, -2);
        constraintLayout.addView(C0(), -1, -2);
        constraintLayout.addView(A0(), 0, -2);
        constraintLayout.addView(B0(), 0, -2);
        constraintLayout.addView(z0(), 0, -2);
        bf3 p = a06.p(constraintLayout);
        int id = E0().getId();
        p.d(id, 3, 0, 3);
        hr1.q((float) 16, dh4.c().getDisplayMetrics().density, new hw9(p, 3, id, 4));
        p.d(id, 7, 0, 7);
        p.d(id, 6, 0, 6);
        p.d(id, 4, D0().getId(), 3);
        p.g(id).d.W = 2;
        int id2 = D0().getId();
        p.d(id2, 3, E0().getId(), 4);
        float f = (float) 4;
        hr1.q(f, dh4.c().getDisplayMetrics().density, new hw9(p, 3, id2, 4));
        p.d(id2, 7, 0, 7);
        p.d(id2, 6, 0, 6);
        p.d(id2, 4, C0().getId(), 3);
        int id3 = C0().getId();
        p.d(id3, 3, D0().getId(), 4);
        hr1.q((float) 22, dh4.c().getDisplayMetrics().density, new hw9(p, 3, id3, 4));
        p.d(id3, 7, 0, 7);
        p.d(id3, 6, 0, 6);
        p.d(id3, 4, z0().getId(), 3);
        int id4 = z0().getId();
        p.d(id4, 3, C0().getId(), 4);
        float f2 = (float) 12;
        hr1.q(f2, dh4.c().getDisplayMetrics().density, new hw9(p, 3, id4, 4));
        p.d(id4, 7, 0, 7);
        hr1.q(f2, dh4.c().getDisplayMetrics().density, new hw9(p, 7, id4, 4));
        p.d(id4, 6, 0, 6);
        new hw9(p, 6, id4, 4).e(a24.X(f2 * dh4.c().getDisplayMetrics().density));
        p.d(id4, 4, A0().getId(), 3);
        int id5 = A0().getId();
        p.d(id5, 3, z0().getId(), 4);
        new hw9(p, 3, id5, 4).e(a24.X(((float) 24) * dh4.c().getDisplayMetrics().density));
        p.d(id5, 7, B0().getId(), 6);
        hr1.q(f, dh4.c().getDisplayMetrics().density, new hw9(p, 7, id5, 4));
        p.d(id5, 6, 0, 6);
        p.d(id5, 4, 0, 3);
        int id6 = B0().getId();
        p.d(id6, 3, A0().getId(), 3);
        p.d(id6, 7, 0, 7);
        p.d(id6, 6, A0().getId(), 7);
        new hw9(p, 6, id6, 4).e(a24.X(f * dh4.c().getDisplayMetrics().density));
        p.d(id6, 4, A0().getId(), 4);
        p.a(constraintLayout);
        return constraintLayout;
    }

    public final pw2 z0() {
        k77 k77 = K0[5];
        return (pw2) this.J0.getValue();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RecordExitBottomSheet(y4c y4c, Boolean bool, int i, x54 x54) {
        this(y4c, (i & 2) != 0 ? null : bool);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RecordExitBottomSheet(defpackage.y4c r3, java.lang.Boolean r4) {
        /*
            r2 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "open_type"
            java.lang.String r3 = r3.name()
            r0.putString(r1, r3)
            if (r4 == 0) goto L_0x0019
            java.lang.String r3 = "admin_record_settings"
            boolean r4 = r4.booleanValue()
            r0.putBoolean(r3, r4)
        L_0x0019:
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet.<init>(y4c, java.lang.Boolean):void");
    }
}
