package defpackage;

import one.me.chats.picker.chats.PickerChatsListWidget2;

/* renamed from: vsa  reason: default package */
public final class vsa implements fra {
    public final /* synthetic */ PickerChatsListWidget2 a;

    public vsa(PickerChatsListWidget2 pickerChatsListWidget2) {
        this.a = pickerChatsListWidget2;
    }

    public final boolean r(long j, yta yta) {
        k77[] k77Arr = PickerChatsListWidget2.G0;
        PickerChatsListWidget2 pickerChatsListWidget2 = this.a;
        pickerChatsListWidget2.getClass();
        k77 k77 = PickerChatsListWidget2.G0[2];
        if (((Boolean) pickerChatsListWidget2.X.a(pickerChatsListWidget2)).booleanValue()) {
            return false;
        }
        u16 u16 = pickerChatsListWidget2.Y;
        if (u16 != null) {
            u16.invoke(Boolean.TRUE);
        }
        pickerChatsListWidget2.n0().q(j, yta);
        return true;
    }

    public final void z(long j, yta yta) {
        k77[] k77Arr = PickerChatsListWidget2.G0;
        this.a.n0().q(j, yta);
    }
}
