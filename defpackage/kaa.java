package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;

/* renamed from: kaa  reason: default package */
public final /* synthetic */ class kaa implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ raa b;

    public /* synthetic */ kaa(raa raa, int i) {
        this.a = i;
        this.b = raa;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.d();
                return;
            case 1:
                raa raa = this.b;
                raa.b();
                oaa oaa = raa.y0;
                if (oaa != null) {
                    oaa.p();
                    return;
                }
                return;
            case 2:
                this.b.d();
                return;
            default:
                ((AppCompatEditText) this.b.G0.getValue()).setText((CharSequence) null);
                return;
        }
    }
}
