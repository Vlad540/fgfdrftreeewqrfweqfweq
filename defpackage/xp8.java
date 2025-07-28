package defpackage;

import android.view.View;

/* renamed from: xp8  reason: default package */
public final /* synthetic */ class xp8 implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ u16 b;

    public /* synthetic */ xp8(int i, u16 u16) {
        this.a = i;
        this.b = u16;
    }

    public final void onFocusChange(View view, boolean z) {
        switch (this.a) {
            case 0:
                this.b.invoke(Boolean.valueOf(z));
                return;
            default:
                this.b.invoke(Boolean.valueOf(z));
                return;
        }
    }
}
