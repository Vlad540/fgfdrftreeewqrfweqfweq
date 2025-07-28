package defpackage;

import android.net.Uri;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: ewc  reason: default package */
public final class ewc extends chd {
    public static final /* synthetic */ int N0 = 0;
    public final sic J0;
    public final OneMeDraweeView K0;
    public final AppCompatTextView L0;
    public p46 M0;

    public ewc(sic sic, OneMeDraweeView oneMeDraweeView, AppCompatTextView appCompatTextView, LinearLayout linearLayout) {
        super(linearLayout);
        this.J0 = sic;
        this.K0 = oneMeDraweeView;
        this.L0 = appCompatTextView;
        a24.a0(linearLayout, new wfc(1, this));
    }

    /* renamed from: F */
    public final void A(p46 p46) {
        String str;
        this.M0 = p46;
        d46 c = p46.a.a.c();
        boolean z = c instanceof d46;
        AppCompatTextView appCompatTextView = this.L0;
        if (z) {
            str = appCompatTextView.getContext().getString(c.a);
        } else if (c instanceof e46) {
            str = ((e46) c).a;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        appCompatTextView.setText(str);
        urd.B(new f5c(p46, this, (Continuation) null), appCompatTextView);
        OneMeDraweeView oneMeDraweeView = this.K0;
        Uri uri = p46.b;
        if (uri != null) {
            ur6 d = ur6.d(uri);
            d.i = true;
            tr6 a = d.a();
            int i = OneMeDraweeView.F0;
            oneMeDraweeView.o(a, (tr6) null);
            return;
        }
        int i2 = OneMeDraweeView.F0;
        oneMeDraweeView.o((tr6) null, (tr6) null);
    }
}
