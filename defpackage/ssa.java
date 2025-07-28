package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chats.picker.PickerChatsListWidget;

/* renamed from: ssa  reason: default package */
public final class ssa extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PickerChatsListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ssa(PickerChatsListWidget pickerChatsListWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = pickerChatsListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((ssa) n((tra) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ssa ssa = new ssa(this.Y, continuation);
        ssa.X = obj;
        return ssa;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [f6c, gra] */
    /* JADX WARNING: type inference failed for: r2v0, types: [f6c, gra] */
    public final Object o(Object obj) {
        wx3.H(obj);
        PickerChatsListWidget pickerChatsListWidget = this.Y;
        f6c f6c = (f6c) o23.V(pickerChatsListWidget.x0.D());
        String str = ((tra) this.X).a;
        ? r1 = pickerChatsListWidget.y0;
        ? r2 = pickerChatsListWidget.z0;
        t93 t93 = pickerChatsListWidget.x0;
        if (str == null || h0e.c0(str)) {
            if (f6c != r1) {
                ibe ibe = pickerChatsListWidget.o;
                if (ibe != null) {
                    ibe.B(pickerChatsListWidget.n0());
                }
                t93.F(r2);
                t93.C(r1);
                pickerChatsListWidget.o = gp0.l(pickerChatsListWidget.n0());
            }
        } else if (f6c != r2) {
            ibe ibe2 = pickerChatsListWidget.o;
            if (ibe2 != null) {
                ibe2.B(pickerChatsListWidget.n0());
            }
            t93.F(r1);
            t93.C(r2);
            pickerChatsListWidget.o = gp0.l(pickerChatsListWidget.n0());
        }
        return jue.a;
    }
}
