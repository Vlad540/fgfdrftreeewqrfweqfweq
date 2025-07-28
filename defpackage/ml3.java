package defpackage;

import android.view.View;
import one.me.contactlist.ContactListWidget;
import one.me.sdk.arch.Widget;

/* renamed from: ml3  reason: default package */
public final /* synthetic */ class ml3 implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ContactListWidget b;

    public /* synthetic */ ml3(ContactListWidget contactListWidget, int i) {
        this.a = i;
        this.b = contactListWidget;
    }

    /* JADX WARNING: type inference failed for: r8v2, types: [mr5, ig7] */
    /* JADX WARNING: type inference failed for: r6v0, types: [mr5, ig7] */
    public final Object invoke(Object obj) {
        jue jue = jue.a;
        Widget widget = this.b;
        switch (this.a) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                int j = widget.x0.j();
                cpf cpf = widget.X;
                int j2 = cpf.j() + j;
                cpf cpf2 = widget.Z;
                int j3 = cpf2.j() + j2;
                int j4 = widget.w0.j();
                CharSequence m0 = widget.m0();
                if ((true ^ (m0 == null || m0.length() == 0)) || intValue < j || intValue < j4) {
                    return null;
                }
                if (intValue < j2) {
                    return ((pg7) cpf.C(intValue - j)).b;
                }
                if (intValue < j3) {
                    return ((pg7) cpf2.C(intValue - j2)).b;
                }
                return null;
            case 1:
                k77[] k77Arr = ContactListWidget.S0;
                pfa.a(1).j((View) obj).e(widget.H0).b().build().q(widget);
                return jue;
            default:
                View view = (View) obj;
                k77[] k77Arr2 = ContactListWidget.S0;
                widget.getRouter().B(widget);
                return jue;
        }
    }
}
