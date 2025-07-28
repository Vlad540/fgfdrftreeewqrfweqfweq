package one.me.notifications.settings;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/notifications/settings/NotificationsSettingsScreen;", "Lone/me/sdk/arch/Widget;", "Lsn3;", "Lzma;", "<init>", "()V", "notifications-settings_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class NotificationsSettingsScreen extends Widget implements sn3, zma {
    public static final /* synthetic */ k77[] z0;
    public final g7d X;
    public final t97 Y;
    public final mr5 Z;
    public final jj7 a = new jj7(new m29(4), (s16) null, 6);
    public final sy6 b = sy6.d;
    public final t97 c = createViewModelLazy(cr9.class, new wq9(0, new m29(5)));
    public final t97 o;
    public final nl0 w0;
    public final nl0 x0;
    public final nl0 y0;

    static {
        Class<NotificationsSettingsScreen> cls = NotificationsSettingsScreen.class;
        k77 khb = new khb(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0);
        n7c n7c = m7c.a;
        z0 = new k77[]{khb, wn6.e(n7c, cls, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0), wn6.f(cls, "resetDefaultsButton", "getResetDefaultsButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0, n7c)};
    }

    public NotificationsSettingsScreen() {
        super((Bundle) null, 0, 3, (x54) null);
        mq9 mq9 = mq9.a;
        this.o = mq9.getAccessor().d(qna.class);
        this.X = new g7d(new mb1(18, this), mq9.getExecutors().a());
        this.Y = createViewModelLazy(xf0.class, new wq9(1, new m29(6)));
        this.Z = new mr5(this, mq9.getExecutors().a(), 3);
        this.w0 = binding(new pq9(this, 0));
        this.x0 = binding(new pq9(this, 1));
        this.y0 = binding(new pq9(this, 2));
    }

    public final void X(boolean z) {
        if (!z) {
            cr9 l0 = l0();
            l0.x0.m((Object) null, Boolean.TRUE);
        }
    }

    public final sy6 getInsetsConfig() {
        return this.b;
    }

    public final rnc getScreenDelegate() {
        return this.a;
    }

    public final cr9 l0() {
        return (cr9) this.c.getValue();
    }

    public final void onAttach(View view) {
        NotificationsSettingsScreen.super.onAttach(view);
        cr9 l0 = l0();
        l0.A0.m((Object) null, Boolean.valueOf(l0.b.b()));
    }

    /* JADX WARNING: type inference failed for: r3v8, types: [one.me.sdk.lists.widgets.EndlessRecyclerView2, android.view.View] */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setId(q7a.n);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        k77[] k77Arr = z0;
        k77 k77 = k77Arr[0];
        linearLayout.addView((nea) this.w0.getValue());
        k77 k772 = k77Arr[1];
        linearLayout.addView((EndlessRecyclerView2) this.x0.getValue());
        k77 k773 = k77Arr[2];
        linearLayout.addView((OneMeButton) this.y0.getValue());
        urd.B(new o(3, (Continuation) null, 7), linearLayout);
        return linearLayout;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 177) {
            cr9 l0 = l0();
            boolean z = false;
            if (iArr[0] != 0) {
                z = true;
            }
            l0.x0.m((Object) null, Boolean.valueOf(z));
        }
    }

    public final void onViewCreated(View view) {
        t0c t0c = l0().z0;
        ob7 ob7 = ob7.o;
        ez3.N(new ck5(wx3.e(t0c, getViewLifecycleOwner().R(), ob7), new rq9((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(new v11(((xf0) this.Y.getValue()).w0, l0().y0, new ah1(3, (Continuation) null, 4), 4), getViewLifecycleOwner().R(), ob7), new sq9((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(l0().w0, getViewLifecycleOwner().R(), ob7), new tq9((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(l0().C0, getViewLifecycleOwner().R(), ob7), new uq9((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final void w(int i) {
        if (i == 5) {
            cr9 l0 = l0();
            l0.getClass();
            taf.o(l0.C0, oq9.b);
        }
    }
}
