package one.me.devmenu.utils;

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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B)\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u0004\u0010\f¨\u0006\u000e"}, d2 = {"Lone/me/devmenu/utils/LongValueBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "initialValue", "buttonId", "", "", "descriptions", "(JJ[Ljava/lang/String;)V", "vq7", "dev-menu_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class LongValueBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ k77[] H0;
    public final jr C0;
    public final jr D0;
    public final jr E0;
    public final n0c F0;
    public final n0c G0;

    static {
        Class<LongValueBottomSheet> cls = LongValueBottomSheet.class;
        khb khb = new khb(cls, "initialValue", "getInitialValue()J", 0);
        n7c n7c = m7c.a;
        H0 = new k77[]{khb, wn6.e(n7c, cls, "buttonId", "getButtonId()J", 0), wn6.f(cls, "descriptions", "getDescriptions()[Ljava/lang/String;", 0, n7c), wn6.f(cls, "customInput", "getCustomInput()Lone/me/sdk/uikit/common/views/OneMeTextInput;", 0, n7c), wn6.f(cls, "customButton", "getCustomButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0, n7c)};
    }

    public LongValueBottomSheet(Bundle bundle) {
        super(bundle);
        Class<Long> cls = Long.class;
        this.C0 = new jr(cls, "arg:value");
        this.D0 = new jr(cls, "arg:button_id");
        this.E0 = new jr(String[].class, "arg:descriptions");
        this.F0 = viewBinding(dpb.long_bottom_sheet_input);
        this.G0 = viewBinding(dpb.long_bottom_sheet_button);
    }

    public final View w0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(linearLayout.getContext());
        textView.setText("Значение рубильника");
        nge.d(nte.c, textView);
        s59 s59 = km4.y0;
        textView.setTextColor(s59.r(textView).getText().e);
        textView.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        float f = (float) 12;
        float f2 = (float) 16;
        layoutParams.setMargins(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f2 * dh4.c().getDisplayMetrics().density));
        textView.setLayoutParams(layoutParams);
        linearLayout.addView(textView);
        mda mda = new mda(linearLayout.getContext());
        mda.setId(dpb.long_bottom_sheet_input);
        k77[] k77Arr = H0;
        k77 k77 = k77Arr[0];
        mda.setText(String.valueOf(((Number) this.C0.a(this)).longValue()));
        mda.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        mda.setBackgroundColorAttr(Integer.valueOf(j9a.a));
        mda.setHint("Введите кастомное значение");
        mda.setInputType(2);
        EditText editText = mda.a;
        z2 z2Var = new z2(3, this);
        editText.addTextChangedListener(z2Var);
        editText.addTextChangedListener(z2Var);
        linearLayout.addView(mda);
        k77 k772 = k77Arr[2];
        for (String text : (String[]) this.E0.a(this)) {
            TextView textView2 = new TextView(linearLayout.getContext());
            textView2.setText(text);
            nge.d(nte.l, textView2);
            textView2.setTextColor(s59.r(textView2).getText().e);
            textView2.setGravity(8388611);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            float f3 = (float) 8;
            layoutParams2.setMargins(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f3 * dh4.c().getDisplayMetrics().density));
            textView2.setLayoutParams(layoutParams2);
            linearLayout.addView(textView2);
        }
        OneMeButton oneMeButton = new OneMeButton(linearLayout.getContext(), (AttributeSet) null);
        oneMeButton.setId(dpb.long_bottom_sheet_button);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = a24.X(((float) 8) * dh4.c().getDisplayMetrics().density);
        oneMeButton.setLayoutParams(layoutParams3);
        oneMeButton.setAppearance(s0a.o);
        oneMeButton.setSize(v0a.c);
        oneMeButton.setMode(u0a.a);
        oneMeButton.setText("Установить");
        a24.Z(oneMeButton, 300, new xv5(this, 7, oneMeButton));
        linearLayout.addView(oneMeButton);
        return linearLayout;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LongValueBottomSheet(long j, long j2, String[] strArr, int i, x54 x54) {
        this(j, j2, (i & 4) != 0 ? new String[0] : strArr);
    }

    public LongValueBottomSheet(long j, long j2, String[] strArr) {
        this(jjd.j(new wia("arg:value", Long.valueOf(j)), new wia("arg:button_id", Long.valueOf(j2)), new wia("arg:descriptions", strArr)));
    }
}
