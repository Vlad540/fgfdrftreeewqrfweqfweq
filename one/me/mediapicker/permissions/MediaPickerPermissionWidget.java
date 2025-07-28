package one.me.mediapicker.permissions;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/mediapicker/permissions/MediaPickerPermissionWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Linc;", "scopeId", "(Ljava/lang/String;Lx54;)V", "media-picker_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class MediaPickerPermissionWidget extends Widget {
    public static final /* synthetic */ k77[] o;
    public final jr a;
    public final t97 b;
    public final t97 c;

    static {
        k77 khb = new khb(MediaPickerPermissionWidget.class, "scopeId", "getScopeId-IluPPks()Ljava/lang/String;", 0);
        m7c.a.getClass();
        o = new k77[]{khb};
    }

    public MediaPickerPermissionWidget(String str, x54 x54) {
        this(jjd.j(new wia[]{new wia(Widget.ARG_SCOPE_ID, new inc(str))}));
    }

    /* renamed from: getScopeId-IluPPks  reason: not valid java name */
    public final String m9getScopeIdIluPPks() {
        k77 k77 = o[0];
        return ((inc) this.a.a(this)).a;
    }

    public final void onActivityResumed(Activity activity) {
        n98 n98 = (n98) this.b.getValue();
        n98.x0.e();
        n98.y0.e();
        super.onActivityResumed(activity);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        float f = (float) 20;
        float f2 = (float) 0;
        layoutParams.setMargins(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(f * dh4.c().getDisplayMetrics().density), a24.X(f2 * dh4.c().getDisplayMetrics().density));
        linearLayout.setLayoutParams(layoutParams);
        TextView textView = new TextView(linearLayout.getContext());
        textView.setText(r6a.j);
        nte.n.b(textView, yq4.b);
        textView.setGravity(17);
        TextView textView2 = new TextView(linearLayout.getContext());
        textView2.setText(r6a.i);
        nte.r.b(textView2, yq4.b);
        textView2.setPadding(textView2.getPaddingLeft(), a24.X(((float) 4) * dh4.c().getDisplayMetrics().density), textView2.getPaddingRight(), a24.X(((float) 16) * dh4.c().getDisplayMetrics().density));
        textView2.setGravity(17);
        OneMeButton oneMeButton = new OneMeButton(linearLayout.getContext(), (AttributeSet) null);
        oneMeButton.setText(r6a.d);
        oneMeButton.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        a24.a0(oneMeButton, new eu5(12, this));
        urd.B(new fu5(textView, textView2, (Continuation) null, 1), linearLayout);
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        linearLayout.addView(oneMeButton);
        return linearLayout;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        t97 t97 = this.c;
        int i2 = 0;
        if (i == 157) {
            int length = iArr.length;
            while (i2 < length) {
                if (iArr[i2] == -1) {
                    i2++;
                } else {
                    return;
                }
            }
            jrf jrf = new jrf(this, 1);
            int i3 = r6a.h;
            int i4 = r6a.g;
            ((qna) t97.getValue()).getClass();
            qna.j(jrf, strArr, iArr, i3, i4);
        } else if (i == 162) {
            int length2 = iArr.length;
            while (i2 < length2) {
                if (iArr[i2] == -1) {
                    i2++;
                } else {
                    return;
                }
            }
            boolean unused = ((qna) t97.getValue()).getClass();
        }
    }

    public MediaPickerPermissionWidget(Bundle bundle) {
        super(bundle, 0, 2, (x54) null);
        this.a = new jr(inc.class, new inc("default"), Widget.ARG_SCOPE_ID);
        this.b = m25getSharedViewModelcp94BC8(m9getScopeIdIluPPks(), n98.class, (s16) null);
        this.c = rna.a.b();
    }
}
