package one.me.sdk.messagewrite.markdown;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.Selection;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/sdk/messagewrite/markdown/AddLinkBottomSheet;", "Lone/me/sdk/bottomsheet/BaseBottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Linc;", "scopeId", "Laa;", "addLinkState", "(Ljava/lang/String;Laa;Lx54;)V", "message-write-widget_release"}, k = 1, mv = {2, 0, 0})
public final class AddLinkBottomSheet extends BaseBottomSheetWidget {
    public static final /* synthetic */ k77[] A0;
    public final aa w0;
    public final n0c x0;
    public final n0c y0;
    public final t97 z0;

    static {
        Class<AddLinkBottomSheet> cls = AddLinkBottomSheet.class;
        A0 = new k77[]{new hc9(cls, "parentScopeId", "getParentScopeId-IluPPks()Ljava/lang/String;"), m4b.g(m7c.a, cls, "editText", "getEditText()Landroidx/appcompat/widget/AppCompatEditText;", 0), new khb(cls, "button", "getButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0)};
    }

    public AddLinkBottomSheet(String str, aa aaVar, x54 x54) {
        this(jjd.j(new wia[]{new wia(Widget.ARG_SCOPE_ID, new inc(str)), new wia("bottom_sheet:add_link:key", aaVar)}));
    }

    public final t0b m0() {
        return new x9(this, 0);
    }

    public final sy6 n0() {
        return new sy6(0, new up0(3, 3, false), 1);
    }

    public final void onViewCreated(View view) {
        k77[] k77Arr = A0;
        OneMeButton oneMeButton = (OneMeButton) this.y0.T0(this, k77Arr[2]);
        boolean z = true;
        k77 k77 = k77Arr[1];
        n0c n0c = this.x0;
        Editable text = ((AppCompatEditText) n0c.T0(this, k77)).getText();
        if (text == null || text.length() == 0 || p0e.J(((AppCompatEditText) n0c.T0(this, k77Arr[1])).getText(), "https://")) {
            z = false;
        }
        oneMeButton.setEnabled(z);
    }

    public final void v0(FrameLayout frameLayout, LayoutInflater layoutInflater, Bundle bundle) {
        FrameLayout frameLayout2 = frameLayout;
        int X = a24.X(((float) 10) * dh4.c().getDisplayMetrics().density);
        float f = (float) 12;
        float f2 = (float) 8;
        frameLayout2.setPadding(a24.X(dh4.c().getDisplayMetrics().density * f), X, a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f2));
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(linearLayout.getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        float f3 = (float) 16;
        int X2 = a24.X(dh4.c().getDisplayMetrics().density * f3);
        textView.setPaddingRelative(textView.getPaddingStart(), a24.X(dh4.c().getDisplayMetrics().density * f3), textView.getPaddingEnd(), X2);
        textView.setLayoutParams(layoutParams);
        textView.setGravity(17);
        textView.setText(d8.u(getContext(), z9a.o));
        nte.c.b(textView, yq4.b);
        urd.B(new y9(3, (Continuation) null, 0), textView);
        linearLayout.addView(textView);
        AppCompatEditText appCompatEditText = new AppCompatEditText(linearLayout.getContext(), (AttributeSet) null);
        appCompatEditText.setId(y9a.v);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        appCompatEditText.setPaddingRelative(a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(f3 * dh4.c().getDisplayMetrics().density), a24.X(dh4.c().getDisplayMetrics().density * f2));
        int X3 = a24.X(f2 * dh4.c().getDisplayMetrics().density);
        int X4 = a24.X(dh4.c().getDisplayMetrics().density * f);
        int X5 = a24.X(dh4.c().getDisplayMetrics().density * f);
        int i = layoutParams2.topMargin;
        layoutParams2.setMarginStart(X4);
        layoutParams2.topMargin = i;
        layoutParams2.setMarginEnd(X5);
        layoutParams2.bottomMargin = X3;
        appCompatEditText.setLayoutParams(layoutParams2);
        nte.k.b(appCompatEditText, yq4.b);
        appCompatEditText.setClipToOutline(true);
        appCompatEditText.setOutlineProvider(new eu3((float) a24.X(f * dh4.c().getDisplayMetrics().density)));
        appCompatEditText.setInputType(524288);
        String str = this.w0.c;
        if (str == null) {
            str = "https://";
        }
        appCompatEditText.setText(str);
        Editable text = appCompatEditText.getText();
        if (text != null) {
            Selection.setSelection(text, text.length());
        }
        appCompatEditText.requestFocus();
        appCompatEditText.addTextChangedListener(new z2(1, this));
        urd.B(new z9(3, (Continuation) null, 0), appCompatEditText);
        linearLayout.addView(appCompatEditText);
        OneMeButton oneMeButton = new OneMeButton(linearLayout.getContext(), (AttributeSet) null);
        oneMeButton.setId(y9a.u);
        oneMeButton.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        oneMeButton.setSize(v0a.c);
        oneMeButton.setMode(u0a.o);
        oneMeButton.setAppearance(s0a.c);
        oneMeButton.setText(z9a.n);
        a24.a0(oneMeButton, new d5(6, (Object) this));
        linearLayout.addView(oneMeButton);
        frameLayout2.addView(linearLayout, -1, -2);
        sm4 sm4 = new sm4(frameLayout.getContext());
        sm4.setTranslationY((float) me4.c((float) 6, dh4.c().getDisplayMetrics().density, -X));
        frameLayout2.addView(sm4);
    }

    public AddLinkBottomSheet(Bundle bundle) {
        super(bundle);
        jr jrVar = new jr(inc.class, Widget.ARG_SCOPE_ID);
        Parcelable parcelable = bundle.getParcelable("bottom_sheet:add_link:key");
        if (parcelable != null) {
            this.w0 = (aa) parcelable;
            this.x0 = viewBinding(y9a.v);
            this.y0 = viewBinding(y9a.u);
            k77 k77 = A0[0];
            this.z0 = m25getSharedViewModelcp94BC8(((inc) jrVar.a(this)).a, vu7.class, (s16) null);
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
