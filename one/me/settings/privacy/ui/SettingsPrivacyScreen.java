package one.me.settings.privacy.ui;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/settings/privacy/ui/SettingsPrivacyScreen;", "Lone/me/sdk/arch/Widget;", "Llc3;", "Ldz4;", "<init>", "()V", "settings-privacy_release"}, k = 1, mv = {2, 0, 0})
public final class SettingsPrivacyScreen extends Widget implements lc3, dz4 {
    public static final /* synthetic */ k77[] Z;
    public static final String w0 = "settings-privacy";
    public final n0c X = viewBinding(vaa.r);
    public final v8d Y;
    public final jj7 a = new jj7(mnc.SETTINGS_PRIVACY);
    public final sy6 b = sy6.d;
    public final t97 c = createViewModelLazy(t9d.class, new wq9(27, new d9d(this, 0)));
    public final String o = w0;

    static {
        k77 khb = new khb(SettingsPrivacyScreen.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0);
        m7c.a.getClass();
        Z = new k77[]{khb};
    }

    public SettingsPrivacyScreen() {
        super((Bundle) null, 0, 3, (x54) null);
        v8d v8d = new v8d(new lhd(27, (Object) this), ((x4a) y8d.a.getAccessor().c(x4a.class)).a());
        this.Y = v8d;
        ez3.N(new ck5(l0().D0, new kbb(2, v8d, v8d.class, "submitList", "submitList(Ljava/util/List;)V", 4, 3), 5), getLifecycleScope());
    }

    public final sy6 getInsetsConfig() {
        return this.b;
    }

    /* renamed from: getScopeId-IluPPks  reason: not valid java name */
    public final String m30getScopeIdIluPPks() {
        return this.o;
    }

    public final rnc getScreenDelegate() {
        return this.a;
    }

    /* JADX WARNING: type inference failed for: r6v29, types: [v5d, sg9] */
    public final void i(int i, Bundle bundle) {
        t9d l0 = l0();
        l0.getClass();
        int i2 = vaa.l;
        e3 e3Var = l0.E0;
        if (i == i2) {
            e3Var.o1(l0, t9d.Q0[0], taf.n(l0, (hu3) null, (ru3) null, new n9d(l0, true, (Continuation) null), 3));
        } else if (i == vaa.m) {
            if (((kp) l0.s()).g.getBoolean("app.privacy.online.show", true)) {
                l0.w(v5d.g);
            }
        } else if (i == vaa.o) {
        } else {
            if (i == vaa.n) {
                e3Var.o1(l0, t9d.Q0[0], taf.n(l0, (hu3) null, (ru3) null, new n9d(l0, false, (Continuation) null), 3));
                return;
            }
            int i3 = vaa.h;
            e3 e3Var2 = l0.F0;
            if (i == i3) {
                e3Var2.o1(l0, t9d.Q0[1], taf.n(l0, (hu3) null, (ru3) null, new r9d(l0, 1, (Continuation) null), 3));
            } else if (i == vaa.i) {
                e3Var2.o1(l0, t9d.Q0[1], taf.n(l0, (hu3) null, (ru3) null, new r9d(l0, 3, (Continuation) null), 3));
            } else {
                int i4 = vaa.f;
                e3 e3Var3 = l0.G0;
                if (i == i4) {
                    e3Var3.o1(l0, t9d.Q0[2], taf.n(l0, (hu3) null, (ru3) null, new q9d(l0, 1, (Continuation) null), 3));
                } else if (i == vaa.g) {
                    e3Var3.o1(l0, t9d.Q0[2], taf.n(l0, (hu3) null, (ru3) null, new q9d(l0, 3, (Continuation) null), 3));
                } else {
                    int i5 = vaa.p;
                    e3 e3Var4 = l0.H0;
                    if (i == i5) {
                        e3Var4.o1(l0, t9d.Q0[3], taf.n(l0, (hu3) null, (ru3) null, new s9d(l0, 1, (Continuation) null), 3));
                    } else if (i == vaa.q) {
                        e3Var4.o1(l0, t9d.Q0[3], taf.n(l0, (hu3) null, (ru3) null, new s9d(l0, 3, (Continuation) null), 3));
                    } else if (i == vaa.k && l0.J0 == null) {
                        String d = ((b9e) l0.Z.getValue()).d();
                        List singletonList = (d == null || h0e.c0(d)) ? hw4.a : Collections.singletonList(d);
                        gy9 gy9 = (gy9) l0.r();
                        l0.J0 = Long.valueOf(gy9.v(gy9, new m92(1, ((j2b) gy9.z()).a.n(), singletonList)));
                    }
                }
            }
        }
    }

    public final t9d l0() {
        return (t9d) this.c.getValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        nea nea = new nea(linearLayout.getContext(), 6);
        nea.setId(vaa.u);
        nea.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        nea.setTitle(xaa.E);
        nea.setForm(fea.a);
        nea.setLeftActions(new vda(new ljc(4, this)));
        linearLayout.addView(nea);
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), (AttributeSet) null);
        recyclerView.setId(vaa.r);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.Y);
        recyclerView.setItemAnimator((k6c) null);
        recyclerView.j(new qtc(km4.y0.r(recyclerView), new sic(9, this), (o8) null, 12));
        recyclerView.j(new ix0(5));
        recyclerView.j(new g9d(recyclerView.getContext()));
        linearLayout.addView(recyclerView);
        urd.B(new o(3, (Continuation) null, 13), linearLayout);
        return linearLayout;
    }

    public final void onDestroyView(View view) {
        ((RecyclerView) this.X.T0(this, Z[0])).setAdapter((f6c) null);
        SettingsPrivacyScreen.super.onDestroyView(view);
    }

    public final void onViewCreated(View view) {
        t9d l0 = l0();
        taf.n(l0, l0.o.a(), (ru3) null, new l9d(l0, (Continuation) null), 2);
        s0c s0c = l0().O0;
        ob7 ob7 = ob7.o;
        ez3.N(new ck5(wx3.e(s0c, getViewLifecycleOwner().R(), ob7), new e9d((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(l0().P0, getViewLifecycleOwner().R(), ob7), new f9d((Continuation) null, this), 5), getViewLifecycleScope());
    }
}
