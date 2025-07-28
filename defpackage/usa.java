package defpackage;

import one.me.chats.picker.chats.PickerChatsListWidget2;

/* renamed from: usa  reason: default package */
public final /* synthetic */ class usa extends x26 implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PickerChatsListWidget2 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public usa(PickerChatsListWidget2 pickerChatsListWidget2, int i) {
        super(1, e07.class, "isChatItem", "checkBoxItemDecoration_delegate$lambda$10$isChatItem(Lone/me/chats/picker/chats/PickerChatsListWidget2;I)Z", 0);
        this.a = i;
        switch (i) {
            case 1:
                this.b = pickerChatsListWidget2;
                super(1, e07.class, "isChatItem", "checkBoxItemDecoration_delegate$lambda$10$isChatItem(Lone/me/chats/picker/chats/PickerChatsListWidget2;I)Z", 0);
                return;
            default:
                this.b = pickerChatsListWidget2;
                return;
        }
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(PickerChatsListWidget2.l0(this.b, ((Number) obj).intValue()));
            default:
                return Boolean.valueOf(PickerChatsListWidget2.l0(this.b, ((Number) obj).intValue()));
        }
    }
}
