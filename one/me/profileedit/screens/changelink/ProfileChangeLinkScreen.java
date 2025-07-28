package one.me.profileedit.screens.changelink;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB!\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0007\u0010\u000f¨\u0006\u0010"}, d2 = {"Lone/me/profileedit/screens/changelink/ProfileChangeLinkScreen;", "Lone/me/sdk/arch/Widget;", "Llc3;", "Lt5b;", "Ltq3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "Ld8b;", "type", "Lc8b;", "flow", "(JLd8b;Lc8b;)V", "profile-edit_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ProfileChangeLinkScreen extends Widget implements lc3, t5b, tq3 {
    public static final /* synthetic */ k77[] z0;
    public final t97 X;
    public final cpf Y;
    public final n0c Z;
    public final jr a;
    public final jr b;
    public final jj7 c;
    public final sy6 o;
    public final n0c w0;
    public final n0c x0;
    public final n0c y0;

    static {
        Class<ProfileChangeLinkScreen> cls = ProfileChangeLinkScreen.class;
        k77 khb = new khb(cls, "flowType", "getFlowType()Lone/me/profileedit/deeplink/ProfileEditDeepLinkRoutes$FlowType;", 0);
        n7c n7c = m7c.a;
        z0 = new k77[]{khb, wn6.e(n7c, cls, "idType", "getIdType()Lone/me/profileedit/deeplink/ProfileEditDeepLinkRoutes$Type;", 0), wn6.f(cls, "shortLinkMoreButton", "getShortLinkMoreButton()Landroid/widget/ImageView;", 0, n7c), wn6.f(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0, n7c), wn6.f(cls, "button", "getButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0, n7c), wn6.f(cls, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0, n7c)};
    }

    public ProfileChangeLinkScreen(Bundle bundle) {
        super(bundle, 0, 2, (x54) null);
        this.a = new jr(c8b.class, "entity:flow_type");
        this.b = new jr(d8b.class, "entity:id_type");
        this.c = new jj7(new u5b(0, this), (s16) null, 6);
        this.o = sy6.d;
        this.X = createViewModelLazy(pz1.class, new wq9(13, new nya(bundle, 2, this)));
        this.Y = new cpf(((x4a) z7b.a.getAccessor().c(x4a.class)).a(), (Object) this, 10);
        this.Z = viewBinding(f8a.w0);
        this.w0 = viewBinding(f8a.y0);
        this.x0 = viewBinding(f8a.D0);
        this.y0 = viewBinding(f8a.x0);
        ez3.N(new ck5(new ik5(o0().o, 2), new v5b((Continuation) null, this), 5), getLifecycleScope());
        ez3.N(new ck5(o0().w0, new w5b((Continuation) null, this), 5), getLifecycleScope());
    }

    public static final OneMeButton l0(ProfileChangeLinkScreen profileChangeLinkScreen) {
        profileChangeLinkScreen.getClass();
        return (OneMeButton) profileChangeLinkScreen.x0.T0(profileChangeLinkScreen, z0[4]);
    }

    public final sy6 getInsetsConfig() {
        return this.o;
    }

    public final rnc getScreenDelegate() {
        return this.c;
    }

    public final boolean handleBack() {
        View view = getView();
        if (view != null) {
            view.clearFocus();
        }
        bm3.p(this);
        return ProfileChangeLinkScreen.super.handleBack();
    }

    public final void i(int i, Bundle bundle) {
        o0().b.h(i);
    }

    public final c8b m0() {
        k77 k77 = z0[0];
        return (c8b) this.a.a(this);
    }

    public final nea n0() {
        return (nea) this.w0.T0(this, z0[3]);
    }

    public final pz1 o0() {
        return (pz1) this.X.getValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        bea bea;
        int i;
        Context context = layoutInflater.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        RecyclerView recyclerView = new RecyclerView(frameLayout.getContext(), (AttributeSet) null);
        recyclerView.setId(f8a.x0);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1, 48);
        float f = (float) 16;
        layoutParams2.topMargin = a24.X(dh4.c().getDisplayMetrics().density * f);
        recyclerView.setLayoutParams(layoutParams2);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.Y);
        recyclerView.setItemAnimator((k6c) null);
        recyclerView.setClipChildren(false);
        ss8 ss8 = new ss8(21, (Object) this);
        s59 s59 = km4.y0;
        recyclerView.j(new qtc(s59.r(recyclerView), ss8, (o8) null, 12));
        recyclerView.j(new ku7(0));
        frameLayout.addView(recyclerView);
        nea nea = new nea(frameLayout.getContext(), 6);
        nea.setId(f8a.y0);
        e98 e98 = new e98(22, this);
        int ordinal = m0().ordinal();
        if (ordinal == 0) {
            bea = new vda(new e12(5, e98));
        } else if (ordinal == 1) {
            bea = new wda(new e12(6, e98));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        nea.setLeftActions(bea);
        nea.setRightActions(yda.a);
        nea.setForm(fea.a);
        nea.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 48));
        nea.setBackgroundColor(s59.r(nea).b().h);
        frameLayout.addView(nea);
        OneMeButton oneMeButton = new OneMeButton(frameLayout.getContext(), (AttributeSet) null);
        oneMeButton.setId(f8a.D0);
        oneMeButton.setSize(v0a.c);
        oneMeButton.setMode(u0a.a);
        oneMeButton.setAppearance(s0a.c);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2, 80);
        layoutParams3.setMargins(a24.X(dh4.c().getDisplayMetrics().density * f), 0, a24.X(f * dh4.c().getDisplayMetrics().density), a24.X(((float) 12) * dh4.c().getDisplayMetrics().density));
        oneMeButton.setLayoutParams(layoutParams3);
        int ordinal2 = m0().ordinal();
        if (ordinal2 == 0) {
            i = i8a.R1;
        } else if (ordinal2 == 1) {
            i = i8a.S1;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        oneMeButton.setText(i);
        a24.a0(oneMeButton, new eu5(26, this));
        frameLayout.addView(oneMeButton);
        urd.B(new c3(this, (Continuation) null, 25), frameLayout);
        return frameLayout;
    }

    public final void onViewCreated(View view) {
        nea n0 = n0();
        afa.a(n0, new q36(n0, 14, this));
        ez3.N(new ck5(new ik5(o0().Y, 2), new y5b((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(o0().Z, getViewLifecycleOwner().R(), ob7.o), new x5b((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final void y(int i, Bundle bundle) {
        o0().b.i(i);
    }

    public ProfileChangeLinkScreen(long j, d8b d8b, c8b c8b) {
        this(jjd.j(new wia[]{new wia("entity:id", Long.valueOf(j)), new wia("entity:id_type", d8b), new wia("entity:flow_type", c8b)}));
    }
}
