package defpackage;

import android.util.AttributeSet;
import android.widget.EditText;
import one.me.chats.picker.AbstractPickerScreen;

/* renamed from: y2  reason: default package */
public final /* synthetic */ class y2 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AbstractPickerScreen b;

    public /* synthetic */ y2(AbstractPickerScreen abstractPickerScreen, int i) {
        this.a = i;
        this.b = abstractPickerScreen;
    }

    public final Object invoke() {
        mge mge;
        AbstractPickerScreen abstractPickerScreen = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = AbstractPickerScreen.w0;
                return abstractPickerScreen.o0(abstractPickerScreen.getContext());
            default:
                k77[] k77Arr2 = AbstractPickerScreen.w0;
                CharSequence charSequence = null;
                x2a x2a = new x2a(abstractPickerScreen.getContext(), (AttributeSet) null);
                EditText editText = x2a.getEditText();
                zqd r0 = abstractPickerScreen.r0();
                if (!(r0 == null || (mge = (mge) ((grd) r0).getValue()) == null)) {
                    charSequence = mge.a(x2a.getContext());
                }
                editText.setHint(charSequence);
                x2a.setCallback(new otf(abstractPickerScreen, x2a));
                x2a.getEditText().addTextChangedListener(new z2(0, abstractPickerScreen));
                return x2a;
        }
    }
}
