package one.me.calls.ui.bottomsheet.raisehand;

import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/calls/ui/bottomsheet/raisehand/RaiseHandActionBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Linc;", "scopeId", "Lle1;", "opponentId", "(Ljava/lang/String;Lle1;Lx54;)V", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
public final class RaiseHandActionBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ k77[] F0;
    public final t97 C0;
    public final n0c D0;
    public final n0c E0;

    static {
        Class<RaiseHandActionBottomSheet> cls = RaiseHandActionBottomSheet.class;
        khb khb = new khb(cls, "titleView", "getTitleView()Landroid/widget/TextView;", 0);
        n7c n7c = m7c.a;
        F0 = new k77[]{khb, wn6.e(n7c, cls, "subtitleView", "getSubtitleView()Landroid/widget/TextView;", 0), wn6.f(cls, "positiveBtn", "getPositiveBtn()Lone/me/sdk/uikit/common/button/OneMeButton;", 0, n7c), wn6.f(cls, "negativeBtn", "getNegativeBtn()Lone/me/sdk/uikit/common/button/OneMeButton;", 0, n7c)};
    }

    public RaiseHandActionBottomSheet(String str, le1 le1, x54 x54) {
        this(jjd.j(new wia("arg_key_scope_id", new inc(str)), new wia("opponent_id", le1)));
    }

    public final void onViewCreated(View view) {
        RaiseHandActionBottomSheet.super.onViewCreated(view);
        ez3.N(new ck5(((fxb) this.C0.getValue()).o, new exb(this, (Continuation) null), 5), getViewLifecycleScope());
    }

    public final pda p0() {
        return qda.a;
    }

    public final View w0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        ConstraintLayout constraintLayout = new ConstraintLayout(layoutInflater.getContext());
        TextView textView = new TextView(constraintLayout.getContext());
        textView.setId(o1a.Y0);
        nge.d(nte.c, textView);
        qda qda = qda.a;
        textView.setTextColor(-855638017);
        textView.setGravity(17);
        float f = (float) 24;
        textView.setPadding(0, a24.X(dh4.c().getDisplayMetrics().density * f), 0, 0);
        TextView textView2 = new TextView(constraintLayout.getContext());
        textView2.setId(o1a.X0);
        nge.d(nte.o, textView2);
        textView2.setTextColor(1895825407);
        textView2.setGravity(17);
        OneMeButton oneMeButton = new OneMeButton(constraintLayout.getContext(), (AttributeSet) null);
        oneMeButton.setId(o1a.V0);
        s0a s0a = s0a.c;
        oneMeButton.setAppearance(s0a);
        v0a v0a = v0a.c;
        oneMeButton.setSize(v0a);
        oneMeButton.setMode(u0a.b);
        oneMeButton.setCustomTheme(qda);
        oneMeButton.setText(r1a.h1);
        a24.Z(oneMeButton, 300, new dxb(this, 0));
        OneMeButton oneMeButton2 = new OneMeButton(constraintLayout.getContext(), (AttributeSet) null);
        oneMeButton2.setId(o1a.W0);
        oneMeButton2.setAppearance(s0a);
        oneMeButton2.setSize(v0a);
        oneMeButton2.setMode(u0a.a);
        oneMeButton2.setCustomTheme(qda);
        oneMeButton2.setText(r1a.i1);
        a24.Z(oneMeButton2, 300, new dxb(this, 1));
        constraintLayout.addView(textView, -1, -2);
        constraintLayout.addView(textView2, -1, -2);
        constraintLayout.addView(oneMeButton2, 0, -2);
        constraintLayout.addView(oneMeButton, 0, -2);
        bf3 p = a06.p(constraintLayout);
        int id = textView.getId();
        p.d(id, 3, 0, 3);
        hr1.q((float) 16, dh4.c().getDisplayMetrics().density, new hw9(p, 3, id, 4));
        p.d(id, 7, 0, 7);
        p.d(id, 6, 0, 6);
        p.d(id, 4, textView2.getId(), 3);
        p.g(id).d.W = 2;
        int id2 = textView2.getId();
        p.d(id2, 3, textView.getId(), 4);
        float f2 = (float) 4;
        hr1.q(f2, dh4.c().getDisplayMetrics().density, new hw9(p, 3, id2, 4));
        p.d(id2, 7, 0, 7);
        p.d(id2, 6, 0, 6);
        p.d(id2, 4, oneMeButton2.getId(), 3);
        int id3 = oneMeButton2.getId();
        p.d(id3, 3, textView2.getId(), 4);
        new hw9(p, 3, id3, 4).e(a24.X(f * dh4.c().getDisplayMetrics().density));
        p.d(id3, 7, oneMeButton.getId(), 6);
        hr1.q(f2, dh4.c().getDisplayMetrics().density, new hw9(p, 7, id3, 4));
        p.d(id3, 6, 0, 6);
        p.d(id3, 4, 0, 3);
        int id4 = oneMeButton.getId();
        p.d(id4, 3, oneMeButton2.getId(), 3);
        p.d(id4, 7, 0, 7);
        p.d(id4, 6, oneMeButton2.getId(), 7);
        new hw9(p, 6, id4, 4).e(a24.X(f2 * dh4.c().getDisplayMetrics().density));
        p.d(id4, 4, oneMeButton2.getId(), 4);
        p.a(constraintLayout);
        return constraintLayout;
    }

    public RaiseHandActionBottomSheet(Bundle bundle) {
        super(bundle);
        this.C0 = createViewModelLazy(fxb.class, new wq9(19, new fe2(bundle, 8)));
        this.D0 = viewBinding(o1a.Y0);
        this.E0 = viewBinding(o1a.X0);
        viewBinding(o1a.W0);
        viewBinding(o1a.V0);
    }
}
