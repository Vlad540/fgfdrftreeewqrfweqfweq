package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.PickerChatsTabWidget;

/* renamed from: dta  reason: default package */
public final class dta extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PickerChatsTabWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dta(PickerChatsTabWidget pickerChatsTabWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = pickerChatsTabWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((dta) n((List) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        dta dta = new dta(this.Y, continuation);
        dta.X = obj;
        return dta;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        List list = (List) this.X;
        PickerChatsTabWidget pickerChatsTabWidget = this.Y;
        pickerChatsTabWidget.Z.i(list);
        pickerChatsTabWidget.x0.M(list);
        return jue.a;
    }
}
