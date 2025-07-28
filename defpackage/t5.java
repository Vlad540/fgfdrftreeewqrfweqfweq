package defpackage;

import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import one.me.chats.picker.ActChatPickerCompat;

/* renamed from: t5  reason: default package */
public final class t5 extends CoordinatorLayout implements mhe {
    public final /* synthetic */ ActChatPickerCompat P0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t5(ActChatPickerCompat actChatPickerCompat) {
        super(actChatPickerCompat, (AttributeSet) null);
        this.P0 = actChatPickerCompat;
        setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
    }

    public final void onThemeChanged(pda pda) {
        setBackgroundColor(pda.b().i);
        km4.d(km4.y0.n(this.P0), this);
    }
}
