package one.me.calls.ui.bottomsheet.record;

import android.os.Bundle;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.Metadata;
import me.leolin.shortcutbadger.BuildConfig;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/calls/ui/bottomsheet/record/StartRecordBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Linc;", "scopeId", "(Ljava/lang/String;Lx54;)V", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
public final class StartRecordBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ k77[] E0;
    public final t97 C0;
    public final t97 D0;

    static {
        khb khb = new khb(StartRecordBottomSheet.class, "parentScopeId", "getParentScopeId-IluPPks()Ljava/lang/String;", 0);
        m7c.a.getClass();
        E0 = new k77[]{khb};
    }

    public StartRecordBottomSheet(String str, x54 x54) {
        this(jjd.j(new wia("arg_key_scope_id", new inc(str))));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [rr3, one.me.sdk.bottomsheet.BottomSheetWidget, one.me.calls.ui.bottomsheet.record.StartRecordBottomSheet] */
    public final void onDestroyView(View view) {
        StartRecordBottomSheet.super.onDestroyView(view);
        bm3.p(this);
    }

    public final pda p0() {
        return qda.a;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [rr3, one.me.calls.ui.bottomsheet.record.StartRecordBottomSheet] */
    public final void t0() {
        bm3.p(this);
    }

    public final View w0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(linearLayout.getContext());
        textView.setId(o1a.m1);
        nge.d(nte.c, textView);
        qda qda = qda.a;
        textView.setTextColor(-855638017);
        textView.setGravity(17);
        float f = (float) 24;
        textView.setPadding(0, a24.X(dh4.c().getDisplayMetrics().density * f), 0, a24.X(((float) 20) * dh4.c().getDisplayMetrics().density));
        textView.setText(r1a.z1);
        EditText editText = new EditText(linearLayout.getContext());
        editText.setId(o1a.j1);
        nge.d(nte.k, editText);
        editText.setHintTextColor(1895825407);
        editText.setTextColor(-855638017);
        float f2 = (float) 16;
        int X = a24.X(dh4.c().getDisplayMetrics().density * f2);
        editText.setPadding(X, X, X, X);
        editText.setMaxLines(1);
        editText.setSingleLine(true);
        editText.setInputType(524288);
        y11 y11 = ((u81) ((mqd) this.D0.getValue()).b.G0.a.getValue()).f;
        editText.setHint(y11 != null ? y11.b : null);
        editText.setClipToOutline(true);
        editText.setFilters((InputFilter[]) new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(250)});
        editText.setOutlineProvider(new eu3((float) a24.X(dh4.c().getDisplayMetrics().density * f2)));
        editText.setBackgroundColor(qda.c.a.h);
        kh3 kh3 = new kh3(linearLayout.getContext(), (AttributeSet) null);
        kh3.setId(o1a.k1);
        kh3.setPadding(0, a24.X(f2 * dh4.c().getDisplayMetrics().density), 0, a24.X(f * dh4.c().getDisplayMetrics().density));
        kh3.setName(r1a.v1);
        kh3.setMessage(kh3.getContext().getString(r1a.u1));
        kh3.setCustomTheme(qda);
        kh3.O(0, BuildConfig.FLAVOR, fye.c(phc.T1).toString());
        OneMeButton oneMeButton = new OneMeButton(linearLayout.getContext(), (AttributeSet) null);
        oneMeButton.setId(o1a.l1);
        oneMeButton.setMode(u0a.a);
        oneMeButton.setSize(v0a.c);
        oneMeButton.setAppearance(s0a.o);
        oneMeButton.setCustomTheme(qda);
        oneMeButton.setText(r1a.y1);
        a24.Z(oneMeButton, 300, new p7d(this, 5, editText));
        linearLayout.addView(textView, -1, -2);
        linearLayout.addView(editText, -1, -2);
        linearLayout.addView(kh3, -1, -2);
        linearLayout.addView(oneMeButton, -1, -2);
        return linearLayout;
    }

    public StartRecordBottomSheet(Bundle bundle) {
        super(bundle);
        jr jrVar = new jr(inc.class, new inc("default"), "arg_key_scope_id");
        k77 k77 = E0[0];
        this.C0 = getSharedViewModel-cp94BC8(((inc) jrVar.a(this)).a, aj1.class, (s16) null);
        this.D0 = createViewModelLazy(mqd.class, new ypd(2, new u5b(25, this)));
    }
}
