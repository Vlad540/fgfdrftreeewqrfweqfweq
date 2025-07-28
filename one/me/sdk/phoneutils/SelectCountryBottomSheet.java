package one.me.sdk.phoneutils;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.Metadata;
import one.me.sdk.bottomsheet.BottomSheetWidget;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/sdk/phoneutils/SelectCountryBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "phone-utils_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class SelectCountryBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ int C0 = 0;

    public SelectCountryBottomSheet(Bundle bundle) {
        super(bundle);
    }

    public final View w0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(linearLayout.getContext());
        textView.setId(View.generateViewId());
        textView.setText(rhc.a0);
        nte.c.b(textView, yq4.b);
        textView.setTextColor(km4.y0.r(textView).getText().e);
        textView.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        float f = (float) 12;
        float f2 = (float) 16;
        layoutParams.setMargins(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(f * dh4.c().getDisplayMetrics().density), a24.X(f2 * dh4.c().getDisplayMetrics().density));
        textView.setLayoutParams(layoutParams);
        linearLayout.addView(textView);
        boolean z = getArgs().getBoolean("is_narnia_available");
        v3a v3a = u3a.a;
        lg7 c = hwf.c();
        c.add(u3a.b);
        c.add(u3a.a);
        if (z) {
            c.add((v3a) u3a.c.getValue());
        }
        jg7 listIterator = hwf.a(c).listIterator(0);
        while (true) {
            jg7 jg7 = listIterator;
            if (!jg7.hasNext()) {
                return linearLayout;
            }
            v3a v3a2 = (v3a) jg7.next();
            jv3 jv3 = new jv3(linearLayout.getContext());
            jv3.setCountryInfo(v3a2);
            a24.a0(jv3, new xv5(this, 26, v3a2));
            linearLayout.addView(jv3);
        }
    }
}
