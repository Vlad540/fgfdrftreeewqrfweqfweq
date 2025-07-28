package defpackage;

import android.view.View;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: eb1  reason: default package */
public final /* synthetic */ class eb1 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ eb1(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final boolean onLongClick(View view) {
        Object obj = this.c;
        Object obj2 = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = CallLinkInfoScreen.F0;
                if (!(((za1) obj2).d instanceof xa1)) {
                    return false;
                }
                jb1 m0 = ((CallLinkInfoScreen) obj).m0();
                CharSequence charSequence = ((za1) m0.w0.a.getValue()).c;
                if (charSequence == null) {
                    return true;
                }
                taf.o(m0.x0, new p81(charSequence));
                return true;
            case 1:
                ((u16) obj2).invoke((ph8) obj);
                return true;
            case 2:
                ((i26) obj2).invoke(Long.valueOf(((lk3) obj).a), view);
                return true;
            case 3:
                ktd ktd = ((hr7) obj2).L0;
                if (ktd != null) {
                    ((htd) obj).m(ktd);
                }
                return true;
            case 4:
                ((i26) obj2).invoke(Long.valueOf(((ei8) obj).a), view);
                return true;
            case 5:
                ao8 ao8 = (ao8) obj;
                long j = ao8.N0;
                k77[] k77Arr2 = MessagesListWidget.b1;
                ((qn8) obj2).a.v0(j, ao8.M0);
                return true;
            case 6:
                zta zta = ((ira) obj).w0;
                return ((Boolean) ((i26) obj2).invoke(Long.valueOf(zta.a), zta.b)).booleanValue();
            case 7:
                ktd ktd2 = ((hr7) obj2).L0;
                if (ktd2 != null) {
                    ((htd) obj).m(ktd2);
                }
                return true;
            case 8:
                dtc dtc = ((dud) obj2).N0;
                if (dtc != null) {
                    ((u16) obj).invoke(dtc);
                }
                return true;
            default:
                ktd ktd3 = ((hr7) obj2).L0;
                if (ktd3 != null) {
                    ((htd) obj).m(ktd3);
                }
                return true;
        }
    }
}
