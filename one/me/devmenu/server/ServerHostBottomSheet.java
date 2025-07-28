package one.me.devmenu.server;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/devmenu/server/ServerHostBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "<init>", "()V", "dev-menu_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ServerHostBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ k77[] K0;
    public final t97 C0;
    public final AutoTransition D0 = new AutoTransition();
    public final mr5 E0;
    public final n0c F0;
    public final n0c G0;
    public final n0c H0;
    public final n0c I0;
    public final n0c J0;

    static {
        Class<ServerHostBottomSheet> cls = ServerHostBottomSheet.class;
        khb khb = new khb(cls, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0);
        n7c n7c = m7c.a;
        K0 = new k77[]{khb, wn6.e(n7c, cls, "loaderView", "getLoaderView()Lone/me/sdk/uikit/common/progressbar/OneMeProgressBar;", 0), wn6.f(cls, "customContainer", "getCustomContainer()Landroid/widget/LinearLayout;", 0, n7c), wn6.f(cls, "customInput", "getCustomInput()Lone/me/sdk/uikit/common/views/OneMeTextInput;", 0, n7c), wn6.f(cls, "customButton", "getCustomButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0, n7c)};
    }

    public ServerHostBottomSheet() {
        super((Bundle) null, 1, (x54) null);
        t97 createViewModelLazy = createViewModelLazy(kk6.class, new wq9(22, new vfc(8)));
        this.C0 = createViewModelLazy;
        this.E0 = new mr5((Object) new ozc((kk6) createViewModelLazy.getValue()), ((x4a) ff4.a.getAccessor().c(x4a.class)).a(), 8);
        this.F0 = viewBinding(cpb.server_host_recycler);
        this.G0 = viewBinding(cpb.server_host_loader);
        this.H0 = viewBinding(cpb.server_host_container);
        this.I0 = viewBinding(cpb.server_host_input);
        this.J0 = viewBinding(cpb.server_host_custom_btn);
    }

    public final void onViewCreated(View view) {
        ServerHostBottomSheet.super.onViewCreated(view);
        t97 t97 = this.C0;
        grd grd = ((kk6) t97.getValue()).w0;
        ob7 ob7 = ob7.o;
        ez3.N(new ck5(wx3.e(grd, getViewLifecycleOwner().R(), ob7), new pzc((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(((kk6) t97.getValue()).x0, getViewLifecycleOwner().R(), ob7), new qzc((Continuation) null, this, view), 5), getViewLifecycleScope());
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [mr5, f6c] */
    public final View w0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(linearLayout.getContext());
        textView.setText("Адрес сервера");
        nge.d(nte.c, textView);
        textView.setTextColor(km4.y0.r(textView).getText().e);
        textView.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        float f = (float) 12;
        float f2 = (float) 16;
        layoutParams.setMargins(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(f * dh4.c().getDisplayMetrics().density), a24.X(f2 * dh4.c().getDisplayMetrics().density));
        textView.setLayoutParams(layoutParams);
        linearLayout.addView(textView);
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), (AttributeSet) null);
        recyclerView.setId(cpb.server_host_recycler);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        recyclerView.setAdapter(this.E0);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        linearLayout.addView(recyclerView);
        a9a a9a = new a9a(linearLayout.getContext());
        a9a.setId(cpb.server_host_loader);
        linearLayout.setGravity(17);
        a9a.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        a9a.setAppearance(s8a.a);
        a9a.setSize(v8a.a);
        a9a.setVisibility(8);
        linearLayout.addView(a9a);
        LinearLayout linearLayout2 = new LinearLayout(linearLayout.getContext());
        linearLayout2.setId(cpb.server_host_container);
        linearLayout2.setOrientation(1);
        linearLayout2.setVisibility(8);
        mda mda = new mda(linearLayout2.getContext());
        mda.setId(cpb.server_host_input);
        mda.setLayoutParams(new re3(-1, -2));
        mda.setBackgroundColorAttr(Integer.valueOf(j9a.a));
        mda.setHint("Введите кастомный адрес");
        EditText editText = mda.a;
        z2 z2Var = new z2(10, this);
        editText.addTextChangedListener(z2Var);
        editText.addTextChangedListener(z2Var);
        linearLayout2.addView(mda);
        OneMeButton oneMeButton = new OneMeButton(linearLayout2.getContext(), (AttributeSet) null);
        oneMeButton.setId(cpb.server_host_custom_btn);
        re3 re3 = new re3(-1, -2);
        re3.topMargin = a24.X(((float) 8) * dh4.c().getDisplayMetrics().density);
        oneMeButton.setLayoutParams(re3);
        oneMeButton.setAppearance(s0a.o);
        oneMeButton.setSize(v0a.c);
        oneMeButton.setMode(u0a.a);
        oneMeButton.setText("Установить");
        a24.Z(oneMeButton, 300, new wfc(2, (Object) this));
        linearLayout2.addView(oneMeButton);
        linearLayout.addView(linearLayout2);
        return linearLayout;
    }
}
