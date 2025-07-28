package defpackage;

import android.view.View;
import com.google.android.material.internal.CheckableImageButton;

/* renamed from: ix3  reason: default package */
public final class ix3 extends hy4 {
    public final /* synthetic */ int e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ix3(gy4 gy4, int i) {
        super(gy4);
        this.e = i;
    }

    public void r() {
        switch (this.e) {
            case 0:
                gy4 gy4 = this.b;
                gy4.G0 = null;
                CheckableImageButton checkableImageButton = gy4.y0;
                checkableImageButton.setOnLongClickListener((View.OnLongClickListener) null);
                n06.C(checkableImageButton, (View.OnLongClickListener) null);
                return;
            default:
                return;
        }
    }
}
