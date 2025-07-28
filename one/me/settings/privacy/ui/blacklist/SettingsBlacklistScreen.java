package one.me.settings.privacy.ui.blacklist;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lone/me/settings/privacy/ui/blacklist/SettingsBlacklistScreen;", "Lone/me/sdk/arch/Widget;", "Llc3;", "<init>", "()V", "settings-privacy_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class SettingsBlacklistScreen extends Widget implements lc3 {
    public static final /* synthetic */ k77[] Z;
    public final n0c X = viewBinding(vaa.a);
    public final mr5 Y = new mr5(new x3a(23, this), ((x4a) y8d.a.getAccessor().c(x4a.class)).a(), 13);
    public final jj7 a = new jj7(mnc.SETTINGS_PRIVACY_BLOCK_LIST);
    public final sy6 b = sy6.d;
    public final t97 c = createViewModelLazy(k6d.class, new wq9(25, new vfc(12)));
    public final n0c o = viewBinding(vaa.b);

    static {
        Class<SettingsBlacklistScreen> cls = SettingsBlacklistScreen.class;
        Z = new k77[]{new khb(cls, "recycler", "getRecycler()Lone/me/sdk/lists/widgets/EndlessRecyclerView;", 0), wn6.e(m7c.a, cls, "emptyState", "getEmptyState()Lone/me/sdk/uikit/common/emptyview/OneMeEmptyView;", 0)};
    }

    public SettingsBlacklistScreen() {
        super((Bundle) null, 0, 3, (x54) null);
    }

    public final sy6 getInsetsConfig() {
        return this.b;
    }

    public final rnc getScreenDelegate() {
        return this.a;
    }

    public final void i(int i, Bundle bundle) {
        if (i == vaa.d) {
            k6d l0 = l0();
            l0.getClass();
            if (bundle != null) {
                taf.n(l0, ((pae) l0.w0.getValue()).b(), (ru3) null, new j6d(l0, bundle.getLong("user_unblock_id"), (Continuation) null), 2);
            }
        }
    }

    public final k6d l0() {
        return (k6d) this.c.getValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        nea nea = new nea(linearLayout.getContext(), 6);
        nea.setId(vaa.c);
        nea.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        nea.setTitle(xaa.e);
        nea.setForm(fea.a);
        nea.setLeftActions(new vda(new ljc(3, this)));
        linearLayout.addView(nea);
        ConstraintLayout p4a = new p4a(linearLayout.getContext(), (AttributeSet) null);
        p4a.setId(vaa.a);
        p4a.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        p4a.setIcon(phc.l0);
        p4a.setTitle(new hge(xaa.d));
        p4a.onThemeChanged(km4.y0.r(p4a));
        linearLayout.addView(p4a);
        RecyclerView ty4 = new ty4(linearLayout.getContext(), (AttributeSet) null);
        ty4.setId(vaa.b);
        ty4.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        ty4.getContext();
        ty4.setLayoutManager(new LinearLayoutManager());
        ty4.setAdapter(this.Y);
        ty4.setHasFixedSize(true);
        ty4.setPager(l0());
        linearLayout.addView(ty4);
        urd.B(new o(3, (Continuation) null, 12), linearLayout);
        return linearLayout;
    }

    public final void onDestroyView(View view) {
        ((ty4) this.o.T0(this, Z[0])).setAdapter((f6c) null);
        SettingsBlacklistScreen.super.onDestroyView(view);
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        t0c t0c = l0().y0;
        ob7 ob7 = ob7.o;
        ez3.N(new ck5(wx3.e(t0c, getViewLifecycleOwner().R(), ob7), new d6d((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(l0().C0, getViewLifecycleOwner().R(), ob7), new e6d((Continuation) null, this), 5), getViewLifecycleScope());
    }
}
