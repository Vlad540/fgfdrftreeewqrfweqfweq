package one.me.calls.ui.bottomsheet.previewjoinlink;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lone/me/calls/ui/bottomsheet/previewjoinlink/CallJoinLinkPreviewWidget;", "Lone/me/sdk/arch/Widget;", "Llc3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "link", "(Ljava/lang/String;)V", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
public final class CallJoinLinkPreviewWidget extends Widget implements lc3 {
    public static final /* synthetic */ k77[] F0;
    public final t97 A0;
    public final t97 B0;
    public final t97 C0;
    public final t97 D0;
    public final jj7 E0;
    public final nl0 X;
    public final nl0 Y;
    public final nl0 Z;
    public final jrf a;
    public final fna b;
    public final t97 c;
    public final t97 o;
    public final nl0 w0;
    public final nl0 x0;
    public final nl0 y0;
    public final n0c z0;

    static {
        Class<CallJoinLinkPreviewWidget> cls = CallJoinLinkPreviewWidget.class;
        khb khb = new khb(cls, "titleView", "getTitleView()Landroid/widget/TextView;", 0);
        n7c n7c = m7c.a;
        F0 = new k77[]{khb, wn6.e(n7c, cls, "closeView", "getCloseView()Lone/me/calls/ui/view/RoundButtonView;", 0), wn6.f(cls, "oneMeStackAvatarView", "getOneMeStackAvatarView()Lone/me/sdk/uikit/common/avatar/OneMeStackAvatarView;", 0, n7c), wn6.f(cls, "microphoneSwitch", "getMicrophoneSwitch()Lone/me/calls/ui/view/RoundButtonView;", 0, n7c), wn6.f(cls, "videoSwitch", "getVideoSwitch()Lone/me/calls/ui/view/RoundButtonView;", 0, n7c), wn6.f(cls, "button", "getButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0, n7c), wn6.f(cls, "previewView", "getPreviewView()Lone/me/calls/ui/view/CallUserView;", 0, n7c)};
    }

    public CallJoinLinkPreviewWidget(String str) {
        this(jjd.j(new wia("call_join_link", str)));
    }

    public static void r0(dgc dgc, Drawable drawable, Drawable drawable2, hy7 hy7, hge hge, hge hge2) {
        dgc.setVisibility(hy7 != hy7.o ? 0 : 8);
        int ordinal = hy7.ordinal();
        yfc yfc = yfc.o;
        if (ordinal == 0) {
            dgc.A(drawable2, -15987442);
            dgc.setMode(yfc);
            dgc.setAccessibility((mge) hge2);
        } else if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return;
                }
                if (ordinal != 4) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            dgc.A(drawable2, -3259817);
            dgc.setMode(yfc);
            dgc.setAccessibility((mge) hge2);
        } else {
            dgc.A(drawable, -1);
            dgc.setMode(yfc.X);
            dgc.setAccessibility((mge) hge);
        }
    }

    public final sy6 getInsetsConfig() {
        sy6 sy6 = sy6.c;
        return sy6.d;
    }

    public final rnc getScreenDelegate() {
        return this.E0;
    }

    public final void i(int i, Bundle bundle) {
        ((we1) this.c.getValue()).g(i);
    }

    public final dgc l0() {
        k77 k77 = F0[3];
        return (dgc) this.w0.getValue();
    }

    public final jca m0() {
        k77 k77 = F0[2];
        return (jca) this.Z.getValue();
    }

    public final TextView n0() {
        k77 k77 = F0[0];
        return (TextView) this.X.getValue();
    }

    public final dgc o0() {
        k77 k77 = F0[4];
        return (dgc) this.x0.getValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayout = new ConstraintLayout(layoutInflater.getContext());
        constraintLayout.setLayoutParams(new re3(-1, -1));
        qda qda = qda.a;
        constraintLayout.setBackgroundColor(-15263716);
        FrameLayout frameLayout = new FrameLayout(constraintLayout.getContext());
        frameLayout.setId(o1a.d0);
        sm1 sm1 = new sm1(frameLayout.getContext(), (AttributeSet) null);
        sm1.setId(o1a.c0);
        sm1.setMode(qm1.o);
        sm1.K((String) null, sm1.getContext().getString(r1a.g0));
        ka1 ka1 = new ka1(this);
        sm1.l1 = le1.c;
        sm1.f1 = ka1;
        sm1.setCustomTheme(qda);
        frameLayout.addView(sm1, -1, -1);
        constraintLayout.addView(frameLayout, -1, 0);
        constraintLayout.addView(n0(), -2, -2);
        k77[] k77Arr = F0;
        k77 k77 = k77Arr[1];
        nl0 nl0 = this.Y;
        constraintLayout.addView((dgc) nl0.getValue());
        constraintLayout.addView(m0());
        constraintLayout.addView(l0(), -2, -2);
        constraintLayout.addView(o0(), -2, -2);
        k77 k772 = k77Arr[5];
        nl0 nl02 = this.y0;
        constraintLayout.addView((OneMeButton) nl02.getValue(), -1, -2);
        bf3 p = a06.p(constraintLayout);
        int id = n0().getId();
        p.d(id, 6, 0, 6);
        float f = (float) 60;
        hr1.q(f, dh4.c().getDisplayMetrics().density, new hw9(p, 6, id, 4));
        p.d(id, 3, 0, 3);
        float f2 = (float) 16;
        hr1.q(f2, dh4.c().getDisplayMetrics().density, new hw9(p, 3, id, 4));
        p.d(id, 7, 0, 7);
        new hw9(p, 7, id, 4).e(a24.X(f * dh4.c().getDisplayMetrics().density));
        p.g(id).d.l0 = true;
        k77 k773 = k77Arr[1];
        int id2 = ((dgc) nl0.getValue()).getId();
        p.d(id2, 3, n0().getId(), 3);
        p.d(id2, 4, n0().getId(), 4);
        p.d(id2, 7, 0, 7);
        new hw9(p, 7, id2, 4).e(a24.X(dh4.c().getDisplayMetrics().density * f2));
        int id3 = m0().getId();
        p.d(id3, 3, n0().getId(), 4);
        float f3 = (float) 24;
        hr1.q(f3, dh4.c().getDisplayMetrics().density, new hw9(p, 3, id3, 4));
        p.d(id3, 7, 0, 7);
        hr1.q(f2, dh4.c().getDisplayMetrics().density, new hw9(p, 7, id3, 4));
        p.d(id3, 6, 0, 6);
        new hw9(p, 6, id3, 4).e(a24.X(dh4.c().getDisplayMetrics().density * f2));
        p.d(id3, 4, frameLayout.getId(), 3);
        int id4 = frameLayout.getId();
        p.d(id4, 3, m0().getId(), 4);
        hr1.q(f3, dh4.c().getDisplayMetrics().density, new hw9(p, 3, id4, 4));
        p.d(id4, 7, 0, 7);
        hr1.q(f2, dh4.c().getDisplayMetrics().density, new hw9(p, 7, id4, 4));
        p.d(id4, 6, 0, 6);
        hr1.q(f2, dh4.c().getDisplayMetrics().density, new hw9(p, 6, id4, 4));
        k77 k774 = k77Arr[5];
        p.d(id4, 4, ((OneMeButton) nl02.getValue()).getId(), 3);
        new hw9(p, 4, id4, 4).e(a24.X(dh4.c().getDisplayMetrics().density * f2));
        int id5 = l0().getId();
        p.d(id5, 4, frameLayout.getId(), 4);
        new hw9(p, 4, id5, 4).e(a24.X(f3 * dh4.c().getDisplayMetrics().density));
        p.d(id5, 7, o0().getId(), 6);
        p.d(id5, 6, 0, 6);
        p.g(id5).d.V = 2;
        int id6 = o0().getId();
        p.d(id6, 4, l0().getId(), 4);
        p.d(id6, 3, l0().getId(), 3);
        p.d(id6, 7, 0, 7);
        p.d(id6, 6, l0().getId(), 7);
        hr1.q(f2, dh4.c().getDisplayMetrics().density, new hw9(p, 6, id6, 4));
        k77 k775 = k77Arr[5];
        int id7 = ((OneMeButton) nl02.getValue()).getId();
        p.d(id7, 7, frameLayout.getId(), 7);
        new hw9(p, 7, id7, 4).e(a24.X(dh4.c().getDisplayMetrics().density * f2));
        p.d(id7, 6, frameLayout.getId(), 6);
        hr1.q(f2, dh4.c().getDisplayMetrics().density, new hw9(p, 6, id7, 4));
        p.d(id7, 4, 0, 4);
        new hw9(p, 4, id7, 4).e(a24.X(f2 * dh4.c().getDisplayMetrics().density));
        p.a(constraintLayout);
        return constraintLayout;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [one.me.calls.ui.bottomsheet.previewjoinlink.CallJoinLinkPreviewWidget, rr3] */
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        CallJoinLinkPreviewWidget.super.onRequestPermissionsResult(i, strArr, iArr);
        fna fna = this.b;
        if (i == 159 && fna.a().b(qna.l)) {
            p0().s(true);
        } else if (i != 160 || !fna.a().b(qna.h)) {
            ((we1) this.c.getValue()).b(i, strArr, iArr);
        } else {
            p0().r(true);
        }
    }

    public final void onViewCreated(View view) {
        CallJoinLinkPreviewWidget.super.onViewCreated(view);
        l05 l05 = p0().E0;
        ob7 ob7 = ob7.o;
        ez3.N(new ck5(wx3.e(l05, getViewLifecycleOwner().R(), ob7), new la1((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(p0().B0, getViewLifecycleOwner().R(), ob7), new ma1((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final ga1 p0() {
        return (ga1) this.o.getValue();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [one.me.calls.ui.bottomsheet.previewjoinlink.CallJoinLinkPreviewWidget, rr3] */
    public final void q0() {
        getRouter().B(this);
    }

    public CallJoinLinkPreviewWidget(Bundle bundle) {
        super(bundle, 0, 2, (x54) null);
        this.a = new jrf(this, 1);
        this.b = new fna(rna.a.b());
        this.c = ez3.O(3, new ha1(this, 0));
        this.o = createViewModelLazy(ga1.class, new s(13, new x2(bundle, (Widget) this, 9)));
        this.X = binding(new ha1(this, 7));
        this.Y = binding(new ha1(this, 8));
        this.Z = binding(new ha1(this, 9));
        this.w0 = binding(new ha1(this, 10));
        this.x0 = binding(new ha1(this, 11));
        this.y0 = binding(new ha1(this, 1));
        this.z0 = viewBinding(o1a.c0);
        this.A0 = ez3.O(3, new ha1(this, 2));
        this.B0 = ez3.O(3, new ha1(this, 3));
        this.C0 = ez3.O(3, new ha1(this, 5));
        this.D0 = ez3.O(3, new ha1(this, 6));
        this.E0 = new jj7((s16) new a01(14), (s16) null, 6);
    }
}
