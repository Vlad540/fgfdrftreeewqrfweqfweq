package one.me.notifications.settings.screens.dialog;

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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/notifications/settings/screens/dialog/DialogNotificationsSettingsScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "notifications-settings_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class DialogNotificationsSettingsScreen extends Widget {
    public static final /* synthetic */ k77[] Y;
    public final nl0 X = binding(new kg4(this, 1));
    public final sy6 a = sy6.d;
    public final t97 b = createViewModelLazy(ng4.class, new rh2(26, new xd3(16)));
    public final g7d c = new g7d(new mb1(8, this), mq9.a.getExecutors().a());
    public final nl0 o = binding(new kg4(this, 0));

    static {
        Class<DialogNotificationsSettingsScreen> cls = DialogNotificationsSettingsScreen.class;
        Y = new k77[]{new khb(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), wn6.e(m7c.a, cls, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0)};
    }

    public DialogNotificationsSettingsScreen() {
        super((Bundle) null, 0, 3, (x54) null);
    }

    public final sy6 getInsetsConfig() {
        return this.a;
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [one.me.sdk.lists.widgets.EndlessRecyclerView2, android.view.View] */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setId(q7a.i);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        float f = (float) 12;
        linearLayout.setPaddingRelative(a24.X(dh4.c().getDisplayMetrics().density * f), 0, a24.X(f * dh4.c().getDisplayMetrics().density), 0);
        k77[] k77Arr = Y;
        k77 k77 = k77Arr[0];
        linearLayout.addView((nea) this.o.getValue());
        k77 k772 = k77Arr[1];
        linearLayout.addView((EndlessRecyclerView2) this.X.getValue());
        urd.B(new o(3, (Continuation) null, 3), linearLayout);
        return linearLayout;
    }

    public final void onViewCreated(View view) {
        ez3.N(new ck5(wx3.e(((ng4) this.b.getValue()).Y, getViewLifecycleOwner().R(), ob7.o), new lg4((Continuation) null, this), 5), getViewLifecycleScope());
    }
}
