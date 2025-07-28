package one.me.aboutappsettings;

import android.annotation.SuppressLint;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/aboutappsettings/AboutAppSettingsScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "about-app-settings_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class AboutAppSettingsScreen extends Widget {
    public static final /* synthetic */ int c = 0;
    public final t97 a = createViewModelLazy(v.class, new s(0, new m(0)));
    public final mr5 b = new mr5(((x4a) h.a.getAccessor().d(x4a.class).getValue()).a(), (Object) new n(this), 1);

    public AboutAppSettingsScreen() {
        super((Bundle) null, 0, 3, (x54) null);
    }

    public final sy6 getInsetsConfig() {
        sy6 sy6 = sy6.c;
        return sy6.d;
    }

    /* JADX WARNING: type inference failed for: r9v6, types: [mr5, f6c] */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        nea nea = new nea(getContext(), 6);
        nea.setForm(fea.a);
        nea.setTitle(cy9.a);
        nea.setLeftActions(new vda(new l(0, this)));
        RecyclerView recyclerView = new RecyclerView(getContext(), (AttributeSet) null);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        float f = (float) 12;
        recyclerView.setPaddingRelative(a24.X(dh4.c().getDisplayMetrics().density * f), recyclerView.getPaddingTop(), a24.X(f * dh4.c().getDisplayMetrics().density), recyclerView.getPaddingBottom());
        recyclerView.setLayoutParams(layoutParams);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.b);
        recyclerView.j(new qtc(km4.y0.r(recyclerView), new pv0(6), (o8) null, 8));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        linearLayout.addView(nea);
        linearLayout.addView(recyclerView);
        urd.B(new o(3, (Continuation) null, 0), linearLayout);
        return linearLayout;
    }

    public final void onViewCreated(View view) {
        AboutAppSettingsScreen.super.onViewCreated(view);
        t97 t97 = this.a;
        t0c t0c = ((v) t97.getValue()).X;
        ob7 ob7 = ob7.o;
        ez3.N(new ck5(wx3.e(t0c, getViewLifecycleOwner().R(), ob7), new p((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(((v) t97.getValue()).c, getViewLifecycleOwner().R(), ob7), new q((Continuation) null, this), 5), getViewLifecycleScope());
    }
}
