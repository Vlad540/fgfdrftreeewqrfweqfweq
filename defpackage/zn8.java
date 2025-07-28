package defpackage;

import android.text.style.ClickableSpan;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: zn8  reason: default package */
public final class zn8 implements of7 {
    public final /* synthetic */ qn8 a;
    public final /* synthetic */ ao8 b;

    public zn8(qn8 qn8, ao8 ao8) {
        this.a = qn8;
        this.b = ao8;
    }

    public final void a(fp8 fp8) {
        long j = this.b.N0;
        k09 k09 = (k09) this.a;
        k09.getClass();
        k77[] k77Arr = MessagesListWidget.b1;
        MessagesListWidget messagesListWidget = k09.a;
        if (messagesListWidget.t0().A().d()) {
            messagesListWidget.t0().A().e(j);
        } else if (f09.$EnumSwitchMapping$2[fp8.c.ordinal()] == 1) {
            long j2 = fp8.a;
            if (j2 <= 0) {
                messagesListWidget.t0().D(fp8.b);
            } else {
                messagesListWidget.t0().E(j2);
            }
        }
    }

    public final void c(String str, sf7 sf7, ClickableSpan clickableSpan) {
        long j = this.b.N0;
        k09 k09 = (k09) this.a;
        k09.getClass();
        k77[] k77Arr = MessagesListWidget.b1;
        MessagesListWidget messagesListWidget = k09.a;
        if (messagesListWidget.t0().A().d()) {
            messagesListWidget.t0().A().e(j);
            return;
        }
        int ordinal = sf7.ordinal();
        if (ordinal != 0) {
            if (ordinal == 2) {
                nx8 r0 = messagesListWidget.r0();
                r0.getClass();
                taf.o(r0.x0, new jx8(str));
                return;
            } else if (ordinal == 4) {
                messagesListWidget.t0().D(str);
                return;
            } else if (ordinal != 6) {
                return;
            }
        }
        messagesListWidget.t0().C(str);
    }
}
