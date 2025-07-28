package defpackage;

import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import java.util.Map;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: av8  reason: default package */
public final class av8 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessageWriteWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public av8(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.Y = messageWriteWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        av8 av8 = new av8(continuation, this.Y);
        av8.X = obj;
        return av8;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        x2e x2e = (x2e) this.X;
        int i = x2e.Z;
        jue jue = jue.a;
        jue jue2 = null;
        MessageWriteWidget messageWriteWidget = this.Y;
        if (i == 3) {
            k77[] k77Arr = MessageWriteWidget.J0;
            nu8 u0 = messageWriteWidget.u0();
            CharSequence k = x2e.k();
            k77[] k77Arr2 = nu8.Z0;
            u0.B(k, false);
            messageWriteWidget.p0().setText((CharSequence) null);
        } else {
            k77[] k77Arr3 = MessageWriteWidget.J0;
            e3e v0 = messageWriteWidget.v0();
            v0.getClass();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(x2e.k().toString());
            int i2 = s2e.X;
            z2e z2e = new z2e(v0, 0);
            spannableStringBuilder.toString();
            spannableStringBuilder.setSpan(new s2e(v0.c, x2e, z2e), 0, spannableStringBuilder.length(), 17);
            CharSequence b = ((w6a) v0.E0.getValue()).b(spannableStringBuilder, new fp8(x2e.a, (String) null, ep8.a, 0, spannableStringBuilder.length(), (Map) null), false, true);
            nu7 nu7 = messageWriteWidget.v0().o;
            jq8 p0 = messageWriteWidget.p0();
            nu7.getClass();
            int intValue = ((Number) p0.getMessagePosition().getValue()).intValue();
            CharSequence text = p0.getText();
            SpannableString valueOf = text != null ? SpannableString.valueOf(text) : null;
            s2e q = valueOf != null ? nu7.q(valueOf, intValue, x2e) : null;
            hq8 hq8 = p0.c;
            if (!(valueOf == null || q == null)) {
                int spanStart = valueOf.getSpanStart(q);
                int spanEnd = valueOf.getSpanEnd(q);
                Editable text2 = hq8.getText();
                if (text2 != null) {
                    text2.replace(spanStart, spanEnd, b, 0, b.length());
                }
                Editable text3 = hq8.getText();
                if (text3 == null) {
                    p0.setText(" ");
                } else {
                    text3.append(" ");
                }
                jue2 = jue;
            }
            if (jue2 == null) {
                int length = x2e.X.length();
                Editable text4 = hq8.getText();
                if (text4 != null) {
                    int max = Math.max(hq8.getSelectionStart(), 0);
                    text4.replace(Math.max(max - length, 0), max, b, 0, b.length());
                }
                Editable text5 = hq8.getText();
                if (text5 == null) {
                    p0.setText(" ");
                } else {
                    text5.append(" ");
                }
            }
        }
        return jue;
    }
}
