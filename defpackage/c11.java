package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewStub;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: c11  reason: default package */
public final class c11 extends ConstraintLayout {
    public final gm1 K0;
    public b11 L0;

    public c11(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setLayoutParams(new re3(-1, -1));
        setBackgroundColor(-15263716);
        setFocusable(true);
        setClickable(true);
        gm1 gm1 = new gm1(context, (AttributeSet) null);
        gm1.setId(uob.call_user_full_avatar);
        gm1.setMode(cm1.b);
        this.K0 = gm1;
        new ViewStub(context).setId(uob.call_recall);
        new ViewStub(context).setId(uob.call_cancel);
        addView(gm1, -1, 0);
        bf3 p = a06.p(this);
        int id = gm1.getId();
        p.d(id, 7, 0, 7);
        p.d(id, 6, 0, 6);
        p.d(id, 3, 0, 3);
        p.d(id, 4, 0, 4);
        p.a(this);
    }

    public final void setClickListener(b11 b11) {
        this.L0 = b11;
    }

    public final void setName(CharSequence charSequence) {
        this.K0.setName(charSequence);
    }

    public final void setStatus(CharSequence charSequence) {
        this.K0.setStatus(charSequence);
    }
}
