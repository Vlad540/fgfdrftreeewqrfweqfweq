package defpackage;

import kotlin.coroutines.Continuation;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.pinbars.PinBarsWidget;
import ru.ok.tamtam.nano.Protos;

/* renamed from: w09  reason: default package */
public final class w09 implements pj5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pj5 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w09(pj5 pj5, Object obj, int i) {
        this.a = i;
        this.b = pj5;
        this.c = obj;
    }

    public final Object c(rj5 rj5, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object c2 = this.b.c(new ac(rj5, 29, (MessagesListWidget) this.c), continuation);
                return c2 == pu3.a ? c2 : jue.a;
            case 1:
                Object c3 = this.b.c(new of9(rj5, 0, (lqc) this.c), continuation);
                return c3 == pu3.a ? c3 : jue.a;
            case 2:
                Object c4 = this.b.c(new of9(rj5, 1, (xra) this.c), continuation);
                return c4 == pu3.a ? c4 : jue.a;
            case 3:
                Object c5 = this.b.c(new of9(rj5, 2, (lsa) this.c), continuation);
                return c5 == pu3.a ? c5 : jue.a;
            case 4:
                Object c6 = this.b.c(new of9(rj5, 3, (wta) this.c), continuation);
                return c6 == pu3.a ? c6 : jue.a;
            case 5:
                Object c7 = this.b.c(new of9(rj5, 4, (kua) this.c), continuation);
                return c7 == pu3.a ? c7 : jue.a;
            case 6:
                Object c8 = this.b.c(new of9(rj5, 5, (PinBarsWidget) this.c), continuation);
                return c8 == pu3.a ? c8 : jue.a;
            case 7:
                Object c9 = this.b.c(new of9(rj5, 6, (q7b) this.c), continuation);
                return c9 == pu3.a ? c9 : jue.a;
            case 8:
                Object c10 = this.b.c(new of9(rj5, 8, (wed) this.c), continuation);
                return c10 == pu3.a ? c10 : jue.a;
            case 9:
                Object c11 = this.b.c(new of9(rj5, 9, (fkd) this.c), continuation);
                return c11 == pu3.a ? c11 : jue.a;
            case 10:
                Object c12 = this.b.c(new of9(rj5, 11, (lwd) this.c), continuation);
                return c12 == pu3.a ? c12 : jue.a;
            case 11:
                Object c13 = this.b.c(new of9(rj5, 12, (kyd) this.c), continuation);
                return c13 == pu3.a ? c13 : jue.a;
            case Protos.Attaches.Attach.PRESENT:
                Object c14 = this.b.c(new of9(rj5, 13, (wve) this.c), continuation);
                return c14 == pu3.a ? c14 : jue.a;
            default:
                Object c15 = this.b.c(new of9(rj5, 14, (yge) this.c), continuation);
                return c15 == pu3.a ? c15 : jue.a;
        }
    }
}
