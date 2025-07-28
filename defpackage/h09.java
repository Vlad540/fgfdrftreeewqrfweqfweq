package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: h09  reason: default package */
public final class h09 implements iw8 {
    public final /* synthetic */ MessagesListWidget a;
    public final /* synthetic */ AtomicInteger b;
    public final /* synthetic */ int c;
    public final /* synthetic */ jpc d;
    public final /* synthetic */ l7c e;

    public h09(MessagesListWidget messagesListWidget, AtomicInteger atomicInteger, int i, jpc jpc, l7c l7c) {
        this.a = messagesListWidget;
        this.b = atomicInteger;
        this.c = i;
        this.d = jpc;
        this.e = l7c;
    }

    public final void b() {
        k77[] k77Arr = MessagesListWidget.b1;
        MessagesListWidget messagesListWidget = this.a;
        if (messagesListWidget.n0().w() != 0) {
            int i = this.c;
            if (this.b.compareAndSet(i, i + 1)) {
                MessagesListWidget.l0(messagesListWidget, this.d);
                a73 a73 = (z63) this.e.a;
                if (a73 != null) {
                    a73.makeCompleting$kotlinx_coroutines_core(jue.a);
                }
            }
            messagesListWidget.n0().I.f(this);
        }
    }

    public final String getTag() {
        return "ScrollButton";
    }
}
