package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chats.picker.chats.PickerChatsTabWidget2;

/* renamed from: jta  reason: default package */
public final class jta extends l5e implements i26 {
    public /* synthetic */ boolean X;
    public final /* synthetic */ PickerChatsTabWidget2 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jta(PickerChatsTabWidget2 pickerChatsTabWidget2, Continuation continuation) {
        super(2, continuation);
        this.Y = pickerChatsTabWidget2;
    }

    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        jue jue = jue.a;
        ((jta) n(bool, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        jta jta = new jta(this.Y, continuation);
        jta.X = ((Boolean) obj).booleanValue();
        return jta;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        boolean z = this.X;
        int i = 0;
        PickerChatsTabWidget2 pickerChatsTabWidget2 = this.Y;
        if (z) {
            k77[] k77Arr = PickerChatsTabWidget2.C0;
            if (pickerChatsTabWidget2.m0().getCurrentItem() != 0) {
                pickerChatsTabWidget2.m0().e(0, false);
            }
        }
        k77[] k77Arr2 = PickerChatsTabWidget2.C0;
        pickerChatsTabWidget2.m0().setUserInputEnabled(!z);
        ire.a(pickerChatsTabWidget2.l0(), pickerChatsTabWidget2.B0);
        hda l0 = pickerChatsTabWidget2.l0();
        if (!(!z)) {
            i = 8;
        }
        l0.setVisibility(i);
        return jue.a;
    }
}
