package defpackage;

import java.util.Set;
import one.me.chats.picker.contacts.PickerContactsListWidget;

/* renamed from: nta  reason: default package */
public final /* synthetic */ class nta implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PickerContactsListWidget b;

    public /* synthetic */ nta(PickerContactsListWidget pickerContactsListWidget, int i) {
        this.a = i;
        this.b = pickerContactsListWidget;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [mr5, ig7] */
    /* JADX WARNING: type inference failed for: r0v3, types: [mr5, ig7] */
    /* JADX WARNING: type inference failed for: r1v1, types: [gra, ig7] */
    /* JADX WARNING: type inference failed for: r0v5, types: [mr5, ig7] */
    public final Object invoke(Object obj) {
        ira G;
        int i = this.a;
        int intValue = ((Integer) obj).intValue();
        switch (i) {
            case 0:
                PickerContactsListWidget pickerContactsListWidget = this.b;
                int j = pickerContactsListWidget.Z.j();
                jgd jgd = pickerContactsListWidget.X;
                int j2 = jgd.j() + j;
                CharSequence charSequence = (CharSequence) pickerContactsListWidget.m0().y0.a.getValue();
                if (!(!(charSequence == null || charSequence.length() == 0)) && intValue >= j && intValue < j2 && (G = jgd.G(intValue - j)) != null) {
                    return G.c;
                }
                return null;
            case 1:
                PickerContactsListWidget pickerContactsListWidget2 = this.b;
                int j3 = pickerContactsListWidget2.Z.j();
                int j4 = pickerContactsListWidget2.X.j() + j3;
                CharSequence charSequence2 = (CharSequence) pickerContactsListWidget2.m0().y0.a.getValue();
                boolean z = false;
                if ((!(charSequence2 == null || charSequence2.length() == 0)) || (intValue >= j3 && intValue < j4)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                PickerContactsListWidget pickerContactsListWidget3 = this.b;
                int j5 = pickerContactsListWidget3.Z.j();
                jgd jgd2 = pickerContactsListWidget3.X;
                int j6 = jgd2.j() + j5;
                CharSequence charSequence3 = (CharSequence) pickerContactsListWidget3.m0().y0.a.getValue();
                boolean z2 = false;
                ira G2 = (charSequence3 == null || charSequence3.length() == 0) ^ true ? pickerContactsListWidget3.Y.G(intValue) : (intValue >= j5 && intValue < j6) ? jgd2.G(intValue - j5) : null;
                if (G2 != null) {
                    z2 = ((Set) pickerContactsListWidget3.m0().Z.a.getValue()).contains(Long.valueOf(G2.a));
                }
                return Boolean.valueOf(z2);
        }
    }
}
