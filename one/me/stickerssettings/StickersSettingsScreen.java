package one.me.stickerssettings;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/stickerssettings/StickersSettingsScreen;", "Lone/me/sdk/arch/Widget;", "Ltq3;", "Llc3;", "<init>", "()V", "stickers-settings_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class StickersSettingsScreen extends Widget implements tq3, lc3 {
    public static final /* synthetic */ k77[] Y;
    public final twd X = new twd(((x4a) uwd.a.getAccessor().c(x4a.class)).a(), new wwd(this, 2), new wwd(this, 3), new wwd(this, 4));
    public final jj7 a = new jj7(new opd(5), (s16) null, 6);
    public final t97 b = createViewModelLazy(gxd.class, new ypd(6, new opd(6)));
    public final n0c c = viewBinding(rca.f);
    public o27 o;

    static {
        k77 khb = new khb(StickersSettingsScreen.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0);
        m7c.a.getClass();
        Y = new k77[]{khb};
    }

    public StickersSettingsScreen() {
        super((Bundle) null, 0, 3, (x54) null);
        ez3.N(new ck5(l0().Y, new xwd((Continuation) null, this), 5), getLifecycleScope());
    }

    public final sy6 getInsetsConfig() {
        sy6 sy6 = sy6.c;
        return sy6.d;
    }

    public final rnc getScreenDelegate() {
        return this.a;
    }

    public final void i(int i, Bundle bundle) {
        gxd l0 = l0();
        Long l = l0.C0;
        if (l != null) {
            long longValue = l.longValue();
            l0.C0 = null;
            if (i == rca.b) {
                qod D = xs7.D(l0.a, l0.c.b(), ru3.b, new dxd(l0, longValue, (Continuation) null));
                l0.E0.o1(l0, gxd.F0[2], D);
            }
        }
    }

    public final gxd l0() {
        return (gxd) this.b.getValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        nea nea = new nea(linearLayout.getContext(), 6);
        nea.setId(rca.x);
        nea.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        nea.setTitle(sca.G);
        nea.setForm(fea.a);
        nea.setLeftActions(new vda(new wwd(this, 0)));
        linearLayout.addView(nea);
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), (AttributeSet) null);
        recyclerView.setId(rca.f);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.X);
        sic sic = new sic(17, this);
        s59 s59 = km4.y0;
        recyclerView.j(new qtc(s59.r(recyclerView), sic, (o8) null, 12));
        recyclerView.j(new hk3(s59.r(recyclerView)));
        recyclerView.j(new ix0(6));
        o27 o27 = new o27(new i27(new bk(18, this), new wwd(this, 1)));
        this.o = o27;
        o27.i(recyclerView);
        linearLayout.addView(recyclerView);
        urd.B(new o(3, (Continuation) null, 14), linearLayout);
        return linearLayout;
    }

    public final void onDestroyView(View view) {
        ((RecyclerView) this.c.T0(this, Y[0])).setAdapter((f6c) null);
        o27 o27 = this.o;
        if (o27 != null) {
            o27.i((RecyclerView) null);
        }
        this.o = null;
        StickersSettingsScreen.super.onDestroyView(view);
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        l05 l05 = l0().Z;
        ob7 ob7 = ob7.o;
        ez3.N(new ck5(wx3.e(l05, getViewLifecycleOwner().R(), ob7), new ywd((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(l0().w0, getViewLifecycleOwner().R(), ob7), new zwd((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final void y(int i, Bundle bundle) {
        gxd l0 = l0();
        Long l = l0.B0;
        if (l != null) {
            long longValue = l.longValue();
            l0.B0 = null;
            qod D = xs7.D(l0.a, l0.c.a(), ru3.b, new fxd(l0, longValue, i, (Continuation) null));
            l0.D0.o1(l0, gxd.F0[1], D);
        }
    }
}
