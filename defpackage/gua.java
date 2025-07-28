package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chats.picker.members.PickerMembersListWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: gua  reason: default package */
public final class gua extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PickerMembersListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gua(PickerMembersListWidget pickerMembersListWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = pickerMembersListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((gua) n((String) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        gua gua = new gua(this.Y, continuation);
        gua.X = obj;
        return gua;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [f6c, gra, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v1, types: [f6c, gra, java.lang.Object] */
    public final Object o(Object obj) {
        wx3.H(obj);
        String str = (String) this.X;
        PickerMembersListWidget pickerMembersListWidget = this.Y;
        if (str == null || h0e.c0(str)) {
            k77[] k77Arr = PickerMembersListWidget.B0;
            f6c adapter = pickerMembersListWidget.o0().getAdapter();
            ? r2 = pickerMembersListWidget.Y;
            if (!hhd.f(adapter, r2)) {
                ibe ibe = pickerMembersListWidget.y0;
                if (ibe != null) {
                    ibe.B(pickerMembersListWidget.o0());
                }
                pickerMembersListWidget.o0().M0(r2, false);
                pickerMembersListWidget.y0 = gp0.l(pickerMembersListWidget.o0());
                if (pickerMembersListWidget.m0()) {
                    EndlessRecyclerView2 o0 = pickerMembersListWidget.o0();
                    xj6 xj6 = pickerMembersListWidget.z0;
                    if (xj6 != null) {
                        o0.p0(xj6);
                    }
                    pickerMembersListWidget.z0 = null;
                    ryd ryd = pickerMembersListWidget.A0;
                    if (ryd != null) {
                        o0.p0(ryd);
                    }
                    pickerMembersListWidget.A0 = null;
                    pickerMembersListWidget.l0(pickerMembersListWidget.o0());
                }
            }
        } else {
            k77[] k77Arr2 = PickerMembersListWidget.B0;
            f6c adapter2 = pickerMembersListWidget.o0().getAdapter();
            ? r22 = pickerMembersListWidget.Z;
            if (!hhd.f(adapter2, r22)) {
                ibe ibe2 = pickerMembersListWidget.y0;
                if (ibe2 != null) {
                    ibe2.B(pickerMembersListWidget.o0());
                }
                pickerMembersListWidget.o0().M0(r22, false);
                pickerMembersListWidget.y0 = gp0.l(pickerMembersListWidget.o0());
                if (pickerMembersListWidget.m0()) {
                    EndlessRecyclerView2 o02 = pickerMembersListWidget.o0();
                    xj6 xj62 = pickerMembersListWidget.z0;
                    if (xj62 != null) {
                        o02.p0(xj62);
                    }
                    pickerMembersListWidget.z0 = null;
                    ryd ryd2 = pickerMembersListWidget.A0;
                    if (ryd2 != null) {
                        o02.p0(ryd2);
                    }
                    pickerMembersListWidget.A0 = null;
                }
            }
        }
        return jue.a;
    }
}
