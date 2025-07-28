package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.chats.PickerChatsTabWidget2;

/* renamed from: hta  reason: default package */
public final class hta extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PickerChatsTabWidget2 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hta(PickerChatsTabWidget2 pickerChatsTabWidget2, Continuation continuation) {
        super(2, continuation);
        this.Y = pickerChatsTabWidget2;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((hta) n((List) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        hta hta = new hta(this.Y, continuation);
        hta.X = obj;
        return hta;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        List list = (List) this.X;
        PickerChatsTabWidget2 pickerChatsTabWidget2 = this.Y;
        pickerChatsTabWidget2.y0.i(list);
        pickerChatsTabWidget2.A0.M(list);
        return jue.a;
    }
}
