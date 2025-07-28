package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.contacts.PickerContactsListWidget;

/* renamed from: sta  reason: default package */
public final class sta extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PickerContactsListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sta(PickerContactsListWidget pickerContactsListWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = pickerContactsListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((sta) n((String) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        sta sta = new sta(this.Y, continuation);
        sta.X = obj;
        return sta;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [f6c, gra, java.lang.Object] */
    public final Object o(Object obj) {
        wx3.H(obj);
        boolean c0 = h0e.c0((String) this.X);
        PickerContactsListWidget pickerContactsListWidget = this.Y;
        if (c0) {
            k77[] k77Arr = PickerContactsListWidget.C0;
            f6c adapter = pickerContactsListWidget.n0().getAdapter();
            t93 t93 = pickerContactsListWidget.w0;
            if (!hhd.f(adapter, t93)) {
                ibe ibe = pickerContactsListWidget.z0;
                if (ibe != null) {
                    ibe.B(pickerContactsListWidget.n0());
                }
                pickerContactsListWidget.n0().setAdapter(t93);
                pickerContactsListWidget.z0 = gp0.l(pickerContactsListWidget.n0());
                RecyclerView n0 = pickerContactsListWidget.n0();
                xj6 xj6 = pickerContactsListWidget.A0;
                if (xj6 != null) {
                    n0.p0(xj6);
                }
                pickerContactsListWidget.A0 = null;
                ryd ryd = pickerContactsListWidget.B0;
                if (ryd != null) {
                    n0.p0(ryd);
                }
                pickerContactsListWidget.B0 = null;
                pickerContactsListWidget.l0(pickerContactsListWidget.n0());
            }
        } else {
            k77[] k77Arr2 = PickerContactsListWidget.C0;
            f6c adapter2 = pickerContactsListWidget.n0().getAdapter();
            ? r1 = pickerContactsListWidget.Y;
            if (!hhd.f(adapter2, r1)) {
                ibe ibe2 = pickerContactsListWidget.z0;
                if (ibe2 != null) {
                    ibe2.B(pickerContactsListWidget.n0());
                }
                pickerContactsListWidget.n0().setAdapter(r1);
                pickerContactsListWidget.z0 = gp0.l(pickerContactsListWidget.n0());
                RecyclerView n02 = pickerContactsListWidget.n0();
                xj6 xj62 = pickerContactsListWidget.A0;
                if (xj62 != null) {
                    n02.p0(xj62);
                }
                pickerContactsListWidget.A0 = null;
                ryd ryd2 = pickerContactsListWidget.B0;
                if (ryd2 != null) {
                    n02.p0(ryd2);
                }
                pickerContactsListWidget.B0 = null;
            }
        }
        return jue.a;
    }
}
