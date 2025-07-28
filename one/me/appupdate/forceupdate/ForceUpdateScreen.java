package one.me.appupdate.forceupdate;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/appupdate/forceupdate/ForceUpdateScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "app-update_release"}, k = 1, mv = {2, 0, 0})
public final class ForceUpdateScreen extends Widget {
    public static final /* synthetic */ int o = 0;
    public final sy6 a = new sy6(0, new up0(3, 1, false), 1);
    public final vp b;
    public final wz9 c;

    public ForceUpdateScreen() {
        super((Bundle) null, 0, 3, (x54) null);
        qp qpVar = qp.a;
        this.b = (vp) qpVar.getAccessor().c(vp.class);
        this.c = (wz9) qpVar.getAccessor().c(wz9.class);
    }

    public final sy6 getInsetsConfig() {
        return this.a;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ImageView imageView = new ImageView(getContext());
        imageView.setId(hy9.a);
        imageView.setOutlineProvider(new eu3(dh4.c().getDisplayMetrics().density * 32.0f));
        imageView.setBackground(am7.n((Context) this.c.a.c(Context.class), csb.ic_launcher_background));
        me4.o((float) 17, dh4.c().getDisplayMetrics().density, imageView);
        imageView.setImageResource(phc.d);
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setId(hy9.e);
        imageView2.setClipToOutline(true);
        imageView2.setOutlineProvider(new i32(imageView2, 4));
        imageView2.setBackground(x87.a(imageView2.getContext(), 1301046487, 78.0f, true));
        float f = (float) 12;
        me4.o(f, dh4.c().getDisplayMetrics().density, imageView2);
        imageView2.setImageResource(phc.g);
        TextView textView = new TextView(getContext());
        textView.setId(hy9.c);
        textView.setGravity(1);
        nge.d(nte.h, textView);
        s59 s59 = km4.y0;
        textView.setTextColor(s59.r(textView).getText().e);
        textView.setText(iy9.b);
        TextView textView2 = new TextView(getContext());
        textView2.setId(hy9.b);
        textView2.setGravity(1);
        nge.d(nte.E, textView2);
        textView2.setTextColor(s59.r(textView2).getText().e);
        textView2.setText(iy9.a);
        OneMeButton oneMeButton = new OneMeButton(getContext(), (AttributeSet) null);
        oneMeButton.setId(hy9.d);
        oneMeButton.setAppearance(s0a.c);
        oneMeButton.setSize(v0a.c);
        oneMeButton.setMode(u0a.a);
        oneMeButton.setText(iy9.c);
        a24.Z(oneMeButton, 300, new eu5(0, this));
        ConstraintLayout constraintLayout = new ConstraintLayout(getContext());
        constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        urd.B(new fu5(textView, textView2, (Continuation) null, 0), constraintLayout);
        float f2 = (float) 120;
        constraintLayout.addView(imageView, a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(f2 * dh4.c().getDisplayMetrics().density));
        float f3 = (float) 60;
        re3 re3 = new re3(a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(f3 * dh4.c().getDisplayMetrics().density));
        float f4 = (float) 84;
        re3.setMarginStart(a24.X(dh4.c().getDisplayMetrics().density * f4));
        re3.topMargin = a24.X(f4 * dh4.c().getDisplayMetrics().density);
        constraintLayout.addView(imageView2, re3);
        re3 re32 = new re3(-1, -2);
        re32.setMarginStart(a24.X(dh4.c().getDisplayMetrics().density * f));
        re32.setMarginEnd(a24.X(dh4.c().getDisplayMetrics().density * f));
        re32.bottomMargin = a24.X(((float) 20) * dh4.c().getDisplayMetrics().density);
        re32.topMargin = a24.X(((float) 50) * dh4.c().getDisplayMetrics().density);
        constraintLayout.addView(textView, re32);
        re3 re33 = new re3(-1, -2);
        re33.setMarginStart(a24.X(dh4.c().getDisplayMetrics().density * f));
        re33.setMarginEnd(a24.X(dh4.c().getDisplayMetrics().density * f));
        constraintLayout.addView(textView2, re33);
        re3 re34 = new re3(-1, -2);
        re34.setMarginStart(a24.X(dh4.c().getDisplayMetrics().density * f));
        re34.setMarginEnd(a24.X(f * dh4.c().getDisplayMetrics().density));
        re34.bottomMargin = a24.X(((float) 24) * dh4.c().getDisplayMetrics().density);
        constraintLayout.addView(oneMeButton, re34);
        bf3 p = a06.p(constraintLayout);
        int id = imageView.getId();
        p.d(id, 3, 0, 3);
        p.d(id, 6, 0, 6);
        p.d(id, 7, 0, 7);
        p.d(id, 4, textView.getId(), 3);
        p.g(id).d.W = 2;
        int id2 = imageView2.getId();
        p.d(id2, 3, imageView.getId(), 3);
        p.d(id2, 4, imageView.getId(), 4);
        p.d(id2, 6, imageView.getId(), 6);
        p.d(id2, 7, imageView.getId(), 7);
        int id3 = textView.getId();
        p.d(id3, 3, imageView.getId(), 4);
        p.d(id3, 6, 0, 6);
        p.d(id3, 7, 0, 7);
        p.d(id3, 4, textView2.getId(), 3);
        int id4 = textView2.getId();
        p.d(id4, 3, textView.getId(), 4);
        p.d(id4, 6, 0, 6);
        p.d(id4, 7, 0, 7);
        p.d(id4, 4, oneMeButton.getId(), 3);
        int id5 = oneMeButton.getId();
        p.d(id5, 4, 0, 4);
        p.d(id5, 6, 0, 6);
        p.d(id5, 7, 0, 7);
        p.a(constraintLayout);
        return constraintLayout;
    }
}
