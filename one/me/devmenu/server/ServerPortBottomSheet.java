package one.me.devmenu.server;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.Metadata;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/devmenu/server/ServerPortBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "<init>", "()V", "dev-menu_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ServerPortBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ k77[] F0;
    public final t97 C0 = createViewModelLazy(f1b.class, new wq9(23, new vfc(9)));
    public final n0c D0 = viewBinding(cpb.server_port_input);
    public final n0c E0 = viewBinding(cpb.server_port_custom_btn);

    static {
        Class<ServerPortBottomSheet> cls = ServerPortBottomSheet.class;
        F0 = new k77[]{new khb(cls, "customInput", "getCustomInput()Lone/me/sdk/uikit/common/views/OneMeTextInput;", 0), wn6.e(m7c.a, cls, "customButton", "getCustomButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0)};
    }

    public ServerPortBottomSheet() {
        super((Bundle) null, 1, (x54) null);
    }

    public final View w0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(linearLayout.getContext());
        textView.setText("Порт сервера");
        nge.d(nte.c, textView);
        textView.setTextColor(km4.y0.r(textView).getText().e);
        textView.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        float f = (float) 12;
        float f2 = (float) 16;
        layoutParams.setMargins(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(f * dh4.c().getDisplayMetrics().density), a24.X(f2 * dh4.c().getDisplayMetrics().density));
        textView.setLayoutParams(layoutParams);
        linearLayout.addView(textView);
        mda mda = new mda(linearLayout.getContext());
        mda.setId(cpb.server_port_input);
        mda.setText(((f03) ((f1b) this.C0.getValue()).b.getValue()).C());
        mda.setLayoutParams(new re3(-1, -2));
        mda.setBackgroundColorAttr(Integer.valueOf(j9a.a));
        mda.setHint("Введите кастомный порт");
        mda.setInputType(2);
        EditText editText = mda.a;
        z2 z2Var = new z2(11, this);
        editText.addTextChangedListener(z2Var);
        editText.addTextChangedListener(z2Var);
        linearLayout.addView(mda);
        OneMeButton oneMeButton = new OneMeButton(linearLayout.getContext(), (AttributeSet) null);
        oneMeButton.setId(cpb.server_port_custom_btn);
        re3 re3 = new re3(-1, -2);
        re3.topMargin = a24.X(((float) 8) * dh4.c().getDisplayMetrics().density);
        oneMeButton.setLayoutParams(re3);
        oneMeButton.setAppearance(s0a.o);
        oneMeButton.setSize(v0a.c);
        oneMeButton.setMode(u0a.a);
        oneMeButton.setText("Установить");
        a24.Z(oneMeButton, 300, new xv5(this, 28, oneMeButton));
        linearLayout.addView(oneMeButton);
        return linearLayout;
    }
}
