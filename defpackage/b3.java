package defpackage;

import android.widget.EditText;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.AbstractPickerScreen;

/* renamed from: b3  reason: default package */
public final class b3 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ AbstractPickerScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b3(Continuation continuation, AbstractPickerScreen abstractPickerScreen) {
        super(2, continuation);
        this.Y = abstractPickerScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((b3) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        b3 b3Var = new b3(continuation, this.Y);
        b3Var.X = obj;
        return b3Var;
    }

    public final Object o(Object obj) {
        EditText editText;
        wx3.H(obj);
        if (hhd.f((yra) this.X, yra.a)) {
            x2a q0 = this.Y.q0();
            if (!(q0 == null || (editText = q0.getEditText()) == null)) {
                editText.setText((CharSequence) null);
            }
            return jue.a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
