package one.me.sharedata;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.AbstractPickerScreen;
import one.me.chats.picker.chats.PickerChatsTabWidget2;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lone/me/sharedata/ShareDataPickerScreen;", "Lone/me/chats/picker/AbstractPickerScreen;", "Lzad;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "share-picker_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ShareDataPickerScreen extends AbstractPickerScreen<zad> {
    public static final /* synthetic */ k77[] H0;
    public static final sy6 I0 = new sy6(4, new up0(4, 3, false));
    public final AutoTransition A0;
    public final nl0 B0;
    public final t97 C0;
    public az1 D0;
    public sgc E0;
    public final bw5 F0;
    public z68 G0;
    public final sy6 x0 = sy6.c;
    public final grd y0 = hrd.a(new hge(cba.b));
    public final j54 z0;

    static {
        k77 khb = new khb(ShareDataPickerScreen.class, "inputView", "getInputView()Lone/me/sdk/uikit/common/chat/MessageInputView;", 0);
        m7c.a.getClass();
        H0 = new k77[]{khb};
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [rr3, one.me.sdk.arch.Widget, one.me.sharedata.ShareDataPickerScreen] */
    public ShareDataPickerScreen(Bundle bundle) {
        super(bundle);
        tad tad = tad.a;
        this.z0 = new j54(tad.getAccessor().d(f03.class), tad.getAccessor().d(pae.class), tad.getAccessor().d(bv2.class), v0(bundle));
        AutoTransition autoTransition = new AutoTransition();
        autoTransition.addTarget(bba.c);
        autoTransition.addTarget(f2a.f0);
        autoTransition.addTarget(bba.a);
        autoTransition.setOrdering(0);
        autoTransition.setDuration(100);
        this.A0 = autoTransition;
        this.B0 = binding(new bbd(this, 0));
        this.C0 = createViewModelLazy(u68.class, new wq9(29, new vfc(22)));
        this.F0 = new bw5(this, 3);
        hq0 hq0 = new hq0((rr3) this, (s16) new bbd(this, 1));
        if (getRouter() != null) {
            getRouter().a(hq0);
        } else {
            addLifecycleListener(new s9(this, hq0, 12));
        }
    }

    public final sy6 getInsetsConfig() {
        return this.x0;
    }

    public final boolean handleBack() {
        sgc sgc = this.E0;
        if (sgc == null || !sgc.n()) {
            return ShareDataPickerScreen.super.handleBack();
        }
        u0().c.k.K(1);
        return true;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [one.me.sdk.arch.Widget, one.me.sharedata.ShareDataPickerScreen, one.me.chats.picker.AbstractPickerScreen] */
    public final Iterable l0() {
        flb flb = new flb(getContext());
        flb.setId(bba.c);
        flb.setBackgroundColor(km4.y0.r(flb).a().d().a.a);
        flb.setLayoutParams(new LinearLayout.LayoutParams(-1, a24.X(((float) 52) * dh4.c().getDisplayMetrics().density)));
        ez3.N(new ck5(u0().c.h, new cbd(flb, (Continuation) null), 5), getViewLifecycleScope());
        return p23.B(new View[]{flb, w0()});
    }

    public final lta m0() {
        tad tad = tad.a;
        return new b0d(this.z0, new sp2(tad.getAccessor().d(bv2.class)), tad.getAccessor().d(ap3.class), tad.getAccessor().d(f03.class), 11);
    }

    public final Widget n0(String str) {
        return new PickerChatsTabWidget2(str, false, (u16) null, (q72) null, 14, (x54) null);
    }

    public final nea o0(Context context) {
        String string = getArgs().getString("ru.ok.tamtam.extra.SHARE_TITLE", (String) null);
        if (string == null) {
            string = context.getString(cba.c);
        }
        nea nea = new nea(context, 6);
        nea.setId(bba.d);
        nea.setTransitionName(context.getString(h2a.q));
        nea.setTitle((CharSequence) string);
        nea.setForm(fea.a);
        nea.setLeftActions(new vda(new ljc(5, this)));
        return nea;
    }

    public final void onDestroyView(View view) {
        ShareDataPickerScreen.super.onDestroyView(view);
        this.D0 = null;
        this.E0 = null;
        z68 z68 = this.G0;
        if (z68 != null) {
            z68.a();
        }
        this.G0 = null;
    }

    /* JADX WARNING: type inference failed for: r20v0, types: [one.me.sdk.arch.Widget, one.me.sharedata.ShareDataPickerScreen, one.me.chats.picker.AbstractPickerScreen] */
    public final void onViewCreated(View view) {
        View view2 = view;
        ShareDataPickerScreen.super.onViewCreated(view);
        ViewGroup viewGroup = (ViewGroup) view2;
        ek8.g(s0(), I0, (u16) null);
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setId(bba.b);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        frameLayout.setLayoutParams(layoutParams);
        int i = e87.a;
        frameLayout.setTranslationY((float) e87.a(frameLayout.getContext()));
        ek8.g(frameLayout, new sy6(0, new up0(5, 1, false), 1), (u16) null);
        this.D0 = frameLayout;
        this.E0 = getChildRouter(frameLayout);
        viewGroup.addView(frameLayout);
        ez3.N(new ck5(u0().Z, new gbd(this, view2, (Continuation) null), 5), getViewLifecycleScope());
        ez3.N(new ck5(u0().c.j, new hbd(this, (Continuation) null), 5), getViewLifecycleScope());
        ViewGroup s0 = s0();
        sgc sgc = this.E0;
        az1 az1 = this.D0;
        if (sgc != null && az1 != null) {
            bbd bbd = new bbd(this, 2);
            boolean z = ((sma) tad.a.getAccessor().c(sma.class)).b && Build.VERSION.SDK_INT >= 30;
            yb7 viewLifecycleScope = getViewLifecycleScope();
            kt8 kt8 = (kt8) ((t0c) u0().c.k.c).a.getValue();
            this.G0 = new z68(sgc, az1, s0, bbd, z, viewLifecycleScope, (kt8 != null ? kt8.a : 0) == 2, new nya(this, 17, s0));
            new t68((u68) this.C0.getValue(), w0()).a(getViewLifecycleScope());
            ez3.N(new ck5(new ik5((t0c) u0().c.k.c, 2), new dbd(this, s0, (Continuation) null), 5), getViewLifecycleScope());
        }
    }

    public final mua p0() {
        b9 b9Var;
        Intent intent = (Intent) getArgs().getParcelable("ru.ok.tamtam.extra.DATA");
        if (intent != null) {
            tad tad = tad.a;
            b9Var = new ydc((Context) tad.getAccessor().c(Context.class), (g15) tad.getAccessor().c(g15.class), (bf5) tad.getAccessor().c(bf5.class), 14).s(intent);
        } else {
            b9Var = null;
        }
        b9 b9Var2 = b9Var;
        ijb ijb = new ijb();
        tad tad2 = tad.a;
        return new zad(b9Var2, ijb, this.z0, tad2.getAccessor().d(pae.class), tad2.getAccessor().d(kbd.class), tad2.getAccessor().d(m86.class));
    }

    public final zqd r0() {
        return this.y0;
    }

    public final Set v0(Bundle bundle) {
        long[] longArray = bundle.getLongArray("selected_ids");
        Set h0 = longArray != null ? cs.h0(longArray) : null;
        return h0 == null ? qw4.a : h0;
    }

    public final jq8 w0() {
        k77 k77 = H0[0];
        return (jq8) this.B0.getValue();
    }
}
