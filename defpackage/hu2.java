package defpackage;

import one.me.chats.list.ChatsListWidget;
import one.me.contactlist.ContactListWidget;

/* renamed from: hu2  reason: default package */
public final /* synthetic */ class hu2 implements iba {
    public final /* synthetic */ int a;
    public final /* synthetic */ bed b;

    public /* synthetic */ hu2(bed bed, int i) {
        this.a = i;
        this.b = bed;
    }

    public final void J(jba jba) {
        bed bed = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = ChatsListWidget.O0;
                bed.b.invoke(jba);
                return;
            default:
                k77[] k77Arr2 = ContactListWidget.S0;
                bed.b.invoke(jba);
                return;
        }
    }
}
