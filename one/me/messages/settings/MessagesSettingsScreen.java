package one.me.messages.settings;

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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/messages/settings/MessagesSettingsScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "message-settings_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class MessagesSettingsScreen extends Widget {
    public static final /* synthetic */ k77[] Y;
    public final g7d X;
    public final jj7 a = new jj7(new ib7(29), (s16) null, 6);
    public final sy6 b = sy6.d;
    public final t97 c;
    public final n0c o;

    static {
        k77 khb = new khb(MessagesSettingsScreen.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0);
        m7c.a.getClass();
        Y = new k77[]{khb};
    }

    public MessagesSettingsScreen() {
        super((Bundle) null, 0, 3, (x54) null);
        t97 createViewModelLazy = createViewModelLazy(o29.class, new js5(28, new m29(0)));
        this.c = createViewModelLazy;
        this.o = viewBinding(i7a.a);
        g7d g7d = new g7d(new mb1(17, this), ((x4a) i29.a.getAccessor().c(x4a.class)).a());
        this.X = g7d;
        ez3.N(new ck5(((o29) createViewModelLazy.getValue()).o, new hp0(2, g7d, g7d.class, "submitList", "submitList(Ljava/util/List;)V", 4, 21), 5), getLifecycleScope());
    }

    public final sy6 getInsetsConfig() {
        return this.b;
    }

    public final rnc getScreenDelegate() {
        return this.a;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        nea nea = new nea(linearLayout.getContext(), 6);
        nea.setId(i7a.b);
        nea.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        nea.setTitle(j7a.c);
        nea.setForm(fea.a);
        nea.setLeftActions(new vda(new e98(6, this)));
        linearLayout.addView(nea);
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), (AttributeSet) null);
        recyclerView.setId(i7a.a);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.X);
        recyclerView.j(new qtc(km4.y0.r(recyclerView), new be8(21), (o8) null, 12));
        recyclerView.j(new ix0(2));
        linearLayout.addView(recyclerView);
        urd.B(new o(3, (Continuation) null, 6), linearLayout);
        return linearLayout;
    }

    public final void onDestroyView(View view) {
        ((RecyclerView) this.o.T0(this, Y[0])).setAdapter((f6c) null);
        MessagesSettingsScreen.super.onDestroyView(view);
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ez3.N(new ck5(wx3.e(((o29) this.c.getValue()).X, getViewLifecycleOwner().R(), ob7.o), new n29((Continuation) null, this), 5), getViewLifecycleScope());
    }
}
