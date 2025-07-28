package defpackage;

import one.me.complaintbottomsheet.ComplaintBottomSheet;

/* renamed from: k63  reason: default package */
public final /* synthetic */ class k63 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ComplaintBottomSheet b;

    public /* synthetic */ k63(ComplaintBottomSheet complaintBottomSheet, int i) {
        this.a = i;
        this.b = complaintBottomSheet;
    }

    public final Object invoke() {
        ComplaintBottomSheet complaintBottomSheet = this.b;
        switch (this.a) {
            case 0:
                k77 k77 = ComplaintBottomSheet.X[0];
                return new u63(((Number) complaintBottomSheet.a.a(complaintBottomSheet)).longValue());
            default:
                k77[] k77Arr = ComplaintBottomSheet.X;
                hba hba = new hba(complaintBottomSheet);
                hba.f(new vba(phc.A));
                hba.h(new hge(d4a.b));
                return hba;
        }
    }
}
