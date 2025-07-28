package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chats.picker.PickerChatsTabWidget;

/* renamed from: fta  reason: default package */
public final class fta extends l5e implements i26 {
    public /* synthetic */ boolean X;
    public final /* synthetic */ PickerChatsTabWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fta(PickerChatsTabWidget pickerChatsTabWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = pickerChatsTabWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        jue jue = jue.a;
        ((fta) n(bool, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        fta fta = new fta(this.Y, continuation);
        fta.X = ((Boolean) obj).booleanValue();
        return fta;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        boolean z = this.X;
        k77[] k77Arr = PickerChatsTabWidget.z0;
        PickerChatsTabWidget pickerChatsTabWidget = this.Y;
        pickerChatsTabWidget.m0().setUserInputEnabled(!z);
        ire.a(pickerChatsTabWidget.l0(), pickerChatsTabWidget.y0);
        pickerChatsTabWidget.l0().setVisibility(z ^ true ? 0 : 8);
        return jue.a;
    }
}
