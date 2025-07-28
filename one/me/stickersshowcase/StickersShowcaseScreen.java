package one.me.stickersshowcase;

import android.app.Activity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/stickersshowcase/StickersShowcaseScreen;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "stickers-showcase_release"}, k = 1, mv = {2, 0, 0})
public final class StickersShowcaseScreen extends Widget {
    public static final /* synthetic */ k77[] z0;
    public final n0c X;
    public final n0c Y;
    public final nl0 Z;
    public final jr a = new jr(Long.class, 0L, "chat_id");
    public final t97 b = createViewModelLazy(sxd.class, new ypd(7, new jxd(this, 0)));
    public final t97 c;
    public final er7 o;
    public final nl0 w0;
    public gba x0;
    public final z51 y0;

    static {
        Class<StickersShowcaseScreen> cls = StickersShowcaseScreen.class;
        k77 khb = new khb(cls, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0);
        n7c n7c = m7c.a;
        z0 = new k77[]{khb, wn6.e(n7c, cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), wn6.f(cls, "setsRecycler", "getSetsRecycler()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0, n7c)};
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.Object, er7] */
    public StickersShowcaseScreen(Bundle bundle) {
        super(bundle, 0, 2, (x54) null);
        hxd hxd = hxd.a;
        this.c = hxd.getAccessor().d(fr7.class);
        ? obj = new Object();
        this.o = obj;
        this.X = viewBinding(tca.b);
        this.Y = viewBinding(tca.a);
        this.Z = binding(new jxd(this, 1));
        this.w0 = binding(new jxd(this, 2));
        this.y0 = new z51(((x4a) hxd.getAccessor().c(x4a.class)).a(), obj, new mv4(24, this));
    }

    public final sy6 getInsetsConfig() {
        sy6 sy6 = sy6.c;
        return sy6.d;
    }

    public final EndlessRecyclerView2 l0() {
        return (EndlessRecyclerView2) this.Y.T0(this, z0[2]);
    }

    public final sxd m0() {
        return (sxd) this.b.getValue();
    }

    public final void onActivityPaused(Activity activity) {
        ((fr7) this.c.getValue()).a(this.o);
    }

    public final void onActivityResumed(Activity activity) {
        ((fr7) this.c.getValue()).b(this.o);
    }

    public final void onChangeStarted(wr3 wr3, xr3 xr3) {
        super.onChangeStarted(wr3, xr3);
        xr3 xr32 = xr3.X;
        t97 t97 = this.c;
        er7 er7 = this.o;
        if (xr3 == xr32 || xr3 == xr3.c) {
            ((fr7) t97.getValue()).b(er7);
        } else if (xr3 == xr3.o) {
            ((fr7) t97.getValue()).a(er7);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        urd.B(new d78(3, (Continuation) null, 4), frameLayout);
        nea nea = new nea(frameLayout.getContext(), 6);
        nea.setId(tca.b);
        nea.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        nea.setTitle(uca.a);
        nea.setForm(fea.a);
        nea.setRightActions(new aea(new iea(new zv5(this, 1)), new gea(l9a.y, new u1c(10))));
        nea.setLeftActions(new vda(new ljc(8, this)));
        frameLayout.addView(nea);
        RecyclerView endlessRecyclerView2 = new EndlessRecyclerView2(frameLayout.getContext(), (AttributeSet) null, 6);
        endlessRecyclerView2.setId(tca.a);
        endlessRecyclerView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        endlessRecyclerView2.setClipToPadding(false);
        endlessRecyclerView2.setClipChildren(false);
        int X2 = a24.X(((float) 12) * dh4.c().getDisplayMetrics().density);
        endlessRecyclerView2.setPadding(X2, endlessRecyclerView2.getPaddingTop(), X2, endlessRecyclerView2.getPaddingBottom());
        frameLayout.addView(endlessRecyclerView2);
        return frameLayout;
    }

    public final void onDestroyView(View view) {
        this.o.b();
        EndlessRecyclerView2 l0 = l0();
        l0.setAdapter((f6c) null);
        l0.setPager((ny4) null);
    }

    public final void onViewCreated(View view) {
        RecyclerView l0 = l0();
        nea nea = (nea) this.X.T0(this, z0[1]);
        afa.a(nea, new p36(nea, l0, this, 24));
        l0.getContext();
        l0.setLayoutManager(new LinearLayoutManager());
        l0.setItemAnimator((k6c) null);
        l0.j(new vi2(a24.X(((float) 6) * dh4.c().getDisplayMetrics().density), a24.X(((float) 8) * dh4.c().getDisplayMetrics().density), 6));
        l0.setPager(new t61(this, 10));
        l0.setIgnoreRefreshingFlagsForScrollEvent(true);
        l0.setAdapter(this.y0);
        ez3.N(new ck5(m0().A0, new kbb(2, this, StickersShowcaseScreen.class, "handleNewState", "handleNewState(Lone/me/stickersshowcase/model/ShowcaseState;)V", 4, 15), 5), getViewLifecycleScope());
        ez3.N(new ck5(m0().x0, new kbb(2, this, StickersShowcaseScreen.class, "handleEvents", "handleEvents(Lone/me/stickersshowcase/ShowcaseEvent;)V", 4, 16), 5), getViewLifecycleScope());
        ez3.N(new ck5(m0().y0, new kbb(2, this, StickersShowcaseScreen.class, "handleNavEvents", "handleNavEvents(Lone/me/sdk/arch/event/NavigationEvent;)V", 4, 17), 5), getViewLifecycleScope());
    }
}
