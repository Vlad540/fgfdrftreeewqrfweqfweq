package one.me.calllist.ui.callinfo;

import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lone/me/calllist/ui/callinfo/CallLinkInfoScreen;", "Lone/me/sdk/arch/Widget;", "Llc3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "", "link", "title", "", "isLinkCall", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Z)V", "call-list_release"}, k = 1, mv = {2, 0, 0})
public final class CallLinkInfoScreen extends Widget implements lc3 {
    public static final /* synthetic */ k77[] F0;
    public final n0c A0;
    public final n0c B0;
    public final n0c C0;
    public final cpf D0;
    public final jj7 E0;
    public final t97 X;
    public final t97 Y;
    public final n0c Z;
    public final t97 a;
    public final t97 b;
    public final t97 c;
    public final r7e o;
    public final n0c w0;
    public final n0c x0;
    public final n0c y0;
    public final n0c z0;

    static {
        Class<CallLinkInfoScreen> cls = CallLinkInfoScreen.class;
        khb khb = new khb(cls, "collapsibleContainerLinearLayout", "getCollapsibleContainerLinearLayout()Landroid/widget/LinearLayout;", 0);
        n7c n7c = m7c.a;
        F0 = new k77[]{khb, wn6.e(n7c, cls, "appBarLayout", "getAppBarLayout()Lcom/google/android/material/appbar/AppBarLayout;", 0), wn6.f(cls, "oneMeToolbar", "getOneMeToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0, n7c), wn6.f(cls, "titleTextView", "getTitleTextView()Landroid/widget/TextView;", 0, n7c), wn6.f(cls, "descriptionTextView", "getDescriptionTextView()Landroid/widget/TextView;", 0, n7c), wn6.f(cls, "linkTextView", "getLinkTextView()Landroid/widget/TextView;", 0, n7c), wn6.f(cls, "button", "getButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0, n7c), wn6.f(cls, "icon", "getIcon()Lone/me/sdk/uikit/common/avatar/OneMeAvatarView;", 0, n7c)};
    }

    public CallLinkInfoScreen() {
        this((Bundle) null, 1, (x54) null);
    }

    public final sy6 getInsetsConfig() {
        sy6 sy6 = sy6.c;
        return sy6.d;
    }

    public final rnc getScreenDelegate() {
        return this.E0;
    }

    public final void i(int i, Bundle bundle) {
        ((we1) this.Y.getValue()).g(i);
    }

    public final iq1 l0() {
        return (iq1) this.b.getValue();
    }

    public final jb1 m0() {
        return (jb1) this.c.getValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ab1 ab1 = new ab1(this, 0);
        CoordinatorLayout coordinatorLayout = new CoordinatorLayout(getContext(), (AttributeSet) null);
        coordinatorLayout.setId(i1a.p);
        coordinatorLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ab1.invoke(coordinatorLayout);
        return coordinatorLayout;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [one.me.calllist.ui.callinfo.CallLinkInfoScreen, rr3] */
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        CallLinkInfoScreen.super.onRequestPermissionsResult(i, strArr, iArr);
        ((we1) this.Y.getValue()).b(i, strArr, iArr);
    }

    public final void onViewCreated(View view) {
        CallLinkInfoScreen.super.onViewCreated(view);
        p85 p85 = new p85();
        k77[] k77Arr = F0;
        k77 k77 = k77Arr[1];
        n0c n0c = this.w0;
        ((fm) n0c.T0(this, k77)).a(am7.F(new db1(p85, this, 0), (fm) n0c.T0(this, k77Arr[1]), getViewLifecycleOwner()));
        l05 l05 = m0().x0;
        ob7 ob7 = ob7.o;
        ez3.N(new ck5(wx3.e(l05, getViewLifecycleOwner().R(), ob7), new fb1((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(m0().w0, getViewLifecycleOwner().R(), ob7), new gb1((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public CallLinkInfoScreen(Long l, String str, String str2, boolean z) {
        this(jjd.j(new wia("link_param", str), new wia("title_param", str2), new wia("id_param", l), new wia("is_link_call", Boolean.valueOf(z))));
    }

    public CallLinkInfoScreen(Bundle bundle) {
        super(bundle, 0, 2, (x54) null);
        this.a = mqc.l;
        c61 c61 = c61.a;
        this.b = c61.getAccessor().d(iq1.class);
        this.c = createViewModelLazy(jb1.class, new s(14, new x2(bundle, (Widget) this, 10)));
        this.o = new r7e(new cb1(this, 1));
        this.X = ez3.O(3, new cb1(this, 2));
        this.Y = ez3.O(3, new cb1(this, 3));
        this.Z = viewBinding(i1a.o);
        this.w0 = viewBinding(i1a.m);
        this.x0 = viewBinding(i1a.t);
        this.y0 = viewBinding(i1a.u);
        this.z0 = viewBinding(i1a.q);
        this.A0 = viewBinding(i1a.s);
        this.B0 = viewBinding(i1a.n);
        this.C0 = viewBinding(i1a.r);
        this.D0 = new cpf(new c9(3, this), ((x4a) c61.getAccessor().c(x4a.class)).a(), 3);
        this.E0 = new jj7((s16) new a01(15), (s16) null, 6);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CallLinkInfoScreen(Bundle bundle, int i, x54 x54) {
        this((i & 1) != 0 ? null : bundle);
    }
}
