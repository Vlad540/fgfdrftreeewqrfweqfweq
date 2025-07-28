package one.me.stickerssearch;

import android.app.Activity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/stickerssearch/StickersSearchScreen;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "stickers-search_release"}, k = 1, mv = {2, 0, 0})
public final class StickersSearchScreen extends Widget {
    public static final /* synthetic */ k77[] y0;
    public final n0c X;
    public final n0c Y;
    public final nl0 Z;
    public final jr a = new jr(Long.class, "chat_id");
    public final t97 b = createViewModelLazy(cwd.class, new ypd(5, new svd(this, 0)));
    public final t97 c;
    public final er7 o;
    public final nl0 w0;
    public final cpf x0;

    static {
        Class<StickersSearchScreen> cls = StickersSearchScreen.class;
        k77 khb = new khb(cls, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0);
        n7c n7c = m7c.a;
        y0 = new k77[]{khb, wn6.e(n7c, cls, "stickersRecycler", "getStickersRecycler()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0), wn6.f(cls, "searchView", "getSearchView()Lone/me/sdk/uikit/common/search/OneMeSearchView;", 0, n7c)};
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.Object, er7] */
    public StickersSearchScreen(Bundle bundle) {
        super(bundle, 0, 2, (x54) null);
        qvd qvd = qvd.a;
        this.c = qvd.getAccessor().d(fr7.class);
        this.o = new Object();
        this.X = viewBinding(oca.a);
        this.Y = viewBinding(oca.b);
        this.Z = binding(new svd(this, 1));
        this.w0 = binding(new svd(this, 2));
        this.x0 = new cpf(((x4a) qvd.getAccessor().c(x4a.class)).a(), new u5g(28, this));
    }

    public final sy6 getInsetsConfig() {
        sy6 sy6 = sy6.c;
        return sy6.d;
    }

    public final EndlessRecyclerView2 l0() {
        return (EndlessRecyclerView2) this.X.T0(this, y0[1]);
    }

    public final cwd m0() {
        return (cwd) this.b.getValue();
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
        urd.B(new d78(3, (Continuation) null, 3), frameLayout);
        raa raa = new raa(frameLayout.getContext());
        raa.setId(oca.b);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        float f = (float) 12;
        layoutParams.rightMargin = a24.X(dh4.c().getDisplayMetrics().density * f);
        raa.setLayoutParams(layoutParams);
        raa.setSearchHint(raa.getContext().getString(pca.a));
        raa.c(true);
        raa.setListener(new tvd(this));
        frameLayout.addView(raa);
        RecyclerView endlessRecyclerView2 = new EndlessRecyclerView2(frameLayout.getContext(), (AttributeSet) null, 6);
        endlessRecyclerView2.setId(oca.a);
        endlessRecyclerView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        endlessRecyclerView2.setClipToPadding(false);
        endlessRecyclerView2.setClipChildren(false);
        int X2 = a24.X(f * dh4.c().getDisplayMetrics().density);
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
        raa raa = (raa) this.Y.T0(this, y0[2]);
        afa.a(raa, new q36(raa, l0, this, 21));
        int t = gp0.t(l0.getContext());
        l0.getContext();
        l0.setLayoutManager(new GridLayoutManager(t));
        l0.setItemAnimator((k6c) null);
        l0.j(new ix0(t, a24.X(((float) 4) * dh4.c().getDisplayMetrics().density), 7));
        l0.k(new i87(4, this));
        l0.setPager(new t61(this, 9));
        l0.setIgnoreRefreshingFlagsForScrollEvent(true);
        l0.setAdapter(this.x0);
        t0c t0c = m0().w0;
        pc7 R = this.lifecycleOwner.R();
        ob7 ob7 = ob7.o;
        ez3.N(new ck5(wx3.e(t0c, R, ob7), new kbb(2, this, StickersSearchScreen.class, "handleNewState", "handleNewState(Lone/me/stickerssearch/model/SearchState;)V", 4, 10), 5), getLifecycleScope());
        ez3.N(new ck5(wx3.e(m0().x0, this.lifecycleOwner.R(), ob7), new kbb(2, this, StickersSearchScreen.class, "handleNavEvents", "handleNavEvents(Lone/me/sdk/arch/event/NavigationEvent;)V", 4, 11), 5), getLifecycleScope());
    }
}
